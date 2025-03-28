# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import outputs

__all__ = [
    'ConnectivityTestDestination',
    'ConnectivityTestSource',
    'ConnectivityTestSourceAppEngineVersion',
    'ConnectivityTestSourceCloudFunction',
    'ConnectivityTestSourceCloudRunRevision',
]

@pulumi.output_type
class ConnectivityTestDestination(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "cloudSqlInstance":
            suggest = "cloud_sql_instance"
        elif key == "forwardingRule":
            suggest = "forwarding_rule"
        elif key == "gkeMasterCluster":
            suggest = "gke_master_cluster"
        elif key == "ipAddress":
            suggest = "ip_address"
        elif key == "projectId":
            suggest = "project_id"
        elif key == "redisCluster":
            suggest = "redis_cluster"
        elif key == "redisInstance":
            suggest = "redis_instance"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ConnectivityTestDestination. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ConnectivityTestDestination.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ConnectivityTestDestination.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cloud_sql_instance: Optional[str] = None,
                 forwarding_rule: Optional[str] = None,
                 fqdn: Optional[str] = None,
                 gke_master_cluster: Optional[str] = None,
                 instance: Optional[str] = None,
                 ip_address: Optional[str] = None,
                 network: Optional[str] = None,
                 port: Optional[int] = None,
                 project_id: Optional[str] = None,
                 redis_cluster: Optional[str] = None,
                 redis_instance: Optional[str] = None):
        """
        :param str cloud_sql_instance: A Cloud SQL instance URI.
        :param str forwarding_rule: Forwarding rule URI. Forwarding rules are frontends for load balancers,
               PSC endpoints, and Protocol Forwarding.
        :param str fqdn: A DNS endpoint of Google Kubernetes Engine cluster control plane.
               Requires gke_master_cluster to be set, can't be used simultaneoulsly with
               ip_address or network. Applicable only to destination endpoint.
        :param str gke_master_cluster: A cluster URI for Google Kubernetes Engine cluster control plane.
        :param str instance: A Compute Engine instance URI.
        :param str ip_address: The IP address of the endpoint, which can be an external or internal IP.
        :param str network: A VPC network URI.
        :param int port: The IP protocol port of the endpoint. Only applicable when protocol is
               TCP or UDP.
        :param str project_id: Project ID where the endpoint is located.
               The project ID can be derived from the URI if you provide a endpoint or
               network URI.
               The following are two cases where you may need to provide the project ID:
               1. Only the IP address is specified, and the IP address is within a Google
               Cloud project.
               2. When you are using Shared VPC and the IP address that you provide is
               from the service project. In this case, the network that the IP address
               resides in is defined in the host project.
               
               - - -
        :param str redis_cluster: A Redis Cluster URI.
        :param str redis_instance: A Redis Instance URI.
        """
        if cloud_sql_instance is not None:
            pulumi.set(__self__, "cloud_sql_instance", cloud_sql_instance)
        if forwarding_rule is not None:
            pulumi.set(__self__, "forwarding_rule", forwarding_rule)
        if fqdn is not None:
            pulumi.set(__self__, "fqdn", fqdn)
        if gke_master_cluster is not None:
            pulumi.set(__self__, "gke_master_cluster", gke_master_cluster)
        if instance is not None:
            pulumi.set(__self__, "instance", instance)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if redis_cluster is not None:
            pulumi.set(__self__, "redis_cluster", redis_cluster)
        if redis_instance is not None:
            pulumi.set(__self__, "redis_instance", redis_instance)

    @property
    @pulumi.getter(name="cloudSqlInstance")
    def cloud_sql_instance(self) -> Optional[str]:
        """
        A Cloud SQL instance URI.
        """
        return pulumi.get(self, "cloud_sql_instance")

    @property
    @pulumi.getter(name="forwardingRule")
    def forwarding_rule(self) -> Optional[str]:
        """
        Forwarding rule URI. Forwarding rules are frontends for load balancers,
        PSC endpoints, and Protocol Forwarding.
        """
        return pulumi.get(self, "forwarding_rule")

    @property
    @pulumi.getter
    def fqdn(self) -> Optional[str]:
        """
        A DNS endpoint of Google Kubernetes Engine cluster control plane.
        Requires gke_master_cluster to be set, can't be used simultaneoulsly with
        ip_address or network. Applicable only to destination endpoint.
        """
        return pulumi.get(self, "fqdn")

    @property
    @pulumi.getter(name="gkeMasterCluster")
    def gke_master_cluster(self) -> Optional[str]:
        """
        A cluster URI for Google Kubernetes Engine cluster control plane.
        """
        return pulumi.get(self, "gke_master_cluster")

    @property
    @pulumi.getter
    def instance(self) -> Optional[str]:
        """
        A Compute Engine instance URI.
        """
        return pulumi.get(self, "instance")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[str]:
        """
        The IP address of the endpoint, which can be an external or internal IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def network(self) -> Optional[str]:
        """
        A VPC network URI.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The IP protocol port of the endpoint. Only applicable when protocol is
        TCP or UDP.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project ID where the endpoint is located.
        The project ID can be derived from the URI if you provide a endpoint or
        network URI.
        The following are two cases where you may need to provide the project ID:
        1. Only the IP address is specified, and the IP address is within a Google
        Cloud project.
        2. When you are using Shared VPC and the IP address that you provide is
        from the service project. In this case, the network that the IP address
        resides in is defined in the host project.

        - - -
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="redisCluster")
    def redis_cluster(self) -> Optional[str]:
        """
        A Redis Cluster URI.
        """
        return pulumi.get(self, "redis_cluster")

    @property
    @pulumi.getter(name="redisInstance")
    def redis_instance(self) -> Optional[str]:
        """
        A Redis Instance URI.
        """
        return pulumi.get(self, "redis_instance")


