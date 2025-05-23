// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupMembershipsMembershipMemberKey {
    /**
     * @return The ID of the entity. For Google-managed entities, the id is the email address of an existing
     * group or user. For external-identity-mapped entities, the id is a string conforming
     * to the Identity Source&#39;s requirements.
     * 
     */
    private String id;
    /**
     * @return The namespace in which the entity exists.
     * If not populated, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If populated, the EntityKey represents an external-identity-mapped group.
     * 
     */
    private String namespace;

    private GetGroupMembershipsMembershipMemberKey() {}
    /**
     * @return The ID of the entity. For Google-managed entities, the id is the email address of an existing
     * group or user. For external-identity-mapped entities, the id is a string conforming
     * to the Identity Source&#39;s requirements.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The namespace in which the entity exists.
     * If not populated, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If populated, the EntityKey represents an external-identity-mapped group.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembershipMemberKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String namespace;
        public Builder() {}
        public Builder(GetGroupMembershipsMembershipMemberKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGroupMembershipsMembershipMemberKey", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("GetGroupMembershipsMembershipMemberKey", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        public GetGroupMembershipsMembershipMemberKey build() {
            final var _resultValue = new GetGroupMembershipsMembershipMemberKey();
            _resultValue.id = id;
            _resultValue.namespace = namespace;
            return _resultValue;
        }
    }
}
