import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a VM instance resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instances)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instances).
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultInstance = new gcp.compute.Instance("default", {
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-9",
 *         },
 *     },
 *     machineType: "n1-standard-1",
 *     metadata: {
 *         foo: "bar",
 *     },
 *     metadataStartupScript: "echo hi > /test.txt",
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     // Local SSD disk
 *     scratchDisks: [{}],
 *     serviceAccount: {
 *         scopes: [
 *             "userinfo-email",
 *             "compute-ro",
 *             "storage-ro",
 *         ],
 *     },
 *     tags: [
 *         "foo",
 *         "bar",
 *     ],
 *     zone: "us-central1-a",
 * });
 * ```
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance;
    /**
     * If true, allows Terraform to stop the instance to update its properties.
     * If you try to update a property that requires stopping the instance without setting this field, the update will fail.
     */
    readonly allowStoppingForUpdate: pulumi.Output<boolean | undefined>;
    /**
     * Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     */
    readonly attachedDisks: pulumi.Output<{
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        mode?: string;
        source: string;
    }[] | undefined>;
    /**
     * The boot disk for the instance.
     * Structure is documented below.
     */
    readonly bootDisk: pulumi.Output<{
        autoDelete?: boolean;
        deviceName: string;
        diskEncryptionKeyRaw?: string;
        diskEncryptionKeySha256: string;
        initializeParams: {
            image: string;
            size: number;
            type: string;
        };
        source: string;
    }>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs.
     * This defaults to false.
     */
    readonly canIpForward: pulumi.Output<boolean | undefined>;
    /**
     * The CPU platform used by this instance.
     */
    readonly cpuPlatform: pulumi.Output<string>;
    /**
     * Enable deletion protection on this instance. Defaults to false.
     * **Note:** you must disable deletion protection before removing the resource (e.g., via `terraform destroy`), or the instance cannot be deleted and the Terraform run will not complete successfully.
     */
    readonly deletionProtection: pulumi.Output<boolean | undefined>;
    /**
     * A brief description of this resource.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `on_host_maintenance` option set to TERMINATE.
     */
    readonly guestAccelerators: pulumi.Output<{
        count: number;
        type: string;
    }[]>;
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid.
     * Valid format is a series of labels 1-63 characters long matching the regular expression `a-z`, concatenated with periods.
     * The entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     */
    readonly hostname: pulumi.Output<string | undefined>;
    /**
     * The server-assigned unique identifier of this instance.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * The unique fingerprint of the labels.
     */
    readonly labelFingerprint: pulumi.Output<string>;
    /**
     * A set of key/value label pairs to assign to the instance.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The machine type to create.
     */
    readonly machineType: pulumi.Output<string>;
    /**
     * Metadata key/value pairs to make available from
     * within the instance. Ssh keys attached in the Cloud Console will be removed.
     * Add them to your config in order to keep them attached to your instance.
     */
    readonly metadata: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The unique fingerprint of the metadata.
     */
    readonly metadataFingerprint: pulumi.Output<string>;
    /**
     * An alternative to using the
     * startup-script metadata key, except this one forces the instance to be
     * recreated (thus re-running the script) if it is changed. This replaces the
     * startup-script metadata key on the created instance and thus the two
     * mechanisms are not allowed to be used simultaneously.
     */
    readonly metadataStartupScript: pulumi.Output<string | undefined>;
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly minCpuPlatform: pulumi.Output<string | undefined>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     */
    readonly networkInterfaces: pulumi.Output<{
        accessConfigs?: {
            natIp: string;
            networkTier: string;
            publicPtrDomainName?: string;
        }[];
        aliasIpRanges?: {
            ipCidrRange: string;
            subnetworkRangeName?: string;
        }[];
        name: string;
        network: string;
        networkIp: string;
        subnetwork: string;
        subnetworkProject: string;
    }[]>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    readonly scheduling: pulumi.Output<{
        automaticRestart?: boolean;
        onHostMaintenance: string;
        preemptible?: boolean;
    }>;
    /**
     * Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     */
    readonly scratchDisks: pulumi.Output<{
        interface?: string;
    }[] | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly serviceAccount: pulumi.Output<{
        email: string;
        scopes: string[];
    } | undefined>;
    /**
     * A list of tags to attach to the instance.
     */
    readonly tags: pulumi.Output<string[] | undefined>;
    /**
     * The unique fingerprint of the tags.
     */
    readonly tagsFingerprint: pulumi.Output<string>;
    /**
     * The zone that the machine should be created in.
     */
    readonly zone: pulumi.Output<string>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * If true, allows Terraform to stop the instance to update its properties.
     * If you try to update a property that requires stopping the instance without setting this field, the update will fail.
     */
    readonly allowStoppingForUpdate?: pulumi.Input<boolean>;
    /**
     * Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     */
    readonly attachedDisks?: pulumi.Input<pulumi.Input<{
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        mode?: pulumi.Input<string>;
        source: pulumi.Input<string>;
    }>[]>;
    /**
     * The boot disk for the instance.
     * Structure is documented below.
     */
    readonly bootDisk?: pulumi.Input<{
        autoDelete?: pulumi.Input<boolean>;
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        initializeParams?: pulumi.Input<{
            image?: pulumi.Input<string>;
            size?: pulumi.Input<number>;
            type?: pulumi.Input<string>;
        }>;
        source?: pulumi.Input<string>;
    }>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs.
     * This defaults to false.
     */
    readonly canIpForward?: pulumi.Input<boolean>;
    /**
     * The CPU platform used by this instance.
     */
    readonly cpuPlatform?: pulumi.Input<string>;
    /**
     * Enable deletion protection on this instance. Defaults to false.
     * **Note:** you must disable deletion protection before removing the resource (e.g., via `terraform destroy`), or the instance cannot be deleted and the Terraform run will not complete successfully.
     */
    readonly deletionProtection?: pulumi.Input<boolean>;
    /**
     * A brief description of this resource.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `on_host_maintenance` option set to TERMINATE.
     */
    readonly guestAccelerators?: pulumi.Input<pulumi.Input<{
        count: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }>[]>;
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid.
     * Valid format is a series of labels 1-63 characters long matching the regular expression `a-z`, concatenated with periods.
     * The entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     */
    readonly hostname?: pulumi.Input<string>;
    /**
     * The server-assigned unique identifier of this instance.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The unique fingerprint of the labels.
     */
    readonly labelFingerprint?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the instance.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The machine type to create.
     */
    readonly machineType?: pulumi.Input<string>;
    /**
     * Metadata key/value pairs to make available from
     * within the instance. Ssh keys attached in the Cloud Console will be removed.
     * Add them to your config in order to keep them attached to your instance.
     */
    readonly metadata?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The unique fingerprint of the metadata.
     */
    readonly metadataFingerprint?: pulumi.Input<string>;
    /**
     * An alternative to using the
     * startup-script metadata key, except this one forces the instance to be
     * recreated (thus re-running the script) if it is changed. This replaces the
     * startup-script metadata key on the created instance and thus the two
     * mechanisms are not allowed to be used simultaneously.
     */
    readonly metadataStartupScript?: pulumi.Input<string>;
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly minCpuPlatform?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     */
    readonly networkInterfaces?: pulumi.Input<pulumi.Input<{
        accessConfigs?: pulumi.Input<pulumi.Input<{
            natIp?: pulumi.Input<string>;
            networkTier?: pulumi.Input<string>;
            publicPtrDomainName?: pulumi.Input<string>;
        }>[]>;
        aliasIpRanges?: pulumi.Input<pulumi.Input<{
            ipCidrRange: pulumi.Input<string>;
            subnetworkRangeName?: pulumi.Input<string>;
        }>[]>;
        name?: pulumi.Input<string>;
        network?: pulumi.Input<string>;
        networkIp?: pulumi.Input<string>;
        subnetwork?: pulumi.Input<string>;
        subnetworkProject?: pulumi.Input<string>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    readonly scheduling?: pulumi.Input<{
        automaticRestart?: pulumi.Input<boolean>;
        onHostMaintenance?: pulumi.Input<string>;
        preemptible?: pulumi.Input<boolean>;
    }>;
    /**
     * Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     */
    readonly scratchDisks?: pulumi.Input<pulumi.Input<{
        interface?: pulumi.Input<string>;
    }>[]>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly serviceAccount?: pulumi.Input<{
        email?: pulumi.Input<string>;
        scopes: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * A list of tags to attach to the instance.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique fingerprint of the tags.
     */
    readonly tagsFingerprint?: pulumi.Input<string>;
    /**
     * The zone that the machine should be created in.
     */
    readonly zone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * If true, allows Terraform to stop the instance to update its properties.
     * If you try to update a property that requires stopping the instance without setting this field, the update will fail.
     */
    readonly allowStoppingForUpdate?: pulumi.Input<boolean>;
    /**
     * Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     */
    readonly attachedDisks?: pulumi.Input<pulumi.Input<{
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        mode?: pulumi.Input<string>;
        source: pulumi.Input<string>;
    }>[]>;
    /**
     * The boot disk for the instance.
     * Structure is documented below.
     */
    readonly bootDisk: pulumi.Input<{
        autoDelete?: pulumi.Input<boolean>;
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        initializeParams?: pulumi.Input<{
            image?: pulumi.Input<string>;
            size?: pulumi.Input<number>;
            type?: pulumi.Input<string>;
        }>;
        source?: pulumi.Input<string>;
    }>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs.
     * This defaults to false.
     */
    readonly canIpForward?: pulumi.Input<boolean>;
    /**
     * Enable deletion protection on this instance. Defaults to false.
     * **Note:** you must disable deletion protection before removing the resource (e.g., via `terraform destroy`), or the instance cannot be deleted and the Terraform run will not complete successfully.
     */
    readonly deletionProtection?: pulumi.Input<boolean>;
    /**
     * A brief description of this resource.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `on_host_maintenance` option set to TERMINATE.
     */
    readonly guestAccelerators?: pulumi.Input<pulumi.Input<{
        count: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }>[]>;
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid.
     * Valid format is a series of labels 1-63 characters long matching the regular expression `a-z`, concatenated with periods.
     * The entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     */
    readonly hostname?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the instance.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The machine type to create.
     */
    readonly machineType: pulumi.Input<string>;
    /**
     * Metadata key/value pairs to make available from
     * within the instance. Ssh keys attached in the Cloud Console will be removed.
     * Add them to your config in order to keep them attached to your instance.
     */
    readonly metadata?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * An alternative to using the
     * startup-script metadata key, except this one forces the instance to be
     * recreated (thus re-running the script) if it is changed. This replaces the
     * startup-script metadata key on the created instance and thus the two
     * mechanisms are not allowed to be used simultaneously.
     */
    readonly metadataStartupScript?: pulumi.Input<string>;
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly minCpuPlatform?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     */
    readonly networkInterfaces: pulumi.Input<pulumi.Input<{
        accessConfigs?: pulumi.Input<pulumi.Input<{
            natIp?: pulumi.Input<string>;
            networkTier?: pulumi.Input<string>;
            publicPtrDomainName?: pulumi.Input<string>;
        }>[]>;
        aliasIpRanges?: pulumi.Input<pulumi.Input<{
            ipCidrRange: pulumi.Input<string>;
            subnetworkRangeName?: pulumi.Input<string>;
        }>[]>;
        name?: pulumi.Input<string>;
        network?: pulumi.Input<string>;
        networkIp?: pulumi.Input<string>;
        subnetwork?: pulumi.Input<string>;
        subnetworkProject?: pulumi.Input<string>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    readonly scheduling?: pulumi.Input<{
        automaticRestart?: pulumi.Input<boolean>;
        onHostMaintenance?: pulumi.Input<string>;
        preemptible?: pulumi.Input<boolean>;
    }>;
    /**
     * Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     */
    readonly scratchDisks?: pulumi.Input<pulumi.Input<{
        interface?: pulumi.Input<string>;
    }>[]>;
    /**
     * Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     */
    readonly serviceAccount?: pulumi.Input<{
        email?: pulumi.Input<string>;
        scopes: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * A list of tags to attach to the instance.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The zone that the machine should be created in.
     */
    readonly zone?: pulumi.Input<string>;
}
