// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Inputs
{

    public sealed class EnvironmentConfigWorkloadsConfigTriggererGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of triggerers.
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// CPU request and limit for a single Airflow triggerer replica.
        /// </summary>
        [Input("cpu", required: true)]
        public Input<double> Cpu { get; set; } = null!;

        /// <summary>
        /// Memory (GB) request and limit for a single Airflow triggerer replica.
        /// </summary>
        [Input("memoryGb", required: true)]
        public Input<double> MemoryGb { get; set; } = null!;

        public EnvironmentConfigWorkloadsConfigTriggererGetArgs()
        {
        }
        public static new EnvironmentConfigWorkloadsConfigTriggererGetArgs Empty => new EnvironmentConfigWorkloadsConfigTriggererGetArgs();
    }
}
