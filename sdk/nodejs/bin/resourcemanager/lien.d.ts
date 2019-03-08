import * as pulumi from "@pulumi/pulumi";
/**
 * A Lien represents an encumbrance on the actions that can be performed on a resource.
 *
 *
 *
 * ## Example Usage - Resource Manager Lien
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = new gcp.organizations.Project("project", {
 *     projectId: "staging-project",
 * });
 * const lien = new gcp.resourcemanager.Lien("lien", {
 *     origin: "machine-readable-explanation",
 *     parent: project.number.apply(number => `projects/${number}`),
 *     reason: "This project is an important environment",
 *     restrictions: ["resourcemanager.projects.delete"],
 * });
 * ```
 */
export declare class Lien extends pulumi.CustomResource {
    /**
     * Get an existing Lien resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LienState, opts?: pulumi.CustomResourceOptions): Lien;
    readonly createTime: pulumi.Output<string>;
    readonly name: pulumi.Output<string>;
    readonly origin: pulumi.Output<string>;
    readonly parent: pulumi.Output<string>;
    readonly reason: pulumi.Output<string>;
    readonly restrictions: pulumi.Output<string[]>;
    /**
     * Create a Lien resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LienArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Lien resources.
 */
export interface LienState {
    readonly createTime?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly origin?: pulumi.Input<string>;
    readonly parent?: pulumi.Input<string>;
    readonly reason?: pulumi.Input<string>;
    readonly restrictions?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Lien resource.
 */
export interface LienArgs {
    readonly origin: pulumi.Input<string>;
    readonly parent: pulumi.Input<string>;
    readonly reason: pulumi.Input<string>;
    readonly restrictions: pulumi.Input<pulumi.Input<string>[]>;
}
