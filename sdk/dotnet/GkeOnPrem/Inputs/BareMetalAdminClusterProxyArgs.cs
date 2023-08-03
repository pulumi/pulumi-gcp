// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterProxyArgs : global::Pulumi.ResourceArgs
    {
        [Input("noProxies")]
        private InputList<string>? _noProxies;

        /// <summary>
        /// A list of IPs, hostnames, and domains that should skip the proxy.
        /// Examples: ["127.0.0.1", "example.com", ".corp", "localhost"].
        /// </summary>
        public InputList<string> NoProxies
        {
            get => _noProxies ?? (_noProxies = new InputList<string>());
            set => _noProxies = value;
        }

        /// <summary>
        /// Specifies the address of your proxy server.
        /// Examples: http://domain
        /// WARNING: Do not provide credentials in the format
        /// http://(username:password@)domain these will be rejected by the server.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public BareMetalAdminClusterProxyArgs()
        {
        }
        public static new BareMetalAdminClusterProxyArgs Empty => new BareMetalAdminClusterProxyArgs();
    }
}