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
    /// The resource for managing Code Repository Index for Gemini Code Assist.
    /// 
    /// To get more information about CodeRepositoryIndex, see:
    /// 
    /// * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes)
    /// * How-to Guides
    ///     * [Gemini Code Assist overview](https://cloud.google.com/gemini/docs/codeassist/overview)
    /// 
    /// ## Example Usage
    /// 
    /// ### Gemini Code Repository Index Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Gemini.CodeRepositoryIndex("example", new()
    ///     {
    ///         Location = "us-central1",
    ///         CodeRepositoryIndexId = "code-repository-index-example",
    ///         KmsKey = "projects/projectExample/locations/locationExample/keyRings/keyRingExample/cryptoKeys/cryptoKeyExample",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// CodeRepositoryIndex can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{code_repository_index_id}}`
    /// 
    /// * `{{location}}/{{code_repository_index_id}}`
    /// 
    /// When using the `pulumi import` command, CodeRepositoryIndex can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex default projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex default {{project}}/{{location}}/{{code_repository_index_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex default {{location}}/{{code_repository_index_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex")]
    public partial class CodeRepositoryIndex : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Required. Id of the Code Repository Index.
        /// </summary>
        [Output("codeRepositoryIndexId")]
        public Output<string> CodeRepositoryIndexId { get; private set; } = null!;

        /// <summary>
        /// Output only. Create time stamp.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// If set to true, will allow deletion of the CodeRepositoryIndex even if there are existing RepositoryGroups for the resource. These RepositoryGroups will also be deleted.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// Optional. Immutable. Customer-managed encryption key name, in the format
        /// `projects/*/locations/*/keyRings/*/cryptoKeys/*`.
        /// </summary>
        [Output("kmsKey")]
        public Output<string?> KmsKey { get; private set; } = null!;

        /// <summary>
        /// Optional. Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location of the Code Repository Index, for example `us-central1`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Immutable. Identifier. Name of Code Repository Index.
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
        /// Output only. Code Repository Index instance State.
        /// Possible values are: `STATE_UNSPECIFIED`, `CREATING`, `ACTIVE`, `DELETING`, `SUSPENDED`.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Output only. Update time stamp.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a CodeRepositoryIndex resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CodeRepositoryIndex(string name, CodeRepositoryIndexArgs args, CustomResourceOptions? options = null)
            : base("gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex", name, args ?? new CodeRepositoryIndexArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CodeRepositoryIndex(string name, Input<string> id, CodeRepositoryIndexState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gemini/codeRepositoryIndex:CodeRepositoryIndex", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CodeRepositoryIndex resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CodeRepositoryIndex Get(string name, Input<string> id, CodeRepositoryIndexState? state = null, CustomResourceOptions? options = null)
        {
            return new CodeRepositoryIndex(name, id, state, options);
        }
    }

    public sealed class CodeRepositoryIndexArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Id of the Code Repository Index.
        /// </summary>
        [Input("codeRepositoryIndexId", required: true)]
        public Input<string> CodeRepositoryIndexId { get; set; } = null!;

        /// <summary>
        /// If set to true, will allow deletion of the CodeRepositoryIndex even if there are existing RepositoryGroups for the resource. These RepositoryGroups will also be deleted.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Optional. Immutable. Customer-managed encryption key name, in the format
        /// `projects/*/locations/*/keyRings/*/cryptoKeys/*`.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the Code Repository Index, for example `us-central1`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public CodeRepositoryIndexArgs()
        {
        }
        public static new CodeRepositoryIndexArgs Empty => new CodeRepositoryIndexArgs();
    }

    public sealed class CodeRepositoryIndexState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Id of the Code Repository Index.
        /// </summary>
        [Input("codeRepositoryIndexId")]
        public Input<string>? CodeRepositoryIndexId { get; set; }

        /// <summary>
        /// Output only. Create time stamp.
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
        /// If set to true, will allow deletion of the CodeRepositoryIndex even if there are existing RepositoryGroups for the resource. These RepositoryGroups will also be deleted.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// Optional. Immutable. Customer-managed encryption key name, in the format
        /// `projects/*/locations/*/keyRings/*/cryptoKeys/*`.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels as key value pairs.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location of the Code Repository Index, for example `us-central1`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Immutable. Identifier. Name of Code Repository Index.
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
        /// Output only. Code Repository Index instance State.
        /// Possible values are: `STATE_UNSPECIFIED`, `CREATING`, `ACTIVE`, `DELETING`, `SUSPENDED`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Output only. Update time stamp.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public CodeRepositoryIndexState()
        {
        }
        public static new CodeRepositoryIndexState Empty => new CodeRepositoryIndexState();
    }
}
