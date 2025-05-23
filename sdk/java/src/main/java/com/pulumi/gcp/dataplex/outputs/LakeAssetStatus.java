// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LakeAssetStatus {
    /**
     * @return Number of active assets.
     * 
     */
    private @Nullable Integer activeAssets;
    /**
     * @return Number of assets that are in process of updating the security policy on attached resources.
     * 
     */
    private @Nullable Integer securityPolicyApplyingAssets;
    /**
     * @return Output only. The time when the lake was last updated.
     * 
     */
    private @Nullable String updateTime;

    private LakeAssetStatus() {}
    /**
     * @return Number of active assets.
     * 
     */
    public Optional<Integer> activeAssets() {
        return Optional.ofNullable(this.activeAssets);
    }
    /**
     * @return Number of assets that are in process of updating the security policy on attached resources.
     * 
     */
    public Optional<Integer> securityPolicyApplyingAssets() {
        return Optional.ofNullable(this.securityPolicyApplyingAssets);
    }
    /**
     * @return Output only. The time when the lake was last updated.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LakeAssetStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer activeAssets;
        private @Nullable Integer securityPolicyApplyingAssets;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(LakeAssetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeAssets = defaults.activeAssets;
    	      this.securityPolicyApplyingAssets = defaults.securityPolicyApplyingAssets;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder activeAssets(@Nullable Integer activeAssets) {

            this.activeAssets = activeAssets;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyApplyingAssets(@Nullable Integer securityPolicyApplyingAssets) {

            this.securityPolicyApplyingAssets = securityPolicyApplyingAssets;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {

            this.updateTime = updateTime;
            return this;
        }
        public LakeAssetStatus build() {
            final var _resultValue = new LakeAssetStatus();
            _resultValue.activeAssets = activeAssets;
            _resultValue.securityPolicyApplyingAssets = securityPolicyApplyingAssets;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
