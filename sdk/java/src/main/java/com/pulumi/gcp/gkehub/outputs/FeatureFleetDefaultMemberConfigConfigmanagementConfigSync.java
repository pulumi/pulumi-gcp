// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci;
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
        private @Nullable String sourceFormat;
        public Builder() {}
        public Builder(FeatureFleetDefaultMemberConfigConfigmanagementConfigSync defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.git = defaults.git;
    	      this.oci = defaults.oci;
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
        public Builder sourceFormat(@Nullable String sourceFormat) {
            this.sourceFormat = sourceFormat;
            return this;
        }
        public FeatureFleetDefaultMemberConfigConfigmanagementConfigSync build() {
            final var o = new FeatureFleetDefaultMemberConfigConfigmanagementConfigSync();
            o.git = git;
            o.oci = oci;
            o.sourceFormat = sourceFormat;
            return o;
        }
    }
}