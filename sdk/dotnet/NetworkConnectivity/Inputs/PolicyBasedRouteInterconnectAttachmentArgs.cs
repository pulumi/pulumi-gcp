// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkConnectivity.Inputs
{

    public sealed class PolicyBasedRouteInterconnectAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud region to install this policy-based route on for Interconnect attachments. Use `all` to install it on all Interconnect attachments.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public PolicyBasedRouteInterconnectAttachmentArgs()
        {
        }
        public static new PolicyBasedRouteInterconnectAttachmentArgs Empty => new PolicyBasedRouteInterconnectAttachmentArgs();
    }
}
