// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The frontend IP address of the load balancer.
        /// </summary>
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        /// <summary>
        /// The configured IP protocol of the load balancer. This value is case-sensitive. Possible values: ["tcp", "udp"]
        /// </summary>
        [Input("ipProtocol", required: true)]
        public Input<string> IpProtocol { get; set; } = null!;

        /// <summary>
        /// The type of load balancer. This value is case-sensitive. Possible values: ["regionalL4ilb"]
        /// </summary>
        [Input("loadBalancerType", required: true)]
        public Input<string> LoadBalancerType { get; set; } = null!;

        /// <summary>
        /// The fully qualified url of the network in which the load balancer belongs. This should be formatted like `projects/{project}/global/networks/{network}` or `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`.
        /// </summary>
        [Input("networkUrl", required: true)]
        public Input<string> NetworkUrl { get; set; } = null!;

        /// <summary>
        /// The configured port of the load balancer.
        /// </summary>
        [Input("port", required: true)]
        public Input<string> Port { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the load balancer belongs.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// The region of the load balancer. Only needed for regional load balancers.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs()
        {
        }
        public static new RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs Empty => new RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs();
    }
}