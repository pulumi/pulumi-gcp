// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Outputs
{

    [OutputType]
    public sealed class CaPoolIssuancePolicyAllowedIssuanceModes
    {
        /// <summary>
        /// When true, allows callers to create Certificates by specifying a CertificateConfig.
        /// </summary>
        public readonly bool AllowConfigBasedIssuance;
        /// <summary>
        /// When true, allows callers to create Certificates by specifying a CSR.
        /// </summary>
        public readonly bool AllowCsrBasedIssuance;

        [OutputConstructor]
        private CaPoolIssuancePolicyAllowedIssuanceModes(
            bool allowConfigBasedIssuance,

            bool allowCsrBasedIssuance)
        {
            AllowConfigBasedIssuance = allowConfigBasedIssuance;
            AllowCsrBasedIssuance = allowCsrBasedIssuance;
        }
    }
}
