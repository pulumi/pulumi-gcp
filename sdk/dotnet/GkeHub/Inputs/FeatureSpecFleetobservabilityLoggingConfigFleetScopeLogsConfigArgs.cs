// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specified if fleet logging feature is enabled.
        /// Possible values are: `MODE_UNSPECIFIED`, `COPY`, `MOVE`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        public FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs()
        {
        }
        public static new FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs Empty => new FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs();
    }
}
