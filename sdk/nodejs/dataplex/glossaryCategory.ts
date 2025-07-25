// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Represents a collection of categories and terms within a Glossary that are related to each other.
 *
 * ## Example Usage
 *
 * ### Dataplex Glossary Category Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const categoryTestId = new gcp.dataplex.Glossary("category_test_id", {
 *     glossaryId: "tf-test-glossary_64336",
 *     location: "us-central1",
 * });
 * const categoryTestIdGlossaryCategory = new gcp.dataplex.GlossaryCategory("category_test_id", {
 *     parent: pulumi.interpolate`projects/${categoryTestId.project}/locations/us-central1/glossaries/${categoryTestId.glossaryId}`,
 *     glossaryId: categoryTestId.glossaryId,
 *     location: "us-central1",
 *     categoryId: "tf-test-category-basic_34962",
 * });
 * ```
 * ### Dataplex Glossary Category Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const categoryTestIdFull = new gcp.dataplex.Glossary("category_test_id_full", {
 *     glossaryId: "tf-test-glossary_74000",
 *     location: "us-central1",
 * });
 * const categoryTestIdFullGlossaryCategory = new gcp.dataplex.GlossaryCategory("category_test_id_full", {
 *     parent: pulumi.interpolate`projects/${categoryTestIdFull.project}/locations/us-central1/glossaries/${categoryTestIdFull.glossaryId}`,
 *     glossaryId: categoryTestIdFull.glossaryId,
 *     location: "us-central1",
 *     categoryId: "tf-test-category-full_75125",
 *     labels: {
 *         tag: "test-tf",
 *     },
 *     displayName: "terraform category",
 *     description: "category created by Terraform",
 * });
 * ```
 *
 * ## Import
 *
 * GlossaryCategory can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}/categories/{{category_id}}`
 *
 * * `{{project}}/{{location}}/{{glossary_id}}/{{category_id}}`
 *
 * * `{{location}}/{{glossary_id}}/{{category_id}}`
 *
 * When using the `pulumi import` command, GlossaryCategory can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:dataplex/glossaryCategory:GlossaryCategory default projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}/categories/{{category_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataplex/glossaryCategory:GlossaryCategory default {{project}}/{{location}}/{{glossary_id}}/{{category_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataplex/glossaryCategory:GlossaryCategory default {{location}}/{{glossary_id}}/{{category_id}}
 * ```
 */
export class GlossaryCategory extends pulumi.CustomResource {
    /**
     * Get an existing GlossaryCategory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlossaryCategoryState, opts?: pulumi.CustomResourceOptions): GlossaryCategory {
        return new GlossaryCategory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataplex/glossaryCategory:GlossaryCategory';

    /**
     * Returns true if the given object is an instance of GlossaryCategory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlossaryCategory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlossaryCategory.__pulumiType;
    }

    /**
     * The category id for creation.
     */
    public readonly categoryId!: pulumi.Output<string | undefined>;
    /**
     * The time at which the GlossaryCategory was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The user-mutable description of the GlossaryCategory.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User friendly display name of the GlossaryCategory. This is user-mutable. This will be same as the categoryId, if not specified.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The glossary id for creation.
     */
    public readonly glossaryId!: pulumi.Output<string | undefined>;
    /**
     * User-defined labels for the GlossaryCategory.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the glossary category should reside.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The resource name of the GlossaryCategory. Format: projects/{projectId}/locations/{locationId}/glossaries/{glossaryId}/categories/{categoryId}
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The immediate parent of the GlossaryCategory in the resource-hierarchy. It can either be a Glossary or a Category. Format: projects/{projectId}/locations/{locationId}/glossaries/{glossaryId} OR projects/{projectId}/locations/{locationId}/glossaries/{glossaryId}/categories/{categoryId}
     */
    public readonly parent!: pulumi.Output<string>;
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
     * System generated unique id for the GlossaryCategory. This ID will be different if the GlossaryCategory is deleted and re-created with the same name.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * The time at which the GlossaryCategory was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a GlossaryCategory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlossaryCategoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlossaryCategoryArgs | GlossaryCategoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlossaryCategoryState | undefined;
            resourceInputs["categoryId"] = state ? state.categoryId : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["glossaryId"] = state ? state.glossaryId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as GlossaryCategoryArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.parent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parent'");
            }
            resourceInputs["categoryId"] = args ? args.categoryId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["glossaryId"] = args ? args.glossaryId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(GlossaryCategory.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlossaryCategory resources.
 */
export interface GlossaryCategoryState {
    /**
     * The category id for creation.
     */
    categoryId?: pulumi.Input<string>;
    /**
     * The time at which the GlossaryCategory was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The user-mutable description of the GlossaryCategory.
     */
    description?: pulumi.Input<string>;
    /**
     * User friendly display name of the GlossaryCategory. This is user-mutable. This will be same as the categoryId, if not specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The glossary id for creation.
     */
    glossaryId?: pulumi.Input<string>;
    /**
     * User-defined labels for the GlossaryCategory.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the glossary category should reside.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the GlossaryCategory. Format: projects/{projectId}/locations/{locationId}/glossaries/{glossaryId}/categories/{categoryId}
     */
    name?: pulumi.Input<string>;
    /**
     * The immediate parent of the GlossaryCategory in the resource-hierarchy. It can either be a Glossary or a Category. Format: projects/{projectId}/locations/{locationId}/glossaries/{glossaryId} OR projects/{projectId}/locations/{locationId}/glossaries/{glossaryId}/categories/{categoryId}
     */
    parent?: pulumi.Input<string>;
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
     * System generated unique id for the GlossaryCategory. This ID will be different if the GlossaryCategory is deleted and re-created with the same name.
     */
    uid?: pulumi.Input<string>;
    /**
     * The time at which the GlossaryCategory was last updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GlossaryCategory resource.
 */
export interface GlossaryCategoryArgs {
    /**
     * The category id for creation.
     */
    categoryId?: pulumi.Input<string>;
    /**
     * The user-mutable description of the GlossaryCategory.
     */
    description?: pulumi.Input<string>;
    /**
     * User friendly display name of the GlossaryCategory. This is user-mutable. This will be same as the categoryId, if not specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The glossary id for creation.
     */
    glossaryId?: pulumi.Input<string>;
    /**
     * User-defined labels for the GlossaryCategory.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the glossary category should reside.
     */
    location: pulumi.Input<string>;
    /**
     * The immediate parent of the GlossaryCategory in the resource-hierarchy. It can either be a Glossary or a Category. Format: projects/{projectId}/locations/{locationId}/glossaries/{glossaryId} OR projects/{projectId}/locations/{locationId}/glossaries/{glossaryId}/categories/{categoryId}
     */
    parent: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
