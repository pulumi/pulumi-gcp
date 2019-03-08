import * as pulumi from "@pulumi/pulumi";
/**
 * Persistent disks are durable storage devices that function similarly to
 * the physical disks in a desktop or a server. Compute Engine manages the
 * hardware behind these devices to ensure data redundancy and optimize
 * performance for you. Persistent disks are available as either standard
 * hard disk drives (HDD) or solid-state drives (SSD).
 *
 * Persistent disks are located independently from your virtual machine
 * instances, so you can detach or move persistent disks to keep your data
 * even after you delete your instances. Persistent disk performance scales
 * automatically with size, so you can resize your existing persistent disks
 * or add more persistent disks to an instance to meet your performance and
 * storage space requirements.
 *
 * Add a persistent disk to your instance when you need reliable and
 * affordable storage with consistent performance characteristics.
 *
 *
 * To get more information about RegionDisk, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionDisks)
 * * How-to Guides
 *     * [Adding or Resizing Regional Persistent Disks](https://cloud.google.com/compute/docs/disks/regional-persistent-disk)
 *
 * > **Warning:** All arguments including the disk encryption key will be stored in the raw
 * state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=region_disk_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Region Disk Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const disk = new gcp.compute.Disk("disk", {
 *     image: "debian-cloud/debian-9",
 *     size: 50,
 *     type: "pd-ssd",
 *     zone: "us-central1-a",
 * });
 * const snapdisk = new gcp.compute.Snapshot("snapdisk", {
 *     sourceDisk: disk.name,
 *     zone: "us-central1-a",
 * });
 * const regiondisk = new gcp.compute.RegionDisk("regiondisk", {
 *     region: "us-central1",
 *     replicaZones: [
 *         "us-central1-a",
 *         "us-central1-f",
 *     ],
 *     snapshot: snapdisk.selfLink,
 *     type: "pd-ssd",
 * });
 * ```
 */
export declare class RegionDisk extends pulumi.CustomResource {
    /**
     * Get an existing RegionDisk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionDiskState, opts?: pulumi.CustomResourceOptions): RegionDisk;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly diskEncryptionKey: pulumi.Output<{
        kmsKeyName?: string;
        rawKey?: string;
        sha256: string;
    } | undefined>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly lastAttachTimestamp: pulumi.Output<string>;
    readonly lastDetachTimestamp: pulumi.Output<string>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    readonly replicaZones: pulumi.Output<string[]>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly size: pulumi.Output<number>;
    readonly snapshot: pulumi.Output<string | undefined>;
    readonly sourceSnapshotEncryptionKey: pulumi.Output<{
        kmsKeyName?: string;
        rawKey?: string;
        sha256: string;
    } | undefined>;
    readonly sourceSnapshotId: pulumi.Output<string>;
    readonly type: pulumi.Output<string | undefined>;
    readonly users: pulumi.Output<string[]>;
    /**
     * Create a RegionDisk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionDiskArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RegionDisk resources.
 */
export interface RegionDiskState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly diskEncryptionKey?: pulumi.Input<{
        kmsKeyName?: pulumi.Input<string>;
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly lastAttachTimestamp?: pulumi.Input<string>;
    readonly lastDetachTimestamp?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly replicaZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly size?: pulumi.Input<number>;
    readonly snapshot?: pulumi.Input<string>;
    readonly sourceSnapshotEncryptionKey?: pulumi.Input<{
        kmsKeyName?: pulumi.Input<string>;
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly sourceSnapshotId?: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
    readonly users?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a RegionDisk resource.
 */
export interface RegionDiskArgs {
    readonly description?: pulumi.Input<string>;
    readonly diskEncryptionKey?: pulumi.Input<{
        kmsKeyName?: pulumi.Input<string>;
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly replicaZones: pulumi.Input<pulumi.Input<string>[]>;
    readonly size?: pulumi.Input<number>;
    readonly snapshot?: pulumi.Input<string>;
    readonly sourceSnapshotEncryptionKey?: pulumi.Input<{
        kmsKeyName?: pulumi.Input<string>;
        rawKey?: pulumi.Input<string>;
        sha256?: pulumi.Input<string>;
    }>;
    readonly type?: pulumi.Input<string>;
}
