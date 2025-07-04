// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDiscoveryConfigAction
    {
        /// <summary>
        /// Export data profiles into a provided location
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDiscoveryConfigActionExportData? ExportData;
        /// <summary>
        /// Publish a message into the Pub/Sub topic.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDiscoveryConfigActionPubSubNotification? PubSubNotification;
        /// <summary>
        /// Publish a message into the Pub/Sub topic.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDiscoveryConfigActionTagResources? TagResources;

        [OutputConstructor]
        private PreventionDiscoveryConfigAction(
            Outputs.PreventionDiscoveryConfigActionExportData? exportData,

            Outputs.PreventionDiscoveryConfigActionPubSubNotification? pubSubNotification,

            Outputs.PreventionDiscoveryConfigActionTagResources? tagResources)
        {
            ExportData = exportData;
            PubSubNotification = pubSubNotification;
            TagResources = tagResources;
        }
    }
}
