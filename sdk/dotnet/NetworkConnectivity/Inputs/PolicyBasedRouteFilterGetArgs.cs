// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkConnectivity.Inputs
{

    public sealed class PolicyBasedRouteFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination IP range of outgoing packets that this policy-based route applies to. Default is "0.0.0.0/0" if protocol version is IPv4.
        /// 
        /// - - -
        /// </summary>
        [Input("destRange")]
        public Input<string>? DestRange { get; set; }

        /// <summary>
        /// The IP protocol that this policy-based route applies to. Valid values are 'TCP', 'UDP', and 'ALL'. Default is 'ALL'.
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        /// <summary>
        /// Internet protocol versions this policy-based route applies to.
        /// Possible values are: `IPV4`.
        /// </summary>
        [Input("protocolVersion", required: true)]
        public Input<string> ProtocolVersion { get; set; } = null!;

        /// <summary>
        /// The source IP range of outgoing packets that this policy-based route applies to. Default is "0.0.0.0/0" if protocol version is IPv4.
        /// </summary>
        [Input("srcRange")]
        public Input<string>? SrcRange { get; set; }

        public PolicyBasedRouteFilterGetArgs()
        {
        }
        public static new PolicyBasedRouteFilterGetArgs Empty => new PolicyBasedRouteFilterGetArgs();
    }
}