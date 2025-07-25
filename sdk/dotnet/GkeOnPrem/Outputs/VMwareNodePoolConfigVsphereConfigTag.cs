// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareNodePoolConfigVsphereConfigTag
    {
        /// <summary>
        /// The Vsphere tag category.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// The Vsphere tag name.
        /// </summary>
        public readonly string? Tag;

        [OutputConstructor]
        private VMwareNodePoolConfigVsphereConfigTag(
            string? category,

            string? tag)
        {
            Category = category;
            Tag = tag;
        }
    }
}
