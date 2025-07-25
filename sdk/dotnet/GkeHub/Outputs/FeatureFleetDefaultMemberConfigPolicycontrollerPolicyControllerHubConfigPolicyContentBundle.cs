// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundle
    {
        /// <summary>
        /// The identifier for this object. Format specified above.
        /// </summary>
        public readonly string Bundle;
        /// <summary>
        /// The set of namespaces to be exempted from the bundle.
        /// </summary>
        public readonly ImmutableArray<string> ExemptedNamespaces;

        [OutputConstructor]
        private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundle(
            string bundle,

            ImmutableArray<string> exemptedNamespaces)
        {
            Bundle = bundle;
            ExemptedNamespaces = exemptedNamespaces;
        }
    }
}
