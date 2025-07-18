// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A migration job definition.
 *
 * To get more information about MigrationJob, see:
 *
 * * [API documentation](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs/create)
 * * How-to Guides
 *     * [Database Migration](https://cloud.google.com/database-migration/docs/)
 *
 * ## Example Usage
 *
 * ### Database Migration Service Migration Job Mysql To Mysql
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const sourceCsql = new gcp.sql.DatabaseInstance("source_csql", {
 *     name: "source-csql",
 *     databaseVersion: "MYSQL_5_7",
 *     settings: {
 *         tier: "db-n1-standard-1",
 *         deletionProtectionEnabled: false,
 *     },
 *     deletionProtection: false,
 * });
 * const sourceSqlClientCert = new gcp.sql.SslCert("source_sql_client_cert", {
 *     commonName: "cert",
 *     instance: sourceCsql.name,
 * }, {
 *     dependsOn: [sourceCsql],
 * });
 * const sourceSqldbUser = new gcp.sql.User("source_sqldb_user", {
 *     name: "username",
 *     instance: sourceCsql.name,
 *     password: "password",
 * }, {
 *     dependsOn: [sourceSqlClientCert],
 * });
 * const sourceCp = new gcp.databasemigrationservice.ConnectionProfile("source_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "source-cp",
 *     displayName: "source-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     mysql: {
 *         host: sourceCsql.ipAddresses.apply(ipAddresses => ipAddresses[0].ipAddress),
 *         port: 3306,
 *         username: sourceSqldbUser.name,
 *         password: sourceSqldbUser.password,
 *         ssl: {
 *             clientKey: sourceSqlClientCert.privateKey,
 *             clientCertificate: sourceSqlClientCert.cert,
 *             caCertificate: sourceSqlClientCert.serverCaCert,
 *             type: "SERVER_CLIENT",
 *         },
 *         cloudSqlId: "source-csql",
 *     },
 * }, {
 *     dependsOn: [sourceSqldbUser],
 * });
 * const destinationCsql = new gcp.sql.DatabaseInstance("destination_csql", {
 *     name: "destination-csql",
 *     databaseVersion: "MYSQL_5_7",
 *     settings: {
 *         tier: "db-n1-standard-1",
 *         deletionProtectionEnabled: false,
 *     },
 *     deletionProtection: false,
 * });
 * const destinationCp = new gcp.databasemigrationservice.ConnectionProfile("destination_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "destination-cp",
 *     displayName: "destination-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     mysql: {
 *         cloudSqlId: "destination-csql",
 *     },
 * }, {
 *     dependsOn: [destinationCsql],
 * });
 * const _default = new gcp.compute.Network("default", {name: "destination-csql"});
 * const mysqltomysql = new gcp.databasemigrationservice.MigrationJob("mysqltomysql", {
 *     location: "us-central1",
 *     migrationJobId: "my-migrationid",
 *     displayName: "my-migrationid_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     performanceConfig: {
 *         dumpParallelLevel: "MAX",
 *     },
 *     vpcPeeringConnectivity: {
 *         vpc: _default.id,
 *     },
 *     dumpType: "LOGICAL",
 *     dumpFlags: {
 *         dumpFlags: [{
 *             name: "max-allowed-packet",
 *             value: "1073741824",
 *         }],
 *     },
 *     source: sourceCp.name,
 *     destination: destinationCp.name,
 *     type: "CONTINUOUS",
 * });
 * ```
 * ### Database Migration Service Migration Job Postgres To Postgres
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const sourceCsql = new gcp.sql.DatabaseInstance("source_csql", {
 *     name: "source-csql",
 *     databaseVersion: "POSTGRES_15",
 *     settings: {
 *         tier: "db-custom-2-13312",
 *         deletionProtectionEnabled: false,
 *     },
 *     deletionProtection: false,
 * });
 * const sourceSqlClientCert = new gcp.sql.SslCert("source_sql_client_cert", {
 *     commonName: "cert",
 *     instance: sourceCsql.name,
 * }, {
 *     dependsOn: [sourceCsql],
 * });
 * const sourceSqldbUser = new gcp.sql.User("source_sqldb_user", {
 *     name: "username",
 *     instance: sourceCsql.name,
 *     password: "password",
 * }, {
 *     dependsOn: [sourceSqlClientCert],
 * });
 * const sourceCp = new gcp.databasemigrationservice.ConnectionProfile("source_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "source-cp",
 *     displayName: "source-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     postgresql: {
 *         host: sourceCsql.ipAddresses.apply(ipAddresses => ipAddresses[0].ipAddress),
 *         port: 3306,
 *         username: sourceSqldbUser.name,
 *         password: sourceSqldbUser.password,
 *         ssl: {
 *             clientKey: sourceSqlClientCert.privateKey,
 *             clientCertificate: sourceSqlClientCert.cert,
 *             caCertificate: sourceSqlClientCert.serverCaCert,
 *             type: "SERVER_CLIENT",
 *         },
 *         cloudSqlId: "source-csql",
 *     },
 * }, {
 *     dependsOn: [sourceSqldbUser],
 * });
 * const destinationCsql = new gcp.sql.DatabaseInstance("destination_csql", {
 *     name: "destination-csql",
 *     databaseVersion: "POSTGRES_15",
 *     settings: {
 *         tier: "db-custom-2-13312",
 *         deletionProtectionEnabled: false,
 *     },
 *     deletionProtection: false,
 * });
 * const destinationCp = new gcp.databasemigrationservice.ConnectionProfile("destination_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "destination-cp",
 *     displayName: "destination-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     postgresql: {
 *         cloudSqlId: "destination-csql",
 *     },
 * }, {
 *     dependsOn: [destinationCsql],
 * });
 * const psqltopsql = new gcp.databasemigrationservice.MigrationJob("psqltopsql", {
 *     location: "us-central1",
 *     migrationJobId: "my-migrationid",
 *     displayName: "my-migrationid_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     staticIpConnectivity: {},
 *     source: sourceCp.name,
 *     destination: destinationCp.name,
 *     type: "CONTINUOUS",
 * });
 * ```
 * ### Database Migration Service Migration Job Postgres To Alloydb
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const sourceCsql = new gcp.sql.DatabaseInstance("source_csql", {
 *     name: "source-csql",
 *     databaseVersion: "POSTGRES_15",
 *     settings: {
 *         tier: "db-custom-2-13312",
 *         deletionProtectionEnabled: false,
 *     },
 *     deletionProtection: false,
 * });
 * const sourceSqlClientCert = new gcp.sql.SslCert("source_sql_client_cert", {
 *     commonName: "cert",
 *     instance: sourceCsql.name,
 * }, {
 *     dependsOn: [sourceCsql],
 * });
 * const sourceSqldbUser = new gcp.sql.User("source_sqldb_user", {
 *     name: "username",
 *     instance: sourceCsql.name,
 *     password: "password",
 * }, {
 *     dependsOn: [sourceSqlClientCert],
 * });
 * const sourceCp = new gcp.databasemigrationservice.ConnectionProfile("source_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "source-cp",
 *     displayName: "source-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     postgresql: {
 *         host: sourceCsql.ipAddresses.apply(ipAddresses => ipAddresses[0].ipAddress),
 *         port: 3306,
 *         username: sourceSqldbUser.name,
 *         password: sourceSqldbUser.password,
 *         ssl: {
 *             clientKey: sourceSqlClientCert.privateKey,
 *             clientCertificate: sourceSqlClientCert.cert,
 *             caCertificate: sourceSqlClientCert.serverCaCert,
 *             type: "SERVER_CLIENT",
 *         },
 *         cloudSqlId: "source-csql",
 *     },
 * }, {
 *     dependsOn: [sourceSqldbUser],
 * });
 * const _default = new gcp.compute.Network("default", {name: "destination-alloydb"});
 * const destinationAlloydb = new gcp.alloydb.Cluster("destination_alloydb", {
 *     clusterId: "destination-alloydb",
 *     location: "us-central1",
 *     networkConfig: {
 *         network: _default.id,
 *     },
 *     databaseVersion: "POSTGRES_15",
 *     initialUser: {
 *         user: "destination-alloydb",
 *         password: "destination-alloydb",
 *     },
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("private_ip_alloc", {
 *     name: "destination-alloydb",
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: _default.id,
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpc_connection", {
 *     network: _default.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const destinationAlloydbPrimary = new gcp.alloydb.Instance("destination_alloydb_primary", {
 *     cluster: destinationAlloydb.name,
 *     instanceId: "destination-alloydb-primary",
 *     instanceType: "PRIMARY",
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const destinationCp = new gcp.databasemigrationservice.ConnectionProfile("destination_cp", {
 *     location: "us-central1",
 *     connectionProfileId: "destination-cp",
 *     displayName: "destination-cp_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     postgresql: {
 *         alloydbClusterId: "destination-alloydb",
 *     },
 * }, {
 *     dependsOn: [
 *         destinationAlloydb,
 *         destinationAlloydbPrimary,
 *     ],
 * });
 * const psqltoalloydb = new gcp.databasemigrationservice.MigrationJob("psqltoalloydb", {
 *     location: "us-central1",
 *     migrationJobId: "my-migrationid",
 *     displayName: "my-migrationid_display",
 *     labels: {
 *         foo: "bar",
 *     },
 *     staticIpConnectivity: {},
 *     source: sourceCp.name,
 *     destination: destinationCp.name,
 *     type: "CONTINUOUS",
 * });
 * ```
 *
 * ## Import
 *
 * MigrationJob can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/migrationJobs/{{migration_job_id}}`
 *
 * * `{{project}}/{{location}}/{{migration_job_id}}`
 *
 * * `{{location}}/{{migration_job_id}}`
 *
 * When using the `pulumi import` command, MigrationJob can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:databasemigrationservice/migrationJob:MigrationJob default projects/{{project}}/locations/{{location}}/migrationJobs/{{migration_job_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:databasemigrationservice/migrationJob:MigrationJob default {{project}}/{{location}}/{{migration_job_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:databasemigrationservice/migrationJob:MigrationJob default {{location}}/{{migration_job_id}}
 * ```
 */
export class MigrationJob extends pulumi.CustomResource {
    /**
     * Get an existing MigrationJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MigrationJobState, opts?: pulumi.CustomResourceOptions): MigrationJob {
        return new MigrationJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:databasemigrationservice/migrationJob:MigrationJob';

    /**
     * Returns true if the given object is an instance of MigrationJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MigrationJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MigrationJob.__pulumiType;
    }

    /**
     * Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC 'Zulu' format, accurate to nanoseconds. Example: '2014-10-02T15:01:23.045123456Z'.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The name of the destination connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{destinationConnectionProfile}.
     */
    public readonly destination!: pulumi.Output<string>;
    /**
     * The migration job display name.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The initial dump flags.
     * Structure is documented below.
     */
    public readonly dumpFlags!: pulumi.Output<outputs.databasemigrationservice.MigrationJobDumpFlags | undefined>;
    /**
     * The path to the dump file in Google Cloud Storage,
     * in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * This field and the "dumpFlags" field are mutually exclusive.
     */
    public readonly dumpPath!: pulumi.Output<string | undefined>;
    /**
     * The type of the data dump. Supported for MySQL to CloudSQL for MySQL
     * migrations only.
     * Possible values are: `LOGICAL`, `PHYSICAL`.
     */
    public readonly dumpType!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Output only. The error details in case of state FAILED.
     * Structure is documented below.
     */
    public /*out*/ readonly errors!: pulumi.Output<outputs.databasemigrationservice.MigrationJobError[]>;
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the migration job should reside.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * The ID of the migration job.
     */
    public readonly migrationJobId!: pulumi.Output<string>;
    /**
     * The name of this migration job resource in the form of projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Data dump parallelism settings used by the migration.
     * Structure is documented below.
     */
    public readonly performanceConfig!: pulumi.Output<outputs.databasemigrationservice.MigrationJobPerformanceConfig | undefined>;
    /**
     * The current migration job phase.
     */
    public /*out*/ readonly phase!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    public readonly reverseSshConnectivity!: pulumi.Output<outputs.databasemigrationservice.MigrationJobReverseSshConnectivity | undefined>;
    /**
     * The name of the source connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{sourceConnectionProfile}.
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * The current migration job state.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * If set to an empty object (`{}`), the source database will allow incoming
     * connections from the public IP of the destination database.
     * You can retrieve the public IP of the Cloud SQL instance from the
     * Cloud SQL console or using Cloud SQL APIs.
     */
    public readonly staticIpConnectivity!: pulumi.Output<outputs.databasemigrationservice.MigrationJobStaticIpConnectivity | undefined>;
    /**
     * The type of the migration job.
     * Possible values are: `ONE_TIME`, `CONTINUOUS`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    public readonly vpcPeeringConnectivity!: pulumi.Output<outputs.databasemigrationservice.MigrationJobVpcPeeringConnectivity | undefined>;

    /**
     * Create a MigrationJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MigrationJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MigrationJobArgs | MigrationJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MigrationJobState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["destination"] = state ? state.destination : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["dumpFlags"] = state ? state.dumpFlags : undefined;
            resourceInputs["dumpPath"] = state ? state.dumpPath : undefined;
            resourceInputs["dumpType"] = state ? state.dumpType : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["errors"] = state ? state.errors : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["migrationJobId"] = state ? state.migrationJobId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["performanceConfig"] = state ? state.performanceConfig : undefined;
            resourceInputs["phase"] = state ? state.phase : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["reverseSshConnectivity"] = state ? state.reverseSshConnectivity : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["staticIpConnectivity"] = state ? state.staticIpConnectivity : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vpcPeeringConnectivity"] = state ? state.vpcPeeringConnectivity : undefined;
        } else {
            const args = argsOrState as MigrationJobArgs | undefined;
            if ((!args || args.destination === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destination'");
            }
            if ((!args || args.migrationJobId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'migrationJobId'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["destination"] = args ? args.destination : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["dumpFlags"] = args ? args.dumpFlags : undefined;
            resourceInputs["dumpPath"] = args ? args.dumpPath : undefined;
            resourceInputs["dumpType"] = args ? args.dumpType : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["migrationJobId"] = args ? args.migrationJobId : undefined;
            resourceInputs["performanceConfig"] = args ? args.performanceConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["reverseSshConnectivity"] = args ? args.reverseSshConnectivity : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["staticIpConnectivity"] = args ? args.staticIpConnectivity : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vpcPeeringConnectivity"] = args ? args.vpcPeeringConnectivity : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["errors"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["phase"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(MigrationJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MigrationJob resources.
 */
export interface MigrationJobState {
    /**
     * Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC 'Zulu' format, accurate to nanoseconds. Example: '2014-10-02T15:01:23.045123456Z'.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The name of the destination connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{destinationConnectionProfile}.
     */
    destination?: pulumi.Input<string>;
    /**
     * The migration job display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The initial dump flags.
     * Structure is documented below.
     */
    dumpFlags?: pulumi.Input<inputs.databasemigrationservice.MigrationJobDumpFlags>;
    /**
     * The path to the dump file in Google Cloud Storage,
     * in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * This field and the "dumpFlags" field are mutually exclusive.
     */
    dumpPath?: pulumi.Input<string>;
    /**
     * The type of the data dump. Supported for MySQL to CloudSQL for MySQL
     * migrations only.
     * Possible values are: `LOGICAL`, `PHYSICAL`.
     */
    dumpType?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Output only. The error details in case of state FAILED.
     * Structure is documented below.
     */
    errors?: pulumi.Input<pulumi.Input<inputs.databasemigrationservice.MigrationJobError>[]>;
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the migration job should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the migration job.
     */
    migrationJobId?: pulumi.Input<string>;
    /**
     * The name of this migration job resource in the form of projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     */
    name?: pulumi.Input<string>;
    /**
     * Data dump parallelism settings used by the migration.
     * Structure is documented below.
     */
    performanceConfig?: pulumi.Input<inputs.databasemigrationservice.MigrationJobPerformanceConfig>;
    /**
     * The current migration job phase.
     */
    phase?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    reverseSshConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobReverseSshConnectivity>;
    /**
     * The name of the source connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{sourceConnectionProfile}.
     */
    source?: pulumi.Input<string>;
    /**
     * The current migration job state.
     */
    state?: pulumi.Input<string>;
    /**
     * If set to an empty object (`{}`), the source database will allow incoming
     * connections from the public IP of the destination database.
     * You can retrieve the public IP of the Cloud SQL instance from the
     * Cloud SQL console or using Cloud SQL APIs.
     */
    staticIpConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobStaticIpConnectivity>;
    /**
     * The type of the migration job.
     * Possible values are: `ONE_TIME`, `CONTINUOUS`.
     */
    type?: pulumi.Input<string>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    vpcPeeringConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobVpcPeeringConnectivity>;
}

/**
 * The set of arguments for constructing a MigrationJob resource.
 */
export interface MigrationJobArgs {
    /**
     * The name of the destination connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{destinationConnectionProfile}.
     */
    destination: pulumi.Input<string>;
    /**
     * The migration job display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The initial dump flags.
     * Structure is documented below.
     */
    dumpFlags?: pulumi.Input<inputs.databasemigrationservice.MigrationJobDumpFlags>;
    /**
     * The path to the dump file in Google Cloud Storage,
     * in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * This field and the "dumpFlags" field are mutually exclusive.
     */
    dumpPath?: pulumi.Input<string>;
    /**
     * The type of the data dump. Supported for MySQL to CloudSQL for MySQL
     * migrations only.
     * Possible values are: `LOGICAL`, `PHYSICAL`.
     */
    dumpType?: pulumi.Input<string>;
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the migration job should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the migration job.
     */
    migrationJobId: pulumi.Input<string>;
    /**
     * Data dump parallelism settings used by the migration.
     * Structure is documented below.
     */
    performanceConfig?: pulumi.Input<inputs.databasemigrationservice.MigrationJobPerformanceConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    reverseSshConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobReverseSshConnectivity>;
    /**
     * The name of the source connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{sourceConnectionProfile}.
     */
    source: pulumi.Input<string>;
    /**
     * If set to an empty object (`{}`), the source database will allow incoming
     * connections from the public IP of the destination database.
     * You can retrieve the public IP of the Cloud SQL instance from the
     * Cloud SQL console or using Cloud SQL APIs.
     */
    staticIpConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobStaticIpConnectivity>;
    /**
     * The type of the migration job.
     * Possible values are: `ONE_TIME`, `CONTINUOUS`.
     */
    type: pulumi.Input<string>;
    /**
     * The details of the VPC network that the source database is located in.
     * Structure is documented below.
     */
    vpcPeeringConnectivity?: pulumi.Input<inputs.databasemigrationservice.MigrationJobVpcPeeringConnectivity>;
}
