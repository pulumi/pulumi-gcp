// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AssuredWorkloads.Outputs
{

    [OutputType]
    public sealed class WorkloadKmsSettings
    {
        /// <summary>
        /// Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
        /// </summary>
        public readonly string NextRotationTime;
        /// <summary>
        /// Required. Input only. Immutable. will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
        /// </summary>
        public readonly string RotationPeriod;

        [OutputConstructor]
        private WorkloadKmsSettings(
            string nextRotationTime,

            string rotationPeriod)
        {
            NextRotationTime = nextRotationTime;
            RotationPeriod = rotationPeriod;
        }
    }
}