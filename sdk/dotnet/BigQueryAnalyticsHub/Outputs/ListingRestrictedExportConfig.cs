// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Outputs
{

    [OutputType]
    public sealed class ListingRestrictedExportConfig
    {
        /// <summary>
        /// If true, enable restricted export.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// If true, restrict export of query result derived from restricted linked dataset table.
        /// </summary>
        public readonly bool? RestrictQueryResult;

        [OutputConstructor]
        private ListingRestrictedExportConfig(
            bool? enabled,

            bool? restrictQueryResult)
        {
            Enabled = enabled;
            RestrictQueryResult = restrictQueryResult;
        }
    }
}