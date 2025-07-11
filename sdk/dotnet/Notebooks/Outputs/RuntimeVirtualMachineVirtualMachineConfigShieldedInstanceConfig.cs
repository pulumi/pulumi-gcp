// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Notebooks.Outputs
{

    [OutputType]
    public sealed class RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig
    {
        /// <summary>
        /// Defines whether the instance has integrity monitoring enabled.
        /// Enables monitoring and attestation of the boot integrity of
        /// the instance. The attestation is performed against the
        /// integrity policy baseline. This baseline is initially derived
        /// from the implicitly trusted boot image when the instance is
        /// created. Enabled by default.
        /// </summary>
        public readonly bool? EnableIntegrityMonitoring;
        /// <summary>
        /// Defines whether the instance has Secure Boot enabled.Secure
        /// Boot helps ensure that the system only runs authentic software
        /// by verifying the digital signature of all boot components, and
        /// halting the boot process if signature verification fails.
        /// Disabled by default.
        /// </summary>
        public readonly bool? EnableSecureBoot;
        /// <summary>
        /// Defines whether the instance has the vTPM enabled. Enabled by
        /// default.
        /// </summary>
        public readonly bool? EnableVtpm;

        [OutputConstructor]
        private RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig(
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
