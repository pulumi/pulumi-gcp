// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Inputs
{

    public sealed class InstancePerformanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance will have a fixed provisioned IOPS value,
        /// which will remain constant regardless of instance
        /// capacity.
        /// Structure is documented below.
        /// </summary>
        [Input("fixedIops")]
        public Input<Inputs.InstancePerformanceConfigFixedIopsGetArgs>? FixedIops { get; set; }

        /// <summary>
        /// The instance provisioned IOPS will change dynamically
        /// based on the capacity of the instance.
        /// Structure is documented below.
        /// </summary>
        [Input("iopsPerTb")]
        public Input<Inputs.InstancePerformanceConfigIopsPerTbGetArgs>? IopsPerTb { get; set; }

        public InstancePerformanceConfigGetArgs()
        {
        }
        public static new InstancePerformanceConfigGetArgs Empty => new InstancePerformanceConfigGetArgs();
    }
}
