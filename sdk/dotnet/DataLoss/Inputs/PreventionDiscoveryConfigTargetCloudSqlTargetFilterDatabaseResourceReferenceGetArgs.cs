// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Name of a database within the instance.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Required. Name of a database resource, for example, a table within the database.
        /// </summary>
        [Input("databaseResource", required: true)]
        public Input<string> DatabaseResource { get; set; } = null!;

        /// <summary>
        /// Required. The instance where this resource is located. For example: Cloud SQL instance ID.
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        /// <summary>
        /// Required. If within a project-level config, then this must match the config's project ID.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceGetArgs()
        {
        }
        public static new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceGetArgs Empty => new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceGetArgs();
    }
}
