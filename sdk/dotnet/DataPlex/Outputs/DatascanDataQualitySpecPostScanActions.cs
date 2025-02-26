// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class DatascanDataQualitySpecPostScanActions
    {
        /// <summary>
        /// If set, results will be exported to the provided BigQuery table.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.DatascanDataQualitySpecPostScanActionsBigqueryExport? BigqueryExport;

        [OutputConstructor]
        private DatascanDataQualitySpecPostScanActions(Outputs.DatascanDataQualitySpecPostScanActionsBigqueryExport? bigqueryExport)
        {
            BigqueryExport = bigqueryExport;
        }
    }
}
