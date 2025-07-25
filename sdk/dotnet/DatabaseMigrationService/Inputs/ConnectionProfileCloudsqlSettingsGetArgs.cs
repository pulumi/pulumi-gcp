// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class ConnectionProfileCloudsqlSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'.
        /// Possible values are: `ALWAYS`, `NEVER`.
        /// </summary>
        [Input("activationPolicy")]
        public Input<string>? ActivationPolicy { get; set; }

        /// <summary>
        /// If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity.
        /// If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
        /// </summary>
        [Input("autoStorageIncrease")]
        public Input<bool>? AutoStorageIncrease { get; set; }

        /// <summary>
        /// The KMS key name used for the csql instance.
        /// </summary>
        [Input("cmekKeyName")]
        public Input<string>? CmekKeyName { get; set; }

        /// <summary>
        /// The Cloud SQL default instance level collation.
        /// </summary>
        [Input("collation")]
        public Input<string>? Collation { get; set; }

        /// <summary>
        /// The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
        /// </summary>
        [Input("dataDiskSizeGb")]
        public Input<string>? DataDiskSizeGb { get; set; }

        /// <summary>
        /// The type of storage.
        /// Possible values are: `PD_SSD`, `PD_HDD`.
        /// </summary>
        [Input("dataDiskType")]
        public Input<string>? DataDiskType { get; set; }

        [Input("databaseFlags")]
        private InputMap<string>? _databaseFlags;

        /// <summary>
        /// The database flags passed to the Cloud SQL instance at startup.
        /// </summary>
        public InputMap<string> DatabaseFlags
        {
            get => _databaseFlags ?? (_databaseFlags = new InputMap<string>());
            set => _databaseFlags = value;
        }

        /// <summary>
        /// The database engine type and version.
        /// Currently supported values located at https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.connectionProfiles#sqldatabaseversion
        /// </summary>
        [Input("databaseVersion")]
        public Input<string>? DatabaseVersion { get; set; }

        /// <summary>
        /// The edition of the given Cloud SQL instance.
        /// Possible values are: `ENTERPRISE`, `ENTERPRISE_PLUS`.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
        /// Structure is documented below.
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.ConnectionProfileCloudsqlSettingsIpConfigGetArgs>? IpConfig { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;

        /// <summary>
        /// Input only. Initial root password.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// (Output)
        /// Output only. Indicates If this connection profile root password is stored.
        /// </summary>
        [Input("rootPasswordSet")]
        public Input<bool>? RootPasswordSet { get; set; }

        /// <summary>
        /// The Database Migration Service source connection profile ID, in the format: projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID
        /// </summary>
        [Input("sourceId", required: true)]
        public Input<string> SourceId { get; set; } = null!;

        /// <summary>
        /// The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
        /// </summary>
        [Input("storageAutoResizeLimit")]
        public Input<string>? StorageAutoResizeLimit { get; set; }

        /// <summary>
        /// The tier (or machine type) for this instance, for example: db-n1-standard-1 (MySQL instances) or db-custom-1-3840 (PostgreSQL instances).
        /// For more information, see https://cloud.google.com/sql/docs/mysql/instance-settings
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        [Input("userLabels")]
        private InputMap<string>? _userLabels;

        /// <summary>
        /// The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs.
        /// </summary>
        public InputMap<string> UserLabels
        {
            get => _userLabels ?? (_userLabels = new InputMap<string>());
            set => _userLabels = value;
        }

        /// <summary>
        /// The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ConnectionProfileCloudsqlSettingsGetArgs()
        {
        }
        public static new ConnectionProfileCloudsqlSettingsGetArgs Empty => new ConnectionProfileCloudsqlSettingsGetArgs();
    }
}
