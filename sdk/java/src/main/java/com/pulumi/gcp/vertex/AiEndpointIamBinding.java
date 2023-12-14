// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiEndpointIamBindingArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingState;
import com.pulumi.gcp.vertex.outputs.AiEndpointIamBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="gcp:vertex/aiEndpointIamBinding:AiEndpointIamBinding")
public class AiEndpointIamBinding extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={AiEndpointIamBindingCondition.class}, tree="[0]")
    private Output</* @Nullable */ AiEndpointIamBindingCondition> condition;

    public Output<Optional<AiEndpointIamBindingCondition>> condition() {
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
    @Export(name="members", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
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
    public AiEndpointIamBinding(String name) {
        this(name, AiEndpointIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiEndpointIamBinding(String name, AiEndpointIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiEndpointIamBinding(String name, AiEndpointIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpointIamBinding:AiEndpointIamBinding", name, args == null ? AiEndpointIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AiEndpointIamBinding(String name, Output<String> id, @Nullable AiEndpointIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpointIamBinding:AiEndpointIamBinding", name, state, makeResourceOptions(options, id));
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
    public static AiEndpointIamBinding get(String name, Output<String> id, @Nullable AiEndpointIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiEndpointIamBinding(name, id, state, options);
    }
}