// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis {
    /**
     * @return The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * @return Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private final @Nullable String monitoringInterval;

    @CustomType.Constructor
    private AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis(
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("monitoringInterval") @Nullable String monitoringInterval) {
        this.disabled = disabled;
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * @return The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<String> monitoringInterval() {
        return Optional.ofNullable(this.monitoringInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable String monitoringInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.monitoringInterval = defaults.monitoringInterval;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder monitoringInterval(@Nullable String monitoringInterval) {
            this.monitoringInterval = monitoringInterval;
            return this;
        }        public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis build() {
            return new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysis(disabled, monitoringInterval);
        }
    }
}