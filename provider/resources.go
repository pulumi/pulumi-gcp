// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"context"
	"fmt"
	"log"
	"path"
	"strings"
	"sync/atomic"
	"unicode"

	// Allow embedding metadata in the provider
	_ "embed"

	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	gcpPFProvider "github.com/hashicorp/terraform-provider-google-beta/google-beta/fwprovider"
	gcpProvider "github.com/hashicorp/terraform-provider-google-beta/google-beta/provider"
	tpg_transport "github.com/hashicorp/terraform-provider-google-beta/google-beta/transport"
	"google.golang.org/api/compute/v1"
	"google.golang.org/api/option"

	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/pkg/v3/resource/provider"
	"github.com/pulumi/pulumi/sdk/v3/go/common/diag"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-gcp/provider/v7/pkg/version"
)

// all of the Google Cloud Platform token components used below.
const (
	// packages:
	gcpPackage = "gcp"
	// modules; in general, we took naming inspiration from the Google Cloud SDK for Go:
	// https://github.com/GoogleCloudPlatform/google-cloud-go
	gcpAccessApproval       = "AccessApproval"       // Access Approval resources
	gcpAccessContextManager = "AccessContextManager" // Access Context Manager resources
	gcpActiveDirectory      = "ActiveDirectory"      // Active Directory resources
	gcpAlloydb              = "Alloydb"              // Alloydb resources
	// nolint:revive
	gcpApiGateway               = "ApiGateway"               // ApiGateway resources
	gcpApigee                   = "Apigee"                   // Apigee resources
	gcpAppEngine                = "AppEngine"                // AppEngine resources
	gcpApplicationIntegration   = "ApplicationIntegration"   // Application Integration
	gcpArtifactRegistry         = "ArtifactRegistry"         // ArtifactRegistry resources
	gcpAssuredWorkloads         = "AssuredWorkloads"         // AssuredWorkloads resources
	gcpBackupDR                 = "BackupDisasterRecovery"   // Backup and Disaster Recovery resources
	gcpBeyondcorp               = "Beyondcorp"               // Beyondcorp resources
	gcpBigLake                  = "BigLake"                  // BigLake resources
	gcpBigQuery                 = "BigQuery"                 // BigQuery resources
	gcpBigQueryAnalyticsHub     = "BigQueryAnalyticsHub"     // BigQuery Analytics Hub resources
	gcpBigQueryDataPolicy       = "BigQueryDataPolicy"       // BigQuery Data Policy resources
	gcpBigTable                 = "BigTable"                 // BitTable resources
	gcpBilling                  = "Billing"                  // Billing resources
	gcpBinaryAuthorization      = "BinaryAuthorization"      // Binary Authorization resources
	gcpBlockchainNodeEngine     = "BlockchainNodeEngine"     // Blockchain Node Engine resources
	gcpCertificateAuthority     = "CertificateAuthority"     // CertificateAuthority resources
	gcpCertificateManager       = "CertificateManager"       // CertificateManager resources
	gcpCloudAsset               = "CloudAsset"               // CloudAsset resources
	gcpCloudBuild               = "CloudBuild"               // CloudBuild resources
	gcpCloudBuildV2             = "CloudBuildV2"             // CloudBuild (2nd Gen) resources
	gcpCloudDeploy              = "CloudDeploy"              // CloudDeploy resources
	gcpCloudFunctions           = "CloudFunctions"           // CloudFunction resources
	gcpCloudFunctionsV2         = "CloudFunctionsV2"         // CloudFunction (2nd Gen) resources
	gcpCloudIdentity            = "CloudIdentity"            // CloudIdentity resources
	gcpCloudIds                 = "CloudIds"                 // CloudIds resources
	gcpCloudRun                 = "CloudRun"                 // CloudRun resources
	gcpCloudRunV2               = "CloudRunV2"               // CloudRun (2nd Gen) resources
	gcpCloudScheduler           = "CloudScheduler"           // Cloud Scheduler resources
	gcpCloudTasks               = "CloudTasks"               // Cloud Tasks resources
	gcpComposer                 = "Composer"                 // Cloud Composer resources
	gcpCompute                  = "Compute"                  // Compute resources
	gcpContainerAnalysis        = "ContainerAnalysis"        // Container Analysis resources
	gcpDNS                      = "Dns"                      // DNS resources
	gcpDataCatalog              = "DataCatalog"              // Data Catalog resources
	gcpDataFlow                 = "Dataflow"                 // DataFlow resources
	gcpDataFusion               = "DataFusion"               // DataFusion resources
	gcpDataLoss                 = "DataLoss"                 // DataLoss resources
	gcpDataPlex                 = "DataPlex"                 // DataPlex
	gcpDataProc                 = "Dataproc"                 // DataProc resources
	gcpDatabaseMigrationService = "DatabaseMigrationService" // Database Migration Service resources
	gcpDataform                 = "Dataform"                 // Dataform resources
	gcpDatastore                = "Datastore"                // Datastore resources
	gcpDatastream               = "Datastream"               // Datastream resources
	gcpDeploymentManager        = "DeploymentManager"        // DeploymentManager resources
	gcpDiagflow                 = "Diagflow"                 // Diagflow resources
	gcpDiscoveryEngine          = "DiscoveryEngine"          // Discovery Engine
	gcpEdgeNetwork              = "EdgeNetwork"              // Distributed Cloud Edge Network resources
	gcpEdgecontainer            = "EdgeContainer"            // Cloud Edge Container resources
	gcpEndPoints                = "Endpoints"                // End Point resources
	gcpEssentialContacts        = "EssentialContacts"        // Essential Contacts resources
	gcpEventarc                 = "Eventarc"                 // Eventarc
	gcpFilestore                = "Filestore"                // Filestore resources
	gcpFirebase                 = "Firebase"                 // Firebase resources
	gcpFirebaserules            = "Firebaserules"            // FirebaseRules resources
	gcpFirestore                = "Firestore"                // Firestore resources
	gcpFolder                   = "Folder"                   // Folder resources
	gcpGameServices             = "GameServices"             // Game Services resources
	gcpGkeBackup                = "GkeBackup"                // Gke Backup resources
	gcpGkeHub                   = "GkeHub"                   // Gke Hub resources
	gcpGkeOnPrem                = "GkeOnPrem"                // Gke On Prem resources
	gcpHealthcare               = "Healthcare"               // Healthcare resources
	gcpIAM                      = "Iam"                      // IAM resources
	gcpIAP                      = "Iap"                      // IAP resources
	gcpIdentityPlatform         = "IdentityPlatform"         // IdentityPlatform resources
	gcpIntegrationConnectors    = "IntegrationConnectors"    // Integration Connectors resources
	gcpIot                      = "Iot"                      // Iot resources
	gcpKMS                      = "Kms"                      // KMS resources
	gcpKubernetes               = "Container"                // Kubernetes Engine resources
	gcpLogging                  = "Logging"                  // Logging resources
	gcpLooker                   = "Looker"                   // Looker resources
	gcpMachingLearning          = "ML"                       // Machine Learning
	gcpMemcache                 = "Memcache"                 // Memcache resources
	gcpMigrationCenter          = "MigrationCenter"          // Migration Center
	gcpMonitoring               = "Monitoring"               // Monitoring resources
	gcpNetapp                   = "Netapp"                   // Netapp
	gcpNetworkConnectivity      = "NetworkConnectivity"      // Network Connectivity resources
	gcpNetworkManagement        = "NetworkManagement"        // Network Management resources
	gcpNetworkSecurity          = "NetworkSecurity"          // Network Security resources
	gcpNetworkServices          = "NetworkServices"          // Network Services resources
	gcpNotebooks                = "Notebooks"                // Notebooks resources
	gcpOrgPolicy                = "OrgPolicy"                // Org Policy
	gcpOrganization             = "Organizations"            // Organization resources
	gcpOsConfig                 = "OsConfig"                 // OsConfig resources
	gcpOsLogin                  = "OsLogin"                  // OsLogin resources
	gcpParallelStore            = "ParallelStore"            // ParallelStore resources
	gcpPriviligedAccessManager  = "PriviligedAccessManager"  // Priviliged Access Manager
	gcpProject                  = "Projects"                 // Project resources
	gcpPubSub                   = "PubSub"                   // PubSub resources
	gcpRecaptcha                = "Recaptcha"                // Recaptcha resources
	gcpRedis                    = "Redis"                    // Redis resources
	gcpResourceManager          = "ResourceManager"          // Resource Manager resources
	gcpRuntimeConfig            = "RuntimeConfig"            // Runtime Config resources
	gcpSQL                      = "Sql"                      // SQL resources
	gcpSecretManager            = "SecretManager"            // Secret Manager resources
	gcpSecureSourceManager      = "SecureSourceManager"      // Secure Source Manager
	gcpSecurityCenter           = "SecurityCenter"           // Security Center
	gcpSecurityPosture          = "SecurityPosture"          // Security Posture
	gcpServiceAccount           = "ServiceAccount"           // Service Account resources
	gcpServiceDirectory         = "ServiceDirectory"         // Service Directory resources
	gcpServiceNetworking        = "ServiceNetworking"        // Service Networking resources
	gcpServiceUsage             = "ServiceUsage"             // Service Usage resources
	gcpSourceRepo               = "SourceRepo"               // Source Repo resources
	gcpSpanner                  = "Spanner"                  // Spanner Resources
	gcpStorage                  = "Storage"                  // Storage resources
	gcpTPU                      = "Tpu"                      // Tensor Processing Units
	gcpTags                     = "Tags"                     // Tags
	gcpVMwareEngine             = "VMwareEngine"             // VMWare Engine
	gcpVertex                   = "Vertex"                   // Vertex
	gcpVpcAccess                = "VpcAccess"                // VPC Access
	gcpWorkbench                = "Workbench"                // Workbench
	gcpWorkflows                = "Workflows"                // Workflows
	gcpWorkstations             = "Workstations"             // Workstations
)

var moduleMapping = map[string]string{
	"access_approval":                 gcpAccessApproval,
	"access_context_manager":          gcpAccessContextManager,
	"active_directory":                gcpActiveDirectory,
	"alloydb":                         gcpAlloydb,
	"api_gateway":                     gcpApiGateway,
	"apigee":                          gcpApigee,
	"app_engine":                      gcpAppEngine,
	"apphub":                          "Apphub",
	"artifact_registry":               gcpArtifactRegistry,
	"assured_workloads":               gcpAssuredWorkloads,
	"backup_dr":                       gcpBackupDR,
	"beyondcorp":                      gcpBeyondcorp,
	"biglake":                         gcpBigLake,
	"bigquery":                        gcpBigQuery,
	"integrations":                    gcpApplicationIntegration,
	"bigquery_analytics_hub":          gcpBigQueryAnalyticsHub,
	"bigquery_datapolicy_data_policy": gcpBigQueryDataPolicy,
	"bigtable":                        gcpBigTable,
	"billing":                         gcpBilling,
	"blockchain_node_engine":          gcpBlockchainNodeEngine,
	"binary_authorization":            gcpBinaryAuthorization,
	"certificate_manager":             gcpCertificateManager,
	"cloud_asset":                     gcpCloudAsset,
	"cloud_identity":                  gcpCloudIdentity,
	"cloud_ids":                       gcpCloudIds,
	"cloud_quota":                     "CloudQuota",
	"cloud_run":                       gcpCloudRun,
	"cloud_run_v2":                    gcpCloudRunV2,
	"cloud_scheduler":                 gcpCloudScheduler,
	"cloud_tasks":                     gcpCloudTasks,
	"cloudbuild":                      gcpCloudBuild,
	"cloudbuildv2":                    gcpCloudBuildV2,
	"clouddeploy":                     gcpCloudDeploy,
	"clouddomains":                    "CloudDomains",
	"cloudfunctions":                  gcpCloudFunctions,
	"cloudfunctions2":                 gcpCloudFunctionsV2,
	"cloudiot":                        gcpIot,
	"composer":                        gcpComposer,
	"compute":                         gcpCompute,
	"container":                       gcpKubernetes,
	"container_analysis":              gcpContainerAnalysis,
	"data_catalog":                    gcpDataCatalog,
	"data_fusion":                     gcpDataFusion,
	"data_loss":                       gcpDataLoss,
	// Intentionally the same as "dataflow" since in Google's docs, data pipelines are nested under DataFlow.
	"data_pipeline":              gcpDataFlow,
	"database_migration_service": gcpDatabaseMigrationService,
	"dataflow":                   gcpDataFlow,
	"dataform":                   gcpDataform,
	"dataplex":                   gcpDataPlex,
	"dataproc":                   gcpDataProc,
	"datastore":                  gcpDatastore,
	"datastream":                 gcpDatastream,
	"deployment_manager":         gcpDeploymentManager,
	"dialogflow":                 gcpDiagflow,
	"discovery_engine":           gcpDiscoveryEngine,
	"dns":                        gcpDNS,
	"edgecontainer":              gcpEdgecontainer,
	"edgenetwork":                gcpEdgeNetwork,
	"endpoints":                  gcpEndPoints,
	"essential_contacts":         gcpEssentialContacts,
	"eventarc":                   gcpEventarc,
	"filestore":                  gcpFilestore,
	"firebase":                   gcpFirebase,
	"firebaserules":              gcpFirebaserules,
	"firestore":                  gcpFirestore,
	"folder":                     gcpFolder,
	"game_services":              gcpGameServices,
	"gke_backup":                 gcpGkeBackup,
	"gke_hub":                    gcpGkeHub,
	"gkeonprem":                  gcpGkeOnPrem,
	"healthcare":                 gcpHealthcare,
	"iam":                        gcpIAM,
	"iap":                        gcpIAP,
	"identity_platform":          gcpIdentityPlatform,
	"integration_connectors":     gcpIntegrationConnectors,
	"kms":                        gcpKMS,
	"logging":                    gcpLogging,
	"looker":                     gcpLooker,
	"memcache":                   gcpMemcache,
	"migration_center":           gcpMigrationCenter,
	"ml":                         gcpMachingLearning,
	"monitoring":                 gcpMonitoring,
	"netapp":                     gcpNetapp,
	"network_connectivity":       gcpNetworkConnectivity,
	"network_management":         gcpNetworkManagement,
	"network_security":           gcpNetworkSecurity,
	"network_services":           gcpNetworkServices,
	"notebooks":                  gcpNotebooks,
	"org_policy":                 gcpOrgPolicy,
	"organization":               gcpOrganization,
	"os_config":                  gcpOsConfig,
	"os_login":                   gcpOsLogin,
	"parallelstore":              gcpParallelStore,
	"privateca":                  gcpCertificateAuthority,
	"privileged_access_manager":  gcpPriviligedAccessManager,
	"project":                    gcpProject,
	"public":                     gcpCompute,
	"pubsub":                     gcpPubSub,
	"recaptcha":                  gcpRecaptcha,
	"redis":                      gcpRedis,
	"resource_manager":           gcpResourceManager,
	"runtimeconfig":              gcpRuntimeConfig,
	"scc":                        gcpSecurityCenter,
	"secret_manager":             gcpSecretManager,
	"secure_source_manager":      gcpSecureSourceManager,
	"securityposture":            gcpSecurityPosture,
	"service_account":            gcpServiceAccount,
	"service_directory":          gcpServiceDirectory,
	"service_networking":         gcpServiceNetworking,
	"service_usage":              gcpServiceUsage,
	"sourcerepo":                 gcpSourceRepo,
	"spanner":                    gcpSpanner,
	"sql":                        gcpSQL,
	"storage":                    gcpStorage,
	"tags":                       gcpTags,
	"tpu":                        gcpTPU,
	"vertex":                     gcpVertex,
	"vmwareengine":               gcpVMwareEngine,
	"vpc_access":                 gcpVpcAccess,
	"workbench":                  gcpWorkbench,
	"workflows":                  gcpWorkflows,
	"workstations":               gcpWorkstations,
}

