// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents a Backup Plan instance.
 *
 * To get more information about BackupPlan, see:
 *
 * * [API documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke/reference/rest/v1/projects.locations.backupPlans)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/kubernetes-engine/docs/add-on/backup-for-gke)
 *
 * ## Example Usage
 *
 * ### Gkebackup Backupplan Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "basic-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const basic = new gcp.gkebackup.BackupPlan("basic", {
 *     name: "basic-plan",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         allNamespaces: true,
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Autopilot
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "autopilot-cluster",
 *     location: "us-central1",
 *     enableAutopilot: true,
 *     ipAllocationPolicy: {},
 *     releaseChannel: {
 *         channel: "RAPID",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const autopilot = new gcp.gkebackup.BackupPlan("autopilot", {
 *     name: "autopilot-plan",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         allNamespaces: true,
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Cmek
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "cmek-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const keyRing = new gcp.kms.KeyRing("key_ring", {
 *     name: "backup-key",
 *     location: "us-central1",
 * });
 * const cryptoKey = new gcp.kms.CryptoKey("crypto_key", {
 *     name: "backup-key",
 *     keyRing: keyRing.id,
 * });
 * const cmek = new gcp.gkebackup.BackupPlan("cmek", {
 *     name: "cmek-plan",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         selectedNamespaces: {
 *             namespaces: [
 *                 "default",
 *                 "test",
 *             ],
 *         },
 *         encryptionKey: {
 *             gcpKmsEncryptionKey: cryptoKey.id,
 *         },
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "full-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const full = new gcp.gkebackup.BackupPlan("full", {
 *     name: "full-plan",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     retentionPolicy: {
 *         backupDeleteLockDays: 30,
 *         backupRetainDays: 180,
 *     },
 *     backupSchedule: {
 *         cronSchedule: "0 9 * * 1",
 *     },
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         selectedApplications: {
 *             namespacedNames: [
 *                 {
 *                     name: "app1",
 *                     namespace: "ns1",
 *                 },
 *                 {
 *                     name: "app2",
 *                     namespace: "ns2",
 *                 },
 *             ],
 *         },
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Permissive
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "permissive-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const permissive = new gcp.gkebackup.BackupPlan("permissive", {
 *     name: "permissive-plan",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     retentionPolicy: {
 *         backupDeleteLockDays: 30,
 *         backupRetainDays: 180,
 *     },
 *     backupSchedule: {
 *         cronSchedule: "0 9 * * 1",
 *     },
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         permissiveMode: true,
 *         selectedApplications: {
 *             namespacedNames: [
 *                 {
 *                     name: "app1",
 *                     namespace: "ns1",
 *                 },
 *                 {
 *                     name: "app2",
 *                     namespace: "ns2",
 *                 },
 *             ],
 *         },
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Rpo Daily Window
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "rpo-daily-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const rpoDailyWindow = new gcp.gkebackup.BackupPlan("rpo_daily_window", {
 *     name: "rpo-daily-window",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     retentionPolicy: {
 *         backupDeleteLockDays: 30,
 *         backupRetainDays: 180,
 *     },
 *     backupSchedule: {
 *         paused: true,
 *         rpoConfig: {
 *             targetRpoMinutes: 1440,
 *             exclusionWindows: [
 *                 {
 *                     startTime: {
 *                         hours: 12,
 *                     },
 *                     duration: "7200s",
 *                     daily: true,
 *                 },
 *                 {
 *                     startTime: {
 *                         hours: 8,
 *                         minutes: 40,
 *                         seconds: 1,
 *                         nanos: 100,
 *                     },
 *                     duration: "3600s",
 *                     singleOccurrenceDate: {
 *                         year: 2024,
 *                         month: 3,
 *                         day: 16,
 *                     },
 *                 },
 *             ],
 *         },
 *     },
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         allNamespaces: true,
 *     },
 * });
 * ```
 * ### Gkebackup Backupplan Rpo Weekly Window
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const primary = new gcp.container.Cluster("primary", {
 *     name: "rpo-weekly-cluster",
 *     location: "us-central1",
 *     initialNodeCount: 1,
 *     workloadIdentityConfig: {
 *         workloadPool: "my-project-name.svc.id.goog",
 *     },
 *     addonsConfig: {
 *         gkeBackupAgentConfig: {
 *             enabled: true,
 *         },
 *     },
 *     deletionProtection: true,
 *     network: "default",
 *     subnetwork: "default",
 * });
 * const rpoWeeklyWindow = new gcp.gkebackup.BackupPlan("rpo_weekly_window", {
 *     name: "rpo-weekly-window",
 *     cluster: primary.id,
 *     location: "us-central1",
 *     retentionPolicy: {
 *         backupDeleteLockDays: 30,
 *         backupRetainDays: 180,
 *     },
 *     backupSchedule: {
 *         paused: true,
 *         rpoConfig: {
 *             targetRpoMinutes: 1440,
 *             exclusionWindows: [
 *                 {
 *                     startTime: {
 *                         hours: 1,
 *                         minutes: 23,
 *                     },
 *                     duration: "1800s",
 *                     daysOfWeek: {
 *                         daysOfWeeks: [
 *                             "MONDAY",
 *                             "THURSDAY",
 *                         ],
 *                     },
 *                 },
 *                 {
 *                     startTime: {
 *                         hours: 12,
 *                     },
 *                     duration: "3600s",
 *                     singleOccurrenceDate: {
 *                         year: 2024,
 *                         month: 3,
 *                         day: 17,
 *                     },
 *                 },
 *                 {
 *                     startTime: {
 *                         hours: 8,
 *                         minutes: 40,
 *                     },
 *                     duration: "600s",
 *                     singleOccurrenceDate: {
 *                         year: 2024,
 *                         month: 3,
 *                         day: 18,
 *                     },
 *                 },
 *             ],
 *         },
 *     },
 *     backupConfig: {
 *         includeVolumeData: true,
 *         includeSecrets: true,
 *         allNamespaces: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * BackupPlan can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/backupPlans/{{name}}`
 *
 * * `{{project}}/{{location}}/{{name}}`
 *
 * * `{{location}}/{{name}}`
 *
 * When using the `pulumi import` command, BackupPlan can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupPlan:BackupPlan default projects/{{project}}/locations/{{location}}/backupPlans/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupPlan:BackupPlan default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:gkebackup/backupPlan:BackupPlan default {{location}}/{{name}}
 * ```
 */
export class BackupPlan extends pulumi.CustomResource {
    /**
     * Get an existing BackupPlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupPlanState, opts?: pulumi.CustomResourceOptions): BackupPlan {
        return new BackupPlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkebackup/backupPlan:BackupPlan';

    /**
     * Returns true if the given object is an instance of BackupPlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackupPlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackupPlan.__pulumiType;
    }

    /**
     * Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     */
    public readonly backupConfig!: pulumi.Output<outputs.gkebackup.BackupPlanBackupConfig | undefined>;
    /**
     * Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     */
    public readonly backupSchedule!: pulumi.Output<outputs.gkebackup.BackupPlanBackupSchedule | undefined>;
    /**
     * The source cluster from which Backups will be created via this BackupPlan.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * This flag indicates whether this BackupPlan has been deactivated.
     * Setting this field to True locks the BackupPlan such that no further updates will be allowed
     * (except deletes), including the deactivated field itself. It also prevents any new Backups
     * from being created via this BackupPlan (including scheduled Backups).
     */
    public readonly deactivated!: pulumi.Output<boolean>;
    /**
     * User specified descriptive string for this BackupPlan.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup plan from overwriting each other. It is strongly suggested that
     * systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan updates
     * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
     * and systems are expected to put that etag in the request to backupPlans.patch or
     * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The region of the Backup Plan.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The full name of the BackupPlan Resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
     */
    public /*out*/ readonly protectedPodCount!: pulumi.Output<number>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     */
    public readonly retentionPolicy!: pulumi.Output<outputs.gkebackup.BackupPlanRetentionPolicy | undefined>;
    /**
     * The State of the BackupPlan.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Detailed description of why BackupPlan is in its current state.
     */
    public /*out*/ readonly stateReason!: pulumi.Output<string>;
    /**
     * Server generated, unique identifier of UUID format.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a BackupPlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupPlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupPlanArgs | BackupPlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupPlanState | undefined;
            resourceInputs["backupConfig"] = state ? state.backupConfig : undefined;
            resourceInputs["backupSchedule"] = state ? state.backupSchedule : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["deactivated"] = state ? state.deactivated : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["protectedPodCount"] = state ? state.protectedPodCount : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["retentionPolicy"] = state ? state.retentionPolicy : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateReason"] = state ? state.stateReason : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as BackupPlanArgs | undefined;
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["backupConfig"] = args ? args.backupConfig : undefined;
            resourceInputs["backupSchedule"] = args ? args.backupSchedule : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["deactivated"] = args ? args.deactivated : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["retentionPolicy"] = args ? args.retentionPolicy : undefined;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["protectedPodCount"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["stateReason"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BackupPlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupPlan resources.
 */
export interface BackupPlanState {
    /**
     * Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     */
    backupConfig?: pulumi.Input<inputs.gkebackup.BackupPlanBackupConfig>;
    /**
     * Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     */
    backupSchedule?: pulumi.Input<inputs.gkebackup.BackupPlanBackupSchedule>;
    /**
     * The source cluster from which Backups will be created via this BackupPlan.
     */
    cluster?: pulumi.Input<string>;
    /**
     * This flag indicates whether this BackupPlan has been deactivated.
     * Setting this field to True locks the BackupPlan such that no further updates will be allowed
     * (except deletes), including the deactivated field itself. It also prevents any new Backups
     * from being created via this BackupPlan (including scheduled Backups).
     */
    deactivated?: pulumi.Input<boolean>;
    /**
     * User specified descriptive string for this BackupPlan.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup plan from overwriting each other. It is strongly suggested that
     * systems make use of the 'etag' in the read-modify-write cycle to perform BackupPlan updates
     * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
     * and systems are expected to put that etag in the request to backupPlans.patch or
     * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
     */
    etag?: pulumi.Input<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region of the Backup Plan.
     */
    location?: pulumi.Input<string>;
    /**
     * The full name of the BackupPlan Resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
     */
    protectedPodCount?: pulumi.Input<number>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     */
    retentionPolicy?: pulumi.Input<inputs.gkebackup.BackupPlanRetentionPolicy>;
    /**
     * The State of the BackupPlan.
     */
    state?: pulumi.Input<string>;
    /**
     * Detailed description of why BackupPlan is in its current state.
     */
    stateReason?: pulumi.Input<string>;
    /**
     * Server generated, unique identifier of UUID format.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupPlan resource.
 */
export interface BackupPlanArgs {
    /**
     * Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     */
    backupConfig?: pulumi.Input<inputs.gkebackup.BackupPlanBackupConfig>;
    /**
     * Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     */
    backupSchedule?: pulumi.Input<inputs.gkebackup.BackupPlanBackupSchedule>;
    /**
     * The source cluster from which Backups will be created via this BackupPlan.
     */
    cluster: pulumi.Input<string>;
    /**
     * This flag indicates whether this BackupPlan has been deactivated.
     * Setting this field to True locks the BackupPlan such that no further updates will be allowed
     * (except deletes), including the deactivated field itself. It also prevents any new Backups
     * from being created via this BackupPlan (including scheduled Backups).
     */
    deactivated?: pulumi.Input<boolean>;
    /**
     * User specified descriptive string for this BackupPlan.
     */
    description?: pulumi.Input<string>;
    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key->value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The region of the Backup Plan.
     */
    location: pulumi.Input<string>;
    /**
     * The full name of the BackupPlan Resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     */
    retentionPolicy?: pulumi.Input<inputs.gkebackup.BackupPlanRetentionPolicy>;
}