@pulumi.output_type
class ConnectivityTestSource(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "appEngineVersion":
            suggest = "app_engine_version"
        elif key == "cloudFunction":
            suggest = "cloud_function"
        elif key == "cloudRunRevision":
            suggest = "cloud_run_revision"
        elif key == "cloudSqlInstance":
            suggest = "cloud_sql_instance"
        elif key == "gkeMasterCluster":
            suggest = "gke_master_cluster"
        elif key == "ipAddress":
            suggest = "ip_address"
        elif key == "networkType":
            suggest = "network_type"
        elif key == "projectId":
            suggest = "project_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ConnectivityTestSource. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ConnectivityTestSource.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ConnectivityTestSource.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 app_engine_version: Optional['outputs.ConnectivityTestSourceAppEngineVersion'] = None,
                 cloud_function: Optional['outputs.ConnectivityTestSourceCloudFunction'] = None,
                 cloud_run_revision: Optional['outputs.ConnectivityTestSourceCloudRunRevision'] = None,
                 cloud_sql_instance: Optional[str] = None,
                 gke_master_cluster: Optional[str] = None,
                 instance: Optional[str] = None,
                 ip_address: Optional[str] = None,
                 network: Optional[str] = None,
                 network_type: Optional[str] = None,
                 port: Optional[int] = None,
                 project_id: Optional[str] = None):
        """
        :param 'ConnectivityTestSourceAppEngineVersionArgs' app_engine_version: An App Engine service version.
               Structure is documented below.
        :param 'ConnectivityTestSourceCloudFunctionArgs' cloud_function: A Cloud Function.
               Structure is documented below.
        :param 'ConnectivityTestSourceCloudRunRevisionArgs' cloud_run_revision: A Cloud Run revision.
               Structure is documented below.
        :param str cloud_sql_instance: A Cloud SQL instance URI.
        :param str gke_master_cluster: A cluster URI for Google Kubernetes Engine cluster control plane.
        :param str instance: A Compute Engine instance URI.
        :param str ip_address: The IP address of the endpoint, which can be an external or internal IP.
        :param str network: A VPC network URI.
        :param str network_type: Type of the network where the endpoint is located.
               Possible values are: `GCP_NETWORK`, `NON_GCP_NETWORK`.
        :param int port: The IP protocol port of the endpoint. Only applicable when protocol is
               TCP or UDP.
        :param str project_id: Project ID where the endpoint is located.
               The project ID can be derived from the URI if you provide a endpoint or
               network URI.
               The following are two cases where you may need to provide the project ID:
               1. Only the IP address is specified, and the IP address is within a Google
               Cloud project.
               2. When you are using Shared VPC and the IP address that you provide is
               from the service project. In this case, the network that the IP address
               resides in is defined in the host project.
        """
        if app_engine_version is not None:
            pulumi.set(__self__, "app_engine_version", app_engine_version)
        if cloud_function is not None:
            pulumi.set(__self__, "cloud_function", cloud_function)
        if cloud_run_revision is not None:
            pulumi.set(__self__, "cloud_run_revision", cloud_run_revision)
        if cloud_sql_instance is not None:
            pulumi.set(__self__, "cloud_sql_instance", cloud_sql_instance)
        if gke_master_cluster is not None:
            pulumi.set(__self__, "gke_master_cluster", gke_master_cluster)
        if instance is not None:
            pulumi.set(__self__, "instance", instance)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if network_type is not None:
            pulumi.set(__self__, "network_type", network_type)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="appEngineVersion")
    def app_engine_version(self) -> Optional['outputs.ConnectivityTestSourceAppEngineVersion']:
        """
        An App Engine service version.
        Structure is documented below.
        """
        return pulumi.get(self, "app_engine_version")

    @property
    @pulumi.getter(name="cloudFunction")
    def cloud_function(self) -> Optional['outputs.ConnectivityTestSourceCloudFunction']:
        """
        A Cloud Function.
        Structure is documented below.
        """
        return pulumi.get(self, "cloud_function")

    @property
    @pulumi.getter(name="cloudRunRevision")
    def cloud_run_revision(self) -> Optional['outputs.ConnectivityTestSourceCloudRunRevision']:
        """
        A Cloud Run revision.
        Structure is documented below.
        """
        return pulumi.get(self, "cloud_run_revision")

    @property
    @pulumi.getter(name="cloudSqlInstance")
    def cloud_sql_instance(self) -> Optional[str]:
        """
        A Cloud SQL instance URI.
        """
        return pulumi.get(self, "cloud_sql_instance")

    @property
    @pulumi.getter(name="gkeMasterCluster")
    def gke_master_cluster(self) -> Optional[str]:
        """
        A cluster URI for Google Kubernetes Engine cluster control plane.
        """
        return pulumi.get(self, "gke_master_cluster")

    @property
    @pulumi.getter
    def instance(self) -> Optional[str]:
        """
        A Compute Engine instance URI.
        """
        return pulumi.get(self, "instance")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[str]:
        """
        The IP address of the endpoint, which can be an external or internal IP.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def network(self) -> Optional[str]:
        """
        A VPC network URI.
        """
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[str]:
        """
        Type of the network where the endpoint is located.
        Possible values are: `GCP_NETWORK`, `NON_GCP_NETWORK`.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The IP protocol port of the endpoint. Only applicable when protocol is
        TCP or UDP.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Project ID where the endpoint is located.
        The project ID can be derived from the URI if you provide a endpoint or
        network URI.
        The following are two cases where you may need to provide the project ID:
        1. Only the IP address is specified, and the IP address is within a Google
        Cloud project.
        2. When you are using Shared VPC and the IP address that you provide is
        from the service project. In this case, the network that the IP address
        resides in is defined in the host project.
        """
        return pulumi.get(self, "project_id")


@pulumi.output_type
class ConnectivityTestSourceAppEngineVersion(dict):
    def __init__(__self__, *,
                 uri: Optional[str] = None):
        """
        :param str uri: An App Engine service version name.
        """
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[str]:
        """
        An App Engine service version name.
        """
        return pulumi.get(self, "uri")


@pulumi.output_type
class ConnectivityTestSourceCloudFunction(dict):
    def __init__(__self__, *,
                 uri: Optional[str] = None):
        """
        :param str uri: A Cloud Function name.
        """
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[str]:
        """
        A Cloud Function name.
        """
        return pulumi.get(self, "uri")


@pulumi.output_type
class ConnectivityTestSourceCloudRunRevision(dict):
    def __init__(__self__, *,
                 uri: Optional[str] = None):
        """
        :param str uri: A Cloud Run revision URI.
        """
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[str]:
        """
        A Cloud Run revision URI.
        """
        return pulumi.get(self, "uri")


