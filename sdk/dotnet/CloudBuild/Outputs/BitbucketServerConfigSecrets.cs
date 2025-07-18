// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Outputs
{

    [OutputType]
    public sealed class BitbucketServerConfigSecrets
    {
        /// <summary>
        /// The resource name for the admin access token's secret version.
        /// </summary>
        public readonly string AdminAccessTokenVersionName;
        /// <summary>
        /// The resource name for the read access token's secret version.
        /// </summary>
        public readonly string ReadAccessTokenVersionName;
        /// <summary>
        /// Immutable. The resource name for the webhook secret's secret version. Once this field has been set, it cannot be changed.
        /// Changing this field will result in deleting/ recreating the resource.
        /// </summary>
        public readonly string WebhookSecretVersionName;

        [OutputConstructor]
        private BitbucketServerConfigSecrets(
            string adminAccessTokenVersionName,

            string readAccessTokenVersionName,

            string webhookSecretVersionName)
        {
            AdminAccessTokenVersionName = adminAccessTokenVersionName;
            ReadAccessTokenVersionName = readAccessTokenVersionName;
            WebhookSecretVersionName = webhookSecretVersionName;
        }
    }
}
