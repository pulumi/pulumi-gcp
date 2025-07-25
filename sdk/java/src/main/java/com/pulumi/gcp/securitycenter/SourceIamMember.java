// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.SourceIamMemberArgs;
import com.pulumi.gcp.securitycenter.inputs.SourceIamMemberState;
import com.pulumi.gcp.securitycenter.outputs.SourceIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
 * source is an entity or a mechanism that can produce a finding. A source is
 * like a container of findings that come from the same scanner, logger,
 * monitor, etc.
 * 
 * To get more information about Source, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
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
 * Source can be imported using any of these accepted formats:
 * 
 * * `organizations/{{organization}}/sources/{{name}}`
 * 
 * * `{{organization}}/{{name}}`
 * 
 * When using the `pulumi import` command, Source can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/sourceIamMember:SourceIamMember default organizations/{{organization}}/sources/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/sourceIamMember:SourceIamMember default {{organization}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/sourceIamMember:SourceIamMember")
public class SourceIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={SourceIamMemberCondition.class}, tree="[0]")
    private Output</* @Nullable */ SourceIamMemberCondition> condition;

    public Output<Optional<SourceIamMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", refs={String.class}, tree="[0]")
    private Output<String> member;

    public Output<String> member() {
        return this.member;
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
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SourceIamMember(java.lang.String name) {
        this(name, SourceIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SourceIamMember(java.lang.String name, SourceIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SourceIamMember(java.lang.String name, SourceIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/sourceIamMember:SourceIamMember", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SourceIamMember(java.lang.String name, Output<java.lang.String> id, @Nullable SourceIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/sourceIamMember:SourceIamMember", name, state, makeResourceOptions(options, id), false);
    }

    private static SourceIamMemberArgs makeArgs(SourceIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SourceIamMemberArgs.Empty : args;
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
    public static SourceIamMember get(java.lang.String name, Output<java.lang.String> id, @Nullable SourceIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SourceIamMember(name, id, state, options);
    }
}
