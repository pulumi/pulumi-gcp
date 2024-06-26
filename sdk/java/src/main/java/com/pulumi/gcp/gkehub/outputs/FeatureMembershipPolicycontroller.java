// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipPolicycontroller {
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    private FeatureMembershipPolicycontrollerPolicyControllerHubConfig policyControllerHubConfig;
    /**
     * @return Version of Policy Controller to install. Defaults to the latest version.
     * 
     */
    private @Nullable String version;

    private FeatureMembershipPolicycontroller() {}
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * 
     */
    public FeatureMembershipPolicycontrollerPolicyControllerHubConfig policyControllerHubConfig() {
        return this.policyControllerHubConfig;
    }
    /**
     * @return Version of Policy Controller to install. Defaults to the latest version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipPolicycontroller defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FeatureMembershipPolicycontrollerPolicyControllerHubConfig policyControllerHubConfig;
        private @Nullable String version;
        public Builder() {}
        public Builder(FeatureMembershipPolicycontroller defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyControllerHubConfig = defaults.policyControllerHubConfig;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder policyControllerHubConfig(FeatureMembershipPolicycontrollerPolicyControllerHubConfig policyControllerHubConfig) {
            if (policyControllerHubConfig == null) {
              throw new MissingRequiredPropertyException("FeatureMembershipPolicycontroller", "policyControllerHubConfig");
            }
            this.policyControllerHubConfig = policyControllerHubConfig;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public FeatureMembershipPolicycontroller build() {
            final var _resultValue = new FeatureMembershipPolicycontroller();
            _resultValue.policyControllerHubConfig = policyControllerHubConfig;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
