// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigDataprocMetricConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metrics", required: true)]
        private InputList<Inputs.ClusterClusterConfigDataprocMetricConfigMetricGetArgs>? _metrics;

        /// <summary>
        /// Metrics sources to enable.
        /// </summary>
        public InputList<Inputs.ClusterClusterConfigDataprocMetricConfigMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.ClusterClusterConfigDataprocMetricConfigMetricGetArgs>());
            set => _metrics = value;
        }

        public ClusterClusterConfigDataprocMetricConfigGetArgs()
        {
        }
        public static new ClusterClusterConfigDataprocMetricConfigGetArgs Empty => new ClusterClusterConfigDataprocMetricConfigGetArgs();
    }
}