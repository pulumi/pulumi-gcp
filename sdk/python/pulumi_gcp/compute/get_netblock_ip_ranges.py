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
    'GetNetblockIPRangesResult',
    'AwaitableGetNetblockIPRangesResult',
    'get_netblock_ip_ranges',
    'get_netblock_ip_ranges_output',
]

@pulumi.output_type
class GetNetblockIPRangesResult:
    """
    A collection of values returned by getNetblockIPRanges.
    """
    def __init__(__self__, cidr_blocks=None, cidr_blocks_ipv4s=None, cidr_blocks_ipv6s=None, id=None, range_type=None):
        if cidr_blocks and not isinstance(cidr_blocks, list):
            raise TypeError("Expected argument 'cidr_blocks' to be a list")
        pulumi.set(__self__, "cidr_blocks", cidr_blocks)
        if cidr_blocks_ipv4s and not isinstance(cidr_blocks_ipv4s, list):
            raise TypeError("Expected argument 'cidr_blocks_ipv4s' to be a list")
        pulumi.set(__self__, "cidr_blocks_ipv4s", cidr_blocks_ipv4s)
        if cidr_blocks_ipv6s and not isinstance(cidr_blocks_ipv6s, list):
            raise TypeError("Expected argument 'cidr_blocks_ipv6s' to be a list")
        pulumi.set(__self__, "cidr_blocks_ipv6s", cidr_blocks_ipv6s)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if range_type and not isinstance(range_type, str):
            raise TypeError("Expected argument 'range_type' to be a str")
        pulumi.set(__self__, "range_type", range_type)

    @_builtins.property
    @pulumi.getter(name="cidrBlocks")
    def cidr_blocks(self) -> Sequence[_builtins.str]:
        """
        Retrieve list of all CIDR blocks.
        """
        return pulumi.get(self, "cidr_blocks")

    @_builtins.property
    @pulumi.getter(name="cidrBlocksIpv4s")
    def cidr_blocks_ipv4s(self) -> Sequence[_builtins.str]:
        """
        Retrieve list of the IPv4 CIDR blocks
        """
        return pulumi.get(self, "cidr_blocks_ipv4s")

    @_builtins.property
    @pulumi.getter(name="cidrBlocksIpv6s")
    def cidr_blocks_ipv6s(self) -> Sequence[_builtins.str]:
        """
        Retrieve list of the IPv6 CIDR blocks, if available.
        """
        return pulumi.get(self, "cidr_blocks_ipv6s")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="rangeType")
    def range_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "range_type")


