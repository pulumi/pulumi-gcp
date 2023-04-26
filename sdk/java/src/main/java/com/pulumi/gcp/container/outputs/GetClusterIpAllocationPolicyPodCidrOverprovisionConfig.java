// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterIpAllocationPolicyPodCidrOverprovisionConfig {
    private Boolean disabled;

    private GetClusterIpAllocationPolicyPodCidrOverprovisionConfig() {}
    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIpAllocationPolicyPodCidrOverprovisionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        public Builder() {}
        public Builder(GetClusterIpAllocationPolicyPodCidrOverprovisionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public GetClusterIpAllocationPolicyPodCidrOverprovisionConfig build() {
            final var o = new GetClusterIpAllocationPolicyPodCidrOverprovisionConfig();
            o.disabled = disabled;
            return o;
        }
    }
}