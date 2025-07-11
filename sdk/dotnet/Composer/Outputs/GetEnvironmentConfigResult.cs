// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class GetEnvironmentConfigResult
    {
        /// <summary>
        /// The URI of the Apache Airflow Web UI hosted within the
        /// environment.
        /// </summary>
        public readonly string AirflowUri;
        /// <summary>
        /// The Cloud Storage prefix of the DAGs for the environment.
        /// </summary>
        public readonly string DagGcsPrefix;
        /// <summary>
        /// The configuration setting for Airflow data retention mechanism. This field is supported for Cloud Composer environments in versions composer-2.0.32-airflow-2.1.4. or newer
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigResult> DataRetentionConfigs;
        /// <summary>
        /// The configuration of Cloud SQL instance that is used by the Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigDatabaseConfigResult> DatabaseConfigs;
        /// <summary>
        /// Optional. If true, builds performed during operations that install Python packages have only private connectivity to Google services. If false, the builds also have access to the internet.
        /// </summary>
        public readonly bool EnablePrivateBuildsOnly;
        /// <summary>
        /// Optional. If true, a private Composer environment will be created.
        /// </summary>
        public readonly bool EnablePrivateEnvironment;
        /// <summary>
        /// The encryption options for the Composer environment and its dependencies.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigEncryptionConfigResult> EncryptionConfigs;
        /// <summary>
        /// The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
        /// </summary>
        public readonly string EnvironmentSize;
        /// <summary>
        /// The Kubernetes Engine cluster used to run the environment.
        /// </summary>
        public readonly string GkeCluster;
        /// <summary>
        /// The configuration for Cloud Composer maintenance window.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigMaintenanceWindowResult> MaintenanceWindows;
        /// <summary>
        /// Configuration options for the master authorized networks feature. Enabled master authorized networks will disallow all external traffic to access Kubernetes master through HTTPS except traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigMasterAuthorizedNetworksConfigResult> MasterAuthorizedNetworksConfigs;
        /// <summary>
        /// The configuration used for the Kubernetes Engine cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigNodeConfigResult> NodeConfigs;
        /// <summary>
        /// The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
        /// </summary>
        public readonly int NodeCount;
        /// <summary>
        /// The configuration used for the Private IP Cloud Composer environment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigPrivateEnvironmentConfigResult> PrivateEnvironmentConfigs;
        /// <summary>
        /// The recovery configuration settings for the Cloud Composer environment
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigRecoveryConfigResult> RecoveryConfigs;
        /// <summary>
        /// Whether high resilience is enabled or not. This field is supported for Cloud Composer environments in versions composer-2.1.15-airflow-*.*.* and newer.
        /// </summary>
        public readonly string ResilienceMode;
        /// <summary>
        /// The configuration settings for software inside the environment.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigSoftwareConfigResult> SoftwareConfigs;
        /// <summary>
        /// The configuration settings for the Airflow web server App Engine instance. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWebServerConfigResult> WebServerConfigs;
        /// <summary>
        /// Network-level access control policy for the Airflow web server.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWebServerNetworkAccessControlResult> WebServerNetworkAccessControls;
        /// <summary>
        /// The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. Supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigResult> WorkloadsConfigs;

        [OutputConstructor]
        private GetEnvironmentConfigResult(
            string airflowUri,

            string dagGcsPrefix,

            ImmutableArray<Outputs.GetEnvironmentConfigDataRetentionConfigResult> dataRetentionConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigDatabaseConfigResult> databaseConfigs,

            bool enablePrivateBuildsOnly,

            bool enablePrivateEnvironment,

            ImmutableArray<Outputs.GetEnvironmentConfigEncryptionConfigResult> encryptionConfigs,

            string environmentSize,

            string gkeCluster,

            ImmutableArray<Outputs.GetEnvironmentConfigMaintenanceWindowResult> maintenanceWindows,

            ImmutableArray<Outputs.GetEnvironmentConfigMasterAuthorizedNetworksConfigResult> masterAuthorizedNetworksConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigNodeConfigResult> nodeConfigs,

            int nodeCount,

            ImmutableArray<Outputs.GetEnvironmentConfigPrivateEnvironmentConfigResult> privateEnvironmentConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigRecoveryConfigResult> recoveryConfigs,

            string resilienceMode,

            ImmutableArray<Outputs.GetEnvironmentConfigSoftwareConfigResult> softwareConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigWebServerConfigResult> webServerConfigs,

            ImmutableArray<Outputs.GetEnvironmentConfigWebServerNetworkAccessControlResult> webServerNetworkAccessControls,

            ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigResult> workloadsConfigs)
        {
            AirflowUri = airflowUri;
            DagGcsPrefix = dagGcsPrefix;
            DataRetentionConfigs = dataRetentionConfigs;
            DatabaseConfigs = databaseConfigs;
            EnablePrivateBuildsOnly = enablePrivateBuildsOnly;
            EnablePrivateEnvironment = enablePrivateEnvironment;
            EncryptionConfigs = encryptionConfigs;
            EnvironmentSize = environmentSize;
            GkeCluster = gkeCluster;
            MaintenanceWindows = maintenanceWindows;
            MasterAuthorizedNetworksConfigs = masterAuthorizedNetworksConfigs;
            NodeConfigs = nodeConfigs;
            NodeCount = nodeCount;
            PrivateEnvironmentConfigs = privateEnvironmentConfigs;
            RecoveryConfigs = recoveryConfigs;
            ResilienceMode = resilienceMode;
            SoftwareConfigs = softwareConfigs;
            WebServerConfigs = webServerConfigs;
            WebServerNetworkAccessControls = webServerNetworkAccessControls;
            WorkloadsConfigs = workloadsConfigs;
        }
    }
}
