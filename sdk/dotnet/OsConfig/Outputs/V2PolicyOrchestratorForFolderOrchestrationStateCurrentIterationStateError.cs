// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError
    {
        /// <summary>
        /// (Output)
        /// The status code, which should be an enum value of google.rpc.Code.
        /// </summary>
        public readonly int? Code;
        /// <summary>
        /// (Output)
        /// A list of messages that carry the error details.  There is a common set of
        /// message types for APIs to use.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorDetail> Details;
        /// <summary>
        /// (Output)
        /// A developer-facing error message, which should be in English. Any
        /// user-facing error message should be localized and sent in the
        /// google.rpc.Status.details field, or localized by the client.
        /// </summary>
        public readonly string? Message;

        [OutputConstructor]
        private V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError(
            int? code,

            ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateErrorDetail> details,

            string? message)
        {
            Code = code;
            Details = details;
            Message = message;
        }
    }
}
