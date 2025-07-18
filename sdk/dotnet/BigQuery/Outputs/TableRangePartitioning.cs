// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class TableRangePartitioning
    {
        /// <summary>
        /// The field used to determine how to create a range-based
        /// partition.
        /// </summary>
        public readonly string Field;
        /// <summary>
        /// Information required to partition based on ranges.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TableRangePartitioningRange Range;

        [OutputConstructor]
        private TableRangePartitioning(
            string field,

            Outputs.TableRangePartitioningRange range)
        {
            Field = field;
            Range = range;
        }
    }
}
