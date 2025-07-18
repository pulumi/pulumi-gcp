// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ParameterManager
{
    /// <summary>
    /// A Parameter resource is a logical parameter.
    /// 
    /// To get more information about Parameter, see:
    /// 
    /// * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters)
    /// 
    /// ## Example Usage
    /// 
    /// ### Parameter Config Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var parameter_basic = new Gcp.ParameterManager.Parameter("parameter-basic", new()
    ///     {
    ///         ParameterId = "parameter",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Parameter With Format
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var parameter_with_format = new Gcp.ParameterManager.Parameter("parameter-with-format", new()
    ///     {
    ///         ParameterId = "parameter",
    ///         Format = "JSON",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Parameter With Labels
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var parameter_with_labels = new Gcp.ParameterManager.Parameter("parameter-with-labels", new()
    ///     {
    ///         ParameterId = "parameter",
    ///         Labels = 
    ///         {
    ///             { "key1", "val1" },
    ///             { "key2", "val2" },
    ///             { "key3", "val3" },
    ///             { "key4", "val4" },
    ///             { "key5", "val5" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Parameter With Kms Key
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var parameter_with_kms_key = new Gcp.ParameterManager.Parameter("parameter-with-kms-key", new()
    ///     {
    ///         ParameterId = "parameter",
    ///         KmsKey = "kms-key",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Parameter can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/global/parameters/{{parameter_id}}`
    /// 
    /// * `{{project}}/{{parameter_id}}`
    /// 
    /// * `{{parameter_id}}`
    /// 
    /// When using the `pulumi import` command, Parameter can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:parametermanager/parameter:Parameter default projects/{{project}}/locations/global/parameters/{{parameter_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:parametermanager/parameter:Parameter default {{project}}/{{parameter_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:parametermanager/parameter:Parameter default {{parameter_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:parametermanager/parameter:Parameter")]
    public partial class Parameter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time at which the Parameter was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// The format type of the parameter resource.
        /// Default value is `UNFORMATTED`.
        /// Possible values are: `UNFORMATTED`, `YAML`, `JSON`.
        /// </summary>
        [Output("format")]
        public Output<string?> Format { get; private set; } = null!;

        /// <summary>
        /// The resource name of the Cloud KMS CryptoKey used to encrypt parameter version payload. Format
        /// `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        /// </summary>
        [Output("kmsKey")]
        public Output<string?> KmsKey { get; private set; } = null!;

        /// <summary>
        /// The labels assigned to this Parameter.
        /// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
        /// Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
        /// No more than 64 labels can be assigned to a given resource.
        /// An object containing a list of "key": value pairs. Example:
        /// { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The resource name of the Parameter. Format:
        /// `projects/{{project}}/locations/global/parameters/{{parameter_id}}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// This must be unique within the project.
        /// </summary>
        [Output("parameterId")]
        public Output<string> ParameterId { get; private set; } = null!;

        /// <summary>
        /// Policy member strings of a Google Cloud resource.
        /// Structure is documented below.
        /// </summary>
        [Output("policyMembers")]
        public Output<ImmutableArray<Outputs.ParameterPolicyMember>> PolicyMembers { get; private set; } = null!;

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
        /// The time at which the Parameter was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Parameter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Parameter(string name, ParameterArgs args, CustomResourceOptions? options = null)
            : base("gcp:parametermanager/parameter:Parameter", name, args ?? new ParameterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Parameter(string name, Input<string> id, ParameterState? state = null, CustomResourceOptions? options = null)
            : base("gcp:parametermanager/parameter:Parameter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Parameter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Parameter Get(string name, Input<string> id, ParameterState? state = null, CustomResourceOptions? options = null)
        {
            return new Parameter(name, id, state, options);
        }
    }

    public sealed class ParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format type of the parameter resource.
        /// Default value is `UNFORMATTED`.
        /// Possible values are: `UNFORMATTED`, `YAML`, `JSON`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The resource name of the Cloud KMS CryptoKey used to encrypt parameter version payload. Format
        /// `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The labels assigned to this Parameter.
        /// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
        /// Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
        /// No more than 64 labels can be assigned to a given resource.
        /// An object containing a list of "key": value pairs. Example:
        /// { "name": "wrench", "mass": "1.3kg", "count": "3" }.
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
        /// This must be unique within the project.
        /// </summary>
        [Input("parameterId", required: true)]
        public Input<string> ParameterId { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public ParameterArgs()
        {
        }
        public static new ParameterArgs Empty => new ParameterArgs();
    }

    public sealed class ParameterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time at which the Parameter was created.
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

        /// <summary>
        /// The format type of the parameter resource.
        /// Default value is `UNFORMATTED`.
        /// Possible values are: `UNFORMATTED`, `YAML`, `JSON`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The resource name of the Cloud KMS CryptoKey used to encrypt parameter version payload. Format
        /// `projects/{{project}}/locations/global/keyRings/{{key_ring}}/cryptoKeys/{{crypto_key}}`
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The labels assigned to this Parameter.
        /// Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
        /// Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes,
        /// and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
        /// No more than 64 labels can be assigned to a given resource.
        /// An object containing a list of "key": value pairs. Example:
        /// { "name": "wrench", "mass": "1.3kg", "count": "3" }.
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
        /// The resource name of the Parameter. Format:
        /// `projects/{{project}}/locations/global/parameters/{{parameter_id}}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// This must be unique within the project.
        /// </summary>
        [Input("parameterId")]
        public Input<string>? ParameterId { get; set; }

        [Input("policyMembers")]
        private InputList<Inputs.ParameterPolicyMemberGetArgs>? _policyMembers;

        /// <summary>
        /// Policy member strings of a Google Cloud resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ParameterPolicyMemberGetArgs> PolicyMembers
        {
            get => _policyMembers ?? (_policyMembers = new InputList<Inputs.ParameterPolicyMemberGetArgs>());
            set => _policyMembers = value;
        }

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
        /// The time at which the Parameter was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ParameterState()
        {
        }
        public static new ParameterState Empty => new ParameterState();
    }
}
