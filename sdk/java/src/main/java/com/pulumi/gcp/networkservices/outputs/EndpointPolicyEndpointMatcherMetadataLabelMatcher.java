// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.networkservices.outputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EndpointPolicyEndpointMatcherMetadataLabelMatcher {
    /**
     * @return Specifies how matching should be done.
     * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
     * 
     */
    private String metadataLabelMatchCriteria;
    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
     * Structure is documented below.
     * 
     */
    private @Nullable List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel> metadataLabels;

    private EndpointPolicyEndpointMatcherMetadataLabelMatcher() {}
    /**
     * @return Specifies how matching should be done.
     * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
     * 
     */
    public String metadataLabelMatchCriteria() {
        return this.metadataLabelMatchCriteria;
    }
    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
     * Structure is documented below.
     * 
     */
    public List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel> metadataLabels() {
        return this.metadataLabels == null ? List.of() : this.metadataLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPolicyEndpointMatcherMetadataLabelMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metadataLabelMatchCriteria;
        private @Nullable List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel> metadataLabels;
        public Builder() {}
        public Builder(EndpointPolicyEndpointMatcherMetadataLabelMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatchCriteria = defaults.metadataLabelMatchCriteria;
    	      this.metadataLabels = defaults.metadataLabels;
        }

        @CustomType.Setter
        public Builder metadataLabelMatchCriteria(String metadataLabelMatchCriteria) {
            if (metadataLabelMatchCriteria == null) {
              throw new MissingRequiredPropertyException("EndpointPolicyEndpointMatcherMetadataLabelMatcher", "metadataLabelMatchCriteria");
            }
            this.metadataLabelMatchCriteria = metadataLabelMatchCriteria;
            return this;
        }
        @CustomType.Setter
        public Builder metadataLabels(@Nullable List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel> metadataLabels) {

            this.metadataLabels = metadataLabels;
            return this;
        }
        public Builder metadataLabels(EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabel... metadataLabels) {
            return metadataLabels(List.of(metadataLabels));
        }
        public EndpointPolicyEndpointMatcherMetadataLabelMatcher build() {
            final var _resultValue = new EndpointPolicyEndpointMatcherMetadataLabelMatcher();
            _resultValue.metadataLabelMatchCriteria = metadataLabelMatchCriteria;
            _resultValue.metadataLabels = metadataLabels;
            return _resultValue;
        }
    }
}
