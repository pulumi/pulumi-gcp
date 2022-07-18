// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetBackendServiceLogConfig {
    private final Boolean enable;
    private final Double sampleRate;

    @CustomType.Constructor
    private GetBackendServiceLogConfig(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("sampleRate") Double sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    public Boolean enable() {
        return this.enable;
    }
    public Double sampleRate() {
        return this.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Double sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder sampleRate(Double sampleRate) {
            this.sampleRate = Objects.requireNonNull(sampleRate);
            return this;
        }        public GetBackendServiceLogConfig build() {
            return new GetBackendServiceLogConfig(enable, sampleRate);
        }
    }
}