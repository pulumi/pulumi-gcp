// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class RegionBackendServiceConnectionTrackingPolicy
    {
        /// <summary>
        /// Specifies connection persistence when backends are unhealthy.
        /// If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
        /// unhealthy backends only for connection-oriented protocols (TCP and SCTP)
        /// and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
        /// or the Session Affinity is configured for 5-tuple. They do not persist
        /// for UDP.
        /// If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
        /// connections on the unhealthy backend are never persisted on the unhealthy
        /// backend. They are always diverted to newly selected healthy backends
        /// (unless all backends are unhealthy).
        /// If set to `ALWAYS_PERSIST`, existing connections always persist on
        /// unhealthy backends regardless of protocol and session affinity. It is
        /// generally not recommended to use this mode overriding the default.
        /// Default value is `DEFAULT_FOR_PROTOCOL`.
        /// Possible values are: `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, `ALWAYS_PERSIST`.
        /// </summary>
        public readonly string? ConnectionPersistenceOnUnhealthyBackends;
        /// <summary>
        /// Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
        /// </summary>
        public readonly bool? EnableStrongAffinity;
        /// <summary>
        /// Specifies how long to keep a Connection Tracking entry while there is
        /// no matching traffic (in seconds).
        /// For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
        /// For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
        /// </summary>
        public readonly int? IdleTimeoutSec;
        /// <summary>
        /// Specifies the key used for connection tracking. There are two options:
        /// `PER_CONNECTION`: The Connection Tracking is performed as per the
        /// Connection Key (default Hash Method) for the specific protocol.
        /// `PER_SESSION`: The Connection Tracking is performed as per the
        /// configured Session Affinity. It matches the configured Session Affinity.
        /// Default value is `PER_CONNECTION`.
        /// Possible values are: `PER_CONNECTION`, `PER_SESSION`.
        /// </summary>
        public readonly string? TrackingMode;

        [OutputConstructor]
        private RegionBackendServiceConnectionTrackingPolicy(
            string? connectionPersistenceOnUnhealthyBackends,

            bool? enableStrongAffinity,

            int? idleTimeoutSec,

            string? trackingMode)
        {
            ConnectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            EnableStrongAffinity = enableStrongAffinity;
            IdleTimeoutSec = idleTimeoutSec;
            TrackingMode = trackingMode;
        }
    }
}
