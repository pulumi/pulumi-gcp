// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Outputs
{

    [OutputType]
    public sealed class ConnectionAuthConfigOauth2ClientCredentials
    {
        /// <summary>
        /// Secret version of Password for Authentication.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// Secret version reference containing the client secret.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionAuthConfigOauth2ClientCredentialsClientSecret? ClientSecret;

        [OutputConstructor]
        private ConnectionAuthConfigOauth2ClientCredentials(
            string clientId,

            Outputs.ConnectionAuthConfigOauth2ClientCredentialsClientSecret? clientSecret)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
        }
    }
}