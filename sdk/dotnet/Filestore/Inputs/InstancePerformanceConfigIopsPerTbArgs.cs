// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Inputs
{

    public sealed class InstancePerformanceConfigIopsPerTbArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance max IOPS will be calculated by multiplying
        /// the capacity of the instance (TB) by max_iops_per_tb,
        /// and rounding to the nearest 1000. The instance max IOPS
        /// will be changed dynamically based on the instance
        /// capacity.
        /// </summary>
        [Input("maxIopsPerTb")]
        public Input<int>? MaxIopsPerTb { get; set; }

        public InstancePerformanceConfigIopsPerTbArgs()
        {
        }
        public static new InstancePerformanceConfigIopsPerTbArgs Empty => new InstancePerformanceConfigIopsPerTbArgs();
    }
}
