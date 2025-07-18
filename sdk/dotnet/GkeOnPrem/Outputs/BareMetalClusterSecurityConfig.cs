// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterSecurityConfig
    {
        /// <summary>
        /// Configures user access to the Bare Metal User cluster.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterSecurityConfigAuthorization? Authorization;

        [OutputConstructor]
        private BareMetalClusterSecurityConfig(Outputs.BareMetalClusterSecurityConfigAuthorization? authorization)
        {
            Authorization = authorization;
        }
    }
}
