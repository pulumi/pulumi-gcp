// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Alloydb Cluster Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const defaultNetwork = new gcp.compute.Network("defaultNetwork", {}, {
 *     provider: google_beta,
 * });
 * const defaultCluster = new gcp.alloydb.Cluster("defaultCluster", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     network: pulumi.all([project, defaultNetwork.name]).apply(([project, name]) => `projects/${project.number}/global/networks/${name}`),
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Alloydb Cluster Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const _default = new gcp.compute.Network("default", {}, {
 *     provider: google_beta,
 * });
 * const full = new gcp.alloydb.Cluster("full", {
 *     clusterId: "alloydb-cluster-full",
 *     location: "us-central1",
 *     network: pulumi.all([project, _default.name]).apply(([project, name]) => `projects/${project.number}/global/networks/${name}`),
 *     initialUser: {
 *         user: "alloydb-cluster-full",
 *         password: "alloydb-cluster-full",
 *     },
 *     automatedBackupPolicy: {
 *         location: "us-central1",
 *         backupWindow: "1800s",
 *         enabled: true,
 *         weeklySchedule: {
 *             daysOfWeeks: ["MONDAY"],
 *             startTimes: [{
 *                 hours: 23,
 *                 minutes: 0,
 *                 seconds: 0,
 *                 nanos: 0,
 *             }],
 *         },
 *         quantityBasedRetention: {
 *             count: 1,
 *         },
 *         labels: {
 *             test: "alloydb-cluster-full",
 *         },
 *     },
 *     labels: {
 *         test: "alloydb-cluster-full",
 *     },
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * Cluster can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default projects/{{project}}/locations/{{location}}/clusters/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{project}}/{{location}}/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{location}}/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{cluster_id}}
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:alloydb/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     */
    public readonly automatedBackupPolicy!: pulumi.Output<outputs.alloydb.ClusterAutomatedBackupPolicy | undefined>;
    /**
     * Cluster created from backup.
     */
    public /*out*/ readonly backupSources!: pulumi.Output<outputs.alloydb.ClusterBackupSource[]>;
    /**
     * The ID of the alloydb cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The database engine major version. This is an output-only field and it's populated at the Cluster creation time. This
     * field cannot be changed after cluster creation.
     */
    public /*out*/ readonly databaseVersion!: pulumi.Output<string>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    public readonly initialUser!: pulumi.Output<outputs.alloydb.ClusterInitialUser | undefined>;
    /**
     * Labels to apply to backups created using this configuration.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the backup will be stored. Currently, the only supported option is to store the backup in the same region as the cluster.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * Cluster created via DMS migration.
     */
    public /*out*/ readonly migrationSources!: pulumi.Output<outputs.alloydb.ClusterMigrationSource[]>;
    /**
     * The name of the cluster resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The system-generated UID of the resource.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["automatedBackupPolicy"] = state ? state.automatedBackupPolicy : undefined;
            resourceInputs["backupSources"] = state ? state.backupSources : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["databaseVersion"] = state ? state.databaseVersion : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["initialUser"] = state ? state.initialUser : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["migrationSources"] = state ? state.migrationSources : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            resourceInputs["automatedBackupPolicy"] = args ? args.automatedBackupPolicy : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["initialUser"] = args ? args.initialUser : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["backupSources"] = undefined /*out*/;
            resourceInputs["databaseVersion"] = undefined /*out*/;
            resourceInputs["migrationSources"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     */
    automatedBackupPolicy?: pulumi.Input<inputs.alloydb.ClusterAutomatedBackupPolicy>;
    /**
     * Cluster created from backup.
     */
    backupSources?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterBackupSource>[]>;
    /**
     * The ID of the alloydb cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The database engine major version. This is an output-only field and it's populated at the Cluster creation time. This
     * field cannot be changed after cluster creation.
     */
    databaseVersion?: pulumi.Input<string>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    initialUser?: pulumi.Input<inputs.alloydb.ClusterInitialUser>;
    /**
     * Labels to apply to backups created using this configuration.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the backup will be stored. Currently, the only supported option is to store the backup in the same region as the cluster.
     */
    location?: pulumi.Input<string>;
    /**
     * Cluster created via DMS migration.
     */
    migrationSources?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterMigrationSource>[]>;
    /**
     * The name of the cluster resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    network?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The system-generated UID of the resource.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     */
    automatedBackupPolicy?: pulumi.Input<inputs.alloydb.ClusterAutomatedBackupPolicy>;
    /**
     * The ID of the alloydb cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    initialUser?: pulumi.Input<inputs.alloydb.ClusterInitialUser>;
    /**
     * Labels to apply to backups created using this configuration.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the backup will be stored. Currently, the only supported option is to store the backup in the same region as the cluster.
     */
    location?: pulumi.Input<string>;
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     */
    network: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}