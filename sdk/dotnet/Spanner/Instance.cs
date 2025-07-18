// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner
{
    /// <summary>
    /// An isolated set of Cloud Spanner resources on which databases can be
    /// hosted.
    /// 
    /// To get more information about Instance, see:
    /// 
    /// * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/spanner/)
    /// 
    /// ## Example Usage
    /// 
    /// ### Spanner Instance Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Spanner.Instance("example", new()
    ///     {
    ///         Config = "regional-us-central1",
    ///         DisplayName = "Test Spanner Instance",
    ///         NumNodes = 2,
    ///         Edition = "STANDARD",
    ///         DefaultBackupScheduleType = "AUTOMATIC",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Spanner Instance Processing Units
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Spanner.Instance("example", new()
    ///     {
    ///         Config = "regional-us-central1",
    ///         DisplayName = "Test Spanner Instance",
    ///         ProcessingUnits = 200,
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Spanner Instance Multi Regional
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Spanner.Instance("example", new()
    ///     {
    ///         Config = "nam-eur-asia1",
    ///         DisplayName = "Multi Regional Instance",
    ///         NumNodes = 2,
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Instance can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/instances/{{name}}`
    /// 
    /// * `{{project}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:spanner/instance:Instance default projects/{{project}}/instances/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:spanner/instance:Instance default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:spanner/instance:Instance default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:spanner/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        [Output("autoscalingConfig")]
        public Output<Outputs.InstanceAutoscalingConfig?> AutoscalingConfig { get; private set; } = null!;

        /// <summary>
        /// The name of the instance's configuration (similar but not
        /// quite the same as a region) which defines the geographic placement and
        /// replication of your databases in this instance. It determines where your data
        /// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
        /// In order to obtain a valid list please consult the
        /// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
        /// </summary>
        [Output("config")]
        public Output<string> Config { get; private set; } = null!;

        /// <summary>
        /// Controls the default backup behavior for new databases within the instance.
        /// Note that `AUTOMATIC` is not permitted for free instances, as backups and backup schedules are not allowed for free instances.
        /// if unset or NONE, no default backup schedule will be created for new databases within the instance.
        /// Possible values are: `NONE`, `AUTOMATIC`.
        /// </summary>
        [Output("defaultBackupScheduleType")]
        public Output<string> DefaultBackupScheduleType { get; private set; } = null!;

        /// <summary>
        /// The descriptive name for this instance as it appears in UIs. Must be
        /// unique per project and between 4 and 30 characters in length.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The edition selected for this instance. Different editions provide different capabilities at different price points.
        /// Possible values are: `EDITION_UNSPECIFIED`, `STANDARD`, `ENTERPRISE`, `ENTERPRISE_PLUS`.
        /// </summary>
        [Output("edition")]
        public Output<string> Edition { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// When deleting a spanner instance, this boolean option will delete all backups of this instance.
        /// This must be set to true if you created a backup manually in the console.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// The type of this instance. The type can be used to distinguish product variants, that can affect aspects like:
        /// usage restrictions, quotas and billing. Currently this is used to distinguish FREE_INSTANCE vs PROVISIONED instances.
        /// When configured as FREE_INSTANCE, the field `edition` should not be configured.
        /// Possible values are: `PROVISIONED`, `FREE_INSTANCE`.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// An object containing a list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// A unique identifier for the instance, which cannot be changed after
        /// the instance is created. The name must be between 6 and 30 characters
        /// in length.
        /// If not provided, a random string starting with `tf-` will be selected.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("numNodes")]
        public Output<int> NumNodes { get; private set; } = null!;

        [Output("processingUnits")]
        public Output<int> ProcessingUnits { get; private set; } = null!;

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
        /// Instance status: `CREATING` or `READY`.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("gcp:spanner/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("gcp:spanner/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscalingConfig")]
        public Input<Inputs.InstanceAutoscalingConfigArgs>? AutoscalingConfig { get; set; }

        /// <summary>
        /// The name of the instance's configuration (similar but not
        /// quite the same as a region) which defines the geographic placement and
        /// replication of your databases in this instance. It determines where your data
        /// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
        /// In order to obtain a valid list please consult the
        /// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
        /// </summary>
        [Input("config", required: true)]
        public Input<string> Config { get; set; } = null!;

        /// <summary>
        /// Controls the default backup behavior for new databases within the instance.
        /// Note that `AUTOMATIC` is not permitted for free instances, as backups and backup schedules are not allowed for free instances.
        /// if unset or NONE, no default backup schedule will be created for new databases within the instance.
        /// Possible values are: `NONE`, `AUTOMATIC`.
        /// </summary>
        [Input("defaultBackupScheduleType")]
        public Input<string>? DefaultBackupScheduleType { get; set; }

        /// <summary>
        /// The descriptive name for this instance as it appears in UIs. Must be
        /// unique per project and between 4 and 30 characters in length.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The edition selected for this instance. Different editions provide different capabilities at different price points.
        /// Possible values are: `EDITION_UNSPECIFIED`, `STANDARD`, `ENTERPRISE`, `ENTERPRISE_PLUS`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// When deleting a spanner instance, this boolean option will delete all backups of this instance.
        /// This must be set to true if you created a backup manually in the console.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The type of this instance. The type can be used to distinguish product variants, that can affect aspects like:
        /// usage restrictions, quotas and billing. Currently this is used to distinguish FREE_INSTANCE vs PROVISIONED instances.
        /// When configured as FREE_INSTANCE, the field `edition` should not be configured.
        /// Possible values are: `PROVISIONED`, `FREE_INSTANCE`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// An object containing a list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
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
        /// A unique identifier for the instance, which cannot be changed after
        /// the instance is created. The name must be between 6 and 30 characters
        /// in length.
        /// If not provided, a random string starting with `tf-` will be selected.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("numNodes")]
        public Input<int>? NumNodes { get; set; }

        [Input("processingUnits")]
        public Input<int>? ProcessingUnits { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        [Input("autoscalingConfig")]
        public Input<Inputs.InstanceAutoscalingConfigGetArgs>? AutoscalingConfig { get; set; }

        /// <summary>
        /// The name of the instance's configuration (similar but not
        /// quite the same as a region) which defines the geographic placement and
        /// replication of your databases in this instance. It determines where your data
        /// is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
        /// In order to obtain a valid list please consult the
        /// [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
        /// </summary>
        [Input("config")]
        public Input<string>? Config { get; set; }

        /// <summary>
        /// Controls the default backup behavior for new databases within the instance.
        /// Note that `AUTOMATIC` is not permitted for free instances, as backups and backup schedules are not allowed for free instances.
        /// if unset or NONE, no default backup schedule will be created for new databases within the instance.
        /// Possible values are: `NONE`, `AUTOMATIC`.
        /// </summary>
        [Input("defaultBackupScheduleType")]
        public Input<string>? DefaultBackupScheduleType { get; set; }

        /// <summary>
        /// The descriptive name for this instance as it appears in UIs. Must be
        /// unique per project and between 4 and 30 characters in length.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The edition selected for this instance. Different editions provide different capabilities at different price points.
        /// Possible values are: `EDITION_UNSPECIFIED`, `STANDARD`, `ENTERPRISE`, `ENTERPRISE_PLUS`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

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
        /// When deleting a spanner instance, this boolean option will delete all backups of this instance.
        /// This must be set to true if you created a backup manually in the console.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The type of this instance. The type can be used to distinguish product variants, that can affect aspects like:
        /// usage restrictions, quotas and billing. Currently this is used to distinguish FREE_INSTANCE vs PROVISIONED instances.
        /// When configured as FREE_INSTANCE, the field `edition` should not be configured.
        /// Possible values are: `PROVISIONED`, `FREE_INSTANCE`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// An object containing a list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
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
        /// A unique identifier for the instance, which cannot be changed after
        /// the instance is created. The name must be between 6 and 30 characters
        /// in length.
        /// If not provided, a random string starting with `tf-` will be selected.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("numNodes")]
        public Input<int>? NumNodes { get; set; }

        [Input("processingUnits")]
        public Input<int>? ProcessingUnits { get; set; }

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
        /// Instance status: `CREATING` or `READY`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
