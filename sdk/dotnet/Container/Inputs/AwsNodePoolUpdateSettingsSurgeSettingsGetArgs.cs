// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AwsNodePoolUpdateSettingsSurgeSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The maximum number of nodes that can be created beyond the current size of the node pool during the update process.
        /// </summary>
        [Input("maxSurge")]
        public Input<int>? MaxSurge { get; set; }

        /// <summary>
        /// Optional. The maximum number of nodes that can be simultaneously unavailable during the update process. A node is considered unavailable if its status is not Ready.
        /// </summary>
        [Input("maxUnavailable")]
        public Input<int>? MaxUnavailable { get; set; }

        public AwsNodePoolUpdateSettingsSurgeSettingsGetArgs()
        {
        }
        public static new AwsNodePoolUpdateSettingsSurgeSettingsGetArgs Empty => new AwsNodePoolUpdateSettingsSurgeSettingsGetArgs();
    }
}
