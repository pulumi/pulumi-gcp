import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new Google SQL Database on a Google SQL Database Instance. For more information, see
 * the [official documentation](https://cloud.google.com/sql/),
 * or the [JSON API](https://cloud.google.com/sql/docs/admin-api/v1beta4/databases).
 *
 * ## Example Usage
 *
 * Example creating a SQL Database.
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
 * const users = new gcp.sql.Database("users", {
 *     charset: "latin1",
 *     collation: "latin1_swedish_ci",
 *     instance: master.name,
 * });
 * ```
 */
export declare class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState, opts?: pulumi.CustomResourceOptions): Database;
    /**
     * The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `charset` support; they only support a value of `UTF8` at creation time.
     */
    readonly charset: pulumi.Output<string>;
    /**
     * The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `collation` support; they only support a value of `en_US.UTF8` at creation time.
     */
    readonly collation: pulumi.Output<string>;
    /**
     * The name of containing instance.
     */
    readonly instance: pulumi.Output<string>;
    /**
     * The name of the database.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    /**
     * The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `charset` support; they only support a value of `UTF8` at creation time.
     */
    readonly charset?: pulumi.Input<string>;
    /**
     * The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `collation` support; they only support a value of `en_US.UTF8` at creation time.
     */
    readonly collation?: pulumi.Input<string>;
    /**
     * The name of containing instance.
     */
    readonly instance?: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    /**
     * The charset value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `charset` support; they only support a value of `UTF8` at creation time.
     */
    readonly charset?: pulumi.Input<string>;
    /**
     * The collation value. See MySQL's
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres' [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases are in beta
     * and have limited `collation` support; they only support a value of `en_US.UTF8` at creation time.
     */
    readonly collation?: pulumi.Input<string>;
    /**
     * The name of containing instance.
     */
    readonly instance: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
