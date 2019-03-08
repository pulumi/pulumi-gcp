import * as pulumi from "@pulumi/pulumi";
/**
 * Persistent disks can be attached to a compute instance using [the `attached_disk`
 * section within the compute instance configuration](https://www.terraform.io/docs/providers/google/r/compute_instance.html#attached_disk).
 * However there may be situations where managing the attached disks via the compute
 * instance config isn't preferable or possible, such as attaching dynamic
 * numbers of disks using the `count` variable.
 *
 *
 * To get more information about attaching disks, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instances/attachDisk)
 * * [Resource: google_compute_disk](https://www.terraform.io/docs/providers/google/r/compute_disk.html)
 * * How-to Guides
 *     * [Adding a persistent disk](https://cloud.google.com/compute/docs/disks/add-persistent-disk)
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultAttachedDisk = new gcp.compute.AttachedDisk("default", {
 *     disk: google_compute_disk_default.selfLink,
 *     instance: google_compute_instance_default.selfLink,
 * });
 * ```
 */
export declare class AttachedDisk extends pulumi.CustomResource {
    /**
     * Get an existing AttachedDisk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AttachedDiskState, opts?: pulumi.CustomResourceOptions): AttachedDisk;
    readonly deviceName: pulumi.Output<string>;
    readonly disk: pulumi.Output<string>;
    readonly instance: pulumi.Output<string>;
    readonly mode: pulumi.Output<string | undefined>;
    readonly project: pulumi.Output<string>;
    readonly zone: pulumi.Output<string>;
    /**
     * Create a AttachedDisk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AttachedDiskArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AttachedDisk resources.
 */
export interface AttachedDiskState {
    readonly deviceName?: pulumi.Input<string>;
    readonly disk?: pulumi.Input<string>;
    readonly instance?: pulumi.Input<string>;
    readonly mode?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly zone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AttachedDisk resource.
 */
export interface AttachedDiskArgs {
    readonly deviceName?: pulumi.Input<string>;
    readonly disk: pulumi.Input<string>;
    readonly instance: pulumi.Input<string>;
    readonly mode?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly zone?: pulumi.Input<string>;
}
