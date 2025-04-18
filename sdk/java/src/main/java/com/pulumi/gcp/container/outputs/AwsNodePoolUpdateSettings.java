// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.AwsNodePoolUpdateSettingsSurgeSettings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsNodePoolUpdateSettings {
    /**
     * @return Optional. Settings for surge update.
     * 
     */
    private @Nullable AwsNodePoolUpdateSettingsSurgeSettings surgeSettings;

    private AwsNodePoolUpdateSettings() {}
    /**
     * @return Optional. Settings for surge update.
     * 
     */
    public Optional<AwsNodePoolUpdateSettingsSurgeSettings> surgeSettings() {
        return Optional.ofNullable(this.surgeSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolUpdateSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AwsNodePoolUpdateSettingsSurgeSettings surgeSettings;
        public Builder() {}
        public Builder(AwsNodePoolUpdateSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.surgeSettings = defaults.surgeSettings;
        }

        @CustomType.Setter
        public Builder surgeSettings(@Nullable AwsNodePoolUpdateSettingsSurgeSettings surgeSettings) {

            this.surgeSettings = surgeSettings;
            return this;
        }
        public AwsNodePoolUpdateSettings build() {
            final var _resultValue = new AwsNodePoolUpdateSettings();
            _resultValue.surgeSettings = surgeSettings;
            return _resultValue;
        }
    }
}
