// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class GetEnvironmentConfigWorkloadsConfigDagProcessorResult
    {
        /// <summary>
        /// Number of DAG processors.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// CPU request and limit for DAG processor.
        /// </summary>
        public readonly double Cpu;
        /// <summary>
        /// Memory (GB) request and limit for DAG processor.
        /// </summary>
        public readonly double MemoryGb;
        /// <summary>
        /// Storage (GB) request and limit for DAG processor.
        /// </summary>
        public readonly double StorageGb;

        [OutputConstructor]
        private GetEnvironmentConfigWorkloadsConfigDagProcessorResult(
            int count,

            double cpu,

            double memoryGb,

            double storageGb)
        {
            Count = count;
            Cpu = cpu;
            MemoryGb = memoryGb;
            StorageGb = storageGb;
        }
    }
}
