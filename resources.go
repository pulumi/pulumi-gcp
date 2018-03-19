// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"strings"
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-google/google"
)

// all of the Azure token components used below.
const (
	// packages:
	gcpPackage = "gcp"
	// modules; in general, we took naming inspiration from the Google Cloud SDK for Go:
	// https://github.com/GoogleCloudPlatform/google-cloud-go
	gcpBigQuery       = "bigquery"       // BigQuery resources
	gcpBigTable       = "bigtable"       // BitTable resources
	gcpCloudFunctions = "cloudfunctions" // CloudFunction resources
	gcpCore           = "core"
	gcpFolder         = "folder"         // Folder resources
	gcpOrganization   = "organization"   // Organization resources
	gcpProject        = "project"        // Project resources
	gcpServiceAccount = "serviceAccount" // Service Account resources
	gcpCompute        = "compute"        // Compute resoures
	gcpKubernetes     = "container"      // Kubernetes Engine resources
	gcpDataFolow      = "dataflow"       // DataFlow resources
	gcpDataProc       = "dataproc"       // DataProc resources
	gcpDNS            = "dns"            // DNS resources
	gcpEndPoints      = "endpoints"      // End Point resources
	gcpPubSub         = "pubsub"         // PubSub resources
	gcpRuntimeConfig  = "runtimeconfig"  // Runtime Configr resources
	gcpSourceRepo     = "sourcerepo"     // Source Repo resources
	gcpSpanner        = "spanner"        // Spanner Resources
	gcpSQL            = "sql"            // SQL resources
	gcpLogging        = "logging"        // Logging resources
	gcpStorage        = "storage"        // Storage resources
	gcpKMS            = "kms"            // KMS resources
	gcpCloudIoT       = "cloudiot"       // CloudIoT resources
)

