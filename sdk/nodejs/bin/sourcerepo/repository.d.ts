import * as pulumi from "@pulumi/pulumi";
export declare class Repository extends pulumi.CustomResource {
    /**
     * Get an existing Repository resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RepositoryState, opts?: pulumi.CustomResourceOptions): Repository;
    readonly name: pulumi.Output<string>;
    readonly project: pulumi.Output<string>;
    readonly size: pulumi.Output<number>;
    readonly url: pulumi.Output<string>;
    /**
     * Create a Repository resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RepositoryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Repository resources.
 */
export interface RepositoryState {
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly size?: pulumi.Input<number>;
    readonly url?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Repository resource.
 */
export interface RepositoryArgs {
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
}
