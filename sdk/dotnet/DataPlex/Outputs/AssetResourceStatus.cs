// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class AssetResourceStatus
    {
        /// <summary>
        /// Additional information about the current state.
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// Output only. Current state of the asset. Possible values: STATE_UNSPECIFIED, ACTIVE, CREATING, DELETING, ACTION_REQUIRED
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// Output only. The time when the asset was last updated.
        /// </summary>
        public readonly string? UpdateTime;

        [OutputConstructor]
        private AssetResourceStatus(
            string? message,

            string? state,

            string? updateTime)
        {
            Message = message;
            State = state;
            UpdateTime = updateTime;
        }
    }
}
