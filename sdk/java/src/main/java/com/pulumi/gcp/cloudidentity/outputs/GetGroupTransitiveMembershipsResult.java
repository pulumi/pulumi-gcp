// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudidentity.outputs.GetGroupTransitiveMembershipsMembership;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupTransitiveMembershipsResult {
    private String group;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of memberships under the given group. Structure is documented below.
     * 
     */
    private List<GetGroupTransitiveMembershipsMembership> memberships;

    private GetGroupTransitiveMembershipsResult() {}
    public String group() {
        return this.group;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of memberships under the given group. Structure is documented below.
     * 
     */
    public List<GetGroupTransitiveMembershipsMembership> memberships() {
        return this.memberships;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupTransitiveMembershipsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String group;
        private String id;
        private List<GetGroupTransitiveMembershipsMembership> memberships;
        public Builder() {}
        public Builder(GetGroupTransitiveMembershipsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.id = defaults.id;
    	      this.memberships = defaults.memberships;
        }

        @CustomType.Setter
        public Builder group(String group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetGroupTransitiveMembershipsResult", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGroupTransitiveMembershipsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memberships(List<GetGroupTransitiveMembershipsMembership> memberships) {
            if (memberships == null) {
              throw new MissingRequiredPropertyException("GetGroupTransitiveMembershipsResult", "memberships");
            }
            this.memberships = memberships;
            return this;
        }
        public Builder memberships(GetGroupTransitiveMembershipsMembership... memberships) {
            return memberships(List.of(memberships));
        }
        public GetGroupTransitiveMembershipsResult build() {
            final var _resultValue = new GetGroupTransitiveMembershipsResult();
            _resultValue.group = group;
            _resultValue.id = id;
            _resultValue.memberships = memberships;
            return _resultValue;
        }
    }
}
