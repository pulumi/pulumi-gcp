// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Inputs
{

    public sealed class EnvironmentConfigWorkloadsConfigWorkerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CPU request and limit for a single Airflow worker replica.
        /// </summary>
        [Input("cpu")]
        public Input<double>? Cpu { get; set; }

        /// <summary>
        /// Maximum number of workers for autoscaling.
        /// </summary>
        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// Memory (GB) request and limit for a single Airflow worker replica.
        /// </summary>
        [Input("memoryGb")]
        public Input<double>? MemoryGb { get; set; }

        /// <summary>
        /// Minimum number of workers for autoscaling.
        /// </summary>
        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// Storage (GB) request and limit for a single Airflow worker replica.
        /// </summary>
        [Input("storageGb")]
        public Input<double>? StorageGb { get; set; }

        public EnvironmentConfigWorkloadsConfigWorkerGetArgs()
        {
        }
        public static new EnvironmentConfigWorkloadsConfigWorkerGetArgs Empty => new EnvironmentConfigWorkloadsConfigWorkerGetArgs();
    }
}
