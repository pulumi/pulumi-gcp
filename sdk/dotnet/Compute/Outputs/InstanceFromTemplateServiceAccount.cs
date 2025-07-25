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
    public sealed class InstanceFromTemplateServiceAccount
    {
        /// <summary>
        /// The service account e-mail address.
        /// </summary>
        public readonly string? Email;
        /// <summary>
        /// A list of service scopes.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;

        [OutputConstructor]
        private InstanceFromTemplateServiceAccount(
            string? email,

            ImmutableArray<string> scopes)
        {
            Email = email;
            Scopes = scopes;
        }
    }
}
