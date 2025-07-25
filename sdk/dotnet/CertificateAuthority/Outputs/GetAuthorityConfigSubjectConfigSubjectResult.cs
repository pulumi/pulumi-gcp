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
    public sealed class GetAuthorityConfigSubjectConfigSubjectResult
    {
        /// <summary>
        /// The common name of the distinguished name.
        /// </summary>
        public readonly string CommonName;
        /// <summary>
        /// The country code of the subject.
        /// </summary>
        public readonly string CountryCode;
        /// <summary>
        /// The locality or city of the subject.
        /// </summary>
        public readonly string Locality;
        /// <summary>
        /// The organization of the subject.
        /// </summary>
        public readonly string Organization;
        /// <summary>
        /// The organizational unit of the subject.
        /// </summary>
        public readonly string OrganizationalUnit;
        /// <summary>
        /// The postal code of the subject.
        /// </summary>
        public readonly string PostalCode;
        /// <summary>
        /// The province, territory, or regional state of the subject.
        /// </summary>
        public readonly string Province;
        /// <summary>
        /// The street address of the subject.
        /// </summary>
        public readonly string StreetAddress;

        [OutputConstructor]
        private GetAuthorityConfigSubjectConfigSubjectResult(
            string commonName,

            string countryCode,

            string locality,

            string organization,

            string organizationalUnit,

            string postalCode,

            string province,

            string streetAddress)
        {
            CommonName = commonName;
            CountryCode = countryCode;
            Locality = locality;
            Organization = organization;
            OrganizationalUnit = organizationalUnit;
            PostalCode = postalCode;
            Province = province;
            StreetAddress = streetAddress;
        }
    }
}
