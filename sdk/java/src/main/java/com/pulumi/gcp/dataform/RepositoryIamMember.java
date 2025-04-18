// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataform.RepositoryIamMemberArgs;
import com.pulumi.gcp.dataform.inputs.RepositoryIamMemberState;
import com.pulumi.gcp.dataform.outputs.RepositoryIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="gcp:dataform/repositoryIamMember:RepositoryIamMember")
public class RepositoryIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={RepositoryIamMemberCondition.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryIamMemberCondition> condition;

    public Output<Optional<RepositoryIamMemberCondition>> condition() {
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
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryIamMember(java.lang.String name) {
        this(name, RepositoryIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryIamMember(java.lang.String name, RepositoryIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryIamMember(java.lang.String name, RepositoryIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataform/repositoryIamMember:RepositoryIamMember", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RepositoryIamMember(java.lang.String name, Output<java.lang.String> id, @Nullable RepositoryIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataform/repositoryIamMember:RepositoryIamMember", name, state, makeResourceOptions(options, id), false);
    }

    private static RepositoryIamMemberArgs makeArgs(RepositoryIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RepositoryIamMemberArgs.Empty : args;
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
    public static RepositoryIamMember get(java.lang.String name, Output<java.lang.String> id, @Nullable RepositoryIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryIamMember(name, id, state, options);
    }
}
