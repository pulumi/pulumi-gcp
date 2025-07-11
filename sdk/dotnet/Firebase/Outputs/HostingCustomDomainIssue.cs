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
    public sealed class HostingCustomDomainIssue
    {
        /// <summary>
        /// The status code, which should be an enum value of `google.rpc.Code`
        /// </summary>
        public readonly int? Code;
        /// <summary>
        /// A list of messages that carry the error details.
        /// </summary>
        public readonly string? Details;
        /// <summary>
        /// Error message
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private HostingCustomDomainIssue(
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
