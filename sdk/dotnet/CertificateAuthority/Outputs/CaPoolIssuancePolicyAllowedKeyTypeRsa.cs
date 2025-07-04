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
    public sealed class CaPoolIssuancePolicyAllowedKeyTypeRsa
    {
        /// <summary>
        /// The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
        /// service will not enforce an explicit upper bound on RSA modulus sizes.
        /// </summary>
        public readonly string? MaxModulusSize;
        /// <summary>
        /// The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
        /// service-level min RSA modulus size will continue to apply.
        /// </summary>
        public readonly string? MinModulusSize;

        [OutputConstructor]
        private CaPoolIssuancePolicyAllowedKeyTypeRsa(
            string? maxModulusSize,

            string? minModulusSize)
        {
            MaxModulusSize = maxModulusSize;
            MinModulusSize = minModulusSize;
        }
    }
}
