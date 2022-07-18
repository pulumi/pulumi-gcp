// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EssentialContacts
{
    /// <summary>
    /// The default version for the processor. Deleting this resource is a no-op, and does not unset the default version.
    /// 
    /// ## Example Usage
    /// ### Documentai Default Version
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var processorDocumentAiProcessor = new Gcp.EssentialContacts.DocumentAiProcessor("processorDocumentAiProcessor", new Gcp.EssentialContacts.DocumentAiProcessorArgs
    ///         {
    ///             Location = "us",
    ///             DisplayName = "test-processor",
    ///             Type = "OCR_PROCESSOR",
    ///         });
    ///         var processorDocumentAiProcessorDefaultVersion = new Gcp.EssentialContacts.DocumentAiProcessorDefaultVersion("processorDocumentAiProcessorDefaultVersion", new Gcp.EssentialContacts.DocumentAiProcessorDefaultVersionArgs
    ///         {
    ///             Processor = processorDocumentAiProcessor.Id,
    ///             Version = processorDocumentAiProcessor.Id.Apply(id =&gt; $"{id}/processorVersions/pretrained-next"),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ProcessorDefaultVersion can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:essentialcontacts/documentAiProcessorDefaultVersion:DocumentAiProcessorDefaultVersion default {{processor}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:essentialcontacts/documentAiProcessorDefaultVersion:DocumentAiProcessorDefaultVersion")]
    public partial class DocumentAiProcessorDefaultVersion : Pulumi.CustomResource
    {
        /// <summary>
        /// The processor to set the version on.
        /// </summary>
        [Output("processor")]
        public Output<string> Processor { get; private set; } = null!;

        /// <summary>
        /// The version to set
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a DocumentAiProcessorDefaultVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DocumentAiProcessorDefaultVersion(string name, DocumentAiProcessorDefaultVersionArgs args, CustomResourceOptions? options = null)
            : base("gcp:essentialcontacts/documentAiProcessorDefaultVersion:DocumentAiProcessorDefaultVersion", name, args ?? new DocumentAiProcessorDefaultVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DocumentAiProcessorDefaultVersion(string name, Input<string> id, DocumentAiProcessorDefaultVersionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:essentialcontacts/documentAiProcessorDefaultVersion:DocumentAiProcessorDefaultVersion", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DocumentAiProcessorDefaultVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DocumentAiProcessorDefaultVersion Get(string name, Input<string> id, DocumentAiProcessorDefaultVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new DocumentAiProcessorDefaultVersion(name, id, state, options);
        }
    }

    public sealed class DocumentAiProcessorDefaultVersionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The processor to set the version on.
        /// </summary>
        [Input("processor", required: true)]
        public Input<string> Processor { get; set; } = null!;

        /// <summary>
        /// The version to set
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public DocumentAiProcessorDefaultVersionArgs()
        {
        }
    }

    public sealed class DocumentAiProcessorDefaultVersionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The processor to set the version on.
        /// </summary>
        [Input("processor")]
        public Input<string>? Processor { get; set; }

        /// <summary>
        /// The version to set
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DocumentAiProcessorDefaultVersionState()
        {
        }
    }
}