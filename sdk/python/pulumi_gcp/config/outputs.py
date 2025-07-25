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
    'Batching',
    'ExternalCredentials',
]

@pulumi.output_type
class Batching(dict):
    def __init__(__self__, *,
                 enable_batching: Optional[_builtins.bool] = None,
                 send_after: Optional[_builtins.str] = None):
        if enable_batching is not None:
            pulumi.set(__self__, "enable_batching", enable_batching)
        if send_after is not None:
            pulumi.set(__self__, "send_after", send_after)

    @_builtins.property
    @pulumi.getter(name="enableBatching")
    def enable_batching(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_batching")

    @_builtins.property
    @pulumi.getter(name="sendAfter")
    def send_after(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "send_after")


@pulumi.output_type
class ExternalCredentials(dict):
    def __init__(__self__, *,
                 audience: _builtins.str,
                 identity_token: _builtins.str,
                 service_account_email: _builtins.str):
        pulumi.set(__self__, "audience", audience)
        pulumi.set(__self__, "identity_token", identity_token)
        pulumi.set(__self__, "service_account_email", service_account_email)

    @_builtins.property
    @pulumi.getter
    def audience(self) -> _builtins.str:
        return pulumi.get(self, "audience")

    @_builtins.property
    @pulumi.getter(name="identityToken")
    def identity_token(self) -> _builtins.str:
        return pulumi.get(self, "identity_token")

    @_builtins.property
    @pulumi.getter(name="serviceAccountEmail")
    def service_account_email(self) -> _builtins.str:
        return pulumi.get(self, "service_account_email")


