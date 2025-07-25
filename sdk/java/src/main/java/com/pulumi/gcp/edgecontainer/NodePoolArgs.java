// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.edgecontainer.inputs.NodePoolLocalDiskEncryptionArgs;
import com.pulumi.gcp.edgecontainer.inputs.NodePoolNodeConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * The name of the target Distributed Cloud Edge Cluster.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The name of the target Distributed Cloud Edge Cluster.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * Labels associated with this resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels associated with this resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Local disk encryption options. This field is only used when enabling CMEK support.
     * Structure is documented below.
     * 
     */
    @Import(name="localDiskEncryption")
    private @Nullable Output<NodePoolLocalDiskEncryptionArgs> localDiskEncryption;

    /**
     * @return Local disk encryption options. This field is only used when enabling CMEK support.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NodePoolLocalDiskEncryptionArgs>> localDiskEncryption() {
        return Optional.ofNullable(this.localDiskEncryption);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Only machines matching this filter will be allowed to join the node pool.
     * The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;, and is
     * documented in more detail in [AIP-160](https://google.aip.dev/160).
     * 
     */
    @Import(name="machineFilter")
    private @Nullable Output<String> machineFilter;

    /**
     * @return Only machines matching this filter will be allowed to join the node pool.
     * The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;, and is
     * documented in more detail in [AIP-160](https://google.aip.dev/160).
     * 
     */
    public Optional<Output<String>> machineFilter() {
        return Optional.ofNullable(this.machineFilter);
    }

    /**
     * The resource name of the node pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the node pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for each node in the NodePool
     * Structure is documented below.
     * 
     */
    @Import(name="nodeConfig")
    private @Nullable Output<NodePoolNodeConfigArgs> nodeConfig;

    /**
     * @return Configuration for each node in the NodePool
     * Structure is documented below.
     * 
     */
    public Optional<Output<NodePoolNodeConfigArgs>> nodeConfig() {
        return Optional.ofNullable(this.nodeConfig);
    }

    /**
     * The number of nodes in the pool.
     * 
     */
    @Import(name="nodeCount", required=true)
    private Output<Integer> nodeCount;

    /**
     * @return The number of nodes in the pool.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }

    /**
     * Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
     * 
     */
    @Import(name="nodeLocation", required=true)
    private Output<String> nodeLocation;

    /**
     * @return Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
     * 
     */
    public Output<String> nodeLocation() {
        return this.nodeLocation;
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

    private NodePoolArgs() {}

    private NodePoolArgs(NodePoolArgs $) {
        this.cluster = $.cluster;
        this.labels = $.labels;
        this.localDiskEncryption = $.localDiskEncryption;
        this.location = $.location;
        this.machineFilter = $.machineFilter;
        this.name = $.name;
        this.nodeConfig = $.nodeConfig;
        this.nodeCount = $.nodeCount;
        this.nodeLocation = $.nodeLocation;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolArgs $;

        public Builder() {
            $ = new NodePoolArgs();
        }

        public Builder(NodePoolArgs defaults) {
            $ = new NodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The name of the target Distributed Cloud Edge Cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The name of the target Distributed Cloud Edge Cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param labels Labels associated with this resource.
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
         * @param labels Labels associated with this resource.
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
         * @param localDiskEncryption Local disk encryption options. This field is only used when enabling CMEK support.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localDiskEncryption(@Nullable Output<NodePoolLocalDiskEncryptionArgs> localDiskEncryption) {
            $.localDiskEncryption = localDiskEncryption;
            return this;
        }

        /**
         * @param localDiskEncryption Local disk encryption options. This field is only used when enabling CMEK support.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder localDiskEncryption(NodePoolLocalDiskEncryptionArgs localDiskEncryption) {
            return localDiskEncryption(Output.of(localDiskEncryption));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param machineFilter Only machines matching this filter will be allowed to join the node pool.
         * The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;, and is
         * documented in more detail in [AIP-160](https://google.aip.dev/160).
         * 
         * @return builder
         * 
         */
        public Builder machineFilter(@Nullable Output<String> machineFilter) {
            $.machineFilter = machineFilter;
            return this;
        }

        /**
         * @param machineFilter Only machines matching this filter will be allowed to join the node pool.
         * The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;, and is
         * documented in more detail in [AIP-160](https://google.aip.dev/160).
         * 
         * @return builder
         * 
         */
        public Builder machineFilter(String machineFilter) {
            return machineFilter(Output.of(machineFilter));
        }

        /**
         * @param name The resource name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeConfig Configuration for each node in the NodePool
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(@Nullable Output<NodePoolNodeConfigArgs> nodeConfig) {
            $.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * @param nodeConfig Configuration for each node in the NodePool
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(NodePoolNodeConfigArgs nodeConfig) {
            return nodeConfig(Output.of(nodeConfig));
        }

        /**
         * @param nodeCount The number of nodes in the pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes in the pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param nodeLocation Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
         * 
         * @return builder
         * 
         */
        public Builder nodeLocation(Output<String> nodeLocation) {
            $.nodeLocation = nodeLocation;
            return this;
        }

        /**
         * @param nodeLocation Name of the Google Distributed Cloud Edge zone where this node pool will be created. For example: `us-central1-edge-customer-a`.
         * 
         * @return builder
         * 
         */
        public Builder nodeLocation(String nodeLocation) {
            return nodeLocation(Output.of(nodeLocation));
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

        public NodePoolArgs build() {
            if ($.cluster == null) {
                throw new MissingRequiredPropertyException("NodePoolArgs", "cluster");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("NodePoolArgs", "location");
            }
            if ($.nodeCount == null) {
                throw new MissingRequiredPropertyException("NodePoolArgs", "nodeCount");
            }
            if ($.nodeLocation == null) {
                throw new MissingRequiredPropertyException("NodePoolArgs", "nodeLocation");
            }
            return $;
        }
    }

}
