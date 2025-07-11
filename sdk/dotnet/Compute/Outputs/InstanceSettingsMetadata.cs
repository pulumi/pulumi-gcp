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
    public sealed class InstanceSettingsMetadata
    {
        /// <summary>
        /// A metadata key/value items map. The total size of all keys and values must be less than 512KB
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Items;

        [OutputConstructor]
        private InstanceSettingsMetadata(ImmutableDictionary<string, string>? items)
        {
            Items = items;
        }
    }
}
