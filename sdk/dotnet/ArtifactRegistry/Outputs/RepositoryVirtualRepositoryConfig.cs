// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Outputs
{

    [OutputType]
    public sealed class RepositoryVirtualRepositoryConfig
    {
        /// <summary>
        /// Policies that configure the upstream artifacts distributed by the Virtual
        /// Repository. Upstream policies cannot be set on a standard repository.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RepositoryVirtualRepositoryConfigUpstreamPolicy> UpstreamPolicies;

        [OutputConstructor]
        private RepositoryVirtualRepositoryConfig(ImmutableArray<Outputs.RepositoryVirtualRepositoryConfigUpstreamPolicy> upstreamPolicies)
        {
            UpstreamPolicies = upstreamPolicies;
        }
    }
}