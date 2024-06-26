// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetCloudSqlTargetFilterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A specific set of database resources for this filter to apply to.
        /// Structure is documented below.
        /// </summary>
        [Input("collection")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterCollectionGetArgs>? Collection { get; set; }

        /// <summary>
        /// The database resource to scan. Targets including this can only include one target (the target with this database resource reference).
        /// Structure is documented below.
        /// </summary>
        [Input("databaseResourceReference")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceGetArgs>? DatabaseResourceReference { get; set; }

        /// <summary>
        /// Catch-all. This should always be the last target in the list because anything above it will apply first. Should only appear once in a configuration. If none is specified, a default one will be added automatically.
        /// </summary>
        [Input("others")]
        public Input<Inputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilterOthersGetArgs>? Others { get; set; }

        public PreventionDiscoveryConfigTargetCloudSqlTargetFilterGetArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetCloudSqlTargetFilterGetArgs Empty => new PreventionDiscoveryConfigTargetCloudSqlTargetFilterGetArgs();
    }
}