// gcpMember manufactures a type token for the GCP package and the given module and type.
func gcpMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(gcpPkg + ":" + mod + ":" + mem)
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
		Description: "A Pulumi package for creating and managing Microsoft Google cloud resources.",
		Keywords:    []string{"pulumi", "gcp"},
		Homepage:    "https://pulumi.io/gcp",
		Repository:  "https://github.com/pulumi/pulumi-gcp",
		Resources: map[string]*tfbridge.ResourceInfo{
			// BigQuery
			"google_bigquery_dataset": {Tok: gcpResource(gcpBigQuery, "Dataset")},
			"google_bigquery_table":   {Tok: gcpResource(gcpBigQuery, "Table")},

			// BigTable
			"google_bigtable_instance": {Tok: gcpResource(gcpBigTable, "Instance")},
			"google_bigtable_table":    {Tok: gcpResource(gcpBigTable, "Table")},
	
			// Cloud Functions
			"google_cloudfunctions_function": {Tok: gcpResource(gcpCloudFunctions, "Function")},

			// Core functions
			"google_folder":                       {Tok: gcpResource(gcpFolder, "Folder")},
			"google_folder_iam_binding":           {Tok: gcpResource(gcpFolder, "IAMBinding")},
			"google_folder_iam_policy":            {Tok: gcpResource(gcpFolder, "IAMPolicy")},
			"google_folder_organization_policy":   {Tok: gcpResource(gcpFolder, "OrganizationPolicy")},
			"google_organization_policy":          {Tok: gcpResource(gcpOrganization, "Policy")},
			"google_organization_iam_binding":     {Tok: gcpResource(gcpOrganization, "IAMBinding")},
			"google_organization_iam_custom_role": {Tok: gcpResource(gcpOrganization, "IAMCustomRole")},
			"google_organization_iam_member":      {Tok: gcpResource(gcpOrganization, "IAMMember")},
			"google_project":                      {Tok: gcpResource(gcpProject, "Project")},
			"google_project_iam_binding":          {Tok: gcpResource(gcpProject, "IAMBinding")},
			"google_project_iam_custom_role":      {Tok: gcpResource(gcpProject, "IAMCustomRole")},
			"google_project_iam_policy":           {Tok: gcpResource(gcpProject, "IAMPolicy")},
			"google_project_service":              {Tok: gcpResource(gcpProject, "Service")},
			"google_project_services":             {Tok: gcpResource(gcpProject, "Services")},
			"google_project_usage_export_bucket":  {Tok: gcpResource(gcpProject, "UsageExportBucket")},
			"google_service_account":              {Tok: gcpResource(gcpServiceAccount, "Account")},
			"google_service_account_iam_binding":  {Tok: gcpResource(gcpServiceAccount, "IAMBinding")},
			"google_service_account_iam_member":   {Tok: gcpResource(gcpServiceAccount, "IAMMember")},
			"google_service_account_iam_policy":   {Tok: gcpResource(gcpServiceAccount, "IAMPolicy")},
			"google_service_account_key":          {Tok: gcpResource(gcpServiceAccount, "Key")},

			// Compute
			"google_compute_address":                    {Tok: gcpResource(gcpCompute, "Address")},
			"google_compute_autoscaler":                 {Tok: gcpResource(gcpCompute, "Autoscalar")},
			"google_compute_backend_bucket":             {Tok: gcpResource(gcpCompute, "BackendBucket")},
			"google_compute_backend_service":            {Tok: gcpResource(gcpCompute, "BackendService")},
			"google_compute_disk":                       {Tok: gcpResource(gcpCompute, "Disk")},
			"google_compute_firewall":                   {Tok: gcpResource(gcpCompute, "Firewall")},
			"google_compute_forwarding_rule":            {Tok: gcpResource(gcpCompute, "ForwardingRule")},
			"google_compute_global_address":             {Tok: gcpResource(gcpCompute, "GlobalAddress")},
			"google_compute_global_forwarding_rule":     {Tok: gcpResource(gcpCompute, "GlobalForwardingRule")},
			"google_compute_health_check":               {Tok: gcpResource(gcpCompute, "HealthCheck")},
			"google_compute_http_health_check":          {Tok: gcpResource(gcpCompute, "HttpHealthCheck")},
			"google_compute_https_health_check":         {Tok: gcpResource(gcpCompute, "HttpsHealthCheck")},
			"google_compute_image":                      {Tok: gcpResource(gcpCompute, "Image")},
			"google_compute_instance":                   {Tok: gcpResource(gcpCompute, "Instance")},
			"google_compute_instance_group":             {Tok: gcpResource(gcpCompute, "InstanceGroup")},
			"google_compute_instance_group_manager":     {Tok: gcpResource(gcpCompute, "InstanceGroupManager")},
			"google_compute_instance_template":          {Tok: gcpResource(gcpCompute, "InstanceTemplate")},
			"google_compute_network_peering":            {Tok: gcpResource(gcpCompute, "NetworkPeering")},
			"google_compute_network":                    {Tok: gcpResource(gcpCompute, "network")},
			"google_compute_project_metadata":           {Tok: gcpResource(gcpCompute, "ProjectMetadata")},
			"google_compute_project_metadata_item":      {Tok: gcpResource(gcpCompute, "ProjectMetadataItem")},
			"google_compute_region_autoscaler":          {Tok: gcpResource(gcpCompute, "RegionAutoscaler")},
			"google_compute_region_backend_service":     {Tok: gcpResource(gcpCompute, "RegionBackendService")},
			"google_compute_region_instance_group":      {Tok: gcpResource(gcpCompute, "RegionInstanceGroup")},
			"google_compute_route":                      {Tok: gcpResource(gcpCompute, "Route")},
			"google_compute_router":                     {Tok: gcpResource(gcpCompute, "Router")},
			"google_compute_router_interface":           {Tok: gcpResource(gcpCompute, "RouterInterface")},
			"google_compute_router_peer":                {Tok: gcpResource(gcpCompute, "RouterPeer")},
			"google_compute_shared_vpc_source_project":  {Tok: gcpResource(gcpCompute, "SharedVPCSourceProject")},
			"google_compute_shared_vpc_service_project": {Tok: gcpResource(gcpCompute, "SharedVPCServiceProject")},
			"google_compute_snapshot":                   {Tok: gcpResource(gcpCompute, "Snapshot")},
			"google_compute_ssl_certificate":            {Tok: gcpResource(gcpCompute, "SSLCertificate")},
			"google_compute_subnetwork":                 {Tok: gcpResource(gcpCompute, "Subnetwork")},
			"google_compute_target_http_proxy":          {Tok: gcpResource(gcpCompute, "TargetHttpProxy")},
			"google_compute_target_https_proxy":         {Tok: gcpResource(gcpCompute, "TargetHttpsProxy")},
			"google_compute_target_ssl_proxy":           {Tok: gcpResource(gcpCompute, "TargetSSLProxy")},
			"google_compute_target_tcp_proxy":           {Tok: gcpResource(gcpCompute, "TargetTCPProxy")},
			"google_compute_target_pool":                {Tok: gcpResource(gcpCompute, "TargetPool")},
			"google_compute_url_map":                    {Tok: gcpResource(gcpCompute, "URLMap")},
			"google_compute_vpn_gateway":                {Tok: gcpResource(gcpCompute, "VPNGateway")},
			"google_compute_vpn_tunnel":                 {Tok: gcpResource(gcpCompute, "VPNTunnel")},

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

			// PubSub resources
			"google_pubsub_topic":                    {Tok: gcpResource(gcpPubSub, "Topic")},
			"google_pubsub_topic_iam_binding":        {Tok: gcpResource(gcpPubSub, "TopicIAMBinding")},
			"google_pubsub_topic_iam_member":         {Tok: gcpResource(gcpPubSub, "TopicIAMMember")},
			"google_pubsub_topic_iam_policy":         {Tok: gcpResource(gcpPubSub, "TopicIAMPolicy")},
			"google_pubsub_subscription":             {Tok: gcpResource(gcpPubSub, "Subscription")},
			"google_pubsub_subscription_iam_binding": {Tok: gcpResource(gcpPubSub, "SubscriptionIAMBinding")},
			"google_pubsub_subscription_iam_member":  {Tok: gcpResource(gcpPubSub, "SubscriptionIAMMember")},
			"google_pubsub_subscription_iam_policy":  {Tok: gcpResource(gcpPubSub, "SubscriptionIAMPolicy")},

			// Runtime Config resources
			"google_runtimeconfig_config":   {Tok: gcpResource(gcpRuntimeConfig, "Config")},
			"google_runtimeconfig_variable": {Tok: gcpResource(gcpRuntimeConfig, "Variavble")},

			// Source Repository resources
			"google_sourcerepo_repository": {Tok: gcpResource(gcpSourceRepo, "Repository")},

			// Spanner resources
			"google_spanner_instance": {Tok: gcpResource(gcpSpanner, "Instance")},
			"google_spanner_database": {Tok: gcpResource(gcpSpanner, "Database")},

			// SQL resources
			"google_sql_database":          {Tok: gcpResource(gcpSQL, "Database")},
			"google_sql_database_instance": {Tok: gcpResource(gcpSQL, "DatabaseInstance")},
			"google_sql_user":              {Tok: gcpResource(gcpSQL, "User")},

			// Stackdriver Logging resources
			"google_logging_billing_account_sink": {Tok: gcpResource(gcpLogging, "BillingAccountSink")},
			"google_logging_organziation_sink":    {Tok: gcpResource(gcpLogging, "OrganizationSink")},
			"google_logging_folder_sink":          {Tok: gcpResource(gcpLogging, "FolderSink")},
			"google_logging_project_sink":         {Tok: gcpResource(gcpLogging, "ProjectSink")},

			// Storage resources
			"google_storage_bucket":             {Tok: gcpResource(gcpStorage, "Bucket")},
			"google_storage_bucket_acl":         {Tok: gcpResource(gcpStorage, "BucketACL")},
			"google_storage_bucket_iam_binding": {Tok: gcpResource(gcpStorage, "BucketIAMBinding")},
			"google_storage_bucket_iam_member":  {Tok: gcpResource(gcpStorage, "BucketIAMMember")},
			"google_storage_bucket_object":      {Tok: gcpResource(gcpStorage, "BucketObject")},
			"google_storage_default_object_acl": {Tok: gcpResource(gcpStorage, "DefaultObjectACL")},
			"google_storage_notification":       {Tok: gcpResource(gcpStorage, "Notification")},
			"google_storage_object_acl":         {Tok: gcpResource(gcpStorage, "ObjectACL")},

			// Key Management Service resources
			"google_kms_key_ring":               {Tok: gcpResource(gcpKMS, "KeyRing")},
			"google_kms_key_ring_iam_binding":   {Tok: gcpResource(gcpKMS, "KeyRingIAMBinding")},
			"google_kms_key_ring_iam_member":    {Tok: gcpResource(gcpKMS, "KeyRingIAMMember")},
			"google_kms_key_ring_iam_policy":    {Tok: gcpResource(gcpKMS, "KeyRingIAMPolicy")},
			"google_kms_crypto_key":             {Tok: gcpResource(gcpKMS, "CryptoKey")},
			"google_kms_crypto_key_iam_binding": {Tok: gcpResource(gcpKMS, "CryptoKeyIAMBinding")},
			"google_kms_crypto_key_iam_policy":  {Tok: gcpResource(gcpKMS, "CryptoKeyIAMPolicy")},

			// Cloud IoT Core resources
			"google_cloudiot_registry": {Tok: gcpResource(gcpKMS, "Registry")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{

			"google_billing_account":                 {Tok: gcpDataSource(gcpCore, "getBillingAccount")},
			"google_client_config":                   {Tok: gcpDataSource(gcpCore, "getClientConfig")},
			"google_cloudfunctions_function":         {Tok: gcpDataSource(gcpCloudFunctions, "getFunction")},
			"google_compute_address":                 {Tok: gcpDataSource(gcpCompute, "getAddress")},
			"google_compute_default_service_account": {Tok: gcpDataSource(gcpCompute, "getDefaultServiceAccount")},
			"google_compute_image":                   {Tok: gcpDataSource(gcpCompute, "getImage")},
			"google_compute_forwarding_rule":         {Tok: gcpDataSource(gcpCompute, "getForwardingRule")},
			"google_compute_globalAddress":           {Tok: gcpDataSource(gcpCompute, "getGlobalAddress")},
			"google_compute_network":                 {Tok: gcpDataSource(gcpCompute, "getNetwork")},
			"google_project":                         {Tok: gcpDataSource(gcpCompute, "getProject")},
			"google_compute_subnetwork":              {Tok: gcpDataSource(gcpCompute, "getSubnetwork")},
			"google_compute_vpn_gateway":             {Tok: gcpDataSource(gcpCompute, "getVPNGateway")},
			"google_compute_zones":                   {Tok: gcpDataSource(gcpCompute, "getZones")},
			"google_compute_region_instance_group":   {Tok: gcpDataSource(gcpCompute, "getRegionInstanceGroup")},
			"google_compute_instance_group":          {Tok: gcpDataSource(gcpCompute, "getInstanceGroup")},
			"google_compute_lb_ip_ranges":            {Tok: gcpDataSource(gcpCompute, "getLBIPRanges")},
			"google_container_cluster":               {Tok: gcpDataSource(gcpKubernetes, "getCluster")},
			"google_container_engine_versions":       {Tok: gcpDataSource(gcpKubernetes, "getEngineVersions")},
			"google_container_registry_repository":   {Tok: gcpDataSource(gcpKubernetes, "getRegistryRepository")},
			"google_container_registry_image":        {Tok: gcpDataSource(gcpKubernetes, "getRegistryImage")},
			"google_dns_managed_zone":                {Tok: gcpDataSource(gcpDNS, "getManagedZone")},
			"google_active_folder":                   {Tok: gcpDataSource(gcpFolder, "getActiveFolder")},
			"google_iam_policy":                      {Tok: gcpDataSource(gcpCore, "getIAMPolicy")},
			"google_kms_secret":                      {Tok: gcpDataSource(gcpKMS, "getKMSSecret")},
			"google_organization":                    {Tok: gcpDataSource(gcpOrganization, "getOrganization")},
			"google_storage_object_signed_url":       {Tok: gcpDataSource(gcpStorage, "getObjectSignedUrl")},
			"google_storage_project_service_account": {Tok: gcpDataSource(gcpStorage, "getProjectServiceAccount")},
		},
		Overlay: &tfbridge.OverlayInfo{
			Files:   []string{},
			Modules: map[string]*tfbridge.OverlayInfo{},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
			},
			PeerDependencies: map[string]string{
				"@pulumi/pulumi": "^0.11.0-dev-168-g7e14a09b",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const gcpName = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			if _, has := schema.Schema[gcpName]; has {
				if _, hasfield := res.Fields[gcpName]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					// Use conservative options that apply broadly for Google Cloud Platform.  See
					// details.
					res.Fields[gcpName] = AutoName(gcpName, AutoNameOptions{
						ForceLowercase: true,
						Separator:      "",
						Maxlen:         24,
						Randlen:        8,
					})
				}
			}
		}
	}

	return prov
}

