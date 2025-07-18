// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.V2OrganizationSourceArgs;
import com.pulumi.gcp.securitycenter.inputs.V2OrganizationSourceState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
 * source is an entity or a mechanism that can produce a finding. A source is
 * like a container of findings that come from the same scanner, logger,
 * monitor, etc.
 * 
 * To get more information about OrganizationSource, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/organizations.sources)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 * 
 * ## Example Usage
 * 
 * ### Scc Source Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.securitycenter.Source;
 * import com.pulumi.gcp.securitycenter.SourceArgs;
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
 *         var customSource = new Source("customSource", SourceArgs.builder()
 *             .displayName("My Source")
 *             .organization("123456789")
 *             .description("My custom Cloud Security Command Center Finding Source")
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
 * OrganizationSource can be imported using any of these accepted formats:
 * 
 * * `organizations/{{organization}}/sources/{{name}}`
 * 
 * * `{{organization}}/{{name}}`
 * 
 * When using the `pulumi import` command, OrganizationSource can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default organizations/{{organization}}/sources/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/v2OrganizationSource:V2OrganizationSource default {{organization}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/v2OrganizationSource:V2OrganizationSource")
public class V2OrganizationSource extends com.pulumi.resources.CustomResource {
    /**
     * The description of the source (max of 1024 characters).
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the source (max of 1024 characters).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The source’s display name. A source’s display name must be unique
     * amongst its siblings, for example, two sources with the same parent
     * can&#39;t share the same display name. The display name must start and end
     * with a letter or digit, may contain letters, digits, spaces, hyphens,
     * and underscores, and can be no longer than 32 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The source’s display name. A source’s display name must be unique
     * amongst its siblings, for example, two sources with the same parent
     * can&#39;t share the same display name. The display name must start and end
     * with a letter or digit, may contain letters, digits, spaces, hyphens,
     * and underscores, and can be no longer than 32 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The resource name of this source, in the format
     * `organizations/{{organization}}/sources/{{source}}`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of this source, in the format
     * `organizations/{{organization}}/sources/{{source}}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization whose Cloud Security Command Center the Source
     * lives in.
     * 
     */
    @Export(name="organization", refs={String.class}, tree="[0]")
    private Output<String> organization;

    /**
     * @return The organization whose Cloud Security Command Center the Source
     * lives in.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public V2OrganizationSource(java.lang.String name) {
        this(name, V2OrganizationSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public V2OrganizationSource(java.lang.String name, V2OrganizationSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public V2OrganizationSource(java.lang.String name, V2OrganizationSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/v2OrganizationSource:V2OrganizationSource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private V2OrganizationSource(java.lang.String name, Output<java.lang.String> id, @Nullable V2OrganizationSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/v2OrganizationSource:V2OrganizationSource", name, state, makeResourceOptions(options, id), false);
    }

    private static V2OrganizationSourceArgs makeArgs(V2OrganizationSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? V2OrganizationSourceArgs.Empty : args;
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
    public static V2OrganizationSource get(java.lang.String name, Output<java.lang.String> id, @Nullable V2OrganizationSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new V2OrganizationSource(name, id, state, options);
    }
}
