// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	google "github.com/terraform-providers/terraform-provider-google-beta/google-beta"

	"github.com/pulumi/pulumi-terraform-bridge/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
)

// all of the Google Cloud Platform token components used below.
const (
	// packages:
	gcpPackage = "gcp"
	// modules; in general, we took naming inspiration from the Google Cloud SDK for Go:
	// https://github.com/GoogleCloudPlatform/google-cloud-go
	gcpAccessContextManager = "accesscontextmanager" // Access Context Manager resources
	gcpAppEngine            = "appengine"            // AppEngine resources
	gcpBigQuery             = "bigquery"             // BigQuery resources
	gcpBigTable             = "bigtable"             // BitTable resources
	gcpBilling              = "billing"              // Billing resources
	gcpBinaryAuthorization  = "binaryauthorization"  // Binary Authorization resources
	gcpCloudBuild           = "cloudbuild"           // CloudBuild resources
	gcpCloudFunctions       = "cloudfunctions"       // CloudFunction resources
	gcpCloudRun             = "cloudrun"             // CloudRun resources
	gcpCloudScheduler       = "cloudscheduler"       // Cloud Scheduler resources
	gcpComposer             = "composer"             // Cloud Composer resources
	gcpCompute              = "compute"              // Compute resoures
	gcpContainerAnalysis    = "containeranalysis"    // Container Analysis resources
	gcpDNS                  = "dns"                  // DNS resources
	gcpDataFolow            = "dataflow"             // DataFlow resources
	gcpDataProc             = "dataproc"             // DataProc resources
	gcpEndPoints            = "endpoints"            // End Point resources
	gcpFilestore            = "filestore"            // Filestore resources
	gcpFirestore            = "firestore"            // Firestore resources
	gcpFolder               = "folder"               // Folder resources
	gcpHealthcare           = "healthcare"           // Healthcare resources
	gcpIAM                  = "iam"                  // IAM resources
	gcpIAP                  = "iap"                  // IAP resources
	gcpKMS                  = "kms"                  // KMS resources
	gcpKubernetes           = "container"            // Kubernetes Engine resources
	gcpLogging              = "logging"              // Logging resources
	gcpMachingLearning      = "ml"                   // Machine Learning
	gcpMonitoring           = "monitoring"           // Monitoring resources
	gcpOrganization         = "organizations"        // Organization resources
	gcpProject              = "projects"             // Project resources
	gcpPubSub               = "pubsub"               // PubSub resources
	gcpRedis                = "redis"                // Redis resources
	gcpResourceManager      = "resourcemanager"      // Resource Manager resources
	gcpRuntimeConfig        = "runtimeconfig"        // Runtime Config resources
	gcpServiceNetworking    = "servicenetworking"    // Service Networking resources
	gcpSecurityCenter       = "securitycenter"       // Security Center
	gcpSQL                  = "sql"                  // SQL resources
	gcpServiceAccount       = "serviceAccount"       // Service Account resources
	gcpSourceRepo           = "sourcerepo"           // Source Repo resources
	gcpSpanner              = "spanner"              // Spanner Resources
	gcpStorage              = "storage"              // Storage rfesources
	gcpTPU                  = "tpu"                  // Tensor Processing Units
	gcpVpcAccess            = "vpcaccess"            // VPC Access
)

// gcpMember manufactures a type token for the GCP package and the given module and type.
func gcpMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(gcpPackage + ":" + mod + ":" + mem)
}

// gcpType manufactures a type token for the GCP package and the given module and type.
func gcpType(mod string, typ string) tokens.Type {
	return tokens.Type(gcpMember(mod, typ))
}

// gcpDataSource manufactures a standard resource token given a module and resource name.  It automatically uses the GCP
// package and names the file by simply lower casing the data source's first character.
func gcpDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return gcpMember(mod+"/"+fn, res)
}

// gcpResource manufactures a standard resource token given a module and resource name.  It automatically uses the GCP
// package and names the file by simply lower casing the resource's first character.
func gcpResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return gcpType(mod+"/"+fn, res)
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

