// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigOrgConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data to scan folder org or project
        /// Structure is documented below.
        /// </summary>
        [Input("location")]
        public Input<Inputs.PreventionDiscoveryConfigOrgConfigLocationArgs>? Location { get; set; }

        /// <summary>
        /// The project that will run the scan. The DLP service account that exists within this project must have access to all resources that are profiled, and the cloud DLP API must be enabled.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public PreventionDiscoveryConfigOrgConfigArgs()
        {
        }
        public static new PreventionDiscoveryConfigOrgConfigArgs Empty => new PreventionDiscoveryConfigOrgConfigArgs();
    }
}
