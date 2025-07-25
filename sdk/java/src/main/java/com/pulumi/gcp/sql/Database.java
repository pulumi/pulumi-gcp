// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.sql.DatabaseArgs;
import com.pulumi.gcp.sql.inputs.DatabaseState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a SQL database inside the Cloud SQL instance, hosted in
 * Google&#39;s cloud.
 * 
 * ## Example Usage
 * 
 * ### Sql Database Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.sql.DatabaseInstance;
 * import com.pulumi.gcp.sql.DatabaseInstanceArgs;
 * import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs;
 * import com.pulumi.gcp.sql.Database;
 * import com.pulumi.gcp.sql.DatabaseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // See versions at https://registry.terraform.io/providers/hashicorp/google/latest/docs/resources/sql_database_instance#database_version
 *         var instance = new DatabaseInstance("instance", DatabaseInstanceArgs.builder()
 *             .name("my-database-instance")
 *             .region("us-central1")
 *             .databaseVersion("MYSQL_8_0")
 *             .settings(DatabaseInstanceSettingsArgs.builder()
 *                 .tier("db-f1-micro")
 *                 .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var database = new Database("database", DatabaseArgs.builder()
 *             .name("my-database")
 *             .instance(instance.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Sql Database Deletion Policy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.sql.DatabaseInstance;
 * import com.pulumi.gcp.sql.DatabaseInstanceArgs;
 * import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs;
 * import com.pulumi.gcp.sql.Database;
 * import com.pulumi.gcp.sql.DatabaseArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // See versions at https://registry.terraform.io/providers/hashicorp/google/latest/docs/resources/sql_database_instance#database_version
 *         var instance = new DatabaseInstance("instance", DatabaseInstanceArgs.builder()
 *             .name("my-database-instance")
 *             .region("us-central1")
 *             .databaseVersion("POSTGRES_14")
 *             .settings(DatabaseInstanceSettingsArgs.builder()
 *                 .tier("db-g1-small")
 *                 .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var databaseDeletionPolicy = new Database("databaseDeletionPolicy", DatabaseArgs.builder()
 *             .name("my-database")
 *             .instance(instance.name())
 *             .deletionPolicy("ABANDON")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Database can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/instances/{{instance}}/databases/{{name}}`
 * 
 * * `instances/{{instance}}/databases/{{name}}`
 * 
 * * `{{project}}/{{instance}}/{{name}}`
 * 
 * * `{{instance}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Database can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:sql/database:Database default projects/{{project}}/instances/{{instance}}/databases/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:sql/database:Database default instances/{{instance}}/databases/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:sql/database:Database default {{project}}/{{instance}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:sql/database:Database default {{instance}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:sql/database:Database default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:sql/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * The charset value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    @Export(name="charset", refs={String.class}, tree="[0]")
    private Output<String> charset;

    /**
     * @return The charset value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    public Output<String> charset() {
        return this.charset;
    }
    /**
     * The collation value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    @Export(name="collation", refs={String.class}, tree="[0]")
    private Output<String> collation;

    /**
     * @return The collation value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    public Output<String> collation() {
        return this.collation;
    }
    /**
     * The deletion policy for the database. Setting ABANDON allows the resource
     * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
     * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
     * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
     * 
     */
    @Export(name="deletionPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deletionPolicy;

    /**
     * @return The deletion policy for the database. Setting ABANDON allows the resource
     * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
     * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
     * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
     * 
     */
    public Output<Optional<String>> deletionPolicy() {
        return Codegen.optional(this.deletionPolicy);
    }
    /**
     * The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output<String> instance;

    /**
     * @return The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    /**
     * The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(java.lang.String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(java.lang.String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(java.lang.String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/database:Database", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Database(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sql/database:Database", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseArgs makeArgs(DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
