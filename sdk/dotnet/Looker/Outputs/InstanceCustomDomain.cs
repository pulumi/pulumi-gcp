// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Looker.Outputs
{

    [OutputType]
    public sealed class InstanceCustomDomain
    {
        /// <summary>
        /// Domain name
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// (Output)
        /// Status of the custom domain.
        /// </summary>
        public readonly string? State;

        [OutputConstructor]
        private InstanceCustomDomain(
            string? domain,

            string? state)
        {
            Domain = domain;
            State = state;
        }
    }
}
