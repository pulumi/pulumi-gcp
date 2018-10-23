// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/terraform-providers/terraform-provider-google/google"

	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
)

// all of the Google Cloud Platform token components used below.
const (
	// packages:
	gcpPackage = "gcp"
	// modules; in general, we took naming inspiration from the Google Cloud SDK for Go:
	// https://github.com/GoogleCloudPlatform/google-cloud-go
	gcpAppEngine           = "appengine"           // AppEngine resources
	gcpBigQuery            = "bigquery"            // BigQuery resources
	gcpBigTable            = "bigtable"            // BitTable resources
	gcpBinaryAuthorization = "binaryauthorization" // Binary Authorization resources
	gcpCloudBuild          = "cloudbuild"          // CloudBuild resources
	gcpCloudFunctions      = "cloudfunctions"      // CloudFunction resources
	gcpComposer            = "composer"            // Cloud Composer resources
	gcpContainerAnalysis   = "containeranalysis"   // Container Analysis resources
	gcpCore                = "core"
	gcpFolder              = "folder"          // Folder resources
	gcpOrganization        = "organizations"   // Organization resources
	gcpProject             = "projects"        // Project resources
	gcpServiceAccount      = "serviceAccount"  // Service Account resources
	gcpCompute             = "compute"         // Compute resoures
	gcpKubernetes          = "container"       // Kubernetes Engine resources
	gcpDataFolow           = "dataflow"        // DataFlow resources
	gcpDataProc            = "dataproc"        // DataProc resources
	gcpDNS                 = "dns"             // DNS resources
	gcpEndPoints           = "endpoints"       // End Point resources
	gcpFilestore           = "filestore"       // Filestore resources
	gcpMonitoring          = "monitoring"      // Monitoring resources
	gcpPubSub              = "pubsub"          // PubSub resources
	gcpRedis               = "redis"           // Redis resources
	gcpResourceManager     = "resourcemanager" // Resource Manager resources
	gcpRuntimeConfig       = "runtimeconfig"   // Runtime Config resources
	gcpSourceRepo          = "sourcerepo"      // Source Repo resources
	gcpSpanner             = "spanner"         // Spanner Resources
	gcpSQL                 = "sql"             // SQL resources
	gcpLogging             = "logging"         // Logging resources
	gcpStorage             = "storage"         // Storage resources
	gcpKMS                 = "kms"             // KMS resources
	gcpCloudIoT            = "iot"             // CloudIoT resources
)

// gcpMember manufactures a type token for the GCP package and the given module and type.
func gcpMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(gcpPackage + ":" + mod + ":" + mem)
}

// gcpType manufactures a type token for the GCP package and the given module and type.
func gcpType(mod string, typ string) tokens.Type {
	return tokens.Type(gcpMember(mod, typ))
}

// gcpDataSource manufactures a standard resource token given a module and resource name.  It automatically uses the Azure
// package and names the file by simply lower casing the data source's first character.
func gcpDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return gcpMember(mod+"/"+fn, res)
}

