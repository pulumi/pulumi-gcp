// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs Empty = new RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs();

    /**
     * API Group of a Kubernetes resource, e.g.
     * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
     * Use empty string for core group.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return API Group of a Kubernetes resource, e.g.
     * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
     * Use empty string for core group.
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * Kind of a Kubernetes resource, e.g.
     * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
     * 
     */
    @Import(name="resourceKind")
    private @Nullable Output<String> resourceKind;

    /**
     * @return Kind of a Kubernetes resource, e.g.
     * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
     * 
     */
    public Optional<Output<String>> resourceKind() {
        return Optional.ofNullable(this.resourceKind);
    }

    private RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs() {}

    private RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs(RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs $) {
        this.resourceGroup = $.resourceGroup;
        this.resourceKind = $.resourceKind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs $;

        public Builder() {
            $ = new RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs();
        }

        public Builder(RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs defaults) {
            $ = new RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroup API Group of a Kubernetes resource, e.g.
         * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
         * Use empty string for core group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup API Group of a Kubernetes resource, e.g.
         * &#34;apiextensions.k8s.io&#34;, &#34;storage.k8s.io&#34;, etc.
         * Use empty string for core group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceKind Kind of a Kubernetes resource, e.g.
         * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
         * 
         * @return builder
         * 
         */
        public Builder resourceKind(@Nullable Output<String> resourceKind) {
            $.resourceKind = resourceKind;
            return this;
        }

        /**
         * @param resourceKind Kind of a Kubernetes resource, e.g.
         * &#34;CustomResourceDefinition&#34;, &#34;StorageClass&#34;, etc.
         * 
         * @return builder
         * 
         */
        public Builder resourceKind(String resourceKind) {
            return resourceKind(Output.of(resourceKind));
        }

        public RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs build() {
            return $;
        }
    }

}
