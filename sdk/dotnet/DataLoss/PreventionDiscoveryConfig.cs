// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss
{
    /// <summary>
    /// Configuration for discovery to scan resources for profile generation. Only one discovery configuration may exist per organization, folder, or project.
    /// 
    /// To get more information about DiscoveryConfig, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.locations.discoveryConfigs)
    /// * How-to Guides
    ///     * [Schedule inspection scan](https://cloud.google.com/dlp/docs/schedule-inspection-scan)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// DiscoveryConfig can be imported using any of these accepted formats:
    /// 
    /// * `{{parent}}/discoveryConfigs/{{name}}`
    /// 
    /// * `{{parent}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, DiscoveryConfig can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataloss/preventionDiscoveryConfig:PreventionDiscoveryConfig default {{parent}}/discoveryConfigs/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataloss/preventionDiscoveryConfig:PreventionDiscoveryConfig default {{parent}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataloss/preventionDiscoveryConfig:PreventionDiscoveryConfig")]
    public partial class PreventionDiscoveryConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Actions to execute at the completion of scanning
        /// Structure is documented below.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.PreventionDiscoveryConfigAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// Output only. The creation timestamp of a DiscoveryConfig.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Display Name (max 1000 Chars)
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Output only. A stream of errors encountered when the config was activated. Repeated errors may result in the config automatically being paused. Output only field. Will return the last 100 errors. Whenever the config is modified this list will be cleared.
        /// Structure is documented below.
        /// </summary>
        [Output("errors")]
        public Output<ImmutableArray<Outputs.PreventionDiscoveryConfigError>> Errors { get; private set; } = null!;

        /// <summary>
        /// Detection logic for profile generation
        /// </summary>
        [Output("inspectTemplates")]
        public Output<ImmutableArray<string>> InspectTemplates { get; private set; } = null!;

        /// <summary>
        /// Output only. The timestamp of the last time this config was executed
        /// </summary>
        [Output("lastRunTime")]
        public Output<string> LastRunTime { get; private set; } = null!;

        /// <summary>
        /// Location to create the discovery config in.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Unique resource name for the DiscoveryConfig, assigned by the service when the DiscoveryConfig is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        [Output("orgConfig")]
        public Output<Outputs.PreventionDiscoveryConfigOrgConfig?> OrgConfig { get; private set; } = null!;

        /// <summary>
        /// The parent of the discovery config in any of the following formats:
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// Required. A status for this configuration
        /// Possible values are: `RUNNING`, `PAUSED`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Target to match against for determining what to scan and how frequently
        /// Structure is documented below.
        /// </summary>
        [Output("targets")]
        public Output<ImmutableArray<Outputs.PreventionDiscoveryConfigTarget>> Targets { get; private set; } = null!;

        /// <summary>
        /// Output only. The last update timestamp of a DiscoveryConfig.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a PreventionDiscoveryConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PreventionDiscoveryConfig(string name, PreventionDiscoveryConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionDiscoveryConfig:PreventionDiscoveryConfig", name, args ?? new PreventionDiscoveryConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PreventionDiscoveryConfig(string name, Input<string> id, PreventionDiscoveryConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionDiscoveryConfig:PreventionDiscoveryConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PreventionDiscoveryConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PreventionDiscoveryConfig Get(string name, Input<string> id, PreventionDiscoveryConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new PreventionDiscoveryConfig(name, id, state, options);
        }
    }

    public sealed class PreventionDiscoveryConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.PreventionDiscoveryConfigActionArgs>? _actions;

        /// <summary>
        /// Actions to execute at the completion of scanning
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.PreventionDiscoveryConfigActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Display Name (max 1000 Chars)
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("inspectTemplates")]
        private InputList<string>? _inspectTemplates;

        /// <summary>
        /// Detection logic for profile generation
        /// </summary>
        public InputList<string> InspectTemplates
        {
            get => _inspectTemplates ?? (_inspectTemplates = new InputList<string>());
            set => _inspectTemplates = value;
        }

        /// <summary>
        /// Location to create the discovery config in.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        [Input("orgConfig")]
        public Input<Inputs.PreventionDiscoveryConfigOrgConfigArgs>? OrgConfig { get; set; }

        /// <summary>
        /// The parent of the discovery config in any of the following formats:
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        /// <summary>
        /// Required. A status for this configuration
        /// Possible values are: `RUNNING`, `PAUSED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("targets")]
        private InputList<Inputs.PreventionDiscoveryConfigTargetArgs>? _targets;

        /// <summary>
        /// Target to match against for determining what to scan and how frequently
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.PreventionDiscoveryConfigTargetArgs>());
            set => _targets = value;
        }

        public PreventionDiscoveryConfigArgs()
        {
        }
        public static new PreventionDiscoveryConfigArgs Empty => new PreventionDiscoveryConfigArgs();
    }

    public sealed class PreventionDiscoveryConfigState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.PreventionDiscoveryConfigActionGetArgs>? _actions;

        /// <summary>
        /// Actions to execute at the completion of scanning
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.PreventionDiscoveryConfigActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Output only. The creation timestamp of a DiscoveryConfig.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Display Name (max 1000 Chars)
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("errors")]
        private InputList<Inputs.PreventionDiscoveryConfigErrorGetArgs>? _errors;

        /// <summary>
        /// Output only. A stream of errors encountered when the config was activated. Repeated errors may result in the config automatically being paused. Output only field. Will return the last 100 errors. Whenever the config is modified this list will be cleared.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.PreventionDiscoveryConfigErrorGetArgs>());
            set => _errors = value;
        }

        [Input("inspectTemplates")]
        private InputList<string>? _inspectTemplates;

        /// <summary>
        /// Detection logic for profile generation
        /// </summary>
        public InputList<string> InspectTemplates
        {
            get => _inspectTemplates ?? (_inspectTemplates = new InputList<string>());
            set => _inspectTemplates = value;
        }

        /// <summary>
        /// Output only. The timestamp of the last time this config was executed
        /// </summary>
        [Input("lastRunTime")]
        public Input<string>? LastRunTime { get; set; }

        /// <summary>
        /// Location to create the discovery config in.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Unique resource name for the DiscoveryConfig, assigned by the service when the DiscoveryConfig is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        [Input("orgConfig")]
        public Input<Inputs.PreventionDiscoveryConfigOrgConfigGetArgs>? OrgConfig { get; set; }

        /// <summary>
        /// The parent of the discovery config in any of the following formats:
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// Required. A status for this configuration
        /// Possible values are: `RUNNING`, `PAUSED`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("targets")]
        private InputList<Inputs.PreventionDiscoveryConfigTargetGetArgs>? _targets;

        /// <summary>
        /// Target to match against for determining what to scan and how frequently
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigTargetGetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.PreventionDiscoveryConfigTargetGetArgs>());
            set => _targets = value;
        }

        /// <summary>
        /// Output only. The last update timestamp of a DiscoveryConfig.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public PreventionDiscoveryConfigState()
        {
        }
        public static new PreventionDiscoveryConfigState Empty => new PreventionDiscoveryConfigState();
    }
}
