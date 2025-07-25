// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Tensorboard is a physical database that stores users' training metrics. A default Tensorboard is provided in each region of a GCP project. If needed users can also create extra Tensorboards in their projects.
 *
 * To get more information about Tensorboard, see:
 *
 * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.tensorboards)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
 *
 * ## Example Usage
 *
 * ### Vertex Ai Tensorboard
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const tensorboard = new gcp.vertex.AiTensorboard("tensorboard", {
 *     displayName: "terraform",
 *     description: "sample description",
 *     labels: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 *     region: "us-central1",
 * });
 * ```
 * ### Vertex Ai Tensorboard Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const cryptoKey = new gcp.kms.CryptoKeyIAMMember("crypto_key", {
 *     cryptoKeyId: "kms-name",
 *     role: "roles/cloudkms.cryptoKeyEncrypterDecrypter",
 *     member: project.then(project => `serviceAccount:service-${project.number}@gcp-sa-aiplatform.iam.gserviceaccount.com`),
 * });
 * const tensorboard = new gcp.vertex.AiTensorboard("tensorboard", {
 *     displayName: "terraform",
 *     description: "sample description",
 *     labels: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 *     region: "us-central1",
 *     encryptionSpec: {
 *         kmsKeyName: "kms-name",
 *     },
 * }, {
 *     dependsOn: [cryptoKey],
 * });
 * ```
 *
 * ## Import
 *
 * Tensorboard can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{region}}/tensorboards/{{name}}`
 *
 * * `{{project}}/{{region}}/{{name}}`
 *
 * * `{{region}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Tensorboard can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiTensorboard:AiTensorboard default projects/{{project}}/locations/{{region}}/tensorboards/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiTensorboard:AiTensorboard default {{project}}/{{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiTensorboard:AiTensorboard default {{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiTensorboard:AiTensorboard default {{name}}
 * ```
 */
export class AiTensorboard extends pulumi.CustomResource {
    /**
     * Get an existing AiTensorboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AiTensorboardState, opts?: pulumi.CustomResourceOptions): AiTensorboard {
        return new AiTensorboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:vertex/aiTensorboard:AiTensorboard';

    /**
     * Returns true if the given object is an instance of AiTensorboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AiTensorboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AiTensorboard.__pulumiType;
    }

    /**
     * Consumer project Cloud Storage path prefix used to store blob data, which can either be a bucket or directory. Does not end with a '/'.
     */
    public /*out*/ readonly blobStoragePathPrefix!: pulumi.Output<string>;
    /**
     * The timestamp of when the Tensorboard was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Description of this Tensorboard.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User provided name of this Tensorboard.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     * Structure is documented below.
     */
    public readonly encryptionSpec!: pulumi.Output<outputs.vertex.AiTensorboardEncryptionSpec | undefined>;
    /**
     * The labels with user-defined metadata to organize your Tensorboards.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the Tensorboard.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
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
     * The region of the tensorboard. eg us-central1
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The number of Runs stored in this Tensorboard.
     */
    public /*out*/ readonly runCount!: pulumi.Output<string>;
    /**
     * The timestamp of when the Tensorboard was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a AiTensorboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AiTensorboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AiTensorboardArgs | AiTensorboardState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AiTensorboardState | undefined;
            resourceInputs["blobStoragePathPrefix"] = state ? state.blobStoragePathPrefix : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["encryptionSpec"] = state ? state.encryptionSpec : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["runCount"] = state ? state.runCount : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as AiTensorboardArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["encryptionSpec"] = args ? args.encryptionSpec : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["blobStoragePathPrefix"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["runCount"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AiTensorboard.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AiTensorboard resources.
 */
export interface AiTensorboardState {
    /**
     * Consumer project Cloud Storage path prefix used to store blob data, which can either be a bucket or directory. Does not end with a '/'.
     */
    blobStoragePathPrefix?: pulumi.Input<string>;
    /**
     * The timestamp of when the Tensorboard was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Description of this Tensorboard.
     */
    description?: pulumi.Input<string>;
    /**
     * User provided name of this Tensorboard.
     */
    displayName?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     * Structure is documented below.
     */
    encryptionSpec?: pulumi.Input<inputs.vertex.AiTensorboardEncryptionSpec>;
    /**
     * The labels with user-defined metadata to organize your Tensorboards.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the Tensorboard.
     */
    name?: pulumi.Input<string>;
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
     * The region of the tensorboard. eg us-central1
     */
    region?: pulumi.Input<string>;
    /**
     * The number of Runs stored in this Tensorboard.
     */
    runCount?: pulumi.Input<string>;
    /**
     * The timestamp of when the Tensorboard was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AiTensorboard resource.
 */
export interface AiTensorboardArgs {
    /**
     * Description of this Tensorboard.
     */
    description?: pulumi.Input<string>;
    /**
     * User provided name of this Tensorboard.
     */
    displayName: pulumi.Input<string>;
    /**
     * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     * Structure is documented below.
     */
    encryptionSpec?: pulumi.Input<inputs.vertex.AiTensorboardEncryptionSpec>;
    /**
     * The labels with user-defined metadata to organize your Tensorboards.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region of the tensorboard. eg us-central1
     */
    region?: pulumi.Input<string>;
}
