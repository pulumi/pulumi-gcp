// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp
{
    /// <summary>
    /// QuotaRule specifies the maximum capacity a user or group can use within a volume. They can be used for creating default and individual quota rules.
    /// 
    /// To get more information about VolumeQuotaRule, see:
    /// 
    /// * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.volumes.quotaRules)
    /// * How-to Guides
    ///     * [Documentation](https://cloud.google.com/netapp/volumes/docs/configure-and-use/volumes/overview#volume_user_and_group_quotas)
    /// 
    /// ## Example Usage
    /// 
    /// ### Netapp Volume Quota Rule Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = Gcp.Compute.GetNetwork.Invoke(new()
    ///     {
    ///         Name = "test-network",
    ///     });
    /// 
    ///     var defaultStoragePool = new Gcp.Netapp.StoragePool("default", new()
    ///     {
    ///         Name = "test-pool",
    ///         Location = "us-west2",
    ///         ServiceLevel = "PREMIUM",
    ///         CapacityGib = "2048",
    ///         Network = @default.Apply(@default =&gt; @default.Apply(getNetworkResult =&gt; getNetworkResult.Id)),
    ///     });
    /// 
    ///     var defaultVolume = new Gcp.Netapp.Volume("default", new()
    ///     {
    ///         Location = defaultStoragePool.Location,
    ///         Name = "test-volume",
    ///         CapacityGib = "100",
    ///         ShareName = "test-volume",
    ///         StoragePool = defaultStoragePool.Name,
    ///         Protocols = new[]
    ///         {
    ///             "NFSV3",
    ///         },
    ///     });
    /// 
    ///     var testQuotaRule = new Gcp.Netapp.VolumeQuotaRule("test_quota_rule", new()
    ///     {
    ///         Location = defaultVolume.Location,
    ///         VolumeName = defaultVolume.Name,
    ///         Type = "DEFAULT_USER_QUOTA",
    ///         DiskLimitMib = 50,
    ///         Name = "test-volume-quota-rule",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             defaultVolume,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VolumeQuotaRule can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/volumes/{{volume_name}}/quotaRules/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{volume_name}}/{{name}}`
    /// 
    /// * `{{location}}/{{volume_name}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, VolumeQuotaRule can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/volumeQuotaRule:VolumeQuotaRule default projects/{{project}}/locations/{{location}}/volumes/{{volume_name}}/quotaRules/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/volumeQuotaRule:VolumeQuotaRule default {{project}}/{{location}}/{{volume_name}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:netapp/volumeQuotaRule:VolumeQuotaRule default {{location}}/{{volume_name}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:netapp/volumeQuotaRule:VolumeQuotaRule")]
    public partial class VolumeQuotaRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Create time of the quota rule. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description for the quota rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The maximum allowed capacity in MiB.
        /// </summary>
        [Output("diskLimitMib")]
        public Output<int> DiskLimitMib { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Labels as key value pairs of the quota rule. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// The resource name of the quotaRule.
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
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// State details of the quota rule
        /// </summary>
        [Output("stateDetails")]
        public Output<string> StateDetails { get; private set; } = null!;

        /// <summary>
        /// The quota rule applies to the specified user or group.
        /// Valid targets for volumes with NFS protocol enabled:
        /// - UNIX UID for individual user quota
        /// - UNIX GID for individual group quota
        /// Valid targets for volumes with SMB protocol enabled:
        /// - Windows SID for individual user quota
        /// Leave empty for default quotas
        /// </summary>
        [Output("target")]
        public Output<string?> Target { get; private set; } = null!;

        /// <summary>
        /// Types of Quota Rule.
        /// Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Name of the volume to create the quotaRule in.
        /// </summary>
        [Output("volumeName")]
        public Output<string> VolumeName { get; private set; } = null!;


        /// <summary>
        /// Create a VolumeQuotaRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VolumeQuotaRule(string name, VolumeQuotaRuleArgs args, CustomResourceOptions? options = null)
            : base("gcp:netapp/volumeQuotaRule:VolumeQuotaRule", name, args ?? new VolumeQuotaRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VolumeQuotaRule(string name, Input<string> id, VolumeQuotaRuleState? state = null, CustomResourceOptions? options = null)
            : base("gcp:netapp/volumeQuotaRule:VolumeQuotaRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VolumeQuotaRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VolumeQuotaRule Get(string name, Input<string> id, VolumeQuotaRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new VolumeQuotaRule(name, id, state, options);
        }
    }

    public sealed class VolumeQuotaRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description for the quota rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum allowed capacity in MiB.
        /// </summary>
        [Input("diskLimitMib", required: true)]
        public Input<int> DiskLimitMib { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs of the quota rule. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the quotaRule.
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
        /// The quota rule applies to the specified user or group.
        /// Valid targets for volumes with NFS protocol enabled:
        /// - UNIX UID for individual user quota
        /// - UNIX GID for individual group quota
        /// Valid targets for volumes with SMB protocol enabled:
        /// - Windows SID for individual user quota
        /// Leave empty for default quotas
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// Types of Quota Rule.
        /// Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Name of the volume to create the quotaRule in.
        /// </summary>
        [Input("volumeName", required: true)]
        public Input<string> VolumeName { get; set; } = null!;

        public VolumeQuotaRuleArgs()
        {
        }
        public static new VolumeQuotaRuleArgs Empty => new VolumeQuotaRuleArgs();
    }

    public sealed class VolumeQuotaRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Create time of the quota rule. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description for the quota rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum allowed capacity in MiB.
        /// </summary>
        [Input("diskLimitMib")]
        public Input<int>? DiskLimitMib { get; set; }

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

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs of the quota rule. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the quotaRule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

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
        /// The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// State details of the quota rule
        /// </summary>
        [Input("stateDetails")]
        public Input<string>? StateDetails { get; set; }

        /// <summary>
        /// The quota rule applies to the specified user or group.
        /// Valid targets for volumes with NFS protocol enabled:
        /// - UNIX UID for individual user quota
        /// - UNIX GID for individual group quota
        /// Valid targets for volumes with SMB protocol enabled:
        /// - Windows SID for individual user quota
        /// Leave empty for default quotas
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// Types of Quota Rule.
        /// Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Name of the volume to create the quotaRule in.
        /// </summary>
        [Input("volumeName")]
        public Input<string>? VolumeName { get; set; }

        public VolumeQuotaRuleState()
        {
        }
        public static new VolumeQuotaRuleState Empty => new VolumeQuotaRuleState();
    }
}
