// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the nodes operating system (default: LINUX).
        /// Possible values are: `EFFECT_UNSPECIFIED`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// Key associated with the effect.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Value associated with the effect.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintGetArgs()
        {
        }
        public static new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintGetArgs Empty => new BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintGetArgs();
    }
}