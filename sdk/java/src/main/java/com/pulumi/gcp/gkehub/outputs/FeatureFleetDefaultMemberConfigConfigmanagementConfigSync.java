// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFleetDefaultMemberConfigConfigmanagementConfigSync {
    /**
     * @return Git repo configuration for the cluster
     * Structure is documented below.
     * 
     */
    private @Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit git;
    /**
     * @return OCI repo configuration for the cluster
     * Structure is documented below.
     * 
     */
    private @Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci oci;
    /**
     * @return Set to true to enable the Config Sync admission webhook to prevent drifts. If set to `false`, disables the Config Sync admission webhook and does not prevent drifts.
     * 
     */
    private @Nullable Boolean preventDrift;
    /**
     * @return Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
     * 
     */
    private @Nullable String sourceFormat;

    private FeatureFleetDefaultMemberConfigConfigmanagementConfigSync() {}
    /**
     * @return Git repo configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Optional<FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit> git() {
        return Optional.ofNullable(this.git);
    }
    /**
     * @return OCI repo configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Optional<FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci> oci() {
        return Optional.ofNullable(this.oci);
    }
    /**
     * @return Set to true to enable the Config Sync admission webhook to prevent drifts. If set to `false`, disables the Config Sync admission webhook and does not prevent drifts.
     * 
     */
    public Optional<Boolean> preventDrift() {
        return Optional.ofNullable(this.preventDrift);
    }
    /**
     * @return Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
     * 
     */
    public Optional<String> sourceFormat() {
        return Optional.ofNullable(this.sourceFormat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFleetDefaultMemberConfigConfigmanagementConfigSync defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit git;
        private @Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci oci;
        private @Nullable Boolean preventDrift;
        private @Nullable String sourceFormat;
        public Builder() {}
        public Builder(FeatureFleetDefaultMemberConfigConfigmanagementConfigSync defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.git = defaults.git;
    	      this.oci = defaults.oci;
    	      this.preventDrift = defaults.preventDrift;
    	      this.sourceFormat = defaults.sourceFormat;
        }

        @CustomType.Setter
        public Builder git(@Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit git) {

            this.git = git;
            return this;
        }
        @CustomType.Setter
        public Builder oci(@Nullable FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci oci) {

            this.oci = oci;
            return this;
        }
        @CustomType.Setter
        public Builder preventDrift(@Nullable Boolean preventDrift) {

            this.preventDrift = preventDrift;
            return this;
        }
        @CustomType.Setter
        public Builder sourceFormat(@Nullable String sourceFormat) {

            this.sourceFormat = sourceFormat;
            return this;
        }
        public FeatureFleetDefaultMemberConfigConfigmanagementConfigSync build() {
            final var _resultValue = new FeatureFleetDefaultMemberConfigConfigmanagementConfigSync();
            _resultValue.git = git;
            _resultValue.oci = oci;
            _resultValue.preventDrift = preventDrift;
            _resultValue.sourceFormat = sourceFormat;
            return _resultValue;
        }
    }
}
