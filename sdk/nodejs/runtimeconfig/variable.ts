// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * Example creating a RuntimeConfig variable.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_runtime_config = new gcp.runtimeconfig.Config("my-runtime-config", {
 *     name: "my-service-runtime-config",
 *     description: "Runtime configuration values for my service",
 * });
 * const environment = new gcp.runtimeconfig.Variable("environment", {
 *     parent: my_runtime_config.name,
 *     name: "prod-variables/hostname",
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
 * import * as gcp from "@pulumi/gcp";
 * import * as std from "@pulumi/std";
 *
 * const my_runtime_config = new gcp.runtimeconfig.Config("my-runtime-config", {
 *     name: "my-service-runtime-config",
 *     description: "Runtime configuration values for my service",
 * });
 * const my_secret = new gcp.runtimeconfig.Variable("my-secret", {
 *     parent: my_runtime_config.name,
 *     name: "secret",
 *     value: std.filebase64({
 *         input: "my-encrypted-secret.dat",
 *     }).then(invoke => invoke.result),
 * });
 * ```
 *
 * ## Import
 *
 * Runtime Config Variables can be imported using the `name` or full variable name, e.g.
 *
 * * `projects/my-gcp-project/configs/{{config_id}}/variables/{{name}}`
 *
 * * `{{config_id}}/{{name}}`
 *
 * When using the `pulumi import` command, Runtime Config Variables can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:runtimeconfig/variable:Variable default projects/my-gcp-project/configs/{{config_id}}/variables/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:runtimeconfig/variable:Variable default {{config_id}}/{{name}}
 * ```
 *
 * When importing using only the name, the provider project must be set.
 */
export class Variable extends pulumi.CustomResource {
    /**
     * Get an existing Variable resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VariableState, opts?: pulumi.CustomResourceOptions): Variable {
        return new Variable(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:runtimeconfig/variable:Variable';

    /**
     * Returns true if the given object is an instance of Variable.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Variable {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Variable.__pulumiType;
    }

    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    public readonly parent!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     *
     * - - -
     */
    public readonly text!: pulumi.Output<string | undefined>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: "2016-10-09T12:33:37.578138407Z".
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    public readonly value!: pulumi.Output<string | undefined>;

    /**
     * Create a Variable resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VariableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VariableArgs | VariableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VariableState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["text"] = state ? state.text : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as VariableArgs | undefined;
            if ((!args || args.parent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parent'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["text"] = args?.text ? pulumi.secret(args.text) : undefined;
            resourceInputs["value"] = args?.value ? pulumi.secret(args.value) : undefined;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["text", "value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Variable.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Variable resources.
 */
export interface VariableState {
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    parent?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     *
     * - - -
     */
    text?: pulumi.Input<string>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format,
     * accurate to nanoseconds, representing when the variable was last updated.
     * Example: "2016-10-09T12:33:37.578138407Z".
     */
    updateTime?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Variable resource.
 */
export interface VariableArgs {
    /**
     * The name of the variable to manage. Note that variable
     * names can be hierarchical using slashes (e.g. "prod-variables/hostname").
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the RuntimeConfig resource containing this
     * variable.
     */
    parent: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * or `value` - (Required) The content to associate with the variable.
     * Exactly one of `text` or `variable` must be specified. If `text` is specified,
     * it must be a valid UTF-8 string and less than 4096 bytes in length. If `value`
     * is specified, it must be base64 encoded and less than 4096 bytes in length.
     *
     * - - -
     */
    text?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}
