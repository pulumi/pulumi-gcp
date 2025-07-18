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
    public sealed class GetInstanceGroupManagerAllInstancesConfigResult
    {
        /// <summary>
        /// The label key-value pairs that you want to patch onto the instance,
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The metadata key-value pairs that you want to patch onto the instance. For more information, see Project and instance metadata,
        /// </summary>
        public readonly ImmutableDictionary<string, string> Metadata;

        [OutputConstructor]
        private GetInstanceGroupManagerAllInstancesConfigResult(
            ImmutableDictionary<string, string> labels,

            ImmutableDictionary<string, string> metadata)
        {
            Labels = labels;
            Metadata = metadata;
        }
    }
}
