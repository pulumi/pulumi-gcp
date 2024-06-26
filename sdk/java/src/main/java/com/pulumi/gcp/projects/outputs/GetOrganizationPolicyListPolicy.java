// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyAllow;
import com.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyListPolicy {
    /**
     * @return One or the other must be set.
     * 
     */
    private List<GetOrganizationPolicyListPolicyAllow> allows;
    /**
     * @return One or the other must be set.
     * 
     */
    private List<GetOrganizationPolicyListPolicyDeny> denies;
    /**
     * @return If set to true, the values from the effective Policy of the parent resource are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    private Boolean inheritFromParent;
    /**
     * @return The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    private String suggestedValue;

    private GetOrganizationPolicyListPolicy() {}
    /**
     * @return One or the other must be set.
     * 
     */
    public List<GetOrganizationPolicyListPolicyAllow> allows() {
        return this.allows;
    }
    /**
     * @return One or the other must be set.
     * 
     */
    public List<GetOrganizationPolicyListPolicyDeny> denies() {
        return this.denies;
    }
    /**
     * @return If set to true, the values from the effective Policy of the parent resource are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    public Boolean inheritFromParent() {
        return this.inheritFromParent;
    }
    /**
     * @return The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    public String suggestedValue() {
        return this.suggestedValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOrganizationPolicyListPolicyAllow> allows;
        private List<GetOrganizationPolicyListPolicyDeny> denies;
        private Boolean inheritFromParent;
        private String suggestedValue;
        public Builder() {}
        public Builder(GetOrganizationPolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        @CustomType.Setter
        public Builder allows(List<GetOrganizationPolicyListPolicyAllow> allows) {
            if (allows == null) {
              throw new MissingRequiredPropertyException("GetOrganizationPolicyListPolicy", "allows");
            }
            this.allows = allows;
            return this;
        }
        public Builder allows(GetOrganizationPolicyListPolicyAllow... allows) {
            return allows(List.of(allows));
        }
        @CustomType.Setter
        public Builder denies(List<GetOrganizationPolicyListPolicyDeny> denies) {
            if (denies == null) {
              throw new MissingRequiredPropertyException("GetOrganizationPolicyListPolicy", "denies");
            }
            this.denies = denies;
            return this;
        }
        public Builder denies(GetOrganizationPolicyListPolicyDeny... denies) {
            return denies(List.of(denies));
        }
        @CustomType.Setter
        public Builder inheritFromParent(Boolean inheritFromParent) {
            if (inheritFromParent == null) {
              throw new MissingRequiredPropertyException("GetOrganizationPolicyListPolicy", "inheritFromParent");
            }
            this.inheritFromParent = inheritFromParent;
            return this;
        }
        @CustomType.Setter
        public Builder suggestedValue(String suggestedValue) {
            if (suggestedValue == null) {
              throw new MissingRequiredPropertyException("GetOrganizationPolicyListPolicy", "suggestedValue");
            }
            this.suggestedValue = suggestedValue;
            return this;
        }
        public GetOrganizationPolicyListPolicy build() {
            final var _resultValue = new GetOrganizationPolicyListPolicy();
            _resultValue.allows = allows;
            _resultValue.denies = denies;
            _resultValue.inheritFromParent = inheritFromParent;
            _resultValue.suggestedValue = suggestedValue;
            return _resultValue;
        }
    }
}
