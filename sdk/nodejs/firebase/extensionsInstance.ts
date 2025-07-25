// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Firebase Extentions Instance Resize Image
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const images = new gcp.storage.Bucket("images", {
 *     project: "my-project-name",
 *     name: "bucket-id",
 *     location: "US",
 *     uniformBucketLevelAccess: true,
 *     forceDestroy: true,
 * });
 * const resizeImage = new gcp.firebase.ExtensionsInstance("resize_image", {
 *     project: "my-project-name",
 *     instanceId: "storage-resize-images",
 *     config: {
 *         extensionRef: "firebase/storage-resize-images",
 *         extensionVersion: "0.2.2",
 *         params: {
 *             DELETE_ORIGINAL_FILE: "false",
 *             MAKE_PUBLIC: "false",
 *             IMAGE_TYPE: "false",
 *             IS_ANIMATED: "true",
 *             FUNCTION_MEMORY: "1024",
 *             DO_BACKFILL: "false",
 *             IMG_SIZES: "200x200",
 *             IMG_BUCKET: images.name,
 *         },
 *         systemParams: {
 *             "firebaseextensions.v1beta.function/location": "us-central1",
 *             "firebaseextensions.v1beta.function/maxInstances": "3000",
 *             "firebaseextensions.v1beta.function/minInstances": "0",
 *             "firebaseextensions.v1beta.function/vpcConnectorEgressSettings": "VPC_CONNECTOR_EGRESS_SETTINGS_UNSPECIFIED",
 *         },
 *         allowedEventTypes: ["firebase.extensions.storage-resize-images.v1.onCompletion"],
 *         eventarcChannel: "projects/my-project-name/locations/us-central1/channels/firebase",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Instance can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/instances/{{instance_id}}`
 *
 * * `{{project}}/{{instance_id}}`
 *
 * * `{{instance_id}}`
 *
 * When using the `pulumi import` command, Instance can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default projects/{{project}}/instances/{{instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default {{project}}/{{instance_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:firebase/extensionsInstance:ExtensionsInstance default {{instance_id}}
 * ```
 */
export class ExtensionsInstance extends pulumi.CustomResource {
    /**
     * Get an existing ExtensionsInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExtensionsInstanceState, opts?: pulumi.CustomResourceOptions): ExtensionsInstance {
        return new ExtensionsInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebase/extensionsInstance:ExtensionsInstance';

    /**
     * Returns true if the given object is an instance of ExtensionsInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExtensionsInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExtensionsInstance.__pulumiType;
    }

    /**
     * The current Config of the Extension Instance.
     * Structure is documented below.
     */
    public readonly config!: pulumi.Output<outputs.firebase.ExtensionsInstanceConfig>;
    /**
     * The time at which the Extension Instance was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * If this Instance has `state: ERRORED`, the error messages
     * will be found here.
     * Structure is documented below.
     */
    public /*out*/ readonly errorStatuses!: pulumi.Output<outputs.firebase.ExtensionsInstanceErrorStatus[]>;
    /**
     * A weak etag that is computed by the server based on other configuration
     * values and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The ID to use for the Extension Instance, which will become the final
     * component of the instance's name.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * The name of the last operation that acted on this Extension
     * Instance
     */
    public /*out*/ readonly lastOperationName!: pulumi.Output<string>;
    /**
     * The type of the last operation that acted on the Extension Instance.
     */
    public /*out*/ readonly lastOperationType!: pulumi.Output<string>;
    /**
     * The fully-qualified resource name of the Extension Instance.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Data set by the extension instance at runtime.
     * Structure is documented below.
     */
    public /*out*/ readonly runtimeDatas!: pulumi.Output<outputs.firebase.ExtensionsInstanceRuntimeData[]>;
    /**
     * The email of the service account to be used at runtime by compute resources
     * created for the operation of the Extension instance.
     */
    public /*out*/ readonly serviceAccountEmail!: pulumi.Output<string>;
    /**
     * The processing state of the extension instance.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The time at which the Extension Instance was updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a ExtensionsInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExtensionsInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExtensionsInstanceArgs | ExtensionsInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExtensionsInstanceState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["errorStatuses"] = state ? state.errorStatuses : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["lastOperationName"] = state ? state.lastOperationName : undefined;
            resourceInputs["lastOperationType"] = state ? state.lastOperationType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["runtimeDatas"] = state ? state.runtimeDatas : undefined;
            resourceInputs["serviceAccountEmail"] = state ? state.serviceAccountEmail : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ExtensionsInstanceArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["errorStatuses"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["lastOperationName"] = undefined /*out*/;
            resourceInputs["lastOperationType"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["runtimeDatas"] = undefined /*out*/;
            resourceInputs["serviceAccountEmail"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ExtensionsInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExtensionsInstance resources.
 */
export interface ExtensionsInstanceState {
    /**
     * The current Config of the Extension Instance.
     * Structure is documented below.
     */
    config?: pulumi.Input<inputs.firebase.ExtensionsInstanceConfig>;
    /**
     * The time at which the Extension Instance was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * If this Instance has `state: ERRORED`, the error messages
     * will be found here.
     * Structure is documented below.
     */
    errorStatuses?: pulumi.Input<pulumi.Input<inputs.firebase.ExtensionsInstanceErrorStatus>[]>;
    /**
     * A weak etag that is computed by the server based on other configuration
     * values and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * The ID to use for the Extension Instance, which will become the final
     * component of the instance's name.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the last operation that acted on this Extension
     * Instance
     */
    lastOperationName?: pulumi.Input<string>;
    /**
     * The type of the last operation that acted on the Extension Instance.
     */
    lastOperationType?: pulumi.Input<string>;
    /**
     * The fully-qualified resource name of the Extension Instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Data set by the extension instance at runtime.
     * Structure is documented below.
     */
    runtimeDatas?: pulumi.Input<pulumi.Input<inputs.firebase.ExtensionsInstanceRuntimeData>[]>;
    /**
     * The email of the service account to be used at runtime by compute resources
     * created for the operation of the Extension instance.
     */
    serviceAccountEmail?: pulumi.Input<string>;
    /**
     * The processing state of the extension instance.
     */
    state?: pulumi.Input<string>;
    /**
     * The time at which the Extension Instance was updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExtensionsInstance resource.
 */
export interface ExtensionsInstanceArgs {
    /**
     * The current Config of the Extension Instance.
     * Structure is documented below.
     */
    config: pulumi.Input<inputs.firebase.ExtensionsInstanceConfig>;
    /**
     * The ID to use for the Extension Instance, which will become the final
     * component of the instance's name.
     */
    instanceId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