class AwaitableGetNetblockIPRangesResult(GetNetblockIPRangesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetblockIPRangesResult(
            cidr_blocks=self.cidr_blocks,
            cidr_blocks_ipv4s=self.cidr_blocks_ipv4s,
            cidr_blocks_ipv6s=self.cidr_blocks_ipv6s,
            id=self.id,
            range_type=self.range_type)


def get_netblock_ip_ranges(range_type: Optional[_builtins.str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetblockIPRangesResult:
    """
    Use this data source to get the IP addresses from different special IP ranges on Google Cloud Platform.

    ## Example Usage

    ### Cloud Ranges

    ```python
    import pulumi
    import pulumi_gcp as gcp

    netblock = gcp.compute.get_netblock_ip_ranges()
    pulumi.export("cidrBlocks", netblock.cidr_blocks)
    pulumi.export("cidrBlocksIpv4", netblock.cidr_blocks_ipv4s)
    pulumi.export("cidrBlocksIpv6", netblock.cidr_blocks_ipv6s)
    ```

    ### Allow Health Checks

    ```python
    import pulumi
    import pulumi_gcp as gcp

    legacy_hcs = gcp.compute.get_netblock_ip_ranges(range_type="legacy-health-checkers")
    default = gcp.compute.Network("default", name="test-network")
    allow_hcs = gcp.compute.Firewall("allow-hcs",
        name="allow-hcs",
        network=default.name,
        allows=[{
            "protocol": "tcp",
            "ports": ["80"],
        }],
        source_ranges=legacy_hcs.cidr_blocks_ipv4s)
    ```


    :param _builtins.str range_type: The type of range for which to provide results.
           
           Defaults to `cloud-netblocks`. The following `range_type`s are supported:
           
           * `cloud-netblocks` - Corresponds to the IP addresses used for resources on Google Cloud Platform. [More details.](https://cloud.google.com/compute/docs/faq#where_can_i_find_product_name_short_ip_ranges)
           
           * `google-netblocks` - Corresponds to IP addresses used for Google services. [More details.](https://cloud.google.com/compute/docs/faq#where_can_i_find_product_name_short_ip_ranges)
           
           * `restricted-googleapis` - Corresponds to the IP addresses used for Private Google Access only for services that support VPC Service Controls API access. These ranges are for DNS configuration. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `restricted-googleapis-with-directconnectivity` - Corresponds to the IP addresses used for Private Google Access only for services that support VPC Service Controls API access. These ranges are for routing and firewall configurations. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `private-googleapis` - Corresponds to the IP addresses used for Private Google Access, including services that do not support VPC Service Controls. These ranges are for DNS configuration. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `private-googleapis-with-directconnectivity` - Corresponds to the IP addresses used for Private Google Access, including services that do not support VPC Service Controls. These ranges are for routing and firewall configurations. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `dns-forwarders` - Corresponds to the IP addresses used to originate Cloud DNS outbound forwarding. [More details.](https://cloud.google.com/dns/zones/#creating-forwarding-zones)
           
           * `iap-forwarders` - Corresponds to the IP addresses used for Cloud IAP for TCP forwarding. [More details.](https://cloud.google.com/iap/docs/using-tcp-forwarding)
           
           * `health-checkers` - Corresponds to the IP addresses used for health checking in Cloud Load Balancing. [More details.](https://cloud.google.com/load-balancing/docs/health-checks)
           
           * `legacy-health-checkers` - Corresponds to the IP addresses used for legacy style health checkers (used by Network Load Balancing). [More details.](https://cloud.google.com/load-balancing/docs/health-checks)
    """
    __args__ = dict()
    __args__['rangeType'] = range_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getNetblockIPRanges:getNetblockIPRanges', __args__, opts=opts, typ=GetNetblockIPRangesResult).value

    return AwaitableGetNetblockIPRangesResult(
        cidr_blocks=pulumi.get(__ret__, 'cidr_blocks'),
        cidr_blocks_ipv4s=pulumi.get(__ret__, 'cidr_blocks_ipv4s'),
        cidr_blocks_ipv6s=pulumi.get(__ret__, 'cidr_blocks_ipv6s'),
        id=pulumi.get(__ret__, 'id'),
        range_type=pulumi.get(__ret__, 'range_type'))
def get_netblock_ip_ranges_output(range_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                  opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetblockIPRangesResult]:
    """
    Use this data source to get the IP addresses from different special IP ranges on Google Cloud Platform.

    ## Example Usage

    ### Cloud Ranges

    ```python
    import pulumi
    import pulumi_gcp as gcp

    netblock = gcp.compute.get_netblock_ip_ranges()
    pulumi.export("cidrBlocks", netblock.cidr_blocks)
    pulumi.export("cidrBlocksIpv4", netblock.cidr_blocks_ipv4s)
    pulumi.export("cidrBlocksIpv6", netblock.cidr_blocks_ipv6s)
    ```

    ### Allow Health Checks

    ```python
    import pulumi
    import pulumi_gcp as gcp

    legacy_hcs = gcp.compute.get_netblock_ip_ranges(range_type="legacy-health-checkers")
    default = gcp.compute.Network("default", name="test-network")
    allow_hcs = gcp.compute.Firewall("allow-hcs",
        name="allow-hcs",
        network=default.name,
        allows=[{
            "protocol": "tcp",
            "ports": ["80"],
        }],
        source_ranges=legacy_hcs.cidr_blocks_ipv4s)
    ```


    :param _builtins.str range_type: The type of range for which to provide results.
           
           Defaults to `cloud-netblocks`. The following `range_type`s are supported:
           
           * `cloud-netblocks` - Corresponds to the IP addresses used for resources on Google Cloud Platform. [More details.](https://cloud.google.com/compute/docs/faq#where_can_i_find_product_name_short_ip_ranges)
           
           * `google-netblocks` - Corresponds to IP addresses used for Google services. [More details.](https://cloud.google.com/compute/docs/faq#where_can_i_find_product_name_short_ip_ranges)
           
           * `restricted-googleapis` - Corresponds to the IP addresses used for Private Google Access only for services that support VPC Service Controls API access. These ranges are for DNS configuration. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `restricted-googleapis-with-directconnectivity` - Corresponds to the IP addresses used for Private Google Access only for services that support VPC Service Controls API access. These ranges are for routing and firewall configurations. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `private-googleapis` - Corresponds to the IP addresses used for Private Google Access, including services that do not support VPC Service Controls. These ranges are for DNS configuration. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `private-googleapis-with-directconnectivity` - Corresponds to the IP addresses used for Private Google Access, including services that do not support VPC Service Controls. These ranges are for routing and firewall configurations. [More details.](https://cloud.google.com/vpc/docs/configure-private-google-access#config-options)
           
           * `dns-forwarders` - Corresponds to the IP addresses used to originate Cloud DNS outbound forwarding. [More details.](https://cloud.google.com/dns/zones/#creating-forwarding-zones)
           
           * `iap-forwarders` - Corresponds to the IP addresses used for Cloud IAP for TCP forwarding. [More details.](https://cloud.google.com/iap/docs/using-tcp-forwarding)
           
           * `health-checkers` - Corresponds to the IP addresses used for health checking in Cloud Load Balancing. [More details.](https://cloud.google.com/load-balancing/docs/health-checks)
           
           * `legacy-health-checkers` - Corresponds to the IP addresses used for legacy style health checkers (used by Network Load Balancing). [More details.](https://cloud.google.com/load-balancing/docs/health-checks)
    """
    __args__ = dict()
    __args__['rangeType'] = range_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('gcp:compute/getNetblockIPRanges:getNetblockIPRanges', __args__, opts=opts, typ=GetNetblockIPRangesResult)
    return __ret__.apply(lambda __response__: GetNetblockIPRangesResult(
        cidr_blocks=pulumi.get(__response__, 'cidr_blocks'),
        cidr_blocks_ipv4s=pulumi.get(__response__, 'cidr_blocks_ipv4s'),
        cidr_blocks_ipv6s=pulumi.get(__response__, 'cidr_blocks_ipv6s'),
        id=pulumi.get(__response__, 'id'),
        range_type=pulumi.get(__response__, 'range_type')))
