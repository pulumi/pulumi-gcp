// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2VmServiceAccount
    {
        /// <summary>
        /// Email address of the service account. If empty, default Compute service account will be used.
        /// </summary>
        public readonly string? Email;
        /// <summary>
        /// The list of scopes to be made available for this service account. If empty, access to all
        /// Cloud APIs will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;

        [OutputConstructor]
        private V2VmServiceAccount(
            string? email,

            ImmutableArray<string> scopes)
        {
            Email = email;
            Scopes = scopes;
        }
    }
}