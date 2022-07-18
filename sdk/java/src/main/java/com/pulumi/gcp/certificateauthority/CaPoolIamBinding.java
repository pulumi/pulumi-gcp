// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingState;
import com.pulumi.gcp.certificateauthority.outputs.CaPoolIamBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/locations/{{location}}/caPools/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} Any variables not passed in the import command will be taken from the provider configuration. Certificate Authority Service capool IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding editor projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding")
public class CaPoolIamBinding extends com.pulumi.resources.CustomResource {
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="caPool", type=String.class, parameters={})
    private Output<String> caPool;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> caPool() {
        return this.caPool;
    }
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Export(name="condition", type=CaPoolIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ CaPoolIamBindingCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CaPoolIamBindingCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CaPoolIamBinding(String name) {
        this(name, CaPoolIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CaPoolIamBinding(String name, CaPoolIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CaPoolIamBinding(String name, CaPoolIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding", name, args == null ? CaPoolIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CaPoolIamBinding(String name, Output<String> id, @Nullable CaPoolIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static CaPoolIamBinding get(String name, Output<String> id, @Nullable CaPoolIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CaPoolIamBinding(name, id, state, options);
    }
}