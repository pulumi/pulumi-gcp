// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A backup vault is the location where backups are stored. You can only create one backup vault per region.
 * A vault can hold multiple backups for multiple volumes in that region.
 *
 * To get more information about backupVault, see:
 *
 * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.backupVaults)
 * * How-to Guides
 *     * [Documentation](https://cloud.google.com/netapp/volumes/docs/protect-data/about-volume-backups)
 *
 * ## Example Usage
 * ### Netapp Backup Vault
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const testBackupVault = new gcp.netapp.BackupVault("testBackupVault", {
 *     location: "us-central1",
 *     description: "Terraform created vault",
 *     labels: {
 *         creator: "testuser",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * backupVault can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/backupVaults/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import backupVault using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/backupVaults/{{name}}"
 *
 *  to = google_netapp_backup_vault.default }
 *
 * ```sh
 *  $ pulumi import gcp:netapp/backupVault:BackupVault When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), backupVault can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/backupVault:BackupVault default projects/{{project}}/locations/{{location}}/backupVaults/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/backupVault:BackupVault default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/backupVault:BackupVault default {{location}}/{{name}}
 * ```
 */
export class BackupVault extends pulumi.CustomResource {
    /**
     * Get an existing BackupVault resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackupVaultState, opts?: pulumi.CustomResourceOptions): BackupVault {
        return new BackupVault(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:netapp/backupVault:BackupVault';

    /**
     * Returns true if the given object is an instance of BackupVault.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackupVault {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackupVault.__pulumiType;
    }

    /**
     * Create time of the backup vault. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * An optional description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Location (region) of the backup vault.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the backup vault. Needs to be unique per location.
     *
     *
     * - - -
     */
    public readonly name!: pulumi.Output<string>;
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
     * The state of the Backup Vault.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a BackupVault resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackupVaultArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackupVaultArgs | BackupVaultState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackupVaultState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as BackupVaultArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(BackupVault.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackupVault resources.
 */
export interface BackupVaultState {
    /**
     * Create time of the backup vault. A timestamp in RFC3339 UTC "Zulu" format. Examples: "2023-06-22T09:13:01.617Z".
     */
    createTime?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Location (region) of the backup vault.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the backup vault. Needs to be unique per location.
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
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
     * The state of the Backup Vault.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackupVault resource.
 */
export interface BackupVaultArgs {
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Location (region) of the backup vault.
     */
    location: pulumi.Input<string>;
    /**
     * The resource name of the backup vault. Needs to be unique per location.
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}