// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipRbacRoleBindingStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipRbacRoleBindingStateArgs Empty = new MembershipRbacRoleBindingStateArgs();

    /**
     * (Output)
     * Code describes the state of a RBAC Role Binding resource.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return (Output)
     * Code describes the state of a RBAC Role Binding resource.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    private MembershipRbacRoleBindingStateArgs() {}

    private MembershipRbacRoleBindingStateArgs(MembershipRbacRoleBindingStateArgs $) {
        this.code = $.code;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipRbacRoleBindingStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRbacRoleBindingStateArgs $;

        public Builder() {
            $ = new MembershipRbacRoleBindingStateArgs();
        }

        public Builder(MembershipRbacRoleBindingStateArgs defaults) {
            $ = new MembershipRbacRoleBindingStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code (Output)
         * Code describes the state of a RBAC Role Binding resource.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code (Output)
         * Code describes the state of a RBAC Role Binding resource.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        public MembershipRbacRoleBindingStateArgs build() {
            return $;
        }
    }

}
