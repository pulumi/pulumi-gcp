// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataQualitySpecPostScanActionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set, results will be exported to the provided BigQuery table.
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryExport")]
        public Input<Inputs.DatascanDataQualitySpecPostScanActionsBigqueryExportGetArgs>? BigqueryExport { get; set; }

        /// <summary>
        /// The configuration of notification report post scan action.
        /// Structure is documented below.
        /// </summary>
        [Input("notificationReport")]
        public Input<Inputs.DatascanDataQualitySpecPostScanActionsNotificationReportGetArgs>? NotificationReport { get; set; }

        public DatascanDataQualitySpecPostScanActionsGetArgs()
        {
        }
        public static new DatascanDataQualitySpecPostScanActionsGetArgs Empty => new DatascanDataQualitySpecPostScanActionsGetArgs();
    }
}
