import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a VM instance resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instances)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instances).
 *
 * This resource is specifically to create a compute instance from a given
 * `source_instance_template`. To create an instance without a template, use the
 * `google_compute_instance` resource.
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const tplInstanceTemplate = new gcp.compute.InstanceTemplate("tpl", {
 *     canIpForward: true,
 *     disks: [{
 *         autoDelete: true,
 *         boot: true,
 *         diskSizeGb: 100,
 *         sourceImage: "debian-cloud/debian-9",
 *     }],
 *     machineType: "n1-standard-1",
 *     metadata: {
 *         foo: "bar",
 *     },
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 * });
 * const tplInstanceFromTemplate = new gcp.compute.InstanceFromTemplate("tpl", {
 *     // Override fields from instance template
 *     canIpForward: false,
 *     labels: {
 *         my_key: "my_value",
 *     },
 *     sourceInstanceTemplate: tplInstanceTemplate.selfLink,
 *     zone: "us-central1-a",
 * });
 * ```
 */
export declare class InstanceFromTemplate extends pulumi.CustomResource {
    /**
     * Get an existing InstanceFromTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceFromTemplateState, opts?: pulumi.CustomResourceOptions): InstanceFromTemplate;
    readonly allowStoppingForUpdate: pulumi.Output<boolean>;
    readonly attachedDisks: pulumi.Output<{
        deviceName: string;
        diskEncryptionKeyRaw: string;
        diskEncryptionKeySha256: string;
        mode: string;
        source: string;
    }[]>;
    readonly bootDisk: pulumi.Output<{
        autoDelete: boolean;
        deviceName: string;
        diskEncryptionKeyRaw: string;
        diskEncryptionKeySha256: string;
        initializeParams: {
            image: string;
            size: number;
            type: string;
        };
        source: string;
    }>;
    readonly canIpForward: pulumi.Output<boolean>;
    readonly cpuPlatform: pulumi.Output<string>;
    readonly deletionProtection: pulumi.Output<boolean>;
    readonly description: pulumi.Output<string>;
    readonly guestAccelerators: pulumi.Output<{
        count: number;
        type: string;
    }[]>;
    readonly hostname: pulumi.Output<string>;
    readonly instanceId: pulumi.Output<string>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    }>;
    readonly machineType: pulumi.Output<string>;
    readonly metadata: pulumi.Output<{
        [key: string]: string;
    }>;
    readonly metadataFingerprint: pulumi.Output<string>;
    readonly metadataStartupScript: pulumi.Output<string>;
    readonly minCpuPlatform: pulumi.Output<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name: pulumi.Output<string>;
    readonly networkInterfaces: pulumi.Output<{
        accessConfigs: {
            natIp: string;
            networkTier: string;
            publicPtrDomainName: string;
        }[];
        aliasIpRanges: {
            ipCidrRange: string;
            subnetworkRangeName: string;
        }[];
        name: string;
        network: string;
        networkIp: string;
        subnetwork: string;
        subnetworkProject: string;
    }[]>;
    readonly project: pulumi.Output<string>;
    readonly scheduling: pulumi.Output<{
        automaticRestart: boolean;
        onHostMaintenance: string;
        preemptible: boolean;
    }>;
    readonly scratchDisks: pulumi.Output<{
        interface: string;
    }[]>;
    readonly selfLink: pulumi.Output<string>;
    readonly serviceAccount: pulumi.Output<{
        email: string;
        scopes: string[];
    }>;
    /**
     * Name or self link of an instance
     * template to create the instance based on.
     */
    readonly sourceInstanceTemplate: pulumi.Output<string>;
    readonly tags: pulumi.Output<string[]>;
    readonly tagsFingerprint: pulumi.Output<string>;
    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     */
    readonly zone: pulumi.Output<string>;
    /**
     * Create a InstanceFromTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceFromTemplateArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering InstanceFromTemplate resources.
 */
export interface InstanceFromTemplateState {
    readonly allowStoppingForUpdate?: pulumi.Input<boolean>;
    readonly attachedDisks?: pulumi.Input<pulumi.Input<{
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        mode?: pulumi.Input<string>;
        source: pulumi.Input<string>;
    }>[]>;
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
    readonly canIpForward?: pulumi.Input<boolean>;
    readonly cpuPlatform?: pulumi.Input<string>;
    readonly deletionProtection?: pulumi.Input<boolean>;
    readonly description?: pulumi.Input<string>;
    readonly guestAccelerators?: pulumi.Input<pulumi.Input<{
        count: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }>[]>;
    readonly hostname?: pulumi.Input<string>;
    readonly instanceId?: pulumi.Input<string>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly machineType?: pulumi.Input<string>;
    readonly metadata?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly metadataFingerprint?: pulumi.Input<string>;
    readonly metadataStartupScript?: pulumi.Input<string>;
    readonly minCpuPlatform?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
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
    readonly project?: pulumi.Input<string>;
    readonly scheduling?: pulumi.Input<{
        automaticRestart?: pulumi.Input<boolean>;
        onHostMaintenance?: pulumi.Input<string>;
        preemptible?: pulumi.Input<boolean>;
    }>;
    readonly scratchDisks?: pulumi.Input<pulumi.Input<{
        interface?: pulumi.Input<string>;
    }>[]>;
    readonly selfLink?: pulumi.Input<string>;
    readonly serviceAccount?: pulumi.Input<{
        email?: pulumi.Input<string>;
        scopes: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * Name or self link of an instance
     * template to create the instance based on.
     */
    readonly sourceInstanceTemplate?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    readonly tagsFingerprint?: pulumi.Input<string>;
    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     */
    readonly zone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a InstanceFromTemplate resource.
 */
export interface InstanceFromTemplateArgs {
    readonly allowStoppingForUpdate?: pulumi.Input<boolean>;
    readonly attachedDisks?: pulumi.Input<pulumi.Input<{
        deviceName?: pulumi.Input<string>;
        diskEncryptionKeyRaw?: pulumi.Input<string>;
        diskEncryptionKeySha256?: pulumi.Input<string>;
        mode?: pulumi.Input<string>;
        source: pulumi.Input<string>;
    }>[]>;
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
    readonly canIpForward?: pulumi.Input<boolean>;
    readonly deletionProtection?: pulumi.Input<boolean>;
    readonly description?: pulumi.Input<string>;
    readonly guestAccelerators?: pulumi.Input<pulumi.Input<{
        count: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }>[]>;
    readonly hostname?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly machineType?: pulumi.Input<string>;
    readonly metadata?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly metadataStartupScript?: pulumi.Input<string>;
    readonly minCpuPlatform?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
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
    readonly project?: pulumi.Input<string>;
    readonly scheduling?: pulumi.Input<{
        automaticRestart?: pulumi.Input<boolean>;
        onHostMaintenance?: pulumi.Input<string>;
        preemptible?: pulumi.Input<boolean>;
    }>;
    readonly scratchDisks?: pulumi.Input<pulumi.Input<{
        interface?: pulumi.Input<string>;
    }>[]>;
    readonly serviceAccount?: pulumi.Input<{
        email?: pulumi.Input<string>;
        scopes: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * Name or self link of an instance
     * template to create the instance based on.
     */
    readonly sourceInstanceTemplate: pulumi.Input<string>;
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     */
    readonly zone?: pulumi.Input<string>;
}
