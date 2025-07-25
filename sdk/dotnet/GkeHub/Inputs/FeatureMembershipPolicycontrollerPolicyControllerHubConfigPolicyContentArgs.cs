// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs : global::Pulumi.ResourceArgs
    {
        [Input("bundles")]
        private InputList<Inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs>? _bundles;

        /// <summary>
        /// map of bundle name to BundleInstallSpec. The bundle name maps to the `bundleName` key in the `policycontroller.gke.io/constraintData` annotation on a constraint.
        /// </summary>
        public InputList<Inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs> Bundles
        {
            get => _bundles ?? (_bundles = new InputList<Inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs>());
            set => _bundles = value;
        }

        /// <summary>
        /// Configures the installation of the Template Library. Structure is documented below.
        /// </summary>
        [Input("templateLibrary")]
        public Input<Inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs>? TemplateLibrary { get; set; }

        public FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs()
        {
        }
        public static new FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs Empty => new FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs();
    }
}
