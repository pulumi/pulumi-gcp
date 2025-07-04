// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class ConnectionCloudSqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud SQL properties.
        /// Structure is documented below.
        /// </summary>
        [Input("credential", required: true)]
        public Input<Inputs.ConnectionCloudSqlCredentialArgs> Credential { get; set; } = null!;

        /// <summary>
        /// Database name.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Cloud SQL instance ID in the form project:location:instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// (Output)
        /// When the connection is used in the context of an operation in BigQuery, this service account will serve as the identity being used for connecting to the CloudSQL instance specified in this connection.
        /// </summary>
        [Input("serviceAccountId")]
        public Input<string>? ServiceAccountId { get; set; }

        /// <summary>
        /// Type of the Cloud SQL database.
        /// Possible values are: `DATABASE_TYPE_UNSPECIFIED`, `POSTGRES`, `MYSQL`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ConnectionCloudSqlArgs()
        {
        }
        public static new ConnectionCloudSqlArgs Empty => new ConnectionCloudSqlArgs();
    }
}
