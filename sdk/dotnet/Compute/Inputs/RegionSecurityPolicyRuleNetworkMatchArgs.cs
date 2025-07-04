// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionSecurityPolicyRuleNetworkMatchArgs : global::Pulumi.ResourceArgs
    {
        [Input("destIpRanges")]
        private InputList<string>? _destIpRanges;

        /// <summary>
        /// Destination IPv4/IPv6 addresses or CIDR prefixes, in standard text format.
        /// </summary>
        public InputList<string> DestIpRanges
        {
            get => _destIpRanges ?? (_destIpRanges = new InputList<string>());
            set => _destIpRanges = value;
        }

        [Input("destPorts")]
        private InputList<string>? _destPorts;

        /// <summary>
        /// Destination port numbers for TCP/UDP/SCTP. Each element can be a 16-bit unsigned decimal number (e.g. "80") or range (e.g. "0-1023").
        /// </summary>
        public InputList<string> DestPorts
        {
            get => _destPorts ?? (_destPorts = new InputList<string>());
            set => _destPorts = value;
        }

        [Input("ipProtocols")]
        private InputList<string>? _ipProtocols;

        /// <summary>
        /// IPv4 protocol / IPv6 next header (after extension headers). Each element can be an 8-bit unsigned decimal number (e.g. "6"), range (e.g. "253-254"), or one of the following protocol names: "tcp", "udp", "icmp", "esp", "ah", "ipip", or "sctp".
        /// </summary>
        public InputList<string> IpProtocols
        {
            get => _ipProtocols ?? (_ipProtocols = new InputList<string>());
            set => _ipProtocols = value;
        }

        [Input("srcAsns")]
        private InputList<int>? _srcAsns;

        /// <summary>
        /// BGP Autonomous System Number associated with the source IP address.
        /// </summary>
        public InputList<int> SrcAsns
        {
            get => _srcAsns ?? (_srcAsns = new InputList<int>());
            set => _srcAsns = value;
        }

        [Input("srcIpRanges")]
        private InputList<string>? _srcIpRanges;

        /// <summary>
        /// Source IPv4/IPv6 addresses or CIDR prefixes, in standard text format.
        /// </summary>
        public InputList<string> SrcIpRanges
        {
            get => _srcIpRanges ?? (_srcIpRanges = new InputList<string>());
            set => _srcIpRanges = value;
        }

        [Input("srcPorts")]
        private InputList<string>? _srcPorts;

        /// <summary>
        /// Source port numbers for TCP/UDP/SCTP. Each element can be a 16-bit unsigned decimal number (e.g. "80") or range (e.g. "0-1023").
        /// </summary>
        public InputList<string> SrcPorts
        {
            get => _srcPorts ?? (_srcPorts = new InputList<string>());
            set => _srcPorts = value;
        }

        [Input("srcRegionCodes")]
        private InputList<string>? _srcRegionCodes;

        /// <summary>
        /// Two-letter ISO 3166-1 alpha-2 country code associated with the source IP address.
        /// </summary>
        public InputList<string> SrcRegionCodes
        {
            get => _srcRegionCodes ?? (_srcRegionCodes = new InputList<string>());
            set => _srcRegionCodes = value;
        }

        [Input("userDefinedFields")]
        private InputList<Inputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedFieldArgs>? _userDefinedFields;

        /// <summary>
        /// User-defined fields. Each element names a defined field and lists the matching values for that field.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedFieldArgs> UserDefinedFields
        {
            get => _userDefinedFields ?? (_userDefinedFields = new InputList<Inputs.RegionSecurityPolicyRuleNetworkMatchUserDefinedFieldArgs>());
            set => _userDefinedFields = value;
        }

        public RegionSecurityPolicyRuleNetworkMatchArgs()
        {
        }
        public static new RegionSecurityPolicyRuleNetworkMatchArgs Empty => new RegionSecurityPolicyRuleNetworkMatchArgs();
    }
}
