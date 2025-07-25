// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionCommitmentResourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
        /// </summary>
        [Input("acceleratorType")]
        public Input<string>? AcceleratorType { get; set; }

        /// <summary>
        /// The amount of the resource purchased (in a type-dependent unit,
        /// such as bytes). For vCPUs, this can just be an integer. For memory,
        /// this must be provided in MB. Memory must be a multiple of 256 MB,
        /// with up to 6.5GB of memory per every vCPU.
        /// </summary>
        [Input("amount")]
        public Input<string>? Amount { get; set; }

        /// <summary>
        /// Type of resource for which this commitment applies.
        /// Possible values are VCPU, MEMORY, LOCAL_SSD, and ACCELERATOR.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public RegionCommitmentResourceArgs()
        {
        }
        public static new RegionCommitmentResourceArgs Empty => new RegionCommitmentResourceArgs();
    }
}
