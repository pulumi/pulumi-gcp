// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs Empty = new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="bundle", required=true)
    private Output<String> bundle;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> bundle() {
        return this.bundle;
    }

    /**
     * The set of namespaces to be exempted from the bundle.
     * 
     */
    @Import(name="exemptedNamespaces")
    private @Nullable Output<List<String>> exemptedNamespaces;

    /**
     * @return The set of namespaces to be exempted from the bundle.
     * 
     */
    public Optional<Output<List<String>>> exemptedNamespaces() {
        return Optional.ofNullable(this.exemptedNamespaces);
    }

    private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs() {}

    private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs $) {
        this.bundle = $.bundle;
        this.exemptedNamespaces = $.exemptedNamespaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs $;

        public Builder() {
            $ = new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs();
        }

        public Builder(FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs defaults) {
            $ = new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundle The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder bundle(Output<String> bundle) {
            $.bundle = bundle;
            return this;
        }

        /**
         * @param bundle The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder bundle(String bundle) {
            return bundle(Output.of(bundle));
        }

        /**
         * @param exemptedNamespaces The set of namespaces to be exempted from the bundle.
         * 
         * @return builder
         * 
         */
        public Builder exemptedNamespaces(@Nullable Output<List<String>> exemptedNamespaces) {
            $.exemptedNamespaces = exemptedNamespaces;
            return this;
        }

        /**
         * @param exemptedNamespaces The set of namespaces to be exempted from the bundle.
         * 
         * @return builder
         * 
         */
        public Builder exemptedNamespaces(List<String> exemptedNamespaces) {
            return exemptedNamespaces(Output.of(exemptedNamespaces));
        }

        /**
         * @param exemptedNamespaces The set of namespaces to be exempted from the bundle.
         * 
         * @return builder
         * 
         */
        public Builder exemptedNamespaces(String... exemptedNamespaces) {
            return exemptedNamespaces(List.of(exemptedNamespaces));
        }

        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs build() {
            if ($.bundle == null) {
                throw new MissingRequiredPropertyException("FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs", "bundle");
            }
            return $;
        }
    }

}
