// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern
    {
        /// <summary>
        /// Regex for Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternCloudStorageRegex? CloudStorageRegex;

        [OutputConstructor]
        private PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern(Outputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternCloudStorageRegex? cloudStorageRegex)
        {
            CloudStorageRegex = cloudStorageRegex;
        }
    }
}
