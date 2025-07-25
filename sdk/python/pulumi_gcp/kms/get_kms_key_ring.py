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
    'GetKMSKeyRingResult',
    'AwaitableGetKMSKeyRingResult',
    'get_kms_key_ring',
    'get_kms_key_ring_output',
]

@pulumi.output_type
class GetKMSKeyRingResult:
    """
    A collection of values returned by getKMSKeyRing.
    """
    def __init__(__self__, id=None, location=None, name=None, project=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "project")


class AwaitableGetKMSKeyRingResult(GetKMSKeyRingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKMSKeyRingResult(
            id=self.id,
            location=self.location,
            name=self.name,
            project=self.project)


def get_kms_key_ring(location: Optional[_builtins.str] = None,
                     name: Optional[_builtins.str] = None,
                     project: Optional[_builtins.str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKMSKeyRingResult:
    """
    Provides access to Google Cloud Platform KMS KeyRing. For more information see
    [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
    and
    [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).

    A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
    and resides in a specific location.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_key_ring = gcp.kms.get_kms_key_ring(name="my-key-ring",
        location="us-central1")
    ```


    :param _builtins.str location: The Google Cloud Platform location for the KeyRing.
           A full list of valid locations can be found by running `gcloud kms locations list`.
           
           - - -
    :param _builtins.str name: The KeyRing's name.
           A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:kms/getKMSKeyRing:getKMSKeyRing', __args__, opts=opts, typ=GetKMSKeyRingResult).value

    return AwaitableGetKMSKeyRingResult(
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        project=pulumi.get(__ret__, 'project'))
def get_kms_key_ring_output(location: Optional[pulumi.Input[_builtins.str]] = None,
                            name: Optional[pulumi.Input[_builtins.str]] = None,
                            project: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetKMSKeyRingResult]:
    """
    Provides access to Google Cloud Platform KMS KeyRing. For more information see
    [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
    and
    [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).

    A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
    and resides in a specific location.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_key_ring = gcp.kms.get_kms_key_ring(name="my-key-ring",
        location="us-central1")
    ```


    :param _builtins.str location: The Google Cloud Platform location for the KeyRing.
           A full list of valid locations can be found by running `gcloud kms locations list`.
           
           - - -
    :param _builtins.str name: The KeyRing's name.
           A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
    :param _builtins.str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['location'] = location
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:kms/getKMSKeyRing:getKMSKeyRing', __args__, opts=opts, typ=GetKMSKeyRingResult)
    return __ret__.apply(lambda __response__: GetKMSKeyRingResult(
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        project=pulumi.get(__response__, 'project')))
