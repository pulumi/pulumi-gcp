// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ApiHub.Outputs
{

    [OutputType]
    public sealed class PluginConfigTemplateAuthConfigTemplateServiceAccount
    {
        /// <summary>
        /// The service account to be used for authenticating request.
        /// The `iam.serviceAccounts.getAccessToken` permission should be granted on
        /// this service account to the impersonator service account.
        /// </summary>
        public readonly string ServiceAccount;

        [OutputConstructor]
        private PluginConfigTemplateAuthConfigTemplateServiceAccount(string serviceAccount)
        {
            ServiceAccount = serviceAccount;
        }
    }
}
