// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class AddonsConfigAddonsConfigConnectorsPlatformConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flag that specifies whether the Connectors Platform add-on is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// (Output)
        /// Time at which the Connectors Platform add-on expires in milliseconds since epoch. If unspecified, the add-on will never expire.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        public AddonsConfigAddonsConfigConnectorsPlatformConfigGetArgs()
        {
        }
        public static new AddonsConfigAddonsConfigConnectorsPlatformConfigGetArgs Empty => new AddonsConfigAddonsConfigConnectorsPlatformConfigGetArgs();
    }
}
