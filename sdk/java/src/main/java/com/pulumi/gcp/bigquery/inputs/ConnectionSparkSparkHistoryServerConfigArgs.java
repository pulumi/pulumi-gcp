// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionSparkSparkHistoryServerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionSparkSparkHistoryServerConfigArgs Empty = new ConnectionSparkSparkHistoryServerConfigArgs();

    /**
     * Resource name of an existing Dataproc Cluster to act as a Spark History Server for the connection if the form of projects/[projectId]/regions/[region]/clusters/[cluster_name].
     * 
     */
    @Import(name="dataprocCluster")
    private @Nullable Output<String> dataprocCluster;

    /**
     * @return Resource name of an existing Dataproc Cluster to act as a Spark History Server for the connection if the form of projects/[projectId]/regions/[region]/clusters/[cluster_name].
     * 
     */
    public Optional<Output<String>> dataprocCluster() {
        return Optional.ofNullable(this.dataprocCluster);
    }

    private ConnectionSparkSparkHistoryServerConfigArgs() {}

    private ConnectionSparkSparkHistoryServerConfigArgs(ConnectionSparkSparkHistoryServerConfigArgs $) {
        this.dataprocCluster = $.dataprocCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionSparkSparkHistoryServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionSparkSparkHistoryServerConfigArgs $;

        public Builder() {
            $ = new ConnectionSparkSparkHistoryServerConfigArgs();
        }

        public Builder(ConnectionSparkSparkHistoryServerConfigArgs defaults) {
            $ = new ConnectionSparkSparkHistoryServerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataprocCluster Resource name of an existing Dataproc Cluster to act as a Spark History Server for the connection if the form of projects/[projectId]/regions/[region]/clusters/[cluster_name].
         * 
         * @return builder
         * 
         */
        public Builder dataprocCluster(@Nullable Output<String> dataprocCluster) {
            $.dataprocCluster = dataprocCluster;
            return this;
        }

        /**
         * @param dataprocCluster Resource name of an existing Dataproc Cluster to act as a Spark History Server for the connection if the form of projects/[projectId]/regions/[region]/clusters/[cluster_name].
         * 
         * @return builder
         * 
         */
        public Builder dataprocCluster(String dataprocCluster) {
            return dataprocCluster(Output.of(dataprocCluster));
        }

        public ConnectionSparkSparkHistoryServerConfigArgs build() {
            return $;
        }
    }

}
