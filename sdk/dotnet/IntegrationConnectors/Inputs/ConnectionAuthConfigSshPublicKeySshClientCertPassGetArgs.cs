// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Inputs
{

    public sealed class ConnectionAuthConfigSshPublicKeySshClientCertPassGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource name of the secret version in the format,
        /// format as: projects/*/secrets/*/versions/*.
        /// 
        /// &lt;a name="nested_oauth2_auth_code_flow"&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
        /// </summary>
        [Input("secretVersion", required: true)]
        public Input<string> SecretVersion { get; set; } = null!;

        public ConnectionAuthConfigSshPublicKeySshClientCertPassGetArgs()
        {
        }
        public static new ConnectionAuthConfigSshPublicKeySshClientCertPassGetArgs Empty => new ConnectionAuthConfigSshPublicKeySshClientCertPassGetArgs();
    }
}