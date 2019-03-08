import * as pulumi from "@pulumi/pulumi";
/**
 * The provider type for the google-beta package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://pulumi.io/reference/programming-model.html#providers) for more information.
 */
export declare class Provider extends pulumi.ProviderResource {
    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions);
}
/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    readonly accessToken?: pulumi.Input<string>;
    readonly credentials?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly scopes?: pulumi.Input<pulumi.Input<string>[]>;
    readonly zone?: pulumi.Input<string>;
}
