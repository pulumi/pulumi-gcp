// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetDiskParamResult
    {
        /// <summary>
        /// Resource manager tags to be bound to the disk. Tag keys and values have the
        /// same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id},
        /// and values are in the format tagValues/456.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ResourceManagerTags;

        [OutputConstructor]
        private GetDiskParamResult(ImmutableDictionary<string, string> resourceManagerTags)
        {
            ResourceManagerTags = resourceManagerTags;
        }
    }
}
