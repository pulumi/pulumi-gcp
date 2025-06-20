// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiGateway.Outputs
{

    [OutputType]
    public sealed class ApiConfigOpenapiDocument
    {
        /// <summary>
        /// The OpenAPI Specification document file.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ApiConfigOpenapiDocumentDocument Document;

        [OutputConstructor]
        private ApiConfigOpenapiDocument(Outputs.ApiConfigOpenapiDocumentDocument document)
        {
            Document = document;
        }
    }
}
