// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigAuxiliaryNodeGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("nodeGroupId")]
        public Input<string>? NodeGroupId { get; set; }

        [Input("nodeGroups", required: true)]
        private InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs>? _nodeGroups;

        /// <summary>
        /// Node group configuration.
        /// </summary>
        public InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs> NodeGroups
        {
            get => _nodeGroups ?? (_nodeGroups = new InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupArgs>());
            set => _nodeGroups = value;
        }

        public ClusterClusterConfigAuxiliaryNodeGroupArgs()
        {
        }
        public static new ClusterClusterConfigAuxiliaryNodeGroupArgs Empty => new ClusterClusterConfigAuxiliaryNodeGroupArgs();
    }
}