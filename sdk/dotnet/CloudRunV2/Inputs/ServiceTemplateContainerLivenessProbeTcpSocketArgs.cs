// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceTemplateContainerLivenessProbeTcpSocketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Port number to access on the container. Must be in the range 1 to 65535.
        /// If not specified, defaults to the same value as container.ports[0].containerPort.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public ServiceTemplateContainerLivenessProbeTcpSocketArgs()
        {
        }
        public static new ServiceTemplateContainerLivenessProbeTcpSocketArgs Empty => new ServiceTemplateContainerLivenessProbeTcpSocketArgs();
    }
}