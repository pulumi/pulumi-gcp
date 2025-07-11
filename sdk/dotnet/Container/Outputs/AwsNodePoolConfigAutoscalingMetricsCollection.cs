// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AwsNodePoolConfigAutoscalingMetricsCollection
    {
        /// <summary>
        /// The frequency at which EC2 Auto Scaling sends aggregated data to AWS CloudWatch. The only valid value is "1Minute".
        /// </summary>
        public readonly string Granularity;
        /// <summary>
        /// The metrics to enable. For a list of valid metrics, see https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html. If you specify granularity and don't specify any metrics, all metrics are enabled.
        /// </summary>
        public readonly ImmutableArray<string> Metrics;

        [OutputConstructor]
        private AwsNodePoolConfigAutoscalingMetricsCollection(
            string granularity,

            ImmutableArray<string> metrics)
        {
            Granularity = granularity;
            Metrics = metrics;
        }
    }
}
