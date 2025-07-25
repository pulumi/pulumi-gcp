// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class AppProfileDataBoostIsolationReadOnlyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Compute Billing Owner for this Data Boost App Profile.
        /// Possible values are: `HOST_PAYS`.
        /// </summary>
        [Input("computeBillingOwner", required: true)]
        public Input<string> ComputeBillingOwner { get; set; } = null!;

        public AppProfileDataBoostIsolationReadOnlyGetArgs()
        {
        }
        public static new AppProfileDataBoostIsolationReadOnlyGetArgs Empty => new AppProfileDataBoostIsolationReadOnlyGetArgs();
    }
}
