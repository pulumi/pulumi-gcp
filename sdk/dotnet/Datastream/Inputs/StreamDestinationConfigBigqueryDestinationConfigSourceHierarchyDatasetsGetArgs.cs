// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream.Inputs
{

    public sealed class StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Dataset template used for dynamic dataset creation.
        /// Structure is documented below.
        /// </summary>
        [Input("datasetTemplate", required: true)]
        public Input<Inputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplateGetArgs> DatasetTemplate { get; set; } = null!;

        public StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsGetArgs()
        {
        }
        public static new StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsGetArgs Empty => new StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsGetArgs();
    }
}