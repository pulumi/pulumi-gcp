// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Beyondcorp.Inputs
{

    public sealed class ApplicationUpstreamNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Network name is of the format:
        /// `projects/{project}/global/networks/{network}`
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ApplicationUpstreamNetworkArgs()
        {
        }
        public static new ApplicationUpstreamNetworkArgs Empty => new ApplicationUpstreamNetworkArgs();
    }
}
