// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.BatchEnvironmentConfigArgs;
import com.pulumi.gcp.dataproc.inputs.BatchPysparkBatchArgs;
import com.pulumi.gcp.dataproc.inputs.BatchRuntimeConfigArgs;
import com.pulumi.gcp.dataproc.inputs.BatchSparkBatchArgs;
import com.pulumi.gcp.dataproc.inputs.BatchSparkRBatchArgs;
import com.pulumi.gcp.dataproc.inputs.BatchSparkSqlBatchArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchArgs Empty = new BatchArgs();

    /**
     * The ID to use for the batch, which will become the final component of the batch&#39;s resource name.
     * This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
     * 
     */
    @Import(name="batchId")
    private @Nullable Output<String> batchId;

    /**
     * @return The ID to use for the batch, which will become the final component of the batch&#39;s resource name.
     * This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
     * 
     */
    public Optional<Output<String>> batchId() {
        return Optional.ofNullable(this.batchId);
    }

    /**
     * Environment configuration for the batch execution.
     * Structure is documented below.
     * 
     */
    @Import(name="environmentConfig")
    private @Nullable Output<BatchEnvironmentConfigArgs> environmentConfig;

    /**
     * @return Environment configuration for the batch execution.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchEnvironmentConfigArgs>> environmentConfig() {
        return Optional.ofNullable(this.environmentConfig);
    }

    /**
     * The labels to associate with this batch.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels to associate with this batch.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location in which the batch will be created in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location in which the batch will be created in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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
     * PySpark batch config.
     * Structure is documented below.
     * 
     */
    @Import(name="pysparkBatch")
    private @Nullable Output<BatchPysparkBatchArgs> pysparkBatch;

    /**
     * @return PySpark batch config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchPysparkBatchArgs>> pysparkBatch() {
        return Optional.ofNullable(this.pysparkBatch);
    }

    /**
     * Runtime configuration for the batch execution.
     * Structure is documented below.
     * 
     */
    @Import(name="runtimeConfig")
    private @Nullable Output<BatchRuntimeConfigArgs> runtimeConfig;

    /**
     * @return Runtime configuration for the batch execution.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchRuntimeConfigArgs>> runtimeConfig() {
        return Optional.ofNullable(this.runtimeConfig);
    }

    /**
     * Spark batch config.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkBatch")
    private @Nullable Output<BatchSparkBatchArgs> sparkBatch;

    /**
     * @return Spark batch config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchSparkBatchArgs>> sparkBatch() {
        return Optional.ofNullable(this.sparkBatch);
    }

    /**
     * SparkR batch config.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkRBatch")
    private @Nullable Output<BatchSparkRBatchArgs> sparkRBatch;

    /**
     * @return SparkR batch config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchSparkRBatchArgs>> sparkRBatch() {
        return Optional.ofNullable(this.sparkRBatch);
    }

    /**
     * Spark SQL batch config.
     * Structure is documented below.
     * 
     */
    @Import(name="sparkSqlBatch")
    private @Nullable Output<BatchSparkSqlBatchArgs> sparkSqlBatch;

    /**
     * @return Spark SQL batch config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchSparkSqlBatchArgs>> sparkSqlBatch() {
        return Optional.ofNullable(this.sparkSqlBatch);
    }

    private BatchArgs() {}

    private BatchArgs(BatchArgs $) {
        this.batchId = $.batchId;
        this.environmentConfig = $.environmentConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.pysparkBatch = $.pysparkBatch;
        this.runtimeConfig = $.runtimeConfig;
        this.sparkBatch = $.sparkBatch;
        this.sparkRBatch = $.sparkRBatch;
        this.sparkSqlBatch = $.sparkSqlBatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchArgs $;

        public Builder() {
            $ = new BatchArgs();
        }

        public Builder(BatchArgs defaults) {
            $ = new BatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchId The ID to use for the batch, which will become the final component of the batch&#39;s resource name.
         * This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
         * 
         * @return builder
         * 
         */
        public Builder batchId(@Nullable Output<String> batchId) {
            $.batchId = batchId;
            return this;
        }

        /**
         * @param batchId The ID to use for the batch, which will become the final component of the batch&#39;s resource name.
         * This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
         * 
         * @return builder
         * 
         */
        public Builder batchId(String batchId) {
            return batchId(Output.of(batchId));
        }

        /**
         * @param environmentConfig Environment configuration for the batch execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder environmentConfig(@Nullable Output<BatchEnvironmentConfigArgs> environmentConfig) {
            $.environmentConfig = environmentConfig;
            return this;
        }

        /**
         * @param environmentConfig Environment configuration for the batch execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder environmentConfig(BatchEnvironmentConfigArgs environmentConfig) {
            return environmentConfig(Output.of(environmentConfig));
        }

        /**
         * @param labels The labels to associate with this batch.
         * 
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
         * @param labels The labels to associate with this batch.
         * 
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
         * @param location The location in which the batch will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location in which the batch will be created in.
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
         * @param pysparkBatch PySpark batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pysparkBatch(@Nullable Output<BatchPysparkBatchArgs> pysparkBatch) {
            $.pysparkBatch = pysparkBatch;
            return this;
        }

        /**
         * @param pysparkBatch PySpark batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pysparkBatch(BatchPysparkBatchArgs pysparkBatch) {
            return pysparkBatch(Output.of(pysparkBatch));
        }

        /**
         * @param runtimeConfig Runtime configuration for the batch execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfig(@Nullable Output<BatchRuntimeConfigArgs> runtimeConfig) {
            $.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * @param runtimeConfig Runtime configuration for the batch execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfig(BatchRuntimeConfigArgs runtimeConfig) {
            return runtimeConfig(Output.of(runtimeConfig));
        }

        /**
         * @param sparkBatch Spark batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkBatch(@Nullable Output<BatchSparkBatchArgs> sparkBatch) {
            $.sparkBatch = sparkBatch;
            return this;
        }

        /**
         * @param sparkBatch Spark batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkBatch(BatchSparkBatchArgs sparkBatch) {
            return sparkBatch(Output.of(sparkBatch));
        }

        /**
         * @param sparkRBatch SparkR batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkRBatch(@Nullable Output<BatchSparkRBatchArgs> sparkRBatch) {
            $.sparkRBatch = sparkRBatch;
            return this;
        }

        /**
         * @param sparkRBatch SparkR batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkRBatch(BatchSparkRBatchArgs sparkRBatch) {
            return sparkRBatch(Output.of(sparkRBatch));
        }

        /**
         * @param sparkSqlBatch Spark SQL batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlBatch(@Nullable Output<BatchSparkSqlBatchArgs> sparkSqlBatch) {
            $.sparkSqlBatch = sparkSqlBatch;
            return this;
        }

        /**
         * @param sparkSqlBatch Spark SQL batch config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlBatch(BatchSparkSqlBatchArgs sparkSqlBatch) {
            return sparkSqlBatch(Output.of(sparkSqlBatch));
        }

        public BatchArgs build() {
            return $;
        }
    }

}
