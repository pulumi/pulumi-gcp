import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a Persistent Disk Snapshot resource.
 *
 * Use snapshots to back up data from your persistent disks. Snapshots are
 * different from public images and custom images, which are used primarily
 * to create instances or configure instance templates. Snapshots are useful
 * for periodic backup of the data on your persistent disks. You can create
 * snapshots from persistent disks even while they are attached to running
 * instances.
 *
 * Snapshots are incremental, so you can create regular snapshots on a
 * persistent disk faster and at a much lower cost than if you regularly
 * created a full image of the disk.
 *
 *
 * To get more information about Snapshot, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/snapshots)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/disks/create-snapshots)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=snapshot_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Snapshot Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const debian = pulumi.output(gcp.compute.getImage({
 *     family: "debian-9",
 *     project: "debian-cloud",
 * }));
 * const persistent = new gcp.compute.Disk("persistent", {
 *     image: debian.apply(debian => debian.selfLink),
 *     size: 10,
 *     type: "pd-ssd",
 *     zone: "us-central1-a",
 * });
 * const snapshot = new gcp.compute.Snapshot("snapshot", {
 *     labels: {
 *         my_label: "value",
 *     },
 *     sourceDisk: persistent.name,
 *     zone: "us-central1-a",
 * });
 * ```
 */
export declare class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly diskSizeGb: pulumi.Output<number>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly licenses: pulumi.Output<string[]>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly snapshotEncryptionKey: pulumi.Output<{
        rawKey?: string;
        sha256: string;
    } | undefined>;
    readonly snapshotId: pulumi.Output<number>;
    readonly sourceDisk: pulumi.Output<string>;
    readonly sourceDiskEncryptionKey: pulumi.Output<{
        rawKey?: string;
    } | undefined>;
    readonly sourceDiskLink: pulumi.Output<string>;
    readonly storageBytes: pulumi.Output<number>;
    readonly zone: pulumi.Output<string>;
    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly diskSizeGb?: pulumi.Input<number>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly licenses?: pulumi.Input<pulumi.Input<string>[]>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly snapshotEncryptionKey?: pulumi.Input<{
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly snapshotId?: pulumi.Input<number>;
    readonly sourceDisk?: pulumi.Input<string>;
    readonly sourceDiskEncryptionKey?: pulumi.Input<{
        rawKey?: pulumi.Input<string>;
    }>;
    readonly sourceDiskLink?: pulumi.Input<string>;
    readonly storageBytes?: pulumi.Input<number>;
    readonly zone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    readonly description?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly snapshotEncryptionKey?: pulumi.Input<{
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly sourceDisk: pulumi.Input<string>;
    readonly sourceDiskEncryptionKey?: pulumi.Input<{
        rawKey?: pulumi.Input<string>;
    }>;
    readonly zone?: pulumi.Input<string>;
}
