// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataQualityResultScannedDataIncrementalFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataQualityResultScannedDataIncrementalFieldArgs Empty = new DatascanDataQualityResultScannedDataIncrementalFieldArgs();

    /**
     * Value that marks the end of the range.
     * 
     */
    @Import(name="end")
    private @Nullable Output<String> end;

    /**
     * @return Value that marks the end of the range.
     * 
     */
    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * The unnested field (of type Date or Timestamp) that contains values which monotonically increase over time. If not specified, a data scan will run for all data in the table.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return The unnested field (of type Date or Timestamp) that contains values which monotonically increase over time. If not specified, a data scan will run for all data in the table.
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * Value that marks the start of the range.
     * 
     */
    @Import(name="start")
    private @Nullable Output<String> start;

    /**
     * @return Value that marks the start of the range.
     * 
     */
    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private DatascanDataQualityResultScannedDataIncrementalFieldArgs() {}

    private DatascanDataQualityResultScannedDataIncrementalFieldArgs(DatascanDataQualityResultScannedDataIncrementalFieldArgs $) {
        this.end = $.end;
        this.field = $.field;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataQualityResultScannedDataIncrementalFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataQualityResultScannedDataIncrementalFieldArgs $;

        public Builder() {
            $ = new DatascanDataQualityResultScannedDataIncrementalFieldArgs();
        }

        public Builder(DatascanDataQualityResultScannedDataIncrementalFieldArgs defaults) {
            $ = new DatascanDataQualityResultScannedDataIncrementalFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Value that marks the end of the range.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Value that marks the end of the range.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            return end(Output.of(end));
        }

        /**
         * @param field The unnested field (of type Date or Timestamp) that contains values which monotonically increase over time. If not specified, a data scan will run for all data in the table.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field The unnested field (of type Date or Timestamp) that contains values which monotonically increase over time. If not specified, a data scan will run for all data in the table.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param start Value that marks the start of the range.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Value that marks the start of the range.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            return start(Output.of(start));
        }

        public DatascanDataQualityResultScannedDataIncrementalFieldArgs build() {
            return $;
        }
    }

}