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
    public sealed class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage
    {
        /// <summary>
        /// (Output)
        /// Required. Describes how some of the technical fields in a certificate should be populated.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> ObectIds;

        [OutputConstructor]
        private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage(ImmutableArray<Outputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds)
        {
            ObectIds = obectIds;
        }
    }
}