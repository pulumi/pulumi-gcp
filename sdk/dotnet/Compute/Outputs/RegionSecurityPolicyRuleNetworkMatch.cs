// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class RegionSecurityPolicyRuleNetworkMatch
    {
        /// <summary>
        /// Destination IPv4/IPv6 addresses or CIDR prefixes, in standard text format.
        /// </summary>
        public readonly ImmutableArray<string> DestIpRanges;
        /// <summary>
        /// Destination port numbers for TCP/UDP/SCTP. Each element can be a 16-bit unsigned decimal number (e.g. "80") or range (e.g. "0-1023").
        /// </summary>
        public readonly ImmutableArray<string> DestPorts;
        /// <summary>
        /// IPv4 protocol / IPv6 next header (after extension headers). Each element can be an 8-bit unsigned decimal number (e.g. "6"), range (e.g. "253-254"), or one of the following protocol names: "tcp", "udp", "icmp", "esp", "ah", "ipip", or "sctp".
        /// </summary>
        public readonly ImmutableArray<string> IpProtocols;
        /// <summary>
        /// BGP Autonomous System Number associated with the source IP address.
        /// </summary>
        public readonly ImmutableArray<int> SrcAsns;
        /// <summary>
        /// Source IPv4/IPv6 addresses or CIDR prefixes, in standard text format.
        /// </summary>
        public readonly ImmutableArray<string> SrcIpRanges;
        /// <summary>
        /// Source port numbers for TCP/UDP/SCTP. Each element can be a 16-bit unsigned decimal number (e.g. "80") or range (e.g. "0-1023").
        /// </summary>
        public readonly ImmutableArray<string> SrcPorts;
        /// <summary>
        /// Two-letter ISO 3166-1 alpha-2 country code associated with the source IP address.
        /// </summary>
        public readonly ImmutableArray<string> SrcRegionCodes;
        /// <summary>
        /// User-defined fields. Each element names a defined field and lists the matching values for that field.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedField> UserDefinedFields;

        [OutputConstructor]
        private RegionSecurityPolicyRuleNetworkMatch(
            ImmutableArray<string> destIpRanges,

            ImmutableArray<string> destPorts,

            ImmutableArray<string> ipProtocols,

            ImmutableArray<int> srcAsns,

            ImmutableArray<string> srcIpRanges,

            ImmutableArray<string> srcPorts,

            ImmutableArray<string> srcRegionCodes,

            ImmutableArray<Outputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedField> userDefinedFields)
        {
            DestIpRanges = destIpRanges;
            DestPorts = destPorts;
            IpProtocols = ipProtocols;
            SrcAsns = srcAsns;
            SrcIpRanges = srcIpRanges;
            SrcPorts = srcPorts;
            SrcRegionCodes = srcRegionCodes;
            UserDefinedFields = userDefinedFields;
        }
    }
}