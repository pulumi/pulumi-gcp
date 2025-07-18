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
    public sealed class SecurityPolicyAdvancedOptionsConfigJsonCustomConfig
    {
        /// <summary>
        /// A list of custom Content-Type header values to apply the JSON parsing. The
        /// format of the Content-Type header values is defined in
        /// [RFC 1341](https://www.ietf.org/rfc/rfc1341.txt). When configuring a custom Content-Type header
        /// value, only the type/subtype needs to be specified, and the parameters should be excluded.
        /// </summary>
        public readonly ImmutableArray<string> ContentTypes;

        [OutputConstructor]
        private SecurityPolicyAdvancedOptionsConfigJsonCustomConfig(ImmutableArray<string> contentTypes)
        {
            ContentTypes = contentTypes;
        }
    }
}
