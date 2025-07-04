// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class SecurityScanConfigAuthenticationGoogleAccount
    {
        /// <summary>
        /// The password of the Google account. The credential is stored encrypted
        /// in GCP.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The user name of the Google account.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private SecurityScanConfigAuthenticationGoogleAccount(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}
