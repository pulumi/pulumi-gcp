// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Inputs
{

    public sealed class GuestPoliciesPackageRepositoryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An Apt Repository.
        /// Structure is documented below.
        /// </summary>
        [Input("apt")]
        public Input<Inputs.GuestPoliciesPackageRepositoryAptGetArgs>? Apt { get; set; }

        /// <summary>
        /// A Goo Repository.
        /// Structure is documented below.
        /// </summary>
        [Input("goo")]
        public Input<Inputs.GuestPoliciesPackageRepositoryGooGetArgs>? Goo { get; set; }

        /// <summary>
        /// A Yum Repository.
        /// Structure is documented below.
        /// </summary>
        [Input("yum")]
        public Input<Inputs.GuestPoliciesPackageRepositoryYumGetArgs>? Yum { get; set; }

        /// <summary>
        /// A Zypper Repository.
        /// Structure is documented below.
        /// </summary>
        [Input("zypper")]
        public Input<Inputs.GuestPoliciesPackageRepositoryZypperGetArgs>? Zypper { get; set; }

        public GuestPoliciesPackageRepositoryGetArgs()
        {
        }
        public static new GuestPoliciesPackageRepositoryGetArgs Empty => new GuestPoliciesPackageRepositoryGetArgs();
    }
}
