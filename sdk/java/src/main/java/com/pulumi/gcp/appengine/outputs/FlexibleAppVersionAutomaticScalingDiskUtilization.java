// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionAutomaticScalingDiskUtilization {
    /**
     * @return Target bytes read per second.
     * 
     */
    private @Nullable Integer targetReadBytesPerSecond;
    /**
     * @return Target ops read per seconds.
     * 
     */
    private @Nullable Integer targetReadOpsPerSecond;
    /**
     * @return Target bytes written per second.
     * 
     */
    private @Nullable Integer targetWriteBytesPerSecond;
    /**
     * @return Target ops written per second.
     * 
     */
    private @Nullable Integer targetWriteOpsPerSecond;

    private FlexibleAppVersionAutomaticScalingDiskUtilization() {}
    /**
     * @return Target bytes read per second.
     * 
     */
    public Optional<Integer> targetReadBytesPerSecond() {
        return Optional.ofNullable(this.targetReadBytesPerSecond);
    }
    /**
     * @return Target ops read per seconds.
     * 
     */
    public Optional<Integer> targetReadOpsPerSecond() {
        return Optional.ofNullable(this.targetReadOpsPerSecond);
    }
    /**
     * @return Target bytes written per second.
     * 
     */
    public Optional<Integer> targetWriteBytesPerSecond() {
        return Optional.ofNullable(this.targetWriteBytesPerSecond);
    }
    /**
     * @return Target ops written per second.
     * 
     */
    public Optional<Integer> targetWriteOpsPerSecond() {
        return Optional.ofNullable(this.targetWriteOpsPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingDiskUtilization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer targetReadBytesPerSecond;
        private @Nullable Integer targetReadOpsPerSecond;
        private @Nullable Integer targetWriteBytesPerSecond;
        private @Nullable Integer targetWriteOpsPerSecond;
        public Builder() {}
        public Builder(FlexibleAppVersionAutomaticScalingDiskUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        @CustomType.Setter
        public Builder targetReadBytesPerSecond(@Nullable Integer targetReadBytesPerSecond) {

            this.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder targetReadOpsPerSecond(@Nullable Integer targetReadOpsPerSecond) {

            this.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder targetWriteBytesPerSecond(@Nullable Integer targetWriteBytesPerSecond) {

            this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder targetWriteOpsPerSecond(@Nullable Integer targetWriteOpsPerSecond) {

            this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }
        public FlexibleAppVersionAutomaticScalingDiskUtilization build() {
            final var _resultValue = new FlexibleAppVersionAutomaticScalingDiskUtilization();
            _resultValue.targetReadBytesPerSecond = targetReadBytesPerSecond;
            _resultValue.targetReadOpsPerSecond = targetReadOpsPerSecond;
            _resultValue.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            _resultValue.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return _resultValue;
        }
    }
}
