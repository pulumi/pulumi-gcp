// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class ServiceTemplateContainerStartupProbeGrpc
    {
        /// <summary>
        /// Port number to access on the container. Number must be in the range 1 to 65535.
        /// If not specified, defaults to the same value as container.ports[0].containerPort.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The name of the service to place in the gRPC HealthCheckRequest
        /// (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
        /// If this is not specified, the default behavior is defined by gRPC.
        /// 
        /// &lt;a name="nested_template_containers_containers_build_info"&gt;&lt;/a&gt;The `build_info` block contains:
        /// </summary>
        public readonly string? Service;

        [OutputConstructor]
        private ServiceTemplateContainerStartupProbeGrpc(
            int? port,

            string? service)
        {
            Port = port;
            Service = service;
        }
    }
}
