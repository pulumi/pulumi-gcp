// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Inputs
{

    public sealed class EnvironmentConfigWebServerNetworkAccessControlArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedIpRanges")]
        private InputList<Inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs>? _allowedIpRanges;

        /// <summary>
        /// A collection of allowed IP ranges with descriptions.
        /// </summary>
        public InputList<Inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs> AllowedIpRanges
        {
            get => _allowedIpRanges ?? (_allowedIpRanges = new InputList<Inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeArgs>());
            set => _allowedIpRanges = value;
        }

        public EnvironmentConfigWebServerNetworkAccessControlArgs()
        {
        }
        public static new EnvironmentConfigWebServerNetworkAccessControlArgs Empty => new EnvironmentConfigWebServerNetworkAccessControlArgs();
    }
}
