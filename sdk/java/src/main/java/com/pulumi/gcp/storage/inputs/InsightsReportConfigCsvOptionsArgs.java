// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightsReportConfigCsvOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightsReportConfigCsvOptionsArgs Empty = new InsightsReportConfigCsvOptionsArgs();

    /**
     * The delimiter used to separate the fields in the inventory report CSV file.
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return The delimiter used to separate the fields in the inventory report CSV file.
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * The boolean that indicates whether or not headers are included in the inventory report CSV file.
     * 
     * ***
     * 
     */
    @Import(name="headerRequired")
    private @Nullable Output<Boolean> headerRequired;

    /**
     * @return The boolean that indicates whether or not headers are included in the inventory report CSV file.
     * 
     * ***
     * 
     */
    public Optional<Output<Boolean>> headerRequired() {
        return Optional.ofNullable(this.headerRequired);
    }

    /**
     * The character used to separate the records in the inventory report CSV file.
     * 
     */
    @Import(name="recordSeparator")
    private @Nullable Output<String> recordSeparator;

    /**
     * @return The character used to separate the records in the inventory report CSV file.
     * 
     */
    public Optional<Output<String>> recordSeparator() {
        return Optional.ofNullable(this.recordSeparator);
    }

    private InsightsReportConfigCsvOptionsArgs() {}

    private InsightsReportConfigCsvOptionsArgs(InsightsReportConfigCsvOptionsArgs $) {
        this.delimiter = $.delimiter;
        this.headerRequired = $.headerRequired;
        this.recordSeparator = $.recordSeparator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightsReportConfigCsvOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightsReportConfigCsvOptionsArgs $;

        public Builder() {
            $ = new InsightsReportConfigCsvOptionsArgs();
        }

        public Builder(InsightsReportConfigCsvOptionsArgs defaults) {
            $ = new InsightsReportConfigCsvOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delimiter The delimiter used to separate the fields in the inventory report CSV file.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter The delimiter used to separate the fields in the inventory report CSV file.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param headerRequired The boolean that indicates whether or not headers are included in the inventory report CSV file.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder headerRequired(@Nullable Output<Boolean> headerRequired) {
            $.headerRequired = headerRequired;
            return this;
        }

        /**
         * @param headerRequired The boolean that indicates whether or not headers are included in the inventory report CSV file.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder headerRequired(Boolean headerRequired) {
            return headerRequired(Output.of(headerRequired));
        }

        /**
         * @param recordSeparator The character used to separate the records in the inventory report CSV file.
         * 
         * @return builder
         * 
         */
        public Builder recordSeparator(@Nullable Output<String> recordSeparator) {
            $.recordSeparator = recordSeparator;
            return this;
        }

        /**
         * @param recordSeparator The character used to separate the records in the inventory report CSV file.
         * 
         * @return builder
         * 
         */
        public Builder recordSeparator(String recordSeparator) {
            return recordSeparator(Output.of(recordSeparator));
        }

        public InsightsReportConfigCsvOptionsArgs build() {
            return $;
        }
    }

}