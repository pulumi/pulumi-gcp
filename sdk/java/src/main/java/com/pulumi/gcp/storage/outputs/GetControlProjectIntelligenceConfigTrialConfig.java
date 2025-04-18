// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetControlProjectIntelligenceConfigTrialConfig {
    /**
     * @return The time at which the trial expires.
     * 
     */
    private String expireTime;

    private GetControlProjectIntelligenceConfigTrialConfig() {}
    /**
     * @return The time at which the trial expires.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlProjectIntelligenceConfigTrialConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expireTime;
        public Builder() {}
        public Builder(GetControlProjectIntelligenceConfigTrialConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
        }

        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetControlProjectIntelligenceConfigTrialConfig", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        public GetControlProjectIntelligenceConfigTrialConfig build() {
            final var _resultValue = new GetControlProjectIntelligenceConfigTrialConfig();
            _resultValue.expireTime = expireTime;
            return _resultValue;
        }
    }
}
