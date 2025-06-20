// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CertificateManager.Outputs
{

    [OutputType]
    public sealed class CertificateMapGclbTarget
    {
        /// <summary>
        /// An IP configuration where this Certificate Map is serving
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.CertificateMapGclbTargetIpConfig> IpConfigs;
        /// <summary>
        /// Proxy name must be in the format projects/*/locations/*/targetHttpsProxies/*.
        /// This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
        /// `targetSslProxy` may be set.
        /// </summary>
        public readonly string? TargetHttpsProxy;
        /// <summary>
        /// Proxy name must be in the format projects/*/locations/*/targetSslProxies/*.
        /// This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
        /// `targetSslProxy` may be set.
        /// </summary>
        public readonly string? TargetSslProxy;

        [OutputConstructor]
        private CertificateMapGclbTarget(
            ImmutableArray<Outputs.CertificateMapGclbTargetIpConfig> ipConfigs,

            string? targetHttpsProxy,

            string? targetSslProxy)
        {
            IpConfigs = ipConfigs;
            TargetHttpsProxy = targetHttpsProxy;
            TargetSslProxy = targetSslProxy;
        }
    }
}
