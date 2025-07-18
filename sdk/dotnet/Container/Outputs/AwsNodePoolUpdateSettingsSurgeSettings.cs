// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AwsNodePoolUpdateSettingsSurgeSettings
    {
        /// <summary>
        /// Optional. The maximum number of nodes that can be created beyond the current size of the node pool during the update process.
        /// </summary>
        public readonly int? MaxSurge;
        /// <summary>
        /// Optional. The maximum number of nodes that can be simultaneously unavailable during the update process. A node is considered unavailable if its status is not Ready.
        /// </summary>
        public readonly int? MaxUnavailable;

        [OutputConstructor]
        private AwsNodePoolUpdateSettingsSurgeSettings(
            int? maxSurge,

            int? maxUnavailable)
        {
            MaxSurge = maxSurge;
            MaxUnavailable = maxUnavailable;
        }
    }
}
