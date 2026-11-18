"""Unit tests for `new_resources.fix`.

Pure text operations, so these need no network, no `upstream` checkout and no
`gh`/`git` -- unlike `test_new_resources.py`'s golden tests, which cover the
`git`/`gh` half of `--fix` (resolving a release to its products) by exercising
the same `resolve_ref`/`changelog`/`features`/`magic_modules_pr`/`products`
functions this module's caller feeds into `candidates_from_results`.
"""

import subprocess
import textwrap
import unittest
from unittest import mock

from new_resources import fix

# A deliberately small stand-in for provider/resources.go: a `const` block
# with one entry a map key references by identifier (to exercise resolving
# that back to its string value), a comment-preceded, bare-literal-valued map
# entry (insertion next to a comment), and a stray entry planted out of its
# sorted position (like the real file's long-standing "integrations", which
# sits next to "bigquery" rather than where it alphabetically belongs).
FIXTURE = textwrap.dedent(
    """\
    package gcp

    const (
    \tgcpPackage = "gcp"
    \tgcpDeploymentManager = "DeploymentManager" // DeploymentManager resources
    )

    var moduleMapping = map[string]string{
    \t"api_gateway": "ApiGateway",
    \t"zz_stray": "ZzStray",
    // Intentionally the same as "dataflow".
    \t"data_pipeline": "DataFlow",
    \t"deployment_manager": gcpDeploymentManager,
    \t"dialogflow": "Diagflow",
    }

    var namespaceMap = map[string]string{
    \t"gcp": "Gcp",
    }
    """
)


def row(resource, products):
    return {"resource": resource, "products": products}


def product(key, name):
    return {"snake_case": key, "name": name}


class CandidatesFromResultsTest(unittest.TestCase):
    def test_single_clean_product(self):
        results = [row("google_design_center_application", [product("design_center", "DesignCenter")])]
        candidates, notes = fix.candidates_from_results(results)
        self.assertEqual({"design_center": "DesignCenter"}, candidates)
        self.assertEqual([], notes)

    def test_multiple_resources_agreeing_on_one_product(self):
        results = [
            row("google_design_center_application", [product("design_center", "DesignCenter")]),
            row("google_design_center_space", [product("design_center", "DesignCenter")]),
        ]
        candidates, notes = fix.candidates_from_results(results)
        self.assertEqual({"design_center": "DesignCenter"}, candidates)
        self.assertEqual([], notes)

    def test_resource_with_no_product_is_ignored(self):
        results = [row("google_something", [])]
        candidates, notes = fix.candidates_from_results(results)
        self.assertEqual({}, candidates)
        self.assertEqual([], notes)

    def test_resource_with_multiple_products_is_skipped_as_ambiguous(self):
        results = [
            row(
                "google_existing_module_addition",
                [product("existing", "Existing"), product("other", "Other")],
            )
        ]
        candidates, notes = fix.candidates_from_results(results)
        self.assertEqual({}, candidates)
        self.assertEqual(1, len(notes))
        self.assertIn("ambiguous", notes[0])

    def test_same_key_different_names_is_skipped(self):
        results = [
            row("google_x_thing", [product("x", "XThing")]),
            row("google_x_other", [product("x", "XOther")]),
        ]
        candidates, notes = fix.candidates_from_results(results)
        self.assertEqual({}, candidates)
        self.assertEqual(1, len(notes))
        self.assertIn("disagreed", notes[0])


class ParseExistingTest(unittest.TestCase):
    def test_parses_keys_and_resolves_both_kinds_of_value(self):
        parsed = fix.parse_existing(FIXTURE)
        self.assertEqual(
            {"api_gateway", "zz_stray", "data_pipeline", "deployment_manager", "dialogflow"},
            parsed["keys"],
        )
        # A bare literal value resolves to itself...
        self.assertEqual("ApiGateway", parsed["values"]["api_gateway"])
        # ...and a value given by a `const` identifier resolves to the string
        # that constant holds, so both forms are comparable the same way.
        self.assertEqual("DeploymentManager", parsed["values"]["deployment_manager"])

    def test_missing_block_raises(self):
        with self.assertRaises(fix.NotFound):
            fix.parse_existing("package gcp\n")


class PlanTest(unittest.TestCase):
    def test_new_product_is_added(self):
        _, additions, notes = fix.plan(FIXTURE, {"design_center": "DesignCenter"})
        self.assertEqual({"design_center": "DesignCenter"}, additions)
        self.assertEqual([], notes)

    def test_already_mapped_product_is_a_noop(self):
        _, additions, notes = fix.plan(FIXTURE, {"api_gateway": "ApiGateway"})
        self.assertEqual({}, additions)
        self.assertEqual([], notes)

    def test_colliding_value_against_a_literal_entry_is_skipped(self):
        # A new, unrelated key ("zzz_other" is not a prefix/suffix of any
        # existing one) whose product name is already the (bare-literal)
        # value of "api_gateway" -- isolates the value check from the
        # "covered by a shorter existing key" one below.
        _, additions, notes = fix.plan(FIXTURE, {"zzz_other": "ApiGateway"})
        self.assertEqual({}, additions)
        self.assertEqual(1, len(notes))
        self.assertIn("already the value of 'api_gateway'", notes[0])

    def test_colliding_value_against_a_const_referencing_entry_is_skipped(self):
        # Same, but the existing entry's value comes from a `const`
        # identifier rather than a literal -- exercises resolving it.
        _, additions, notes = fix.plan(FIXTURE, {"zzz_other": "DeploymentManager"})
        self.assertEqual({}, additions)
        self.assertEqual(1, len(notes))
        self.assertIn("already the value of 'deployment_manager'", notes[0])

    def test_candidate_already_covered_by_a_shorter_existing_key_is_skipped(self):
        # Real case found against v8.11.0: "api_gateway" (existing) already
        # catches any "api_gateway_*" resource via prefix matching, including
        # a brand new, more specific "api_gateway_extra" product -- tfgen
        # does not fail for it, so there is nothing to fix, and silently
        # adding the longer key would move already-shipped resources (any
        # other "api_gateway_*" ones) into a new module.
        _, additions, notes = fix.plan(FIXTURE, {"api_gateway_extra": "ApiGatewayExtra"})
        self.assertEqual({}, additions)
        self.assertEqual(1, len(notes))
        self.assertIn("already resolves via the existing, shorter 'api_gateway'", notes[0])

    def test_candidate_shorter_than_an_existing_key_is_unaffected(self):
        # The reverse shape is fine: a new, shorter key does not touch an
        # existing longer key's own (more specific) resources, so it is not
        # "covering" in the risky sense and should still be added.
        _, additions, notes = fix.plan(FIXTURE, {"api": "Api"})
        self.assertEqual({"api": "Api"}, additions)
        self.assertEqual([], notes)


