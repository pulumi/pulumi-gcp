// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSOrganization {
    /**
     * @return The Google for Work customer ID of the Organization.
     * 
     */
    private String directoryCustomerId;
    /**
     * @return A human-readable string that refers to the Organization in the Google Cloud console. The string will be set to the primary domain (for example, `&#34;google.com&#34;`) of the G Suite customer that owns the organization.
     * 
     */
    private String displayName;
    /**
     * @return The Organization&#39;s current lifecycle state.
     * 
     */
    private String lifecycleState;
    /**
     * @return The resource name of the Organization in the form `organizations/{organization_id}`.
     * 
     */
    private String name;
    /**
     * @return The Organization ID.
     * 
     */
    private String orgId;

    private GetSOrganization() {}
    /**
     * @return The Google for Work customer ID of the Organization.
     * 
     */
    public String directoryCustomerId() {
        return this.directoryCustomerId;
    }
    /**
     * @return A human-readable string that refers to the Organization in the Google Cloud console. The string will be set to the primary domain (for example, `&#34;google.com&#34;`) of the G Suite customer that owns the organization.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The Organization&#39;s current lifecycle state.
     * 
     */
    public String lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * @return The resource name of the Organization in the form `organizations/{organization_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Organization ID.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String directoryCustomerId;
        private String displayName;
        private String lifecycleState;
        private String name;
        private String orgId;
        public Builder() {}
        public Builder(GetSOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryCustomerId = defaults.directoryCustomerId;
    	      this.displayName = defaults.displayName;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
        }

        @CustomType.Setter
        public Builder directoryCustomerId(String directoryCustomerId) {
            if (directoryCustomerId == null) {
              throw new MissingRequiredPropertyException("GetSOrganization", "directoryCustomerId");
            }
            this.directoryCustomerId = directoryCustomerId;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetSOrganization", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleState(String lifecycleState) {
            if (lifecycleState == null) {
              throw new MissingRequiredPropertyException("GetSOrganization", "lifecycleState");
            }
            this.lifecycleState = lifecycleState;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSOrganization", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetSOrganization", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        public GetSOrganization build() {
            final var _resultValue = new GetSOrganization();
            _resultValue.directoryCustomerId = directoryCustomerId;
            _resultValue.displayName = displayName;
            _resultValue.lifecycleState = lifecycleState;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            return _resultValue;
        }
    }
}
