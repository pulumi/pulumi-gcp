// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networksecurity.AddressGroupIamBindingArgs;
import com.pulumi.gcp.networksecurity.inputs.AddressGroupIamBindingState;
import com.pulumi.gcp.networksecurity.outputs.AddressGroupIamBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="gcp:networksecurity/addressGroupIamBinding:AddressGroupIamBinding")
public class AddressGroupIamBinding extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={AddressGroupIamBindingCondition.class}, tree="[0]")
    private Output</* @Nullable */ AddressGroupIamBindingCondition> condition;

    public Output<Optional<AddressGroupIamBindingCondition>> condition() {
        return Codegen.optional(this.condition);
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
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
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
    public AddressGroupIamBinding(String name) {
        this(name, AddressGroupIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AddressGroupIamBinding(String name, AddressGroupIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AddressGroupIamBinding(String name, AddressGroupIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/addressGroupIamBinding:AddressGroupIamBinding", name, args == null ? AddressGroupIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AddressGroupIamBinding(String name, Output<String> id, @Nullable AddressGroupIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/addressGroupIamBinding:AddressGroupIamBinding", name, state, makeResourceOptions(options, id));
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
    public static AddressGroupIamBinding get(String name, Output<String> id, @Nullable AddressGroupIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AddressGroupIamBinding(name, id, state, options);
    }
}
