// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterConfigDataprocMetricConfigMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigDataprocMetricConfigMetricArgs Empty = new ClusterClusterConfigDataprocMetricConfigMetricArgs();

    /**
     * One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
     * 
     */
    @Import(name="metricOverrides")
    private @Nullable Output<List<String>> metricOverrides;

    /**
     * @return One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
     * 
     */
    public Optional<Output<List<String>>> metricOverrides() {
        return Optional.ofNullable(this.metricOverrides);
    }

    /**
     * A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
     * 
     */
    @Import(name="metricSource", required=true)
    private Output<String> metricSource;

    /**
     * @return A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
     * 
     */
    public Output<String> metricSource() {
        return this.metricSource;
    }

    private ClusterClusterConfigDataprocMetricConfigMetricArgs() {}

    private ClusterClusterConfigDataprocMetricConfigMetricArgs(ClusterClusterConfigDataprocMetricConfigMetricArgs $) {
        this.metricOverrides = $.metricOverrides;
        this.metricSource = $.metricSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigDataprocMetricConfigMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigDataprocMetricConfigMetricArgs $;

        public Builder() {
            $ = new ClusterClusterConfigDataprocMetricConfigMetricArgs();
        }

        public Builder(ClusterClusterConfigDataprocMetricConfigMetricArgs defaults) {
            $ = new ClusterClusterConfigDataprocMetricConfigMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricOverrides One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(@Nullable Output<List<String>> metricOverrides) {
            $.metricOverrides = metricOverrides;
            return this;
        }

        /**
         * @param metricOverrides One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(List<String> metricOverrides) {
            return metricOverrides(Output.of(metricOverrides));
        }

        /**
         * @param metricOverrides One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
         * 
         * @return builder
         * 
         */
        public Builder metricOverrides(String... metricOverrides) {
            return metricOverrides(List.of(metricOverrides));
        }

        /**
         * @param metricSource A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
         * 
         * @return builder
         * 
         */
        public Builder metricSource(Output<String> metricSource) {
            $.metricSource = metricSource;
            return this;
        }

        /**
         * @param metricSource A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
         * 
         * @return builder
         * 
         */
        public Builder metricSource(String metricSource) {
            return metricSource(Output.of(metricSource));
        }

        public ClusterClusterConfigDataprocMetricConfigMetricArgs build() {
            $.metricSource = Objects.requireNonNull($.metricSource, "expected parameter 'metricSource' to be non-null");
            return $;
        }
    }

}