class ApplyTest(unittest.TestCase):
    def test_single_addition_is_a_bare_literal_in_sorted_position(self):
        # Matches the last 7 real additions to provider/resources.go, from
        # v7.21.0 through v7.45.0: a brand-new product on its first
        # appearance is a plain string literal, not a new `const`.
        parsed, additions, notes = fix.plan(FIXTURE, {"design_center": "DesignCenter"})
        self.assertEqual([], notes)
        got = fix.apply(parsed, additions)
        lines = got.splitlines()
        # "design_center" sorts between "deployment_manager" and "dialogflow".
        dep = lines.index('\t"deployment_manager": gcpDeploymentManager,')
        dia = lines.index('\t"dialogflow": "Diagflow",')
        want = '\t"design_center": "DesignCenter",'
        self.assertEqual(dep + 1, lines.index(want))
        self.assertLess(lines.index(want), dia)
        # The const block is untouched.
        self.assertNotIn("gcpDesignCenter", got)

    def test_insertion_is_not_derailed_by_an_earlier_out_of_order_entry(self):
        # Real case found testing this against v7.43.0's actual history: the
        # file has a long-standing "integrations" entry that sits right after
        # "bigquery" instead of its alphabetical position much later, which
        # made a naive "insert before the first greater entry" scan plant a
        # new "cloud_support" key right behind "bigquery" too -- following
        # the stray instead of "cloud_support"'s real neighbors. FIXTURE's
        # "zz_stray" reproduces that shape: a new key that sorts at the very
        # end of the block must still land there, not next to the stray.
        parsed, additions, notes = fix.plan(FIXTURE, {"zz_trailing": "ZzTrailing"})
        self.assertEqual([], notes)
        got = fix.apply(parsed, additions)
        lines = got.splitlines()
        self.assertEqual(
            lines.index('\t"dialogflow": "Diagflow",') + 1,
            lines.index('\t"zz_trailing": "ZzTrailing",'),
        )

    def test_insertion_before_a_comment_keeps_comment_with_its_entry(self):
        # Insert a key that sorts right before the commented "data_pipeline" entry.
        parsed, additions, notes = fix.plan(FIXTURE, {"custom_thing": "CustomThing"})
        self.assertEqual([], notes)
        got = fix.apply(parsed, additions)
        lines = got.splitlines()
        comment_i = lines.index('// Intentionally the same as "dataflow".')
        new_i = lines.index('\t"custom_thing": "CustomThing",')
        # The new entry lands before the comment, not wedged between the
        # comment and the entry it documents.
        self.assertLess(new_i, comment_i)
        self.assertEqual(comment_i + 1, lines.index('\t"data_pipeline": "DataFlow",'))

    def test_multiple_additions_both_land_and_stay_ordered(self):
        candidates = {"design_center": "DesignCenter", "custom_thing": "CustomThing"}
        parsed, additions, notes = fix.plan(FIXTURE, candidates)
        self.assertEqual(candidates, additions)
        self.assertEqual([], notes)
        got = fix.apply(parsed, additions)
        lines = got.splitlines()
        self.assertLess(
            lines.index('\t"custom_thing": "CustomThing",'),
            lines.index('\t"deployment_manager": gcpDeploymentManager,'),
        )
        self.assertLess(
            lines.index('\t"deployment_manager": gcpDeploymentManager,'),
            lines.index('\t"design_center": "DesignCenter",'),
        )

    def test_output_is_idempotent_input_for_a_second_plan(self):
        """Patching once makes a second `--fix` for the same product a no-op."""
        parsed, additions, notes = fix.plan(FIXTURE, {"design_center": "DesignCenter"})
        once = fix.apply(parsed, additions)
        _, additions_again, notes_again = fix.plan(once, {"design_center": "DesignCenter"})
        self.assertEqual({}, additions_again)
        self.assertEqual([], notes_again)


class GofmtTest(unittest.TestCase):
    def test_missing_binary_is_not_fatal(self):
        with mock.patch("subprocess.run", side_effect=FileNotFoundError):
            self.assertFalse(fix.gofmt("/dev/null"))

    def test_gofmt_failure_raises_with_stderr(self):
        err = subprocess.CalledProcessError(1, ["gofmt"], stderr="boom")
        with mock.patch("subprocess.run", side_effect=err):
            with self.assertRaisesRegex(RuntimeError, "boom"):
                fix.gofmt("/dev/null")


if __name__ == "__main__":
    unittest.main()
