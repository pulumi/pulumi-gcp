// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Datastream
{
    /// <summary>
    /// ## Example Usage
    /// ### Datastream Connection Profile Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Datastream.ConnectionProfile("default", new()
    ///     {
    ///         ConnectionProfileId = "my-profile",
    ///         DisplayName = "Connection profile",
    ///         GcsProfile = new Gcp.Datastream.Inputs.ConnectionProfileGcsProfileArgs
    ///         {
    ///             Bucket = "my-bucket",
    ///             RootPath = "/path",
    ///         },
    ///         Location = "us-central1",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Datastream Connection Profile Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Datastream.ConnectionProfile("default", new()
    ///     {
    ///         ConnectionProfileId = "my-profile",
    ///         DisplayName = "Connection profile",
    ///         ForwardSshConnectivity = new Gcp.Datastream.Inputs.ConnectionProfileForwardSshConnectivityArgs
    ///         {
    ///             Hostname = "google.com",
    ///             Password = "swordfish",
    ///             Port = 8022,
    ///             Username = "my-user",
    ///         },
    ///         GcsProfile = new Gcp.Datastream.Inputs.ConnectionProfileGcsProfileArgs
    ///         {
    ///             Bucket = "my-bucket",
    ///             RootPath = "/path",
    ///         },
    ///         Location = "us-central1",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Datastream Connection Profile Postgres
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var instance = new Gcp.Sql.DatabaseInstance("instance", new()
    ///     {
    ///         DatabaseVersion = "POSTGRES_14",
    ///         Region = "us-central1",
    ///         Settings = new Gcp.Sql.Inputs.DatabaseInstanceSettingsArgs
    ///         {
    ///             Tier = "db-f1-micro",
    ///             IpConfiguration = new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationArgs
    ///             {
    ///                 AuthorizedNetworks = new[]
    ///                 {
    ///                     new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs
    ///                     {
    ///                         Value = "34.71.242.81",
    ///                     },
    ///                     new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs
    ///                     {
    ///                         Value = "34.72.28.29",
    ///                     },
    ///                     new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs
    ///                     {
    ///                         Value = "34.67.6.157",
    ///                     },
    ///                     new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs
    ///                     {
    ///                         Value = "34.67.234.134",
    ///                     },
    ///                     new Gcp.Sql.Inputs.DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs
    ///                     {
    ///                         Value = "34.72.239.218",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         DeletionProtection = true,
    ///     });
    /// 
    ///     var db = new Gcp.Sql.Database("db", new()
    ///     {
    ///         Instance = instance.Name,
    ///     });
    /// 
    ///     var pwd = new Random.RandomPassword("pwd", new()
    ///     {
    ///         Length = 16,
    ///         Special = false,
    ///     });
    /// 
    ///     var user = new Gcp.Sql.User("user", new()
    ///     {
    ///         Instance = instance.Name,
    ///         Password = pwd.Result,
    ///     });
    /// 
    ///     var @default = new Gcp.Datastream.ConnectionProfile("default", new()
    ///     {
    ///         DisplayName = "Connection profile",
    ///         Location = "us-central1",
    ///         ConnectionProfileId = "my-profile",
    ///         PostgresqlProfile = new Gcp.Datastream.Inputs.ConnectionProfilePostgresqlProfileArgs
    ///         {
    ///             Hostname = instance.PublicIpAddress,
    ///             Username = user.Name,
    ///             Password = user.Password,
    ///             Database = db.Name,
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
    ///  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default projects/{{project}}/locations/{{location}}/connectionProfiles/{{connection_profile_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default {{project}}/{{location}}/{{connection_profile_id}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default {{location}}/{{connection_profile_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:datastream/connectionProfile:ConnectionProfile")]
    public partial class ConnectionProfile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The connection profile identifier.
        /// </summary>
        [Output("connectionProfileId")]
        public Output<string> ConnectionProfileId { get; private set; } = null!;

        /// <summary>
        /// Display name.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Forward SSH tunnel connectivity.
        /// Structure is documented below.
        /// </summary>
        [Output("forwardSshConnectivity")]
        public Output<Outputs.ConnectionProfileForwardSshConnectivity?> ForwardSshConnectivity { get; private set; } = null!;

        /// <summary>
        /// Cloud Storage bucket profile.
        /// Structure is documented below.
        /// </summary>
        [Output("gcsProfile")]
        public Output<Outputs.ConnectionProfileGcsProfile?> GcsProfile { get; private set; } = null!;

        /// <summary>
        /// Labels.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the location this repository is located in.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// MySQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Output("mysqlProfile")]
        public Output<Outputs.ConnectionProfileMysqlProfile?> MysqlProfile { get; private set; } = null!;

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Oracle database profile.
        /// Structure is documented below.
        /// </summary>
        [Output("oracleProfile")]
        public Output<Outputs.ConnectionProfileOracleProfile?> OracleProfile { get; private set; } = null!;

        /// <summary>
        /// PostgreSQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Output("postgresqlProfile")]
        public Output<Outputs.ConnectionProfilePostgresqlProfile?> PostgresqlProfile { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectionProfile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectionProfile(string name, ConnectionProfileArgs args, CustomResourceOptions? options = null)
            : base("gcp:datastream/connectionProfile:ConnectionProfile", name, args ?? new ConnectionProfileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectionProfile(string name, Input<string> id, ConnectionProfileState? state = null, CustomResourceOptions? options = null)
            : base("gcp:datastream/connectionProfile:ConnectionProfile", name, state, MakeResourceOptions(options, id))
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
        /// The connection profile identifier.
        /// </summary>
        [Input("connectionProfileId", required: true)]
        public Input<string> ConnectionProfileId { get; set; } = null!;

        /// <summary>
        /// Display name.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Forward SSH tunnel connectivity.
        /// Structure is documented below.
        /// </summary>
        [Input("forwardSshConnectivity")]
        public Input<Inputs.ConnectionProfileForwardSshConnectivityArgs>? ForwardSshConnectivity { get; set; }

        /// <summary>
        /// Cloud Storage bucket profile.
        /// Structure is documented below.
        /// </summary>
        [Input("gcsProfile")]
        public Input<Inputs.ConnectionProfileGcsProfileArgs>? GcsProfile { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the location this repository is located in.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// MySQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("mysqlProfile")]
        public Input<Inputs.ConnectionProfileMysqlProfileArgs>? MysqlProfile { get; set; }

        /// <summary>
        /// Oracle database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("oracleProfile")]
        public Input<Inputs.ConnectionProfileOracleProfileArgs>? OracleProfile { get; set; }

        /// <summary>
        /// PostgreSQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("postgresqlProfile")]
        public Input<Inputs.ConnectionProfilePostgresqlProfileArgs>? PostgresqlProfile { get; set; }

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
        /// The connection profile identifier.
        /// </summary>
        [Input("connectionProfileId")]
        public Input<string>? ConnectionProfileId { get; set; }

        /// <summary>
        /// Display name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Forward SSH tunnel connectivity.
        /// Structure is documented below.
        /// </summary>
        [Input("forwardSshConnectivity")]
        public Input<Inputs.ConnectionProfileForwardSshConnectivityGetArgs>? ForwardSshConnectivity { get; set; }

        /// <summary>
        /// Cloud Storage bucket profile.
        /// Structure is documented below.
        /// </summary>
        [Input("gcsProfile")]
        public Input<Inputs.ConnectionProfileGcsProfileGetArgs>? GcsProfile { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the location this repository is located in.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// MySQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("mysqlProfile")]
        public Input<Inputs.ConnectionProfileMysqlProfileGetArgs>? MysqlProfile { get; set; }

        /// <summary>
        /// The resource's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Oracle database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("oracleProfile")]
        public Input<Inputs.ConnectionProfileOracleProfileGetArgs>? OracleProfile { get; set; }

        /// <summary>
        /// PostgreSQL database profile.
        /// Structure is documented below.
        /// </summary>
        [Input("postgresqlProfile")]
        public Input<Inputs.ConnectionProfilePostgresqlProfileGetArgs>? PostgresqlProfile { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public ConnectionProfileState()
        {
        }
        public static new ConnectionProfileState Empty => new ConnectionProfileState();
    }
}