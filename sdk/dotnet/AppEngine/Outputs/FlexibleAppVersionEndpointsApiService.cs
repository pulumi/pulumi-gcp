// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Outputs
{

    [OutputType]
    public sealed class FlexibleAppVersionEndpointsApiService
    {
        /// <summary>
        /// Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".
        /// By default, the rollout strategy for Endpoints is "FIXED". This means that Endpoints starts up with a particular configuration ID.
        /// When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
        /// and is required in this case.
        /// Endpoints also has a rollout strategy called "MANAGED". When using this, Endpoints fetches the latest configuration and does not need
        /// the configuration ID. In this case, configId must be omitted.
        /// </summary>
        public readonly string? ConfigId;
        /// <summary>
        /// Enable or disable trace sampling. By default, this is set to false for enabled.
        /// </summary>
        public readonly bool? DisableTraceSampling;
        /// <summary>
        /// Endpoints service name which is the name of the "service" resource in the Service Management API.
        /// For example "myapi.endpoints.myproject.cloud.goog"
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
        /// Default value is `FIXED`.
        /// Possible values are: `FIXED`, `MANAGED`.
        /// </summary>
        public readonly string? RolloutStrategy;

        [OutputConstructor]
        private FlexibleAppVersionEndpointsApiService(
            string? configId,

            bool? disableTraceSampling,

            string name,

            string? rolloutStrategy)
        {
            ConfigId = configId;
            DisableTraceSampling = disableTraceSampling;
            Name = name;
            RolloutStrategy = rolloutStrategy;
        }
    }
}
