import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new Google SQL User on a Google SQL User Instance. For more information, see the [official documentation](https://cloud.google.com/sql/), or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/users).
 *
 * > **Note:** All arguments including the username and password will be stored in the raw state as plain-text.
 * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html). Passwords will not be retrieved when running
 * "terraform import".
 *
 * ## Example Usage
 *
 * Example creating a SQL User.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const master = new gcp.sql.DatabaseInstance("master", {
 *     settings: {
 *         tier: "D0",
 *     },
 * });
 * const users = new gcp.sql.User("users", {
 *     host: "me.com",
 *     instance: master.name,
 *     password: "changeme",
 * });
 * ```
 */
export declare class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User;
    /**
     * The host the user can connect from. This is only supported
     * for MySQL instances. Don't set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     */
    readonly host: pulumi.Output<string | undefined>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance: pulumi.Output<string>;
    /**
     * The name of the user. Changing this forces a new resource
     * to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The password for the user. Can be updated.
     */
    readonly password: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The host the user can connect from. This is only supported
     * for MySQL instances. Don't set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     */
    readonly host?: pulumi.Input<string>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance?: pulumi.Input<string>;
    /**
     * The name of the user. Changing this forces a new resource
     * to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The password for the user. Can be updated.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The host the user can connect from. This is only supported
     * for MySQL instances. Don't set this field for PostgreSQL instances.
     * Can be an IP address. Changing this forces a new resource to be created.
     */
    readonly host?: pulumi.Input<string>;
    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     */
    readonly instance: pulumi.Input<string>;
    /**
     * The name of the user. Changing this forces a new resource
     * to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The password for the user. Can be updated.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