var namespaceMap = map[string]string{
	"gcp": "Gcp",
}

// gcpMember manufactures a type token for the GCP package and the given module and
// type.  It automatically uses the GCP package and names the file by simply lower
// casing the resource's first character.
func gcpMember(moduleTitle string, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	fn := string(unicode.ToLower(rune(mem[0]))) + mem[1:]
	token := moduleName + "/" + fn
	return tokens.ModuleMember(gcpPackage + ":" + token + ":" + mem)
}

// gcpType manufactures a type token for the GCP package and the given module and type.
func gcpType(mod string, typ string) tokens.Type {
	return tokens.Type(gcpMember(mod, typ))
}

// gcpDataSource manufactures a standard member given a module and resource name.
func gcpDataSource(mod string, res string) tokens.ModuleMember {
	return gcpMember(mod, res)
}

// gcpResource manufactures a standard resource token given a module and resource name.
func gcpResource(mod string, res string) tokens.Type {
	return gcpType(mod, res)
}

// lowercaseAutoName provides a schema info with autonaming set to lowercase names
// for resources that don't support capital casing in names.  This seems to be the
// case for many resources where a name ends up being in HTTP URLs.
func lowercaseAutoName() *tfbridge.SchemaInfo {
	return tfbridge.AutoNameWithCustomOptions("name", tfbridge.AutoNameOptions{
		Separator: "-",
		Maxlen:    63,
		Randlen:   7,
		Transform: strings.ToLower,
	})
}

func nameField(info *tfbridge.SchemaInfo) map[string]*tfbridge.SchemaInfo {
	return map[string]*tfbridge.SchemaInfo{
		"name": info,
	}
}

func getRegionsList(ctx context.Context, project string, clientOpts []option.ClientOption) ([]string, error) {
	computeService, err := compute.NewService(ctx, clientOpts...)
	if err != nil {
		return nil, fmt.Errorf("failed to create compute service: %w", err)
	}
	regionsService := compute.NewRegionsService(computeService)
	regionList, err := regionsService.List(project).Do()
	if err != nil {
		return nil, fmt.Errorf("failed to list regions: %w", err)
	}
	var regions []string
	for _, region := range regionList.Items {
		regions = append(regions, region.Name)
	}
	return regions, nil
}

//go:embed errors/no_credentials.txt
var noCredentialsErr string

//go:embed errors/wrong_region.txt
var wrongRegionErr string

//go:embed errors/no_project.txt
var noProjectErr string

func logOrPrint(ctx context.Context, host *provider.HostClient, msg string) {
	// host is unavailable in tests, so we revert to normal logging.
	if host != nil {
		// the URN will default to the root stack name which is exactly what we want
		_ = host.Log(ctx, diag.Warning, "", msg)
	} else {
		log.Print(msg)
	}
}

// gcpClientOpts is used to pass in options during testing.
func preConfigureCallbackWithLogger(credentialsValidationRun *atomic.Bool, gcpClientOpts []option.ClientOption) func(
	ctx context.Context, host *provider.HostClient, vars resource.PropertyMap, c shim.ResourceConfig,
) error {
	return func(ctx context.Context, host *provider.HostClient, vars resource.PropertyMap, c shim.ResourceConfig) error {
		if !credentialsValidationRun.CompareAndSwap(false, true) {
			return nil
		}
		project := tfbridge.ConfigStringValue(vars, "project", []string{
			"GOOGLE_PROJECT",
			"GOOGLE_CLOUD_PROJECT",
			"GCLOUD_PROJECT",
			"CLOUDSDK_CORE_PROJECT",
		})
		if project == "" {
			logOrPrint(ctx, host, noProjectErr)
			return nil
		}

		config := tpg_transport.Config{
			AccessToken: tfbridge.ConfigStringValue(vars,
				"accessToken", []string{"GOOGLE_OAUTH_ACCESS_TOKEN"}),
			Credentials: tfbridge.ConfigStringValue(vars, "credentials", []string{
				"GOOGLE_CREDENTIALS",
				"GOOGLE_CLOUD_KEYFILE_JSON",
				"GCLOUD_KEYFILE_JSON",
			}),
			ImpersonateServiceAccount: tfbridge.ConfigStringValue(vars,
				"impersonateServiceAccount", []string{"GOOGLE_IMPERSONATE_SERVICE_ACCOUNT"}),
			Project: tfbridge.ConfigStringValue(vars, "project", []string{
				"GOOGLE_PROJECT",
				"GOOGLE_CLOUD_PROJECT",
				"GCLOUD_PROJECT",
				"CLOUDSDK_CORE_PROJECT",
			}),
			Region: tfbridge.ConfigStringValue(vars, "region", []string{
				"GOOGLE_REGION",
				"GCLOUD_REGION",
				"CLOUDSDK_COMPUTE_REGION",
			}),
			Zone: tfbridge.ConfigStringValue(vars, "zone", []string{
				"GOOGLE_ZONE",
				"GCLOUD_ZONE",
				"CLOUDSDK_COMPUTE_ZONE",
			}),
		}

		// validate the gcloud config
		err := config.LoadAndValidate(ctx)
		if err != nil {
			return fmt.Errorf(noCredentialsErr, err)
		}

		skipRegionValidation := tfbridge.ConfigBoolValue(
			vars, "skipRegionValidation", []string{"PULUMI_GCP_SKIP_REGION_VALIDATION"},
		)

		if !skipRegionValidation && config.Region != "" && config.Project != "" {
			regionList, err := getRegionsList(ctx, config.Project, gcpClientOpts)
			if err != nil {
				logOrPrint(ctx, host, fmt.Sprintf("failed to get regions list: %v", err))
				return nil
			}
			for _, region := range regionList {
				if region == config.Region {
					return nil
				}
			}
			logOrPrint(ctx, host, fmt.Sprintf(wrongRegionErr, config.Region, config.Project))
		}

		return nil
	}
}

