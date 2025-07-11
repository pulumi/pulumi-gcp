// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable.Inputs
{

    public sealed class AppProfileSingleClusterRoutingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
        /// It is unsafe to send these requests to the same table/row/column in multiple clusters.
        /// </summary>
        [Input("allowTransactionalWrites")]
        public Input<bool>? AllowTransactionalWrites { get; set; }

        /// <summary>
        /// The cluster to which read/write requests should be routed.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        public AppProfileSingleClusterRoutingGetArgs()
        {
        }
        public static new AppProfileSingleClusterRoutingGetArgs Empty => new AppProfileSingleClusterRoutingGetArgs();
    }
}
