// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Outputs
{

    [OutputType]
    public sealed class GetInstanceAutoscalingConfigAutoscalingLimitResult
    {
        public readonly int MaxProcessingUnits;
        public readonly int MinProcessingUnits;

        [OutputConstructor]
        private GetInstanceAutoscalingConfigAutoscalingLimitResult(
            int maxProcessingUnits,

            int minProcessingUnits)
        {
            MaxProcessingUnits = maxProcessingUnits;
            MinProcessingUnits = minProcessingUnits;
        }
    }
}