//go:embed cmd/pulumi-resource-gcp/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the gcp package.
//
//nolint:lll
func Provider() tfbridge.ProviderInfo {
	p := pf.MuxShimWithDisjointgPF(
		context.Background(),
		shimv2.NewProvider(gcpProvider.Provider(),
			shimv2.WithDiffStrategy(shimv2.PlanState),
			shimv2.WithPlanResourceChange(func(s string) bool {
				switch s {
				case "google_datastream_connection_profile":
					return true
				default:
					return false
				}
			}),
		),
		gcpPFProvider.New(version.Version)) // this probably should be TF version but it does not seem to matter

	// We should only run the validation once to avoid duplicating the reported errors.
	var credentialsValidationRun atomic.Bool

	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "google-beta",
		ResourcePrefix:   "google",
		GitHubOrg:        "hashicorp",
		Description:      "A Pulumi package for creating and managing Google Cloud Platform resources.",
		Keywords:         []string{"pulumi", "gcp"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		Repository:       "https://github.com/pulumi/pulumi-gcp",
		Version:          version.Version,
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		UpstreamRepoPath: "./upstream",
		DocRules:         &tfbridge.DocRuleInfo{EditRules: editRules},
		Config: map[string]*tfbridge.SchemaInfo{
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
			"access_token": {
				Secret: tfbridge.True(),
			},
		},
		ExtraConfig: map[string]*tfbridge.ConfigInfo{
			"skipRegionValidation": {
				Schema: shimv2.NewSchema(&schema.Schema{
					Type:     schema.TypeBool,
					Optional: true,
				}),
				Info: &tfbridge.SchemaInfo{
					Default: &tfbridge.DefaultInfo{
						Value:   false,
						EnvVars: []string{"PULUMI_GCP_SKIP_REGION_VALIDATION"},
					},
				},
			},
		},
		PreConfigureCallbackWithLogger: preConfigureCallbackWithLogger(&credentialsValidationRun, nil),
		Resources: map[string]*tfbridge.ResourceInfo{
			// Access Context Manager
			"google_access_context_manager_access_level": {
				Tok: gcpResource(gcpAccessContextManager, "AccessLevel"),
			},
			"google_access_context_manager_access_policy": {
				Tok: gcpResource(gcpAccessContextManager, "AccessPolicy"),
			},
			"google_access_context_manager_service_perimeter": {
				Tok: gcpResource(gcpAccessContextManager, "ServicePerimeter"),
			},
			"google_access_context_manager_service_perimeter_resource": {
				Tok: gcpResource(gcpAccessContextManager, "ServicePerimeterResource"),
			},
			"google_access_context_manager_service_perimeters": {
				Tok: gcpResource(gcpAccessContextManager, "ServicePerimeters"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"service_perimeters": {
						CSharpName: "ServicePerimeterDetails",
					},
				},
			},
			"google_access_context_manager_access_levels": {
				Tok: gcpResource(gcpAccessContextManager, "AccessLevels"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"access_levels": {
						CSharpName: "AccessLevelDetails",
					},
				},
			},
			"google_access_context_manager_access_level_condition": {
				Tok: gcpResource(gcpAccessContextManager, "AccessLevelCondition"),
			},
			"google_access_context_manager_gcp_user_access_binding": {
				Tok: gcpResource(gcpAccessContextManager, "GcpUserAccessBinding"),
			},
			"google_access_context_manager_access_policy_iam_binding": {
				Tok: gcpResource(gcpAccessContextManager, "AccessPolicyIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "access_context_manager_access_policy_iam.html.markdown",
				},
			},
			"google_access_context_manager_access_policy_iam_member": {
				Tok: gcpResource(gcpAccessContextManager, "AccessPolicyIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "access_context_manager_access_policy_iam.html.markdown",
				},
			},
			"google_access_context_manager_access_policy_iam_policy": {
				Tok: gcpResource(gcpAccessContextManager, "AccessPolicyIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "access_context_manager_access_policy_iam.html.markdown",
				},
			},
			"google_access_context_manager_authorized_orgs_desc": {
				Tok: gcpResource(gcpAccessContextManager, "AuthorizedOrgsDesc"),
			},
			"google_access_context_manager_ingress_policy": {
				Tok: gcpResource(gcpAccessContextManager, "IngressPolicy"),
			},

			// Alloydb
			"google_alloydb_backup":   {Tok: gcpResource(gcpAlloydb, "Backup")},
			"google_alloydb_cluster":  {Tok: gcpResource(gcpAlloydb, "Cluster")},
			"google_alloydb_instance": {Tok: gcpResource(gcpAlloydb, "Instance")},

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
			"google_app_engine_service_split_traffic": {Tok: gcpResource(gcpAppEngine, "EngineSplitTraffic")},

			// BigQuery Analytics Hub
			"google_bigquery_analytics_hub_data_exchange_iam_binding": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "DataExchangeIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_data_exchange_iam.html.markdown",
				},
			},
			"google_bigquery_analytics_hub_data_exchange_iam_member": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "DataExchangeIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_data_exchange_iam.html.markdown",
				},
			},
			"google_bigquery_analytics_hub_data_exchange_iam_policy": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "DataExchangeIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_data_exchange_iam.html.markdown",
				},
			},
			"google_bigquery_analytics_hub_listing_iam_binding": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "ListingIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_listing_iam.html.markdown",
				},
			},
			"google_bigquery_analytics_hub_listing_iam_member": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "ListingIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_listing_iam.html.markdown",
				},
			},
			"google_bigquery_analytics_hub_listing_iam_policy": {
				Tok: gcpResource(gcpBigQueryAnalyticsHub, "ListingIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_analytics_hub_listing_iam.html.markdown",
				},
			},

			// BigQuery Data Policy
			"google_bigquery_datapolicy_data_policy": {Tok: gcpResource(gcpBigQueryDataPolicy, "DataPolicy")},
			"google_bigquery_datapolicy_data_policy_iam_binding": {
				Tok: gcpResource(gcpBigQueryDataPolicy, "DataPolicyIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_datapolicy_data_policy_iam.html.markdown",
				},
			},
			"google_bigquery_datapolicy_data_policy_iam_member": {
				Tok: gcpResource(gcpBigQueryDataPolicy, "DataPolicyIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_datapolicy_data_policy_iam.html.markdown",
				},
			},
			"google_bigquery_datapolicy_data_policy_iam_policy": {
				Tok: gcpResource(gcpBigQueryDataPolicy, "DataPolicyIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_datapolicy_data_policy_iam.html.markdown",
				},
			},

			// BigQuery

			// Note: the TF type token says bigtable (not bigquery) so this token cannot be auto-mapped.
			"google_bigtable_app_profile": {Tok: gcpResource(gcpBigQuery, "AppProfile")},

			"google_bigquery_dataset_access": {
				Tok: gcpResource(gcpBigQuery, "DatasetAccess"),
				// The upstream provider has nested attributes, both called "dataset", which causes a panic in the
				// bridge due to the duplicated names. In order to resolve the panic (and also to clarify the meaning of
				// the field), we use the name "authorizedDataset", which is derived from the title of the example code
				// in the upstream docs:
				// https://registry.terraform.io/providers/hashicorp/google-beta/latest/docs/resources/bigquery_dataset_access#example-usage---bigquery-dataset-access-authorized-dataset
				Fields: map[string]*tfbridge.SchemaInfo{
					"dataset": {
						Name: "authorizedDataset",
					},
				},
			},
			"google_bigquery_dataset_iam_binding": {
				Tok: gcpResource(gcpBigQuery, "DatasetIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_dataset_iam.html.markdown",
				},
			},
			"google_bigquery_dataset_iam_member": {
				Tok: gcpResource(gcpBigQuery, "DatasetIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_dataset_iam.html.markdown",
				},
			},
			"google_bigquery_dataset_iam_policy": {
				Tok: gcpResource(gcpBigQuery, "DatasetIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_dataset_iam.html.markdown",
				},
			},
			"google_bigquery_table_iam_policy": {
				Tok: gcpResource(gcpBigQuery, "IamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_table_iam.html.markdown",
				},
			},
			"google_bigquery_table_iam_binding": {
				Tok: gcpResource(gcpBigQuery, "IamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_table_iam.html.markdown",
				},
			},
			"google_bigquery_table_iam_member": {
				Tok: gcpResource(gcpBigQuery, "IamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_table_iam.html.markdown",
				},
			},
			"google_bigquery_routine":                {Tok: gcpResource(gcpBigQuery, "Routine")},
			"google_bigquery_reservation_assignment": {Tok: gcpResource(gcpBigQuery, "ReservationAssignment")},
			"google_bigquery_connection_iam_binding": {
				Tok: gcpResource(gcpBigQuery, "ConnectionIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_connection_iam.html.markdown",
				},
			},
			"google_bigquery_connection_iam_member": {
				Tok: gcpResource(gcpBigQuery, "ConnectionIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_connection_iam.html.markdown",
				},
			},
			"google_bigquery_connection_iam_policy": {
				Tok: gcpResource(gcpBigQuery, "ConnectionIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigquery_connection_iam.html.markdown",
				},
			},
			"google_bigquery_capacity_commitment": {
				Tok: gcpResource(gcpBigQuery, "CapacityCommitment"),
			},

			// BigTable
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
			"google_bigtable_table_iam_member": {
				Tok: gcpResource(gcpBigTable, "TableIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_table_iam.html.markdown",
				},
			},
			"google_bigtable_table_iam_binding": {
				Tok: gcpResource(gcpBigTable, "TableIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_table_iam.html.markdown",
				},
			},
			"google_bigtable_table_iam_policy": {
				Tok: gcpResource(gcpBigTable, "TableIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "bigtable_table_iam.html.markdown",
				},
			},

			// Billing
			"google_billing_account_iam_binding": {
				Tok: gcpResource(gcpBilling, "AccountIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "billing_account_iam.html.markdown",
				},
			},
			"google_billing_account_iam_member": {
				Tok: gcpResource(gcpBilling, "AccountIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "billing_account_iam.html.markdown",
				},
			},
			"google_billing_account_iam_policy": {
				Tok: gcpResource(gcpBilling, "AccountIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "billing_account_iam.html.markdown",
				},
			},
			"google_billing_subaccount": {Tok: gcpResource(gcpBilling, "SubAccount")},

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

			// Cloud Build V2
			"google_cloudbuildv2_connection_iam_binding": {
				Tok: gcpResource(gcpCloudBuildV2, "ConnectionIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudbuildv2_connection_iam.html.markdown",
				},
			},
			"google_cloudbuildv2_connection_iam_member": {
				Tok: gcpResource(gcpCloudBuildV2, "ConnectionIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudbuildv2_connection_iam.html.markdown",
				},
			},
			"google_cloudbuildv2_connection_iam_policy": {
				Tok: gcpResource(gcpCloudBuildV2, "ConnectionIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudbuildv2_connection_iam.html.markdown",
				},
			},

			// Cloud Functions
			"google_cloudfunctions_function": {
				Tok: gcpResource(gcpCloudFunctions, "Function"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Name must start with a letter followed by up to 62 letters, numbers, or
					// hyphens, and cannot end with a hyphen
					"name": tfbridge.AutoName("name", 63, "-"),
				},
			},
			"google_cloudfunctions_function_iam_binding": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions_function_iam_member": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions_function_iam_policy": {
				Tok: gcpResource(gcpCloudFunctions, "FunctionIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions_function_iam.html.markdown",
				},
			},

			// Cloud Functions (2nd gen)
			"google_cloudfunctions2_function_iam_binding": {
				Tok: gcpResource(gcpCloudFunctionsV2, "FunctionIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions2_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions2_function_iam_member": {
				Tok: gcpResource(gcpCloudFunctionsV2, "FunctionIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions2_function_iam.html.markdown",
				},
			},
			"google_cloudfunctions2_function_iam_policy": {
				Tok: gcpResource(gcpCloudFunctionsV2, "FunctionIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudfunctions2_function_iam.html.markdown",
				},
			},

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
					Source: "google_folder_iam.html.markdown",
				},
			},
			"google_folder_iam_member": {
				Tok: gcpResource(gcpFolder, "IAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam.html.markdown",
				},
			},
			"google_folder_iam_policy": {
				Tok: gcpResource(gcpFolder, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam.html.markdown",
				},
			},
			"google_folder_organization_policy": {
				Tok: gcpResource(gcpFolder, "OrganizationPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_organization_policy.html.markdown",
				},
			},
			"google_folder_iam_audit_config": {
				Tok: gcpResource(gcpFolder, "IamAuditConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "google_folder_iam.html.markdown",
				},
			},
			"google_gke_hub_scope_iam_binding": {
				Tok: gcpResource(gcpGkeHub, "ScopeIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_scope_iam.html.markdown",
				},
			},
			"google_gke_hub_scope_iam_member": {
				Tok: gcpResource(gcpGkeHub, "ScopeIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_scope_iam.html.markdown",
				},
			},
			"google_gke_hub_scope_iam_policy": {
				Tok: gcpResource(gcpGkeHub, "ScopeIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_scope_iam.html.markdown",
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
					Source: "google_organization_iam.html.markdown",
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
					Source: "google_organization_iam.html.markdown",
				},
			},
			"google_organization_iam_policy": {
				Tok: gcpResource(gcpOrganization, "IAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam.html.markdown",
				},
			},
			"google_organization_iam_audit_config": {
				Tok: gcpResource(gcpOrganization, "IamAuditConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization_iam.html.markdown",
				},
			},
			"google_organization_access_approval_settings": {
				Tok: gcpResource(gcpOrganization, "AccessApprovalSettings"),
			},
			"google_project": {
				Tok: gcpResource(gcpOrganization, "Project"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// A project ID is a unique string used to differentiate your project from all
					// others in Google Cloud. After you enter a project name, the Google Cloud
					// console generates a unique project ID that can be a combination of letters,
					// numbers, and hyphens. We recommend you use the generated project ID, but you
					// can edit it during project creation. After the project has been created, the
					// project ID is permanent.
					//
					// A project ID has the following requirements:
					//
					// - Must be 6 to 30 characters in length.
					// - Can only contain lowercase letters, numbers, and hyphens.
					// - Must start with a letter.
					// - Cannot end with a hyphen.
					// - Cannot be in use or previously used; this includes deleted projects.
					// - Cannot contain restricted strings, such as google, null, undefined, and ssl.
					//
					// From https://cloud.google.com/resource-manager/docs/creating-managing-projects
					"project_id": tfbridge.AutoNameWithCustomOptions("",
						tfbridge.AutoNameOptions{
							Separator: "-",
							Maxlen:    30,
							Randlen:   7,
							Transform: strings.ToLower,
						}),

					"name": tfbridge.AutoNameWithCustomOptions("name",
						// Name is auto-named without any suffix.
						tfbridge.AutoNameOptions{Randlen: 0}),
				},
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
			"google_project_usage_export_bucket": {
				Tok: gcpResource(gcpProject, "UsageExportBucket"),
				Docs: &tfbridge.DocInfo{
					Source: "google_project.html.markdown",
				},
			},
			"google_project_access_approval_settings": {
				Tok: gcpResource(gcpProject, "AccessApprovalSettings"),
			},
			// This resource is in the root namespace in the TF provider at the time of writing. The GCP SDK does not
			// give an obvious namespace choice either. Since an API key authenticates an application, we put it under
			// the gcpProject module:
			"google_apikeys_key": {Tok: gcpResource(gcpProject, "ApiKey")},

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

			// Service Usage
			"google_service_usage_consumer_quota_override": {
				Tok: gcpResource(gcpServiceUsage, "ConsumerQuotaOverride"),
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
				Tok: gcpResource(gcpCompute, "Autoscaler"),
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
			"google_compute_backend_bucket_iam_binding": {
				Tok: gcpResource(gcpCompute, "BackendBucketIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket_iam.html.markdown",
				},
			},
			"google_compute_backend_bucket_iam_member": {
				Tok: gcpResource(gcpCompute, "BackendBucketIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket_iam.html.markdown",
				},
			},
			"google_compute_backend_bucket_iam_policy": {
				Tok: gcpResource(gcpCompute, "BackendBucketIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket_iam.html.markdown",
				},
			},
			"google_compute_backend_bucket_signed_url_key": {
				Tok: gcpResource(gcpCompute, "BackendBucketSignedUrlKey"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_bucket_signed_url_key.html.markdown",
				},
			},
			"google_compute_backend_service": {
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service.html.markdown",
				},
				Fields: nameField(lowercaseAutoName()),
			},
			"google_compute_backend_service_signed_url_key": {
				Tok: gcpResource(gcpCompute, "BackendServiceSignedUrlKey"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service_signed_url_key.html.markdown",
				},
			},
			"google_compute_disk":                          {Tok: gcpResource(gcpCompute, "Disk")},
			"google_compute_firewall":                      {Tok: gcpResource(gcpCompute, "Firewall")},
			"google_compute_firewall_policy":               {Tok: gcpResource(gcpCompute, "FirewallPolicy")},
			"google_compute_firewall_policy_rule":          {Tok: gcpResource(gcpCompute, "FirewallPolicyRule")},
			"google_compute_firewall_policy_association":   {Tok: gcpResource(gcpCompute, "FirewallPolicyAssociation")},
			"google_compute_forwarding_rule":               {Tok: gcpResource(gcpCompute, "ForwardingRule")},
			"google_compute_external_vpn_gateway":          {Tok: gcpResource(gcpCompute, "ExternalVpnGateway")},
			"google_compute_global_address":                {Tok: gcpResource(gcpCompute, "GlobalAddress")},
			"google_compute_global_forwarding_rule":        {Tok: gcpResource(gcpCompute, "GlobalForwardingRule")},
			"google_compute_global_network_endpoint":       {Tok: gcpResource(gcpCompute, "GlobalNetworkEndpoint")},
			"google_compute_global_network_endpoint_group": {Tok: gcpResource(gcpCompute, "GlobalNetworkEndpointGroup")},
			"google_compute_ha_vpn_gateway":                {Tok: gcpResource(gcpCompute, "HaVpnGateway")},
			"google_compute_health_check":                  {Tok: gcpResource(gcpCompute, "HealthCheck")},
			"google_compute_http_health_check":             {Fields: nameField(lowercaseAutoName())},
			"google_compute_https_health_check":            {Fields: nameField(lowercaseAutoName())},
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
			"google_compute_instance_template": {
				Tok: gcpResource(gcpCompute, "InstanceTemplate"),
				UniqueNameFields: []string{
					"name",
					"name-prefix",
				},
			},
			"google_compute_interconnect_attachment": {Tok: gcpResource(gcpCompute, "InterconnectAttachment")},
			"google_compute_machine_image_iam_binding": {
				Tok: gcpResource(gcpCompute, "MachineImageIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_machine_image_iam.html.markdown",
				},
			},
			"google_compute_machine_image_iam_member": {
				Tok: gcpResource(gcpCompute, "MachineImageIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_machine_image_iam.html.markdown",
				},
			},
			"google_compute_machine_image_iam_policy": {
				Tok: gcpResource(gcpCompute, "MachineImageIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_machine_image_iam.html.markdown",
				},
			},
			"google_compute_node_group":       {Tok: gcpResource(gcpCompute, "NodeGroup")},
			"google_compute_node_template":    {Tok: gcpResource(gcpCompute, "NodeTemplate")},
			"google_compute_network_endpoint": {Tok: gcpResource(gcpCompute, "NetworkEndpoint")},
			"google_compute_network_endpoint_group": {
				Tok: gcpResource(gcpCompute, "NetworkEndpointGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_network_endpoint_group.html.markdown",
				},
			},
			"google_compute_network_firewall_policy":        {Tok: gcpResource(gcpCompute, "NetworkFirewallPolicy")},
			"google_compute_network_firewall_policy_rule":   {Tok: gcpResource(gcpCompute, "NetworkFirewallPolicyRule")},
			"google_compute_network_peering":                {Tok: gcpResource(gcpCompute, "NetworkPeering")},
			"google_compute_network_peering_routes_config":  {Tok: gcpResource(gcpCompute, "NetworkPeeringRoutesConfig")},
			"google_compute_network":                        {Fields: nameField(lowercaseAutoName())},
			"google_compute_project_default_network_tier":   {Tok: gcpResource(gcpCompute, "ProjectDefaultNetworkTier")},
			"google_compute_project_metadata":               {Tok: gcpResource(gcpCompute, "ProjectMetadata")},
			"google_compute_project_metadata_item":          {Tok: gcpResource(gcpCompute, "ProjectMetadataItem")},
			"google_compute_region_autoscaler":              {Tok: gcpResource(gcpCompute, "RegionAutoscaler")},
			"google_compute_region_backend_service":         {Tok: gcpResource(gcpCompute, "RegionBackendService")},
			"google_compute_region_disk":                    {Tok: gcpResource(gcpCompute, "RegionDisk")},
			"google_compute_region_network_firewall_policy": {Tok: gcpResource(gcpCompute, "RegionNetworkFirewallPolicy")},
			"google_compute_region_ssl_certificate":         {Tok: gcpResource(gcpCompute, "RegionSslCertificate")},
			"google_compute_region_target_http_proxy":       {Tok: gcpResource(gcpCompute, "RegionTargetHttpProxy")},
			"google_compute_region_target_https_proxy":      {Tok: gcpResource(gcpCompute, "RegionTargetHttpsProxy")},
			"google_compute_region_target_tcp_proxy":        {Tok: gcpResource(gcpCompute, "RegionTargetTcpProxy")},
			"google_compute_region_network_endpoint_group":  {Tok: gcpResource(gcpCompute, "RegionNetworkEndpointGroup")},
			"google_compute_region_ssl_policy":              {Tok: gcpResource(gcpCompute, "RegionSslPolicy")},
			"google_compute_resource_policy":                {Tok: gcpResource(gcpCompute, "ResourcePolicy")},
			"google_compute_route":                          {Tok: gcpResource(gcpCompute, "Route")},
			"google_compute_router":                         {Fields: nameField(lowercaseAutoName())},
			"google_compute_router_interface":               {Tok: gcpResource(gcpCompute, "RouterInterface")},
			"google_compute_router_nat": {
				Tok:    gcpResource(gcpCompute, "RouterNat"),
				Fields: nameField(lowercaseAutoName()),
			},
			"google_compute_router_peer": {
				Tok: gcpResource(gcpCompute, "RouterPeer"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_router_bgp_peer.html.markdown",
				},
			},
			"google_compute_security_policy":            {Tok: gcpResource(gcpCompute, "SecurityPolicy")},
			"google_security_scanner_scan_config":       {Tok: gcpResource(gcpCompute, "SecurityScanConfig")},
			"google_compute_shared_vpc_host_project":    {Tok: gcpResource(gcpCompute, "SharedVPCHostProject")},
			"google_compute_shared_vpc_service_project": {Tok: gcpResource(gcpCompute, "SharedVPCServiceProject")},
			"google_compute_snapshot":                   {Tok: gcpResource(gcpCompute, "Snapshot")},
			"google_compute_snapshot_iam_binding": {
				Tok: gcpResource(gcpCompute, "SnapshotIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_snapshot_iam.html.markdown",
				},
			},
			"google_compute_snapshot_iam_member": {
				Tok: gcpResource(gcpCompute, "SnapshotIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_snapshot_iam.html.markdown",
				},
			},
			"google_compute_snapshot_iam_policy": {
				Tok: gcpResource(gcpCompute, "SnapshotIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_snapshot_iam.html.markdown",
				},
			},
			"google_compute_ssl_certificate": {Tok: gcpResource(gcpCompute, "SSLCertificate")},
			"google_compute_ssl_policy":      {Tok: gcpResource(gcpCompute, "SSLPolicy")},
			"google_compute_subnetwork":      {Fields: nameField(lowercaseAutoName())},
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
			"google_compute_target_http_proxy": {
				Tok:    gcpResource(gcpCompute, "TargetHttpProxy"),
				Fields: nameField(lowercaseAutoName()),
			},
			"google_compute_target_https_proxy": {
				Tok:    gcpResource(gcpCompute, "TargetHttpsProxy"),
				Fields: nameField(lowercaseAutoName()),
			},
			"google_compute_target_instance":   {Tok: gcpResource(gcpCompute, "TargetInstance")},
			"google_compute_target_ssl_proxy":  {Tok: gcpResource(gcpCompute, "TargetSSLProxy")},
			"google_compute_target_tcp_proxy":  {Tok: gcpResource(gcpCompute, "TargetTCPProxy")},
			"google_compute_target_pool":       {Tok: gcpResource(gcpCompute, "TargetPool")},
			"google_compute_target_grpc_proxy": {Tok: gcpResource(gcpCompute, "TargetGrpcProxy")},
			"google_compute_url_map": {
				Tok:    gcpResource(gcpCompute, "URLMap"),
				Fields: nameField(lowercaseAutoName()),
			},
			"google_compute_vpn_gateway":         {Tok: gcpResource(gcpCompute, "VPNGateway")},
			"google_compute_vpn_tunnel":          {Tok: gcpResource(gcpCompute, "VPNTunnel")},
			"google_compute_reservation":         {Tok: gcpResource(gcpCompute, "Reservation")},
			"google_compute_region_health_check": {Tok: gcpResource(gcpCompute, "RegionHealthCheck")},
			"google_compute_region_url_map":      {Tok: gcpResource(gcpCompute, "RegionUrlMap")},
			"google_compute_region_disk_resource_policy_attachment": {
				Tok: gcpResource(gcpCompute, "RegionDiskResourcePolicyAttachment"),
			},
			"google_compute_disk_resource_policy_attachment": {
				Tok: gcpResource(gcpCompute, "DiskResourcePolicyAttachment"),
			},
			"google_compute_packet_mirroring":           {Tok: gcpResource(gcpCompute, "PacketMirroring")},
			"google_compute_instance_group_named_port":  {Tok: gcpResource(gcpCompute, "InstanceGroupNamedPort")},
			"google_compute_per_instance_config":        {Tok: gcpResource(gcpCompute, "PerInstanceConfig")},
			"google_compute_region_per_instance_config": {Tok: gcpResource(gcpCompute, "RegionPerInstanceConfig")},
			"google_compute_machine_image":              {Tok: gcpResource(gcpCompute, "MachineImage")},
			"google_compute_image_iam_binding": {
				Tok: gcpResource(gcpCompute, "ImageIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_image_iam.html.markdown",
				},
			},
			"google_compute_image_iam_member": {
				Tok: gcpResource(gcpCompute, "ImageIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_image_iam.html.markdown",
				},
			},
			"google_compute_image_iam_policy": {
				Tok: gcpResource(gcpCompute, "ImageIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_image_iam.html.markdown",
				},
			},
			"google_compute_disk_iam_binding": {
				Tok: gcpResource(gcpCompute, "DiskIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_disk_iam_member": {
				Tok: gcpResource(gcpCompute, "DiskIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_disk_iam_policy": {
				Tok: gcpResource(gcpCompute, "DiskIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_region_disk_iam_binding": {
				Tok: gcpResource(gcpCompute, "RegionDiskIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_region_disk_iam_member": {
				Tok: gcpResource(gcpCompute, "RegionDiskIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_region_disk_iam_policy": {
				Tok: gcpResource(gcpCompute, "RegionDiskIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_disk_iam.html.markdown",
				},
			},
			"google_compute_organization_security_policy_rule": {
				Tok: gcpResource(gcpCompute, "OrganizationSecurityPolicyRule"),
			},
			"google_compute_organization_security_policy_association": {
				Tok: gcpResource(gcpCompute, "OrganizationSecurityPolicyAssociation"),
			},
			"google_compute_organization_security_policy": {
				Tok: gcpResource(gcpCompute, "OrganizationSecurityPolicy"),
			},
			"google_compute_service_attachment": {Tok: gcpResource(gcpCompute, "ServiceAttachment")},
			"google_compute_backend_service_iam_binding": {
				Tok: gcpResource(gcpCompute, "BackendServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service_iam.html.markdown",
				},
			},
			"google_compute_backend_service_iam_member": {
				Tok: gcpResource(gcpCompute, "BackendServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service_iam.html.markdown",
				},
			},
			"google_compute_backend_service_iam_policy": {
				Tok: gcpResource(gcpCompute, "BackendServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_backend_service_iam.html.markdown",
				},
			},
			"google_compute_region_backend_service_iam_binding": {
				Tok: gcpResource(gcpCompute, "RegionBackendServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_region_backend_service_iam.html.markdown",
				},
			},
			"google_compute_region_backend_service_iam_member": {
				Tok: gcpResource(gcpCompute, "RegionBackendServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_region_backend_service_iam.html.markdown",
				},
			},
			"google_compute_region_backend_service_iam_policy": {
				Tok: gcpResource(gcpCompute, "RegionBackendServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "compute_region_backend_service_iam.html.markdown",
				},
			},
			"google_compute_region_commitment":        {Tok: gcpResource(gcpCompute, "RegionCommitment")},
			"google_compute_region_instance_template": {Tok: gcpResource(gcpCompute, "RegionInstanceTemplate")},
			"google_compute_public_advertised_prefix": {Tok: gcpResource(gcpCompute, "PublicAdvertisedPrefix")},
			"google_compute_public_delegated_prefix":  {Tok: gcpResource(gcpCompute, "PublicDelegatedPrefix")},

			// Container Analysis resources
			"google_container_analysis_note": {
				Tok: gcpResource(gcpContainerAnalysis, "Note"),
				Docs: &tfbridge.DocInfo{
					Source: "container_analysis_note.html.markdown",
				},
			},
			"google_container_analysis_note_iam_binding": {
				Tok: gcpResource(gcpContainerAnalysis, "NoteIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "container_analysis_note_iam.html.markdown",
				},
			},
			"google_container_analysis_note_iam_member": {
				Tok: gcpResource(gcpContainerAnalysis, "NoteIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "container_analysis_note_iam.html.markdown",
				},
			},
			"google_container_analysis_note_iam_policy": {
				Tok: gcpResource(gcpContainerAnalysis, "NoteIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "container_analysis_note_iam.html.markdown",
				},
			},

			"google_container_analysis_occurrence": {
				// nolint:misspell
				Tok: gcpResource(gcpContainerAnalysis, "Occurence"),
			},

			// Container/Kubernetes resources
			"google_container_cluster":          {Tok: gcpResource(gcpKubernetes, "Cluster")},
			"google_container_node_pool":        {Tok: gcpResource(gcpKubernetes, "NodePool")},
			"google_container_registry":         {Tok: gcpResource(gcpKubernetes, "Registry")},
			"google_container_aws_cluster":      {Tok: gcpResource(gcpKubernetes, "AwsCluster")},
			"google_container_aws_node_pool":    {Tok: gcpResource(gcpKubernetes, "AwsNodePool")},
			"google_container_azure_client":     {Tok: gcpResource(gcpKubernetes, "AzureClient")},
			"google_container_azure_cluster":    {Tok: gcpResource(gcpKubernetes, "AzureCluster")},
			"google_container_azure_node_pool":  {Tok: gcpResource(gcpKubernetes, "AzureNodePool")},
			"google_container_attached_cluster": {Tok: gcpResource(gcpKubernetes, "AttachedCluster")},

			// Data Flow resources
			"google_dataflow_job":               {Tok: gcpResource(gcpDataFlow, "Job")},
			"google_dataflow_flex_template_job": {Tok: gcpResource(gcpDataFlow, "FlexTemplateJob")},

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
			"google_dataproc_autoscaling_policy_iam_binding": {
				Tok: gcpResource(gcpDataProc, "AutoscalingPolicyIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_autoscaling_policy_iam.html.markdown",
				},
			},
			"google_dataproc_autoscaling_policy_iam_member": {
				Tok: gcpResource(gcpDataProc, "AutoscalingPolicyIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_autoscaling_policy_iam.html.markdown",
				},
			},
			"google_dataproc_autoscaling_policy_iam_policy": {
				Tok: gcpResource(gcpDataProc, "AutoscalingPolicyIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_autoscaling_policy_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_service": {Tok: gcpResource(gcpDataProc, "MetastoreService")},
			"google_dataproc_metastore_service_iam_binding": {
				Tok: gcpResource(gcpDataProc, "MetastoreServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_service_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_service_iam_member": {
				Tok: gcpResource(gcpDataProc, "MetastoreServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_service_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_service_iam_policy": {
				Tok: gcpResource(gcpDataProc, "MetastoreServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_service_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_federation": {Tok: gcpResource(gcpDataProc, "MetastoreFederation")},
			"google_dataproc_metastore_federation_iam_binding": {
				Tok: gcpResource(gcpDataProc, "MetastoreFederationIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_federation_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_federation_iam_member": {
				Tok: gcpResource(gcpDataProc, "MetastoreFederationIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_federation_iam.html.markdown",
				},
			},
			"google_dataproc_metastore_federation_iam_policy": {
				Tok: gcpResource(gcpDataProc, "MetastoreFederationIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataproc_metastore_federation_iam.html.markdown",
				},
			},

			"google_dataproc_workflow_template": {Tok: gcpResource(gcpDataProc, "WorkflowTemplate")},

			// DataStore resources
			"google_datastore_index": {Tok: gcpResource(gcpDatastore, "DataStoreIndex")},

			// DNS resources
			"google_dns_managed_zone": {
				Tok: gcpResource(gcpDNS, "ManagedZone"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: tfbridge.ManagedByPulumi,
					},
				},
			},
			"google_dns_managed_zone_iam_binding": {
				Tok: gcpResource(gcpDNS, "DnsManagedZoneIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dns_managed_zone_iam.html.markdown",
				},
			},
			"google_dns_managed_zone_iam_member": {
				Tok: gcpResource(gcpDNS, "DnsManagedZoneIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dns_managed_zone_iam.html.markdown",
				},
			},
			"google_dns_managed_zone_iam_policy": {
				Tok: gcpResource(gcpDNS, "DnsManagedZoneIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dns_managed_zone_iam.html.markdown",
				},
			},
			"google_dns_policy": {Tok: gcpResource(gcpDNS, "Policy")},
			"google_dns_record_set": {
				Tok: gcpResource(gcpDNS, "RecordSet"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// Do not autoname RecordSet records, as the "name" of these is actually the true
					// domain name of the DNS record.
					"name": {Name: "name"},
				},
			},
			"google_dns_response_policy":      {Tok: gcpResource(gcpDNS, "ResponsePolicy")},
			"google_dns_response_policy_rule": {Tok: gcpResource(gcpDNS, "ResponsePolicyRule")},

			// EndPoints resources
			"google_endpoints_service": {Tok: gcpResource(gcpEndPoints, "Service")},
			"google_endpoints_service_iam_binding": {
				Tok: gcpResource(gcpEndPoints, "ServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_iam.html.markdown",
				},
			},
			"google_endpoints_service_iam_member": {
				Tok: gcpResource(gcpEndPoints, "ServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_iam.html.markdown",
				},
			},
			"google_endpoints_service_iam_policy": {
				Tok: gcpResource(gcpEndPoints, "ServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_iam.html.markdown",
				},
			},
			"google_endpoints_service_consumers_iam_binding": {
				Tok: gcpResource(gcpEndPoints, "ConsumersIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_consumers_iam.html.markdown",
				},
			},
			"google_endpoints_service_consumers_iam_member": {
				Tok: gcpResource(gcpEndPoints, "ConsumersIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_consumers_iam.html.markdown",
				},
			},
			"google_endpoints_service_consumers_iam_policy": {
				Tok: gcpResource(gcpEndPoints, "ConsumersIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "endpoints_service_consumers_iam.html.markdown",
				},
			},

			// Filestore resources
			"google_filestore_backup":   {Tok: gcpResource(gcpFilestore, "Backup")},
			"google_filestore_instance": {Tok: gcpResource(gcpFilestore, "Instance")},
			"google_filestore_snapshot": {Tok: gcpResource(gcpFilestore, "Snapshot")},

			// Firebase
			"google_firebase_project": {
				Tok: gcpResource(gcpFirebase, "Project"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						CSharpName: "ProjectID",
					},
				},
			},
			"google_firebase_android_app":       {Tok: gcpResource(gcpFirebase, "AndroidApp")},
			"google_firebase_apple_app":         {Tok: gcpResource(gcpFirebase, "AppleApp")},
			"google_firebase_web_app":           {Tok: gcpResource(gcpFirebase, "WebApp")},
			"google_firebase_hosting_channel":   {Tok: gcpResource(gcpFirebase, "HostingChannel")},
			"google_firebase_hosting_site":      {Tok: gcpResource(gcpFirebase, "HostingSite")},
			"google_firebase_hosting_release":   {Tok: gcpResource(gcpFirebase, "HostingRelease")},
			"google_firebase_hosting_version":   {Tok: gcpResource(gcpFirebase, "HostingVersion")},
			"google_firebase_storage_bucket":    {Tok: gcpResource(gcpFirebase, "StorageBucket")},
			"google_firebase_database_instance": {Tok: gcpResource(gcpFirebase, "DatabaseInstance")},

			// Firebaserules
			"google_firebaserules_release": {Tok: gcpResource(gcpFirebaserules, "Release")},
			"google_firebaserules_ruleset": {Tok: gcpResource(gcpFirebaserules, "Ruleset")},

			// Firestore resources
			"google_firestore_index":    {Tok: gcpResource(gcpFirestore, "Index")},
			"google_firestore_document": {Tok: gcpResource(gcpFirestore, "Document")},
			"google_firestore_database": {Tok: gcpResource(gcpFirestore, "Database")},
			"google_firestore_field": {
				Tok: gcpResource(gcpFirestore, "Field"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"field": {
						CSharpName: "FieldId",
					},
				},
			},

			// Monitoring resources
			"google_monitoring_alert_policy":         {Tok: gcpResource(gcpMonitoring, "AlertPolicy")},
			"google_monitoring_group":                {Tok: gcpResource(gcpMonitoring, "Group")},
			"google_monitoring_notification_channel": {Tok: gcpResource(gcpMonitoring, "NotificationChannel")},
			"google_monitoring_uptime_check_config":  {Tok: gcpResource(gcpMonitoring, "UptimeCheckConfig")},
			"google_monitoring_custom_service": {
				Tok: gcpResource(gcpMonitoring, "CustomService"),
				Docs: &tfbridge.DocInfo{
					Source: "monitoring_service.html.markdown",
				},
			},
			"google_monitoring_service": {
				Tok: gcpResource(gcpMonitoring, "GenericService"),
				Docs: &tfbridge.DocInfo{
					Source: "monitoring_service.html.markdown",
				},
			},
			"google_monitoring_slo":               {Tok: gcpResource(gcpMonitoring, "Slo")},
			"google_monitoring_dashboard":         {Tok: gcpResource(gcpMonitoring, "Dashboard")},
			"google_monitoring_metric_descriptor": {Tok: gcpResource(gcpMonitoring, "MetricDescriptor")},
			"google_monitoring_monitored_project": {Tok: gcpResource(gcpMonitoring, "MonitoredProject")},

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
			"google_pubsub_subscription":     {Tok: gcpResource(gcpPubSub, "Subscription")},
			"google_pubsub_lite_reservation": {Tok: gcpResource(gcpPubSub, "LiteReservation")},
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
			"google_pubsub_lite_subscription": {Tok: gcpResource(gcpPubSub, "LiteSubscription")},
			"google_pubsub_lite_topic":        {Tok: gcpResource(gcpPubSub, "LiteTopic")},
			"google_pubsub_schema":            {Tok: gcpResource(gcpPubSub, "Schema")},
			"google_pubsub_schema_iam_binding": {
				Tok: gcpResource(gcpPubSub, "SchemaIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_schema_iam.html.markdown",
				},
			},
			"google_pubsub_schema_iam_policy": {
				Tok: gcpResource(gcpPubSub, "SchemaIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_schema_iam.html.markdown",
				},
			},
			"google_pubsub_schema_iam_member": {
				Tok: gcpResource(gcpPubSub, "SchemaIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "pubsub_schema_iam.html.markdown",
				},
			},

			// Redis resources
			"google_redis_instance": {Tok: gcpResource(gcpRedis, "Instance")},

			// Resource Manager resources
			"google_resource_manager_lien": {
				Tok: gcpResource(gcpResourceManager, "Lien"),
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
			"google_service_networking_connection":        {Tok: gcpResource(gcpServiceNetworking, "Connection")},
			"google_service_networking_peered_dns_domain": {Tok: gcpResource(gcpServiceNetworking, "PeeredDnsDomain")},

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
			"google_sql_database":                       {Tok: gcpResource(gcpSQL, "Database")},
			"google_sql_database_instance":              {Tok: gcpResource(gcpSQL, "DatabaseInstance")},
			"google_sql_user":                           {Tok: gcpResource(gcpSQL, "User")},
			"google_sql_ssl_cert":                       {Tok: gcpResource(gcpSQL, "SslCert")},
			"google_sql_source_representation_instance": {Tok: gcpResource(gcpSQL, "SourceRepresentationInstance")},

			// Stackdriver Logging resources
			"google_logging_billing_account_exclusion":     {Tok: gcpResource(gcpLogging, "BillingAccountExclusion")},
			"google_logging_billing_account_sink":          {Tok: gcpResource(gcpLogging, "BillingAccountSink")},
			"google_logging_folder_exclusion":              {Tok: gcpResource(gcpLogging, "FolderExclusion")},
			"google_logging_folder_sink":                   {Tok: gcpResource(gcpLogging, "FolderSink")},
			"google_logging_metric":                        {Tok: gcpResource(gcpLogging, "Metric")},
			"google_logging_organization_exclusion":        {Tok: gcpResource(gcpLogging, "OrganizationExclusion")},
			"google_logging_organization_sink":             {Tok: gcpResource(gcpLogging, "OrganizationSink")},
			"google_logging_project_exclusion":             {Tok: gcpResource(gcpLogging, "ProjectExclusion")},
			"google_logging_project_sink":                  {Tok: gcpResource(gcpLogging, "ProjectSink")},
			"google_logging_billing_account_bucket_config": {Tok: gcpResource(gcpLogging, "BillingAccountBucketConfig")},
			"google_logging_folder_bucket_config":          {Tok: gcpResource(gcpLogging, "FolderBucketConfig")},
			"google_logging_organization_bucket_config":    {Tok: gcpResource(gcpLogging, "OrganizationBucketConfig")},
			"google_logging_project_bucket_config":         {Tok: gcpResource(gcpLogging, "ProjectBucketConfig")},
			"google_logging_log_view":                      {Tok: gcpResource(gcpLogging, "LogView")},
			"google_logging_linked_dataset":                {Tok: gcpResource(gcpLogging, "LinkedDataset")},

			// Database migration service resources
			"google_database_migration_service_connection_profile": {
				Tok: gcpResource(gcpDatabaseMigrationService, "ConnectionProfile"),
			},

			// GKE On-Prem resources
			"google_gkeonprem_bare_metal_cluster": {
				Tok: gcpResource(gcpGkeOnPrem, "BareMetalCluster"),
			},
			"google_gkeonprem_bare_metal_node_pool": {
				Tok: gcpResource(gcpGkeOnPrem, "BareMetalNodePool"),
			},
			"google_gkeonprem_vmware_cluster": {
				Tok: gcpResource(gcpGkeOnPrem, "VMwareCluster"),
			},
			"google_gkeonprem_vmware_node_pool": {
				Tok: gcpResource(gcpGkeOnPrem, "VMwareNodePool"),
			},

			// Storage resources
			"google_storage_bucket": {
				Tok: gcpResource(gcpStorage, "Bucket"),
				Fields: map[string]*tfbridge.SchemaInfo{
					// https://cloud.google.com/storage/docs/naming
					// Bucket names must contain 3 to 63 characters. Names containing dots can
					// contain up to 222 characters, but each dot-separated component can be no
					// longer than 63 characters.
					"name": tfbridge.AutoName("name", 222, "-"),
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
			"google_storage_transfer_agent_pool":           {Tok: gcpResource(gcpStorage, "TransferAgentPool")},
			"google_storage_transfer_job":                  {Tok: gcpResource(gcpStorage, "TransferJob")},
			"google_storage_bucket_access_control":         {Tok: gcpResource(gcpStorage, "BucketAccessControl")},
			"google_storage_hmac_key":                      {Tok: gcpResource(gcpStorage, "HmacKey")},

			// TPU resources
			"google_tpu_node": {Tok: gcpResource(gcpTPU, "Node")},

			// Vertex
			"google_vertex_ai_dataset":                         {Tok: gcpResource(gcpVertex, "AiDataset")},
			"google_vertex_ai_featurestore_entitytype":         {Tok: gcpResource(gcpVertex, "AiFeatureStoreEntityType")},
			"google_vertex_ai_featurestore_entitytype_feature": {Tok: gcpResource(gcpVertex, "AiFeatureStoreEntityTypeFeature")},
			"google_vertex_ai_featurestore_entitytype_iam_binding": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreEntityTypeIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_entitytype_iam.html.markdown",
				},
			},
			"google_vertex_ai_featurestore_entitytype_iam_member": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreEntityTypeIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_entitytype_iam.html.markdown",
				},
			},
			"google_vertex_ai_featurestore_entitytype_iam_policy": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreEntityTypeIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_entitytype_iam.html.markdown",
				},
			},
			"google_vertex_ai_featurestore": {Tok: gcpResource(gcpVertex, "AiFeatureStore")},
			"google_vertex_ai_featurestore_iam_binding": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_iam.html.markdown",
				},
			},
			"google_vertex_ai_featurestore_iam_member": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_iam.html.markdown",
				},
			},
			"google_vertex_ai_featurestore_iam_policy": {
				Tok: gcpResource(gcpVertex, "AiFeatureStoreIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "vertex_ai_featurestore_iam.html.markdown",
				},
			},
			"google_vertex_ai_index":          {Tok: gcpResource(gcpVertex, "AiIndex")},
			"google_vertex_ai_metadata_store": {Tok: gcpResource(gcpVertex, "AiMetadataStore")},
			"google_vertex_ai_endpoint":       {Tok: gcpResource(gcpVertex, "AiEndpoint")},
			"google_vertex_ai_tensorboard":    {Tok: gcpResource(gcpVertex, "AiTensorboard")},

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
			"google_kms_crypto_key_version": {
				Tok: gcpResource(gcpKMS, "CryptoKeyVersion"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_version.html.markdown",
				},
			},
			"google_kms_crypto_key_iam_binding": {
				Tok: gcpResource(gcpKMS, "CryptoKeyIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_iam.html.markdown",
				},
			},
			"google_kms_crypto_key_iam_member": {
				Tok: gcpResource(gcpKMS, "CryptoKeyIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_iam.html.markdown",
				},
			},
			"google_kms_crypto_key_iam_policy": {
				Tok: gcpResource(gcpKMS, "CryptoKeyIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "google_kms_crypto_key_iam.html.markdown",
				},
			},
			"google_kms_secret_ciphertext":   {Tok: gcpResource(gcpKMS, "SecretCiphertext")},
			"google_kms_key_ring_import_job": {Tok: gcpResource(gcpKMS, "KeyRingImportJob")},

			// Cloud IAP Resources
			"google_iap_tunnel_dest_group_iam_binding": {
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_dest_group_iam.html.markdown",
				},
			},
			"google_iap_tunnel_dest_group_iam_member": {
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_dest_group_iam.html.markdown",
				},
			},
			"google_iap_tunnel_dest_group_iam_policy": {
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_dest_group_iam.html.markdown",
				},
			},
			"google_iap_tunnel_instance_iam_binding": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_instance_iam.html.markdown",
				},
			},
			"google_iap_tunnel_instance_iam_member": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_instance_iam.html.markdown",
				},
			},
			"google_iap_tunnel_instance_iam_policy": {
				Tok: gcpResource(gcpIAP, "TunnelInstanceIAMPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_instance_iam.html.markdown",
				},
			},
			"google_iap_tunnel_iam_binding": {
				Tok: gcpResource(gcpIAP, "TunnelIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_iam.html.markdown",
				},
			},
			"google_iap_tunnel_iam_member": {
				Tok: gcpResource(gcpIAP, "TunnelIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_iam.html.markdown",
				},
			},
			"google_iap_tunnel_iam_policy": {
				Tok: gcpResource(gcpIAP, "TunnelIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_tunnel_iam.html.markdown",
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
			"google_iap_web_region_backend_service_iam_binding": {
				Tok: gcpResource(gcpIAP, "WebRegionBackendServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_region_backend_service_iam.html.markdown",
				},
			},
			"google_iap_web_region_backend_service_iam_member": {
				Tok: gcpResource(gcpIAP, "WebRegionBackendServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_region_backend_service_iam.html.markdown",
				},
			},
			"google_iap_web_region_backend_service_iam_policy": {
				Tok: gcpResource(gcpIAP, "WebRegionBackendServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "iap_web_region_backend_service_iam.html.markdown",
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
			"google_iap_brand":  {Tok: gcpResource(gcpIAP, "Brand")},
			"google_iap_client": {Tok: gcpResource(gcpIAP, "Client")},

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
				Fields: map[string]*tfbridge.SchemaInfo{
					// Prevent unwanted singularization of the property type to `Hl7StoreNotificationConfig` as that
					// clashes with an existing deprecated property
					"notification_configs": {
						Elem: &tfbridge.SchemaInfo{
							NestedType: "Hl7StoreNotificationConfigs",
						},
					},
				},
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
			"google_healthcare_consent_store": {Tok: gcpResource(gcpHealthcare, "ConsentStore")},
			"google_healthcare_consent_store_iam_binding": {
				Tok: gcpResource(gcpHealthcare, "ConsentStoreIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_consent_store_iam.html.markdown",
				},
			},
			"google_healthcare_consent_store_iam_member": {
				Tok: gcpResource(gcpHealthcare, "ConsentStoreIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_consent_store_iam.html.markdown",
				},
			},
			"google_healthcare_consent_store_iam_policy": {
				Tok: gcpResource(gcpHealthcare, "ConsentStoreIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "healthcare_consent_store_iam.html.markdown",
				},
			},

			// CloudRun Resources
			"google_cloud_run_domain_mapping": {Tok: gcpResource(gcpCloudRun, "DomainMapping")},
			"google_cloud_run_service":        {Tok: gcpResource(gcpCloudRun, "Service")},
			"google_cloud_run_service_iam_binding": {
				Tok:  gcpResource(gcpCloudRun, "IamBinding"),
				Docs: &tfbridge.DocInfo{Source: "cloud_run_service_iam.html.markdown"},
			},
			"google_cloud_run_service_iam_member": {
				Tok:  gcpResource(gcpCloudRun, "IamMember"),
				Docs: &tfbridge.DocInfo{Source: "cloud_run_service_iam.html.markdown"},
			},
			"google_cloud_run_service_iam_policy": {
				Tok:  gcpResource(gcpCloudRun, "IamPolicy"),
				Docs: &tfbridge.DocInfo{Source: "cloud_run_service_iam.html.markdown"},
			},

			// CloudRun V2 Resources
			"google_cloud_run_v2_job": {Tok: gcpResource(gcpCloudRunV2, "Job")},
			"google_cloud_run_v2_job_iam_binding": {
				Tok: gcpResource(gcpCloudRunV2, "JobIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_job_iam.html.markdown",
				},
			},
			"google_cloud_run_v2_job_iam_member": {
				Tok: gcpResource(gcpCloudRunV2, "JobIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_job_iam.html.markdown",
				},
			},
			"google_cloud_run_v2_job_iam_policy": {
				Tok: gcpResource(gcpCloudRunV2, "JobIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_job_iam.html.markdown",
				},
			},
			"google_cloud_run_v2_service": {Tok: gcpResource(gcpCloudRunV2, "Service")},
			"google_cloud_run_v2_service_iam_binding": {
				Tok: gcpResource(gcpCloudRunV2, "ServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_service_iam.html.markdown",
				},
			},
			"google_cloud_run_v2_service_iam_member": {
				Tok: gcpResource(gcpCloudRunV2, "ServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_service_iam.html.markdown",
				},
			},
			"google_cloud_run_v2_service_iam_policy": {
				Tok: gcpResource(gcpCloudRunV2, "ServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_run_v2_service_iam.html.markdown",
				},
			},

			// Machine Learning
			"google_ml_engine_model": {Tok: gcpResource(gcpMachingLearning, "EngineModel")},

			// Security Center
			"google_scc_source":              {Tok: gcpResource(gcpSecurityCenter, "Source")},
			"google_scc_notification_config": {Tok: gcpResource(gcpSecurityCenter, "NotificationConfig")},
			"google_scc_mute_config":         {Tok: gcpResource(gcpSecurityCenter, "MuteConfig")},
			"google_scc_source_iam_binding": {
				Tok: gcpResource(gcpSecurityCenter, "SourceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "scc_source.html.markdown",
				},
			},
			"google_scc_source_iam_member": {
				Tok: gcpResource(gcpSecurityCenter, "SourceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "scc_source.html.markdown",
				},
			},
			"google_scc_source_iam_policy": {
				Tok: gcpResource(gcpSecurityCenter, "SourceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "scc_source.html.markdown",
				},
			},

			// VPC Access
			"google_vpc_access_connector": {Tok: gcpResource(gcpVpcAccess, "Connector")},

			// DataFusion
			"google_data_fusion_instance": {Tok: gcpResource(gcpDataFusion, "Instance")},
			"google_data_fusion_instance_iam_binding": {
				Tok: gcpResource(gcpSecurityCenter, "InstanceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "data_fusion_instance.html.markdown",
				},
			},
			"google_data_fusion_instance_iam_member": {
				Tok: gcpResource(gcpSecurityCenter, "InstanceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "data_fusion_instance.html.markdown",
				},
			},
			"google_data_fusion_instance_iam_policy": {
				Tok: gcpResource(gcpSecurityCenter, "InstanceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_fusion_instance.html.markdown",
				},
			},

			// Cloudtasks
			"google_cloud_tasks_queue": {Tok: gcpResource(gcpCloudTasks, "Queue")},
			"google_cloud_tasks_queue_iam_binding": {
				Tok: gcpResource(gcpCloudTasks, "QueueIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_tasks_queue_iam.html.markdown",
				},
			},
			"google_cloud_tasks_queue_iam_member": {
				Tok: gcpResource(gcpCloudTasks, "QueueIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_tasks_queue_iam.html.markdown",
				},
			},
			"google_cloud_tasks_queue_iam_policy": {
				Tok: gcpResource(gcpCloudTasks, "QueueIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_tasks_queue_iam.html.markdown",
				},
			},

			// Deployment Manager
			"google_deployment_manager_deployment": {Tok: gcpResource(gcpDeploymentManager, "Deployment")},

			// Identity Platform
			"google_identity_platform_config": {
				Tok: gcpResource(gcpIdentityPlatform, "Config"),
			},
			"google_identity_platform_default_supported_idp_config": {
				Tok: gcpResource(gcpIdentityPlatform, "DefaultSupportedIdpConfig"),
			},
			"google_identity_platform_inbound_saml_config":    {Tok: gcpResource(gcpIdentityPlatform, "InboundSamlConfig")},
			"google_identity_platform_oauth_idp_config":       {Tok: gcpResource(gcpIdentityPlatform, "OauthIdpConfig")},
			"google_identity_platform_project_default_config": {Tok: gcpResource(gcpIdentityPlatform, "ProjectDefaultConfig")},
			"google_identity_platform_tenant_default_supported_idp_config": {
				Tok: gcpResource(gcpIdentityPlatform, "TenantDefaultSupportedIdpConfig"),
			},
			"google_identity_platform_tenant_inbound_saml_config": {
				Tok: gcpResource(gcpIdentityPlatform, "TenantInboundSamlConfig"),
			},
			"google_identity_platform_tenant_oauth_idp_config": {
				Tok: gcpResource(gcpIdentityPlatform, "TenantOauthIdpConfig"),
			},
			"google_identity_platform_tenant": {Tok: gcpResource(gcpIdentityPlatform, "Tenant")},

			// Secret Manager
			"google_secret_manager_secret": resourceSecretManagerSecret(),
			"google_secret_manager_secret_iam_binding": {
				Docs: &tfbridge.DocInfo{
					Source: "secret_manager_secret_iam.html.markdown",
				},
			},
			"google_secret_manager_secret_iam_member": {
				Docs: &tfbridge.DocInfo{
					Source: "secret_manager_secret_iam.html.markdown",
				},
			},
			"google_secret_manager_secret_iam_policy": {
				Docs: &tfbridge.DocInfo{
					Source: "secret_manager_secret_iam.html.markdown",
				},
			},

			// Org Policy
			"google_org_policy_custom_constraint": {Tok: gcpResource(gcpOrgPolicy, "CustomConstraint")},
			"google_org_policy_policy":            {Tok: gcpResource(gcpOrgPolicy, "Policy")},

			// OS Config
			"google_os_config_patch_deployment":     {Tok: gcpResource(gcpOsConfig, "PatchDeployment")},
			"google_os_config_guest_policies":       {Tok: gcpResource(gcpOsConfig, "GuestPolicies")},
			"google_os_config_os_policy_assignment": {Tok: gcpResource(gcpOsConfig, "OsPolicyAssignment")},

			// Recaptcha
			"google_recaptcha_enterprise_key": {Tok: gcpResource(gcpRecaptcha, "EnterpriseKey")},

			// Service Directory
			"google_service_directory_endpoint":  {Tok: gcpResource(gcpServiceDirectory, "Endpoint")},
			"google_service_directory_namespace": {Tok: gcpResource(gcpServiceDirectory, "Namespace")},
			"google_service_directory_namespace_iam_binding": {
				Tok: gcpResource(gcpServiceDirectory, "NamespaceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_namespace_iam.html.markdown",
				},
			},
			"google_service_directory_namespace_iam_member": {
				Tok: gcpResource(gcpServiceDirectory, "NamespaceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_namespace_iam.html.markdown",
				},
			},
			"google_service_directory_namespace_iam_policy": {
				Tok: gcpResource(gcpServiceDirectory, "NamespaceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_namespace_iam.html.markdown",
				},
			},
			"google_service_directory_service": {Tok: gcpResource(gcpServiceDirectory, "Service")},
			"google_service_directory_service_iam_binding": {
				Tok: gcpResource(gcpServiceDirectory, "ServiceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_service_iam.html.markdown",
				},
			},
			"google_service_directory_service_iam_member": {
				Tok: gcpResource(gcpServiceDirectory, "ServiceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_service_iam.html.markdown",
				},
			},
			"google_service_directory_service_iam_policy": {
				Tok: gcpResource(gcpServiceDirectory, "ServiceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "service_directory_service_iam.html.markdown",
				},
			},

			// ArtifactRegistry
			"google_artifact_registry_repository": {Tok: gcpResource(gcpArtifactRegistry, "Repository")},
			"google_artifact_registry_repository_iam_policy": {
				Tok: gcpResource(gcpArtifactRegistry, "RepositoryIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "artifact_registry_repository_iam.html.markdown",
				},
			},
			"google_artifact_registry_repository_iam_binding": {
				Tok: gcpResource(gcpArtifactRegistry, "RepositoryIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "artifact_registry_repository_iam.html.markdown",
				},
			},
			"google_artifact_registry_repository_iam_member": {
				Tok: gcpResource(gcpArtifactRegistry, "RepositoryIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "artifact_registry_repository_iam.html.markdown",
				},
			},

			// Data Catalog
			"google_data_catalog_entry":        {Tok: gcpResource(gcpDataCatalog, "Entry")},
			"google_data_catalog_tag":          {Tok: gcpResource(gcpDataCatalog, "Tag")},
			"google_data_catalog_entry_group":  {Tok: gcpResource(gcpDataCatalog, "EntryGroup")},
			"google_data_catalog_tag_template": {Tok: gcpResource(gcpDataCatalog, "TagTemplate")},
			"google_data_catalog_taxonomy": {
				Tok: gcpResource(gcpDataCatalog, "Taxonomy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_taxonomy.html.markdown",
				},
			},
			"google_data_catalog_policy_tag": {
				Tok: gcpResource(gcpDataCatalog, "PolicyTag"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_policy_tag.html.markdown ",
				},
			},
			"google_data_catalog_taxonomy_iam_binding": {
				Tok: gcpResource(gcpDataCatalog, "TaxonomyIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_taxonomy_iam.html.markdown",
				},
			},
			"google_data_catalog_taxonomy_iam_member": {
				Tok: gcpResource(gcpDataCatalog, "TaxonomyIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_taxonomy_iam.html.markdown",
				},
			},
			"google_data_catalog_taxonomy_iam_policy": {
				Tok: gcpResource(gcpDataCatalog, "TaxonomyIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_taxonomy_iam.html.markdown",
				},
			},
			"google_data_catalog_policy_tag_iam_binding": {
				Tok: gcpResource(gcpDataCatalog, "PolicyTagIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_policy_tag_iam.html.markdown",
				},
			},
			"google_data_catalog_policy_tag_iam_member": {
				Tok: gcpResource(gcpDataCatalog, "PolicyTagIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_policy_tag_iam.html.markdown",
				},
			},
			"google_data_catalog_policy_tag_iam_policy": {
				Tok: gcpResource(gcpDataCatalog, "PolicyTagIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_policy_tag_iam.html.markdown",
				},
			},
			"google_data_catalog_entry_group_iam_binding": {
				Tok: gcpResource(gcpDataCatalog, "EntryGroupIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_entry_group_iam.html.markdown",
				},
			},
			"google_data_catalog_entry_group_iam_member": {
				Tok: gcpResource(gcpDataCatalog, "EntryGroupIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_entry_group_iam.html.markdown",
				},
			},
			"google_data_catalog_entry_group_iam_policy": {
				Tok: gcpResource(gcpDataCatalog, "EntryGroupIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_entry_group_iam.html.markdown",
				},
			},
			"google_data_catalog_tag_template_iam_binding": {
				Tok: gcpResource(gcpDataCatalog, "TagTemplateIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_tag_template_iam.html.markdown",
				},
			},
			"google_data_catalog_tag_template_iam_member": {
				Tok: gcpResource(gcpDataCatalog, "TagTemplateIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_tag_template_iam.html.markdown",
				},
			},
			"google_data_catalog_tag_template_iam_policy": {
				Tok: gcpResource(gcpDataCatalog, "TagTemplateIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "data_catalog_tag_template_iam.html.markdown",
				},
			},

			// Memcache
			"google_memcache_instance": {Tok: gcpResource(gcpMemcache, "Instance")},

			// Network Connectivity
			"google_network_connectivity_hub":   {Tok: gcpResource(gcpNetworkConnectivity, "Hub")},
			"google_network_connectivity_spoke": {Tok: gcpResource(gcpNetworkConnectivity, "Spoke")},

			// Network Management
			"google_network_management_connectivity_test": {
				Tok: gcpResource(gcpNetworkManagement, "ConnectivityTest"),
				Docs: &tfbridge.DocInfo{
					Source: "network_management_connectivity_test_resource.html.markdown",
				},
			},

			// Network Security
			"google_network_security_gateway_security_policy":      {Tok: gcpResource(gcpNetworkSecurity, "GatewaySecurityPolicy")},
			"google_network_security_gateway_security_policy_rule": {Tok: gcpResource(gcpNetworkSecurity, "GatewaySecurityPolicyRule")},
			"google_network_security_url_lists":                    {Tok: gcpResource(gcpNetworkSecurity, "UrlList")},
			"google_network_security_address_group_iam_binding":    {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"google_network_security_address_group_iam_member":     {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"google_network_security_address_group_iam_policy":     {Docs: &tfbridge.DocInfo{Source: "network_security_address_group_iam.html.markdown"}},

			// Network Services
			"google_network_services_edge_cache_keyset":  {Tok: gcpResource(gcpNetworkServices, "EdgeCacheKeyset")},
			"google_network_services_edge_cache_origin":  {Tok: gcpResource(gcpNetworkServices, "EdgeCacheOrigin")},
			"google_network_services_edge_cache_service": {Tok: gcpResource(gcpNetworkServices, "EdgeCacheService")},
			"google_network_services_gateway":            {Tok: gcpResource(gcpNetworkServices, "Gateway")},
			"google_network_services_mesh":               {Tok: gcpResource(gcpNetworkServices, "Mesh")},
			"google_network_services_http_route":         {Tok: gcpResource(gcpNetworkServices, "HttpRoute")},
			"google_network_services_tcp_route":          {Tok: gcpResource(gcpNetworkServices, "TcpRoute")},

			// Notebook
			"google_notebooks_environment": {Tok: gcpResource(gcpNotebooks, "Environment")},
			"google_notebooks_instance":    {Tok: gcpResource(gcpNotebooks, "Instance")},
			"google_notebooks_location":    {Tok: gcpResource(gcpNotebooks, "Location")},
			"google_notebooks_instance_iam_binding": {
				Tok: gcpResource(gcpNotebooks, "InstanceIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_instance_iam.html.markdown",
				},
			},
			"google_notebooks_instance_iam_member": {
				Tok: gcpResource(gcpNotebooks, "InstanceIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_instance_iam.html.markdown",
				},
			},
			"google_notebooks_instance_iam_policy": {
				Tok: gcpResource(gcpNotebooks, "InstanceIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_instance_iam.html.markdown",
				},
			},
			"google_notebooks_runtime": {Tok: gcpResource(gcpNotebooks, "Runtime")},
			"google_notebooks_runtime_iam_binding": {
				Tok: gcpResource(gcpNotebooks, "RuntimeIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_runtime_iam.html.markdown",
				},
			},
			"google_notebooks_runtime_iam_member": {
				Tok: gcpResource(gcpNotebooks, "RuntimeIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_runtime_iam.html.markdown",
				},
			},
			"google_notebooks_runtime_iam_policy": {
				Tok: gcpResource(gcpNotebooks, "RuntimeIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "notebooks_runtime_iam.html.markdown",
				},
			},

			// CloudIdentity
			"google_cloud_identity_group_membership": {Tok: gcpResource(gcpCloudIdentity, "GroupMembership")},
			"google_cloud_identity_group":            {Tok: gcpResource(gcpCloudIdentity, "Group")},

			// CloudAsset
			"google_cloud_asset_folder_feed":       {Tok: gcpResource(gcpCloudAsset, "FolderFeed")},
			"google_cloud_asset_organization_feed": {Tok: gcpResource(gcpCloudAsset, "OrganizationFeed")},
			"google_cloud_asset_project_feed":      {Tok: gcpResource(gcpCloudAsset, "ProjectFeed")},

			// ActiveDirectory
			"google_active_directory_domain":       {Tok: gcpResource(gcpActiveDirectory, "Domain")},
			"google_active_directory_domain_trust": {Tok: gcpResource(gcpActiveDirectory, "DomainTrust")},
			"google_active_directory_peering":      {Tok: gcpResource(gcpActiveDirectory, "Peering")},

			// DataLoss
			"google_data_loss_prevention_inspect_template": {
				Tok: gcpResource(gcpDataLoss, "PreventionInspectTemplate"),
			},
			"google_data_loss_prevention_job_trigger": {
				Tok: gcpResource(gcpDataLoss, "PreventionJobTrigger"),
			},
			"google_data_loss_prevention_stored_info_type": {
				Tok: gcpResource(gcpDataLoss, "PreventionStoredInfoType"),
			},
			"google_data_loss_prevention_deidentify_template": {
				Tok: gcpResource(gcpDataLoss, "PreventionDeidentifyTemplate"),
			},

			// Dataplex
			"google_dataplex_lake":  {Tok: gcpResource(gcpDataPlex, "Lake")},
			"google_dataplex_asset": {Tok: gcpResource(gcpDataPlex, "Asset")},
			"google_dataplex_zone":  {Tok: gcpResource(gcpDataPlex, "Zone")},
			"google_dataplex_lake_iam_binding": {
				Tok:  gcpResource(gcpDataPlex, "LakeIamBinding"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_lake_iam.html.markdown"},
			},
			"google_dataplex_lake_iam_member": {
				Tok:  gcpResource(gcpDataPlex, "LakeIamMember"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_lake_iam.html.markdown"},
			},
			"google_dataplex_lake_iam_policy": {
				Tok:  gcpResource(gcpDataPlex, "LakeIamPolicy"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_lake_iam.html.markdown"},
			},
			"google_dataplex_asset_iam_binding": {
				Tok:  gcpResource(gcpDataPlex, "AssetIamBinding"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_asset_iam.html.markdown"},
			},
			"google_dataplex_asset_iam_member": {
				Tok:  gcpResource(gcpDataPlex, "AssetIamMember"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_asset_iam.html.markdown"},
			},
			"google_dataplex_asset_iam_policy": {
				Tok:  gcpResource(gcpDataPlex, "AssetIamPolicy"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_asset_iam.html.markdown"},
			},
			"google_dataplex_task_iam_binding": {
				Tok:  gcpResource(gcpDataPlex, "TaskIamBinding"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_task_iam.html.markdown"},
			},
			"google_dataplex_task_iam_member": {
				Tok:  gcpResource(gcpDataPlex, "TaskIamMember"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_task_iam.html.markdown"},
			},
			"google_dataplex_task_iam_policy": {
				Tok:  gcpResource(gcpDataPlex, "TaskIamPolicy"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_task_iam.html.markdown"},
			},
			"google_dataplex_zone_iam_policy": {
				Tok:  gcpResource(gcpDataPlex, "ZoneIamPolicy"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_zone_iam.html.markdown"},
			},
			"google_dataplex_zone_iam_binding": {
				Tok:  gcpResource(gcpDataPlex, "ZoneIamBinding"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_zone_iam.html.markdown"},
			},
			"google_dataplex_zone_iam_member": {
				Tok:  gcpResource(gcpDataPlex, "ZoneIamMember"),
				Docs: &tfbridge.DocInfo{Source: "dataplex_zone_iam.html.markdown"},
			},

			// IAM
			"google_iam_workload_identity_pool":          {Tok: gcpResource(gcpIAM, "WorkloadIdentityPool")},
			"google_iam_workload_identity_pool_provider": {Tok: gcpResource(gcpIAM, "WorkloadIdentityPoolProvider")},
			"google_iam_deny_policy":                     {Tok: gcpResource(gcpIAM, "DenyPolicy")},
			"google_iam_workforce_pool":                  {Tok: gcpResource(gcpIAM, "WorkforcePool")},
			"google_iam_workforce_pool_provider":         {Tok: gcpResource(gcpIAM, "WorkforcePoolProvider")},
			"google_iam_access_boundary_policy":          {Tok: gcpResource(gcpIAM, "AccessBoundaryPolicy")},

			// apigee
			"google_apigee_organization":        {Tok: gcpResource(gcpApigee, "Organization")},
			"google_apigee_instance":            {Tok: gcpResource(gcpApigee, "Instance")},
			"google_apigee_envgroup":            {Tok: gcpResource(gcpApigee, "EnvGroup")},
			"google_apigee_environment":         {Tok: gcpResource(gcpApigee, "Environment")},
			"google_apigee_instance_attachment": {Tok: gcpResource(gcpApigee, "InstanceAttachment")},
			"google_apigee_envgroup_attachment": {Tok: gcpResource(gcpApigee, "EnvGroupAttachment")},
			"google_apigee_environment_iam_binding": {
				Tok: gcpResource(gcpApigee, "EnvironmentIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "apigee_environment_iam.html.markdown",
				},
			},
			"google_apigee_environment_iam_member": {
				Tok: gcpResource(gcpApigee, "EnvironmentIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "apigee_environment_iam.html.markdown",
				},
			},
			"google_apigee_environment_iam_policy": {
				Tok: gcpResource(gcpApigee, "EnvironmentIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "apigee_environment_iam.html.markdown",
				},
			},
			"google_apigee_endpoint_attachment": {Tok: gcpResource(gcpApigee, "EndpointAttachment")},
			"google_apigee_nat_address":         {Tok: gcpResource(gcpApigee, "NatAddress")},
			"google_apigee_sync_authorization":  {Tok: gcpResource(gcpApigee, "SyncAuthorization")},
			"google_apigee_addons_config": {
				Tok: gcpResource(gcpApigee, "AddonsConfig"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"addons_config": {
						CSharpName: "AddonsConfigDetails",
					},
				},
			},
			"google_apigee_env_keystore": {
				Tok: gcpResource(gcpApigee, "EnvKeystore"),
			},
			"google_apigee_env_references": {
				Tok: gcpResource(gcpApigee, "EnvReferences"),
			},
			"google_apigee_flowhook": {
				Tok: gcpResource(gcpApigee, "Flowhook"),
			},
			"google_apigee_sharedflow": {
				Tok: gcpResource(gcpApigee, "Sharedflow"),
			},
			"google_apigee_sharedflow_deployment": {
				Tok: gcpResource(gcpApigee, "SharedflowDeployment"),
			},
			"google_apigee_keystores_aliases_key_cert_file": {
				Tok: gcpResource(gcpApigee, "KeystoresAliasesKeyCertFile"),
				Docs: &tfbridge.DocInfo{
					Source: "apigee_keysotres_aliases_key_cert_file.html.markdown",
				},
			},
			"google_apigee_keystores_aliases_pkcs12": {
				Tok: gcpResource(gcpApigee, "KeystoresAliasesPkcs12"),
			},
			"google_apigee_keystores_aliases_self_signed_cert": {
				Tok: gcpResource(gcpApigee, "KeystoresAliasesSelfSignedCert"),
			},

			// API Gateway
			"google_api_gateway_api_config_iam_binding": {
				Tok: gcpResource(gcpApiGateway, "ApiConfigIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_config_iam.html.markdown",
				},
			},
			"google_api_gateway_api_config_iam_member": {
				Tok: gcpResource(gcpApiGateway, "ApiConfigIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_config_iam.html.markdown",
				},
			},
			"google_api_gateway_api_config_iam_policy": {
				Tok: gcpResource(gcpApiGateway, "ApiConfigIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_config_iam.html.markdown",
				},
			},
			"google_api_gateway_api_config": {Tok: gcpResource(gcpApiGateway, "ApiConfig")},
			"google_api_gateway_api_iam_binding": {
				Tok: gcpResource(gcpApiGateway, "ApiIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_iam.html.markdown",
				},
			},
			"google_api_gateway_api_iam_member": {
				Tok: gcpResource(gcpApiGateway, "ApiIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_iam.html.markdown",
				},
			},
			"google_api_gateway_api_iam_policy": {
				Tok: gcpResource(gcpApiGateway, "ApiIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_api_iam.html.markdown",
				},
			},
			"google_api_gateway_api": {Tok: gcpResource(gcpApiGateway, "Api")},
			"google_api_gateway_gateway_iam_binding": {
				Tok: gcpResource(gcpApiGateway, "GatewayIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_gateway_iam.html.markdown",
				},
			},
			"google_api_gateway_gateway_iam_member": {
				Tok: gcpResource(gcpApiGateway, "GatewayIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_gateway_iam.html.markdown",
				},
			},
			"google_api_gateway_gateway_iam_policy": {
				Tok: gcpResource(gcpApiGateway, "GatewayIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "api_gateway_gateway_iam.html.markdown",
				},
			},
			"google_api_gateway_gateway": {Tok: gcpResource(gcpApiGateway, "Gateway")},

			// Certificate Authority
			"google_privateca_certificate_authority": {Tok: gcpResource(gcpCertificateAuthority, "Authority")},
			"google_privateca_certificate_template_iam_binding": {
				Tok: gcpResource(gcpCertificateAuthority, "CertificateTemplateIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_certificate_template_iam.html.markdown",
				},
			},
			"google_privateca_certificate_template_iam_member": {
				Tok: gcpResource(gcpCertificateAuthority, "CertificateTemplateIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_certificate_template_iam.html.markdown",
				},
			},
			"google_privateca_certificate_template_iam_policy": {
				Tok: gcpResource(gcpCertificateAuthority, "CertificateTemplateIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_certificate_template_iam.html.markdown",
				},
			},
			"google_privateca_certificate":          {Tok: gcpResource(gcpCertificateAuthority, "Certificate")},
			"google_privateca_ca_pool":              {Tok: gcpResource(gcpCertificateAuthority, "CaPool")},
			"google_privateca_certificate_template": {Tok: gcpResource(gcpCertificateAuthority, "CertificateTemplate")},
			"google_privateca_ca_pool_iam_binding": {
				Tok: gcpResource(gcpCertificateAuthority, "CaPoolIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_ca_pool_iam.html.markdown",
				},
			},
			"google_privateca_ca_pool_iam_member": {
				Tok: gcpResource(gcpCertificateAuthority, "CaPoolIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_ca_pool_iam.html.markdown",
				},
			},
			"google_privateca_ca_pool_iam_policy": {
				Tok: gcpResource(gcpCertificateAuthority, "CaPoolIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "privateca_ca_pool_iam.html.markdown",
				},
			},

			// Certificate Manager
			"google_certificate_manager_certificate":           {Tok: gcpResource(gcpCertificateManager, "Certificate")},
			"google_certificate_manager_dns_authorization":     {Tok: gcpResource(gcpCertificateManager, "DnsAuthorization")},
			"google_certificate_manager_certificate_map":       {Tok: gcpResource(gcpCertificateManager, "CertificateMap")},
			"google_certificate_manager_certificate_map_entry": {Tok: gcpResource(gcpCertificateManager, "CertificateMapEntry")},

			// essential contacts
			"google_essential_contacts_contact": {Tok: gcpResource(gcpEssentialContacts, "Contact")},
			"google_document_ai_processor":      {Tok: gcpResource(gcpEssentialContacts, "DocumentAiProcessor")},
			"google_document_ai_processor_default_version": {
				Tok: gcpResource(gcpEssentialContacts, "DocumentAiProcessorDefaultVersion"),
			},
			"google_document_ai_warehouse_location": {Tok: gcpResource(gcpEssentialContacts, "DocumentAiWarehouseLocation")},
			"google_document_ai_warehouse_document_schema": {
				Tok: gcpResource(gcpEssentialContacts, "DocumentAiWarehouseDocumentSchema"),
			},

			// workflows
			"google_workflows_workflow": {Tok: gcpResource(gcpWorkflows, "Workflow")},

			// Workstations
			"google_workstations_workstation_cluster": {Tok: gcpResource(gcpWorkstations, "WorkstationCluster")},
			"google_workstations_workstation_config":  {Tok: gcpResource(gcpWorkstations, "WorkstationConfig")},
			"google_workstations_workstation":         {Tok: gcpResource(gcpWorkstations, "Workstation")},
			"google_workstations_workstation_config_iam_binding": {
				Tok: gcpResource(gcpWorkstations, "WorkstationConfigIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_config_iam.html.markdown",
				},
			},
			"google_workstations_workstation_config_iam_member": {
				Tok: gcpResource(gcpWorkstations, "WorkstationConfigIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_config_iam.html.markdown",
				},
			},
			"google_workstations_workstation_config_iam_policy": {
				Tok: gcpResource(gcpWorkstations, "WorkstationConfigIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_config_iam.html.markdown",
				},
			},
			"google_workstations_workstation_iam_binding": {
				Tok: gcpResource(gcpWorkstations, "WorkstationIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_iam.html.markdown",
				},
			},
			"google_workstations_workstation_iam_member": {
				Tok: gcpResource(gcpWorkstations, "WorkstationIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_iam.html.markdown",
				},
			},
			"google_workstations_workstation_iam_policy": {
				Tok: gcpResource(gcpWorkstations, "WorkstationIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "workstations_workstation_iam.html.markdown",
				},
			},

			// eventarc
			"google_eventarc_channel": {
				Tok: gcpResource(gcpEventarc, "Channel"),
			},
			"google_eventarc_google_channel_config": {
				Tok: gcpResource(gcpEventarc, "GoogleChannelConfig"),
			},
			"google_eventarc_trigger": {Tok: gcpResource(gcpEventarc, "Trigger")},

			// GKE Backup
			"google_gke_backup_backup_plan": {Tok: gcpResource(gcpGkeBackup, "BackupPlan")},
			"google_gke_backup_backup_plan_iam_binding": {
				Tok: gcpResource(gcpGkeBackup, "BackupPlanIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_backup_plan_iam.html.markdown",
				},
			},
			"google_gke_backup_backup_plan_iam_member": {
				Tok: gcpResource(gcpGkeBackup, "BackupPlanIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_backup_plan_iam.html.markdown",
				},
			},
			"google_gke_backup_backup_plan_iam_policy": {
				Tok: gcpResource(gcpGkeBackup, "BackupPlanIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_backup_plan_iam.html.markdown",
				},
			},
			"google_gke_backup_restore_plan_iam_binding": {
				Tok: gcpResource(gcpGkeBackup, "RestorePlanIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_restore_plan.html.markdown",
				},
			},
			"google_gke_backup_restore_plan_iam_member": {
				Tok: gcpResource(gcpGkeBackup, "RestorePlanIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_restore_plan.html.markdown",
				},
			},
			"google_gke_backup_restore_plan_iam_policy": {
				Tok: gcpResource(gcpGkeBackup, "RestorePlanIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_backup_restore_plan.html.markdown",
				},
			},

			// gke hub
			"google_gke_hub_membership": {Tok: gcpResource(gcpGkeHub, "Membership")},
			"google_gke_hub_feature":    {Tok: gcpResource(gcpGkeHub, "Feature")},
			"google_gke_hub_feature_iam_binding": {
				Tok: gcpResource(gcpGkeHub, "FeatureIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_feature_iam.html.markdown",
				},
			},
			"google_gke_hub_feature_iam_member": {
				Tok: gcpResource(gcpGkeHub, "FeatureIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_feature_iam.html.markdown",
				},
			},
			"google_gke_hub_feature_iam_policy": {
				Tok: gcpResource(gcpGkeHub, "FeatureIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_feature_iam.html.markdown",
				},
			},
			"google_gke_hub_feature_membership": {Tok: gcpResource(gcpGkeHub, "FeatureMembership")},
			"google_gke_hub_membership_iam_binding": {
				Tok: gcpResource(gcpGkeHub, "MembershipIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_membership_iam.html.markdown",
				},
			},
			"google_gke_hub_membership_iam_member": {
				Tok: gcpResource(gcpGkeHub, "MembershipIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_membership_iam.html.markdown",
				},
			},
			"google_gke_hub_membership_iam_policy": {
				Tok: gcpResource(gcpGkeHub, "MembershipIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "gke_hub_membership_iam.html.markdown",
				},
			},

			// tags
			"google_tags_location_tag_binding": {Tok: gcpResource(gcpTags, "LocationTagBinding")},
			"google_tags_tag_key":              {Tok: gcpResource(gcpTags, "TagKey")},
			"google_tags_tag_value":            {Tok: gcpResource(gcpTags, "TagValue")},
			"google_tags_tag_binding":          {Tok: gcpResource(gcpTags, "TagBinding")},
			"google_tags_tag_key_iam_binding": {
				Tok: gcpResource(gcpTags, "TagKeyIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_key_iam.html.markdown",
				},
			},
			"google_tags_tag_key_iam_member": {
				Tok: gcpResource(gcpTags, "TagKeyIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_key_iam.html.markdown",
				},
			},
			"google_tags_tag_key_iam_policy": {
				Tok: gcpResource(gcpTags, "TagKeyIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_key_iam.html.markdown",
				},
			},
			"google_tags_tag_value_iam_binding": {
				Tok: gcpResource(gcpTags, "TagValueIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_value_iam.html.markdown",
				},
			},
			"google_tags_tag_value_iam_member": {
				Tok: gcpResource(gcpTags, "TagValueIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_value_iam.html.markdown",
				},
			},
			"google_tags_tag_value_iam_policy": {
				Tok: gcpResource(gcpTags, "TagValueIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "tags_tag_value_iam.html.markdown",
				},
			},
			"google_dataplex_datascan_iam_binding": {
				Tok: gcpResource(gcpDataPlex, "DatascanIamBinding"),
				Docs: &tfbridge.DocInfo{
					Source: "dataplex_datascan_iam.html.markdown",
				},
			},
			"google_dataplex_datascan_iam_member": {
				Tok: gcpResource(gcpDataPlex, "DatascanIamMember"),
				Docs: &tfbridge.DocInfo{
					Source: "dataplex_datascan_iam.html.markdown",
				},
			},
			"google_dataplex_datascan_iam_policy": {
				Tok: gcpResource(gcpDataPlex, "DatascanIamPolicy"),
				Docs: &tfbridge.DocInfo{
					Source: "dataplex_datascan_iam.html.markdown",
				},
			},
			"google_compute_network_endpoints": {
				Tok: gcpResource(gcpCompute, "NetworkEndpointList"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Access Approval
			"google_access_approval_folder_service_account": {
				Tok: gcpDataSource(gcpAccessApproval, "getFolderServiceAccount"),
			},
			"google_access_approval_organization_service_account": {
				Tok: gcpDataSource(gcpAccessApproval, "getOrganizationServiceAccount"),
			},
			"google_access_approval_project_service_account": {
				Tok: gcpDataSource(gcpAccessApproval, "getProjectServiceAccount"),
			},

			"google_artifact_registry_repository": {
				Tok: gcpDataSource(gcpArtifactRegistry, "getRepository"),
			},

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
			"google_folders": {Tok: gcpDataSource(gcpOrganization, "getFolders")},

			"google_cloud_asset_resources_search_all": {
				Tok: gcpDataSource(gcpCloudAsset, "getResourcesSearchAll"),
			},

			"google_cloudfunctions_function": {
				Tok: gcpDataSource(gcpCloudFunctions, "getFunction"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_cloudfunctions_function.html.markdown",
				},
			},
			"google_cloudfunctions2_function": {
				Tok: gcpDataSource(gcpCloudFunctionsV2, "getFunction"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_cloudfunctions2_function.html.markdown",
				},
			},

			// Compute
			"google_compute_address": {
				Tok: gcpDataSource(gcpCompute, "getAddress"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_address.html.markdown",
				},
			},
			"google_compute_addresses": {
				Tok: gcpDataSource(gcpCompute, "getAddresses"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_addresses.html.markdown",
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
			"google_compute_backend_bucket": {
				Tok: gcpDataSource(gcpCompute, "getBackendBucket"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_compute_backend_bucket.html.markdown",
				},
			},
			"google_compute_instance_template": {Tok: gcpDataSource(gcpCompute, "getInstanceTemplate")},
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
			"google_compute_global_forwarding_rule": {
				Tok: gcpDataSource(gcpCompute, "getGlobalForwardingRule"),
			},
			"google_compute_network": {
				Tok: gcpDataSource(gcpCompute, "getNetwork"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_network.html.markdown",
				},
			},
			"google_compute_network_endpoint_group": {
				Tok: gcpDataSource(gcpCompute, "getNetworkEndpointGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_compute_network_endpoint_group.html.markdown",
				},
			},
			"google_compute_network_peering": {Tok: gcpDataSource(gcpCompute, "getNetworkPeering")},
			"google_compute_region_network_endpoint_group": {
				Tok: gcpDataSource(gcpCompute, "getRegionNetworkEndpointGroup"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_compute_region_network_endpoint_group.html.markdown",
				},
			},
			"google_compute_router_nat":    {Tok: gcpDataSource(gcpCompute, "getRouterNat")},
			"google_compute_router_status": {Tok: gcpDataSource(gcpCompute, "RouterStatus")}, // fixed via alias
			"google_compute_disk":          {Tok: gcpDataSource(gcpCompute, "getDisk")},
			"google_compute_snapshot":      {Tok: gcpDataSource(gcpCompute, "getSnapshot")},

			"google_composer_image_versions": {
				Tok: gcpDataSource(gcpComposer, "getImageVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_composer_image_versions.html.markdown",
				},
			},
			"google_composer_environment": {Tok: gcpDataSource(gcpComposer, "getEnvironment")},
			"google_iam_role": {
				Tok: gcpDataSource(gcpIAM, "getRule"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_iam_role.html.markdown",
				},
			},
			"google_iam_testable_permissions": {
				Tok: gcpDataSource(gcpIAM, "getTestablePermissions"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_iam_testable_permissions.html.markdown",
				},
			},
			"google_iam_workload_identity_pool":          {Tok: gcpDataSource(gcpIAM, "getWorkloadIdentityPool")},
			"google_iam_workload_identity_pool_provider": {Tok: gcpDataSource(gcpIAM, "getWorkloadIdentityPoolProvider")},
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
			"google_compute_region_instance_template": {
				Tok: gcpDataSource(gcpCompute, "getRegionInstanceTemplate"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_region_instance_template.html.markdown",
				},
			},
			"google_compute_ha_vpn_gateway": {Tok: gcpDataSource(gcpCompute, "getHcVpnGateway")},
			"google_compute_region_ssl_certificate": {
				Tok: gcpDataSource(gcpCompute, "getRegionSslCertificate"),
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
			"google_compute_health_check": {Tok: gcpDataSource(gcpCompute, "getHealthCheck")},

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
			"google_container_aws_versions": {
				Tok: gcpDataSource(gcpKubernetes, "getAwsVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "container_aws_versions.html.markdown",
				},
			},
			"google_container_azure_versions": {
				Tok: gcpDataSource(gcpKubernetes, "getAzureVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "container_azure_versions.html.markdown",
				},
			},
			"google_container_attached_install_manifest": {
				Tok: gcpDataSource(gcpKubernetes, "getAttachedInstallManifest"),
				Docs: &tfbridge.DocInfo{
					Source: "container_attached_install_manifest.html.markdown",
				},
			},
			"google_container_attached_versions": {
				Tok: gcpDataSource(gcpKubernetes, "getAttachedVersions"),
				Docs: &tfbridge.DocInfo{
					Source: "container_attached_versions.html.markdown",
				},
			},

			"google_dns_managed_zone": {
				Docs: &tfbridge.DocInfo{Source: "dns_managed_zone.html.markdown"},
			},
			"google_dns_managed_zones": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"google_dns_keys": {
				Docs: &tfbridge.DocInfo{
					Source: "datasource_dns_keys.html.markdown",
				},
			},
			"google_dns_record_set": {Tok: gcpDataSource(gcpDNS, "getRecordSet")},

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
			"google_kms_secret_asymmetric":  {Tok: gcpDataSource(gcpKMS, "getKMSSecretAsymmetric")},
			"google_kms_secret_ciphertext":  {Tok: gcpDataSource(gcpKMS, "getKMSSecretCiphertext")},

			"google_logging_project_cmek_settings": {Tok: gcpDataSource(gcpLogging, "getProjectCmekSettings")},
			"google_logging_sink":                  {Tok: gcpDataSource(gcpLogging, "getSink")},

			"google_organization": {
				Tok: gcpDataSource(gcpOrganization, "getOrganization"),
				Docs: &tfbridge.DocInfo{
					Source: "google_organization.html.markdown",
				},
			},

			"google_privateca_certificate_authority": {Tok: gcpDataSource(gcpCertificateAuthority, "getAuthority")},

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
			"google_project_service": {
				Tok: gcpDataSource(gcpProject, "getProjectService"),
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
					Source: "storage_transfer_project_service_account.html.markdown",
				},
			},
			"google_storage_bucket_object_content": {
				Tok: gcpDataSource(gcpStorage, "getBucketObjectContent"),
			},
			"google_storage_bucket": {Tok: gcpDataSource(gcpStorage, "getBucket")},
			"google_service_account": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccount"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account.html.markdown",
				},
			},
			"google_service_account_jwt": {Tok: gcpDataSource(gcpServiceAccount, "getAccountJwt")},
			"google_service_account_id_token": {
				Tok: gcpDataSource(gcpServiceAccount, "getAccountIdToken"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_service_account_id_token.html.markdown",
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
				Docs: &tfbridge.DocInfo{
					Source: "datasource_tpu_tensorflow_versions.html.markdown",
				},
			},
			"google_compute_router": {
				Tok: gcpDataSource(gcpCompute, "getRouter"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_router.html.markdown",
				},
			},
			"google_compute_instance_serial_port": {
				Tok: gcpDataSource(gcpCompute, "getInstanceSerialPort"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_compute_instance_serial_port.html.markdown",
				},
			},
			"google_bigquery_default_service_account": {
				Tok:  gcpDataSource(gcpBigQuery, "getDefaultServiceAccount"),
				Docs: &tfbridge.DocInfo{Source: "google_bigquery_default_service_account.html"},
			},
			"google_sql_ca_certs": {
				Tok: gcpDataSource(gcpSQL, "getCaCerts"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_sql_ca_certs.html.markdown",
				},
			},

			"google_service_networking_peered_dns_domain": {
				Tok: gcpDataSource(gcpServiceNetworking, "getPeeredDnsDomain"),
				// At the time of writing this data source does not have any upstream docs at all, so we override
				// with blank contents.
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"google_sql_backup_run": {Tok: gcpDataSource(gcpSQL, "getBackupRun")},
			"google_monitoring_notification_channel": {
				Tok: gcpDataSource(gcpMonitoring, "getNotificationChannel"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_monitoring_notification_channel.html.markdown",
				},
			},
			"google_monitoring_uptime_check_ips": {
				Tok: gcpDataSource(gcpMonitoring, "getUptimeCheckIPs"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_monitoring_uptime_check_ips.html.markdown",
				},
			},
			"google_monitoring_app_engine_service": {
				Tok: gcpDataSource(gcpMonitoring, "getAppEngineService"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_monitoring_app_engine_service.html.markdown",
				},
			},

			// Firebase
			"google_firebase_android_app": {
				Tok: gcpDataSource(gcpFirebase, "getAndroidApp"),
				Docs: &tfbridge.DocInfo{
					Source: "firebase_android_app.html.markdown",
				},
			},
			"google_firebase_apple_app_config": {
				Tok: gcpDataSource(gcpFirebase, "getAppleAppConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "firebase_apple_app_config.html.markdown",
				},
			},
			"google_firebase_apple_app": {
				Tok: gcpDataSource(gcpFirebase, "getAppleApp"),
				Docs: &tfbridge.DocInfo{
					Source: "firebase_apple_app.html.markdown",
				},
			},
			"google_firebase_android_app_config": {
				Tok: gcpDataSource(gcpFirebase, "getAndroidAppConfig"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"google_firebase_hosting_channel": {
				Tok: gcpDataSource(gcpFirebase, "getHostingChannel"),
				Docs: &tfbridge.DocInfo{
					Source: "google_firebase_hosting_channel.html.markdown",
				},
			},
			"google_firebase_web_app_config": {
				Tok: gcpDataSource(gcpFirebase, "getWebAppConfig"),
				Docs: &tfbridge.DocInfo{
					Source: "firebase_web_app_config.html.markdown",
				},
			},
			"google_firebase_web_app": {
				Tok: gcpDataSource(gcpFirebase, "getWebApp"),
				Docs: &tfbridge.DocInfo{
					Source: "firebase_web_app.html.markdown",
				},
			},

			// Redis resources
			"google_redis_instance": {
				Tok: gcpDataSource(gcpRedis, "getInstance"),
				Docs: &tfbridge.DocInfo{
					Source: "datasource_google_redis_instance.html.markdown",
				},
			},

			// CloudIdentity
			"google_cloud_identity_group_memberships": {
				Tok: gcpDataSource(gcpCloudIdentity, "getGroupMemberships"),
				Docs: &tfbridge.DocInfo{
					Source: "cloud_identity_group_membership.html.markdown",
				},
			},

			// Source repo
			"google_sourcerepo_repository": {
				Tok: gcpDataSource(gcpSourceRepo, "getRepository"),
				Docs: &tfbridge.DocInfo{
					Source: "data_source_sourcerepo_repository.html.markdown",
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi":    "^3.0.0",
				"read-package-json": "^2.0.13",
				"@types/express":    "^4.16.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^18.0.0", // so we can access strongly typed node definitions.
			},
			Resolutions: map[string]string{
				"@types/mime": "3.0.4",
			},
			Overlay: &tfbridge.OverlayInfo{
				DestFiles: []string{
					"utils.ts", // Helpers,
				},
				Modules: map[string]*tfbridge.OverlayInfo{
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
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", gcpPackage),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				gcpPackage,
			),
			GenerateResourceContainerTypes: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				},
			}
			i.PyProject.Enabled = true
			return i
		})(),

		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
	}

	prov.RenameResourceWithAlias("google_compute_managed_ssl_certificate", gcpResource(gcpCompute,
		"MangedSslCertificate"), gcpResource(gcpCompute, "ManagedSslCertificate"), gcpCompute, gcpCompute,
		&tfbridge.ResourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "compute_managed_ssl_certificate.html.markdown",
			},
		})

	prov.RenameDataSource("google_secret_manager_secret_version", gcpDataSource(gcpMonitoring, "getSecretVersion"),
		gcpDataSource(gcpSecretManager, "getSecretVersion"), gcpMonitoring, gcpSecretManager,
		&tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "secret_manager_secret_version.html.markdown",
			},
		})

	prov.RenameDataSource("google_compute_router_status", gcpDataSource(gcpCompute, "RouterStatus"),
		gcpDataSource(gcpCompute, "getRouterStatus"), gcpCompute, gcpCompute, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "compute_router_status.html.markdown",
			},
		})

	prov.RenameDataSource("google_storage_transfer_project_service_account", gcpDataSource(gcpStorage, "getTransferProjectServieAccount"),
		gcpDataSource(gcpStorage, "getTransferProjectServiceAccount"), gcpStorage, gcpStorage, &tfbridge.DataSourceInfo{
			Docs: &tfbridge.DocInfo{
				Source: "storage_transfer_project_service_account.html.markdown",
			},
		})

	prov.MustComputeTokens(tks.MappedModules("google_", "",
		moduleMapping, func(module, name string) (string, error) {
			return string(gcpResource(module, name)), nil
		}))

	prov.SetAutonaming(255, "-")

	prov.MustApplyAutoAliases()

	fixLabelNames(&prov)

	allowMissingResourceDocs := []string{
		"google_clouddeploy_delivery_pipeline_iam_binding",
		"google_clouddeploy_delivery_pipeline_iam_member",
		"google_clouddeploy_delivery_pipeline_iam_policy",
		"google_clouddeploy_target_iam_binding",
		"google_clouddeploy_target_iam_member",
		"google_clouddeploy_target_iam_policy",
		"google_clouddeploy_custom_target_type_iam_binding",
		"google_clouddeploy_custom_target_type_iam_member",
		"google_clouddeploy_custom_target_type_iam_policy",
		"google_dataform_repository_iam_binding",
		"google_dataform_repository_iam_member",
		"google_dataform_repository_iam_policy",
		"google_secure_source_manager_instance_iam_binding",
		"google_secure_source_manager_instance_iam_member",
		"google_secure_source_manager_instance_iam_policy",
		"google_vertex_ai_endpoint_iam_binding",
		"google_vertex_ai_endpoint_iam_member",
		"google_vertex_ai_endpoint_iam_policy",
		"google_workbench_instance_iam_binding",
		"google_workbench_instance_iam_member",
		"google_workbench_instance_iam_policy",
	}

	for _, name := range allowMissingResourceDocs {
		info, ok := prov.Resources[name]
		if !ok {
			panic("Missing mapped doc for " + name)
		}
		if info.Docs == nil {
			info.Docs = &tfbridge.DocInfo{}
		}
		info.Docs.AllowMissing = true
	}

	return prov
}
