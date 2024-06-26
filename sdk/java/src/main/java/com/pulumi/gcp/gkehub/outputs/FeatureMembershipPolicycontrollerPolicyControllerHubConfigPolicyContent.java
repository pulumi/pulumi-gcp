// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent {
    /**
     * @return map of bundle name to BundleInstallSpec. The bundle name maps to the `bundleName` key in the `policycontroller.gke.io/constraintData` annotation on a constraint.
     * 
     */
    private @Nullable List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle> bundles;
    /**
     * @return Configures the installation of the Template Library. Structure is documented below.
     * 
     */
    private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary templateLibrary;

    private FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent() {}
    /**
     * @return map of bundle name to BundleInstallSpec. The bundle name maps to the `bundleName` key in the `policycontroller.gke.io/constraintData` annotation on a constraint.
     * 
     */
    public List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle> bundles() {
        return this.bundles == null ? List.of() : this.bundles;
    }
    /**
     * @return Configures the installation of the Template Library. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary> templateLibrary() {
        return Optional.ofNullable(this.templateLibrary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle> bundles;
        private @Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary templateLibrary;
        public Builder() {}
        public Builder(FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundles = defaults.bundles;
    	      this.templateLibrary = defaults.templateLibrary;
        }

        @CustomType.Setter
        public Builder bundles(@Nullable List<FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle> bundles) {

            this.bundles = bundles;
            return this;
        }
        public Builder bundles(FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundle... bundles) {
            return bundles(List.of(bundles));
        }
        @CustomType.Setter
        public Builder templateLibrary(@Nullable FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibrary templateLibrary) {

            this.templateLibrary = templateLibrary;
            return this;
        }
        public FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent build() {
            final var _resultValue = new FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContent();
            _resultValue.bundles = bundles;
            _resultValue.templateLibrary = templateLibrary;
            return _resultValue;
        }
    }
}
