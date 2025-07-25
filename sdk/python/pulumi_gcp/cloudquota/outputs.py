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
from . import outputs

__all__ = [
    'SQuotaPreferenceQuotaConfig',
    'GetSQuotaInfoDimensionsInfoResult',
    'GetSQuotaInfoDimensionsInfoDetailResult',
    'GetSQuotaInfoQuotaIncreaseEligibilityResult',
    'GetSQuotaInfosQuotaInfoResult',
    'GetSQuotaInfosQuotaInfoDimensionsInfoResult',
    'GetSQuotaInfosQuotaInfoDimensionsInfoDetailResult',
    'GetSQuotaInfosQuotaInfoQuotaIncreaseEligibilityResult',
]

@pulumi.output_type
class SQuotaPreferenceQuotaConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "preferredValue":
            suggest = "preferred_value"
        elif key == "grantedValue":
            suggest = "granted_value"
        elif key == "requestOrigin":
            suggest = "request_origin"
        elif key == "stateDetail":
            suggest = "state_detail"
        elif key == "traceId":
            suggest = "trace_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SQuotaPreferenceQuotaConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SQuotaPreferenceQuotaConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SQuotaPreferenceQuotaConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 preferred_value: _builtins.str,
                 annotations: Optional[Mapping[str, _builtins.str]] = None,
                 granted_value: Optional[_builtins.str] = None,
                 request_origin: Optional[_builtins.str] = None,
                 state_detail: Optional[_builtins.str] = None,
                 trace_id: Optional[_builtins.str] = None):
        """
        :param _builtins.str preferred_value: The preferred value. Must be greater than or equal to -1. If set to -1, it means the value is "unlimited".
        :param Mapping[str, _builtins.str] annotations: The annotations map for clients to store small amounts of arbitrary data. Do not put PII or other sensitive information here. See https://google.aip.dev/128#annotations.
               An object containing a list of "key: value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
        :param _builtins.str granted_value: (Output)
               Granted quota value.
        :param _builtins.str request_origin: (Output)
               The origin of the quota preference request.
        :param _builtins.str state_detail: (Output)
               Optional details about the state of this quota preference.
        :param _builtins.str trace_id: (Output)
               The trace id that the Google Cloud uses to provision the requested quota. This trace id may be used by the client to contact Cloud support to track the state of a quota preference request. The trace id is only produced for increase requests and is unique for each request. The quota decrease requests do not have a trace id.
        """
        pulumi.set(__self__, "preferred_value", preferred_value)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if granted_value is not None:
            pulumi.set(__self__, "granted_value", granted_value)
        if request_origin is not None:
            pulumi.set(__self__, "request_origin", request_origin)
        if state_detail is not None:
            pulumi.set(__self__, "state_detail", state_detail)
        if trace_id is not None:
            pulumi.set(__self__, "trace_id", trace_id)

    @_builtins.property
    @pulumi.getter(name="preferredValue")
    def preferred_value(self) -> _builtins.str:
        """
        The preferred value. Must be greater than or equal to -1. If set to -1, it means the value is "unlimited".
        """
        return pulumi.get(self, "preferred_value")

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        The annotations map for clients to store small amounts of arbitrary data. Do not put PII or other sensitive information here. See https://google.aip.dev/128#annotations.
        An object containing a list of "key: value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter(name="grantedValue")
    def granted_value(self) -> Optional[_builtins.str]:
        """
        (Output)
        Granted quota value.
        """
        return pulumi.get(self, "granted_value")

    @_builtins.property
    @pulumi.getter(name="requestOrigin")
    def request_origin(self) -> Optional[_builtins.str]:
        """
        (Output)
        The origin of the quota preference request.
        """
        return pulumi.get(self, "request_origin")

    @_builtins.property
    @pulumi.getter(name="stateDetail")
    def state_detail(self) -> Optional[_builtins.str]:
        """
        (Output)
        Optional details about the state of this quota preference.
        """
        return pulumi.get(self, "state_detail")

    @_builtins.property
    @pulumi.getter(name="traceId")
    def trace_id(self) -> Optional[_builtins.str]:
        """
        (Output)
        The trace id that the Google Cloud uses to provision the requested quota. This trace id may be used by the client to contact Cloud support to track the state of a quota preference request. The trace id is only produced for increase requests and is unique for each request. The quota decrease requests do not have a trace id.
        """
        return pulumi.get(self, "trace_id")


