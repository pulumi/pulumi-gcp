// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipRbacRoleBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipRbacRoleBindingArgs Empty = new MembershipRbacRoleBindingArgs();

    /**
     * Location of the Membership
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Location of the Membership
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Id of the membership
     * 
     */
    @Import(name="membershipId", required=true)
    private Output<String> membershipId;

    /**
     * @return Id of the membership
     * 
     */
    public Output<String> membershipId() {
        return this.membershipId;
    }

    /**
     * The client-provided identifier of the RBAC Role Binding.
     * 
     */
    @Import(name="membershipRbacRoleBindingId", required=true)
    private Output<String> membershipRbacRoleBindingId;

    /**
     * @return The client-provided identifier of the RBAC Role Binding.
     * 
     */
    public Output<String> membershipRbacRoleBindingId() {
        return this.membershipRbacRoleBindingId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Role to bind to the principal.
     * Structure is documented below.
     * 
     */
    @Import(name="role", required=true)
    private Output<MembershipRbacRoleBindingRoleArgs> role;

    /**
     * @return Role to bind to the principal.
     * Structure is documented below.
     * 
     */
    public Output<MembershipRbacRoleBindingRoleArgs> role() {
        return this.role;
    }

    /**
     * Principal that is be authorized in the cluster (at least of one the oneof
     * is required). Updating one will unset the other automatically.
     * user is the name of the user as seen by the kubernetes cluster, example
     * &#34;alice&#34; or &#34;alice@domain.tld&#34;
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return Principal that is be authorized in the cluster (at least of one the oneof
     * is required). Updating one will unset the other automatically.
     * user is the name of the user as seen by the kubernetes cluster, example
     * &#34;alice&#34; or &#34;alice@domain.tld&#34;
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private MembershipRbacRoleBindingArgs() {}

    private MembershipRbacRoleBindingArgs(MembershipRbacRoleBindingArgs $) {
        this.location = $.location;
        this.membershipId = $.membershipId;
        this.membershipRbacRoleBindingId = $.membershipRbacRoleBindingId;
        this.project = $.project;
        this.role = $.role;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipRbacRoleBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRbacRoleBindingArgs $;

        public Builder() {
            $ = new MembershipRbacRoleBindingArgs();
        }

        public Builder(MembershipRbacRoleBindingArgs defaults) {
            $ = new MembershipRbacRoleBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Location of the Membership
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the Membership
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param membershipId Id of the membership
         * 
         * @return builder
         * 
         */
        public Builder membershipId(Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        /**
         * @param membershipId Id of the membership
         * 
         * @return builder
         * 
         */
        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        /**
         * @param membershipRbacRoleBindingId The client-provided identifier of the RBAC Role Binding.
         * 
         * @return builder
         * 
         */
        public Builder membershipRbacRoleBindingId(Output<String> membershipRbacRoleBindingId) {
            $.membershipRbacRoleBindingId = membershipRbacRoleBindingId;
            return this;
        }

        /**
         * @param membershipRbacRoleBindingId The client-provided identifier of the RBAC Role Binding.
         * 
         * @return builder
         * 
         */
        public Builder membershipRbacRoleBindingId(String membershipRbacRoleBindingId) {
            return membershipRbacRoleBindingId(Output.of(membershipRbacRoleBindingId));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role Role to bind to the principal.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<MembershipRbacRoleBindingRoleArgs> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role to bind to the principal.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder role(MembershipRbacRoleBindingRoleArgs role) {
            return role(Output.of(role));
        }

        /**
         * @param user Principal that is be authorized in the cluster (at least of one the oneof
         * is required). Updating one will unset the other automatically.
         * user is the name of the user as seen by the kubernetes cluster, example
         * &#34;alice&#34; or &#34;alice@domain.tld&#34;
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Principal that is be authorized in the cluster (at least of one the oneof
         * is required). Updating one will unset the other automatically.
         * user is the name of the user as seen by the kubernetes cluster, example
         * &#34;alice&#34; or &#34;alice@domain.tld&#34;
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public MembershipRbacRoleBindingArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            $.membershipRbacRoleBindingId = Objects.requireNonNull($.membershipRbacRoleBindingId, "expected parameter 'membershipRbacRoleBindingId' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}