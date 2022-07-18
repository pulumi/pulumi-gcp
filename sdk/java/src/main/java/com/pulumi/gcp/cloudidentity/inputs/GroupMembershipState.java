// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipState Empty = new GroupMembershipState();

    /**
     * The time when the Membership was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the Membership was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The name of the Group to create this membership in.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The name of the Group to create this membership in.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="memberKey")
    private @Nullable Output<GroupMembershipMemberKeyArgs> memberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GroupMembershipMemberKeyArgs>> memberKey() {
        return Optional.ofNullable(this.memberKey);
    }

    /**
     * The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="preferredMemberKey")
    private @Nullable Output<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Optional<Output<GroupMembershipPreferredMemberKeyArgs>> preferredMemberKey() {
        return Optional.ofNullable(this.preferredMemberKey);
    }

    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<GroupMembershipRoleArgs>> roles;

    /**
     * @return The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GroupMembershipRoleArgs>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The type of the membership.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the membership.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The time when the Membership was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the Membership was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private GroupMembershipState() {}

    private GroupMembershipState(GroupMembershipState $) {
        this.createTime = $.createTime;
        this.group = $.group;
        this.memberKey = $.memberKey;
        this.name = $.name;
        this.preferredMemberKey = $.preferredMemberKey;
        this.roles = $.roles;
        this.type = $.type;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMembershipState $;

        public Builder() {
            $ = new GroupMembershipState();
        }

        public Builder(GroupMembershipState defaults) {
            $ = new GroupMembershipState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the Membership was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the Membership was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param group The name of the Group to create this membership in.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The name of the Group to create this membership in.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param memberKey EntityKey of the member.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberKey(@Nullable Output<GroupMembershipMemberKeyArgs> memberKey) {
            $.memberKey = memberKey;
            return this;
        }

        /**
         * @param memberKey EntityKey of the member.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberKey(GroupMembershipMemberKeyArgs memberKey) {
            return memberKey(Output.of(memberKey));
        }

        /**
         * @param name The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
         * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
         * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preferredMemberKey EntityKey of the member.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preferredMemberKey(@Nullable Output<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey) {
            $.preferredMemberKey = preferredMemberKey;
            return this;
        }

        /**
         * @param preferredMemberKey EntityKey of the member.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preferredMemberKey(GroupMembershipPreferredMemberKeyArgs preferredMemberKey) {
            return preferredMemberKey(Output.of(preferredMemberKey));
        }

        /**
         * @param roles The MembershipRoles that apply to the Membership.
         * Must not contain duplicate MembershipRoles with the same name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<GroupMembershipRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles The MembershipRoles that apply to the Membership.
         * Must not contain duplicate MembershipRoles with the same name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<GroupMembershipRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles The MembershipRoles that apply to the Membership.
         * Must not contain duplicate MembershipRoles with the same name.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder roles(GroupMembershipRoleArgs... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param type The type of the membership.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the membership.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updateTime The time when the Membership was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the Membership was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public GroupMembershipState build() {
            return $;
        }
    }

}