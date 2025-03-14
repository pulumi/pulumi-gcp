// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterVirtualClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="clusterConfig")
    private @Nullable Output<ClusterClusterConfigArgs> clusterConfig;

    /**
     * @return Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    public Optional<Output<ClusterClusterConfigArgs>> clusterConfig() {
        return Optional.ofNullable(this.clusterConfig);
    }

    @Import(name="gracefulDecommissionTimeout")
    private @Nullable Output<String> gracefulDecommissionTimeout;

    public Optional<Output<String>> gracefulDecommissionTimeout() {
        return Optional.ofNullable(this.gracefulDecommissionTimeout);
    }

    /**
     * The list of the labels (key/value pairs) configured on the resource and to be applied to instances in the cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer
     * to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The list of the labels (key/value pairs) configured on the resource and to be applied to instances in the cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer
     * to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the cluster, unique within the project and
     * zone.
     * 
     * ***
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cluster, unique within the project and
     * zone.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Allows you to configure a virtual Dataproc on GKE cluster.
     * Structure defined below.
     * 
     */
    @Import(name="virtualClusterConfig")
    private @Nullable Output<ClusterVirtualClusterConfigArgs> virtualClusterConfig;

    /**
     * @return Allows you to configure a virtual Dataproc on GKE cluster.
     * Structure defined below.
     * 
     */
    public Optional<Output<ClusterVirtualClusterConfigArgs>> virtualClusterConfig() {
        return Optional.ofNullable(this.virtualClusterConfig);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.clusterConfig = $.clusterConfig;
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.virtualClusterConfig = $.virtualClusterConfig;
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
         * @param clusterConfig Allows you to configure various aspects of the cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(@Nullable Output<ClusterClusterConfigArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * @param clusterConfig Allows you to configure various aspects of the cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(ClusterClusterConfigArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        public Builder gracefulDecommissionTimeout(@Nullable Output<String> gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            return gracefulDecommissionTimeout(Output.of(gracefulDecommissionTimeout));
        }

        /**
         * @param labels The list of the labels (key/value pairs) configured on the resource and to be applied to instances in the cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer
         * to the field &#39;effective_labels&#39; for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The list of the labels (key/value pairs) configured on the resource and to be applied to instances in the cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer
         * to the field &#39;effective_labels&#39; for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the cluster, unique within the project and
         * zone.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster, unique within the project and
         * zone.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the `cluster` will exist. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the `cluster` will exist. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the cluster and associated nodes will be created in.
         * Defaults to `global`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the cluster and associated nodes will be created in.
         * Defaults to `global`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param virtualClusterConfig Allows you to configure a virtual Dataproc on GKE cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder virtualClusterConfig(@Nullable Output<ClusterVirtualClusterConfigArgs> virtualClusterConfig) {
            $.virtualClusterConfig = virtualClusterConfig;
            return this;
        }

        /**
         * @param virtualClusterConfig Allows you to configure a virtual Dataproc on GKE cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder virtualClusterConfig(ClusterVirtualClusterConfigArgs virtualClusterConfig) {
            return virtualClusterConfig(Output.of(virtualClusterConfig));
        }

        public ClusterArgs build() {
            return $;
        }
    }

}
