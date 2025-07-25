// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2VmShieldedInstanceConfig
    {
        /// <summary>
        /// Defines whether the instance has Secure Boot enabled.
        /// </summary>
        public readonly bool EnableSecureBoot;

        [OutputConstructor]
        private V2VmShieldedInstanceConfig(bool enableSecureBoot)
        {
            EnableSecureBoot = enableSecureBoot;
        }
    }
}
