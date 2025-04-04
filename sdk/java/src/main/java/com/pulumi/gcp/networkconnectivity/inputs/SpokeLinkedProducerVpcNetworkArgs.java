// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeLinkedProducerVpcNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedProducerVpcNetworkArgs Empty = new SpokeLinkedProducerVpcNetworkArgs();

    /**
     * IP ranges encompassing the subnets to be excluded from peering.
     * 
     */
    @Import(name="excludeExportRanges")
    private @Nullable Output<List<String>> excludeExportRanges;

    /**
     * @return IP ranges encompassing the subnets to be excluded from peering.
     * 
     */
    public Optional<Output<List<String>>> excludeExportRanges() {
        return Optional.ofNullable(this.excludeExportRanges);
    }

    /**
     * IP ranges allowed to be included from peering.
     * 
     */
    @Import(name="includeExportRanges")
    private @Nullable Output<List<String>> includeExportRanges;

    /**
     * @return IP ranges allowed to be included from peering.
     * 
     */
    public Optional<Output<List<String>>> includeExportRanges() {
        return Optional.ofNullable(this.includeExportRanges);
    }

    /**
     * The URI of the Service Consumer VPC that the Producer VPC is peered with.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The URI of the Service Consumer VPC that the Producer VPC is peered with.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The name of the VPC peering between the Service Consumer VPC and the Producer VPC (defined in the Tenant project) which is added to the NCC hub. This peering must be in ACTIVE state.
     * 
     */
    @Import(name="peering", required=true)
    private Output<String> peering;

    /**
     * @return The name of the VPC peering between the Service Consumer VPC and the Producer VPC (defined in the Tenant project) which is added to the NCC hub. This peering must be in ACTIVE state.
     * 
     */
    public Output<String> peering() {
        return this.peering;
    }

    /**
     * (Output)
     * The URI of the Producer VPC.
     * 
     */
    @Import(name="producerNetwork")
    private @Nullable Output<String> producerNetwork;

    /**
     * @return (Output)
     * The URI of the Producer VPC.
     * 
     */
    public Optional<Output<String>> producerNetwork() {
        return Optional.ofNullable(this.producerNetwork);
    }

    private SpokeLinkedProducerVpcNetworkArgs() {}

    private SpokeLinkedProducerVpcNetworkArgs(SpokeLinkedProducerVpcNetworkArgs $) {
        this.excludeExportRanges = $.excludeExportRanges;
        this.includeExportRanges = $.includeExportRanges;
        this.network = $.network;
        this.peering = $.peering;
        this.producerNetwork = $.producerNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeLinkedProducerVpcNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeLinkedProducerVpcNetworkArgs $;

        public Builder() {
            $ = new SpokeLinkedProducerVpcNetworkArgs();
        }

        public Builder(SpokeLinkedProducerVpcNetworkArgs defaults) {
            $ = new SpokeLinkedProducerVpcNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeExportRanges IP ranges encompassing the subnets to be excluded from peering.
         * 
         * @return builder
         * 
         */
        public Builder excludeExportRanges(@Nullable Output<List<String>> excludeExportRanges) {
            $.excludeExportRanges = excludeExportRanges;
            return this;
        }

        /**
         * @param excludeExportRanges IP ranges encompassing the subnets to be excluded from peering.
         * 
         * @return builder
         * 
         */
        public Builder excludeExportRanges(List<String> excludeExportRanges) {
            return excludeExportRanges(Output.of(excludeExportRanges));
        }

        /**
         * @param excludeExportRanges IP ranges encompassing the subnets to be excluded from peering.
         * 
         * @return builder
         * 
         */
        public Builder excludeExportRanges(String... excludeExportRanges) {
            return excludeExportRanges(List.of(excludeExportRanges));
        }

        /**
         * @param includeExportRanges IP ranges allowed to be included from peering.
         * 
         * @return builder
         * 
         */
        public Builder includeExportRanges(@Nullable Output<List<String>> includeExportRanges) {
            $.includeExportRanges = includeExportRanges;
            return this;
        }

        /**
         * @param includeExportRanges IP ranges allowed to be included from peering.
         * 
         * @return builder
         * 
         */
        public Builder includeExportRanges(List<String> includeExportRanges) {
            return includeExportRanges(Output.of(includeExportRanges));
        }

        /**
         * @param includeExportRanges IP ranges allowed to be included from peering.
         * 
         * @return builder
         * 
         */
        public Builder includeExportRanges(String... includeExportRanges) {
            return includeExportRanges(List.of(includeExportRanges));
        }

        /**
         * @param network The URI of the Service Consumer VPC that the Producer VPC is peered with.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The URI of the Service Consumer VPC that the Producer VPC is peered with.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param peering The name of the VPC peering between the Service Consumer VPC and the Producer VPC (defined in the Tenant project) which is added to the NCC hub. This peering must be in ACTIVE state.
         * 
         * @return builder
         * 
         */
        public Builder peering(Output<String> peering) {
            $.peering = peering;
            return this;
        }

        /**
         * @param peering The name of the VPC peering between the Service Consumer VPC and the Producer VPC (defined in the Tenant project) which is added to the NCC hub. This peering must be in ACTIVE state.
         * 
         * @return builder
         * 
         */
        public Builder peering(String peering) {
            return peering(Output.of(peering));
        }

        /**
         * @param producerNetwork (Output)
         * The URI of the Producer VPC.
         * 
         * @return builder
         * 
         */
        public Builder producerNetwork(@Nullable Output<String> producerNetwork) {
            $.producerNetwork = producerNetwork;
            return this;
        }

        /**
         * @param producerNetwork (Output)
         * The URI of the Producer VPC.
         * 
         * @return builder
         * 
         */
        public Builder producerNetwork(String producerNetwork) {
            return producerNetwork(Output.of(producerNetwork));
        }

        public SpokeLinkedProducerVpcNetworkArgs build() {
            if ($.network == null) {
                throw new MissingRequiredPropertyException("SpokeLinkedProducerVpcNetworkArgs", "network");
            }
            if ($.peering == null) {
                throw new MissingRequiredPropertyException("SpokeLinkedProducerVpcNetworkArgs", "peering");
            }
            return $;
        }
    }

}
