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
    'DataExchangeIamBindingCondition',
    'DataExchangeIamMemberCondition',
    'DataExchangeSharingEnvironmentConfig',
    'DataExchangeSharingEnvironmentConfigDcrExchangeConfig',
    'DataExchangeSharingEnvironmentConfigDefaultExchangeConfig',
    'DataExchangeSubscriptionDestinationDataset',
    'DataExchangeSubscriptionDestinationDatasetDatasetReference',
    'DataExchangeSubscriptionLinkedDatasetMap',
    'DataExchangeSubscriptionLinkedResource',
    'ListingBigqueryDataset',
    'ListingBigqueryDatasetSelectedResource',
    'ListingDataProvider',
    'ListingIamBindingCondition',
    'ListingIamMemberCondition',
    'ListingPublisher',
    'ListingPubsubTopic',
    'ListingRestrictedExportConfig',
    'ListingSubscriptionDestinationDataset',
    'ListingSubscriptionDestinationDatasetDatasetReference',
    'ListingSubscriptionLinkedDatasetMap',
    'ListingSubscriptionLinkedResource',
]

@pulumi.output_type
class DataExchangeIamBindingCondition(dict):
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
class DataExchangeIamMemberCondition(dict):
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
class DataExchangeSharingEnvironmentConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dcrExchangeConfig":
            suggest = "dcr_exchange_config"
        elif key == "defaultExchangeConfig":
            suggest = "default_exchange_config"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataExchangeSharingEnvironmentConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataExchangeSharingEnvironmentConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataExchangeSharingEnvironmentConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dcr_exchange_config: Optional['outputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfig'] = None,
                 default_exchange_config: Optional['outputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfig'] = None):
        """
        :param 'DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs' dcr_exchange_config: Data Clean Room (DCR), used for privacy-safe and secured data sharing.
        :param 'DataExchangeSharingEnvironmentConfigDefaultExchangeConfigArgs' default_exchange_config: Default Analytics Hub data exchange, used for secured data sharing.
        """
        if dcr_exchange_config is not None:
            pulumi.set(__self__, "dcr_exchange_config", dcr_exchange_config)
        if default_exchange_config is not None:
            pulumi.set(__self__, "default_exchange_config", default_exchange_config)

    @_builtins.property
    @pulumi.getter(name="dcrExchangeConfig")
    def dcr_exchange_config(self) -> Optional['outputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfig']:
        """
        Data Clean Room (DCR), used for privacy-safe and secured data sharing.
        """
        return pulumi.get(self, "dcr_exchange_config")

    @_builtins.property
    @pulumi.getter(name="defaultExchangeConfig")
    def default_exchange_config(self) -> Optional['outputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfig']:
        """
        Default Analytics Hub data exchange, used for secured data sharing.
        """
        return pulumi.get(self, "default_exchange_config")


