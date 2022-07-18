// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class ConnectionAzure
    {
        /// <summary>
        /// -
        /// The name of the Azure Active Directory Application.
        /// </summary>
        public readonly string? Application;
        /// <summary>
        /// -
        /// The client id of the Azure Active Directory Application.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The id of customer's directory that host the data.
        /// </summary>
        public readonly string CustomerTenantId;
        /// <summary>
        /// -
        /// The object id of the Azure Active Directory Application.
        /// </summary>
        public readonly string? ObjectId;
        /// <summary>
        /// -
        /// The URL user will be redirected to after granting consent during connection setup.
        /// </summary>
        public readonly string? RedirectUri;

        [OutputConstructor]
        private ConnectionAzure(
            string? application,

            string? clientId,

            string customerTenantId,

            string? objectId,

            string? redirectUri)
        {
            Application = application;
            ClientId = clientId;
            CustomerTenantId = customerTenantId;
            ObjectId = objectId;
            RedirectUri = redirectUri;
        }
    }
}