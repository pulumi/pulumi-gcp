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
    public sealed class VMwareClusterValidationCheckStatusResult
    {
        /// <summary>
        /// (Output)
        /// The category of the validation.
        /// </summary>
        public readonly string? Category;
        /// <summary>
        /// A human readable description of this VMware User Cluster.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// (Output)
        /// Detailed failure information, which might be unformatted.
        /// </summary>
        public readonly string? Details;
        /// <summary>
        /// (Output)
        /// Options used for the validation check.
        /// </summary>
        public readonly string? Options;
        /// <summary>
        /// (Output)
        /// Machine-readable message indicating details about last transition.
        /// </summary>
        public readonly string? Reason;

        [OutputConstructor]
        private VMwareClusterValidationCheckStatusResult(
            string? category,

            string? description,

            string? details,

            string? options,

            string? reason)
        {
            Category = category;
            Description = description;
            Details = details;
            Options = options;
            Reason = reason;
        }
    }
}
