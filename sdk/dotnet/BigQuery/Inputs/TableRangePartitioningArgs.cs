// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class TableRangePartitioningArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The field used to determine how to create a range-based
        /// partition.
        /// </summary>
        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        /// <summary>
        /// Information required to partition based on ranges.
        /// Structure is documented below.
        /// </summary>
        [Input("range", required: true)]
        public Input<Inputs.TableRangePartitioningRangeArgs> Range { get; set; } = null!;

        public TableRangePartitioningArgs()
        {
        }
        public static new TableRangePartitioningArgs Empty => new TableRangePartitioningArgs();
    }
}
