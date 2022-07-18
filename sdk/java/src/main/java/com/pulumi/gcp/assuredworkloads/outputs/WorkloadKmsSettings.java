// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkloadKmsSettings {
    /**
     * @return Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    private final String nextRotationTime;
    /**
     * @return Required. Input only. Immutable. will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    private final String rotationPeriod;

    @CustomType.Constructor
    private WorkloadKmsSettings(
        @CustomType.Parameter("nextRotationTime") String nextRotationTime,
        @CustomType.Parameter("rotationPeriod") String rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    /**
     * @return Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary.
     * 
     */
    public String nextRotationTime() {
        return this.nextRotationTime;
    }
    /**
     * @return Required. Input only. Immutable. will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at most 876,000 hours.
     * 
     */
    public String rotationPeriod() {
        return this.rotationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadKmsSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextRotationTime;
        private String rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadKmsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder nextRotationTime(String nextRotationTime) {
            this.nextRotationTime = Objects.requireNonNull(nextRotationTime);
            return this;
        }
        public Builder rotationPeriod(String rotationPeriod) {
            this.rotationPeriod = Objects.requireNonNull(rotationPeriod);
            return this;
        }        public WorkloadKmsSettings build() {
            return new WorkloadKmsSettings(nextRotationTime, rotationPeriod);
        }
    }
}