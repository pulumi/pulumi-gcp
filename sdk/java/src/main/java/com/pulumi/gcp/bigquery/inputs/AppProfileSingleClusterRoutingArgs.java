// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppProfileSingleClusterRoutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppProfileSingleClusterRoutingArgs Empty = new AppProfileSingleClusterRoutingArgs();

    /**
     * If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
     * It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    @Import(name="allowTransactionalWrites")
    private @Nullable Output<Boolean> allowTransactionalWrites;

    /**
     * @return If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
     * It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    public Optional<Output<Boolean>> allowTransactionalWrites() {
        return Optional.ofNullable(this.allowTransactionalWrites);
    }

    /**
     * The cluster to which read/write requests should be routed.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The cluster to which read/write requests should be routed.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    private AppProfileSingleClusterRoutingArgs() {}

    private AppProfileSingleClusterRoutingArgs(AppProfileSingleClusterRoutingArgs $) {
        this.allowTransactionalWrites = $.allowTransactionalWrites;
        this.clusterId = $.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppProfileSingleClusterRoutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppProfileSingleClusterRoutingArgs $;

        public Builder() {
            $ = new AppProfileSingleClusterRoutingArgs();
        }

        public Builder(AppProfileSingleClusterRoutingArgs defaults) {
            $ = new AppProfileSingleClusterRoutingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowTransactionalWrites If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
         * It is unsafe to send these requests to the same table/row/column in multiple clusters.
         * 
         * @return builder
         * 
         */
        public Builder allowTransactionalWrites(@Nullable Output<Boolean> allowTransactionalWrites) {
            $.allowTransactionalWrites = allowTransactionalWrites;
            return this;
        }

        /**
         * @param allowTransactionalWrites If true, CheckAndMutateRow and ReadModifyWriteRow requests are allowed by this app profile.
         * It is unsafe to send these requests to the same table/row/column in multiple clusters.
         * 
         * @return builder
         * 
         */
        public Builder allowTransactionalWrites(Boolean allowTransactionalWrites) {
            return allowTransactionalWrites(Output.of(allowTransactionalWrites));
        }

        /**
         * @param clusterId The cluster to which read/write requests should be routed.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The cluster to which read/write requests should be routed.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public AppProfileSingleClusterRoutingArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}