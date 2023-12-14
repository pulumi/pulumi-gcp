// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Storage pools act as containers for volumes. All volumes in a storage pool share the following information:
 * * Location
 * * Service level
 * * Virtual Private Cloud (VPC) network
 * * Active Directory policy
 * * LDAP use for NFS volumes, if applicable
 * * Customer-managed encryption key (CMEK) policy
 *
 * The capacity of the pool can be split up and assigned to volumes within the pool. Storage pools are a billable component of NetApp Volumes. Billing is based on the location, service level, and capacity allocated to a pool independent of consumption at the volume level.
 *
 * To get more information about storagePool, see:
 *
 * * [API documentation](https://cloud.google.com/netapp/volumes/docs/reference/rest/v1/projects.locations.storagePools)
 * * How-to Guides
 *     * [QUICKSTART_TITLE](https://cloud.google.com/netapp/volumes/docs/get-started/quickstarts/create-storage-pool)
 *
 * ## Example Usage
 * ### Storage Pool Create
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const peeringNetwork = new gcp.compute.Network("peeringNetwork", {});
 * // Create an IP address
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     purpose: "VPC_PEERING",
 *     addressType: "INTERNAL",
 *     prefixLength: 16,
 *     network: peeringNetwork.id,
 * });
 * // Create a private connection
 * const _default = new gcp.servicenetworking.Connection("default", {
 *     network: peeringNetwork.id,
 *     service: "netapp.servicenetworking.goog",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const testPool = new gcp.netapp.StoragePool("testPool", {
 *     location: "us-central1",
 *     serviceLevel: "PREMIUM",
 *     capacityGib: "2048",
 *     network: peeringNetwork.id,
 * });
 * ```
 *
 * ## Import
 *
 * storagePool can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/storagePools/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import storagePool using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/storagePools/{{name}}"
 *
 *  to = google_netapp_storage_pool.default }
 *
 * ```sh
 *  $ pulumi import gcp:netapp/storagePool:StoragePool When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), storagePool can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/storagePool:StoragePool default projects/{{project}}/locations/{{location}}/storagePools/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/storagePool:StoragePool default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:netapp/storagePool:StoragePool default {{location}}/{{name}}
 * ```
 */
export class StoragePool extends pulumi.CustomResource {
    /**
     * Get an existing StoragePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StoragePoolState, opts?: pulumi.CustomResourceOptions): StoragePool {
        return new StoragePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:netapp/storagePool:StoragePool';

    /**
     * Returns true if the given object is an instance of StoragePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StoragePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StoragePool.__pulumiType;
    }

    /**
     * Specifies the Active Directory policy to be used. Format: `projects/{{project}}/locations/{{location}}/activeDirectories/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    public readonly activeDirectory!: pulumi.Output<string | undefined>;
    /**
     * Capacity of the storage pool (in GiB).
     */
    public readonly capacityGib!: pulumi.Output<string>;
    /**
     * An optional description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Reports if volumes in the pool are encrypted using a Google-managed encryption key or CMEK.
     */
    public /*out*/ readonly encryptionType!: pulumi.Output<string>;
    /**
     * Specifies the CMEK policy to be used for volume encryption. Format: `projects/{{project}}/locations/{{location}}/kmsConfigs/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    public readonly kmsConfig!: pulumi.Output<string | undefined>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * When enabled, the volumes uses Active Directory as LDAP name service for UID/GID lookups. Required to enable extended group support for NFSv3,
     * using security identifiers for NFSv4.1 or principal names for kerberized NFSv4.1.
     */
    public readonly ldapEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the location. Usually a region name, expect for some STANDARD service level pools which require a zone name.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the storage pool. Needs to be unique per location.
     *
     *
     * - - -
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * VPC network name with format: `projects/{{project}}/global/networks/{{network}}`
     */
    public readonly network!: pulumi.Output<string>;
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
     * Service level of the storage pool.
     * Possible values are: `PREMIUM`, `EXTREME`, `STANDARD`.
     */
    public readonly serviceLevel!: pulumi.Output<string>;
    /**
     * Size allocated to volumes in the storage pool (in GiB).
     */
    public /*out*/ readonly volumeCapacityGib!: pulumi.Output<string>;
    /**
     * Number of volume in the storage pool.
     */
    public /*out*/ readonly volumeCount!: pulumi.Output<number>;

    /**
     * Create a StoragePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StoragePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StoragePoolArgs | StoragePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StoragePoolState | undefined;
            resourceInputs["activeDirectory"] = state ? state.activeDirectory : undefined;
            resourceInputs["capacityGib"] = state ? state.capacityGib : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["encryptionType"] = state ? state.encryptionType : undefined;
            resourceInputs["kmsConfig"] = state ? state.kmsConfig : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["ldapEnabled"] = state ? state.ldapEnabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["serviceLevel"] = state ? state.serviceLevel : undefined;
            resourceInputs["volumeCapacityGib"] = state ? state.volumeCapacityGib : undefined;
            resourceInputs["volumeCount"] = state ? state.volumeCount : undefined;
        } else {
            const args = argsOrState as StoragePoolArgs | undefined;
            if ((!args || args.capacityGib === undefined) && !opts.urn) {
                throw new Error("Missing required property 'capacityGib'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.serviceLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceLevel'");
            }
            resourceInputs["activeDirectory"] = args ? args.activeDirectory : undefined;
            resourceInputs["capacityGib"] = args ? args.capacityGib : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kmsConfig"] = args ? args.kmsConfig : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["ldapEnabled"] = args ? args.ldapEnabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceLevel"] = args ? args.serviceLevel : undefined;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["encryptionType"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["volumeCapacityGib"] = undefined /*out*/;
            resourceInputs["volumeCount"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StoragePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StoragePool resources.
 */
export interface StoragePoolState {
    /**
     * Specifies the Active Directory policy to be used. Format: `projects/{{project}}/locations/{{location}}/activeDirectories/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    activeDirectory?: pulumi.Input<string>;
    /**
     * Capacity of the storage pool (in GiB).
     */
    capacityGib?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Reports if volumes in the pool are encrypted using a Google-managed encryption key or CMEK.
     */
    encryptionType?: pulumi.Input<string>;
    /**
     * Specifies the CMEK policy to be used for volume encryption. Format: `projects/{{project}}/locations/{{location}}/kmsConfigs/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    kmsConfig?: pulumi.Input<string>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * When enabled, the volumes uses Active Directory as LDAP name service for UID/GID lookups. Required to enable extended group support for NFSv3,
     * using security identifiers for NFSv4.1 or principal names for kerberized NFSv4.1.
     */
    ldapEnabled?: pulumi.Input<boolean>;
    /**
     * Name of the location. Usually a region name, expect for some STANDARD service level pools which require a zone name.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the storage pool. Needs to be unique per location.
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
    /**
     * VPC network name with format: `projects/{{project}}/global/networks/{{network}}`
     */
    network?: pulumi.Input<string>;
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
     * Service level of the storage pool.
     * Possible values are: `PREMIUM`, `EXTREME`, `STANDARD`.
     */
    serviceLevel?: pulumi.Input<string>;
    /**
     * Size allocated to volumes in the storage pool (in GiB).
     */
    volumeCapacityGib?: pulumi.Input<string>;
    /**
     * Number of volume in the storage pool.
     */
    volumeCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a StoragePool resource.
 */
export interface StoragePoolArgs {
    /**
     * Specifies the Active Directory policy to be used. Format: `projects/{{project}}/locations/{{location}}/activeDirectories/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    activeDirectory?: pulumi.Input<string>;
    /**
     * Capacity of the storage pool (in GiB).
     */
    capacityGib: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the CMEK policy to be used for volume encryption. Format: `projects/{{project}}/locations/{{location}}/kmsConfigs/{{name}}`.
     * The policy needs to be in the same location as the storage pool.
     */
    kmsConfig?: pulumi.Input<string>;
    /**
     * Labels as key value pairs. Example: `{ "owner": "Bob", "department": "finance", "purpose": "testing" }`.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * When enabled, the volumes uses Active Directory as LDAP name service for UID/GID lookups. Required to enable extended group support for NFSv3,
     * using security identifiers for NFSv4.1 or principal names for kerberized NFSv4.1.
     */
    ldapEnabled?: pulumi.Input<boolean>;
    /**
     * Name of the location. Usually a region name, expect for some STANDARD service level pools which require a zone name.
     */
    location: pulumi.Input<string>;
    /**
     * The resource name of the storage pool. Needs to be unique per location.
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
    /**
     * VPC network name with format: `projects/{{project}}/global/networks/{{network}}`
     */
    network: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Service level of the storage pool.
     * Possible values are: `PREMIUM`, `EXTREME`, `STANDARD`.
     */
    serviceLevel: pulumi.Input<string>;
}