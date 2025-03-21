// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence {
    /**
     * @return How frequently data profiles can be updated when the template is modified. Defaults to never.
     * Possible values are: `UPDATE_FREQUENCY_NEVER`, `UPDATE_FREQUENCY_DAILY`, `UPDATE_FREQUENCY_MONTHLY`.
     * 
     */
    private @Nullable String frequency;

    private PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence() {}
    /**
     * @return How frequently data profiles can be updated when the template is modified. Defaults to never.
     * Possible values are: `UPDATE_FREQUENCY_NEVER`, `UPDATE_FREQUENCY_DAILY`, `UPDATE_FREQUENCY_MONTHLY`.
     * 
     */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String frequency;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
        }

        @CustomType.Setter
        public Builder frequency(@Nullable String frequency) {

            this.frequency = frequency;
            return this;
        }
        public PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence build() {
            final var _resultValue = new PreventionDiscoveryConfigTargetCloudStorageTargetGenerationCadenceInspectTemplateModifiedCadence();
            _resultValue.frequency = frequency;
            return _resultValue;
        }
    }
}
