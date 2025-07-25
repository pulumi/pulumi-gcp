// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents a Machine Image resource. Machine images store all the configuration,
 * metadata, permissions, and data from one or more disks required to create a
 * Virtual machine (VM) instance.
 *
 * To get more information about MachineImage, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/machineImages)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/machine-images)
 *
 * ## Example Usage
 *
 * ### Machine Image Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const vm = new gcp.compute.Instance("vm", {
 *     name: "my-vm",
 *     machineType: "e2-medium",
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-11",
 *         },
 *     },
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 * });
 * const image = new gcp.compute.MachineImage("image", {
 *     name: "my-image",
 *     sourceInstance: vm.selfLink,
 * });
 * ```
 * ### Compute Machine Image Kms
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const vm = new gcp.compute.Instance("vm", {
 *     name: "my-vm",
 *     machineType: "e2-medium",
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-11",
 *         },
 *     },
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 * });
 * const keyRing = new gcp.kms.KeyRing("key_ring", {
 *     name: "keyring",
 *     location: "us",
 * });
 * const cryptoKey = new gcp.kms.CryptoKey("crypto_key", {
 *     name: "key",
 *     keyRing: keyRing.id,
 * });
 * const image = new gcp.compute.MachineImage("image", {
 *     name: "my-image",
 *     sourceInstance: vm.selfLink,
 *     machineImageEncryptionKey: {
 *         kmsKeyName: cryptoKey.id,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * MachineImage can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/global/machineImages/{{name}}`
 *
 * * `{{project}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, MachineImage can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/machineImage:MachineImage default projects/{{project}}/global/machineImages/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/machineImage:MachineImage default {{project}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/machineImage:MachineImage default {{name}}
 * ```
 */
export class MachineImage extends pulumi.CustomResource {
    /**
     * Get an existing MachineImage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MachineImageState, opts?: pulumi.CustomResourceOptions): MachineImage {
        return new MachineImage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/machineImage:MachineImage';

    /**
     * Returns true if the given object is an instance of MachineImage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MachineImage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MachineImage.__pulumiType;
    }

    /**
     * A text description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     */
    public readonly guestFlush!: pulumi.Output<boolean | undefined>;
    /**
     * Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     */
    public readonly machineImageEncryptionKey!: pulumi.Output<outputs.compute.MachineImageMachineImageEncryptionKey | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     */
    public readonly sourceInstance!: pulumi.Output<string>;
    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     */
    public /*out*/ readonly storageLocations!: pulumi.Output<string[]>;

    /**
     * Create a MachineImage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MachineImageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MachineImageArgs | MachineImageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MachineImageState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["guestFlush"] = state ? state.guestFlush : undefined;
            resourceInputs["machineImageEncryptionKey"] = state ? state.machineImageEncryptionKey : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["sourceInstance"] = state ? state.sourceInstance : undefined;
            resourceInputs["storageLocations"] = state ? state.storageLocations : undefined;
        } else {
            const args = argsOrState as MachineImageArgs | undefined;
            if ((!args || args.sourceInstance === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceInstance'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["guestFlush"] = args ? args.guestFlush : undefined;
            resourceInputs["machineImageEncryptionKey"] = args ? args.machineImageEncryptionKey : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["sourceInstance"] = args ? args.sourceInstance : undefined;
            resourceInputs["selfLink"] = undefined /*out*/;
            resourceInputs["storageLocations"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MachineImage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MachineImage resources.
 */
export interface MachineImageState {
    /**
     * A text description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     */
    guestFlush?: pulumi.Input<boolean>;
    /**
     * Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     */
    machineImageEncryptionKey?: pulumi.Input<inputs.compute.MachineImageMachineImageEncryptionKey>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     */
    sourceInstance?: pulumi.Input<string>;
    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     */
    storageLocations?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a MachineImage resource.
 */
export interface MachineImageArgs {
    /**
     * A text description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Specify this to create an application consistent machine image by informing the OS to prepare for the snapshot process.
     * Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     */
    guestFlush?: pulumi.Input<boolean>;
    /**
     * Encrypts the machine image using a customer-supplied encryption key.
     * After you encrypt a machine image with a customer-supplied key, you must
     * provide the same key if you use the machine image later (e.g. to create a
     * instance from the image)
     * Structure is documented below.
     */
    machineImageEncryptionKey?: pulumi.Input<inputs.compute.MachineImageMachineImageEncryptionKey>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource.
     */
    sourceInstance: pulumi.Input<string>;
}
