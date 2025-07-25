// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalAdminClusterSecurityConfigAuthorizationAdminUser
    {
        /// <summary>
        /// The name of the user, e.g. `my-gcp-id@gmail.com`.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private BareMetalAdminClusterSecurityConfigAuthorizationAdminUser(string username)
        {
            Username = username;
        }
    }
}
