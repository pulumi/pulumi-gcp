// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Outputs
{

    [OutputType]
    public sealed class GetKeysKeySigningKeyResult
    {
        /// <summary>
        /// String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
        /// </summary>
        public readonly string Algorithm;
        /// <summary>
        /// The time that this resource was created in the control plane. This is in RFC3339 text format.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// A mutable string of at most 1024 characters associated with this resource for the user's convenience.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// A list of cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Each contains:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKeysKeySigningKeyDigestResult> Digests;
        /// <summary>
        /// The DS record based on the KSK record. This is used when [delegating](https://cloud.google.com/dns/docs/dnssec-advanced#subdelegation) DNSSEC-signed subdomains.
        /// </summary>
        public readonly string DsRecord;
        /// <summary>
        /// Unique identifier for the resource; defined by the server.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing signatures.
        /// </summary>
        public readonly bool IsActive;
        /// <summary>
        /// Length of the key in bits. Specified at creation time then immutable.
        /// </summary>
        public readonly int KeyLength;
        /// <summary>
        /// The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique identifier). In particular, the key tag is used in a parent zone's DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the algorithm to calculate it is specified in RFC4034 Appendix B.
        /// </summary>
        public readonly int KeyTag;
        /// <summary>
        /// Base64 encoded public half of this key.
        /// </summary>
        public readonly string PublicKey;

        [OutputConstructor]
        private GetKeysKeySigningKeyResult(
            string algorithm,

            string creationTime,

            string description,

            ImmutableArray<Outputs.GetKeysKeySigningKeyDigestResult> digests,

            string dsRecord,

            string id,

            bool isActive,

            int keyLength,

            int keyTag,

            string publicKey)
        {
            Algorithm = algorithm;
            CreationTime = creationTime;
            Description = description;
            Digests = digests;
            DsRecord = dsRecord;
            Id = id;
            IsActive = isActive;
            KeyLength = keyLength;
            KeyTag = keyTag;
            PublicKey = publicKey;
        }
    }
}
