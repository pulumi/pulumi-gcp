// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address that is be 1:1 mapped to the instance's network ip.
        /// </summary>
        [Input("natIp")]
        public Input<string>? NatIp { get; set; }

        /// <summary>
        /// The networking tier used for configuring this instance. One of PREMIUM or STANDARD.
        /// </summary>
        [Input("networkTier")]
        public Input<string>? NetworkTier { get; set; }

        /// <summary>
        /// The DNS domain name for the public PTR record.
        /// </summary>
        [Input("publicPtrDomainName")]
        public Input<string>? PublicPtrDomainName { get; set; }

        /// <summary>
        /// A full or partial URL to a security policy to add to this instance. If this field is set to an empty string it will remove the associated security policy.
        /// </summary>
        [Input("securityPolicy")]
        public Input<string>? SecurityPolicy { get; set; }

        public InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs()
        {
        }
        public static new InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs Empty => new InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs();
    }
}
