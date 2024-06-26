// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigIncludeObjectsArgs;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigOracleSourceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigOracleSourceConfigArgs Empty = new StreamSourceConfigOracleSourceConfigArgs();

    /**
     * Configuration to drop large object values.
     * 
     */
    @Import(name="dropLargeObjects")
    private @Nullable Output<StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs> dropLargeObjects;

    /**
     * @return Configuration to drop large object values.
     * 
     */
    public Optional<Output<StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs>> dropLargeObjects() {
        return Optional.ofNullable(this.dropLargeObjects);
    }

    /**
     * Oracle objects to exclude from the stream.
     * Structure is documented below.
     * 
     */
    @Import(name="excludeObjects")
    private @Nullable Output<StreamSourceConfigOracleSourceConfigExcludeObjectsArgs> excludeObjects;

    /**
     * @return Oracle objects to exclude from the stream.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StreamSourceConfigOracleSourceConfigExcludeObjectsArgs>> excludeObjects() {
        return Optional.ofNullable(this.excludeObjects);
    }

    /**
     * Oracle objects to retrieve from the source.
     * Structure is documented below.
     * 
     */
    @Import(name="includeObjects")
    private @Nullable Output<StreamSourceConfigOracleSourceConfigIncludeObjectsArgs> includeObjects;

    /**
     * @return Oracle objects to retrieve from the source.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StreamSourceConfigOracleSourceConfigIncludeObjectsArgs>> includeObjects() {
        return Optional.ofNullable(this.includeObjects);
    }

    /**
     * Maximum number of concurrent backfill tasks. The number should be non negative.
     * If not set (or set to 0), the system&#39;s default value will be used.
     * 
     */
    @Import(name="maxConcurrentBackfillTasks")
    private @Nullable Output<Integer> maxConcurrentBackfillTasks;

    /**
     * @return Maximum number of concurrent backfill tasks. The number should be non negative.
     * If not set (or set to 0), the system&#39;s default value will be used.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentBackfillTasks() {
        return Optional.ofNullable(this.maxConcurrentBackfillTasks);
    }

    /**
     * Maximum number of concurrent CDC tasks. The number should be non negative.
     * If not set (or set to 0), the system&#39;s default value will be used.
     * 
     */
    @Import(name="maxConcurrentCdcTasks")
    private @Nullable Output<Integer> maxConcurrentCdcTasks;

    /**
     * @return Maximum number of concurrent CDC tasks. The number should be non negative.
     * If not set (or set to 0), the system&#39;s default value will be used.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentCdcTasks() {
        return Optional.ofNullable(this.maxConcurrentCdcTasks);
    }

    /**
     * Configuration to drop large object values.
     * 
     */
    @Import(name="streamLargeObjects")
    private @Nullable Output<StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs> streamLargeObjects;

    /**
     * @return Configuration to drop large object values.
     * 
     */
    public Optional<Output<StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs>> streamLargeObjects() {
        return Optional.ofNullable(this.streamLargeObjects);
    }

    private StreamSourceConfigOracleSourceConfigArgs() {}

    private StreamSourceConfigOracleSourceConfigArgs(StreamSourceConfigOracleSourceConfigArgs $) {
        this.dropLargeObjects = $.dropLargeObjects;
        this.excludeObjects = $.excludeObjects;
        this.includeObjects = $.includeObjects;
        this.maxConcurrentBackfillTasks = $.maxConcurrentBackfillTasks;
        this.maxConcurrentCdcTasks = $.maxConcurrentCdcTasks;
        this.streamLargeObjects = $.streamLargeObjects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigOracleSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigOracleSourceConfigArgs $;

        public Builder() {
            $ = new StreamSourceConfigOracleSourceConfigArgs();
        }

        public Builder(StreamSourceConfigOracleSourceConfigArgs defaults) {
            $ = new StreamSourceConfigOracleSourceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dropLargeObjects Configuration to drop large object values.
         * 
         * @return builder
         * 
         */
        public Builder dropLargeObjects(@Nullable Output<StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs> dropLargeObjects) {
            $.dropLargeObjects = dropLargeObjects;
            return this;
        }

        /**
         * @param dropLargeObjects Configuration to drop large object values.
         * 
         * @return builder
         * 
         */
        public Builder dropLargeObjects(StreamSourceConfigOracleSourceConfigDropLargeObjectsArgs dropLargeObjects) {
            return dropLargeObjects(Output.of(dropLargeObjects));
        }

        /**
         * @param excludeObjects Oracle objects to exclude from the stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludeObjects(@Nullable Output<StreamSourceConfigOracleSourceConfigExcludeObjectsArgs> excludeObjects) {
            $.excludeObjects = excludeObjects;
            return this;
        }

        /**
         * @param excludeObjects Oracle objects to exclude from the stream.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludeObjects(StreamSourceConfigOracleSourceConfigExcludeObjectsArgs excludeObjects) {
            return excludeObjects(Output.of(excludeObjects));
        }

        /**
         * @param includeObjects Oracle objects to retrieve from the source.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includeObjects(@Nullable Output<StreamSourceConfigOracleSourceConfigIncludeObjectsArgs> includeObjects) {
            $.includeObjects = includeObjects;
            return this;
        }

        /**
         * @param includeObjects Oracle objects to retrieve from the source.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includeObjects(StreamSourceConfigOracleSourceConfigIncludeObjectsArgs includeObjects) {
            return includeObjects(Output.of(includeObjects));
        }

        /**
         * @param maxConcurrentBackfillTasks Maximum number of concurrent backfill tasks. The number should be non negative.
         * If not set (or set to 0), the system&#39;s default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentBackfillTasks(@Nullable Output<Integer> maxConcurrentBackfillTasks) {
            $.maxConcurrentBackfillTasks = maxConcurrentBackfillTasks;
            return this;
        }

        /**
         * @param maxConcurrentBackfillTasks Maximum number of concurrent backfill tasks. The number should be non negative.
         * If not set (or set to 0), the system&#39;s default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentBackfillTasks(Integer maxConcurrentBackfillTasks) {
            return maxConcurrentBackfillTasks(Output.of(maxConcurrentBackfillTasks));
        }

        /**
         * @param maxConcurrentCdcTasks Maximum number of concurrent CDC tasks. The number should be non negative.
         * If not set (or set to 0), the system&#39;s default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentCdcTasks(@Nullable Output<Integer> maxConcurrentCdcTasks) {
            $.maxConcurrentCdcTasks = maxConcurrentCdcTasks;
            return this;
        }

        /**
         * @param maxConcurrentCdcTasks Maximum number of concurrent CDC tasks. The number should be non negative.
         * If not set (or set to 0), the system&#39;s default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentCdcTasks(Integer maxConcurrentCdcTasks) {
            return maxConcurrentCdcTasks(Output.of(maxConcurrentCdcTasks));
        }

        /**
         * @param streamLargeObjects Configuration to drop large object values.
         * 
         * @return builder
         * 
         */
        public Builder streamLargeObjects(@Nullable Output<StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs> streamLargeObjects) {
            $.streamLargeObjects = streamLargeObjects;
            return this;
        }

        /**
         * @param streamLargeObjects Configuration to drop large object values.
         * 
         * @return builder
         * 
         */
        public Builder streamLargeObjects(StreamSourceConfigOracleSourceConfigStreamLargeObjectsArgs streamLargeObjects) {
            return streamLargeObjects(Output.of(streamLargeObjects));
        }

        public StreamSourceConfigOracleSourceConfigArgs build() {
            return $;
        }
    }

}
