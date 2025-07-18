// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle
{
    /// <summary>
    /// The RuleDeployment resource represents the deployment state of a Rule.
    /// 
    /// To get more information about RuleDeployment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/RuleDeployment)
    /// * How-to Guides
    ///     * [Google SecOps Guides](https://cloud.google.com/chronicle/docs/secops/secops-overview)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// RuleDeployment can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/instances/{{instance}}/rules/{{rule}}/deployment`
    /// 
    /// * `{{project}}/{{location}}/{{instance}}/{{rule}}`
    /// 
    /// * `{{location}}/{{instance}}/{{rule}}`
    /// 
    /// When using the `pulumi import` command, RuleDeployment can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/ruleDeployment:RuleDeployment default projects/{{project}}/locations/{{location}}/instances/{{instance}}/rules/{{rule}}/deployment
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/ruleDeployment:RuleDeployment default {{project}}/{{location}}/{{instance}}/{{rule}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/ruleDeployment:RuleDeployment default {{location}}/{{instance}}/{{rule}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:chronicle/ruleDeployment:RuleDeployment")]
    public partial class RuleDeployment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether detections resulting from this deployment should be considered
        /// alerts.
        /// </summary>
        [Output("alerting")]
        public Output<bool?> Alerting { get; private set; } = null!;

        /// <summary>
        /// Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment's current archive state is not set to true, the field will be empty.
        /// </summary>
        [Output("archiveTime")]
        public Output<string> ArchiveTime { get; private set; } = null!;

        /// <summary>
        /// The archive state of the rule deployment.
        /// Cannot be set to true unless enabled is set to false i.e.
        /// archiving requires a two-step process: first, disable the rule by
        /// setting 'enabled' to false, then set 'archive' to true.
        /// If set to true, alerting will automatically be set to false.
        /// If currently set to true, enabled, alerting, and run_frequency cannot be
        /// updated.
        /// </summary>
        [Output("archived")]
        public Output<bool?> Archived { get; private set; } = null!;

        /// <summary>
        /// Output only. The names of the associated/chained consumer rules. Rules are considered
        /// consumers of this rule if their rule text explicitly filters on this rule's ruleid.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
        /// </summary>
        [Output("consumerRules")]
        public Output<ImmutableArray<string>> ConsumerRules { get; private set; } = null!;

        /// <summary>
        /// Whether the rule is currently deployed continuously against incoming data.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The execution state of the rule deployment.
        /// Possible values:
        /// DEFAULT
        /// LIMITED
        /// PAUSED
        /// </summary>
        [Output("executionState")]
        public Output<string> ExecutionState { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Output("instance")]
        public Output<string> Instance { get; private set; } = null!;

        /// <summary>
        /// Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
        /// </summary>
        [Output("lastAlertStatusChangeTime")]
        public Output<string> LastAlertStatusChangeTime { get; private set; } = null!;

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The resource name of the rule deployment.
        /// Note that RuleDeployment is a child of the overall Rule, not any individual
        /// revision, so the resource ID segment for the Rule resource must not
        /// reference a specific revision.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Output only. The names of the associated/chained producer rules. Rules are considered
        /// producers for this rule if this rule explicitly filters on their ruleid.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
        /// </summary>
        [Output("producerRules")]
        public Output<ImmutableArray<string>> ProducerRules { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The Rule ID of the rule.
        /// </summary>
        [Output("rule")]
        public Output<string> Rule { get; private set; } = null!;

        /// <summary>
        /// The run frequency of the rule deployment.
        /// Possible values:
        /// LIVE
        /// HOURLY
        /// DAILY
        /// </summary>
        [Output("runFrequency")]
        public Output<string?> RunFrequency { get; private set; } = null!;


        /// <summary>
        /// Create a RuleDeployment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RuleDeployment(string name, RuleDeploymentArgs args, CustomResourceOptions? options = null)
            : base("gcp:chronicle/ruleDeployment:RuleDeployment", name, args ?? new RuleDeploymentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RuleDeployment(string name, Input<string> id, RuleDeploymentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:chronicle/ruleDeployment:RuleDeployment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RuleDeployment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RuleDeployment Get(string name, Input<string> id, RuleDeploymentState? state = null, CustomResourceOptions? options = null)
        {
            return new RuleDeployment(name, id, state, options);
        }
    }

    public sealed class RuleDeploymentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether detections resulting from this deployment should be considered
        /// alerts.
        /// </summary>
        [Input("alerting")]
        public Input<bool>? Alerting { get; set; }

        /// <summary>
        /// The archive state of the rule deployment.
        /// Cannot be set to true unless enabled is set to false i.e.
        /// archiving requires a two-step process: first, disable the rule by
        /// setting 'enabled' to false, then set 'archive' to true.
        /// If set to true, alerting will automatically be set to false.
        /// If currently set to true, enabled, alerting, and run_frequency cannot be
        /// updated.
        /// </summary>
        [Input("archived")]
        public Input<bool>? Archived { get; set; }

        /// <summary>
        /// Whether the rule is currently deployed continuously against incoming data.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Rule ID of the rule.
        /// </summary>
        [Input("rule", required: true)]
        public Input<string> Rule { get; set; } = null!;

        /// <summary>
        /// The run frequency of the rule deployment.
        /// Possible values:
        /// LIVE
        /// HOURLY
        /// DAILY
        /// </summary>
        [Input("runFrequency")]
        public Input<string>? RunFrequency { get; set; }

        public RuleDeploymentArgs()
        {
        }
        public static new RuleDeploymentArgs Empty => new RuleDeploymentArgs();
    }

    public sealed class RuleDeploymentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether detections resulting from this deployment should be considered
        /// alerts.
        /// </summary>
        [Input("alerting")]
        public Input<bool>? Alerting { get; set; }

        /// <summary>
        /// Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment's current archive state is not set to true, the field will be empty.
        /// </summary>
        [Input("archiveTime")]
        public Input<string>? ArchiveTime { get; set; }

        /// <summary>
        /// The archive state of the rule deployment.
        /// Cannot be set to true unless enabled is set to false i.e.
        /// archiving requires a two-step process: first, disable the rule by
        /// setting 'enabled' to false, then set 'archive' to true.
        /// If set to true, alerting will automatically be set to false.
        /// If currently set to true, enabled, alerting, and run_frequency cannot be
        /// updated.
        /// </summary>
        [Input("archived")]
        public Input<bool>? Archived { get; set; }

        [Input("consumerRules")]
        private InputList<string>? _consumerRules;

        /// <summary>
        /// Output only. The names of the associated/chained consumer rules. Rules are considered
        /// consumers of this rule if their rule text explicitly filters on this rule's ruleid.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
        /// </summary>
        public InputList<string> ConsumerRules
        {
            get => _consumerRules ?? (_consumerRules = new InputList<string>());
            set => _consumerRules = value;
        }

        /// <summary>
        /// Whether the rule is currently deployed continuously against incoming data.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The execution state of the rule deployment.
        /// Possible values:
        /// DEFAULT
        /// LIMITED
        /// PAUSED
        /// </summary>
        [Input("executionState")]
        public Input<string>? ExecutionState { get; set; }

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
        /// </summary>
        [Input("lastAlertStatusChangeTime")]
        public Input<string>? LastAlertStatusChangeTime { get; set; }

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the rule deployment.
        /// Note that RuleDeployment is a child of the overall Rule, not any individual
        /// revision, so the resource ID segment for the Rule resource must not
        /// reference a specific revision.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("producerRules")]
        private InputList<string>? _producerRules;

        /// <summary>
        /// Output only. The names of the associated/chained producer rules. Rules are considered
        /// producers for this rule if this rule explicitly filters on their ruleid.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
        /// </summary>
        public InputList<string> ProducerRules
        {
            get => _producerRules ?? (_producerRules = new InputList<string>());
            set => _producerRules = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Rule ID of the rule.
        /// </summary>
        [Input("rule")]
        public Input<string>? Rule { get; set; }

        /// <summary>
        /// The run frequency of the rule deployment.
        /// Possible values:
        /// LIVE
        /// HOURLY
        /// DAILY
        /// </summary>
        [Input("runFrequency")]
        public Input<string>? RunFrequency { get; set; }

        public RuleDeploymentState()
        {
        }
        public static new RuleDeploymentState Empty => new RuleDeploymentState();
    }
}
