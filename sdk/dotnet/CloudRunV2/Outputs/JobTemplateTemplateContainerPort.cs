// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class JobTemplateTemplateContainerPort
    {
        /// <summary>
        /// Port number the container listens on. This must be a valid TCP port number, 0 &lt; containerPort &lt; 65536.
        /// </summary>
        public readonly int? ContainerPort;
        /// <summary>
        /// Volume's name.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private JobTemplateTemplateContainerPort(
            int? containerPort,

            string? name)
        {
            ContainerPort = containerPort;
            Name = name;
        }
    }
}