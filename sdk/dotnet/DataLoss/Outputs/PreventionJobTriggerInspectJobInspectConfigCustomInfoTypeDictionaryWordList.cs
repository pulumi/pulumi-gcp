// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryWordList
    {
        /// <summary>
        /// Words or phrases defining the dictionary. The dictionary must contain at least one
        /// phrase and every phrase must contain at least 2 characters that are letters or digits.
        /// </summary>
        public readonly ImmutableArray<string> Words;

        [OutputConstructor]
        private PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionaryWordList(ImmutableArray<string> words)
        {
            Words = words;
        }
    }
}
