// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup
{
    /// <summary>
    /// Represents a Restore Plan instance.
    /// 
    /// To get more information about RestorePlan, see:
    /// 
    /// * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.restorePlans)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
    /// 
    /// ## Example Usage
    /// ### Gkebackup Restoreplan All Namespaces
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var allNs = new Gcp.GkeBackup.RestorePlan("allNs", new()
    ///     {
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             AllNamespaces = true,
    ///             NamespacedResourceRestoreMode = "FAIL_ON_CONFLICT",
    ///             VolumeDataRestorePolicy = "RESTORE_VOLUME_DATA_FROM_BACKUP",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 AllGroupKinds = true,
    ///             },
    ///             ClusterResourceConflictPolicy = "USE_EXISTING_VERSION",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkebackup Restoreplan Rollback Namespace
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var rollbackNs = new Gcp.GkeBackup.RestorePlan("rollbackNs", new()
    ///     {
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             SelectedNamespaces = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigSelectedNamespacesArgs
    ///             {
    ///                 Namespaces = new[]
    ///                 {
    ///                     "my-ns",
    ///                 },
    ///             },
    ///             NamespacedResourceRestoreMode = "DELETE_AND_RESTORE",
    ///             VolumeDataRestorePolicy = "RESTORE_VOLUME_DATA_FROM_BACKUP",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 SelectedGroupKinds = new[]
    ///                 {
    ///                     new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs
    ///                     {
    ///                         ResourceGroup = "apiextension.k8s.io",
    ///                         ResourceKind = "CustomResourceDefinition",
    ///                     },
    ///                     new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs
    ///                     {
    ///                         ResourceGroup = "storage.k8s.io",
    ///                         ResourceKind = "StorageClass",
    ///                     },
    ///                 },
    ///             },
    ///             ClusterResourceConflictPolicy = "USE_EXISTING_VERSION",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkebackup Restoreplan Protected Application
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var rollbackApp = new Gcp.GkeBackup.RestorePlan("rollbackApp", new()
    ///     {
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             SelectedApplications = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigSelectedApplicationsArgs
    ///             {
    ///                 NamespacedNames = new[]
    ///                 {
    ///                     new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs
    ///                     {
    ///                         Name = "my-app",
    ///                         Namespace = "my-ns",
    ///                     },
    ///                 },
    ///             },
    ///             NamespacedResourceRestoreMode = "DELETE_AND_RESTORE",
    ///             VolumeDataRestorePolicy = "REUSE_VOLUME_HANDLE_FROM_BACKUP",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 NoGroupKinds = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkebackup Restoreplan All Cluster Resources
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var allClusterResources = new Gcp.GkeBackup.RestorePlan("allClusterResources", new()
    ///     {
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             NoNamespaces = true,
    ///             NamespacedResourceRestoreMode = "FAIL_ON_CONFLICT",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 AllGroupKinds = true,
    ///             },
    ///             ClusterResourceConflictPolicy = "USE_EXISTING_VERSION",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkebackup Restoreplan Rename Namespace
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var renameNs = new Gcp.GkeBackup.RestorePlan("renameNs", new()
    ///     {
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             SelectedNamespaces = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigSelectedNamespacesArgs
    ///             {
    ///                 Namespaces = new[]
    ///                 {
    ///                     "ns1",
    ///                 },
    ///             },
    ///             NamespacedResourceRestoreMode = "FAIL_ON_CONFLICT",
    ///             VolumeDataRestorePolicy = "REUSE_VOLUME_HANDLE_FROM_BACKUP",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 NoGroupKinds = true,
    ///             },
    ///             TransformationRules = new[]
    ///             {
    ///                 new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleArgs
    ///                 {
    ///                     Description = "rename namespace from ns1 to ns2",
    ///                     ResourceFilter = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs
    ///                     {
    ///                         GroupKinds = new[]
    ///                         {
    ///                             new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs
    ///                             {
    ///                                 ResourceKind = "Namespace",
    ///                             },
    ///                         },
    ///                         JsonPath = ".metadata[?(@.name == 'ns1')]",
    ///                     },
    ///                     FieldActions = new[]
    ///                     {
    ///                         new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs
    ///                         {
    ///                             Op = "REPLACE",
    ///                             Path = "/metadata/name",
    ///                             Value = "ns2",
    ///                         },
    ///                     },
    ///                 },
    ///                 new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleArgs
    ///                 {
    ///                     Description = "move all resources from ns1 to ns2",
    ///                     ResourceFilter = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs
    ///                     {
    ///                         Namespaces = new[]
    ///                         {
    ///                             "ns1",
    ///                         },
    ///                     },
    ///                     FieldActions = new[]
    ///                     {
    ///                         new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs
    ///                         {
    ///                             Op = "REPLACE",
    ///                             Path = "/metadata/namespace",
    ///                             Value = "ns2",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkebackup Restoreplan Second Transformation
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.Container.Cluster("primary", new()
    ///     {
    ///         Location = "us-central1",
    ///         InitialNodeCount = 1,
    ///         WorkloadIdentityConfig = new Gcp.Container.Inputs.ClusterWorkloadIdentityConfigArgs
    ///         {
    ///             WorkloadPool = "my-project-name.svc.id.goog",
    ///         },
    ///         AddonsConfig = new Gcp.Container.Inputs.ClusterAddonsConfigArgs
    ///         {
    ///             GkeBackupAgentConfig = new Gcp.Container.Inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.GkeBackup.BackupPlan("basic", new()
    ///     {
    ///         Cluster = primary.Id,
    ///         Location = "us-central1",
    ///         BackupConfig = new Gcp.GkeBackup.Inputs.BackupPlanBackupConfigArgs
    ///         {
    ///             IncludeVolumeData = true,
    ///             IncludeSecrets = true,
    ///             AllNamespaces = true,
    ///         },
    ///     });
    /// 
    ///     var transformRule = new Gcp.GkeBackup.RestorePlan("transformRule", new()
    ///     {
    ///         Description = "copy nginx env variables",
    ///         Labels = 
    ///         {
    ///             { "app", "nginx" },
    ///         },
    ///         Location = "us-central1",
    ///         BackupPlan = basic.Id,
    ///         Cluster = primary.Id,
    ///         RestoreConfig = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigArgs
    ///         {
    ///             ExcludedNamespaces = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigExcludedNamespacesArgs
    ///             {
    ///                 Namespaces = new[]
    ///                 {
    ///                     "my-ns",
    ///                 },
    ///             },
    ///             NamespacedResourceRestoreMode = "DELETE_AND_RESTORE",
    ///             VolumeDataRestorePolicy = "RESTORE_VOLUME_DATA_FROM_BACKUP",
    ///             ClusterResourceRestoreScope = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs
    ///             {
    ///                 ExcludedGroupKinds = new[]
    ///                 {
    ///                     new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeExcludedGroupKindArgs
    ///                     {
    ///                         ResourceGroup = "apiextension.k8s.io",
    ///                         ResourceKind = "CustomResourceDefinition",
    ///                     },
    ///                 },
    ///             },
    ///             ClusterResourceConflictPolicy = "USE_EXISTING_VERSION",
    ///             TransformationRules = new[]
    ///             {
    ///                 new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleArgs
    ///                 {
    ///                     Description = "Copy environment variables from the nginx container to the install init container.",
    ///                     ResourceFilter = new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs
    ///                     {
    ///                         GroupKinds = new[]
    ///                         {
    ///                             new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs
    ///                             {
    ///                                 ResourceKind = "Pod",
    ///                                 ResourceGroup = "",
    ///                             },
    ///                         },
    ///                         JsonPath = ".metadata[?(@.name == 'nginx')]",
    ///                     },
    ///                     FieldActions = new[]
    ///                     {
    ///                         new Gcp.GkeBackup.Inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs
    ///                         {
    ///                             Op = "COPY",
    ///                             Path = "/spec/initContainers/0/env",
    ///                             FromPath = "/spec/containers/0/env",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// RestorePlan can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkebackup/restorePlan:RestorePlan default projects/{{project}}/locations/{{location}}/restorePlans/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkebackup/restorePlan:RestorePlan default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkebackup/restorePlan:RestorePlan default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:gkebackup/restorePlan:RestorePlan")]
    public partial class RestorePlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A reference to the BackupPlan from which Backups may be used
        /// as the source for Restores created via this RestorePlan.
        /// </summary>
        [Output("backupPlan")]
        public Output<string> BackupPlan { get; private set; } = null!;

        /// <summary>
        /// The source cluster from which Restores will be created via this RestorePlan.
        /// </summary>
        [Output("cluster")]
        public Output<string> Cluster { get; private set; } = null!;

        /// <summary>
        /// The description is a user specified string description
        /// of the transformation rule.
        /// 
        /// (Optional)
        /// User specified descriptive string for this RestorePlan.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Description: A set of custom labels supplied by the user.
        /// A list of key-&gt;value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The region of the Restore Plan.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The full name of the BackupPlan Resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Defines the configuration of Restores created via this RestorePlan.
        /// Structure is documented below.
        /// </summary>
        [Output("restoreConfig")]
        public Output<Outputs.RestorePlanRestoreConfig> RestoreConfig { get; private set; } = null!;

        /// <summary>
        /// The State of the RestorePlan.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Detailed description of why RestorePlan is in its current state.
        /// </summary>
        [Output("stateReason")]
        public Output<string> StateReason { get; private set; } = null!;

        /// <summary>
        /// Server generated, unique identifier of UUID format.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;


        /// <summary>
        /// Create a RestorePlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RestorePlan(string name, RestorePlanArgs args, CustomResourceOptions? options = null)
            : base("gcp:gkebackup/restorePlan:RestorePlan", name, args ?? new RestorePlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RestorePlan(string name, Input<string> id, RestorePlanState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gkebackup/restorePlan:RestorePlan", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RestorePlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RestorePlan Get(string name, Input<string> id, RestorePlanState? state = null, CustomResourceOptions? options = null)
        {
            return new RestorePlan(name, id, state, options);
        }
    }

    public sealed class RestorePlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A reference to the BackupPlan from which Backups may be used
        /// as the source for Restores created via this RestorePlan.
        /// </summary>
        [Input("backupPlan", required: true)]
        public Input<string> BackupPlan { get; set; } = null!;

        /// <summary>
        /// The source cluster from which Restores will be created via this RestorePlan.
        /// </summary>
        [Input("cluster", required: true)]
        public Input<string> Cluster { get; set; } = null!;

        /// <summary>
        /// The description is a user specified string description
        /// of the transformation rule.
        /// 
        /// (Optional)
        /// User specified descriptive string for this RestorePlan.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Description: A set of custom labels supplied by the user.
        /// A list of key-&gt;value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The region of the Restore Plan.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The full name of the BackupPlan Resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Defines the configuration of Restores created via this RestorePlan.
        /// Structure is documented below.
        /// </summary>
        [Input("restoreConfig", required: true)]
        public Input<Inputs.RestorePlanRestoreConfigArgs> RestoreConfig { get; set; } = null!;

        public RestorePlanArgs()
        {
        }
        public static new RestorePlanArgs Empty => new RestorePlanArgs();
    }

    public sealed class RestorePlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A reference to the BackupPlan from which Backups may be used
        /// as the source for Restores created via this RestorePlan.
        /// </summary>
        [Input("backupPlan")]
        public Input<string>? BackupPlan { get; set; }

        /// <summary>
        /// The source cluster from which Restores will be created via this RestorePlan.
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// The description is a user specified string description
        /// of the transformation rule.
        /// 
        /// (Optional)
        /// User specified descriptive string for this RestorePlan.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Description: A set of custom labels supplied by the user.
        /// A list of key-&gt;value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The region of the Restore Plan.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The full name of the BackupPlan Resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Defines the configuration of Restores created via this RestorePlan.
        /// Structure is documented below.
        /// </summary>
        [Input("restoreConfig")]
        public Input<Inputs.RestorePlanRestoreConfigGetArgs>? RestoreConfig { get; set; }

        /// <summary>
        /// The State of the RestorePlan.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Detailed description of why RestorePlan is in its current state.
        /// </summary>
        [Input("stateReason")]
        public Input<string>? StateReason { get; set; }

        /// <summary>
        /// Server generated, unique identifier of UUID format.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        public RestorePlanState()
        {
        }
        public static new RestorePlanState Empty => new RestorePlanState();
    }
}