@pulumi.output_type
class GetSQuotaInfoDimensionsInfoResult(dict):
    def __init__(__self__, *,
                 applicable_locations: Sequence[_builtins.str],
                 details: Sequence['outputs.GetSQuotaInfoDimensionsInfoDetailResult'],
                 dimensions: Mapping[str, _builtins.str]):
        """
        :param Sequence[_builtins.str] applicable_locations: The applicable regions or zones of this dimensions info. The field will be set to `['global']` for quotas that are not per region or per zone. Otherwise, it will be set to the list of locations this dimension info is applicable to.
        :param Sequence['GetSQuotaInfoDimensionsInfoDetailArgs'] details: The quota details for a map of dimensions.
        :param Mapping[str, _builtins.str] dimensions: The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        """
        pulumi.set(__self__, "applicable_locations", applicable_locations)
        pulumi.set(__self__, "details", details)
        pulumi.set(__self__, "dimensions", dimensions)

    @_builtins.property
    @pulumi.getter(name="applicableLocations")
    def applicable_locations(self) -> Sequence[_builtins.str]:
        """
        The applicable regions or zones of this dimensions info. The field will be set to `['global']` for quotas that are not per region or per zone. Otherwise, it will be set to the list of locations this dimension info is applicable to.
        """
        return pulumi.get(self, "applicable_locations")

    @_builtins.property
    @pulumi.getter
    def details(self) -> Sequence['outputs.GetSQuotaInfoDimensionsInfoDetailResult']:
        """
        The quota details for a map of dimensions.
        """
        return pulumi.get(self, "details")

    @_builtins.property
    @pulumi.getter
    def dimensions(self) -> Mapping[str, _builtins.str]:
        """
        The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        """
        return pulumi.get(self, "dimensions")


