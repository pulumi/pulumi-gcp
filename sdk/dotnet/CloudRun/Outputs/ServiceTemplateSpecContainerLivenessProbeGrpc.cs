// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class ServiceTemplateSpecContainerLivenessProbeGrpc
    {
        /// <summary>
        /// Port number to access on the container. Number must be in the range 1 to 65535.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The name of the service to place in the gRPC HealthCheckRequest
        /// (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
        /// If this is not specified, the default behavior is defined by gRPC.
        /// </summary>
        public readonly string? Service;

        [OutputConstructor]
        private ServiceTemplateSpecContainerLivenessProbeGrpc(
            int? port,

            string? service)
        {
            Port = port;
            Service = service;
        }
    }
}