// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Inputs
{

    public sealed class WorkforcePoolAccessRestrictionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedServices")]
        private InputList<Inputs.WorkforcePoolAccessRestrictionsAllowedServiceGetArgs>? _allowedServices;

        /// <summary>
        /// Services allowed for web sign-in with the workforce pool.
        /// If not set by default there are no restrictions.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkforcePoolAccessRestrictionsAllowedServiceGetArgs> AllowedServices
        {
            get => _allowedServices ?? (_allowedServices = new InputList<Inputs.WorkforcePoolAccessRestrictionsAllowedServiceGetArgs>());
            set => _allowedServices = value;
        }

        /// <summary>
        /// Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
        /// See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
        /// </summary>
        [Input("disableProgrammaticSignin")]
        public Input<bool>? DisableProgrammaticSignin { get; set; }

        public WorkforcePoolAccessRestrictionsGetArgs()
        {
        }
        public static new WorkforcePoolAccessRestrictionsGetArgs Empty => new WorkforcePoolAccessRestrictionsGetArgs();
    }
}
