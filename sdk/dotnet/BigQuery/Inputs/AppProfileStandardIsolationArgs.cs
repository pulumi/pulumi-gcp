// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class AppProfileStandardIsolationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The priority of requests sent using this app profile.
        /// Possible values are: `PRIORITY_LOW`, `PRIORITY_MEDIUM`, `PRIORITY_HIGH`.
        /// </summary>
        [Input("priority", required: true)]
        public Input<string> Priority { get; set; } = null!;

        public AppProfileStandardIsolationArgs()
        {
        }
        public static new AppProfileStandardIsolationArgs Empty => new AppProfileStandardIsolationArgs();
    }
}