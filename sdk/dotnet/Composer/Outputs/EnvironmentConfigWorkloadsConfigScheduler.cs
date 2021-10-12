// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigWorkloadsConfigScheduler
    {
        /// <summary>
        /// The number of schedulers.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// CPU request and limit for a single Airflow worker replica.
        /// </summary>
        public readonly double? Cpu;
        /// <summary>
        /// Memory (GB) request and limit for a single Airflow worker replica.
        /// </summary>
        public readonly double? MemoryGb;
        /// <summary>
        /// Storage (GB) request and limit for Airflow web server.
        /// </summary>
        public readonly double? StorageGb;

        [OutputConstructor]
        private EnvironmentConfigWorkloadsConfigScheduler(
            int? count,

            double? cpu,

            double? memoryGb,

            double? storageGb)
        {
            Count = count;
            Cpu = cpu;
            MemoryGb = memoryGb;
            StorageGb = storageGb;
        }
    }
}