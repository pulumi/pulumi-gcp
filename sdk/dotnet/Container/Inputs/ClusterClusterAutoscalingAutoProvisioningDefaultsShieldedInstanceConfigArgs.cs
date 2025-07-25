// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines if the instance has integrity monitoring enabled.
        /// 
        /// Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created.  Defaults to `true`.
        /// </summary>
        [Input("enableIntegrityMonitoring")]
        public Input<bool>? EnableIntegrityMonitoring { get; set; }

        /// <summary>
        /// Defines if the instance has Secure Boot enabled.
        /// 
        /// Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails.  Defaults to `false`.
        /// </summary>
        [Input("enableSecureBoot")]
        public Input<bool>? EnableSecureBoot { get; set; }

        public ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs()
        {
        }
        public static new ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs Empty => new ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs();
    }
}
