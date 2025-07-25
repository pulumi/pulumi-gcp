// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datacatalog.TaxonomyArgs;
import com.pulumi.gcp.datacatalog.inputs.TaxonomyState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A collection of policy tags that classify data along a common axis.
 * 
 * To get more information about Taxonomy, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.taxonomies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ### Data Catalog Taxonomy Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datacatalog.Taxonomy;
 * import com.pulumi.gcp.datacatalog.TaxonomyArgs;
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
 *         var basicTaxonomy = new Taxonomy("basicTaxonomy", TaxonomyArgs.builder()
 *             .displayName("my_taxonomy")
 *             .description("A collection of policy tags")
 *             .activatedPolicyTypes("FINE_GRAINED_ACCESS_CONTROL")
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
 * Taxonomy can be imported using any of these accepted formats:
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Taxonomy can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:datacatalog/taxonomy:Taxonomy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/taxonomy:Taxonomy")
public class Taxonomy extends com.pulumi.resources.CustomResource {
    /**
     * A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of: `POLICY_TYPE_UNSPECIFIED`, `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    @Export(name="activatedPolicyTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> activatedPolicyTypes;

    /**
     * @return A list of policy types that are activated for this taxonomy. If not set,
     * defaults to an empty list.
     * Each value may be one of: `POLICY_TYPE_UNSPECIFIED`, `FINE_GRAINED_ACCESS_CONTROL`.
     * 
     */
    public Output<Optional<List<String>>> activatedPolicyTypes() {
        return Codegen.optional(this.activatedPolicyTypes);
    }
    /**
     * Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this taxonomy. It must: contain only unicode characters,
     * tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes
     * long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * User defined name of this taxonomy.
     * The taxonomy display name must be unique within an organization.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return User defined name of this taxonomy.
     * The taxonomy display name must be unique within an organization.
     * It must: contain only unicode letters, numbers, underscores, dashes
     * and spaces; not start or end with spaces; and be at most 200 bytes
     * long when encoded in UTF-8.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource name of this taxonomy, whose format is:
     * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}&#34;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Resource name of this taxonomy, whose format is:
     * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}&#34;.
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
     * Taxonomy location region.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Taxonomy location region.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Taxonomy(java.lang.String name) {
        this(name, TaxonomyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Taxonomy(java.lang.String name, TaxonomyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Taxonomy(java.lang.String name, TaxonomyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomy:Taxonomy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Taxonomy(java.lang.String name, Output<java.lang.String> id, @Nullable TaxonomyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/taxonomy:Taxonomy", name, state, makeResourceOptions(options, id), false);
    }

    private static TaxonomyArgs makeArgs(TaxonomyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TaxonomyArgs.Empty : args;
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
    public static Taxonomy get(java.lang.String name, Output<java.lang.String> id, @Nullable TaxonomyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Taxonomy(name, id, state, options);
    }
}
