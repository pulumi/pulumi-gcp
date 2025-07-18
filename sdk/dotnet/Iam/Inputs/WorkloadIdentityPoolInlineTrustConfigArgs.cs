// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Inputs
{

    public sealed class WorkloadIdentityPoolInlineTrustConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalTrustBundles")]
        private InputList<Inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs>? _additionalTrustBundles;

        /// <summary>
        /// Maps specific trust domains (e.g., "example.com") to their corresponding `TrustStore`
        /// objects, which contain the trusted root certificates for that domain. There can be a
        /// maximum of `10` trust domain entries in this map.
        /// Note that a trust domain automatically trusts itself and don't need to be specified here.
        /// If however, this `WorkloadIdentityPool`'s trust domain contains any trust anchors in the
        /// `additional_trust_bundles` map, those trust anchors will be *appended to* the Trust Bundle
        /// automatically derived from your `InlineCertificateIssuanceConfig`'s `ca_pools`.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs> AdditionalTrustBundles
        {
            get => _additionalTrustBundles ?? (_additionalTrustBundles = new InputList<Inputs.WorkloadIdentityPoolInlineTrustConfigAdditionalTrustBundleArgs>());
            set => _additionalTrustBundles = value;
        }

        public WorkloadIdentityPoolInlineTrustConfigArgs()
        {
        }
        public static new WorkloadIdentityPoolInlineTrustConfigArgs Empty => new WorkloadIdentityPoolInlineTrustConfigArgs();
    }
}
