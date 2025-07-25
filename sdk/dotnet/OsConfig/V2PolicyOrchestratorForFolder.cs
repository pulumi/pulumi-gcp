// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig
{
    /// <summary>
    /// PolicyOrchestrator helps managing project+zone level policy resources (e.g.
    /// OS Policy Assignments), by providing tools to create, update and delete them
    /// across projects and locations, at scale.
    /// 
    /// ## Example Usage
    /// 
    /// ### Osconfigv2 Policy Orchestrator For Folder Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Time = Pulumi.Time;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myFolder = new Gcp.Organizations.Folder("my_folder", new()
    ///     {
    ///         DisplayName = "po-folder",
    ///         Parent = "organizations/123456789",
    ///         DeletionProtection = false,
    ///     });
    /// 
    ///     var osconfigSa = new Gcp.Folder.ServiceIdentity("osconfig_sa", new()
    ///     {
    ///         Folder = myFolder.FolderId,
    ///         Service = "osconfig.googleapis.com",
    ///     });
    /// 
    ///     var rippleSa = new Gcp.Folder.ServiceIdentity("ripple_sa", new()
    ///     {
    ///         Folder = myFolder.FolderId,
    ///         Service = "progressiverollout.googleapis.com",
    ///     });
    /// 
    ///     var wait30Sec = new Time.Index.Sleep("wait_30_sec", new()
    ///     {
    ///         CreateDuration = "30s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             osconfigSa,
    ///             rippleSa,
    ///         },
    ///     });
    /// 
    ///     var iamOsconfigServiceAgent = new Gcp.Folder.IAMMember("iam_osconfig_service_agent", new()
    ///     {
    ///         Folder = myFolder.FolderId,
    ///         Role = "roles/osconfig.serviceAgent",
    ///         Member = osconfigSa.Member,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             wait30Sec,
    ///         },
    ///     });
    /// 
    ///     var iamOsconfigRolloutServiceAgent = new Gcp.Folder.IAMMember("iam_osconfig_rollout_service_agent", new()
    ///     {
    ///         Folder = myFolder.FolderId,
    ///         Role = "roles/osconfig.rolloutServiceAgent",
    ///         Member = myFolder.FolderId.Apply(folderId =&gt; $"serviceAccount:service-folder-{folderId}@gcp-sa-osconfig-rollout.iam.gserviceaccount.com"),
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             iamOsconfigServiceAgent,
    ///         },
    ///     });
    /// 
    ///     var iamProgressiverolloutServiceAgent = new Gcp.Folder.IAMMember("iam_progressiverollout_service_agent", new()
    ///     {
    ///         Folder = myFolder.FolderId,
    ///         Role = "roles/progressiverollout.serviceAgent",
    ///         Member = rippleSa.Member,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             iamOsconfigRolloutServiceAgent,
    ///         },
    ///     });
    /// 
    ///     var wait3Min = new Time.Index.Sleep("wait_3_min", new()
    ///     {
    ///         CreateDuration = "180s",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             iamProgressiverolloutServiceAgent,
    ///         },
    ///     });
    /// 
    ///     var policyOrchestratorForFolder = new Gcp.OsConfig.V2PolicyOrchestratorForFolder("policy_orchestrator_for_folder", new()
    ///     {
    ///         PolicyOrchestratorId = "po-folder",
    ///         FolderId = myFolder.FolderId,
    ///         State = "ACTIVE",
    ///         Action = "UPSERT",
    ///         OrchestratedResource = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs
    ///         {
    ///             Id = "test-orchestrated-resource-folder",
    ///             OsPolicyAssignmentV1Payload = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadArgs
    ///             {
    ///                 OsPolicies = new[]
    ///                 {
    ///                     new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyArgs
    ///                     {
    ///                         Id = "test-os-policy-folder",
    ///                         Mode = "VALIDATION",
    ///                         ResourceGroups = new[]
    ///                         {
    ///                             new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupArgs
    ///                             {
    ///                                 Resources = new[]
    ///                                 {
    ///                                     new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceArgs
    ///                                     {
    ///                                         Id = "resource-tf",
    ///                                         File = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileArgs
    ///                                         {
    ///                                             Content = "file-content-tf",
    ///                                             Path = "file-path-tf-1",
    ///                                             State = "PRESENT",
    ///                                         },
    ///                                     },
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 InstanceFilter = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterArgs
    ///                 {
    ///                     Inventories = new[]
    ///                     {
    ///                         new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadInstanceFilterInventoryArgs
    ///                         {
    ///                             OsShortName = "windows-10",
    ///                         },
    ///                     },
    ///                 },
    ///                 Rollout = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs
    ///                 {
    ///                     DisruptionBudget = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs
    ///                     {
    ///                         Percent = 100,
    ///                     },
    ///                     MinWaitDuration = "60s",
    ///                 },
    ///             },
    ///         },
    ///         Labels = 
    ///         {
    ///             { "state", "active" },
    ///         },
    ///         OrchestrationScope = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs
    ///         {
    ///             Selectors = new[]
    ///             {
    ///                 new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorArgs
    ///                 {
    ///                     LocationSelector = new Gcp.OsConfig.Inputs.V2PolicyOrchestratorForFolderOrchestrationScopeSelectorLocationSelectorArgs
    ///                     {
    ///                         IncludedLocations = new[]
    ///                         {
    ///                             "",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             wait3Min,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// PolicyOrchestratorForFolder can be imported using any of these accepted formats:
    /// 
    /// * `folders/{{folder_id}}/locations/global/policyOrchestrators/{{policy_orchestrator_id}}`
    /// 
    /// * `{{folder_id}}/{{policy_orchestrator_id}}`
    /// 
    /// When using the `pulumi import` command, PolicyOrchestratorForFolder can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder default folders/{{folder_id}}/locations/global/policyOrchestrators/{{policy_orchestrator_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder default {{folder_id}}/{{policy_orchestrator_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder")]
    public partial class V2PolicyOrchestratorForFolder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Action to be done by the orchestrator in
        /// `projects/{project_id}/zones/{zone_id}` locations defined by the
        /// `orchestration_scope`. Allowed values:
        /// - `UPSERT` - Orchestrator will create or update target resources.
        /// - `DELETE` - Orchestrator will delete target resources, if they exist
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the policy orchestrator resource was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Freeform text describing the purpose of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The parent resource name in the form of `folders/{folder_id}/locations/global`.
        /// </summary>
        [Output("folderId")]
        public Output<string> FolderId { get; private set; } = null!;

        /// <summary>
        /// Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Identifier. In form of
        /// * `organizations/{organization_id}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// * `folders/{folder_id}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// * `projects/{project_id_or_number}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Represents a resource that is being orchestrated by the policy orchestrator.
        /// Structure is documented below.
        /// </summary>
        [Output("orchestratedResource")]
        public Output<Outputs.V2PolicyOrchestratorForFolderOrchestratedResource> OrchestratedResource { get; private set; } = null!;

        /// <summary>
        /// Defines a set of selectors which drive which resources are in scope of policy
        /// orchestration.
        /// Structure is documented below.
        /// </summary>
        [Output("orchestrationScope")]
        public Output<Outputs.V2PolicyOrchestratorForFolderOrchestrationScope?> OrchestrationScope { get; private set; } = null!;

        /// <summary>
        /// Describes the state of the orchestration process.
        /// Structure is documented below.
        /// </summary>
        [Output("orchestrationStates")]
        public Output<ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestrationState>> OrchestrationStates { get; private set; } = null!;

        /// <summary>
        /// The logical identifier of the policy orchestrator, with the following
        /// restrictions:
        /// * Must contain only lowercase letters, numbers, and hyphens.
        /// * Must start with a letter.
        /// * Must be between 1-63 characters.
        /// * Must end with a number or a letter.
        /// * Must be unique within the parent.
        /// </summary>
        [Output("policyOrchestratorId")]
        public Output<string> PolicyOrchestratorId { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// Set to true, if the there are ongoing changes being applied by the
        /// orchestrator.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// State of the orchestrator. Can be updated to change orchestrator behaviour.
        /// Allowed values:
        /// - `ACTIVE` - orchestrator is actively looking for actions to be taken.
        /// - `STOPPED` - orchestrator won't make any changes.
        /// Note: There might be more states added in the future. We use string here
        /// instead of an enum, to avoid the need of propagating new states to all the
        /// client code.
        /// </summary>
        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// Timestamp when the policy orchestrator resource was last modified.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a V2PolicyOrchestratorForFolder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public V2PolicyOrchestratorForFolder(string name, V2PolicyOrchestratorForFolderArgs args, CustomResourceOptions? options = null)
            : base("gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder", name, args ?? new V2PolicyOrchestratorForFolderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private V2PolicyOrchestratorForFolder(string name, Input<string> id, V2PolicyOrchestratorForFolderState? state = null, CustomResourceOptions? options = null)
            : base("gcp:osconfig/v2PolicyOrchestratorForFolder:V2PolicyOrchestratorForFolder", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing V2PolicyOrchestratorForFolder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static V2PolicyOrchestratorForFolder Get(string name, Input<string> id, V2PolicyOrchestratorForFolderState? state = null, CustomResourceOptions? options = null)
        {
            return new V2PolicyOrchestratorForFolder(name, id, state, options);
        }
    }

    public sealed class V2PolicyOrchestratorForFolderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to be done by the orchestrator in
        /// `projects/{project_id}/zones/{zone_id}` locations defined by the
        /// `orchestration_scope`. Allowed values:
        /// - `UPSERT` - Orchestrator will create or update target resources.
        /// - `DELETE` - Orchestrator will delete target resources, if they exist
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Freeform text describing the purpose of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The parent resource name in the form of `folders/{folder_id}/locations/global`.
        /// </summary>
        [Input("folderId", required: true)]
        public Input<string> FolderId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Represents a resource that is being orchestrated by the policy orchestrator.
        /// Structure is documented below.
        /// </summary>
        [Input("orchestratedResource", required: true)]
        public Input<Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceArgs> OrchestratedResource { get; set; } = null!;

        /// <summary>
        /// Defines a set of selectors which drive which resources are in scope of policy
        /// orchestration.
        /// Structure is documented below.
        /// </summary>
        [Input("orchestrationScope")]
        public Input<Inputs.V2PolicyOrchestratorForFolderOrchestrationScopeArgs>? OrchestrationScope { get; set; }

        /// <summary>
        /// The logical identifier of the policy orchestrator, with the following
        /// restrictions:
        /// * Must contain only lowercase letters, numbers, and hyphens.
        /// * Must start with a letter.
        /// * Must be between 1-63 characters.
        /// * Must end with a number or a letter.
        /// * Must be unique within the parent.
        /// </summary>
        [Input("policyOrchestratorId", required: true)]
        public Input<string> PolicyOrchestratorId { get; set; } = null!;

        /// <summary>
        /// State of the orchestrator. Can be updated to change orchestrator behaviour.
        /// Allowed values:
        /// - `ACTIVE` - orchestrator is actively looking for actions to be taken.
        /// - `STOPPED` - orchestrator won't make any changes.
        /// Note: There might be more states added in the future. We use string here
        /// instead of an enum, to avoid the need of propagating new states to all the
        /// client code.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public V2PolicyOrchestratorForFolderArgs()
        {
        }
        public static new V2PolicyOrchestratorForFolderArgs Empty => new V2PolicyOrchestratorForFolderArgs();
    }

    public sealed class V2PolicyOrchestratorForFolderState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to be done by the orchestrator in
        /// `projects/{project_id}/zones/{zone_id}` locations defined by the
        /// `orchestration_scope`. Allowed values:
        /// - `UPSERT` - Orchestrator will create or update target resources.
        /// - `DELETE` - Orchestrator will delete target resources, if they exist
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Timestamp when the policy orchestrator resource was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Freeform text describing the purpose of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The parent resource name in the form of `folders/{folder_id}/locations/global`.
        /// </summary>
        [Input("folderId")]
        public Input<string>? FolderId { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Identifier. In form of
        /// * `organizations/{organization_id}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// * `folders/{folder_id}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// * `projects/{project_id_or_number}/locations/global/policyOrchestrators/{orchestrator_id}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Represents a resource that is being orchestrated by the policy orchestrator.
        /// Structure is documented below.
        /// </summary>
        [Input("orchestratedResource")]
        public Input<Inputs.V2PolicyOrchestratorForFolderOrchestratedResourceGetArgs>? OrchestratedResource { get; set; }

        /// <summary>
        /// Defines a set of selectors which drive which resources are in scope of policy
        /// orchestration.
        /// Structure is documented below.
        /// </summary>
        [Input("orchestrationScope")]
        public Input<Inputs.V2PolicyOrchestratorForFolderOrchestrationScopeGetArgs>? OrchestrationScope { get; set; }

        [Input("orchestrationStates")]
        private InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateGetArgs>? _orchestrationStates;

        /// <summary>
        /// Describes the state of the orchestration process.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateGetArgs> OrchestrationStates
        {
            get => _orchestrationStates ?? (_orchestrationStates = new InputList<Inputs.V2PolicyOrchestratorForFolderOrchestrationStateGetArgs>());
            set => _orchestrationStates = value;
        }

        /// <summary>
        /// The logical identifier of the policy orchestrator, with the following
        /// restrictions:
        /// * Must contain only lowercase letters, numbers, and hyphens.
        /// * Must start with a letter.
        /// * Must be between 1-63 characters.
        /// * Must end with a number or a letter.
        /// * Must be unique within the parent.
        /// </summary>
        [Input("policyOrchestratorId")]
        public Input<string>? PolicyOrchestratorId { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Set to true, if the there are ongoing changes being applied by the
        /// orchestrator.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// State of the orchestrator. Can be updated to change orchestrator behaviour.
        /// Allowed values:
        /// - `ACTIVE` - orchestrator is actively looking for actions to be taken.
        /// - `STOPPED` - orchestrator won't make any changes.
        /// Note: There might be more states added in the future. We use string here
        /// instead of an enum, to avoid the need of propagating new states to all the
        /// client code.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Timestamp when the policy orchestrator resource was last modified.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public V2PolicyOrchestratorForFolderState()
        {
        }
        public static new V2PolicyOrchestratorForFolderState Empty => new V2PolicyOrchestratorForFolderState();
    }
}
