// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureSpecFleetobservabilityLoggingConfigDefaultConfig
    {
        /// <summary>
        /// Specified if fleet logging feature is enabled.
        /// Possible values are: `MODE_UNSPECIFIED`, `COPY`, `MOVE`.
        /// </summary>
        public readonly string? Mode;

        [OutputConstructor]
        private FeatureSpecFleetobservabilityLoggingConfigDefaultConfig(string? mode)
        {
            Mode = mode;
        }
    }
}