// gcpResource manufactures a standard resource token given a module and resource name.  It automatically uses the Azure
// package and names the file by simply lower casing the resource's first character.
func gcpResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return gcpType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the gcp package.
func Provider() tfbridge.ProviderInfo {
	p := google.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "google",
		Description: "A Pulumi package for creating and managing Google Cloud Platform resources.",
		Keywords:    []string{"pulumi", "gcp"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-gcp",
		Config: map[string]*tfbridge.SchemaInfo{
			"credentials": &tfbridge.SchemaInfo{
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_CREDENTIALS",
						"GOOGLE_CLOUD_KEYFILE_JSON",
						"GCLOUD_KEYFILE_JSON",
					},
				},
			},
			"project": &tfbridge.SchemaInfo{
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_PROJECT",
						"GOOGLE_CLOUD_PROJECT",
						"GCLOUD_PROJECT",
						"CLOUDSDK_CORE_PROJECT",
					},
				},
			},
			"region": &tfbridge.SchemaInfo{
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_REGION",
						"GCLOUD_REGION",
						"CLOUDSDK_COMPUTE_REGION",
					},
				},
			},
			"zone": &tfbridge.SchemaInfo{
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_ZONE",
						"GCLOUD_ZONE",
						"CLOUDSDK_COMPUTE_ZONE",
					},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// AppEngine
			"google_app_engine_application": {Tok: gcpResource(gcpAppEngine, "Application")},
			// BigQuery
			"google_bigquery_dataset": {Tok: gcpResource(gcpBigQuery, "Dataset")},
			"google_bigquery_table":   {Tok: gcpResource(gcpBigQuery, "Table")},

			// BigTable
			"google_bigtable_instance": {Tok: gcpResource(gcpBigTable, "Instance")},
			"google_bigtable_table":    {Tok: gcpResource(gcpBigTable, "Table")},

			// Binary Authorization
			"google_binary_authorization_attestor": {
				Tok: gcpResource(gcpBinaryAuthorization, "Attestor"),
				Docs: &tfbridge.DocInfo{
					Source: "binaryauthorization_attestor.html.markdown",
				},
			},
			"google_binary_authorization_policy": {
				Tok: gcpResource(gcpBinaryAuthorization, "Policy"),
				Docs: &tfbridge.DocInfo{
					Source: "binaryauthorization_policy.html.markdown",
				},
			},

			// Cloud Build
			"google_cloudbuild_trigger": {Tok: gcpResource(gcpCloudBuild, "Trigger")},

			// Cloud Functions
			"google_cloudfunctions_function": {Tok: gcpResource(gcpCloudFunctions, "Function")},

			// Composer
			"google_composer_environment": {Tok: gcpResource(gcpComposer, "Environment")},

			// Core functions
			"google_folder": {
				Tok: gcpResource(gcpOrganization, "Folder"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder.html.markdown",
				},
			},
			"google_folder_iam_binding": {
				Tok: gcpResource(gcpFolder, "IAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam_binding.html.markdown",
				},
			},
			"google_folder_iam_member": {
				Tok: gcpResource(gcpFolder, "IAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam_member.html.markdown",
				},
			},
			"google_folder_iam_policy": {
				Tok: gcpResource(gcpFolder, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam_policy.html.markdown",
				},
			},
			"google_folder_organization_policy": {
				Tok: gcpResource(gcpFolder, "OrganizationPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_organization_policy.html.markdown",
				},
			},
			"google_organization_policy": {
				Tok: gcpResource(gcpOrganization, "Policy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_policy.html.markdown",
				},
			},
			"google_organization_iam_binding": {
				Tok: gcpResource(gcpOrganization, "IAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam_binding.md",
				},
			},
			"google_organization_iam_custom_role": {
				Tok: gcpResource(gcpOrganization, "IAMCustomRole"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam_custom_role.html.markdown",
				},
			},
			"google_organization_iam_member": {
				Tok: gcpResource(gcpOrganization, "IAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam_member.md",
				},
			},
			"google_organization_iam_policy": {
				Tok: gcpResource(gcpOrganization, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam_policy.md",
				},
			},
			"google_project": {
				Tok: gcpResource(gcpOrganization, "Project"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project.html.markdown",
				},
			},
			"google_project_iam_binding": {
				Tok: gcpResource(gcpProject, "IAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_iam.html.markdown",
				},
			},
			"google_project_iam_custom_role": {
				Tok: gcpResource(gcpProject, "IAMCustomRole"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_iam_custom_role.html.markdown",
				},
			},
			"google_project_iam_member": {
				Tok: gcpResource(gcpProject, "IAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_iam.html.markdown",
				},
			},
			"google_project_iam_policy": {
				Tok: gcpResource(gcpProject, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_iam.html.markdown",
				},
			},
			"google_project_organization_policy": {
				Tok: gcpResource(gcpProject, "OrganizationPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_organization_policy.html.markdown",
				},
			},
			"google_project_service": {
				Tok: gcpResource(gcpProject, "Service"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_service.html.markdown",
				},
			},
			"google_project_services": {
				Tok: gcpResource(gcpProject, "Services"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_services.html.markdown",
				},
			},
			"google_project_usage_export_bucket": {
				Tok: gcpResource(gcpProject, "UsageExportBucket"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project.html.markdown",
				},
			},
			"google_service_account": {
				Tok: gcpResource(gcpServiceAccount, "Account"),
				Docs: &tfbridge.DocInfo{
					Source: "google_service_account.html.markdown",
				},
			},
			"google_service_account_iam_binding": {
				Tok: gcpResource(gcpServiceAccount, "IAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_service_account_iam.html.markdown",
				},
			},
			"google_service_account_iam_member": {
				Tok: gcpResource(gcpServiceAccount, "IAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_service_account_iam.html.markdown",
				},
			},
			"google_service_account_iam_policy": {
				Tok: gcpResource(gcpServiceAccount, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_service_account_iam.html.markdown",
				},
			},
			"google_service_account_key": {
				Tok: gcpResource(gcpServiceAccount, "Key"),
				Docs: &tfbridge.DocInfo{
					Source: "google_service_account_key.html.markdown",
				},
			},

			// Compute
			"google_compute_address": {
				Tok: gcpResource(gcpCompute, "Address"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_address.html.markdown",
				},
			},
			"google_compute_attached_disk": {
				Tok: gcpResource(gcpCompute, "AttachedDisk"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_attached_disk.html.markdown",
				},
			},
			"google_compute_autoscaler": {
				Tok: gcpResource(gcpCompute, "Autoscalar"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_autoscaler.html.markdown",
				},
			},
			"google_compute_backend_bucket": {
				Tok: gcpResource(gcpCompute, "BackendBucket"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket.html.markdown",
				},
			},
			"google_compute_backend_service": {
				Tok: gcpResource(gcpCompute, "BackendService"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service.html.markdown",
				},
			},
			"google_compute_disk":                          {Tok: gcpResource(gcpCompute, "Disk")},
			"google_compute_firewall":                      {Tok: gcpResource(gcpCompute, "Firewall")},
			"google_compute_forwarding_rule":               {Tok: gcpResource(gcpCompute, "ForwardingRule")},
			"google_compute_global_address":                {Tok: gcpResource(gcpCompute, "GlobalAddress")},
			"google_compute_global_forwarding_rule":        {Tok: gcpResource(gcpCompute, "GlobalForwardingRule")},
			"google_compute_health_check":                  {Tok: gcpResource(gcpCompute, "HealthCheck")},
			"google_compute_http_health_check":             {Tok: gcpResource(gcpCompute, "HttpHealthCheck")},
			"google_compute_https_health_check":            {Tok: gcpResource(gcpCompute, "HttpsHealthCheck")},
			"google_compute_image":                         {Tok: gcpResource(gcpCompute, "Image")},
			"google_compute_instance":                      {Tok: gcpResource(gcpCompute, "Instance")},
			"google_compute_instance_from_template":        {Tok: gcpResource(gcpCompute, "InstanceFromTemplate")},
			"google_compute_instance_group":                {Tok: gcpResource(gcpCompute, "InstanceGroup")},
			"google_compute_instance_group_manager":        {Tok: gcpResource(gcpCompute, "InstanceGroupManager")},
			"google_compute_instance_template":             {Tok: gcpResource(gcpCompute, "InstanceTemplate")},
			"google_compute_interconnect_attachment":       {Tok: gcpResource(gcpCompute, "InterconnectAttachment")},
			"google_compute_network_peering":               {Tok: gcpResource(gcpCompute, "NetworkPeering")},
			"google_compute_network":                       {Tok: gcpResource(gcpCompute, "Network")},
			"google_compute_project_metadata":              {Tok: gcpResource(gcpCompute, "ProjectMetadata")},
			"google_compute_project_metadata_item":         {Tok: gcpResource(gcpCompute, "ProjectMetadataItem")},
			"google_compute_region_autoscaler":             {Tok: gcpResource(gcpCompute, "RegionAutoscaler")},
			"google_compute_region_backend_service":        {Tok: gcpResource(gcpCompute, "RegionBackendService")},
			"google_compute_region_disk":                   {Tok: gcpResource(gcpCompute, "RegionDisk")},
			"google_compute_region_instance_group_manager": {Tok: gcpResource(gcpCompute, "RegionInstanceGroupManager")},
			"google_compute_route":                         {Tok: gcpResource(gcpCompute, "Route")},
			"google_compute_router":                        {Tok: gcpResource(gcpCompute, "Router")},
			"google_compute_router_interface":              {Tok: gcpResource(gcpCompute, "RouterInterface")},
			"google_compute_router_peer":                   {Tok: gcpResource(gcpCompute, "RouterPeer")},
			"google_compute_security_policy":               {Tok: gcpResource(gcpCompute, "SecurityPolicy")},
			"google_compute_shared_vpc_host_project":       {Tok: gcpResource(gcpCompute, "SharedVPCHostProject")},
			"google_compute_shared_vpc_service_project":    {Tok: gcpResource(gcpCompute, "SharedVPCServiceProject")},
			"google_compute_snapshot":                      {Tok: gcpResource(gcpCompute, "Snapshot")},
			"google_compute_ssl_certificate":               {Tok: gcpResource(gcpCompute, "SSLCertificate")},
			"google_compute_ssl_policy":                    {Tok: gcpResource(gcpCompute, "SSLPolicy")},
			"google_compute_subnetwork":                    {Tok: gcpResource(gcpCompute, "Subnetwork")},
			"google_compute_subnetwork_iam_binding": {
				Tok: gcpResource(gcpCompute, "SubnetworkIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_subnetwork_iam.html.markdown",
				},
			},
			"google_compute_subnetwork_iam_member": {
				Tok: gcpResource(gcpCompute, "SubnetworkIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_subnetwork_iam.html.markdown",
				},
			},
			"google_compute_subnetwork_iam_policy": {
				Tok: gcpResource(gcpCompute, "SubnetworkIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_subnetwork_iam.html.markdown",
				},
			},
			"google_compute_target_http_proxy":  {Tok: gcpResource(gcpCompute, "TargetHttpProxy")},
			"google_compute_target_https_proxy": {Tok: gcpResource(gcpCompute, "TargetHttpsProxy")},
			"google_compute_target_ssl_proxy":   {Tok: gcpResource(gcpCompute, "TargetSSLProxy")},
			"google_compute_target_tcp_proxy":   {Tok: gcpResource(gcpCompute, "TargetTCPProxy")},
			"google_compute_target_pool":        {Tok: gcpResource(gcpCompute, "TargetPool")},
			"google_compute_url_map":            {Tok: gcpResource(gcpCompute, "URLMap")},
			"google_compute_vpn_gateway":        {Tok: gcpResource(gcpCompute, "VPNGateway")},
			"google_compute_vpn_tunnel":         {Tok: gcpResource(gcpCompute, "VPNTunnel")},

			// Container Analysis resources
			"google_container_analysis_note": {
				Tok: gcpResource(gcpContainerAnalysis, "Note"),
				Docs: &tfbridge.DocInfo{
					Source: "containeranalysis_note.html.markdown",
				},
			},

			// Container/Kubernetes resources
			"google_container_cluster":   {Tok: gcpResource(gcpKubernetes, "Cluster")},
			"google_container_node_pool": {Tok: gcpResource(gcpKubernetes, "NodePool")},

			// Data Flow resources
			"google_dataflow_job": {Tok: gcpResource(gcpDataFolow, "Job")},

			// Data Proc resources
			"google_dataproc_cluster": {Tok: gcpResource(gcpDataProc, "Cluster")},
			"google_dataproc_job":     {Tok: gcpResource(gcpDataProc, "Job")},

			// DNS resources
			"google_dns_managed_zone": {Tok: gcpResource(gcpDNS, "ManagedZone")},
			"google_dns_record_set":   {Tok: gcpResource(gcpDNS, "RecordSet")},

			// EndPoints resources
			"google_endpoints_service": {Tok: gcpResource(gcpEndPoints, "Service")},

			// Filestore resources
			"google_filestore_instance": {Tok: gcpResource(gcpFilestore, "Instance")},

			// Monitoring resources
			"google_monitoring_alert_policy": {Tok: gcpResource(gcpMonitoring, "AlertPolicy")},

			// PubSub resources
			"google_pubsub_topic": {Tok: gcpResource(gcpPubSub, "Topic")},
			"google_pubsub_topic_iam_binding": {
				Tok: gcpResource(gcpPubSub, "TopicIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},
			"google_pubsub_topic_iam_member": {
				Tok: gcpResource(gcpPubSub, "TopicIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},
			"google_pubsub_topic_iam_policy": {
				Tok: gcpResource(gcpPubSub, "TopicIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},
			"google_pubsub_subscription": {Tok: gcpResource(gcpPubSub, "Subscription")},
			"google_pubsub_subscription_iam_binding": {
				Tok: gcpResource(gcpPubSub, "SubscriptionIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_subscription_iam.html.markdown",
				},
			},
			"google_pubsub_subscription_iam_member": {
				Tok: gcpResource(gcpPubSub, "SubscriptionIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_subscription_iam.html.markdown",
				},
			},
			"google_pubsub_subscription_iam_policy": {
				Tok: gcpResource(gcpPubSub, "SubscriptionIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_subscription_iam.html.markdown",
				},
			},

			// Redis resources
			"google_redis_instance": {Tok: gcpResource(gcpRedis, "Instance")},

			// Resource Manager resources
			"google_resource_manager_lien": {Tok: gcpResource(gcpResourceManager, "Lien"),
				Docs: &tfbridge.DocInfo{
					Source: "resourcemanager_lien.html.markdown",
				},
			},

			// Runtime Config resources
			"google_runtimeconfig_config":   {Tok: gcpResource(gcpRuntimeConfig, "Config")},
			"google_runtimeconfig_variable": {Tok: gcpResource(gcpRuntimeConfig, "Variavble")},

			// Source Repository resources
			"google_sourcerepo_repository": {Tok: gcpResource(gcpSourceRepo, "Repository")},

			// Spanner resources
			"google_spanner_database": {Tok: gcpResource(gcpSpanner, "Database")},
			"google_spanner_database_iam_binding": {
				Tok: gcpResource(gcpSpanner, "DatabaseIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_database_iam.html.markdown",
				},
			},
			"google_spanner_database_iam_member": {
				Tok: gcpResource(gcpSpanner, "DatabaseIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_database_iam.html.markdown",
				},
			},
			"google_spanner_database_iam_policy": {
				Tok: gcpResource(gcpSpanner, "DatabaseIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_database_iam.html.markdown",
				},
			},
			"google_spanner_instance": {Tok: gcpResource(gcpSpanner, "Instance")},
			"google_spanner_instance_iam_binding": {
				Tok: gcpResource(gcpSpanner, "InstanceIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_instance_iam.html.markdown",
				},
			},
			"google_spanner_instance_iam_member": {
				Tok: gcpResource(gcpSpanner, "InstanceIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_instance_iam.html.markdown",
				},
			},
			"google_spanner_instance_iam_policy": {
				Tok: gcpResource(gcpSpanner, "InstanceIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "spanner_instance_iam.html.markdown",
				},
			},

			// SQL resources
			"google_sql_database":          {Tok: gcpResource(gcpSQL, "Database")},
			"google_sql_database_instance": {Tok: gcpResource(gcpSQL, "DatabaseInstance")},
			"google_sql_user":              {Tok: gcpResource(gcpSQL, "User")},

			// Stackdriver Logging resources
			"google_logging_billing_account_exclusion": {Tok: gcpResource(gcpLogging, "BillingAccountExclusion")},
			"google_logging_billing_account_sink":      {Tok: gcpResource(gcpLogging, "BillingAccountSink")},
			"google_logging_folder_exclusion":          {Tok: gcpResource(gcpLogging, "FolderExclusion")},
			"google_logging_folder_sink":               {Tok: gcpResource(gcpLogging, "FolderSink")},
			"google_logging_organization_exclusion":    {Tok: gcpResource(gcpLogging, "OrganizationExclusion")},
			"google_logging_organization_sink":         {Tok: gcpResource(gcpLogging, "OrganizationSink")},
			"google_logging_project_exclusion":         {Tok: gcpResource(gcpLogging, "ProjectExclusion")},
			"google_logging_project_sink":              {Tok: gcpResource(gcpLogging, "ProjectSink")},

			// Storage resources
			"google_storage_bucket":     {Tok: gcpResource(gcpStorage, "Bucket")},
			"google_storage_bucket_acl": {Tok: gcpResource(gcpStorage, "BucketACL")},
			"google_storage_bucket_iam_binding": {
				Tok: gcpResource(gcpStorage, "BucketIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "storage_bucket_iam.html.markdown",
				},
			},
			"google_storage_bucket_iam_member": {
				Tok: gcpResource(gcpStorage, "BucketIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "storage_bucket_iam.html.markdown",
				},
			},
			"google_storage_bucket_iam_policy": {
				Tok: gcpResource(gcpStorage, "BucketIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "storage_bucket_iam.html.markdown",
				},
			},
			"google_storage_bucket_object": {
				Tok: gcpResource(gcpStorage, "BucketObject"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"source": {
						// TODO[pulumi/pulum#280] This property sould be mapped as accepting an Asset, not an Archive,
						// but we do the later for now so that users can programattically construct archives to upload.
						Asset: &tfbridge.AssetTranslation{
							Kind:   tfbridge.FileArchive,
							Format: resource.ZIPArchive,
						},
					},
				},
			},
			"google_storage_default_object_acl": {Tok: gcpResource(gcpStorage, "DefaultObjectACL")},
			"google_storage_notification":       {Tok: gcpResource(gcpStorage, "Notification")},
			"google_storage_object_acl":         {Tok: gcpResource(gcpStorage, "ObjectACL")},

			// Key Management Service resources
			"google_kms_key_ring": {
				Tok: gcpResource(gcpKMS, "KeyRing"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_key_ring.html.markdown",
				},
			},
			"google_kms_key_ring_iam_binding": {
				Tok: gcpResource(gcpKMS, "KeyRingIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_key_ring_iam.html.markdown",
				},
			},
			"google_kms_key_ring_iam_member": {
				Tok: gcpResource(gcpKMS, "KeyRingIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_key_ring_iam.html.markdown",
				},
			},
			"google_kms_key_ring_iam_policy": {
				Tok: gcpResource(gcpKMS, "KeyRingIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_key_ring_iam.html.markdown",
				},
			},
			"google_kms_crypto_key": {
				Tok: gcpResource(gcpKMS, "CryptoKey"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key.html.markdown",
				},
			},
			"google_kms_crypto_key_iam_binding": {
				Tok: gcpResource(gcpKMS, "CryptoKeyIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_iam_binding.html.markdown",
				},
			},
			"google_kms_crypto_key_iam_member": {
				Tok: gcpResource(gcpKMS, "CryptoKeyIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_iam_member.html.markdown",
				},
			},

			// Cloud IoT Core resources
			"google_cloudiot_registry": {Tok: gcpResource(gcpKMS, "Registry")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{

			"google_billing_account": {
				Tok: gcpDataSource(gcpOrganization, "getBillingAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "google_billing_account.html.markdown",
				},
			},
			"google_client_config": {
				Tok: gcpDataSource(gcpOrganization, "getClientConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_client_config.html.markdown",
				},
			},
			"google_cloudfunctions_function": {
				Tok: gcpDataSource(gcpCloudFunctions, "getFunction"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_cloudfunctions_function.html.markdown",
				},
			},
			"google_compute_address": {
				Tok: gcpDataSource(gcpCompute, "getAddress"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_address.html.markdown",
				},
			},
			"google_compute_default_service_account": {
				Tok: gcpDataSource(gcpCompute, "getDefaultServiceAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "google_compute_default_service_account.html.markdown",
				},
			},
			"google_compute_backend_service": {
				Tok: gcpDataSource(gcpCompute, "getBackendService"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_compute_backend_service.html.markdown",
				},
			},
			"google_compute_image": {
				Tok: gcpDataSource(gcpCompute, "getImage"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_image.html.markdown",
				},
			},
			"google_compute_instance": {
				Tok: gcpDataSource(gcpCompute, "getInstance"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_instance.html.markdown",
				},
			},
			"google_compute_forwarding_rule": {
				Tok: gcpDataSource(gcpCompute, "getForwardingRule"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_forwarding_rule.html.markdown",
				},
			},
			"google_compute_global_address": {
				Tok: gcpDataSource(gcpCompute, "getGlobalAddress"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_global_address.html.markdown",
				},
			},
			"google_compute_network": {
				Tok: gcpDataSource(gcpCompute, "getNetwork"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_network.html.markdown",
				},
			},
			"google_netblock_ip_ranges": {
				Tok: gcpDataSource(gcpCompute, "getNetblockIPRanges"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_netblock_ip_ranges.html.markdown",
				},
			},
			"google_project": {
				Tok: gcpDataSource(gcpOrganization, "getProject"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project.html.markdown",
				},
			},
			"google_project_services": {
				Tok: gcpDataSource(gcpOrganization, "getProjectServices"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_services.html.markdown",
				},
			},
			"google_compute_subnetwork": {
				Tok: gcpDataSource(gcpCompute, "getSubnetwork"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_subnetwork.html.markdown",
				},
			},
			"google_compute_vpn_gateway": {
				Tok: gcpDataSource(gcpCompute, "getVPNGateway"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_vpn_gateway.html.markdown",
				},
			},
			"google_compute_zones": {
				Tok: gcpDataSource(gcpCompute, "getZones"),
				Docs: &tfbridge.DocInfo{
					Source: "google_compute_zones.html.markdown",
				},
			},
			"google_compute_regions": {
				Tok: gcpDataSource(gcpCompute, "getRegions"),
				Docs: &tfbridge.DocInfo{
					Source: "google_compute_regions.html.markdown",
				},
			},
			"google_compute_ssl_policy": {
				Tok: gcpDataSource(gcpCompute, "getSSLPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_ssl_policy.html.markdown",
				},
			},
			"google_compute_region_instance_group": {
				Tok: gcpDataSource(gcpCompute, "getRegionInstanceGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_region_instance_group.html.markdown",
				},
			},
			"google_compute_instance_group": {
				Tok: gcpDataSource(gcpCompute, "getInstanceGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "google_compute_instance_group.html.markdown",
				},
			},
			"google_compute_lb_ip_ranges": {
				Tok: gcpDataSource(gcpCompute, "getLBIPRanges"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_lb_ip_ranges.html.markdown",
				},
			},
			"google_container_cluster": {
				Tok: gcpDataSource(gcpKubernetes, "getCluster"),
				Docs: &tfbridge.DocInfo{
					Source: "google_container_cluster.html.markdown",
				},
			},
			"google_container_engine_versions": {
				Tok: gcpDataSource(gcpKubernetes, "getEngineVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "google_container_engine_versions.html.markdown",
				},
			},
			"google_container_registry_repository": {
				Tok: gcpDataSource(gcpKubernetes, "getRegistryRepository"),
				Docs: &tfbridge.DocInfo{
					Source: "google_container_registry_repository.html.markdown",
				},
			},
			"google_container_registry_image": {
				Tok: gcpDataSource(gcpKubernetes, "getRegistryImage"),
				Docs: &tfbridge.DocInfo{
					Source: "google_container_registry_repository.html.markdown",
				},
			},
			"google_dns_managed_zone": {
				Tok: gcpDataSource(gcpDNS, "getManagedZone"),
				Docs: &tfbridge.DocInfo{
					Source: "dns_managed_zone.html.markdown",
				},
			},
			"google_active_folder": {
				Tok: gcpDataSource(gcpOrganization, "getActiveFolder"),
				Docs: &tfbridge.DocInfo{
					Source: "google_active_folder.html.markdown",
				},
			},
			"google_folder": {
				Tok: gcpDataSource(gcpOrganization, "getFolder"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder.html.markdown",
				},
			},
			"google_iam_policy": {
				Tok: gcpDataSource(gcpOrganization, "getIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_iam_policy.html.markdown",
				},
			},
			"google_kms_secret": {
				Tok: gcpDataSource(gcpKMS, "getKMSSecret"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_secret.html.markdown",
				},
			},
			"google_organization": {
				Tok: gcpDataSource(gcpOrganization, "getOrganization"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization.html.markdown",
				},
			},
			"google_storage_object_signed_url": {
				Tok: gcpDataSource(gcpStorage, "getObjectSignedUrl"),
				Docs: &tfbridge.DocInfo{
					Source: "signed_url.html.markdown",
				},
			},
			"google_storage_project_service_account": {
				Tok: gcpDataSource(gcpStorage, "getProjectServiceAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "google_storage_project_service_account.html.markdown",
				},
			},
			"google_service_account": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account.html.markdown",
				},
			},
			"google_service_account_key": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccountKey"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account_key.html.markdown",
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^0.15.1",
				"read-package-json": "^2.0.13",
				"@types/express":    "^4.16.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			Overlay: &tfbridge.OverlayInfo{
				Modules: map[string]*tfbridge.OverlayInfo{
					"serverless": {
						Files: []string{
							"function.ts", // a serverless function that works with language closures.
						},
					},
				},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=0.15.1,<0.16.0",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const gcpName = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[gcpName]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[gcpName]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					// Use conservative options that apply broadly for Google Cloud Platform.  See
					// details.
					res.Fields[gcpName] = tfbridge.AutoName(gcpName, 255)
				}
			}
		}
	}

	return prov
}