@pulumi.output_type
class GetSQuotaInfoDimensionsInfoDetailResult(dict):
    def __init__(__self__, *,
                 value: _builtins.str):
        """
        :param _builtins.str value: The value currently in effect and being enforced.
        """
        pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> _builtins.str:
        """
        The value currently in effect and being enforced.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetSQuotaInfoQuotaIncreaseEligibilityResult(dict):
    def __init__(__self__, *,
                 ineligibility_reason: _builtins.str,
                 is_eligible: _builtins.bool):
        """
        :param _builtins.str ineligibility_reason: The enumeration of reasons when it is ineligible to request increase adjustment.
        :param _builtins.bool is_eligible: Whether a higher quota value can be requested for the quota.
        """
        pulumi.set(__self__, "ineligibility_reason", ineligibility_reason)
        pulumi.set(__self__, "is_eligible", is_eligible)

    @_builtins.property
    @pulumi.getter(name="ineligibilityReason")
    def ineligibility_reason(self) -> _builtins.str:
        """
        The enumeration of reasons when it is ineligible to request increase adjustment.
        """
        return pulumi.get(self, "ineligibility_reason")

    @_builtins.property
    @pulumi.getter(name="isEligible")
    def is_eligible(self) -> _builtins.bool:
        """
        Whether a higher quota value can be requested for the quota.
        """
        return pulumi.get(self, "is_eligible")


@pulumi.output_type
class GetSQuotaInfosQuotaInfoResult(dict):
    def __init__(__self__, *,
                 container_type: _builtins.str,
                 dimensions: Sequence[_builtins.str],
                 dimensions_infos: Sequence['outputs.GetSQuotaInfosQuotaInfoDimensionsInfoResult'],
                 is_concurrent: _builtins.bool,
                 is_fixed: _builtins.bool,
                 is_precise: _builtins.bool,
                 metric: _builtins.str,
                 metric_display_name: _builtins.str,
                 metric_unit: _builtins.str,
                 name: _builtins.str,
                 quota_display_name: _builtins.str,
                 quota_id: _builtins.str,
                 quota_increase_eligibilities: Sequence['outputs.GetSQuotaInfosQuotaInfoQuotaIncreaseEligibilityResult'],
                 refresh_interval: _builtins.str,
                 service: _builtins.str,
                 service_request_quota_uri: _builtins.str):
        """
        :param _builtins.str container_type: (Output) The container type of the QuotaInfo.
        :param Sequence[_builtins.str] dimensions: The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        :param Sequence['GetSQuotaInfosQuotaInfoDimensionsInfoArgs'] dimensions_infos: (Output) The collection of dimensions info ordered by their dimensions from more specific ones to less specific ones.
        :param _builtins.bool is_concurrent: (Output) Whether the quota is a concurrent quota. Concurrent quotas are enforced on the total number of concurrent operations in flight at any given time.
        :param _builtins.bool is_fixed: (Output) Whether the quota value is fixed or adjustable.
        :param _builtins.bool is_precise: (Output) Whether this is a precise quota. A precise quota is tracked with absolute precision. In contrast, an imprecise quota is not tracked with precision.
        :param _builtins.str metric: (Output) The metric of the quota. It specifies the resources consumption the quota is defined for, for example: `compute.googleapis.com/cpus`.
        :param _builtins.str metric_display_name: (Output) The display name of the quota metric.
        :param _builtins.str metric_unit: (Output) The unit in which the metric value is reported, e.g., `MByte`.
        :param _builtins.str name: (Output) Resource name of this QuotaInfo, for example: `projects/123/locations/global/services/compute.googleapis.com/quotaInfos/CpusPerProjectPerRegion`.
        :param _builtins.str quota_display_name: (Output) The display name of the quota.
        :param Sequence['GetSQuotaInfosQuotaInfoQuotaIncreaseEligibilityArgs'] quota_increase_eligibilities: (Output) Whether it is eligible to request a higher quota value for this quota.
        :param _builtins.str refresh_interval: (Output) The reset time interval for the quota. Refresh interval applies to rate quota only. Example: "minute" for per minute, "day" for per day, or "10 seconds" for every 10 seconds.
        :param _builtins.str service: The name of the service in which the quotas are defined.
        :param _builtins.str service_request_quota_uri: (Output) URI to the page where users can request more quota for the cloud service, for example: `https://console.cloud.google.com/iam-admin/quotas`.
        """
        pulumi.set(__self__, "container_type", container_type)
        pulumi.set(__self__, "dimensions", dimensions)
        pulumi.set(__self__, "dimensions_infos", dimensions_infos)
        pulumi.set(__self__, "is_concurrent", is_concurrent)
        pulumi.set(__self__, "is_fixed", is_fixed)
        pulumi.set(__self__, "is_precise", is_precise)
        pulumi.set(__self__, "metric", metric)
        pulumi.set(__self__, "metric_display_name", metric_display_name)
        pulumi.set(__self__, "metric_unit", metric_unit)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "quota_display_name", quota_display_name)
        pulumi.set(__self__, "quota_id", quota_id)
        pulumi.set(__self__, "quota_increase_eligibilities", quota_increase_eligibilities)
        pulumi.set(__self__, "refresh_interval", refresh_interval)
        pulumi.set(__self__, "service", service)
        pulumi.set(__self__, "service_request_quota_uri", service_request_quota_uri)

    @_builtins.property
    @pulumi.getter(name="containerType")
    def container_type(self) -> _builtins.str:
        """
        (Output) The container type of the QuotaInfo.
        """
        return pulumi.get(self, "container_type")

    @_builtins.property
    @pulumi.getter
    def dimensions(self) -> Sequence[_builtins.str]:
        """
        The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        """
        return pulumi.get(self, "dimensions")

    @_builtins.property
    @pulumi.getter(name="dimensionsInfos")
    def dimensions_infos(self) -> Sequence['outputs.GetSQuotaInfosQuotaInfoDimensionsInfoResult']:
        """
        (Output) The collection of dimensions info ordered by their dimensions from more specific ones to less specific ones.
        """
        return pulumi.get(self, "dimensions_infos")

    @_builtins.property
    @pulumi.getter(name="isConcurrent")
    def is_concurrent(self) -> _builtins.bool:
        """
        (Output) Whether the quota is a concurrent quota. Concurrent quotas are enforced on the total number of concurrent operations in flight at any given time.
        """
        return pulumi.get(self, "is_concurrent")

    @_builtins.property
    @pulumi.getter(name="isFixed")
    def is_fixed(self) -> _builtins.bool:
        """
        (Output) Whether the quota value is fixed or adjustable.
        """
        return pulumi.get(self, "is_fixed")

    @_builtins.property
    @pulumi.getter(name="isPrecise")
    def is_precise(self) -> _builtins.bool:
        """
        (Output) Whether this is a precise quota. A precise quota is tracked with absolute precision. In contrast, an imprecise quota is not tracked with precision.
        """
        return pulumi.get(self, "is_precise")

    @_builtins.property
    @pulumi.getter
    def metric(self) -> _builtins.str:
        """
        (Output) The metric of the quota. It specifies the resources consumption the quota is defined for, for example: `compute.googleapis.com/cpus`.
        """
        return pulumi.get(self, "metric")

    @_builtins.property
    @pulumi.getter(name="metricDisplayName")
    def metric_display_name(self) -> _builtins.str:
        """
        (Output) The display name of the quota metric.
        """
        return pulumi.get(self, "metric_display_name")

    @_builtins.property
    @pulumi.getter(name="metricUnit")
    def metric_unit(self) -> _builtins.str:
        """
        (Output) The unit in which the metric value is reported, e.g., `MByte`.
        """
        return pulumi.get(self, "metric_unit")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        (Output) Resource name of this QuotaInfo, for example: `projects/123/locations/global/services/compute.googleapis.com/quotaInfos/CpusPerProjectPerRegion`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="quotaDisplayName")
    def quota_display_name(self) -> _builtins.str:
        """
        (Output) The display name of the quota.
        """
        return pulumi.get(self, "quota_display_name")

    @_builtins.property
    @pulumi.getter(name="quotaId")
    def quota_id(self) -> _builtins.str:
        return pulumi.get(self, "quota_id")

    @_builtins.property
    @pulumi.getter(name="quotaIncreaseEligibilities")
    def quota_increase_eligibilities(self) -> Sequence['outputs.GetSQuotaInfosQuotaInfoQuotaIncreaseEligibilityResult']:
        """
        (Output) Whether it is eligible to request a higher quota value for this quota.
        """
        return pulumi.get(self, "quota_increase_eligibilities")

    @_builtins.property
    @pulumi.getter(name="refreshInterval")
    def refresh_interval(self) -> _builtins.str:
        """
        (Output) The reset time interval for the quota. Refresh interval applies to rate quota only. Example: "minute" for per minute, "day" for per day, or "10 seconds" for every 10 seconds.
        """
        return pulumi.get(self, "refresh_interval")

    @_builtins.property
    @pulumi.getter
    def service(self) -> _builtins.str:
        """
        The name of the service in which the quotas are defined.
        """
        return pulumi.get(self, "service")

    @_builtins.property
    @pulumi.getter(name="serviceRequestQuotaUri")
    def service_request_quota_uri(self) -> _builtins.str:
        """
        (Output) URI to the page where users can request more quota for the cloud service, for example: `https://console.cloud.google.com/iam-admin/quotas`.
        """
        return pulumi.get(self, "service_request_quota_uri")


@pulumi.output_type
class GetSQuotaInfosQuotaInfoDimensionsInfoResult(dict):
    def __init__(__self__, *,
                 applicable_locations: Sequence[_builtins.str],
                 details: Sequence['outputs.GetSQuotaInfosQuotaInfoDimensionsInfoDetailResult'],
                 dimensions: Mapping[str, _builtins.str]):
        """
        :param Sequence[_builtins.str] applicable_locations: The applicable regions or zones of this dimensions info. The field will be set to `['global']` for quotas that are not per region or per zone. Otherwise, it will be set to the list of locations this dimension info is applicable to.
        :param Sequence['GetSQuotaInfosQuotaInfoDimensionsInfoDetailArgs'] details: The quota details for a map of dimensions.
        :param Mapping[str, _builtins.str] dimensions: The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        """
        pulumi.set(__self__, "applicable_locations", applicable_locations)
        pulumi.set(__self__, "details", details)
        pulumi.set(__self__, "dimensions", dimensions)

    @_builtins.property
    @pulumi.getter(name="applicableLocations")
    def applicable_locations(self) -> Sequence[_builtins.str]:
        """
        The applicable regions or zones of this dimensions info. The field will be set to `['global']` for quotas that are not per region or per zone. Otherwise, it will be set to the list of locations this dimension info is applicable to.
        """
        return pulumi.get(self, "applicable_locations")

    @_builtins.property
    @pulumi.getter
    def details(self) -> Sequence['outputs.GetSQuotaInfosQuotaInfoDimensionsInfoDetailResult']:
        """
        The quota details for a map of dimensions.
        """
        return pulumi.get(self, "details")

    @_builtins.property
    @pulumi.getter
    def dimensions(self) -> Mapping[str, _builtins.str]:
        """
        The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
        """
        return pulumi.get(self, "dimensions")


@pulumi.output_type
class GetSQuotaInfosQuotaInfoDimensionsInfoDetailResult(dict):
    def __init__(__self__, *,
                 value: _builtins.str):
        """
        :param _builtins.str value: The value currently in effect and being enforced.
        """
        pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> _builtins.str:
        """
        The value currently in effect and being enforced.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetSQuotaInfosQuotaInfoQuotaIncreaseEligibilityResult(dict):
    def __init__(__self__, *,
                 ineligibility_reason: _builtins.str,
                 is_eligible: _builtins.bool):
        """
        :param _builtins.str ineligibility_reason: The enumeration of reasons when it is ineligible to request increase adjustment.
        :param _builtins.bool is_eligible: Whether a higher quota value can be requested for the quota.
        """
        pulumi.set(__self__, "ineligibility_reason", ineligibility_reason)
        pulumi.set(__self__, "is_eligible", is_eligible)

    @_builtins.property
    @pulumi.getter(name="ineligibilityReason")
    def ineligibility_reason(self) -> _builtins.str:
        """
        The enumeration of reasons when it is ineligible to request increase adjustment.
        """
        return pulumi.get(self, "ineligibility_reason")

    @_builtins.property
    @pulumi.getter(name="isEligible")
    def is_eligible(self) -> _builtins.bool:
        """
        Whether a higher quota value can be requested for the quota.
        """
        return pulumi.get(self, "is_eligible")


