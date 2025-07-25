// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigOrgConfigLocationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID for the folder within an organization to scan
        /// </summary>
        [Input("folderId")]
        public Input<string>? FolderId { get; set; }

        /// <summary>
        /// The ID of an organization to scan
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public PreventionDiscoveryConfigOrgConfigLocationGetArgs()
        {
        }
        public static new PreventionDiscoveryConfigOrgConfigLocationGetArgs Empty => new PreventionDiscoveryConfigOrgConfigLocationGetArgs();
    }
}
