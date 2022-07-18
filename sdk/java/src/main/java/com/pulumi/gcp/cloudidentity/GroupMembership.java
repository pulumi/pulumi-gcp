// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudidentity.GroupMembershipArgs;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState;
import com.pulumi.gcp.cloudidentity.outputs.GroupMembershipMemberKey;
import com.pulumi.gcp.cloudidentity.outputs.GroupMembershipPreferredMemberKey;
import com.pulumi.gcp.cloudidentity.outputs.GroupMembershipRole;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Membership defines a relationship between a Group and an entity belonging to that Group, referred to as a &#34;member&#34;.
 * 
 * To get more information about GroupMembership, see:
 * 
 * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * ### Cloud Identity Group Membership
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var group = new Group(&#34;group&#34;, GroupArgs.builder()        
 *             .displayName(&#34;my-identity-group&#34;)
 *             .parent(&#34;customers/A01b123xz&#34;)
 *             .groupKey(GroupGroupKeyArgs.builder()
 *                 .id(&#34;my-identity-group@example.com&#34;)
 *                 .build())
 *             .labels(Map.of(&#34;cloudidentity.googleapis.com/groups.discussion_forum&#34;, &#34;&#34;))
 *             .build());
 * 
 *         var child_group = new Group(&#34;child-group&#34;, GroupArgs.builder()        
 *             .displayName(&#34;my-identity-group-child&#34;)
 *             .parent(&#34;customers/A01b123xz&#34;)
 *             .groupKey(GroupGroupKeyArgs.builder()
 *                 .id(&#34;my-identity-group-child@example.com&#34;)
 *                 .build())
 *             .labels(Map.of(&#34;cloudidentity.googleapis.com/groups.discussion_forum&#34;, &#34;&#34;))
 *             .build());
 * 
 *         var cloudIdentityGroupMembershipBasic = new GroupMembership(&#34;cloudIdentityGroupMembershipBasic&#34;, GroupMembershipArgs.builder()        
 *             .group(group.id())
 *             .preferredMemberKey(GroupMembershipPreferredMemberKeyArgs.builder()
 *                 .id(child_group.groupKey().apply(groupKey -&gt; groupKey.id()))
 *                 .build())
 *             .roles(GroupMembershipRoleArgs.builder()
 *                 .name(&#34;MEMBER&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Cloud Identity Group Membership User
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var group = new Group(&#34;group&#34;, GroupArgs.builder()        
 *             .displayName(&#34;my-identity-group&#34;)
 *             .parent(&#34;customers/A01b123xz&#34;)
 *             .groupKey(GroupGroupKeyArgs.builder()
 *                 .id(&#34;my-identity-group@example.com&#34;)
 *                 .build())
 *             .labels(Map.of(&#34;cloudidentity.googleapis.com/groups.discussion_forum&#34;, &#34;&#34;))
 *             .build());
 * 
 *         var cloudIdentityGroupMembershipBasic = new GroupMembership(&#34;cloudIdentityGroupMembershipBasic&#34;, GroupMembershipArgs.builder()        
 *             .group(group.id())
 *             .preferredMemberKey(GroupMembershipPreferredMemberKeyArgs.builder()
 *                 .id(&#34;cloud_identity_user@example.com&#34;)
 *                 .build())
 *             .roles(            
 *                 GroupMembershipRoleArgs.builder()
 *                     .name(&#34;MEMBER&#34;)
 *                     .build(),
 *                 GroupMembershipRoleArgs.builder()
 *                     .name(&#34;MANAGER&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GroupMembership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudidentity/groupMembership:GroupMembership default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudidentity/groupMembership:GroupMembership")
public class GroupMembership extends com.pulumi.resources.CustomResource {
    /**
     * The time when the Membership was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the Membership was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The name of the Group to create this membership in.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The name of the Group to create this membership in.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Export(name="memberKey", type=GroupMembershipMemberKey.class, parameters={})
    private Output<GroupMembershipMemberKey> memberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Output<GroupMembershipMemberKey> memberKey() {
        return this.memberKey;
    }
    /**
     * The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Export(name="preferredMemberKey", type=GroupMembershipPreferredMemberKey.class, parameters={})
    private Output<GroupMembershipPreferredMemberKey> preferredMemberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Output<GroupMembershipPreferredMemberKey> preferredMemberKey() {
        return this.preferredMemberKey;
    }
    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @Export(name="roles", type=List.class, parameters={GroupMembershipRole.class})
    private Output<List<GroupMembershipRole>> roles;

    /**
     * @return The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    public Output<List<GroupMembershipRole>> roles() {
        return this.roles;
    }
    /**
     * The type of the membership.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the membership.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time when the Membership was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the Membership was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupMembership(String name) {
        this(name, GroupMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupMembership(String name, GroupMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMembership(String name, GroupMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudidentity/groupMembership:GroupMembership", name, args == null ? GroupMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupMembership(String name, Output<String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudidentity/groupMembership:GroupMembership", name, state, makeResourceOptions(options, id));
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
    public static GroupMembership get(String name, Output<String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupMembership(name, id, state, options);
    }
}