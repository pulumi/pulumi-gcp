// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigChangeTablesArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigSqlServerSourceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigSqlServerSourceConfigArgs Empty = new StreamSourceConfigSqlServerSourceConfigArgs();

    /**
     * CDC reader reads from change tables.
     * 
     */
    @Import(name="changeTables")
    private @Nullable Output<StreamSourceConfigSqlServerSourceConfigChangeTablesArgs> changeTables;

    /**
     * @return CDC reader reads from change tables.
     * 
     */
    public Optional<Output<StreamSourceConfigSqlServerSourceConfigChangeTablesArgs>> changeTables() {
        return Optional.ofNullable(this.changeTables);
    }

    /**
     * SQL Server objects to exclude from the stream.
     * Structure is documented below.
     * 
     */
    @Import(name="excludeObjects")
    private @Nullable Output<StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs> excludeObjects;

    /**
     * @return SQL Server objects to exclude from the stream.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs>> excludeObjects() {
        return Optional.ofNullable(this.excludeObjects);
    }

    /**
     * SQL Server objects to retrieve from the source.
     * Structure is documented below.
     * 
     */
    @Import(name="includeObjects")
    private @Nullable Output<StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs> includeObjects;

    /**
     * @return SQL Server objects to retrieve from the source.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs>> includeObjects() {
        return Optional.ofNullable(this.includeObjects);
    }

    /**
     * Max concurrent backfill tasks.
     * 
     */
    @Import(name="maxConcurrentBackfillTasks")
    private @Nullable Output<Integer> maxConcurrentBackfillTasks;

    /**
     * @return Max concurrent backfill tasks.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentBackfillTasks() {
        return Optional.ofNullable(this.maxConcurrentBackfillTasks);
    }

    /**
     * Max concurrent CDC tasks.
     * 
     */
    @Import(name="maxConcurrentCdcTasks")
    private @Nullable Output<Integer> maxConcurrentCdcTasks;

    /**
     * @return Max concurrent CDC tasks.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentCdcTasks() {
        return Optional.ofNullable(this.maxConcurrentCdcTasks);
    }

    /**
     * CDC reader reads from transaction logs.
     * 
     */
    @Import(name="transactionLogs")
    private @Nullable Output<StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs> transactionLogs;

    /**
     * @return CDC reader reads from transaction logs.
     * 
     */
    public Optional<Output<StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs>> transactionLogs() {
        return Optional.ofNullable(this.transactionLogs);
    }

    private StreamSourceConfigSqlServerSourceConfigArgs() {}

    private StreamSourceConfigSqlServerSourceConfigArgs(StreamSourceConfigSqlServerSourceConfigArgs $) {
        this.changeTables = $.changeTables;
        this.excludeObjects = $.excludeObjects;
        this.includeObjects = $.includeObjects;
        this.maxConcurrentBackfillTasks = $.maxConcurrentBackfillTasks;
        this.maxConcurrentCdcTasks = $.maxConcurrentCdcTasks;
        this.transactionLogs = $.transactionLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigSqlServerSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigSqlServerSourceConfigArgs $;

        public Builder() {
            $ = new StreamSourceConfigSqlServerSourceConfigArgs();
        }

        public Builder(StreamSourceConfigSqlServerSourceConfigArgs defaults) {
            $ = new StreamSourceConfigSqlServerSourceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeTables CDC reader reads from change tables.
         * 
         * @return builder
         * 
         */
        public Builder changeTables(@Nullable Output<StreamSourceConfigSqlServerSourceConfigChangeTablesArgs> changeTables) {
            $.changeTables = changeTables;
            return this;
        }

        /**
         * @param changeTables CDC reader reads from change tables.
         * 
         * @return builder
         * 
         */
        public Builder changeTables(StreamSourceConfigSqlServerSourceConfigChangeTablesArgs changeTables) {
            return changeTables(Output.of(changeTables));
        }

        /**
         * @param excludeObjects SQL Server objects to exclude from the stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludeObjects(@Nullable Output<StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs> excludeObjects) {
            $.excludeObjects = excludeObjects;
            return this;
        }

        /**
         * @param excludeObjects SQL Server objects to exclude from the stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludeObjects(StreamSourceConfigSqlServerSourceConfigExcludeObjectsArgs excludeObjects) {
            return excludeObjects(Output.of(excludeObjects));
        }

        /**
         * @param includeObjects SQL Server objects to retrieve from the source.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includeObjects(@Nullable Output<StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs> includeObjects) {
            $.includeObjects = includeObjects;
            return this;
        }

        /**
         * @param includeObjects SQL Server objects to retrieve from the source.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includeObjects(StreamSourceConfigSqlServerSourceConfigIncludeObjectsArgs includeObjects) {
            return includeObjects(Output.of(includeObjects));
        }

        /**
         * @param maxConcurrentBackfillTasks Max concurrent backfill tasks.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentBackfillTasks(@Nullable Output<Integer> maxConcurrentBackfillTasks) {
            $.maxConcurrentBackfillTasks = maxConcurrentBackfillTasks;
            return this;
        }

        /**
         * @param maxConcurrentBackfillTasks Max concurrent backfill tasks.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentBackfillTasks(Integer maxConcurrentBackfillTasks) {
            return maxConcurrentBackfillTasks(Output.of(maxConcurrentBackfillTasks));
        }

        /**
         * @param maxConcurrentCdcTasks Max concurrent CDC tasks.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentCdcTasks(@Nullable Output<Integer> maxConcurrentCdcTasks) {
            $.maxConcurrentCdcTasks = maxConcurrentCdcTasks;
            return this;
        }

        /**
         * @param maxConcurrentCdcTasks Max concurrent CDC tasks.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentCdcTasks(Integer maxConcurrentCdcTasks) {
            return maxConcurrentCdcTasks(Output.of(maxConcurrentCdcTasks));
        }

        /**
         * @param transactionLogs CDC reader reads from transaction logs.
         * 
         * @return builder
         * 
         */
        public Builder transactionLogs(@Nullable Output<StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs> transactionLogs) {
            $.transactionLogs = transactionLogs;
            return this;
        }

        /**
         * @param transactionLogs CDC reader reads from transaction logs.
         * 
         * @return builder
         * 
         */
        public Builder transactionLogs(StreamSourceConfigSqlServerSourceConfigTransactionLogsArgs transactionLogs) {
            return transactionLogs(Output.of(transactionLogs));
        }

        public StreamSourceConfigSqlServerSourceConfigArgs build() {
            return $;
        }
    }

}
