# Self-heals the most common cause of a `make tfgen` failure right after an
# upstream bump: a brand-new magic-modules product with no `moduleMapping`
# entry yet in provider/resources.go (see that file's comment above
# `moduleMapping`, and scripts/new_resources/README.md).
#
# https://github.com/pulumi/upgrade-provider runs `make tfgen` as an opaque
# command, after it has already bumped the `upstream` submodule to the
# target tag, so by the time this runs, `scripts/new_resources --fix`'s
# default ref (the submodule's current HEAD) is exactly the release that
# needs resolving -- no version argument needed.
#
# This intentionally OVERRIDES the `.make/schema` recipe the main Makefile
# generates (see the comment above `include $(wildcard .mk/*.mk)` there)
# rather than only adding a prerequisite, because retrying has to wrap the
# existing recipe, not run alongside it. That triggers make's "overriding
# recipe for target" warning by design. `.make/schema`'s prerequisites and
# its `export`ed environment variables are declared separately from the
# recipe in the main Makefile and are unaffected; only the recipe below
# replaces the generated one.
#
# `scripts/new_resources --fix` only ever edits the file when it found an
# addition it is unambiguous about (see its README for what that excludes).
# When it is not -- or tfgen failed for an unrelated reason entirely -- this
# still fails exactly as it would without this file, just after one wasted
# retry; every exclusion it found is still printed, to carry over into
# resolving it by hand.
.make/schema:
	@if $(WORKING_DIR)/bin/$(CODEGEN) schema --out provider/cmd/$(PROVIDER) 2> .make/schema-tfgen.log; then \
		cat .make/schema-tfgen.log >&2; \
	else \
		cat .make/schema-tfgen.log >&2; \
		if ! grep -q 'could not find a module that prefixes' .make/schema-tfgen.log; then \
			exit 1; \
		fi; \
		echo '>>> make tfgen: missing moduleMapping entry; retrying once via `scripts/new_resources --fix`' >&2; \
		(cd scripts && python3 -m new_resources --fix) && \
		$(MAKE) bin/$(CODEGEN) && \
		$(WORKING_DIR)/bin/$(CODEGEN) schema --out provider/cmd/$(PROVIDER); \
	fi
	(cd provider && VERSION=$(PROVIDER_VERSION) go generate cmd/$(PROVIDER)/main.go)
	@touch $@
