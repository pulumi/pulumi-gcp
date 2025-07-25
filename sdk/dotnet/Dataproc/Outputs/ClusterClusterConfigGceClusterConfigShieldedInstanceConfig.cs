// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class ClusterClusterConfigGceClusterConfigShieldedInstanceConfig
    {
        /// <summary>
        /// Defines whether instances have integrity monitoring enabled.
        /// 
        /// - - -
        /// </summary>
        public readonly bool? EnableIntegrityMonitoring;
        /// <summary>
        /// Defines whether instances have Secure Boot enabled.
        /// </summary>
        public readonly bool? EnableSecureBoot;
        /// <summary>
        /// Defines whether instances have the [vTPM](https://cloud.google.com/security/shielded-cloud/shielded-vm#vtpm) enabled.
        /// </summary>
        public readonly bool? EnableVtpm;

        [OutputConstructor]
        private ClusterClusterConfigGceClusterConfigShieldedInstanceConfig(
            bool? enableIntegrityMonitoring,

            bool? enableSecureBoot,

            bool? enableVtpm)
        {
            EnableIntegrityMonitoring = enableIntegrityMonitoring;
            EnableSecureBoot = enableSecureBoot;
            EnableVtpm = enableVtpm;
        }
    }
}
