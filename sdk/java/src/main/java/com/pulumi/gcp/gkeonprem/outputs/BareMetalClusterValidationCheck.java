// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterValidationCheckStatus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterValidationCheck {
    /**
     * @return (Output)
     * Options used for the validation check.
     * 
     */
    private @Nullable String options;
    /**
     * @return (Output)
     * The scenario when the preflight checks were run..
     * 
     */
    private @Nullable String scenario;
    /**
     * @return (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     * 
     */
    private @Nullable List<BareMetalClusterValidationCheckStatus> statuses;

    private BareMetalClusterValidationCheck() {}
    /**
     * @return (Output)
     * Options used for the validation check.
     * 
     */
    public Optional<String> options() {
        return Optional.ofNullable(this.options);
    }
    /**
     * @return (Output)
     * The scenario when the preflight checks were run..
     * 
     */
    public Optional<String> scenario() {
        return Optional.ofNullable(this.scenario);
    }
    /**
     * @return (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     * 
     */
    public List<BareMetalClusterValidationCheckStatus> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterValidationCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String options;
        private @Nullable String scenario;
        private @Nullable List<BareMetalClusterValidationCheckStatus> statuses;
        public Builder() {}
        public Builder(BareMetalClusterValidationCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.scenario = defaults.scenario;
    	      this.statuses = defaults.statuses;
        }

        @CustomType.Setter
        public Builder options(@Nullable String options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder scenario(@Nullable String scenario) {

            this.scenario = scenario;
            return this;
        }
        @CustomType.Setter
        public Builder statuses(@Nullable List<BareMetalClusterValidationCheckStatus> statuses) {

            this.statuses = statuses;
            return this;
        }
        public Builder statuses(BareMetalClusterValidationCheckStatus... statuses) {
            return statuses(List.of(statuses));
        }
        public BareMetalClusterValidationCheck build() {
            final var _resultValue = new BareMetalClusterValidationCheck();
            _resultValue.options = options;
            _resultValue.scenario = scenario;
            _resultValue.statuses = statuses;
            return _resultValue;
        }
    }
}
