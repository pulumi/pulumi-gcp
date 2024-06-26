// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceNetworkConfigConsumerArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreServiceNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceNetworkConfigArgs Empty = new MetastoreServiceNetworkConfigArgs();

    /**
     * The consumer-side network configuration for the Dataproc Metastore instance.
     * Structure is documented below.
     * 
     */
    @Import(name="consumers", required=true)
    private Output<List<MetastoreServiceNetworkConfigConsumerArgs>> consumers;

    /**
     * @return The consumer-side network configuration for the Dataproc Metastore instance.
     * Structure is documented below.
     * 
     */
    public Output<List<MetastoreServiceNetworkConfigConsumerArgs>> consumers() {
        return this.consumers;
    }

    /**
     * Enables custom routes to be imported and exported for the Dataproc Metastore service&#39;s peered VPC network.
     * 
     */
    @Import(name="customRoutesEnabled")
    private @Nullable Output<Boolean> customRoutesEnabled;

    /**
     * @return Enables custom routes to be imported and exported for the Dataproc Metastore service&#39;s peered VPC network.
     * 
     */
    public Optional<Output<Boolean>> customRoutesEnabled() {
        return Optional.ofNullable(this.customRoutesEnabled);
    }

    private MetastoreServiceNetworkConfigArgs() {}

    private MetastoreServiceNetworkConfigArgs(MetastoreServiceNetworkConfigArgs $) {
        this.consumers = $.consumers;
        this.customRoutesEnabled = $.customRoutesEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreServiceNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreServiceNetworkConfigArgs $;

        public Builder() {
            $ = new MetastoreServiceNetworkConfigArgs();
        }

        public Builder(MetastoreServiceNetworkConfigArgs defaults) {
            $ = new MetastoreServiceNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumers The consumer-side network configuration for the Dataproc Metastore instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder consumers(Output<List<MetastoreServiceNetworkConfigConsumerArgs>> consumers) {
            $.consumers = consumers;
            return this;
        }

        /**
         * @param consumers The consumer-side network configuration for the Dataproc Metastore instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder consumers(List<MetastoreServiceNetworkConfigConsumerArgs> consumers) {
            return consumers(Output.of(consumers));
        }

        /**
         * @param consumers The consumer-side network configuration for the Dataproc Metastore instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder consumers(MetastoreServiceNetworkConfigConsumerArgs... consumers) {
            return consumers(List.of(consumers));
        }

        /**
         * @param customRoutesEnabled Enables custom routes to be imported and exported for the Dataproc Metastore service&#39;s peered VPC network.
         * 
         * @return builder
         * 
         */
        public Builder customRoutesEnabled(@Nullable Output<Boolean> customRoutesEnabled) {
            $.customRoutesEnabled = customRoutesEnabled;
            return this;
        }

        /**
         * @param customRoutesEnabled Enables custom routes to be imported and exported for the Dataproc Metastore service&#39;s peered VPC network.
         * 
         * @return builder
         * 
         */
        public Builder customRoutesEnabled(Boolean customRoutesEnabled) {
            return customRoutesEnabled(Output.of(customRoutesEnabled));
        }

        public MetastoreServiceNetworkConfigArgs build() {
            if ($.consumers == null) {
                throw new MissingRequiredPropertyException("MetastoreServiceNetworkConfigArgs", "consumers");
            }
            return $;
        }
    }

}
