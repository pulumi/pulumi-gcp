// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring {
    /**
     * @return API Group of a Kubernetes resource, e.g.
     * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
     * Use empty string for core group.
     * 
     */
    private @Nullable String resourceGroup;
    /**
     * @return Kind of a Kubernetes resource, e.g.
     * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
     * 
     */
    private @Nullable String resourceKind;

    private RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring() {}
    /**
     * @return API Group of a Kubernetes resource, e.g.
     * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
     * Use empty string for core group.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return Kind of a Kubernetes resource, e.g.
     * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
     * 
     */
    public Optional<String> resourceKind() {
        return Optional.ofNullable(this.resourceKind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String resourceGroup;
        private @Nullable String resourceKind;
        public Builder() {}
        public Builder(RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceKind = defaults.resourceKind;
        }

        @CustomType.Setter
        public Builder resourceGroup(@Nullable String resourceGroup) {

            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder resourceKind(@Nullable String resourceKind) {

            this.resourceKind = resourceKind;
            return this;
        }
        public RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring build() {
            final var _resultValue = new RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiring();
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.resourceKind = resourceKind;
            return _resultValue;
        }
    }
}
