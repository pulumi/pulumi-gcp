// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigQuotaSignUpQuotaConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A sign up APIs quota that customers can override temporarily.
        /// </summary>
        [Input("quota")]
        public Input<int>? Quota { get; set; }

        /// <summary>
        /// How long this quota will be active for. It is measurred in seconds, e.g., Example: "9.615s".
        /// </summary>
        [Input("quotaDuration")]
        public Input<string>? QuotaDuration { get; set; }

        /// <summary>
        /// When this quota will take affect.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        public ConfigQuotaSignUpQuotaConfigGetArgs()
        {
        }
        public static new ConfigQuotaSignUpQuotaConfigGetArgs Empty => new ConfigQuotaSignUpQuotaConfigGetArgs();
    }
}