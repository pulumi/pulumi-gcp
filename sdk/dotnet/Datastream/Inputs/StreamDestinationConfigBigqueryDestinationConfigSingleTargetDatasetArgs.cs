// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Dataset ID in the format projects/{project}/datasets/{dataset_id}
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        public StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs()
        {
        }
        public static new StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs Empty => new StreamDestinationConfigBigqueryDestinationConfigSingleTargetDatasetArgs();
    }
}