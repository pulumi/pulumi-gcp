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
    public sealed class AwsClusterNetworking
    {
        /// <summary>
        /// Disable the per node pool subnet security group rules on the control plane security group. When set to true, you must also provide one or more security groups that ensure node pools are able to send requests to the control plane on TCP/443 and TCP/8132. Failure to do so may result in unavailable node pools.
        /// </summary>
        public readonly bool? PerNodePoolSgRulesDisabled;
        /// <summary>
        /// All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
        /// </summary>
        public readonly ImmutableArray<string> PodAddressCidrBlocks;
        /// <summary>
        /// All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
        /// </summary>
        public readonly ImmutableArray<string> ServiceAddressCidrBlocks;
        /// <summary>
        /// The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
        /// 
        /// - - -
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private AwsClusterNetworking(
            bool? perNodePoolSgRulesDisabled,

            ImmutableArray<string> podAddressCidrBlocks,

            ImmutableArray<string> serviceAddressCidrBlocks,

            string vpcId)
        {
            PerNodePoolSgRulesDisabled = perNodePoolSgRulesDisabled;
            PodAddressCidrBlocks = podAddressCidrBlocks;
            ServiceAddressCidrBlocks = serviceAddressCidrBlocks;
            VpcId = vpcId;
        }
    }
}
