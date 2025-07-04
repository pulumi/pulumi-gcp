// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class ApplicationFeatureSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to false to use the legacy health check instead of the readiness
        /// and liveness checks.
        /// </summary>
        [Input("splitHealthChecks", required: true)]
        public Input<bool> SplitHealthChecks { get; set; } = null!;

        public ApplicationFeatureSettingsGetArgs()
        {
        }
        public static new ApplicationFeatureSettingsGetArgs Empty => new ApplicationFeatureSettingsGetArgs();
    }
}
