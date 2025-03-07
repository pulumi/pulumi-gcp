// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring {
    /**
     * @return Specifies the list of backends Policy Controller will export to. Must be one of `CLOUD_MONITORING` or `PROMETHEUS`. Defaults to [`CLOUD_MONITORING`, `PROMETHEUS`]. Specifying an empty value `[]` disables metrics export.
     * 
     */
    private @Nullable List<String> backends;

    private FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring() {}
    /**
     * @return Specifies the list of backends Policy Controller will export to. Must be one of `CLOUD_MONITORING` or `PROMETHEUS`. Defaults to [`CLOUD_MONITORING`, `PROMETHEUS`]. Specifying an empty value `[]` disables metrics export.
     * 
     */
    public List<String> backends() {
        return this.backends == null ? List.of() : this.backends;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> backends;
        public Builder() {}
        public Builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backends = defaults.backends;
        }

        @CustomType.Setter
        public Builder backends(@Nullable List<String> backends) {

            this.backends = backends;
            return this;
        }
        public Builder backends(String... backends) {
            return backends(List.of(backends));
        }
        public FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring build() {
            final var _resultValue = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoring();
            _resultValue.backends = backends;
            return _resultValue;
        }
    }
}
