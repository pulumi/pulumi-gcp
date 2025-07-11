// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DiscoveryEngine.Inputs
{

    public sealed class DataStoreDocumentProcessingConfigChunkingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for the layout based chunking.
        /// Structure is documented below.
        /// </summary>
        [Input("layoutBasedChunkingConfig")]
        public Input<Inputs.DataStoreDocumentProcessingConfigChunkingConfigLayoutBasedChunkingConfigArgs>? LayoutBasedChunkingConfig { get; set; }

        public DataStoreDocumentProcessingConfigChunkingConfigArgs()
        {
        }
        public static new DataStoreDocumentProcessingConfigChunkingConfigArgs Empty => new DataStoreDocumentProcessingConfigChunkingConfigArgs();
    }
}
