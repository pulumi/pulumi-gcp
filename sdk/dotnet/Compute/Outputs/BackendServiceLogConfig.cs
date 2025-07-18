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
    public sealed class BackendServiceLogConfig
    {
        /// <summary>
        /// Whether to enable logging for the load balancer traffic served by this backend service.
        /// </summary>
        public readonly bool? Enable;
        /// <summary>
        /// This field can only be specified if logging is enabled for this backend service and "logConfig.optionalMode"
        /// was set to CUSTOM. Contains a list of optional fields you want to include in the logs.
        /// For example: serverInstance, serverGkeDetails.cluster, serverGkeDetails.pod.podNamespace
        /// For example: orca_load_report, tls.protocol
        /// </summary>
        public readonly ImmutableArray<string> OptionalFields;
        /// <summary>
        /// Specifies the optional logging mode for the load balancer traffic.
        /// Supported values: INCLUDE_ALL_OPTIONAL, EXCLUDE_ALL_OPTIONAL, CUSTOM.
        /// Possible values are: `INCLUDE_ALL_OPTIONAL`, `EXCLUDE_ALL_OPTIONAL`, `CUSTOM`.
        /// </summary>
        public readonly string? OptionalMode;
        /// <summary>
        /// This field can only be specified if logging is enabled for this backend service. The value of
        /// the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
        /// where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
        /// The default value is 1.0.
        /// </summary>
        public readonly double? SampleRate;

        [OutputConstructor]
        private BackendServiceLogConfig(
            bool? enable,

            ImmutableArray<string> optionalFields,

            string? optionalMode,

            double? sampleRate)
        {
            Enable = enable;
            OptionalFields = optionalFields;
            OptionalMode = optionalMode;
            SampleRate = sampleRate;
        }
    }
}
