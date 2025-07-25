// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the manner in which the template library is installed on the cluster.
        /// Possible values are: `INSTALLATION_UNSPECIFIED`, `NOT_INSTALLED`, `ALL`.
        /// </summary>
        [Input("installation")]
        public Input<string>? Installation { get; set; }

        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryGetArgs()
        {
        }
        public static new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryGetArgs Empty => new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryGetArgs();
    }
}
