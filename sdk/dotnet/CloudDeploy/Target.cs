// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy
{
    /// <summary>
    /// The Cloud Deploy `Target` resource
    /// 
    /// ## Example Usage
    /// ### Target
    /// Creates a basic Cloud Deploy target
    /// ```csharp
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var primary = new Gcp.CloudDeploy.Target("primary", new Gcp.CloudDeploy.TargetArgs
    ///         {
    ///             Annotations = 
    ///             {
    ///                 { "my_first_annotation", "example-annotation-1" },
    ///                 { "my_second_annotation", "example-annotation-2" },
    ///             },
    ///             Description = "basic description",
    ///             Gke = new Gcp.CloudDeploy.Inputs.TargetGkeArgs
    ///             {
    ///                 Cluster = "projects/my-project-name/locations/us-west1/clusters/example-cluster-name",
    ///             },
    ///             Labels = 
    ///             {
    ///                 { "my_first_label", "example-label-1" },
    ///                 { "my_second_label", "example-label-2" },
    ///             },
    ///             Location = "us-west1",
    ///             Project = "my-project-name",
    ///             RequireApproval = false,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Target can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:clouddeploy/target:Target default projects/{{project}}/locations/{{location}}/targets/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:clouddeploy/target:Target default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:clouddeploy/target:Target default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:clouddeploy/target:Target")]
    public partial class Target : Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Information specifying an Anthos Cluster.
        /// </summary>
        [Output("anthosCluster")]
        public Output<Outputs.TargetAnthosCluster?> AnthosCluster { get; private set; } = null!;

        /// <summary>
        /// Output only. Time at which the `Target` was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Optional. Description of the `Target`. Max length is 255 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
        /// delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
        /// </summary>
        [Output("executionConfigs")]
        public Output<ImmutableArray<Outputs.TargetExecutionConfig>> ExecutionConfigs { get; private set; } = null!;

        /// <summary>
        /// Information specifying a GKE Cluster.
        /// </summary>
        [Output("gke")]
        public Output<Outputs.TargetGke?> Gke { get; private set; } = null!;

        /// <summary>
        /// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Optional. Whether or not the `Target` requires approval.
        /// </summary>
        [Output("requireApproval")]
        public Output<bool?> RequireApproval { get; private set; } = null!;

        /// <summary>
        /// Output only. Resource id of the `Target`.
        /// </summary>
        [Output("targetId")]
        public Output<string> TargetId { get; private set; } = null!;

        /// <summary>
        /// Output only. Unique identifier of the `Target`.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Output only. Most recent time at which the `Target` was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Target resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Target(string name, TargetArgs args, CustomResourceOptions? options = null)
            : base("gcp:clouddeploy/target:Target", name, args ?? new TargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Target(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
            : base("gcp:clouddeploy/target:Target", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Target resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Target Get(string name, Input<string> id, TargetState? state = null, CustomResourceOptions? options = null)
        {
            return new Target(name, id, state, options);
        }
    }

    public sealed class TargetArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Information specifying an Anthos Cluster.
        /// </summary>
        [Input("anthosCluster")]
        public Input<Inputs.TargetAnthosClusterArgs>? AnthosCluster { get; set; }

        /// <summary>
        /// Optional. Description of the `Target`. Max length is 255 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("executionConfigs")]
        private InputList<Inputs.TargetExecutionConfigArgs>? _executionConfigs;

        /// <summary>
        /// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
        /// </summary>
        public InputList<Inputs.TargetExecutionConfigArgs> ExecutionConfigs
        {
            get => _executionConfigs ?? (_executionConfigs = new InputList<Inputs.TargetExecutionConfigArgs>());
            set => _executionConfigs = value;
        }

        /// <summary>
        /// Information specifying a GKE Cluster.
        /// </summary>
        [Input("gke")]
        public Input<Inputs.TargetGkeArgs>? Gke { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Optional. Whether or not the `Target` requires approval.
        /// </summary>
        [Input("requireApproval")]
        public Input<bool>? RequireApproval { get; set; }

        public TargetArgs()
        {
        }
    }

    public sealed class TargetState : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Information specifying an Anthos Cluster.
        /// </summary>
        [Input("anthosCluster")]
        public Input<Inputs.TargetAnthosClusterGetArgs>? AnthosCluster { get; set; }

        /// <summary>
        /// Output only. Time at which the `Target` was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Optional. Description of the `Target`. Max length is 255 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update and
        /// delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("executionConfigs")]
        private InputList<Inputs.TargetExecutionConfigGetArgs>? _executionConfigs;

        /// <summary>
        /// Configurations for all execution that relates to this `Target`. Each `ExecutionEnvironmentUsage` value may only be used in a single configuration; using the same value multiple times is an error. When one or more configurations are specified, they must include the `RENDER` and `DEPLOY` `ExecutionEnvironmentUsage` values. When no configurations are specified, execution will use the default specified in `DefaultPool`.
        /// </summary>
        public InputList<Inputs.TargetExecutionConfigGetArgs> ExecutionConfigs
        {
            get => _executionConfigs ?? (_executionConfigs = new InputList<Inputs.TargetExecutionConfigGetArgs>());
            set => _executionConfigs = value;
        }

        /// <summary>
        /// Information specifying a GKE Cluster.
        /// </summary>
        [Input("gke")]
        public Input<Inputs.TargetGkeGetArgs>? Gke { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of the `Target`. Format is [a-z][a-z0-9\-]{0,62}.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Optional. Whether or not the `Target` requires approval.
        /// </summary>
        [Input("requireApproval")]
        public Input<bool>? RequireApproval { get; set; }

        /// <summary>
        /// Output only. Resource id of the `Target`.
        /// </summary>
        [Input("targetId")]
        public Input<string>? TargetId { get; set; }

        /// <summary>
        /// Output only. Unique identifier of the `Target`.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Output only. Most recent time at which the `Target` was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public TargetState()
        {
        }
    }
}