// Provider returns additional overlaid schema and metadata associated with the gcp package.
func Provider() tfbridge.ProviderInfo {
	p := google.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:              p,
		Name:           "google-beta",
		ResourcePrefix: "google",
		Description:    "A Pulumi package for creating and managing Google Cloud Platform resources.",
		Keywords:       []string{"pulumi", "gcp"},
		License:        "Apache-2.0",
		Homepage:       "https://pulumi.io",
		Repository:     "https://github.com/pulumi/pulumi-gcp",
		Config: map[string]*tfbridge.SchemaInfo{
			"credentials": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_CREDENTIALS",
						"GOOGLE_CLOUD_KEYFILE_JSON",
						"GCLOUD_KEYFILE_JSON",
					},
				},
			},
			"project": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_PROJECT",
						"GOOGLE_CLOUD_PROJECT",
						"GCLOUD_PROJECT",
						"CLOUDSDK_CORE_PROJECT",
					},
				},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"GOOGLE_REGION",
						"GCLOUD_REGION",
						"CLOUDSDK_COMPUTE_REGION",
					},
				},
			},
			"zone": {
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
			// Access Context Manager
			"google_access_context_manager_access_level":      {Tok: gcpResource(gcpAccessContextManager, "AccessLevel")},
			"google_access_context_manager_access_policy":     {Tok: gcpResource(gcpAccessContextManager, "AccessPolicy")},
			"google_access_context_manager_service_perimeter": {Tok: gcpResource(gcpAccessContextManager, "ServicePerimeter")},

			// AppEngine
			"google_app_engine_application": {Tok: gcpResource(gcpAppEngine, "Application")},
			"google_app_engine_firewall_rule": {
				Tok: gcpResource(gcpAppEngine, "FirewallRule"),
				Docs: &tfbridge.DocInfo{
					Source: "appengine_firewall_rule.html.markdown",
				},
			},
			"google_app_engine_standard_app_version": {Tok: gcpResource(gcpAppEngine, "StandardAppVersion")},
			"google_app_engine_domain_mapping":       {Tok: gcpResource(gcpAppEngine, "DomainMapping")},
			"google_app_engine_application_url_dispatch_rules": {
				Tok: gcpResource(gcpAppEngine, "ApplicationUrlDispatchRules"),
			},

			// BigQuery
			"google_bigquery_dataset":              {Tok: gcpResource(gcpBigQuery, "Dataset")},
			"google_bigquery_table":                {Tok: gcpResource(gcpBigQuery, "Table")},
			"google_bigquery_data_transfer_config": {Tok: gcpResource(gcpBigQuery, "DataTransferConfig")},
			"google_bigtable_app_profile":          {Tok: gcpResource(gcpBigQuery, "AppProfile")},

			// BigTable
			"google_bigtable_instance": {Tok: gcpResource(gcpBigTable, "Instance")},
			"google_bigtable_table":    {Tok: gcpResource(gcpBigTable, "Table")},
			"google_bigtable_instance_iam_binding": {
				Tok: gcpResource(gcpBigTable, "InstanceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_instance_iam.html.markdown",
				},
			},
			"google_bigtable_instance_iam_member": {
				Tok: gcpResource(gcpBigTable, "InstanceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_instance_iam.html.markdown",
				},
			},
			"google_bigtable_instance_iam_policy": {
				Tok: gcpResource(gcpBigTable, "InstanceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_instance_iam.html.markdown",
				},
			},
			"google_bigtable_gc_policy": {
				Tok: gcpResource(gcpBigTable, "GCPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_gc_policy.html.markdown",
				},
			},

			// Billing
			"google_billing_account_iam_binding": {
				Tok: gcpResource(gcpBilling, "AccountIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_billing_account_iam_binding.md",
				},
			},
			"google_billing_account_iam_member": {
				Tok: gcpResource(gcpBilling, "AccountIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_billing_account_iam_member.md",
				},
			},
			"google_billing_account_iam_policy": {
				Tok: gcpResource(gcpBilling, "AccountIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_billing_account_iam_policy.md",
				},
			},

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
			"google_binary_authorization_attestor_iam_binding": {
				Tok: gcpResource(gcpBinaryAuthorization, "AttestorIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "binary_authorization_attestor_iam.html.markdown",
				},
			},
			"google_binary_authorization_attestor_iam_member": {
				Tok: gcpResource(gcpBinaryAuthorization, "AttestorIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "binary_authorization_attestor_iam.html.markdown",
				},
			},
			"google_binary_authorization_attestor_iam_policy": {
				Tok: gcpResource(gcpBinaryAuthorization, "AttestorIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "binary_authorization_attestor_iam.html.markdown",
				},
			},

			// Cloud Build
			"google_cloudbuild_trigger": {
				Tok: gcpResource(gcpCloudBuild, "Trigger"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_build_trigger.html.markdown",
				},
			},

			// Cloud Functions
			"google_cloudfunctions_function": {
				Tok: gcpResource(gcpCloudFunctions, "Function"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Name must start with a letter followed by up to 62 letters, numbers, or
					// hyphens, and cannot end with a hyphen
					"name": tfbridge.AutoName("name", 63),
				},
			},
			"google_cloudfunctions_function_iam_binding": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_cloud_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions_function_iam_member": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_cloud_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions_function_iam_policy": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_cloud_function_iam.html.markdown",
				},
			},

			// Cloud Scheduler
			"google_cloud_scheduler_job": {Tok: gcpResource(gcpCloudScheduler, "Job")},

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
			"google_project_iam_audit_config": {
				Tok: gcpResource(gcpProject, "IAMAuditConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_iam.html.markdown",
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"service": {
						CSharpName: "ServiceName",
					},
				},
			},
			"google_project_services": {
				Tok: gcpResource(gcpProject, "Services"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project_services.html.markdown",
				},
				Fields: map[string]*tfbridge.SchemaInfo{
					"services": {
						CSharpName: "ServiceNames",
					},
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"address": {
						CSharpName: "IPAddress",
					},
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
			"google_compute_backend_bucket_signed_url_key": {
				Tok: gcpResource(gcpCompute, "BackendBucketSignedUrlKey"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket_signed_url_key.html.markdown",
				},
			},
			"google_compute_backend_service": {
				Tok: gcpResource(gcpCompute, "BackendService"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service.html.markdown",
				},
			},
			"google_compute_backend_service_signed_url_key": {
				Tok: gcpResource(gcpCompute, "BackendServiceSignedUrlKey"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service_signed_url_key.html.markdown",
				},
			},
			"google_compute_disk":                   {Tok: gcpResource(gcpCompute, "Disk")},
			"google_compute_firewall":               {Tok: gcpResource(gcpCompute, "Firewall")},
			"google_compute_forwarding_rule":        {Tok: gcpResource(gcpCompute, "ForwardingRule")},
			"google_compute_external_vpn_gateway":   {Tok: gcpResource(gcpCompute, "ExternalVpnGateway")},
			"google_compute_global_address":         {Tok: gcpResource(gcpCompute, "GlobalAddress")},
			"google_compute_global_forwarding_rule": {Tok: gcpResource(gcpCompute, "GlobalForwardingRule")},
			"google_compute_ha_vpn_gateway":         {Tok: gcpResource(gcpCompute, "HaVpnGateway")},
			"google_compute_health_check":           {Tok: gcpResource(gcpCompute, "HealthCheck")},
			"google_compute_http_health_check":      {Tok: gcpResource(gcpCompute, "HttpHealthCheck")},
			"google_compute_https_health_check":     {Tok: gcpResource(gcpCompute, "HttpsHealthCheck")},
			"google_compute_image":                  {Tok: gcpResource(gcpCompute, "Image")},
			"google_compute_instance":               {Tok: gcpResource(gcpCompute, "Instance")},
			"google_compute_instance_from_template": {Tok: gcpResource(gcpCompute, "InstanceFromTemplate")},
			"google_compute_instance_group":         {Tok: gcpResource(gcpCompute, "InstanceGroup")},
			"google_compute_instance_group_manager": {Tok: gcpResource(gcpCompute, "InstanceGroupManager")},
			"google_compute_instance_iam_binding": {
				Tok: gcpResource(gcpCompute, "InstanceIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_instance_iam.html.markdown",
				},
			},
			"google_compute_instance_iam_member": {
				Tok: gcpResource(gcpCompute, "InstanceIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_instance_iam.html.markdown",
				},
			},
			"google_compute_instance_iam_policy": {
				Tok: gcpResource(gcpCompute, "InstanceIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_instance_iam.html.markdown",
				},
			},
			"google_compute_instance_template":       {Tok: gcpResource(gcpCompute, "InstanceTemplate")},
			"google_compute_interconnect_attachment": {Tok: gcpResource(gcpCompute, "InterconnectAttachment")},
			"google_compute_node_group":              {Tok: gcpResource(gcpCompute, "NodeGroup")},
			"google_compute_node_template":           {Tok: gcpResource(gcpCompute, "NodeTemplate")},
			"google_compute_network_endpoint":        {Tok: gcpResource(gcpCompute, "NetworkEndpoint")},
			"google_compute_network_endpoint_group": {
				Tok: gcpResource(gcpCompute, "NetworkEndpointGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_network_endpoint_group.html.markdown",
				},
			},
			"google_compute_network_peering":               {Tok: gcpResource(gcpCompute, "NetworkPeering")},
			"google_compute_network":                       {Tok: gcpResource(gcpCompute, "Network")},
			"google_compute_project_default_network_tier":  {Tok: gcpResource(gcpCompute, "ProjectDefaultNetworkTier")},
			"google_compute_project_metadata":              {Tok: gcpResource(gcpCompute, "ProjectMetadata")},
			"google_compute_project_metadata_item":         {Tok: gcpResource(gcpCompute, "ProjectMetadataItem")},
			"google_compute_region_autoscaler":             {Tok: gcpResource(gcpCompute, "RegionAutoscaler")},
			"google_compute_region_backend_service":        {Tok: gcpResource(gcpCompute, "RegionBackendService")},
			"google_compute_region_disk":                   {Tok: gcpResource(gcpCompute, "RegionDisk")},
			"google_compute_region_instance_group_manager": {Tok: gcpResource(gcpCompute, "RegionInstanceGroupManager")},
			"google_compute_region_ssl_certificate":        {Tok: gcpResource(gcpCompute, "RegionSslCertificate")},
			"google_compute_region_target_http_proxy":      {Tok: gcpResource(gcpCompute, "RegionTargetHttpProxy")},
			"google_compute_region_target_https_proxy":     {Tok: gcpResource(gcpCompute, "RegionTargetHttpsProxy")},
			"google_compute_resource_policy":               {Tok: gcpResource(gcpCompute, "ResourcePolicy")},
			"google_compute_route":                         {Tok: gcpResource(gcpCompute, "Route")},
			"google_compute_router":                        {Tok: gcpResource(gcpCompute, "Router")},
			"google_compute_router_interface":              {Tok: gcpResource(gcpCompute, "RouterInterface")},
			"google_compute_router_nat":                    {Tok: gcpResource(gcpCompute, "RouterNat")},
			"google_compute_router_peer":                   {Tok: gcpResource(gcpCompute, "RouterPeer")},
			"google_compute_security_policy":               {Tok: gcpResource(gcpCompute, "SecurityPolicy")},
			"google_security_scanner_scan_config":          {Tok: gcpResource(gcpCompute, "SecurityScanConfig")},
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
			"google_compute_target_http_proxy":   {Tok: gcpResource(gcpCompute, "TargetHttpProxy")},
			"google_compute_target_https_proxy":  {Tok: gcpResource(gcpCompute, "TargetHttpsProxy")},
			"google_compute_target_instance":     {Tok: gcpResource(gcpCompute, "TargetInstance")},
			"google_compute_target_ssl_proxy":    {Tok: gcpResource(gcpCompute, "TargetSSLProxy")},
			"google_compute_target_tcp_proxy":    {Tok: gcpResource(gcpCompute, "TargetTCPProxy")},
			"google_compute_target_pool":         {Tok: gcpResource(gcpCompute, "TargetPool")},
			"google_compute_url_map":             {Tok: gcpResource(gcpCompute, "URLMap")},
			"google_compute_vpn_gateway":         {Tok: gcpResource(gcpCompute, "VPNGateway")},
			"google_compute_vpn_tunnel":          {Tok: gcpResource(gcpCompute, "VPNTunnel")},
			"google_compute_reservation":         {Tok: gcpResource(gcpCompute, "Reservation")},
			"google_compute_region_health_check": {Tok: gcpResource(gcpCompute, "RegionHealthCheck")},
			"google_compute_region_url_map":      {Tok: gcpResource(gcpCompute, "RegionUrlMap")},
			"google_compute_disk_resource_policy_attachment": {
				Tok: gcpResource(gcpCompute, "DiskResourcePolicyAttachment"),
			},

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
			"google_dataproc_cluster_iam_binding": {
				Tok: gcpResource(gcpDataProc, "ClusterIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_cluster_iam.html.markdown",
				},
			},
			"google_dataproc_cluster_iam_member": {
				Tok: gcpResource(gcpDataProc, "ClusterIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_cluster_iam.html.markdown",
				},
			},
			"google_dataproc_cluster_iam_policy": {
				Tok: gcpResource(gcpDataProc, "ClusterIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_cluster_iam.html.markdown",
				},
			},
			"google_dataproc_job": {Tok: gcpResource(gcpDataProc, "Job")},
			"google_dataproc_job_iam_binding": {
				Tok: gcpResource(gcpDataProc, "JobIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_job_iam.html.markdown",
				},
			},
			"google_dataproc_job_iam_member": {
				Tok: gcpResource(gcpDataProc, "JobIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_job_iam.html.markdown",
				},
			},
			"google_dataproc_job_iam_policy": {
				Tok: gcpResource(gcpDataProc, "JobIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_job_iam.html.markdown",
				},
			},
			"google_dataproc_autoscaling_policy": {Tok: gcpResource(gcpDataProc, "AutoscalingPolicy")},

			// DNS resources
			"google_dns_managed_zone": {
				Tok: gcpResource(gcpDNS, "ManagedZone"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"google_dns_policy":     {Tok: gcpResource(gcpDNS, "Policy")},
			"google_dns_record_set": {Tok: gcpResource(gcpDNS, "RecordSet")},

			// EndPoints resources
			"google_endpoints_service": {Tok: gcpResource(gcpEndPoints, "Service")},

			// Filestore resources
			"google_filestore_instance": {Tok: gcpResource(gcpFilestore, "Instance")},

			// Firestore resources
			"google_firestore_index": {Tok: gcpResource(gcpFirestore, "Index")},

			// Monitoring resources
			"google_monitoring_alert_policy":         {Tok: gcpResource(gcpMonitoring, "AlertPolicy")},
			"google_monitoring_group":                {Tok: gcpResource(gcpMonitoring, "Group")},
			"google_monitoring_notification_channel": {Tok: gcpResource(gcpMonitoring, "NotificationChannel")},
			"google_monitoring_uptime_check_config":  {Tok: gcpResource(gcpMonitoring, "UptimeCheckConfig")},

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
			"google_runtimeconfig_variable": {Tok: gcpResource(gcpRuntimeConfig, "Variable")},
			"google_runtimeconfig_config_iam_binding": {
				Tok: gcpResource(gcpRuntimeConfig, "ConfigIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "runtimeconfig_config_iam.html.markdown",
				},
			},
			"google_runtimeconfig_config_iam_member": {
				Tok: gcpResource(gcpRuntimeConfig, "ConfigIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "runtimeconfig_config_iam.html.markdown",
				},
			},
			"google_runtimeconfig_config_iam_policy": {
				Tok: gcpResource(gcpRuntimeConfig, "ConfigIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "runtimeconfig_config_iam.html.markdown",
				},
			},

			// Service Networking resources
			"google_service_networking_connection": {Tok: gcpResource(gcpServiceNetworking, "Connection")},

			// Source Repository resources
			"google_sourcerepo_repository": {
				Tok: gcpResource(gcpSourceRepo, "Repository"),
				Docs: &tfbridge.DocInfo{
					Source: "source_repo_repository.html.markdown",
				},
			},
			"google_sourcerepo_repository_iam_binding": {
				Tok: gcpResource(gcpSourceRepo, "RepositoryIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},
			"google_sourcerepo_repository_iam_member": {
				Tok: gcpResource(gcpSourceRepo, "RepositoryIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},
			"google_sourcerepo_repository_iam_policy": {
				Tok: gcpResource(gcpSourceRepo, "RepositoryIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_topic_iam.html.markdown",
				},
			},

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
			"google_sql_ssl_cert":          {Tok: gcpResource(gcpSQL, "SslCert")},

			// Stackdriver Logging resources
			"google_logging_billing_account_exclusion": {Tok: gcpResource(gcpLogging, "BillingAccountExclusion")},
			"google_logging_billing_account_sink":      {Tok: gcpResource(gcpLogging, "BillingAccountSink")},
			"google_logging_folder_exclusion":          {Tok: gcpResource(gcpLogging, "FolderExclusion")},
			"google_logging_folder_sink":               {Tok: gcpResource(gcpLogging, "FolderSink")},
			"google_logging_metric":                    {Tok: gcpResource(gcpLogging, "Metric")},
			"google_logging_organization_exclusion":    {Tok: gcpResource(gcpLogging, "OrganizationExclusion")},
			"google_logging_organization_sink":         {Tok: gcpResource(gcpLogging, "OrganizationSink")},
			"google_logging_project_exclusion":         {Tok: gcpResource(gcpLogging, "ProjectExclusion")},
			"google_logging_project_sink":              {Tok: gcpResource(gcpLogging, "ProjectSink")},

			// Storage resources
			"google_storage_bucket": {
				Tok: gcpResource(gcpStorage, "Bucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://cloud.google.com/storage/docs/naming
					// Bucket names must contain 3 to 63 characters. Names containing dots can
					// contain up to 222 characters, but each dot-separated component can be no
					// longer than 63 characters.
					"name": tfbridge.AutoName("name", 222),
				},
			},
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
						Asset: &tfbridge.AssetTranslation{
							Kind:   tfbridge.FileAsset,
							Format: resource.ZIPArchive,
						},
					},
				},
			},
			"google_storage_default_object_access_control": {Tok: gcpResource(gcpStorage, "DefaultObjectAccessControl")},
			"google_storage_default_object_acl":            {Tok: gcpResource(gcpStorage, "DefaultObjectACL")},
			"google_storage_notification":                  {Tok: gcpResource(gcpStorage, "Notification")},
			"google_storage_object_access_control":         {Tok: gcpResource(gcpStorage, "ObjectAccessControl")},
			"google_storage_object_acl":                    {Tok: gcpResource(gcpStorage, "ObjectACL")},
			"google_storage_transfer_job":                  {Tok: gcpResource(gcpStorage, "TransferJob")},
			"google_storage_bucket_access_control":         {Tok: gcpResource(gcpStorage, "BucketAccessControl")},

			// TPU resources
			"google_tpu_node": {Tok: gcpResource(gcpTPU, "Node")},

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
			"google_cloudiot_registry": {
				Tok: gcpResource(gcpKMS, "Registry"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// This property's nested type name conflicts with the nested type of the existing (now deprecated)
					// `event_notification_config` property (singular, a TypeMap). A conflict occurs because the new
					// `event_notification_configs` property (plural, a TypeList) is a TypeList, which we singularize.
					// To avoid the conflict, we override the nested type name for the new property, appending an "Item"
					// suffix.
					"event_notification_configs": {
						Elem: &tfbridge.SchemaInfo{
							NestedType: "RegistryEventNotificationConfigItem",
						},
					},
				},
			},

			// Cloud IAP Resources
			"google_iap_tunnel_instance_iam_binding": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_iap_tunnel_instance_iam.markdown",
				},
			},
			"google_iap_tunnel_instance_iam_member": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_iap_tunnel_instance_iam.markdown",
				},
			},
			"google_iap_tunnel_instance_iam_policy": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_iap_tunnel_instance_iam.markdown",
				},
			},
			"google_iap_web_backend_service_iam_binding": {
				Tok: gcpResource(gcpIAP, "WebBackendServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_backend_service_iam.html.markdown",
				},
			},
			"google_iap_web_backend_service_iam_member": {
				Tok: gcpResource(gcpIAP, "WebBackendServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_backend_service_iam.html.markdown",
				},
			},
			"google_iap_web_backend_service_iam_policy": {
				Tok: gcpResource(gcpIAP, "WebBackendServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_backend_service_iam.html.markdown",
				},
			},
			"google_iap_web_iam_binding": {
				Tok: gcpResource(gcpIAP, "WebIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_iam.html.markdown",
				},
			},
			"google_iap_web_iam_member": {
				Tok: gcpResource(gcpIAP, "WebIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_iam.html.markdown",
				},
			},
			"google_iap_web_iam_policy": {
				Tok: gcpResource(gcpIAP, "WebIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_iam.html.markdown",
				},
			},
			"google_iap_web_type_app_engine_iam_binding": {
				Tok: gcpResource(gcpIAP, "WebTypeAppEngingIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_app_engine_iam.html.markdown",
				},
			},
			"google_iap_web_type_app_engine_iam_member": {
				Tok: gcpResource(gcpIAP, "WebTypeAppEngingIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_app_engine_iam.html.markdown",
				},
			},
			"google_iap_web_type_app_engine_iam_policy": {
				Tok: gcpResource(gcpIAP, "WebTypeAppEngingIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_app_engine_iam.html.markdown",
				},
			},
			"google_iap_web_type_compute_iam_binding": {
				Tok: gcpResource(gcpIAP, "WebTypeComputeIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_compute_iam.html.markdown",
				},
			},
			"google_iap_web_type_compute_iam_member": {
				Tok: gcpResource(gcpIAP, "WebTypeComputeIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_compute_iam.html.markdown",
				},
			},
			"google_iap_web_type_compute_iam_policy": {
				Tok: gcpResource(gcpIAP, "WebTypeComputeIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_type_compute_iam.html.markdown",
				},
			},
			"google_iap_app_engine_service_iam_binding": {
				Tok: gcpResource(gcpIAP, "AppEngineServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_service_iam.html.markdown",
				},
			},
			"google_iap_app_engine_service_iam_member": {
				Tok: gcpResource(gcpIAP, "AppEngineServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_service_iam.html.markdown",
				},
			},
			"google_iap_app_engine_service_iam_policy": {
				Tok: gcpResource(gcpIAP, "AppEngineServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_service_iam.html.markdown",
				},
			},
			"google_iap_app_engine_version_iam_binding": {
				Tok: gcpResource(gcpIAP, "AppEngineVersionIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_version_iam.html.markdown",
				},
			},
			"google_iap_app_engine_version_iam_member": {
				Tok: gcpResource(gcpIAP, "AppEngineVersionIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_version_iam.html.markdown",
				},
			},
			"google_iap_app_engine_version_iam_policy": {
				Tok: gcpResource(gcpIAP, "AppEngineVersionIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_app_engine_version_iam.html.markdown",
				},
			},

			// Healthcare resources
			"google_healthcare_dataset": {
				Tok: gcpResource(gcpHealthcare, "Dataset"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dataset.html.markdown",
				},
			},
			"google_healthcare_dataset_iam_binding": {
				Tok: gcpResource(gcpHealthcare, "DatasetIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dataset_iam.html.markdown",
				},
			},
			"google_healthcare_dataset_iam_member": {
				Tok: gcpResource(gcpHealthcare, "DatasetIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dataset_iam.html.markdown",
				},
			},
			"google_healthcare_dataset_iam_policy": {
				Tok: gcpResource(gcpHealthcare, "DatasetIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dataset_iam.html.markdown",
				},
			},
			"google_healthcare_dicom_store": {
				Tok: gcpResource(gcpHealthcare, "DicomStore"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dicom_store.html.markdown",
				},
			},
			"google_healthcare_dicom_store_iam_binding": {
				Tok: gcpResource(gcpHealthcare, "DicomStoreIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dicom_store_iam.html.markdown",
				},
			},
			"google_healthcare_dicom_store_iam_member": {
				Tok: gcpResource(gcpHealthcare, "DicomStoreIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dicom_store_iam.html.markdown",
				},
			},
			"google_healthcare_dicom_store_iam_policy": {
				Tok: gcpResource(gcpHealthcare, "DicomStoreIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_dicom_store_iam.html.markdown",
				},
			},
			"google_healthcare_fhir_store": {
				Tok: gcpResource(gcpHealthcare, "FhirStore"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_fhir_store.html.markdown",
				},
			},
			"google_healthcare_fhir_store_iam_binding": {
				Tok: gcpResource(gcpHealthcare, "FhirStoreIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_fhir_store_iam.html.markdown",
				},
			},
			"google_healthcare_fhir_store_iam_member": {
				Tok: gcpResource(gcpHealthcare, "FhirStoreIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_fhir_store_iam.html.markdown",
				},
			},
			"google_healthcare_fhir_store_iam_policy": {
				Tok: gcpResource(gcpHealthcare, "FhirStoreIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_fhir_store_iam.html.markdown",
				},
			},
			"google_healthcare_hl7_v2_store": {
				Tok: gcpResource(gcpHealthcare, "Hl7Store"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_hl7_v2_store.html.markdown",
				},
			},
			"google_healthcare_hl7_v2_store_iam_binding": {
				Tok: gcpResource(gcpHealthcare, "Hl7StoreIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_hl7_v2_store_iam.html.markdown",
				},
			},
			"google_healthcare_hl7_v2_store_iam_member": {
				Tok: gcpResource(gcpHealthcare, "Hl7StoreIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_hl7_v2_store_iam.html.markdown",
				},
			},
			"google_healthcare_hl7_v2_store_iam_policy": {
				Tok: gcpResource(gcpHealthcare, "Hl7StoreIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_hl7_v2_store_iam.html.markdown",
				},
			},

			//CloudRun Resources
			"google_cloud_run_domain_mapping": {Tok: gcpResource(gcpCloudRun, "DomainMapping")},
			"google_cloud_run_service":        {Tok: gcpResource(gcpCloudRun, "Service")},

			// Machine Learning
			"google_ml_engine_model": {Tok: gcpResource(gcpMachingLearning, "EngineModel")},

			// Security Center
			"google_scc_source": {Tok: gcpResource(gcpSecurityCenter, "Source")},

			// VPC Access
			"google_vpc_access_connector": {Tok: gcpResource(gcpVpcAccess, "Connector")},
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
			"google_client_openid_userinfo": {
				Tok: gcpDataSource(gcpOrganization, "getClientOpenIdUserInfo"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_client_openid_userinfo.html.markdown",
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"consistent_hash": {
						Name: "consistentHash",
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"http_cookie": {
									Name: "httpCookies",
								},
							},
						},
					},
				},
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
			"google_compute_network_endpoint_group": {
				Tok: gcpDataSource(gcpCompute, "getNetworkEndpointGroup"),
			},
			"google_composer_image_versions": {
				Tok: gcpDataSource(gcpComposer, "getImageVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_composer_image_versions.html.markdown",
				},
			},
			"google_iam_role": {
				Tok: gcpDataSource(gcpIAM, "getRule"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_iam_role.html.markdown",
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
			"google_compute_node_types": {
				Tok: gcpDataSource(gcpCompute, "getNodeTypes"),
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
			"google_compute_ssl_certificate": {
				Tok: gcpDataSource(gcpCompute, "getCertificate"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_ssl_certificate.html.markdown",
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
			"google_compute_resource_policy": {
				Tok: gcpDataSource(gcpCompute, "getResourcePolicy"),
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
			"google_folder_organization_policy": {
				Tok: gcpDataSource(gcpFolder, "getOrganizationPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_folder_organization_policy.html.markdown",
				},
			},
			"google_iam_policy": {
				Tok: gcpDataSource(gcpOrganization, "getIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_iam_policy.html.markdown",
				},
			},
			"google_kms_crypto_key": {
				Tok: gcpDataSource(gcpKMS, "getKMSCryptoKey"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key.html.markdown",
				},
			},
			"google_kms_key_ring": {
				Tok: gcpDataSource(gcpKMS, "getKMSKeyRing"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_key_ring.html.markdown",
				},
			},
			"google_kms_secret": {
				Tok: gcpDataSource(gcpKMS, "getKMSSecret"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_secret.html.markdown",
				},
			},
			"google_kms_crypto_key_version": {Tok: gcpDataSource(gcpKMS, "getKMSCryptoKeyVersion")},
			"google_kms_secret_ciphertext":  {Tok: gcpDataSource(gcpKMS, "getKMSSecretCiphertext")},
			"google_organization": {
				Tok: gcpDataSource(gcpOrganization, "getOrganization"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization.html.markdown",
				},
			},
			"google_projects": {
				Tok: gcpDataSource(gcpProject, "getProject"),
				Docs: &tfbridge.DocInfo{
					Source: "google_projects.html.markdown",
				},
			},
			"google_project_organization_policy": {
				Tok: gcpDataSource(gcpProject, "getOrganizationPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_project_organization_policy.html.markdown",
				},
			},
			"google_storage_bucket_object": {
				Tok: gcpDataSource(gcpStorage, "getBucketObject"),
				Docs: &tfbridge.DocInfo{
					Source: "bucket_object.html.markdown",
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
			"google_storage_transfer_project_service_account": {
				Tok: gcpDataSource(gcpStorage, "getTransferProjectServieAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "google_storage_transfer_project_service_account.html.markdown",
				},
			},
			"google_service_account": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account.html.markdown",
				},
			},
			"google_service_account_access_token": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccountAccessToken"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account_access_token.html.markdown",
				},
			},
			"google_service_account_key": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccountKey"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account_key.html.markdown",
				},
			},
			"google_tpu_tensorflow_versions": {
				Tok: gcpDataSource(gcpTPU, "getTensorflowVersions"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^1.0.0",
				"read-package-json": "^2.0.13",
				"@types/express":    "^4.16.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.0", // so we can access strongly typed node definitions.
			},
			Overlay: &tfbridge.OverlayInfo{
				DestFiles: []string{
					"utils.ts", // Helpers,
				},
				Modules: map[string]*tfbridge.OverlayInfo{
					"serverless": {
						DestFiles: []string{
							"function.ts", // a serverless function that works with language closures.
						},
					},
					"cloudfunctions": {
						DestFiles: []string{
							// named with 'z' to come after all relevant files in package since the
							// generator sorts these by name.
							"zMixins.ts",
						},
					},
					"pubsub": {
						DestFiles: []string{
							// named with 'z' to come after all relevant files in package since the
							// generator sorts these by name.
							"zMixins.ts",
						},
					},
					"storage": {
						DestFiles: []string{
							// named with 'z' to come after all relevant files in package since the
							// generator sorts these by name.
							"zMixins.ts",
						},
					},
				},
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.5.0-*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	renameLegacyModules(&prov)

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

func renameLegacyModules(prov *tfbridge.ProviderInfo) {

	renameResourceWithAlias := func(
		tfName string,
		tokName string,
		newTokName string,
		legacyModule string,
		currentModule string,
		info *tfbridge.ResourceInfo) {

		legacyTFName := tfName + "_legacy"

		if info == nil {
			info = &tfbridge.ResourceInfo{}
		}
		legacyInfo := *info
		currentInfo := *info

		legacyInfo.Tok = gcpResource(legacyModule, tokName)
		legacyType := legacyInfo.Tok.String()

		if newTokName != "" {
			tokName = newTokName
		}

		currentInfo.Tok = gcpResource(currentModule, tokName)
		currentInfo.Aliases = []tfbridge.AliasInfo{
			{Type: &legacyType},
		}

		if legacyInfo.Docs == nil {
			legacyInfo.Docs = &tfbridge.DocInfo{
				Source: tfName[len("azurerm_"):] + ".html.markdown",
			}
		}

		prov.Resources[tfName] = &currentInfo
		prov.Resources[legacyTFName] = &legacyInfo
		prov.P.ResourcesMap[legacyTFName] = prov.P.ResourcesMap[tfName]
	}

	//renameDataSourceWithAlias := func(
	//	tfName string,
	//	tokName string,
	//	newTokName string,
	//	legacyModule string,
	//	currentModule string,
	//	info *tfbridge.DataSourceInfo) {
	//
	//	legacyTFName := tfName + "_legacy"
	//
	//	if info == nil {
	//		info = &tfbridge.DataSourceInfo{}
	//	}
	//	legacyInfo := *info
	//	currentInfo := *info
	//
	//	legacyInfo.Tok = gcpDataSource(legacyModule, tokName)
	//
	//	if newTokName != "" {
	//		tokName = newTokName
	//	}
	//
	//	currentInfo.Tok = gcpDataSource(currentModule, tokName)
	//
	//	if legacyInfo.Docs == nil {
	//		legacyInfo.Docs = &tfbridge.DocInfo{
	//			Source: tfName[len("azurerm_"):] + ".html.markdown",
	//		}
	//	}
	//
	//	prov.DataSources[tfName] = &currentInfo
	//	prov.DataSources[legacyTFName] = &legacyInfo
	//	prov.P.DataSourcesMap[legacyTFName] = prov.P.DataSourcesMap[tfName]
	//}

	// Fix the spelling on the KeyVault Certificate
	renameResourceWithAlias("google_compute_managed_ssl_certificate", "MangedSslCertificate",
		"ManagedSslCertificate", gcpCompute, gcpCompute, nil)
}
