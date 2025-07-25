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
    'GetTableIamPolicyResult',
    'AwaitableGetTableIamPolicyResult',
    'get_table_iam_policy',
    'get_table_iam_policy_output',
]

@pulumi.output_type
class GetTableIamPolicyResult:
    """
    A collection of values returned by getTableIamPolicy.
    """
    def __init__(__self__, dataset_id=None, etag=None, id=None, policy_data=None, project=None, table_id=None):
        if dataset_id and not isinstance(dataset_id, str):
            raise TypeError("Expected argument 'dataset_id' to be a str")
        pulumi.set(__self__, "dataset_id", dataset_id)
        if etag and not isinstance(etag, str):
            raise TypeError("Expected argument 'etag' to be a str")
        pulumi.set(__self__, "etag", etag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policy_data and not isinstance(policy_data, str):
            raise TypeError("Expected argument 'policy_data' to be a str")
        pulumi.set(__self__, "policy_data", policy_data)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if table_id and not isinstance(table_id, str):
            raise TypeError("Expected argument 'table_id' to be a str")
        pulumi.set(__self__, "table_id", table_id)

    @_builtins.property
    @pulumi.getter(name="datasetId")
    def dataset_id(self) -> _builtins.str:
        return pulumi.get(self, "dataset_id")

    @_builtins.property
    @pulumi.getter
    def etag(self) -> _builtins.str:
        """
        (Computed) The etag of the IAM policy.
        """
        return pulumi.get(self, "etag")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="policyData")
    def policy_data(self) -> _builtins.str:
        """
        (Required only by `bigquery.IamPolicy`) The policy data generated by
        a `organizations_get_iam_policy` data source.
        """
        return pulumi.get(self, "policy_data")

    @_builtins.property
    @pulumi.getter
    def project(self) -> _builtins.str:
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter(name="tableId")
    def table_id(self) -> _builtins.str:
        return pulumi.get(self, "table_id")


class AwaitableGetTableIamPolicyResult(GetTableIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTableIamPolicyResult(
            dataset_id=self.dataset_id,
            etag=self.etag,
            id=self.id,
            policy_data=self.policy_data,
            project=self.project,
            table_id=self.table_id)


def get_table_iam_policy(dataset_id: Optional[_builtins.str] = None,
                         project: Optional[_builtins.str] = None,
                         table_id: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTableIamPolicyResult:
    """
    Retrieves the current IAM policy data for table

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.bigquery.get_table_iam_policy(project=test["project"],
        dataset_id=test["datasetId"],
        table_id=test["tableId"])
    ```


    :param _builtins.str dataset_id: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    :param _builtins.str table_id: Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['datasetId'] = dataset_id
    __args__['project'] = project
    __args__['tableId'] = table_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:bigquery/getTableIamPolicy:getTableIamPolicy', __args__, opts=opts, typ=GetTableIamPolicyResult).value

    return AwaitableGetTableIamPolicyResult(
        dataset_id=pulumi.get(__ret__, 'dataset_id'),
        etag=pulumi.get(__ret__, 'etag'),
        id=pulumi.get(__ret__, 'id'),
        policy_data=pulumi.get(__ret__, 'policy_data'),
        project=pulumi.get(__ret__, 'project'),
        table_id=pulumi.get(__ret__, 'table_id'))
def get_table_iam_policy_output(dataset_id: Optional[pulumi.Input[_builtins.str]] = None,
                                project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                table_id: Optional[pulumi.Input[_builtins.str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTableIamPolicyResult]:
    """
    Retrieves the current IAM policy data for table

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    policy = gcp.bigquery.get_table_iam_policy(project=test["project"],
        dataset_id=test["datasetId"],
        table_id=test["tableId"])
    ```


    :param _builtins.str dataset_id: Used to find the parent resource to bind the IAM policy to
    :param _builtins.str project: The ID of the project in which the resource belongs.
           If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
    :param _builtins.str table_id: Used to find the parent resource to bind the IAM policy to
    """
    __args__ = dict()
    __args__['datasetId'] = dataset_id
    __args__['project'] = project
    __args__['tableId'] = table_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:bigquery/getTableIamPolicy:getTableIamPolicy', __args__, opts=opts, typ=GetTableIamPolicyResult)
    return __ret__.apply(lambda __response__: GetTableIamPolicyResult(
        dataset_id=pulumi.get(__response__, 'dataset_id'),
        etag=pulumi.get(__response__, 'etag'),
        id=pulumi.get(__response__, 'id'),
        policy_data=pulumi.get(__response__, 'policy_data'),
        project=pulumi.get(__response__, 'project'),
        table_id=pulumi.get(__response__, 'table_id')))
