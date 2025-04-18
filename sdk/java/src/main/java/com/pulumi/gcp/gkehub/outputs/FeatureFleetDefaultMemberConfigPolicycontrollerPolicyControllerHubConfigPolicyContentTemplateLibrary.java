// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary {
    /**
     * @return Configures the manner in which the template library is installed on the cluster.
     * Possible values are: `INSTALLATION_UNSPECIFIED`, `NOT_INSTALLED`, `ALL`.
     * 
     */
    private @Nullable String installation;

    private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary() {}
    /**
     * @return Configures the manner in which the template library is installed on the cluster.
     * Possible values are: `INSTALLATION_UNSPECIFIED`, `NOT_INSTALLED`, `ALL`.
     * 
     */
    public Optional<String> installation() {
        return Optional.ofNullable(this.installation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String installation;
        public Builder() {}
        public Builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.installation = defaults.installation;
        }

        @CustomType.Setter
        public Builder installation(@Nullable String installation) {

            this.installation = installation;
            return this;
        }
        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary build() {
            final var _resultValue = new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary();
            _resultValue.installation = installation;
            return _resultValue;
        }
    }
}
