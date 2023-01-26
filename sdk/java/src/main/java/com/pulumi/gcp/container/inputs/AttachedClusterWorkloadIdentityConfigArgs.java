// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttachedClusterWorkloadIdentityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedClusterWorkloadIdentityConfigArgs Empty = new AttachedClusterWorkloadIdentityConfigArgs();

    /**
     * The ID of the OIDC Identity Provider (IdP) associated to
     * the Workload Identity Pool.
     * 
     */
    @Import(name="identityProvider")
    private @Nullable Output<String> identityProvider;

    /**
     * @return The ID of the OIDC Identity Provider (IdP) associated to
     * the Workload Identity Pool.
     * 
     */
    public Optional<Output<String>> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }

    /**
     * The OIDC issuer URL for this cluster.
     * 
     */
    @Import(name="issuerUri")
    private @Nullable Output<String> issuerUri;

    /**
     * @return The OIDC issuer URL for this cluster.
     * 
     */
    public Optional<Output<String>> issuerUri() {
        return Optional.ofNullable(this.issuerUri);
    }

    /**
     * The Workload Identity Pool associated to the cluster.
     * 
     */
    @Import(name="workloadPool")
    private @Nullable Output<String> workloadPool;

    /**
     * @return The Workload Identity Pool associated to the cluster.
     * 
     */
    public Optional<Output<String>> workloadPool() {
        return Optional.ofNullable(this.workloadPool);
    }

    private AttachedClusterWorkloadIdentityConfigArgs() {}

    private AttachedClusterWorkloadIdentityConfigArgs(AttachedClusterWorkloadIdentityConfigArgs $) {
        this.identityProvider = $.identityProvider;
        this.issuerUri = $.issuerUri;
        this.workloadPool = $.workloadPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedClusterWorkloadIdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedClusterWorkloadIdentityConfigArgs $;

        public Builder() {
            $ = new AttachedClusterWorkloadIdentityConfigArgs();
        }

        public Builder(AttachedClusterWorkloadIdentityConfigArgs defaults) {
            $ = new AttachedClusterWorkloadIdentityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProvider The ID of the OIDC Identity Provider (IdP) associated to
         * the Workload Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(@Nullable Output<String> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider The ID of the OIDC Identity Provider (IdP) associated to
         * the Workload Identity Pool.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(String identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        /**
         * @param issuerUri The OIDC issuer URL for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(@Nullable Output<String> issuerUri) {
            $.issuerUri = issuerUri;
            return this;
        }

        /**
         * @param issuerUri The OIDC issuer URL for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(String issuerUri) {
            return issuerUri(Output.of(issuerUri));
        }

        /**
         * @param workloadPool The Workload Identity Pool associated to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder workloadPool(@Nullable Output<String> workloadPool) {
            $.workloadPool = workloadPool;
            return this;
        }

        /**
         * @param workloadPool The Workload Identity Pool associated to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder workloadPool(String workloadPool) {
            return workloadPool(Output.of(workloadPool));
        }

        public AttachedClusterWorkloadIdentityConfigArgs build() {
            return $;
        }
    }

}