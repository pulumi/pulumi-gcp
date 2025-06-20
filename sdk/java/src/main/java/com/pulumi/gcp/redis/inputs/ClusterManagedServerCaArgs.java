// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.redis.inputs.ClusterManagedServerCaCaCertArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterManagedServerCaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterManagedServerCaArgs Empty = new ClusterManagedServerCaArgs();

    /**
     * (Output)
     * The PEM encoded CA certificate chains for redis managed server authentication
     * Structure is documented below.
     * 
     */
    @Import(name="caCerts")
    private @Nullable Output<List<ClusterManagedServerCaCaCertArgs>> caCerts;

    /**
     * @return (Output)
     * The PEM encoded CA certificate chains for redis managed server authentication
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterManagedServerCaCaCertArgs>>> caCerts() {
        return Optional.ofNullable(this.caCerts);
    }

    private ClusterManagedServerCaArgs() {}

    private ClusterManagedServerCaArgs(ClusterManagedServerCaArgs $) {
        this.caCerts = $.caCerts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterManagedServerCaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterManagedServerCaArgs $;

        public Builder() {
            $ = new ClusterManagedServerCaArgs();
        }

        public Builder(ClusterManagedServerCaArgs defaults) {
            $ = new ClusterManagedServerCaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCerts (Output)
         * The PEM encoded CA certificate chains for redis managed server authentication
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(@Nullable Output<List<ClusterManagedServerCaCaCertArgs>> caCerts) {
            $.caCerts = caCerts;
            return this;
        }

        /**
         * @param caCerts (Output)
         * The PEM encoded CA certificate chains for redis managed server authentication
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(List<ClusterManagedServerCaCaCertArgs> caCerts) {
            return caCerts(Output.of(caCerts));
        }

        /**
         * @param caCerts (Output)
         * The PEM encoded CA certificate chains for redis managed server authentication
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(ClusterManagedServerCaCaCertArgs... caCerts) {
            return caCerts(List.of(caCerts));
        }

        public ClusterManagedServerCaArgs build() {
            return $;
        }
    }

}
