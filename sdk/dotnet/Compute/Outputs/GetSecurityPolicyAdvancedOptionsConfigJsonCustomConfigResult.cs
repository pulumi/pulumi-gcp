// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfigResult
    {
        /// <summary>
        /// A list of custom Content-Type header values to apply the JSON parsing.
        /// </summary>
        public readonly ImmutableArray<string> ContentTypes;

        [OutputConstructor]
        private GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfigResult(ImmutableArray<string> contentTypes)
        {
            ContentTypes = contentTypes;
        }
    }
}
