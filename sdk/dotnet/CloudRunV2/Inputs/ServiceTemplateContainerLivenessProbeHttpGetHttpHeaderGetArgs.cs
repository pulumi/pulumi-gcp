// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The header field name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The header field value
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderGetArgs()
        {
        }
        public static new ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderGetArgs Empty => new ServiceTemplateContainerLivenessProbeHttpGetHttpHeaderGetArgs();
    }
}
