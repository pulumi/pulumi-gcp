// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class FirewallLogConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This field denotes whether to include or exclude metadata for firewall logs.
        /// Possible values are: `EXCLUDE_ALL_METADATA`, `INCLUDE_ALL_METADATA`.
        /// </summary>
        [Input("metadata", required: true)]
        public Input<string> Metadata { get; set; } = null!;

        public FirewallLogConfigGetArgs()
        {
        }
        public static new FirewallLogConfigGetArgs Empty => new FirewallLogConfigGetArgs();
    }
}
