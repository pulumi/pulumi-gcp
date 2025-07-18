// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDiscoveryConfigErrorDetails
    {
        /// <summary>
        /// The status code, which should be an enum value of google.rpc.Code.
        /// </summary>
        public readonly int? Code;
        /// <summary>
        /// A list of messages that carry the error details.
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Details;
        /// <summary>
        /// A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private PreventionDiscoveryConfigErrorDetails(
            int? code,

            ImmutableArray<ImmutableDictionary<string, string>> details,

            string? message)
        {
            Code = code;
            Details = details;
            Message = message;
        }
    }
}
