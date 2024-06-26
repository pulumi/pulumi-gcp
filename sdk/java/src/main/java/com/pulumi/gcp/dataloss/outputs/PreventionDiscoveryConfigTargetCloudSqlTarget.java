// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigTargetCloudSqlTargetConditions;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigTargetCloudSqlTargetDisabled;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigTargetCloudSqlTargetFilter;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadence;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigTargetCloudSqlTarget {
    /**
     * @return In addition to matching the filter, these conditions must be true before a profile is generated.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetConditions conditions;
    /**
     * @return Disable profiling for database resources that match this filter.
     * 
     */
    private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetDisabled disabled;
    /**
     * @return Required. The tables the discovery cadence applies to. The first target with a matching filter will be the one to apply to a table.
     * Structure is documented below.
     * 
     */
    private PreventionDiscoveryConfigTargetCloudSqlTargetFilter filter;
    /**
     * @return How often and when to update profiles. New tables that match both the filter and conditions are scanned as quickly as possible depending on system capacity.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadence generationCadence;

    private PreventionDiscoveryConfigTargetCloudSqlTarget() {}
    /**
     * @return In addition to matching the filter, these conditions must be true before a profile is generated.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDiscoveryConfigTargetCloudSqlTargetConditions> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    /**
     * @return Disable profiling for database resources that match this filter.
     * 
     */
    public Optional<PreventionDiscoveryConfigTargetCloudSqlTargetDisabled> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Required. The tables the discovery cadence applies to. The first target with a matching filter will be the one to apply to a table.
     * Structure is documented below.
     * 
     */
    public PreventionDiscoveryConfigTargetCloudSqlTargetFilter filter() {
        return this.filter;
    }
    /**
     * @return How often and when to update profiles. New tables that match both the filter and conditions are scanned as quickly as possible depending on system capacity.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadence> generationCadence() {
        return Optional.ofNullable(this.generationCadence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigTargetCloudSqlTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetConditions conditions;
        private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetDisabled disabled;
        private PreventionDiscoveryConfigTargetCloudSqlTargetFilter filter;
        private @Nullable PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadence generationCadence;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigTargetCloudSqlTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.generationCadence = defaults.generationCadence;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable PreventionDiscoveryConfigTargetCloudSqlTargetConditions conditions) {

            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable PreventionDiscoveryConfigTargetCloudSqlTargetDisabled disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder filter(PreventionDiscoveryConfigTargetCloudSqlTargetFilter filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTarget", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder generationCadence(@Nullable PreventionDiscoveryConfigTargetCloudSqlTargetGenerationCadence generationCadence) {

            this.generationCadence = generationCadence;
            return this;
        }
        public PreventionDiscoveryConfigTargetCloudSqlTarget build() {
            final var _resultValue = new PreventionDiscoveryConfigTargetCloudSqlTarget();
            _resultValue.conditions = conditions;
            _resultValue.disabled = disabled;
            _resultValue.filter = filter;
            _resultValue.generationCadence = generationCadence;
            return _resultValue;
        }
    }
}
