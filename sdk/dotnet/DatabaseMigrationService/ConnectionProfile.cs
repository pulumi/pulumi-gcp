// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService
{
    /// <summary>
    /// A connection profile definition.
    /// 
    /// To get more information about ConnectionProfile, see:
    /// 
    /// * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.connectionProfiles/create)
    /// * How-to Guides
    ///     * [Database Migration](https://cloud.google.com/database-migration/docs/)
    /// 
    /// &gt; **Warning:** All arguments including the following potentially sensitive
    /// values will be stored in the raw state as plain text: `mysql.password`, `mysql.ssl.client_key`, `mysql.ssl.client_certificate`, `mysql.ssl.ca_certificate`, `postgresql.password`, `postgresql.ssl.client_key`, `postgresql.ssl.client_certificate`, `postgresql.ssl.ca_certificate`, `cloudsql.settings.root_password`, `alloydb.settings.initial_user.password`.
    /// Read more about sensitive data in state.
    /// 
    /// ## Example Usage
    /// ### Database Migration Service Connection Profile Cloudsql
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var cloudsqldb = new Gcp.Sql.DatabaseInstance("cloudsqldb", new()
    ///     {
    ///         DatabaseVersion = "MYSQL_5_7",
    ///         Settings = new Gcp.Sql.Inputs.DatabaseInstanceSettingsArgs
    ///         {
    ///             Tier = "db-n1-standard-1",
    ///             DeletionProtectionEnabled = false,
    ///         },
    ///         DeletionProtection = false,
    ///     });
    /// 
    ///     var sqlClientCert = new Gcp.Sql.SslCert("sqlClientCert", new()
    ///     {
    ///         CommonName = "my-cert",
    ///         Instance = cloudsqldb.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             cloudsqldb,
    ///         },
    ///     });
    /// 
    ///     var sqldbUser = new Gcp.Sql.User("sqldbUser", new()
    ///     {
    ///         Instance = cloudsqldb.Name,
    ///         Password = "my-password",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             sqlClientCert,
    ///         },
    ///     });
    /// 
    ///     var cloudsqlprofile = new Gcp.DatabaseMigrationService.ConnectionProfile("cloudsqlprofile", new()
    ///     {
    ///         Location = "us-central1",
    ///         ConnectionProfileId = "my-fromprofileid",
    ///         DisplayName = "my-fromprofileid_display",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Mysql = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfileMysqlArgs
    ///         {
    ///             Host = cloudsqldb.IpAddresses.Apply(ipAddresses =&gt; ipAddresses[0].IpAddress),
    ///             Port = 3306,
    ///             Username = sqldbUser.Name,
    ///             Password = sqldbUser.Password,
    ///             Ssl = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfileMysqlSslArgs
    ///             {
    ///                 ClientKey = sqlClientCert.PrivateKey,
    ///                 ClientCertificate = sqlClientCert.Cert,
    ///                 CaCertificate = sqlClientCert.ServerCaCert,
    ///             },
    ///             CloudSqlId = "my-database",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             sqldbUser,
    ///         },
    ///     });
    /// 
    ///     var cloudsqlprofileDestination = new Gcp.DatabaseMigrationService.ConnectionProfile("cloudsqlprofileDestination", new()
    ///     {
    ///         Location = "us-central1",
    ///         ConnectionProfileId = "my-toprofileid",
    ///         DisplayName = "my-toprofileid_displayname",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Cloudsql = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfileCloudsqlArgs
    ///         {
    ///             Settings = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfileCloudsqlSettingsArgs
    ///             {
    ///                 DatabaseVersion = "MYSQL_5_7",
    ///                 UserLabels = 
    ///                 {
    ///                     { "cloudfoo", "cloudbar" },
    ///                 },
    ///                 Tier = "db-n1-standard-1",
    ///                 StorageAutoResizeLimit = "0",
    ///                 ActivationPolicy = "ALWAYS",
    ///                 IpConfig = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfileCloudsqlSettingsIpConfigArgs
    ///                 {
    ///                     EnableIpv4 = true,
    ///                     RequireSsl = true,
    ///                 },
    ///                 AutoStorageIncrease = true,
    ///                 DataDiskType = "PD_HDD",
    ///                 DataDiskSizeGb = "11",
    ///                 Zone = "us-central1-b",
    ///                 SourceId = $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.ProjectId)}/locations/us-central1/connectionProfiles/my-fromprofileid",
    ///                 RootPassword = "testpasscloudsql",
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             cloudsqlprofile,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Database Migration Service Connection Profile Postgres
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var postgresqldb = new Gcp.Sql.DatabaseInstance("postgresqldb", new()
    ///     {
    ///         DatabaseVersion = "POSTGRES_12",
    ///         Settings = new Gcp.Sql.Inputs.DatabaseInstanceSettingsArgs
    ///         {
    ///             Tier = "db-custom-2-13312",
    ///         },
    ///         DeletionProtection = false,
    ///     });
    /// 
    ///     var sqlClientCert = new Gcp.Sql.SslCert("sqlClientCert", new()
    ///     {
    ///         CommonName = "my-cert",
    ///         Instance = postgresqldb.Name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             postgresqldb,
    ///         },
    ///     });
    /// 
    ///     var sqldbUser = new Gcp.Sql.User("sqldbUser", new()
    ///     {
    ///         Instance = postgresqldb.Name,
    ///         Password = "my-password",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             sqlClientCert,
    ///         },
    ///     });
    /// 
    ///     var postgresprofile = new Gcp.DatabaseMigrationService.ConnectionProfile("postgresprofile", new()
    ///     {
    ///         Location = "us-central1",
    ///         ConnectionProfileId = "my-profileid",
    ///         DisplayName = "my-profileid_display",
    ///         Labels = 
    ///         {
    ///             { "foo", "bar" },
    ///         },
    ///         Postgresql = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfilePostgresqlArgs
    ///         {
    ///             Host = postgresqldb.IpAddresses.Apply(ipAddresses =&gt; ipAddresses[0].IpAddress),
    ///             Port = 5432,
    ///             Username = sqldbUser.Name,
    ///             Password = sqldbUser.Password,
    ///             Ssl = new Gcp.DatabaseMigrationService.Inputs.ConnectionProfilePostgresqlSslArgs
    ///             {
    ///                 ClientKey = sqlClientCert.PrivateKey,
    ///                 ClientCertificate = sqlClientCert.Cert,
    ///                 CaCertificate = sqlClientCert.ServerCaCert,
    ///             },
    ///             CloudSqlId = "my-database",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             sqldbUser,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ConnectionProfile can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:databasemigrationservice/connectionProfile:ConnectionProfile default projects/{{project}}/locations/{{location}}/connectionProfiles/{{connection_profile_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:databasemigrationservice/connectionProfile:ConnectionProfile default {{project}}/{{location}}/{{connection_profile_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:databasemigrationservice/connectionProfile:ConnectionProfile default {{location}}/{{connection_profile_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:databasemigrationservice/connectionProfile:ConnectionProfile")]
    public partial class ConnectionProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies required connection parameters, and the parameters required to create an AlloyDB destination cluster.
        /// Structure is documented below.
        /// </summary>
        [Output("alloydb")]
        public Output<Outputs.ConnectionProfileAlloydb?> Alloydb { get; private set; } = null!;

        /// <summary>
        /// Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
        /// Structure is documented below.
        /// </summary>
        [Output("cloudsql")]
        public Output<Outputs.ConnectionProfileCloudsql?> Cloudsql { get; private set; } = null!;

        /// <summary>
        /// The ID of the connection profile.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("connectionProfileId")]
        public Output<string> ConnectionProfileId { get; private set; } = null!;

        /// <summary>
        /// Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC 'Zulu' format, accurate to nanoseconds. Example: '2014-10-02T15:01:23.045123456Z'.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The database provider.
        /// </summary>
        [Output("dbprovider")]
        public Output<string> Dbprovider { get; private set; } = null!;

        /// <summary>
        /// The connection profile display name.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Output only. The error details in case of state FAILED.
        /// Structure is documented below.
        /// </summary>
        [Output("errors")]
        public Output<ImmutableArray<Outputs.ConnectionProfileError>> Errors { get; private set; } = null!;

        /// <summary>
        /// The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location where the connection profile should reside.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies connection parameters required specifically for MySQL databases.
        /// Structure is documented below.
        /// </summary>
        [Output("mysql")]
        public Output<Outputs.ConnectionProfileMysql?> Mysql { get; private set; } = null!;

        /// <summary>
        /// The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies connection parameters required specifically for PostgreSQL databases.
        /// Structure is documented below.
        /// </summary>
        [Output("postgresql")]
        public Output<Outputs.ConnectionProfilePostgresql?> Postgresql { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The current connection profile state.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectionProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectionProfile(string name, ConnectionProfileArgs args, CustomResourceOptions? options = null)
            : base("gcp:databasemigrationservice/connectionProfile:ConnectionProfile", name, args ?? new ConnectionProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectionProfile(string name, Input<string> id, ConnectionProfileState? state = null, CustomResourceOptions? options = null)
            : base("gcp:databasemigrationservice/connectionProfile:ConnectionProfile", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ConnectionProfile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectionProfile Get(string name, Input<string> id, ConnectionProfileState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectionProfile(name, id, state, options);
        }
    }

    public sealed class ConnectionProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies required connection parameters, and the parameters required to create an AlloyDB destination cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("alloydb")]
        public Input<Inputs.ConnectionProfileAlloydbArgs>? Alloydb { get; set; }

        /// <summary>
        /// Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
        /// Structure is documented below.
        /// </summary>
        [Input("cloudsql")]
        public Input<Inputs.ConnectionProfileCloudsqlArgs>? Cloudsql { get; set; }

        /// <summary>
        /// The ID of the connection profile.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("connectionProfileId", required: true)]
        public Input<string> ConnectionProfileId { get; set; } = null!;

        /// <summary>
        /// The connection profile display name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the connection profile should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies connection parameters required specifically for MySQL databases.
        /// Structure is documented below.
        /// </summary>
        [Input("mysql")]
        public Input<Inputs.ConnectionProfileMysqlArgs>? Mysql { get; set; }

        /// <summary>
        /// Specifies connection parameters required specifically for PostgreSQL databases.
        /// Structure is documented below.
        /// </summary>
        [Input("postgresql")]
        public Input<Inputs.ConnectionProfilePostgresqlArgs>? Postgresql { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public ConnectionProfileArgs()
        {
        }
        public static new ConnectionProfileArgs Empty => new ConnectionProfileArgs();
    }

    public sealed class ConnectionProfileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies required connection parameters, and the parameters required to create an AlloyDB destination cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("alloydb")]
        public Input<Inputs.ConnectionProfileAlloydbGetArgs>? Alloydb { get; set; }

        /// <summary>
        /// Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
        /// Structure is documented below.
        /// </summary>
        [Input("cloudsql")]
        public Input<Inputs.ConnectionProfileCloudsqlGetArgs>? Cloudsql { get; set; }

        /// <summary>
        /// The ID of the connection profile.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("connectionProfileId")]
        public Input<string>? ConnectionProfileId { get; set; }

        /// <summary>
        /// Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC 'Zulu' format, accurate to nanoseconds. Example: '2014-10-02T15:01:23.045123456Z'.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The database provider.
        /// </summary>
        [Input("dbprovider")]
        public Input<string>? Dbprovider { get; set; }

        /// <summary>
        /// The connection profile display name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("errors")]
        private InputList<Inputs.ConnectionProfileErrorGetArgs>? _errors;

        /// <summary>
        /// Output only. The error details in case of state FAILED.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConnectionProfileErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.ConnectionProfileErrorGetArgs>());
            set => _errors = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the connection profile should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies connection parameters required specifically for MySQL databases.
        /// Structure is documented below.
        /// </summary>
        [Input("mysql")]
        public Input<Inputs.ConnectionProfileMysqlGetArgs>? Mysql { get; set; }

        /// <summary>
        /// The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies connection parameters required specifically for PostgreSQL databases.
        /// Structure is documented below.
        /// </summary>
        [Input("postgresql")]
        public Input<Inputs.ConnectionProfilePostgresqlGetArgs>? Postgresql { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The current connection profile state.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public ConnectionProfileState()
        {
        }
        public static new ConnectionProfileState Empty => new ConnectionProfileState();
    }
}