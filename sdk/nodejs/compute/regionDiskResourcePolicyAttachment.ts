// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Adds existing resource policies to a disk. You can only add one policy
 * which will be applied to this disk for scheduling snapshot creation.
 *
 * > **Note:** This resource does not support zonal disks (`gcp.compute.Disk`). For zonal disks, please refer to the `gcp.compute.DiskResourcePolicyAttachment` resource.
 *
 * ## Example Usage
 *
 * ### Region Disk Resource Policy Attachment Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const disk = new gcp.compute.Disk("disk", {
 *     name: "my-base-disk",
 *     image: "debian-cloud/debian-11",
 *     size: 50,
 *     type: "pd-ssd",
 *     zone: "us-central1-a",
 * });
 * const snapdisk = new gcp.compute.Snapshot("snapdisk", {
 *     name: "my-snapshot",
 *     sourceDisk: disk.name,
 *     zone: "us-central1-a",
 * });
 * const ssd = new gcp.compute.RegionDisk("ssd", {
 *     name: "my-disk",
 *     replicaZones: [
 *         "us-central1-a",
 *         "us-central1-f",
 *     ],
 *     snapshot: snapdisk.id,
 *     size: 50,
 *     type: "pd-ssd",
 *     region: "us-central1",
 * });
 * const policy = new gcp.compute.ResourcePolicy("policy", {
 *     name: "my-resource-policy",
 *     region: "us-central1",
 *     snapshotSchedulePolicy: {
 *         schedule: {
 *             dailySchedule: {
 *                 daysInCycle: 1,
 *                 startTime: "04:00",
 *             },
 *         },
 *     },
 * });
 * const attachment = new gcp.compute.RegionDiskResourcePolicyAttachment("attachment", {
 *     name: policy.name,
 *     disk: ssd.name,
 *     region: "us-central1",
 * });
 * const myImage = gcp.compute.getImage({
 *     family: "debian-11",
 *     project: "debian-cloud",
 * });
 * ```
 *
 * ## Import
 *
 * RegionDiskResourcePolicyAttachment can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/regions/{{region}}/disks/{{disk}}/{{name}}`
 *
 * * `{{project}}/{{region}}/{{disk}}/{{name}}`
 *
 * * `{{region}}/{{disk}}/{{name}}`
 *
 * * `{{disk}}/{{name}}`
 *
 * When using the `pulumi import` command, RegionDiskResourcePolicyAttachment can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment default projects/{{project}}/regions/{{region}}/disks/{{disk}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment default {{project}}/{{region}}/{{disk}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment default {{region}}/{{disk}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment default {{disk}}/{{name}}
 * ```
 */
export class RegionDiskResourcePolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing RegionDiskResourcePolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionDiskResourcePolicyAttachmentState, opts?: pulumi.CustomResourceOptions): RegionDiskResourcePolicyAttachment {
        return new RegionDiskResourcePolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/regionDiskResourcePolicyAttachment:RegionDiskResourcePolicyAttachment';

    /**
     * Returns true if the given object is an instance of RegionDiskResourcePolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionDiskResourcePolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionDiskResourcePolicyAttachment.__pulumiType;
    }

    /**
     * The name of the regional disk in which the resource policies are attached to.
     */
    public readonly disk!: pulumi.Output<string>;
    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * A reference to the region where the disk resides.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a RegionDiskResourcePolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionDiskResourcePolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionDiskResourcePolicyAttachmentArgs | RegionDiskResourcePolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionDiskResourcePolicyAttachmentState | undefined;
            resourceInputs["disk"] = state ? state.disk : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as RegionDiskResourcePolicyAttachmentArgs | undefined;
            if ((!args || args.disk === undefined) && !opts.urn) {
                throw new Error("Missing required property 'disk'");
            }
            resourceInputs["disk"] = args ? args.disk : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionDiskResourcePolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionDiskResourcePolicyAttachment resources.
 */
export interface RegionDiskResourcePolicyAttachmentState {
    /**
     * The name of the regional disk in which the resource policies are attached to.
     */
    disk?: pulumi.Input<string>;
    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A reference to the region where the disk resides.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegionDiskResourcePolicyAttachment resource.
 */
export interface RegionDiskResourcePolicyAttachmentArgs {
    /**
     * The name of the regional disk in which the resource policies are attached to.
     */
    disk: pulumi.Input<string>;
    /**
     * The resource policy to be attached to the disk for scheduling snapshot
     * creation. Do not specify the self link.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A reference to the region where the disk resides.
     */
    region?: pulumi.Input<string>;
}
