// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Outputs
{

    [OutputType]
    public sealed class AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckError
    {
        /// <summary>
        /// (Output)
        /// The status code, which should be an enum value of google.rpc.Code.
        /// </summary>
        public readonly int? Code;
        /// <summary>
        /// (Output)
        /// A list of messages that carry the error details.
        /// </summary>
        public readonly string? Details;
        /// <summary>
        /// (Output)
        /// A developer-facing error message, which should be in English. Any
        /// user-facing error message should be localized and sent in the
        /// google.rpc.Status.details field, or localized by the client.
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private AppHostingDomainCustomDomainStatusRequiredDnsUpdateDiscoveredCheckError(
            int? code,

            string? details,

            string? message)
        {
            Code = code;
            Details = details;
            Message = message;
        }
    }
}
