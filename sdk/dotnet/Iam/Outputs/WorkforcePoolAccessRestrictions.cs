// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Outputs
{

    [OutputType]
    public sealed class WorkforcePoolAccessRestrictions
    {
        /// <summary>
        /// Services allowed for web sign-in with the workforce pool.
        /// If not set by default there are no restrictions.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkforcePoolAccessRestrictionsAllowedService> AllowedServices;
        /// <summary>
        /// Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
        /// See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
        /// </summary>
        public readonly bool? DisableProgrammaticSignin;

        [OutputConstructor]
        private WorkforcePoolAccessRestrictions(
            ImmutableArray<Outputs.WorkforcePoolAccessRestrictionsAllowedService> allowedServices,

            bool? disableProgrammaticSignin)
        {
            AllowedServices = allowedServices;
            DisableProgrammaticSignin = disableProgrammaticSignin;
        }
    }
}
