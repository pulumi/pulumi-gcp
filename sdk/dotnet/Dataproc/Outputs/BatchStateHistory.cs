// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class BatchStateHistory
    {
        /// <summary>
        /// (Output)
        /// The state of the batch at this point in history. For possible values, see the [API documentation](https://cloud.google.com/dataproc-serverless/docs/reference/rest/v1/projects.locations.batches#State).
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// (Output)
        /// Details about the state at this point in history.
        /// </summary>
        public readonly string? StateMessage;
        /// <summary>
        /// (Output)
        /// The time when the batch entered the historical state.
        /// </summary>
        public readonly string? StateStartTime;

        [OutputConstructor]
        private BatchStateHistory(
            string? state,

            string? stateMessage,

            string? stateStartTime)
        {
            State = state;
            StateMessage = stateMessage;
            StateStartTime = stateStartTime;
        }
    }
}
