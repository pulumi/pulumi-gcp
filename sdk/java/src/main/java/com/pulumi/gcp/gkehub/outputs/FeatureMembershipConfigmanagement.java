// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementBinauthz;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementConfigSync;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementHierarchyController;
import com.pulumi.gcp.gkehub.outputs.FeatureMembershipConfigmanagementPolicyController;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipConfigmanagement {
    /**
     * @return (Optional, Deprecated)
     * Binauthz configuration for the cluster. Structure is documented below.
     * This field will be ignored and should not be set.
     * 
     */
    private @Nullable FeatureMembershipConfigmanagementBinauthz binauthz;
    /**
     * @return Config Sync configuration for the cluster. Structure is documented below.
     * 
     */
    private @Nullable FeatureMembershipConfigmanagementConfigSync configSync;
    /**
     * @return Hierarchy Controller configuration for the cluster. Structure is documented below.
     * Configuring Hierarchy Controller through the configmanagement feature is no longer recommended.
     * Use open source Kubernetes [Hierarchical Namespace Controller (HNC)](https://github.com/kubernetes-sigs/hierarchical-namespaces) instead.
     * Follow the [instructions](https://cloud.google.com/kubernetes-engine/enterprise/config-sync/docs/how-to/migrate-hierarchy-controller)
     * to migrate from Hierarchy Controller to HNC.
     * 
     */
    private @Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController;
    /**
     * @return Set this field to MANAGEMENT_AUTOMATIC to enable Config Sync auto-upgrades, and set this field to MANAGEMENT_MANUAL or MANAGEMENT_UNSPECIFIED to disable Config Sync auto-upgrades.
     * 
     */
    private @Nullable String management;
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * Configuring Policy Controller through the configmanagement feature is no longer recommended.
     * Use the policycontroller feature instead.
     * 
     */
    private @Nullable FeatureMembershipConfigmanagementPolicyController policyController;
    /**
     * @return Version of Config Sync installed.
     * 
     */
    private @Nullable String version;

    private FeatureMembershipConfigmanagement() {}
    /**
     * @return (Optional, Deprecated)
     * Binauthz configuration for the cluster. Structure is documented below.
     * This field will be ignored and should not be set.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementBinauthz> binauthz() {
        return Optional.ofNullable(this.binauthz);
    }
    /**
     * @return Config Sync configuration for the cluster. Structure is documented below.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementConfigSync> configSync() {
        return Optional.ofNullable(this.configSync);
    }
    /**
     * @return Hierarchy Controller configuration for the cluster. Structure is documented below.
     * Configuring Hierarchy Controller through the configmanagement feature is no longer recommended.
     * Use open source Kubernetes [Hierarchical Namespace Controller (HNC)](https://github.com/kubernetes-sigs/hierarchical-namespaces) instead.
     * Follow the [instructions](https://cloud.google.com/kubernetes-engine/enterprise/config-sync/docs/how-to/migrate-hierarchy-controller)
     * to migrate from Hierarchy Controller to HNC.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementHierarchyController> hierarchyController() {
        return Optional.ofNullable(this.hierarchyController);
    }
    /**
     * @return Set this field to MANAGEMENT_AUTOMATIC to enable Config Sync auto-upgrades, and set this field to MANAGEMENT_MANUAL or MANAGEMENT_UNSPECIFIED to disable Config Sync auto-upgrades.
     * 
     */
    public Optional<String> management() {
        return Optional.ofNullable(this.management);
    }
    /**
     * @return Policy Controller configuration for the cluster. Structure is documented below.
     * Configuring Policy Controller through the configmanagement feature is no longer recommended.
     * Use the policycontroller feature instead.
     * 
     */
    public Optional<FeatureMembershipConfigmanagementPolicyController> policyController() {
        return Optional.ofNullable(this.policyController);
    }
    /**
     * @return Version of Config Sync installed.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FeatureMembershipConfigmanagementBinauthz binauthz;
        private @Nullable FeatureMembershipConfigmanagementConfigSync configSync;
        private @Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController;
        private @Nullable String management;
        private @Nullable FeatureMembershipConfigmanagementPolicyController policyController;
        private @Nullable String version;
        public Builder() {}
        public Builder(FeatureMembershipConfigmanagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binauthz = defaults.binauthz;
    	      this.configSync = defaults.configSync;
    	      this.hierarchyController = defaults.hierarchyController;
    	      this.management = defaults.management;
    	      this.policyController = defaults.policyController;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder binauthz(@Nullable FeatureMembershipConfigmanagementBinauthz binauthz) {

            this.binauthz = binauthz;
            return this;
        }
        @CustomType.Setter
        public Builder configSync(@Nullable FeatureMembershipConfigmanagementConfigSync configSync) {

            this.configSync = configSync;
            return this;
        }
        @CustomType.Setter
        public Builder hierarchyController(@Nullable FeatureMembershipConfigmanagementHierarchyController hierarchyController) {

            this.hierarchyController = hierarchyController;
            return this;
        }
        @CustomType.Setter
        public Builder management(@Nullable String management) {

            this.management = management;
            return this;
        }
        @CustomType.Setter
        public Builder policyController(@Nullable FeatureMembershipConfigmanagementPolicyController policyController) {

            this.policyController = policyController;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public FeatureMembershipConfigmanagement build() {
            final var _resultValue = new FeatureMembershipConfigmanagement();
            _resultValue.binauthz = binauthz;
            _resultValue.configSync = configSync;
            _resultValue.hierarchyController = hierarchyController;
            _resultValue.management = management;
            _resultValue.policyController = policyController;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
