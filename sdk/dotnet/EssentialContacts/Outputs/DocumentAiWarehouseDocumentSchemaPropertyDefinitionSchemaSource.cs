// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EssentialContacts.Outputs
{

    [OutputType]
    public sealed class DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource
    {
        /// <summary>
        /// The schema name in the source.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Doc AI processor type name.
        /// </summary>
        public readonly string? ProcessorType;

        [OutputConstructor]
        private DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource(
            string? name,

            string? processorType)
        {
            Name = name;
            ProcessorType = processorType;
        }
    }
}
