// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureFleetDefaultMemberConfigPolicycontroller
    {
        /// <summary>
        /// Configuration of Policy Controller
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig PolicyControllerHubConfig;
        /// <summary>
        /// Configures the version of Policy Controller
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private FeatureFleetDefaultMemberConfigPolicycontroller(
            Outputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig policyControllerHubConfig,

            string? version)
        {
            PolicyControllerHubConfig = policyControllerHubConfig;
            Version = version;
        }
    }
}