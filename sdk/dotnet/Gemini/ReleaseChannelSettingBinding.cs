// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Gemini
{
    /// <summary>
    /// The resource for managing ReleaseChannel setting bindings for Admin Control.
    /// 
    /// To get more information about ReleaseChannelSettingBinding, see:
    /// * How-to Guides
    ///     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Gemini Release Channel Setting Binding Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basic = new Gcp.Gemini.ReleaseChannelSetting("basic", new()
    ///     {
    ///         ReleaseChannelSettingId = "ls-tf1",
    ///         Location = "global",
    ///         Labels = 
    ///         {
    ///             { "my_key", "my_value" },
    ///         },
    ///         ReleaseChannel = "EXPERIMENTAL",
    ///     });
    /// 
    ///     var example = new Gcp.Gemini.ReleaseChannelSettingBinding("example", new()
    ///     {
    ///         ReleaseChannelSettingId = basic.ReleaseChannelSettingId,
    ///         SettingBindingId = "ls-tf1b1",
    ///         Location = "global",
    ///         Target = "projects/980109375338",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ReleaseChannelSettingBinding can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/releaseChannelSettings/{{release_channel_setting_id}}/settingBindings/{{setting_binding_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{release_channel_setting_id}}/{{setting_binding_id}}`
    /// 
    /// * `{{location}}/{{release_channel_setting_id}}/{{setting_binding_id}}`
    /// 
    /// When using the `pulumi import` command, ReleaseChannelSettingBinding can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding default projects/{{project}}/locations/{{location}}/releaseChannelSettings/{{release_channel_setting_id}}/settingBindings/{{setting_binding_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding default {{project}}/{{location}}/{{release_channel_setting_id}}/{{setting_binding_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding default {{location}}/{{release_channel_setting_id}}/{{setting_binding_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding")]
    public partial class ReleaseChannelSettingBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Create time stamp.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Identifier. Name of the resource.
        /// Format:projects/{project}/locations/{location}/releaseChannelSettings/{setting}/settingBindings/{setting_binding}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Product type of the setting binding.
        /// Possible values are: `GEMINI_CLOUD_ASSIST`, `GEMINI_CODE_ASSIST`.
        /// </summary>
        [Output("product")]
        public Output<string> Product { get; private set; } = null!;

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
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Output("releaseChannelSettingId")]
        public Output<string> ReleaseChannelSettingId { get; private set; } = null!;

        /// <summary>
        /// Id of the setting binding.
        /// </summary>
        [Output("settingBindingId")]
        public Output<string> SettingBindingId { get; private set; } = null!;

        /// <summary>
        /// Target of the binding.
        /// </summary>
        [Output("target")]
        public Output<string> Target { get; private set; } = null!;

        /// <summary>
        /// Update time stamp.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a ReleaseChannelSettingBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReleaseChannelSettingBinding(string name, ReleaseChannelSettingBindingArgs args, CustomResourceOptions? options = null)
            : base("gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding", name, args ?? new ReleaseChannelSettingBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReleaseChannelSettingBinding(string name, Input<string> id, ReleaseChannelSettingBindingState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gemini/releaseChannelSettingBinding:ReleaseChannelSettingBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ReleaseChannelSettingBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReleaseChannelSettingBinding Get(string name, Input<string> id, ReleaseChannelSettingBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new ReleaseChannelSettingBinding(name, id, state, options);
        }
    }

    public sealed class ReleaseChannelSettingBindingArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Product type of the setting binding.
        /// Possible values are: `GEMINI_CLOUD_ASSIST`, `GEMINI_CODE_ASSIST`.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Input("releaseChannelSettingId", required: true)]
        public Input<string> ReleaseChannelSettingId { get; set; } = null!;

        /// <summary>
        /// Id of the setting binding.
        /// </summary>
        [Input("settingBindingId", required: true)]
        public Input<string> SettingBindingId { get; set; } = null!;

        /// <summary>
        /// Target of the binding.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        public ReleaseChannelSettingBindingArgs()
        {
        }
        public static new ReleaseChannelSettingBindingArgs Empty => new ReleaseChannelSettingBindingArgs();
    }

    public sealed class ReleaseChannelSettingBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Create time stamp.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

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
        /// Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Identifier. Name of the resource.
        /// Format:projects/{project}/locations/{location}/releaseChannelSettings/{setting}/settingBindings/{setting_binding}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Product type of the setting binding.
        /// Possible values are: `GEMINI_CLOUD_ASSIST`, `GEMINI_CODE_ASSIST`.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

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
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
        /// </summary>
        [Input("releaseChannelSettingId")]
        public Input<string>? ReleaseChannelSettingId { get; set; }

        /// <summary>
        /// Id of the setting binding.
        /// </summary>
        [Input("settingBindingId")]
        public Input<string>? SettingBindingId { get; set; }

        /// <summary>
        /// Target of the binding.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// Update time stamp.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ReleaseChannelSettingBindingState()
        {
        }
        public static new ReleaseChannelSettingBindingState Empty => new ReleaseChannelSettingBindingState();
    }
}
