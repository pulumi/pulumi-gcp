// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.chronicle.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RetrohuntProcessInterval {
    /**
     * @return Exclusive end of the interval.
     * 
     */
    private String endTime;
    /**
     * @return Inclusive start of the interval.
     * 
     */
    private String startTime;

    private RetrohuntProcessInterval() {}
    /**
     * @return Exclusive end of the interval.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Inclusive start of the interval.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetrohuntProcessInterval defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private String startTime;
        public Builder() {}
        public Builder(RetrohuntProcessInterval defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            if (endTime == null) {
              throw new MissingRequiredPropertyException("RetrohuntProcessInterval", "endTime");
            }
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            if (startTime == null) {
              throw new MissingRequiredPropertyException("RetrohuntProcessInterval", "startTime");
            }
            this.startTime = startTime;
            return this;
        }
        public RetrohuntProcessInterval build() {
            final var _resultValue = new RetrohuntProcessInterval();
            _resultValue.endTime = endTime;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}
