// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Inputs
{

    public sealed class ListingRestrictedExportConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, enable restricted export.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// If true, restrict export of query result derived from restricted linked dataset table.
        /// </summary>
        [Input("restrictQueryResult")]
        public Input<bool>? RestrictQueryResult { get; set; }

        public ListingRestrictedExportConfigGetArgs()
        {
        }
        public static new ListingRestrictedExportConfigGetArgs Empty => new ListingRestrictedExportConfigGetArgs();
    }
}
