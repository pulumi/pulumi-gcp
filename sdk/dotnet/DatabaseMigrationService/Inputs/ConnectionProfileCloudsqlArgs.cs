// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class ConnectionProfileCloudsqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// Output only. The Cloud SQL instance ID that this connection profile is associated with.
        /// </summary>
        [Input("cloudSqlId")]
        public Input<string>? CloudSqlId { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. The Cloud SQL database instance's private IP.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. The Cloud SQL database instance's public IP.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        /// <summary>
        /// Immutable. Metadata used to create the destination Cloud SQL database.
        /// Structure is documented below.
        /// </summary>
        [Input("settings")]
        public Input<Inputs.ConnectionProfileCloudsqlSettingsArgs>? Settings { get; set; }

        public ConnectionProfileCloudsqlArgs()
        {
        }
        public static new ConnectionProfileCloudsqlArgs Empty => new ConnectionProfileCloudsqlArgs();
    }
}
