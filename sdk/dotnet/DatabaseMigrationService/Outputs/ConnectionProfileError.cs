// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Outputs
{

    [OutputType]
    public sealed class ConnectionProfileError
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
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Details;
        /// <summary>
        /// (Output)
        /// Human readable message indicating details about the current status.
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private ConnectionProfileError(
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
