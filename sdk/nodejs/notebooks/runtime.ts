// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * A Cloud AI Platform Notebook runtime.
 *
 * > **Note:** Due to limitations of the Notebooks Runtime API, many fields
 * in this resource do not properly detect drift. These fields will also not
 * appear in state once imported.
 *
 * To get more information about Runtime, see:
 *
 * * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
 *
 * ## Example Usage
 * ### Notebook Runtime Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const runtime = new gcp.notebooks.Runtime("runtime", {
 *     accessConfig: {
 *         accessType: "SINGLE_USER",
 *         runtimeOwner: "admin@hashicorptest.com",
 *     },
 *     location: "us-central1",
 *     virtualMachine: {
 *         virtualMachineConfig: {
 *             dataDisk: {
 *                 initializeParams: {
 *                     diskSizeGb: 100,
 *                     diskType: "PD_STANDARD",
 *                 },
 *             },
 *             machineType: "n1-standard-4",
 *         },
 *     },
 * });
 * ```
 * ### Notebook Runtime Basic Gpu
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const runtimeGpu = new gcp.notebooks.Runtime("runtime_gpu", {
 *     accessConfig: {
 *         accessType: "SINGLE_USER",
 *         runtimeOwner: "admin@hashicorptest.com",
 *     },
 *     location: "us-central1",
 *     softwareConfig: {
 *         installGpuDriver: true,
 *     },
 *     virtualMachine: {
 *         virtualMachineConfig: {
 *             acceleratorConfig: {
 *                 coreCount: 1,
 *                 type: "NVIDIA_TESLA_V100",
 *             },
 *             dataDisk: {
 *                 initializeParams: {
 *                     diskSizeGb: 100,
 *                     diskType: "PD_STANDARD",
 *                 },
 *             },
 *             machineType: "n1-standard-4",
 *         },
 *     },
 * });
 * ```
 * ### Notebook Runtime Basic Container
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const runtimeContainer = new gcp.notebooks.Runtime("runtime_container", {
 *     accessConfig: {
 *         accessType: "SINGLE_USER",
 *         runtimeOwner: "admin@hashicorptest.com",
 *     },
 *     location: "us-central1",
 *     virtualMachine: {
 *         virtualMachineConfig: {
 *             containerImages: [
 *                 {
 *                     repository: "gcr.io/deeplearning-platform-release/base-cpu",
 *                     tag: "latest",
 *                 },
 *                 {
 *                     repository: "gcr.io/deeplearning-platform-release/beam-notebooks",
 *                     tag: "latest",
 *                 },
 *             ],
 *             dataDisk: {
 *                 initializeParams: {
 *                     diskSizeGb: 100,
 *                     diskType: "PD_STANDARD",
 *                 },
 *             },
 *             machineType: "n1-standard-4",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Runtime can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default projects/{{project}}/locations/{{location}}/runtimes/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:notebooks/runtime:Runtime default {{location}}/{{name}}
 * ```
 */
export class Runtime extends pulumi.CustomResource {
    /**
     * Get an existing Runtime resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuntimeState, opts?: pulumi.CustomResourceOptions): Runtime {
        return new Runtime(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:notebooks/runtime:Runtime';

    /**
     * Returns true if the given object is an instance of Runtime.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Runtime {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Runtime.__pulumiType;
    }

    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     */
    public readonly accessConfig!: pulumi.Output<outputs.notebooks.RuntimeAccessConfig | undefined>;
    /**
     * The health state of this runtime. For a list of possible output values, see
     * 'https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate'.
     */
    public /*out*/ readonly healthState!: pulumi.Output<string>;
    /**
     * A reference to the zone where the machine resides.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     */
    public /*out*/ readonly metrics!: pulumi.Output<outputs.notebooks.RuntimeMetric[]>;
    /**
     * The name specified for the Notebook instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     */
    public readonly softwareConfig!: pulumi.Output<outputs.notebooks.RuntimeSoftwareConfig | undefined>;
    /**
     * The state of this runtime.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     */
    public readonly virtualMachine!: pulumi.Output<outputs.notebooks.RuntimeVirtualMachine | undefined>;

    /**
     * Create a Runtime resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuntimeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuntimeArgs | RuntimeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuntimeState | undefined;
            inputs["accessConfig"] = state ? state.accessConfig : undefined;
            inputs["healthState"] = state ? state.healthState : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["metrics"] = state ? state.metrics : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["project"] = state ? state.project : undefined;
            inputs["softwareConfig"] = state ? state.softwareConfig : undefined;
            inputs["state"] = state ? state.state : undefined;
            inputs["virtualMachine"] = state ? state.virtualMachine : undefined;
        } else {
            const args = argsOrState as RuntimeArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            inputs["accessConfig"] = args ? args.accessConfig : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["project"] = args ? args.project : undefined;
            inputs["softwareConfig"] = args ? args.softwareConfig : undefined;
            inputs["virtualMachine"] = args ? args.virtualMachine : undefined;
            inputs["healthState"] = undefined /*out*/;
            inputs["metrics"] = undefined /*out*/;
            inputs["state"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Runtime.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Runtime resources.
 */
export interface RuntimeState {
    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     */
    accessConfig?: pulumi.Input<inputs.notebooks.RuntimeAccessConfig>;
    /**
     * The health state of this runtime. For a list of possible output values, see
     * 'https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate'.
     */
    healthState?: pulumi.Input<string>;
    /**
     * A reference to the zone where the machine resides.
     */
    location?: pulumi.Input<string>;
    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     */
    metrics?: pulumi.Input<pulumi.Input<inputs.notebooks.RuntimeMetric>[]>;
    /**
     * The name specified for the Notebook instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     */
    softwareConfig?: pulumi.Input<inputs.notebooks.RuntimeSoftwareConfig>;
    /**
     * The state of this runtime.
     */
    state?: pulumi.Input<string>;
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     */
    virtualMachine?: pulumi.Input<inputs.notebooks.RuntimeVirtualMachine>;
}

/**
 * The set of arguments for constructing a Runtime resource.
 */
export interface RuntimeArgs {
    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     */
    accessConfig?: pulumi.Input<inputs.notebooks.RuntimeAccessConfig>;
    /**
     * A reference to the zone where the machine resides.
     */
    location: pulumi.Input<string>;
    /**
     * The name specified for the Notebook instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     */
    softwareConfig?: pulumi.Input<inputs.notebooks.RuntimeSoftwareConfig>;
    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     */
    virtualMachine?: pulumi.Input<inputs.notebooks.RuntimeVirtualMachine>;
}