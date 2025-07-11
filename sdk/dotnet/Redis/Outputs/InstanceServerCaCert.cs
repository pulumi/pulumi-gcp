// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Outputs
{

    [OutputType]
    public sealed class InstanceServerCaCert
    {
        /// <summary>
        /// (Output)
        /// The certificate data in PEM format.
        /// </summary>
        public readonly string? Cert;
        /// <summary>
        /// (Output)
        /// The time when the certificate was created.
        /// </summary>
        public readonly string? CreateTime;
        /// <summary>
        /// (Output)
        /// The time when the certificate expires.
        /// </summary>
        public readonly string? ExpireTime;
        /// <summary>
        /// (Output)
        /// Serial number, as extracted from the certificate.
        /// </summary>
        public readonly string? SerialNumber;
        /// <summary>
        /// (Output)
        /// Sha1 Fingerprint of the certificate.
        /// </summary>
        public readonly string? Sha1Fingerprint;

        [OutputConstructor]
        private InstanceServerCaCert(
            string? cert,

            string? createTime,

            string? expireTime,

            string? serialNumber,

            string? sha1Fingerprint)
        {
            Cert = cert;
            CreateTime = createTime;
            ExpireTime = expireTime;
            SerialNumber = serialNumber;
            Sha1Fingerprint = sha1Fingerprint;
        }
    }
}
