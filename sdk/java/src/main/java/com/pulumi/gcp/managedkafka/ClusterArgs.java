// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.managedkafka;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs;
import com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs;
import com.pulumi.gcp.managedkafka.inputs.ClusterRebalanceConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * A capacity configuration of a Kafka cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="capacityConfig", required=true)
    private Output<ClusterCapacityConfigArgs> capacityConfig;

    /**
     * @return A capacity configuration of a Kafka cluster.
     * Structure is documented below.
     * 
     */
    public Output<ClusterCapacityConfigArgs> capacityConfig() {
        return this.capacityConfig;
    }

    /**
     * The ID to use for the cluster, which will become the final component of the cluster&#39;s name. The ID must be 1-63 characters long, and match the regular expression `a-z?` to comply with RFC 1035. This value is structured like: `my-cluster-id`.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID to use for the cluster, which will become the final component of the cluster&#39;s name. The ID must be 1-63 characters long, and match the regular expression `a-z?` to comply with RFC 1035. This value is structured like: `my-cluster-id`.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
     * Structure is documented below.
     * 
     */
    @Import(name="gcpConfig", required=true)
    private Output<ClusterGcpConfigArgs> gcpConfig;

    /**
     * @return Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
     * Structure is documented below.
     * 
     */
    public Output<ClusterGcpConfigArgs> gcpConfig() {
        return this.gcpConfig;
    }

    /**
     * List of label KEY=VALUE pairs to add. Keys must start with a lowercase character and contain only hyphens (-), underscores ( ), lowercase characters, and numbers. Values must contain only hyphens (-), underscores ( ), lowercase characters, and numbers.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return List of label KEY=VALUE pairs to add. Keys must start with a lowercase character and contain only hyphens (-), underscores ( ), lowercase characters, and numbers. Values must contain only hyphens (-), underscores ( ), lowercase characters, and numbers.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Defines rebalancing behavior of a Kafka cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="rebalanceConfig")
    private @Nullable Output<ClusterRebalanceConfigArgs> rebalanceConfig;

    /**
     * @return Defines rebalancing behavior of a Kafka cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterRebalanceConfigArgs>> rebalanceConfig() {
        return Optional.ofNullable(this.rebalanceConfig);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.capacityConfig = $.capacityConfig;
        this.clusterId = $.clusterId;
        this.gcpConfig = $.gcpConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.rebalanceConfig = $.rebalanceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityConfig A capacity configuration of a Kafka cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder capacityConfig(Output<ClusterCapacityConfigArgs> capacityConfig) {
            $.capacityConfig = capacityConfig;
            return this;
        }

        /**
         * @param capacityConfig A capacity configuration of a Kafka cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder capacityConfig(ClusterCapacityConfigArgs capacityConfig) {
            return capacityConfig(Output.of(capacityConfig));
        }

        /**
         * @param clusterId The ID to use for the cluster, which will become the final component of the cluster&#39;s name. The ID must be 1-63 characters long, and match the regular expression `a-z?` to comply with RFC 1035. This value is structured like: `my-cluster-id`.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID to use for the cluster, which will become the final component of the cluster&#39;s name. The ID must be 1-63 characters long, and match the regular expression `a-z?` to comply with RFC 1035. This value is structured like: `my-cluster-id`.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param gcpConfig Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcpConfig(Output<ClusterGcpConfigArgs> gcpConfig) {
            $.gcpConfig = gcpConfig;
            return this;
        }

        /**
         * @param gcpConfig Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcpConfig(ClusterGcpConfigArgs gcpConfig) {
            return gcpConfig(Output.of(gcpConfig));
        }

        /**
         * @param labels List of label KEY=VALUE pairs to add. Keys must start with a lowercase character and contain only hyphens (-), underscores ( ), lowercase characters, and numbers. Values must contain only hyphens (-), underscores ( ), lowercase characters, and numbers.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels List of label KEY=VALUE pairs to add. Keys must start with a lowercase character and contain only hyphens (-), underscores ( ), lowercase characters, and numbers. Values must contain only hyphens (-), underscores ( ), lowercase characters, and numbers.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location ID of the location of the Kafka resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rebalanceConfig Defines rebalancing behavior of a Kafka cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rebalanceConfig(@Nullable Output<ClusterRebalanceConfigArgs> rebalanceConfig) {
            $.rebalanceConfig = rebalanceConfig;
            return this;
        }

        /**
         * @param rebalanceConfig Defines rebalancing behavior of a Kafka cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rebalanceConfig(ClusterRebalanceConfigArgs rebalanceConfig) {
            return rebalanceConfig(Output.of(rebalanceConfig));
        }

        public ClusterArgs build() {
            if ($.capacityConfig == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "capacityConfig");
            }
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "clusterId");
            }
            if ($.gcpConfig == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "gcpConfig");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "location");
            }
            return $;
        }
    }

}
