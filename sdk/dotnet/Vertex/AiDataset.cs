// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex
{
    /// <summary>
    /// A collection of DataItems and Annotations on them.
    /// 
    /// To get more information about Dataset, see:
    /// 
    /// * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.datasets)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Vertex Ai Dataset
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dataset = new Gcp.Vertex.AiDataset("dataset", new()
    ///     {
    ///         DisplayName = "terraform",
    ///         MetadataSchemaUri = "gs://google-cloud-aiplatform/schema/dataset/metadata/image_1.0.0.yaml",
    ///         Region = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "env", "test" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource does not support import.
    /// </summary>
    [GcpResourceType("gcp:vertex/aiDataset:AiDataset")]
    public partial class AiDataset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp of when the dataset was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
        /// Structure is documented below.
        /// </summary>
        [Output("encryptionSpec")]
        public Output<Outputs.AiDatasetEncryptionSpec?> EncryptionSpec { get; private set; } = null!;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
        /// </summary>
        [Output("metadataSchemaUri")]
        public Output<string> MetadataSchemaUri { get; private set; } = null!;

        /// <summary>
        /// The resource name of the Dataset. This value is set by Google.
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
        /// The region of the dataset. eg us-central1
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The timestamp of when the dataset was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a AiDataset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AiDataset(string name, AiDatasetArgs args, CustomResourceOptions? options = null)
            : base("gcp:vertex/aiDataset:AiDataset", name, args ?? new AiDatasetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AiDataset(string name, Input<string> id, AiDatasetState? state = null, CustomResourceOptions? options = null)
            : base("gcp:vertex/aiDataset:AiDataset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AiDataset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AiDataset Get(string name, Input<string> id, AiDatasetState? state = null, CustomResourceOptions? options = null)
        {
            return new AiDataset(name, id, state, options);
        }
    }

    public sealed class AiDatasetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionSpec")]
        public Input<Inputs.AiDatasetEncryptionSpecArgs>? EncryptionSpec { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
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
        /// Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
        /// </summary>
        [Input("metadataSchemaUri", required: true)]
        public Input<string> MetadataSchemaUri { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of the dataset. eg us-central1
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public AiDatasetArgs()
        {
        }
        public static new AiDatasetArgs Empty => new AiDatasetArgs();
    }

    public sealed class AiDatasetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp of when the dataset was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

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
        /// Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
        /// Structure is documented below.
        /// </summary>
        [Input("encryptionSpec")]
        public Input<Inputs.AiDatasetEncryptionSpecGetArgs>? EncryptionSpec { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
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
        /// Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
        /// </summary>
        [Input("metadataSchemaUri")]
        public Input<string>? MetadataSchemaUri { get; set; }

        /// <summary>
        /// The resource name of the Dataset. This value is set by Google.
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
        /// The region of the dataset. eg us-central1
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The timestamp of when the dataset was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public AiDatasetState()
        {
        }
        public static new AiDatasetState Empty => new AiDatasetState();
    }
}
