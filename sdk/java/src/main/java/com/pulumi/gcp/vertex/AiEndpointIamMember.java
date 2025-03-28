// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiEndpointIamMemberArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberState;
import com.pulumi.gcp.vertex.outputs.AiEndpointIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="gcp:vertex/aiEndpointIamMember:AiEndpointIamMember")
public class AiEndpointIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={AiEndpointIamMemberCondition.class}, tree="[0]")
    private Output</* @Nullable */ AiEndpointIamMemberCondition> condition;

    public Output<Optional<AiEndpointIamMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    public Output<String> location() {
        return this.location;
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
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiEndpointIamMember(java.lang.String name) {
        this(name, AiEndpointIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiEndpointIamMember(java.lang.String name, AiEndpointIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiEndpointIamMember(java.lang.String name, AiEndpointIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpointIamMember:AiEndpointIamMember", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AiEndpointIamMember(java.lang.String name, Output<java.lang.String> id, @Nullable AiEndpointIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpointIamMember:AiEndpointIamMember", name, state, makeResourceOptions(options, id), false);
    }

    private static AiEndpointIamMemberArgs makeArgs(AiEndpointIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AiEndpointIamMemberArgs.Empty : args;
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
    public static AiEndpointIamMember get(java.lang.String name, Output<java.lang.String> id, @Nullable AiEndpointIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiEndpointIamMember(name, id, state, options);
    }
}
