import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a RuntimeConfig variable in Google Cloud. For more information, see the
 * [official documentation](https://cloud.google.com/deployment-manager/runtime-configurator/),
 * or the
 * [JSON API](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/).
 *
 * ## Example Usage
 *
 * Example creating a RuntimeConfig variable.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_runtime_config = new gcp.runtimeconfig.Config("my-runtime-config", {
 *     description: "Runtime configuration values for my service",
 * });
 * const environment = new gcp.runtimeconfig.Variavble("environment", {
 *     parent: my_runtime_config.name,
 *     text: "example.com",
 * });
 * ```
 *
 * You can also encode binary content using the `value` argument instead. The
 * value must be base64 encoded.
 *
 * Example of using the `value` argument.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_runtime_config = new gcp.runtimeconfig.Config("my-runtime-config", {
 *     description: "Runtime configuration values for my service",
 * });
 * const my_secret = new gcp.runtimeconfig.Variavble("my-secret", {
 *     parent: my_runtime_config.name,
 *     value: Buffer.from(fs.readFileSync("my-encrypted-secret.dat", "utf-8")).toString("base64"),
 * });
 * ```
 */
export declare class Variavble extends pulumi.CustomResource {
    /**
     * Get an existing Variavble resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VariavbleState, opts?: pulumi.CustomResourceOptions): Variavble;
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    readonly name: pulumi.Output<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    readonly parent: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly text: pulumi.Output<string | undefined>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: "2016-10-09T12:33:37.578138407Z".
     */
    readonly updateTime: pulumi.Output<string>;
    readonly value: pulumi.Output<string | undefined>;
    /**
     * Create a Variavble resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VariavbleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Variavble resources.
 */
export interface VariavbleState {
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    readonly parent?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly text?: pulumi.Input<string>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: "2016-10-09T12:33:37.578138407Z".
     */
    readonly updateTime?: pulumi.Input<string>;
    readonly value?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Variavble resource.
 */
export interface VariavbleArgs {
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    readonly parent: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly text?: pulumi.Input<string>;
    readonly value?: pulumi.Input<string>;
}
