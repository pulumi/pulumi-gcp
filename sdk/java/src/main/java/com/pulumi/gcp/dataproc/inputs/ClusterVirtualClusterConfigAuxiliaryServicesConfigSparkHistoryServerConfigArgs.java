// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs Empty = new ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs();

    /**
     * Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.
     * ***
     * 
     */
    @Import(name="dataprocCluster")
    private @Nullable Output<String> dataprocCluster;

    /**
     * @return Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.
     * ***
     * 
     */
    public Optional<Output<String>> dataprocCluster() {
        return Optional.ofNullable(this.dataprocCluster);
    }

    private ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs() {}

    private ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs(ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs $) {
        this.dataprocCluster = $.dataprocCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs $;

        public Builder() {
            $ = new ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs();
        }

        public Builder(ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs defaults) {
            $ = new ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataprocCluster Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.
         * ***
         * 
         * @return builder
         * 
         */
        public Builder dataprocCluster(@Nullable Output<String> dataprocCluster) {
            $.dataprocCluster = dataprocCluster;
            return this;
        }

        /**
         * @param dataprocCluster Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.
         * ***
         * 
         * @return builder
         * 
         */
        public Builder dataprocCluster(String dataprocCluster) {
            return dataprocCluster(Output.of(dataprocCluster));
        }

        public ClusterVirtualClusterConfigAuxiliaryServicesConfigSparkHistoryServerConfigArgs build() {
            return $;
        }
    }

}