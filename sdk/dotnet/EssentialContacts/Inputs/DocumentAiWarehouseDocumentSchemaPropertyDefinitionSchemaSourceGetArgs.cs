// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EssentialContacts.Inputs
{

    public sealed class DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The schema name in the source.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Doc AI processor type name.
        /// </summary>
        [Input("processorType")]
        public Input<string>? ProcessorType { get; set; }

        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceGetArgs()
        {
        }
        public static new DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceGetArgs Empty => new DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceGetArgs();
    }
}