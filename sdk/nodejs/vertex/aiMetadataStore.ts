// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Vertex Ai Metadata Store
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const store = new gcp.vertex.AiMetadataStore("store", {
 *     name: "test-store",
 *     description: "Store to test the terraform module",
 *     region: "us-central1",
 * });
 * ```
 *
 * ## Import
 *
 * MetadataStore can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{region}}/metadataStores/{{name}}`
 *
 * * `{{project}}/{{region}}/{{name}}`
 *
 * * `{{region}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, MetadataStore can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default projects/{{project}}/locations/{{region}}/metadataStores/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{project}}/{{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:vertex/aiMetadataStore:AiMetadataStore default {{name}}
 * ```
 */
export class AiMetadataStore extends pulumi.CustomResource {
    /**
     * Get an existing AiMetadataStore resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AiMetadataStoreState, opts?: pulumi.CustomResourceOptions): AiMetadataStore {
        return new AiMetadataStore(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:vertex/aiMetadataStore:AiMetadataStore';

    /**
     * Returns true if the given object is an instance of AiMetadataStore.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AiMetadataStore {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AiMetadataStore.__pulumiType;
    }

    /**
     * The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Description of the MetadataStore.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     */
    public readonly encryptionSpec!: pulumi.Output<outputs.vertex.AiMetadataStoreEncryptionSpec | undefined>;
    /**
     * The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The region of the Metadata Store. eg us-central1
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * State information of the MetadataStore.
     * Structure is documented below.
     */
    public /*out*/ readonly states!: pulumi.Output<outputs.vertex.AiMetadataStoreState[]>;
    /**
     * The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a AiMetadataStore resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AiMetadataStoreArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AiMetadataStoreArgs | AiMetadataStoreState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AiMetadataStoreState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encryptionSpec"] = state ? state.encryptionSpec : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["states"] = state ? state.states : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as AiMetadataStoreArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["encryptionSpec"] = args ? args.encryptionSpec : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["states"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AiMetadataStore.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AiMetadataStore resources.
 */
export interface AiMetadataStoreState {
    /**
     * The timestamp of when the MetadataStore was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Description of the MetadataStore.
     */
    description?: pulumi.Input<string>;
    /**
     * Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     */
    encryptionSpec?: pulumi.Input<inputs.vertex.AiMetadataStoreEncryptionSpec>;
    /**
     * The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region of the Metadata Store. eg us-central1
     */
    region?: pulumi.Input<string>;
    /**
     * State information of the MetadataStore.
     * Structure is documented below.
     */
    states?: pulumi.Input<pulumi.Input<inputs.vertex.AiMetadataStoreState>[]>;
    /**
     * The timestamp of when the MetadataStore was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AiMetadataStore resource.
 */
export interface AiMetadataStoreArgs {
    /**
     * Description of the MetadataStore.
     */
    description?: pulumi.Input<string>;
    /**
     * Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     */
    encryptionSpec?: pulumi.Input<inputs.vertex.AiMetadataStoreEncryptionSpec>;
    /**
     * The name of the MetadataStore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region of the Metadata Store. eg us-central1
     */
    region?: pulumi.Input<string>;
}