// IDEA: Consider moving this refactoring of AutoName to allow more flexible configuration back into pulumi-terraform.

// AutoNameOptions provides parameters to AutoName to control how names will be generated
type AutoNameOptions struct {
	// A separator between name and random portions of the
	Separator string
	// Maximum length of the generated name
	Maxlen int
	// Number of characters of random hex digits to add to the name
	Randlen int
	// A transform to apply to the name prior to adding random characters
	Transform func(string) string
	// Force the name to be lowercase prior to adding random characters
	ForceLowercase bool
}

// AutoName creates custom schema for a Terraform name property which is automatically populated from the resource's URN
// name, and tranformed based on the provided options.
func AutoName(name string, options AutoNameOptions) *tfbridge.SchemaInfo {
	return &tfbridge.SchemaInfo{
		Name: name,
		Default: &tfbridge.DefaultInfo{
			From: FromName(options),
		},
	}
}

// FromName automatically propagates a resource's URN onto the resulting default info.
func FromName(options AutoNameOptions) func(res *tfbridge.PulumiResource) (interface{}, error) {
	return func(res *tfbridge.PulumiResource) (interface{}, error) {
		// Take the URN name part, transform it if required, and then append some unique characters if requested.
		vs := string(res.URN.Name())
		if options.Transform != nil {
			vs = options.Transform(vs)
		} else if options.ForceLowercase {
			vs = strings.ToLower(vs)
		}
		if options.Randlen > 0 {
			return resource.NewUniqueHex(vs+options.Separator, options.Randlen, options.Maxlen)
		}
		if len(vs) > options.Maxlen {
			return "", errors.Errorf("name '%s' is longer than maximum length %d", vs, options.Maxlen)
		}
		return vs, nil
	}
}
