// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceTemplateVpcAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}, where {project} can be project id or number.
        /// </summary>
        [Input("connector")]
        public Input<string>? Connector { get; set; }

        /// <summary>
        /// Traffic VPC egress settings.
        /// Possible values are: `ALL_TRAFFIC`, `PRIVATE_RANGES_ONLY`.
        /// </summary>
        [Input("egress")]
        public Input<string>? Egress { get; set; }

        [Input("networkInterfaces")]
        private InputList<Inputs.ServiceTemplateVpcAccessNetworkInterfaceGetArgs>? _networkInterfaces;

        /// <summary>
        /// Direct VPC egress settings. Currently only single network interface is supported.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceTemplateVpcAccessNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ServiceTemplateVpcAccessNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        public ServiceTemplateVpcAccessGetArgs()
        {
        }
        public static new ServiceTemplateVpcAccessGetArgs Empty => new ServiceTemplateVpcAccessGetArgs();
    }
}
