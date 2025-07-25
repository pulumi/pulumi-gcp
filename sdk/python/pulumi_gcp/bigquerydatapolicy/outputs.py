# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'DataPolicyDataMaskingPolicy',
    'DataPolicyIamBindingCondition',
    'DataPolicyIamMemberCondition',
]

@pulumi.output_type
class DataPolicyDataMaskingPolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "predefinedExpression":
            suggest = "predefined_expression"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataPolicyDataMaskingPolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataPolicyDataMaskingPolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataPolicyDataMaskingPolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 predefined_expression: Optional[_builtins.str] = None,
                 routine: Optional[_builtins.str] = None):
        """
        :param _builtins.str predefined_expression: The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
               Possible values are: `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, `DATE_YEAR_MASK`.
        :param _builtins.str routine: The name of the BigQuery routine that contains the custom masking routine, in the format of projects/{projectNumber}/datasets/{dataset_id}/routines/{routine_id}.
        """
        if predefined_expression is not None:
            pulumi.set(__self__, "predefined_expression", predefined_expression)
        if routine is not None:
            pulumi.set(__self__, "routine", routine)

    @_builtins.property
    @pulumi.getter(name="predefinedExpression")
    def predefined_expression(self) -> Optional[_builtins.str]:
        """
        The available masking rules. Learn more here: https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
        Possible values are: `SHA256`, `ALWAYS_NULL`, `DEFAULT_MASKING_VALUE`, `LAST_FOUR_CHARACTERS`, `FIRST_FOUR_CHARACTERS`, `EMAIL_MASK`, `DATE_YEAR_MASK`.
        """
        return pulumi.get(self, "predefined_expression")

    @_builtins.property
    @pulumi.getter
    def routine(self) -> Optional[_builtins.str]:
        """
        The name of the BigQuery routine that contains the custom masking routine, in the format of projects/{projectNumber}/datasets/{dataset_id}/routines/{routine_id}.
        """
        return pulumi.get(self, "routine")


@pulumi.output_type
class DataPolicyIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class DataPolicyIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: _builtins.str,
                 title: _builtins.str,
                 description: Optional[_builtins.str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> _builtins.str:
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def title(self) -> _builtins.str:
        return pulumi.get(self, "title")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description")


