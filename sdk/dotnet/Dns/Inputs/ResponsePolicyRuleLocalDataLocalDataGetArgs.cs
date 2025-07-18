// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class ResponsePolicyRuleLocalDataLocalDataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For example, www.example.com.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("rrdatas")]
        private InputList<string>? _rrdatas;

        /// <summary>
        /// As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1)
        /// </summary>
        public InputList<string> Rrdatas
        {
            get => _rrdatas ?? (_rrdatas = new InputList<string>());
            set => _rrdatas = value;
        }

        /// <summary>
        /// Number of seconds that this ResourceRecordSet can be cached by
        /// resolvers.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// One of valid DNS resource types.
        /// Possible values are: `A`, `AAAA`, `CAA`, `CNAME`, `DNSKEY`, `DS`, `HTTPS`, `IPSECVPNKEY`, `MX`, `NAPTR`, `NS`, `PTR`, `SOA`, `SPF`, `SRV`, `SSHFP`, `SVCB`, `TLSA`, `TXT`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ResponsePolicyRuleLocalDataLocalDataGetArgs()
        {
        }
        public static new ResponsePolicyRuleLocalDataLocalDataGetArgs Empty => new ResponsePolicyRuleLocalDataLocalDataGetArgs();
    }
}
