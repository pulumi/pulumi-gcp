// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GetRegionInstanceTemplateAdvancedMachineFeatureResult
    {
        public readonly bool EnableNestedVirtualization;
        public readonly int ThreadsPerCore;
        public readonly int VisibleCoreCount;

        [OutputConstructor]
        private GetRegionInstanceTemplateAdvancedMachineFeatureResult(
            bool enableNestedVirtualization,

            int threadsPerCore,

            int visibleCoreCount)
        {
            EnableNestedVirtualization = enableNestedVirtualization;
            ThreadsPerCore = threadsPerCore;
            VisibleCoreCount = visibleCoreCount;
        }
    }
}