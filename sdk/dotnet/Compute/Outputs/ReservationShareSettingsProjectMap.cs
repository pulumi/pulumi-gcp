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
    public sealed class ReservationShareSettingsProjectMap
    {
        /// <summary>
        /// The identifier for this object. Format specified above.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The project id/number, should be same as the key of this project config in the project map.
        /// </summary>
        public readonly string? ProjectId;

        [OutputConstructor]
        private ReservationShareSettingsProjectMap(
            string id,

            string? projectId)
        {
            Id = id;
            ProjectId = projectId;
        }
    }
}
