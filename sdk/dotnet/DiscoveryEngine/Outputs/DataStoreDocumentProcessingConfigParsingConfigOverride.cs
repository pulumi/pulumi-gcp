// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DiscoveryEngine.Outputs
{

    [OutputType]
    public sealed class DataStoreDocumentProcessingConfigParsingConfigOverride
    {
        /// <summary>
        /// Configurations applied to digital parser.
        /// </summary>
        public readonly Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfig? DigitalParsingConfig;
        /// <summary>
        /// The identifier for this object. Format specified above.
        /// </summary>
        public readonly string FileType;
        /// <summary>
        /// Configurations applied to layout parser.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfig? LayoutParsingConfig;
        /// <summary>
        /// Configurations applied to OCR parser. Currently it only applies to PDFs.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfig? OcrParsingConfig;

        [OutputConstructor]
        private DataStoreDocumentProcessingConfigParsingConfigOverride(
            Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideDigitalParsingConfig? digitalParsingConfig,

            string fileType,

            Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfig? layoutParsingConfig,

            Outputs.DataStoreDocumentProcessingConfigParsingConfigOverrideOcrParsingConfig? ocrParsingConfig)
        {
            DigitalParsingConfig = digitalParsingConfig;
            FileType = fileType;
            LayoutParsingConfig = layoutParsingConfig;
            OcrParsingConfig = ocrParsingConfig;
        }
    }
}
