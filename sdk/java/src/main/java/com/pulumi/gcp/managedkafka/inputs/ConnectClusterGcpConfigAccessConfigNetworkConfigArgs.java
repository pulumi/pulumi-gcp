// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.managedkafka.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectClusterGcpConfigAccessConfigNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectClusterGcpConfigAccessConfigNetworkConfigArgs Empty = new ConnectClusterGcpConfigAccessConfigNetworkConfigArgs();

    /**
     * Additional subnets may be specified. They may be in another region, but must be in the same VPC network. The Connect workers can communicate with network endpoints in either the primary or additional subnets.
     * 
     */
    @Import(name="additionalSubnets")
    private @Nullable Output<List<String>> additionalSubnets;

    /**
     * @return Additional subnets may be specified. They may be in another region, but must be in the same VPC network. The Connect workers can communicate with network endpoints in either the primary or additional subnets.
     * 
     */
    public Optional<Output<List<String>>> additionalSubnets() {
        return Optional.ofNullable(this.additionalSubnets);
    }

    /**
     * Additional DNS domain names from the subnet&#39;s network to be made visible to the Connect Cluster. When using MirrorMaker2, it&#39;s necessary to add the bootstrap address&#39;s dns domain name of the target cluster to make it visible to the connector. For example: my-kafka-cluster.us-central1.managedkafka.my-project.cloud.goog
     * 
     */
    @Import(name="dnsDomainNames")
    private @Nullable Output<List<String>> dnsDomainNames;

    /**
     * @return Additional DNS domain names from the subnet&#39;s network to be made visible to the Connect Cluster. When using MirrorMaker2, it&#39;s necessary to add the bootstrap address&#39;s dns domain name of the target cluster to make it visible to the connector. For example: my-kafka-cluster.us-central1.managedkafka.my-project.cloud.goog
     * 
     */
    public Optional<Output<List<String>>> dnsDomainNames() {
        return Optional.ofNullable(this.dnsDomainNames);
    }

    /**
     * VPC subnet to make available to the Kafka Connect cluster. Structured like: projects/{project}/regions/{region}/subnetworks/{subnet_id}. It is used to create a Private Service Connect (PSC) interface for the Kafka Connect workers. It must be located in the same region as the Kafka Connect cluster. The CIDR range of the subnet must be within the IPv4 address ranges for private networks, as specified in RFC 1918. The primary subnet CIDR range must have a minimum size of /22 (1024 addresses).
     * 
     */
    @Import(name="primarySubnet", required=true)
    private Output<String> primarySubnet;

    /**
     * @return VPC subnet to make available to the Kafka Connect cluster. Structured like: projects/{project}/regions/{region}/subnetworks/{subnet_id}. It is used to create a Private Service Connect (PSC) interface for the Kafka Connect workers. It must be located in the same region as the Kafka Connect cluster. The CIDR range of the subnet must be within the IPv4 address ranges for private networks, as specified in RFC 1918. The primary subnet CIDR range must have a minimum size of /22 (1024 addresses).
     * 
     */
    public Output<String> primarySubnet() {
        return this.primarySubnet;
    }

    private ConnectClusterGcpConfigAccessConfigNetworkConfigArgs() {}

    private ConnectClusterGcpConfigAccessConfigNetworkConfigArgs(ConnectClusterGcpConfigAccessConfigNetworkConfigArgs $) {
        this.additionalSubnets = $.additionalSubnets;
        this.dnsDomainNames = $.dnsDomainNames;
        this.primarySubnet = $.primarySubnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectClusterGcpConfigAccessConfigNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectClusterGcpConfigAccessConfigNetworkConfigArgs $;

        public Builder() {
            $ = new ConnectClusterGcpConfigAccessConfigNetworkConfigArgs();
        }

        public Builder(ConnectClusterGcpConfigAccessConfigNetworkConfigArgs defaults) {
            $ = new ConnectClusterGcpConfigAccessConfigNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalSubnets Additional subnets may be specified. They may be in another region, but must be in the same VPC network. The Connect workers can communicate with network endpoints in either the primary or additional subnets.
         * 
         * @return builder
         * 
         */
        public Builder additionalSubnets(@Nullable Output<List<String>> additionalSubnets) {
            $.additionalSubnets = additionalSubnets;
            return this;
        }

        /**
         * @param additionalSubnets Additional subnets may be specified. They may be in another region, but must be in the same VPC network. The Connect workers can communicate with network endpoints in either the primary or additional subnets.
         * 
         * @return builder
         * 
         */
        public Builder additionalSubnets(List<String> additionalSubnets) {
            return additionalSubnets(Output.of(additionalSubnets));
        }

        /**
         * @param additionalSubnets Additional subnets may be specified. They may be in another region, but must be in the same VPC network. The Connect workers can communicate with network endpoints in either the primary or additional subnets.
         * 
         * @return builder
         * 
         */
        public Builder additionalSubnets(String... additionalSubnets) {
            return additionalSubnets(List.of(additionalSubnets));
        }

        /**
         * @param dnsDomainNames Additional DNS domain names from the subnet&#39;s network to be made visible to the Connect Cluster. When using MirrorMaker2, it&#39;s necessary to add the bootstrap address&#39;s dns domain name of the target cluster to make it visible to the connector. For example: my-kafka-cluster.us-central1.managedkafka.my-project.cloud.goog
         * 
         * @return builder
         * 
         */
        public Builder dnsDomainNames(@Nullable Output<List<String>> dnsDomainNames) {
            $.dnsDomainNames = dnsDomainNames;
            return this;
        }

        /**
         * @param dnsDomainNames Additional DNS domain names from the subnet&#39;s network to be made visible to the Connect Cluster. When using MirrorMaker2, it&#39;s necessary to add the bootstrap address&#39;s dns domain name of the target cluster to make it visible to the connector. For example: my-kafka-cluster.us-central1.managedkafka.my-project.cloud.goog
         * 
         * @return builder
         * 
         */
        public Builder dnsDomainNames(List<String> dnsDomainNames) {
            return dnsDomainNames(Output.of(dnsDomainNames));
        }

        /**
         * @param dnsDomainNames Additional DNS domain names from the subnet&#39;s network to be made visible to the Connect Cluster. When using MirrorMaker2, it&#39;s necessary to add the bootstrap address&#39;s dns domain name of the target cluster to make it visible to the connector. For example: my-kafka-cluster.us-central1.managedkafka.my-project.cloud.goog
         * 
         * @return builder
         * 
         */
        public Builder dnsDomainNames(String... dnsDomainNames) {
            return dnsDomainNames(List.of(dnsDomainNames));
        }

        /**
         * @param primarySubnet VPC subnet to make available to the Kafka Connect cluster. Structured like: projects/{project}/regions/{region}/subnetworks/{subnet_id}. It is used to create a Private Service Connect (PSC) interface for the Kafka Connect workers. It must be located in the same region as the Kafka Connect cluster. The CIDR range of the subnet must be within the IPv4 address ranges for private networks, as specified in RFC 1918. The primary subnet CIDR range must have a minimum size of /22 (1024 addresses).
         * 
         * @return builder
         * 
         */
        public Builder primarySubnet(Output<String> primarySubnet) {
            $.primarySubnet = primarySubnet;
            return this;
        }

        /**
         * @param primarySubnet VPC subnet to make available to the Kafka Connect cluster. Structured like: projects/{project}/regions/{region}/subnetworks/{subnet_id}. It is used to create a Private Service Connect (PSC) interface for the Kafka Connect workers. It must be located in the same region as the Kafka Connect cluster. The CIDR range of the subnet must be within the IPv4 address ranges for private networks, as specified in RFC 1918. The primary subnet CIDR range must have a minimum size of /22 (1024 addresses).
         * 
         * @return builder
         * 
         */
        public Builder primarySubnet(String primarySubnet) {
            return primarySubnet(Output.of(primarySubnet));
        }

        public ConnectClusterGcpConfigAccessConfigNetworkConfigArgs build() {
            if ($.primarySubnet == null) {
                throw new MissingRequiredPropertyException("ConnectClusterGcpConfigAccessConfigNetworkConfigArgs", "primarySubnet");
            }
            return $;
        }
    }

}
