// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("patterns")]
        private InputList<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternGetArgs>? _patterns;

        /// <summary>
        /// The group of regular expression patterns to match against one or more file stores. Maximum of 100 entries. The sum of all lengths of regular expressions can't exceed 10 KiB.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternGetArgs> Patterns
        {
            get => _patterns ?? (_patterns = new InputList<Inputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPatternGetArgs>());
            set => _patterns = value;
        }

        public PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesGetArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesGetArgs Empty => new PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesGetArgs();
    }
}
