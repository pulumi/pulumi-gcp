// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkstationConfigHostGceInstanceConfidentialInstanceConfig {
    /**
     * @return Whether the instance has confidential compute enabled.
     * 
     */
    private @Nullable Boolean enableConfidentialCompute;

    private WorkstationConfigHostGceInstanceConfidentialInstanceConfig() {}
    /**
     * @return Whether the instance has confidential compute enabled.
     * 
     */
    public Optional<Boolean> enableConfidentialCompute() {
        return Optional.ofNullable(this.enableConfidentialCompute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkstationConfigHostGceInstanceConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableConfidentialCompute;
        public Builder() {}
        public Builder(WorkstationConfigHostGceInstanceConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        @CustomType.Setter
        public Builder enableConfidentialCompute(@Nullable Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }
        public WorkstationConfigHostGceInstanceConfidentialInstanceConfig build() {
            final var o = new WorkstationConfigHostGceInstanceConfidentialInstanceConfig();
            o.enableConfidentialCompute = enableConfidentialCompute;
            return o;
        }
    }
}