// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateAuthority.Outputs
{

    [OutputType]
    public sealed class AuthoritySubordinateConfigPemIssuerChain
    {
        /// <summary>
        /// Expected to be in leaf-to-root order according to RFC 5246.
        /// </summary>
        public readonly ImmutableArray<string> PemCertificates;

        [OutputConstructor]
        private AuthoritySubordinateConfigPemIssuerChain(ImmutableArray<string> pemCertificates)
        {
            PemCertificates = pemCertificates;
        }
    }
}