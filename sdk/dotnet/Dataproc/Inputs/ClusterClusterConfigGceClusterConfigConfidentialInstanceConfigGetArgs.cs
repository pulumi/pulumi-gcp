// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines whether the instance should have confidential compute enabled.
        /// </summary>
        [Input("enableConfidentialCompute")]
        public Input<bool>? EnableConfidentialCompute { get; set; }

        public ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigGetArgs()
        {
        }
        public static new ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigGetArgs Empty => new ClusterClusterConfigGceClusterConfigConfidentialInstanceConfigGetArgs();
    }
}
