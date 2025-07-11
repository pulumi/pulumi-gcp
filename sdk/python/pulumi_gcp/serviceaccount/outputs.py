# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'IAMBindingCondition',
    'IAMMemberCondition',
    'GetSAccountResult',
]

@pulumi.output_type
class IAMBindingCondition(dict):
    def __init__(__self__, *,
                 expression: builtins.str,
                 title: builtins.str,
                 description: Optional[builtins.str] = None):
        """
        :param builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        :param builtins.str description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[builtins.str]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")


@pulumi.output_type
class IAMMemberCondition(dict):
    def __init__(__self__, *,
                 expression: builtins.str,
                 title: builtins.str,
                 description: Optional[builtins.str] = None):
        """
        :param builtins.str expression: Textual representation of an expression in Common Expression Language syntax.
        :param builtins.str title: A title for the expression, i.e. a short string describing its purpose.
        :param builtins.str description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> builtins.str:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> builtins.str:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[builtins.str]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** This provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")


@pulumi.output_type
class GetSAccountResult(dict):
    def __init__(__self__, *,
                 account_id: builtins.str,
                 disabled: builtins.bool,
                 display_name: builtins.str,
                 email: builtins.str,
                 member: builtins.str,
                 name: builtins.str,
                 unique_id: builtins.str):
        """
        :param builtins.str account_id: The Google service account ID (the part before the `@` sign in the `email`)
        :param builtins.bool disabled: Whether a service account is disabled or not.
        :param builtins.str display_name: The display name for the service account.
        :param builtins.str email: The e-mail address of the service account. This value
               should be referenced from any `organizations_get_iam_policy` data sources
               that would grant the service account privileges.
        :param builtins.str member: The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        :param builtins.str name: The fully-qualified name of the service account.
        :param builtins.str unique_id: The unique id of the service account.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "disabled", disabled)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "member", member)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "unique_id", unique_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> builtins.str:
        """
        The Google service account ID (the part before the `@` sign in the `email`)
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def disabled(self) -> builtins.bool:
        """
        Whether a service account is disabled or not.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        """
        The display name for the service account.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def email(self) -> builtins.str:
        """
        The e-mail address of the service account. This value
        should be referenced from any `organizations_get_iam_policy` data sources
        that would grant the service account privileges.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def member(self) -> builtins.str:
        """
        The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
        """
        return pulumi.get(self, "member")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The fully-qualified name of the service account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="uniqueId")
    def unique_id(self) -> builtins.str:
        """
        The unique id of the service account.
        """
        return pulumi.get(self, "unique_id")


