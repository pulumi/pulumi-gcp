// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs : global::Pulumi.ResourceArgs
    {
        [Input("patterns")]
        private InputList<Inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesPatternArgs>? _patterns;

        /// <summary>
        /// The group of regular expression patterns to match against one or more file stores. Maximum of 100 entries. The sum of all lengths of regular expressions can't exceed 10 KiB.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesPatternArgs> Patterns
        {
            get => _patterns ?? (_patterns = new InputList<Inputs.PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesPatternArgs>());
            set => _patterns = value;
        }

        public PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs Empty => new PreventionDiscoveryConfigTargetBigQueryTargetFilterTablesIncludeRegexesArgs();
    }
}
