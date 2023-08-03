// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine.Outputs
{

    [OutputType]
    public sealed class PrivateCloudNsx
    {
        /// <summary>
        /// Fully qualified domain name of the appliance.
        /// </summary>
        public readonly string? Fqdn;
        /// <summary>
        /// Internal IP address of the appliance.
        /// </summary>
        public readonly string? InternalIp;
        /// <summary>
        /// State of the appliance.
        /// Possible values are: `ACTIVE`, `CREATING`.
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// Version of the appliance.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private PrivateCloudNsx(
            string? fqdn,

            string? internalIp,

            string? state,

            string? version)
        {
            Fqdn = fqdn;
            InternalIp = internalIp;
            State = state;
            Version = version;
        }
    }
}