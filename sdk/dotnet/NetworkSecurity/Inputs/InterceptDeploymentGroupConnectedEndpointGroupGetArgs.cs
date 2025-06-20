// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class InterceptDeploymentGroupConnectedEndpointGroupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The connected endpoint group's resource name, for example:
        /// `projects/123456789/locations/global/interceptEndpointGroups/my-eg`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public InterceptDeploymentGroupConnectedEndpointGroupGetArgs()
        {
        }
        public static new InterceptDeploymentGroupConnectedEndpointGroupGetArgs Empty => new InterceptDeploymentGroupConnectedEndpointGroupGetArgs();
    }
}
