// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigSmsRegionConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A policy of allowing SMS to every region by default and adding disallowed regions to a disallow list.
        /// Structure is documented below.
        /// </summary>
        [Input("allowByDefault")]
        public Input<Inputs.ConfigSmsRegionConfigAllowByDefaultGetArgs>? AllowByDefault { get; set; }

        /// <summary>
        /// A policy of only allowing regions by explicitly adding them to an allowlist.
        /// Structure is documented below.
        /// </summary>
        [Input("allowlistOnly")]
        public Input<Inputs.ConfigSmsRegionConfigAllowlistOnlyGetArgs>? AllowlistOnly { get; set; }

        public ConfigSmsRegionConfigGetArgs()
        {
        }
        public static new ConfigSmsRegionConfigGetArgs Empty => new ConfigSmsRegionConfigGetArgs();
    }
}