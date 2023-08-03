// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareClusterLoadBalancerF5ConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The load balancer's IP address.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// he preexisting partition to be used by the load balancer. T
        /// his partition is usually created for the admin cluster for example:
        /// 'my-f5-admin-partition'.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        /// <summary>
        /// The pool name. Only necessary, if using SNAT.
        /// </summary>
        [Input("snatPool")]
        public Input<string>? SnatPool { get; set; }

        public VMwareClusterLoadBalancerF5ConfigArgs()
        {
        }
        public static new VMwareClusterLoadBalancerF5ConfigArgs Empty => new VMwareClusterLoadBalancerF5ConfigArgs();
    }
}