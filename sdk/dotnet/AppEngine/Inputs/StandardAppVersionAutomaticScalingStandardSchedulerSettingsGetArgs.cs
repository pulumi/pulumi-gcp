// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of instances to run for this version. Set to zero to disable maxInstances configuration.
        /// **Note:** Starting from March 2025, App Engine sets the maxInstances default for standard environment deployments to 20. This change doesn't impact existing apps. To override the default, specify a new value between 0 and 2147483647, and deploy a new version or redeploy over an existing version. To disable the maxInstances default configuration setting, specify the maximum permitted value 2147483647.
        /// </summary>
        [Input("maxInstances")]
        public Input<int>? MaxInstances { get; set; }

        /// <summary>
        /// Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
        /// </summary>
        [Input("minInstances")]
        public Input<int>? MinInstances { get; set; }

        /// <summary>
        /// Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
        /// </summary>
        [Input("targetCpuUtilization")]
        public Input<double>? TargetCpuUtilization { get; set; }

        /// <summary>
        /// Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
        /// </summary>
        [Input("targetThroughputUtilization")]
        public Input<double>? TargetThroughputUtilization { get; set; }

        public StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs()
        {
        }
        public static new StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs Empty => new StandardAppVersionAutomaticScalingStandardSchedulerSettingsGetArgs();
    }
}
