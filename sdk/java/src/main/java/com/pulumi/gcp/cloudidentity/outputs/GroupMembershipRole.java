// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudidentity.outputs.GroupMembershipRoleExpiryDetail;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupMembershipRole {
    /**
     * @return The MembershipRole expiry details, only supported for MEMBER role.
     * Other roles cannot be accompanied with MEMBER role having expiry.
     * Structure is documented below.
     * 
     */
    private @Nullable GroupMembershipRoleExpiryDetail expiryDetail;
    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are: `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    private String name;

    private GroupMembershipRole() {}
    /**
     * @return The MembershipRole expiry details, only supported for MEMBER role.
     * Other roles cannot be accompanied with MEMBER role having expiry.
     * Structure is documented below.
     * 
     */
    public Optional<GroupMembershipRoleExpiryDetail> expiryDetail() {
        return Optional.ofNullable(this.expiryDetail);
    }
    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are: `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GroupMembershipRoleExpiryDetail expiryDetail;
        private String name;
        public Builder() {}
        public Builder(GroupMembershipRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDetail = defaults.expiryDetail;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder expiryDetail(@Nullable GroupMembershipRoleExpiryDetail expiryDetail) {

            this.expiryDetail = expiryDetail;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GroupMembershipRole", "name");
            }
            this.name = name;
            return this;
        }
        public GroupMembershipRole build() {
            final var _resultValue = new GroupMembershipRole();
            _resultValue.expiryDetail = expiryDetail;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
