// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkehub.MembershipBindingArgs;
import com.pulumi.gcp.gkehub.outputs.MembershipBindingState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * MembershipBinding is a subresource of a Membership, representing what Fleet Scopes (or other, future Fleet resources) a Membership is bound to.
 * 
 * To get more information about MembershipBinding, see:
 * 
 * * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.memberships.bindings)
 * * How-to Guides
 *     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MembershipBinding can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}/bindings/{{membership_binding_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default {{project}}/{{location}}/{{membership_id}}/{{membership_binding_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default {{location}}/{{membership_id}}/{{membership_binding_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/membershipBinding:MembershipBinding")
public class MembershipBinding extends com.pulumi.resources.CustomResource {
    /**
     * Time the MembershipBinding was created in UTC.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the MembershipBinding was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Time the MembershipBinding was deleted in UTC.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Time the MembershipBinding was deleted in UTC.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * Location of the membership
     * 
     * ***
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the membership
     * 
     * ***
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The client-provided identifier of the membership binding.
     * 
     */
    @Export(name="membershipBindingId", type=String.class, parameters={})
    private Output<String> membershipBindingId;

    /**
     * @return The client-provided identifier of the membership binding.
     * 
     */
    public Output<String> membershipBindingId() {
        return this.membershipBindingId;
    }
    /**
     * Id of the membership
     * 
     */
    @Export(name="membershipId", type=String.class, parameters={})
    private Output<String> membershipId;

    /**
     * @return Id of the membership
     * 
     */
    public Output<String> membershipId() {
        return this.membershipId;
    }
    /**
     * The resource name for the membershipbinding itself
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the membershipbinding itself
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
    @Export(name="project", type=String.class, parameters={})
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
     * A Workspace resource name in the format
     * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return A Workspace resource name in the format
     * `projects/*{@literal /}locations/*{@literal /}scopes/*`.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * State of the membership binding resource.
     * Structure is documented below.
     * 
     */
    @Export(name="states", type=List.class, parameters={MembershipBindingState.class})
    private Output<List<MembershipBindingState>> states;

    /**
     * @return State of the membership binding resource.
     * Structure is documented below.
     * 
     */
    public Output<List<MembershipBindingState>> states() {
        return this.states;
    }
    /**
     * Google-generated UUID for this resource.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Google-generated UUID for this resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Time the MembershipBinding was updated in UTC.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the MembershipBinding was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MembershipBinding(String name) {
        this(name, MembershipBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MembershipBinding(String name, MembershipBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MembershipBinding(String name, MembershipBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membershipBinding:MembershipBinding", name, args == null ? MembershipBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MembershipBinding(String name, Output<String> id, @Nullable com.pulumi.gcp.gkehub.inputs.MembershipBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membershipBinding:MembershipBinding", name, state, makeResourceOptions(options, id));
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
    public static MembershipBinding get(String name, Output<String> id, @Nullable com.pulumi.gcp.gkehub.inputs.MembershipBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MembershipBinding(name, id, state, options);
    }
}