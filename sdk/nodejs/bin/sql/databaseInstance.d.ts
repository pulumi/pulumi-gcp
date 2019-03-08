import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new Google SQL Database Instance. For more information, see the [official documentation](https://cloud.google.com/sql/),
 * or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/instances).
 *
 * > **NOTE on `google_sql_database_instance`:** - Second-generation instances include a
 * default 'root'@'%' user with no password. This user will be deleted by Terraform on
 * instance creation. You should use `google_sql_user` to define a custom user with
 * a restricted host and strong password.
 *
 * ## Example Usage
 *
 * ### SQL First Generation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const master = new gcp.sql.DatabaseInstance("master", {
 *     databaseVersion: "MYSQL_5_6",
 *     // First-generation instance regions are not the conventional
 *     // Google Compute Engine regions. See argument reference below.
 *     region: "us-central",
 *     settings: {
 *         tier: "D0",
 *     },
 * });
 * ```
 *
 * ### SQL Second generation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const master = new gcp.sql.DatabaseInstance("master", {
 *     databaseVersion: "POSTGRES_9_6",
 *     region: "us-central1",
 *     settings: {
 *         // Second-generation instance tiers are based on the machine
 *         // type. See argument reference below.
 *         tier: "db-f1-micro",
 *     },
 * });
 * ```
 *
 * ### Private IP Instance
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const privateNetwork = new gcp.compute.Network("private_network", {});
 * const privateIpAddress = new gcp.compute.GlobalAddress("private_ip_address", {
 *     addressType: "INTERNAL",
 *     network: privateNetwork.selfLink,
 *     prefixLength: 16,
 *     purpose: "VPC_PEERING",
 * });
 * const privateVpcConnection = new gcp.servicenetworking.Connection("private_vpc_connection", {
 *     network: privateNetwork.selfLink,
 *     reservedPeeringRanges: [privateIpAddress.name],
 *     service: "servicenetworking.googleapis.com",
 * });
 * const instance = new gcp.sql.DatabaseInstance("instance", {
 *     region: "us-central1",
 *     settings: {
 *         ipConfiguration: {
 *             ipv4Enabled: false,
 *             privateNetwork: privateNetwork.selfLink,
 *         },
 *         tier: "db-f1-micro",
 *     },
 * }, {dependsOn: [privateVpcConnection]});
 * ```
 */
export declare class DatabaseInstance extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseInstanceState, opts?: pulumi.CustomResourceOptions): DatabaseInstance;
    /**
     * The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     */
    readonly connectionName: pulumi.Output<string>;
    /**
     * The MySQL version to
     * use. Can be `MYSQL_5_6`, `MYSQL_5_7` or `POSTGRES_9_6` for second-generation
     * instances, or `MYSQL_5_5` or `MYSQL_5_6` for first-generation instances.
     * See [Second Generation Capabilities](https://cloud.google.com/sql/docs/1st-2nd-gen-differences)
     * for more information.
     */
    readonly databaseVersion: pulumi.Output<string | undefined>;
    /**
     * The first IPv4 address of any type assigned. This is to
     * support accessing the [first address in the list in a terraform output](https://github.com/terraform-providers/terraform-provider-google/issues/912)
     * when the resource is configured with a `count`.
     */
    readonly firstIpAddress: pulumi.Output<string>;
    readonly ipAddresses: pulumi.Output<{
        ipAddress: string;
        timeToRetire: string;
        type: string;
    }[]>;
    /**
     * The name of the instance that will act as
     * the master in the replication setup. Note, this requires the master to have
     * `binary_log_enabled` set, as well as existing backups.
     */
    readonly masterInstanceName: pulumi.Output<string>;
    /**
     * The name of the instance. If the name is left
     * blank, Terraform will randomly generate one when the instance is first
     * created. This is done because after a name is used, it cannot be reused for
     * up to [one week](https://cloud.google.com/sql/docs/delete-instance).
     */
    readonly name: pulumi.Output<string>;
    /**
     * The first private (`PRIVATE`) IPv4 address assigned. This is
     * a workaround for an [issue fixed in Terraform 0.12](https://github.com/hashicorp/terraform/issues/17048)
     * but also provides a convenient way to access an IP of a specific type without
     * performing filtering in a Terraform config.
     */
    readonly privateIpAddress: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The first public (`PRIMARY`) IPv4 address assigned. This is
     * a workaround for an [issue fixed in Terraform 0.12](https://github.com/hashicorp/terraform/issues/17048)
     * but also provides a convenient way to access an IP of a specific type without
     * performing filtering in a Terraform config.
     */
    readonly publicIpAddress: pulumi.Output<string>;
    /**
     * The region the instance will sit in. Note, first-generation Cloud SQL instance
     * regions do not line up with the Google Compute Engine (GCE) regions, and Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for all first-generation
     * instances *and* for second-generation instances if the provider region is not supported with Cloud SQL.
     * If you choose not to provide the `region` argument for this resource, make sure you understand this.
     */
    readonly region: pulumi.Output<string>;
    /**
     * The configuration for replication. The
     * configuration is detailed below.
     */
    readonly replicaConfiguration: pulumi.Output<{
        caCertificate?: string;
        clientCertificate?: string;
        clientKey?: string;
        connectRetryInterval?: number;
        dumpFilePath?: string;
        failoverTarget?: boolean;
        masterHeartbeatPeriod?: number;
        password?: string;
        sslCipher?: string;
        username?: string;
        verifyServerCertificate?: boolean;
    }>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly serverCaCert: pulumi.Output<{
        cert: string;
        commonName: string;
        createTime: string;
        expirationTime: string;
        sha1Fingerprint: string;
    }>;
    /**
     * The service account email address assigned to the
     * instance. This property is applicable only to Second Generation instances.
     */
    readonly serviceAccountEmailAddress: pulumi.Output<string>;
    /**
     * The settings to use for the database. The
     * configuration is detailed below.
     */
    readonly settings: pulumi.Output<{
        activationPolicy: string;
        authorizedGaeApplications?: string[];
        availabilityType: string;
        backupConfiguration: {
            binaryLogEnabled?: boolean;
            enabled?: boolean;
            startTime: string;
        };
        crashSafeReplication: boolean;
        databaseFlags?: {
            name?: string;
            value?: string;
        }[];
        diskAutoresize?: boolean;
        diskSize: number;
        diskType: string;
        ipConfiguration: {
            authorizedNetworks?: {
                expirationTime?: string;
                name?: string;
                value?: string;
            }[];
            ipv4Enabled: boolean;
            privateNetwork?: string;
            requireSsl?: boolean;
        };
        locationPreference: {
            followGaeApplication?: string;
            zone?: string;
        };
        maintenanceWindow?: {
            day?: number;
            hour?: number;
            updateTrack?: string;
        };
        pricingPlan?: string;
        replicationType?: string;
        tier: string;
        userLabels?: {
            [key: string]: string;
        };
        version: number;
    }>;
    /**
     * Create a DatabaseInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseInstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering DatabaseInstance resources.
 */
export interface DatabaseInstanceState {
    /**
     * The connection name of the instance to be used in
     * connection strings. For example, when connecting with [Cloud SQL Proxy](https://cloud.google.com/sql/docs/mysql/connect-admin-proxy).
     */
    readonly connectionName?: pulumi.Input<string>;
    /**
     * The MySQL version to
     * use. Can be `MYSQL_5_6`, `MYSQL_5_7` or `POSTGRES_9_6` for second-generation
     * instances, or `MYSQL_5_5` or `MYSQL_5_6` for first-generation instances.
     * See [Second Generation Capabilities](https://cloud.google.com/sql/docs/1st-2nd-gen-differences)
     * for more information.
     */
    readonly databaseVersion?: pulumi.Input<string>;
    /**
     * The first IPv4 address of any type assigned. This is to
     * support accessing the [first address in the list in a terraform output](https://github.com/terraform-providers/terraform-provider-google/issues/912)
     * when the resource is configured with a `count`.
     */
    readonly firstIpAddress?: pulumi.Input<string>;
    readonly ipAddresses?: pulumi.Input<pulumi.Input<{
        ipAddress?: pulumi.Input<string>;
        timeToRetire?: pulumi.Input<string>;
        type?: pulumi.Input<string>;
    }>[]>;
    /**
     * The name of the instance that will act as
     * the master in the replication setup. Note, this requires the master to have
     * `binary_log_enabled` set, as well as existing backups.
     */
    readonly masterInstanceName?: pulumi.Input<string>;
    /**
     * The name of the instance. If the name is left
     * blank, Terraform will randomly generate one when the instance is first
     * created. This is done because after a name is used, it cannot be reused for
     * up to [one week](https://cloud.google.com/sql/docs/delete-instance).
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The first private (`PRIVATE`) IPv4 address assigned. This is
     * a workaround for an [issue fixed in Terraform 0.12](https://github.com/hashicorp/terraform/issues/17048)
     * but also provides a convenient way to access an IP of a specific type without
     * performing filtering in a Terraform config.
     */
    readonly privateIpAddress?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The first public (`PRIMARY`) IPv4 address assigned. This is
     * a workaround for an [issue fixed in Terraform 0.12](https://github.com/hashicorp/terraform/issues/17048)
     * but also provides a convenient way to access an IP of a specific type without
     * performing filtering in a Terraform config.
     */
    readonly publicIpAddress?: pulumi.Input<string>;
    /**
     * The region the instance will sit in. Note, first-generation Cloud SQL instance
     * regions do not line up with the Google Compute Engine (GCE) regions, and Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for all first-generation
     * instances *and* for second-generation instances if the provider region is not supported with Cloud SQL.
     * If you choose not to provide the `region` argument for this resource, make sure you understand this.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The configuration for replication. The
     * configuration is detailed below.
     */
    readonly replicaConfiguration?: pulumi.Input<{
        caCertificate?: pulumi.Input<string>;
        clientCertificate?: pulumi.Input<string>;
        clientKey?: pulumi.Input<string>;
        connectRetryInterval?: pulumi.Input<number>;
        dumpFilePath?: pulumi.Input<string>;
        failoverTarget?: pulumi.Input<boolean>;
        masterHeartbeatPeriod?: pulumi.Input<number>;
        password?: pulumi.Input<string>;
        sslCipher?: pulumi.Input<string>;
        username?: pulumi.Input<string>;
        verifyServerCertificate?: pulumi.Input<boolean>;
    }>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly serverCaCert?: pulumi.Input<{
        cert?: pulumi.Input<string>;
        commonName?: pulumi.Input<string>;
        createTime?: pulumi.Input<string>;
        expirationTime?: pulumi.Input<string>;
        sha1Fingerprint?: pulumi.Input<string>;
    }>;
    /**
     * The service account email address assigned to the
     * instance. This property is applicable only to Second Generation instances.
     */
    readonly serviceAccountEmailAddress?: pulumi.Input<string>;
    /**
     * The settings to use for the database. The
     * configuration is detailed below.
     */
    readonly settings?: pulumi.Input<{
        activationPolicy?: pulumi.Input<string>;
        authorizedGaeApplications?: pulumi.Input<pulumi.Input<string>[]>;
        availabilityType?: pulumi.Input<string>;
        backupConfiguration?: pulumi.Input<{
            binaryLogEnabled?: pulumi.Input<boolean>;
            enabled?: pulumi.Input<boolean>;
            startTime?: pulumi.Input<string>;
        }>;
        crashSafeReplication?: pulumi.Input<boolean>;
        databaseFlags?: pulumi.Input<pulumi.Input<{
            name?: pulumi.Input<string>;
            value?: pulumi.Input<string>;
        }>[]>;
        diskAutoresize?: pulumi.Input<boolean>;
        diskSize?: pulumi.Input<number>;
        diskType?: pulumi.Input<string>;
        ipConfiguration?: pulumi.Input<{
            authorizedNetworks?: pulumi.Input<pulumi.Input<{
                expirationTime?: pulumi.Input<string>;
                name?: pulumi.Input<string>;
                value?: pulumi.Input<string>;
            }>[]>;
            ipv4Enabled?: pulumi.Input<boolean>;
            privateNetwork?: pulumi.Input<string>;
            requireSsl?: pulumi.Input<boolean>;
        }>;
        locationPreference?: pulumi.Input<{
            followGaeApplication?: pulumi.Input<string>;
            zone?: pulumi.Input<string>;
        }>;
        maintenanceWindow?: pulumi.Input<{
            day?: pulumi.Input<number>;
            hour?: pulumi.Input<number>;
            updateTrack?: pulumi.Input<string>;
        }>;
        pricingPlan?: pulumi.Input<string>;
        replicationType?: pulumi.Input<string>;
        tier: pulumi.Input<string>;
        userLabels?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        version?: pulumi.Input<number>;
    }>;
}
/**
 * The set of arguments for constructing a DatabaseInstance resource.
 */
export interface DatabaseInstanceArgs {
    /**
     * The MySQL version to
     * use. Can be `MYSQL_5_6`, `MYSQL_5_7` or `POSTGRES_9_6` for second-generation
     * instances, or `MYSQL_5_5` or `MYSQL_5_6` for first-generation instances.
     * See [Second Generation Capabilities](https://cloud.google.com/sql/docs/1st-2nd-gen-differences)
     * for more information.
     */
    readonly databaseVersion?: pulumi.Input<string>;
    /**
     * The name of the instance that will act as
     * the master in the replication setup. Note, this requires the master to have
     * `binary_log_enabled` set, as well as existing backups.
     */
    readonly masterInstanceName?: pulumi.Input<string>;
    /**
     * The name of the instance. If the name is left
     * blank, Terraform will randomly generate one when the instance is first
     * created. This is done because after a name is used, it cannot be reused for
     * up to [one week](https://cloud.google.com/sql/docs/delete-instance).
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region the instance will sit in. Note, first-generation Cloud SQL instance
     * regions do not line up with the Google Compute Engine (GCE) regions, and Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for all first-generation
     * instances *and* for second-generation instances if the provider region is not supported with Cloud SQL.
     * If you choose not to provide the `region` argument for this resource, make sure you understand this.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The configuration for replication. The
     * configuration is detailed below.
     */
    readonly replicaConfiguration?: pulumi.Input<{
        caCertificate?: pulumi.Input<string>;
        clientCertificate?: pulumi.Input<string>;
        clientKey?: pulumi.Input<string>;
        connectRetryInterval?: pulumi.Input<number>;
        dumpFilePath?: pulumi.Input<string>;
        failoverTarget?: pulumi.Input<boolean>;
        masterHeartbeatPeriod?: pulumi.Input<number>;
        password?: pulumi.Input<string>;
        sslCipher?: pulumi.Input<string>;
        username?: pulumi.Input<string>;
        verifyServerCertificate?: pulumi.Input<boolean>;
    }>;
    /**
     * The settings to use for the database. The
     * configuration is detailed below.
     */
    readonly settings: pulumi.Input<{
        activationPolicy?: pulumi.Input<string>;
        authorizedGaeApplications?: pulumi.Input<pulumi.Input<string>[]>;
        availabilityType?: pulumi.Input<string>;
        backupConfiguration?: pulumi.Input<{
            binaryLogEnabled?: pulumi.Input<boolean>;
            enabled?: pulumi.Input<boolean>;
            startTime?: pulumi.Input<string>;
        }>;
        crashSafeReplication?: pulumi.Input<boolean>;
        databaseFlags?: pulumi.Input<pulumi.Input<{
            name?: pulumi.Input<string>;
            value?: pulumi.Input<string>;
        }>[]>;
        diskAutoresize?: pulumi.Input<boolean>;
        diskSize?: pulumi.Input<number>;
        diskType?: pulumi.Input<string>;
        ipConfiguration?: pulumi.Input<{
            authorizedNetworks?: pulumi.Input<pulumi.Input<{
                expirationTime?: pulumi.Input<string>;
                name?: pulumi.Input<string>;
                value?: pulumi.Input<string>;
            }>[]>;
            ipv4Enabled?: pulumi.Input<boolean>;
            privateNetwork?: pulumi.Input<string>;
            requireSsl?: pulumi.Input<boolean>;
        }>;
        locationPreference?: pulumi.Input<{
            followGaeApplication?: pulumi.Input<string>;
            zone?: pulumi.Input<string>;
        }>;
        maintenanceWindow?: pulumi.Input<{
            day?: pulumi.Input<number>;
            hour?: pulumi.Input<number>;
            updateTrack?: pulumi.Input<string>;
        }>;
        pricingPlan?: pulumi.Input<string>;
        replicationType?: pulumi.Input<string>;
        tier: pulumi.Input<string>;
        userLabels?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        version?: pulumi.Input<number>;
    }>;
}
