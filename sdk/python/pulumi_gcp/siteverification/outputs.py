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
    'WebResourceSite',
]

@pulumi.output_type
class WebResourceSite(dict):
    def __init__(__self__, *,
                 identifier: _builtins.str,
                 type: _builtins.str):
        """
        :param _builtins.str identifier: The site identifier. If the type is set to SITE, the identifier is a URL. If the type is
               set to INET_DOMAIN, the identifier is a domain name.
        :param _builtins.str type: The type of resource to be verified.
               Possible values are: `INET_DOMAIN`, `SITE`.
        """
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def identifier(self) -> _builtins.str:
        """
        The site identifier. If the type is set to SITE, the identifier is a URL. If the type is
        set to INET_DOMAIN, the identifier is a domain name.
        """
        return pulumi.get(self, "identifier")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The type of resource to be verified.
        Possible values are: `INET_DOMAIN`, `SITE`.
        """
        return pulumi.get(self, "type")