@pulumi.output_type
class DataExchangeSharingEnvironmentConfigDcrExchangeConfig(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DataExchangeSharingEnvironmentConfigDefaultExchangeConfig(dict):
    def __init__(__self__):
        pass


@pulumi.output_type
class DataExchangeSubscriptionDestinationDataset(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "datasetReference":
            suggest = "dataset_reference"
        elif key == "friendlyName":
            suggest = "friendly_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataExchangeSubscriptionDestinationDataset. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataExchangeSubscriptionDestinationDataset.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataExchangeSubscriptionDestinationDataset.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dataset_reference: 'outputs.DataExchangeSubscriptionDestinationDatasetDatasetReference',
                 location: _builtins.str,
                 description: Optional[_builtins.str] = None,
                 friendly_name: Optional[_builtins.str] = None,
                 labels: Optional[Mapping[str, _builtins.str]] = None):
        """
        :param 'DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs' dataset_reference: A reference that identifies the destination dataset.
               Structure is documented below.
        :param _builtins.str location: The geographic location where the dataset should reside.
               See https://cloud.google.com/bigquery/docs/locations for supported locations.
        :param _builtins.str description: A user-friendly description of the dataset.
        :param _builtins.str friendly_name: A descriptive name for the dataset.
        :param Mapping[str, _builtins.str] labels: The labels associated with this dataset. You can use these to
               organize and group your datasets.
        """
        pulumi.set(__self__, "dataset_reference", dataset_reference)
        pulumi.set(__self__, "location", location)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if friendly_name is not None:
            pulumi.set(__self__, "friendly_name", friendly_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)

    @_builtins.property
    @pulumi.getter(name="datasetReference")
    def dataset_reference(self) -> 'outputs.DataExchangeSubscriptionDestinationDatasetDatasetReference':
        """
        A reference that identifies the destination dataset.
        Structure is documented below.
        """
        return pulumi.get(self, "dataset_reference")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The geographic location where the dataset should reside.
        See https://cloud.google.com/bigquery/docs/locations for supported locations.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        A user-friendly description of the dataset.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="friendlyName")
    def friendly_name(self) -> Optional[_builtins.str]:
        """
        A descriptive name for the dataset.
        """
        return pulumi.get(self, "friendly_name")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        The labels associated with this dataset. You can use these to
        organize and group your datasets.
        """
        return pulumi.get(self, "labels")


@pulumi.output_type
class DataExchangeSubscriptionDestinationDatasetDatasetReference(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "datasetId":
            suggest = "dataset_id"
        elif key == "projectId":
            suggest = "project_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataExchangeSubscriptionDestinationDatasetDatasetReference. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataExchangeSubscriptionDestinationDatasetDatasetReference.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataExchangeSubscriptionDestinationDatasetDatasetReference.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dataset_id: _builtins.str,
                 project_id: _builtins.str):
        """
        :param _builtins.str dataset_id: A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
        :param _builtins.str project_id: The ID of the project containing this dataset.
        """
        pulumi.set(__self__, "dataset_id", dataset_id)
        pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter(name="datasetId")
    def dataset_id(self) -> _builtins.str:
        """
        A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
        """
        return pulumi.get(self, "dataset_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        The ID of the project containing this dataset.
        """
        return pulumi.get(self, "project_id")


@pulumi.output_type
class DataExchangeSubscriptionLinkedDatasetMap(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "resourceName":
            suggest = "resource_name"
        elif key == "linkedDataset":
            suggest = "linked_dataset"
        elif key == "linkedPubsubSubscription":
            suggest = "linked_pubsub_subscription"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataExchangeSubscriptionLinkedDatasetMap. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataExchangeSubscriptionLinkedDatasetMap.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataExchangeSubscriptionLinkedDatasetMap.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 resource_name: _builtins.str,
                 linked_dataset: Optional[_builtins.str] = None,
                 linked_pubsub_subscription: Optional[_builtins.str] = None,
                 listing: Optional[_builtins.str] = None):
        """
        :param _builtins.str resource_name: (Required) The identifier for this object. Format specified above.
        :param _builtins.str linked_dataset: (Output)
               Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        :param _builtins.str linked_pubsub_subscription: (Output)
               Output only. Name of the Pub/Sub subscription, e.g. projects/subscriberproject/subscriptions/subscriptions/sub_id
        :param _builtins.str listing: (Output)
               Output only. Listing for which linked resource is created.
        """
        pulumi.set(__self__, "resource_name", resource_name)
        if linked_dataset is not None:
            pulumi.set(__self__, "linked_dataset", linked_dataset)
        if linked_pubsub_subscription is not None:
            pulumi.set(__self__, "linked_pubsub_subscription", linked_pubsub_subscription)
        if listing is not None:
            pulumi.set(__self__, "listing", listing)

    @_builtins.property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> _builtins.str:
        """
        (Required) The identifier for this object. Format specified above.
        """
        return pulumi.get(self, "resource_name")

    @_builtins.property
    @pulumi.getter(name="linkedDataset")
    def linked_dataset(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        """
        return pulumi.get(self, "linked_dataset")

    @_builtins.property
    @pulumi.getter(name="linkedPubsubSubscription")
    def linked_pubsub_subscription(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Name of the Pub/Sub subscription, e.g. projects/subscriberproject/subscriptions/subscriptions/sub_id
        """
        return pulumi.get(self, "linked_pubsub_subscription")

    @_builtins.property
    @pulumi.getter
    def listing(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Listing for which linked resource is created.
        """
        return pulumi.get(self, "listing")


@pulumi.output_type
class DataExchangeSubscriptionLinkedResource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "linkedDataset":
            suggest = "linked_dataset"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DataExchangeSubscriptionLinkedResource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DataExchangeSubscriptionLinkedResource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DataExchangeSubscriptionLinkedResource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 linked_dataset: Optional[_builtins.str] = None,
                 listing: Optional[_builtins.str] = None):
        """
        :param _builtins.str linked_dataset: (Output)
               Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        :param _builtins.str listing: (Output)
               Output only. Listing for which linked resource is created.
        """
        if linked_dataset is not None:
            pulumi.set(__self__, "linked_dataset", linked_dataset)
        if listing is not None:
            pulumi.set(__self__, "listing", listing)

    @_builtins.property
    @pulumi.getter(name="linkedDataset")
    def linked_dataset(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        """
        return pulumi.get(self, "linked_dataset")

    @_builtins.property
    @pulumi.getter
    def listing(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Listing for which linked resource is created.
        """
        return pulumi.get(self, "listing")


@pulumi.output_type
class ListingBigqueryDataset(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "selectedResources":
            suggest = "selected_resources"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingBigqueryDataset. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingBigqueryDataset.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingBigqueryDataset.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dataset: _builtins.str,
                 selected_resources: Optional[Sequence['outputs.ListingBigqueryDatasetSelectedResource']] = None):
        """
        :param _builtins.str dataset: Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
        :param Sequence['ListingBigqueryDatasetSelectedResourceArgs'] selected_resources: Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
               Structure is documented below.
        """
        pulumi.set(__self__, "dataset", dataset)
        if selected_resources is not None:
            pulumi.set(__self__, "selected_resources", selected_resources)

    @_builtins.property
    @pulumi.getter
    def dataset(self) -> _builtins.str:
        """
        Resource name of the dataset source for this listing. e.g. projects/myproject/datasets/123
        """
        return pulumi.get(self, "dataset")

    @_builtins.property
    @pulumi.getter(name="selectedResources")
    def selected_resources(self) -> Optional[Sequence['outputs.ListingBigqueryDatasetSelectedResource']]:
        """
        Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
        Structure is documented below.
        """
        return pulumi.get(self, "selected_resources")


@pulumi.output_type
class ListingBigqueryDatasetSelectedResource(dict):
    def __init__(__self__, *,
                 routine: Optional[_builtins.str] = None,
                 table: Optional[_builtins.str] = None):
        """
        :param _builtins.str routine: Format: For routine: projects/{projectId}/datasets/{datasetId}/routines/{routineId} Example:"projects/test_project/datasets/test_dataset/routines/test_routine"
        :param _builtins.str table: Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:"projects/test_project/datasets/test_dataset/tables/test_table"
        """
        if routine is not None:
            pulumi.set(__self__, "routine", routine)
        if table is not None:
            pulumi.set(__self__, "table", table)

    @_builtins.property
    @pulumi.getter
    def routine(self) -> Optional[_builtins.str]:
        """
        Format: For routine: projects/{projectId}/datasets/{datasetId}/routines/{routineId} Example:"projects/test_project/datasets/test_dataset/routines/test_routine"
        """
        return pulumi.get(self, "routine")

    @_builtins.property
    @pulumi.getter
    def table(self) -> Optional[_builtins.str]:
        """
        Format: For table: projects/{projectId}/datasets/{datasetId}/tables/{tableId} Example:"projects/test_project/datasets/test_dataset/tables/test_table"
        """
        return pulumi.get(self, "table")


@pulumi.output_type
class ListingDataProvider(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "primaryContact":
            suggest = "primary_contact"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingDataProvider. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingDataProvider.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingDataProvider.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: _builtins.str,
                 primary_contact: Optional[_builtins.str] = None):
        """
        :param _builtins.str name: Name of the data provider.
        :param _builtins.str primary_contact: Email or URL of the data provider.
        """
        pulumi.set(__self__, "name", name)
        if primary_contact is not None:
            pulumi.set(__self__, "primary_contact", primary_contact)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the data provider.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryContact")
    def primary_contact(self) -> Optional[_builtins.str]:
        """
        Email or URL of the data provider.
        """
        return pulumi.get(self, "primary_contact")


@pulumi.output_type
class ListingIamBindingCondition(dict):
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
class ListingIamMemberCondition(dict):
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
class ListingPublisher(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "primaryContact":
            suggest = "primary_contact"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingPublisher. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingPublisher.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingPublisher.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: _builtins.str,
                 primary_contact: Optional[_builtins.str] = None):
        """
        :param _builtins.str name: Name of the listing publisher.
        :param _builtins.str primary_contact: Email or URL of the listing publisher.
        """
        pulumi.set(__self__, "name", name)
        if primary_contact is not None:
            pulumi.set(__self__, "primary_contact", primary_contact)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Name of the listing publisher.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryContact")
    def primary_contact(self) -> Optional[_builtins.str]:
        """
        Email or URL of the listing publisher.
        """
        return pulumi.get(self, "primary_contact")


@pulumi.output_type
class ListingPubsubTopic(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dataAffinityRegions":
            suggest = "data_affinity_regions"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingPubsubTopic. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingPubsubTopic.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingPubsubTopic.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 topic: _builtins.str,
                 data_affinity_regions: Optional[Sequence[_builtins.str]] = None):
        """
        :param _builtins.str topic: Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
        :param Sequence[_builtins.str] data_affinity_regions: Region hint on where the data might be published. Data affinity regions are modifiable.
               See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
        """
        pulumi.set(__self__, "topic", topic)
        if data_affinity_regions is not None:
            pulumi.set(__self__, "data_affinity_regions", data_affinity_regions)

    @_builtins.property
    @pulumi.getter
    def topic(self) -> _builtins.str:
        """
        Resource name of the Pub/Sub topic source for this listing. e.g. projects/myproject/topics/topicId
        """
        return pulumi.get(self, "topic")

    @_builtins.property
    @pulumi.getter(name="dataAffinityRegions")
    def data_affinity_regions(self) -> Optional[Sequence[_builtins.str]]:
        """
        Region hint on where the data might be published. Data affinity regions are modifiable.
        See https://cloud.google.com/about/locations for full listing of possible Cloud regions.
        """
        return pulumi.get(self, "data_affinity_regions")


@pulumi.output_type
class ListingRestrictedExportConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "restrictDirectTableAccess":
            suggest = "restrict_direct_table_access"
        elif key == "restrictQueryResult":
            suggest = "restrict_query_result"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingRestrictedExportConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingRestrictedExportConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingRestrictedExportConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: Optional[_builtins.bool] = None,
                 restrict_direct_table_access: Optional[_builtins.bool] = None,
                 restrict_query_result: Optional[_builtins.bool] = None):
        """
        :param _builtins.bool enabled: If true, enable restricted export.
        :param _builtins.bool restrict_direct_table_access: (Output)
               If true, restrict direct table access(read api/tabledata.list) on linked table.
        :param _builtins.bool restrict_query_result: If true, restrict export of query result derived from restricted linked dataset table.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if restrict_direct_table_access is not None:
            pulumi.set(__self__, "restrict_direct_table_access", restrict_direct_table_access)
        if restrict_query_result is not None:
            pulumi.set(__self__, "restrict_query_result", restrict_query_result)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[_builtins.bool]:
        """
        If true, enable restricted export.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="restrictDirectTableAccess")
    def restrict_direct_table_access(self) -> Optional[_builtins.bool]:
        """
        (Output)
        If true, restrict direct table access(read api/tabledata.list) on linked table.
        """
        return pulumi.get(self, "restrict_direct_table_access")

    @_builtins.property
    @pulumi.getter(name="restrictQueryResult")
    def restrict_query_result(self) -> Optional[_builtins.bool]:
        """
        If true, restrict export of query result derived from restricted linked dataset table.
        """
        return pulumi.get(self, "restrict_query_result")


@pulumi.output_type
class ListingSubscriptionDestinationDataset(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "datasetReference":
            suggest = "dataset_reference"
        elif key == "friendlyName":
            suggest = "friendly_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingSubscriptionDestinationDataset. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingSubscriptionDestinationDataset.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingSubscriptionDestinationDataset.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dataset_reference: 'outputs.ListingSubscriptionDestinationDatasetDatasetReference',
                 location: _builtins.str,
                 description: Optional[_builtins.str] = None,
                 friendly_name: Optional[_builtins.str] = None,
                 labels: Optional[Mapping[str, _builtins.str]] = None):
        """
        :param 'ListingSubscriptionDestinationDatasetDatasetReferenceArgs' dataset_reference: A reference that identifies the destination dataset.
               Structure is documented below.
        :param _builtins.str location: The geographic location where the dataset should reside.
               See https://cloud.google.com/bigquery/docs/locations for supported locations.
        :param _builtins.str description: A user-friendly description of the dataset.
        :param _builtins.str friendly_name: A descriptive name for the dataset.
        :param Mapping[str, _builtins.str] labels: The labels associated with this dataset. You can use these to
               organize and group your datasets.
        """
        pulumi.set(__self__, "dataset_reference", dataset_reference)
        pulumi.set(__self__, "location", location)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if friendly_name is not None:
            pulumi.set(__self__, "friendly_name", friendly_name)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)

    @_builtins.property
    @pulumi.getter(name="datasetReference")
    def dataset_reference(self) -> 'outputs.ListingSubscriptionDestinationDatasetDatasetReference':
        """
        A reference that identifies the destination dataset.
        Structure is documented below.
        """
        return pulumi.get(self, "dataset_reference")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The geographic location where the dataset should reside.
        See https://cloud.google.com/bigquery/docs/locations for supported locations.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[_builtins.str]:
        """
        A user-friendly description of the dataset.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="friendlyName")
    def friendly_name(self) -> Optional[_builtins.str]:
        """
        A descriptive name for the dataset.
        """
        return pulumi.get(self, "friendly_name")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        The labels associated with this dataset. You can use these to
        organize and group your datasets.
        """
        return pulumi.get(self, "labels")


@pulumi.output_type
class ListingSubscriptionDestinationDatasetDatasetReference(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "datasetId":
            suggest = "dataset_id"
        elif key == "projectId":
            suggest = "project_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingSubscriptionDestinationDatasetDatasetReference. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingSubscriptionDestinationDatasetDatasetReference.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingSubscriptionDestinationDatasetDatasetReference.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dataset_id: _builtins.str,
                 project_id: _builtins.str):
        """
        :param _builtins.str dataset_id: A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
        :param _builtins.str project_id: The ID of the project containing this dataset.
        """
        pulumi.set(__self__, "dataset_id", dataset_id)
        pulumi.set(__self__, "project_id", project_id)

    @_builtins.property
    @pulumi.getter(name="datasetId")
    def dataset_id(self) -> _builtins.str:
        """
        A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
        """
        return pulumi.get(self, "dataset_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        The ID of the project containing this dataset.
        """
        return pulumi.get(self, "project_id")


@pulumi.output_type
class ListingSubscriptionLinkedDatasetMap(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "resourceName":
            suggest = "resource_name"
        elif key == "linkedDataset":
            suggest = "linked_dataset"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingSubscriptionLinkedDatasetMap. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingSubscriptionLinkedDatasetMap.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingSubscriptionLinkedDatasetMap.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 resource_name: _builtins.str,
                 linked_dataset: Optional[_builtins.str] = None,
                 listing: Optional[_builtins.str] = None):
        """
        :param _builtins.str resource_name: (Required) The identifier for this object. Format specified above.
        :param _builtins.str linked_dataset: (Output)
               Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        :param _builtins.str listing: (Output)
               Output only. Listing for which linked resource is created.
        """
        pulumi.set(__self__, "resource_name", resource_name)
        if linked_dataset is not None:
            pulumi.set(__self__, "linked_dataset", linked_dataset)
        if listing is not None:
            pulumi.set(__self__, "listing", listing)

    @_builtins.property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> _builtins.str:
        """
        (Required) The identifier for this object. Format specified above.
        """
        return pulumi.get(self, "resource_name")

    @_builtins.property
    @pulumi.getter(name="linkedDataset")
    def linked_dataset(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        """
        return pulumi.get(self, "linked_dataset")

    @_builtins.property
    @pulumi.getter
    def listing(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Listing for which linked resource is created.
        """
        return pulumi.get(self, "listing")


@pulumi.output_type
class ListingSubscriptionLinkedResource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "linkedDataset":
            suggest = "linked_dataset"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListingSubscriptionLinkedResource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListingSubscriptionLinkedResource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListingSubscriptionLinkedResource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 linked_dataset: Optional[_builtins.str] = None,
                 listing: Optional[_builtins.str] = None):
        """
        :param _builtins.str linked_dataset: (Output)
               Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        :param _builtins.str listing: (Output)
               Output only. Listing for which linked resource is created.
        """
        if linked_dataset is not None:
            pulumi.set(__self__, "linked_dataset", linked_dataset)
        if listing is not None:
            pulumi.set(__self__, "listing", listing)

    @_builtins.property
    @pulumi.getter(name="linkedDataset")
    def linked_dataset(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Name of the linked dataset, e.g. projects/subscriberproject/datasets/linkedDataset
        """
        return pulumi.get(self, "linked_dataset")

    @_builtins.property
    @pulumi.getter
    def listing(self) -> Optional[_builtins.str]:
        """
        (Output)
        Output only. Listing for which linked resource is created.
        """
        return pulumi.get(self, "listing")


