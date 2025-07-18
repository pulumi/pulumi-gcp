// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors
{
    /// <summary>
    /// An Integration connectors Endpoint Attachment.
    /// 
    /// To get more information about EndpointAttachment, see:
    /// 
    /// * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.endpointAttachments)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/integration-connectors/docs/create-endpoint-attachment)
    /// 
    /// ## Example Usage
    /// 
    /// ### Integration Connectors Endpoint Attachment
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sampleendpointattachment = new Gcp.IntegrationConnectors.EndpointAttachment("sampleendpointattachment", new()
    ///     {
    ///         Name = "test-endpoint-attachment",
    ///         Location = "us-central1",
    ///         Description = "tf created description",
    ///         ServiceAttachment = "projects/connectors-example/regions/us-central1/serviceAttachments/test",
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
    /// EndpointAttachment can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/endpointAttachments/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, EndpointAttachment can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:integrationconnectors/endpointAttachment:EndpointAttachment default projects/{{project}}/locations/{{location}}/endpointAttachments/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:integrationconnectors/endpointAttachment:EndpointAttachment default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:integrationconnectors/endpointAttachment:EndpointAttachment default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:integrationconnectors/endpointAttachment:EndpointAttachment")]
    public partial class EndpointAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time the Namespace was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Enable global access for endpoint attachment.
        /// </summary>
        [Output("endpointGlobalAccess")]
        public Output<bool?> EndpointGlobalAccess { get; private set; } = null!;

        /// <summary>
        /// The Private Service Connect connection endpoint ip.
        /// </summary>
        [Output("endpointIp")]
        public Output<string> EndpointIp { get; private set; } = null!;

        /// <summary>
        /// Resource labels to represent user provided metadata.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Location in which Endpoint Attachment needs to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of Endpoint Attachment needs to be created.
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
        /// The path of the service attachment.
        /// </summary>
        [Output("serviceAttachment")]
        public Output<string> ServiceAttachment { get; private set; } = null!;

        /// <summary>
        /// Time the Namespace was updated in UTC.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointAttachment(string name, EndpointAttachmentArgs args, CustomResourceOptions? options = null)
            : base("gcp:integrationconnectors/endpointAttachment:EndpointAttachment", name, args ?? new EndpointAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointAttachment(string name, Input<string> id, EndpointAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:integrationconnectors/endpointAttachment:EndpointAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointAttachment Get(string name, Input<string> id, EndpointAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointAttachment(name, id, state, options);
        }
    }

    public sealed class EndpointAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable global access for endpoint attachment.
        /// </summary>
        [Input("endpointGlobalAccess")]
        public Input<bool>? EndpointGlobalAccess { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Resource labels to represent user provided metadata.
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
        /// Location in which Endpoint Attachment needs to be created.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of Endpoint Attachment needs to be created.
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
        /// The path of the service attachment.
        /// </summary>
        [Input("serviceAttachment", required: true)]
        public Input<string> ServiceAttachment { get; set; } = null!;

        public EndpointAttachmentArgs()
        {
        }
        public static new EndpointAttachmentArgs Empty => new EndpointAttachmentArgs();
    }

    public sealed class EndpointAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time the Namespace was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description of the resource.
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
        /// Enable global access for endpoint attachment.
        /// </summary>
        [Input("endpointGlobalAccess")]
        public Input<bool>? EndpointGlobalAccess { get; set; }

        /// <summary>
        /// The Private Service Connect connection endpoint ip.
        /// </summary>
        [Input("endpointIp")]
        public Input<string>? EndpointIp { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Resource labels to represent user provided metadata.
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
        /// Location in which Endpoint Attachment needs to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Name of Endpoint Attachment needs to be created.
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
        /// The path of the service attachment.
        /// </summary>
        [Input("serviceAttachment")]
        public Input<string>? ServiceAttachment { get; set; }

        /// <summary>
        /// Time the Namespace was updated in UTC.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public EndpointAttachmentState()
        {
        }
        public static new EndpointAttachmentState Empty => new EndpointAttachmentState();
    }
}
