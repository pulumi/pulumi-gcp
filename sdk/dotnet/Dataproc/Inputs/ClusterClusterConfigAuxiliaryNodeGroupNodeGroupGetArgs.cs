// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigAuxiliaryNodeGroupNodeGroupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Node group resource name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The node group instance group configuration.
        /// </summary>
        [Input("nodeGroupConfig")]
        public Input<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigGetArgs>? NodeGroupConfig { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Node group roles. 
        /// One of `"DRIVER"`.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        public ClusterClusterConfigAuxiliaryNodeGroupNodeGroupGetArgs()
        {
        }
        public static new ClusterClusterConfigAuxiliaryNodeGroupNodeGroupGetArgs Empty => new ClusterClusterConfigAuxiliaryNodeGroupNodeGroupGetArgs();
    }
}
