// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2VmSymptom
    {
        /// <summary>
        /// (Output)
        /// Timestamp when the Symptom is created.
        /// </summary>
        public readonly string? CreateTime;
        /// <summary>
        /// (Output)
        /// Detailed information of the current Symptom.
        /// </summary>
        public readonly string? Details;
        /// <summary>
        /// (Output)
        /// Type of the Symptom.
        /// </summary>
        public readonly string? SymptomType;
        /// <summary>
        /// (Output)
        /// A string used to uniquely distinguish a worker within a TPU node.
        /// </summary>
        public readonly string? WorkerId;

        [OutputConstructor]
        private V2VmSymptom(
            string? createTime,

            string? details,

            string? symptomType,

            string? workerId)
        {
            CreateTime = createTime;
            Details = details;
            SymptomType = symptomType;
            WorkerId = workerId;
        }
    }
}