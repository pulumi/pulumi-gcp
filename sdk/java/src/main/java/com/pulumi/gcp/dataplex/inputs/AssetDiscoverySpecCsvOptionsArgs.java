// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssetDiscoverySpecCsvOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssetDiscoverySpecCsvOptionsArgs Empty = new AssetDiscoverySpecCsvOptionsArgs();

    /**
     * Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    @Import(name="disableTypeInference")
    private @Nullable Output<Boolean> disableTypeInference;

    /**
     * @return Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    public Optional<Output<Boolean>> disableTypeInference() {
        return Optional.ofNullable(this.disableTypeInference);
    }

    /**
     * Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
     * 
     */
    @Import(name="headerRows")
    private @Nullable Output<Integer> headerRows;

    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
     * 
     */
    public Optional<Output<Integer>> headerRows() {
        return Optional.ofNullable(this.headerRows);
    }

    private AssetDiscoverySpecCsvOptionsArgs() {}

    private AssetDiscoverySpecCsvOptionsArgs(AssetDiscoverySpecCsvOptionsArgs $) {
        this.delimiter = $.delimiter;
        this.disableTypeInference = $.disableTypeInference;
        this.encoding = $.encoding;
        this.headerRows = $.headerRows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssetDiscoverySpecCsvOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssetDiscoverySpecCsvOptionsArgs $;

        public Builder() {
            $ = new AssetDiscoverySpecCsvOptionsArgs();
        }

        public Builder(AssetDiscoverySpecCsvOptionsArgs defaults) {
            $ = new AssetDiscoverySpecCsvOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delimiter Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter Optional. The delimiter being used to separate values. This defaults to &#39;,&#39;.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param disableTypeInference Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableTypeInference(@Nullable Output<Boolean> disableTypeInference) {
            $.disableTypeInference = disableTypeInference;
            return this;
        }

        /**
         * @param disableTypeInference Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableTypeInference(Boolean disableTypeInference) {
            return disableTypeInference(Output.of(disableTypeInference));
        }

        /**
         * @param encoding Optional. The character encoding of the data. The default is UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Optional. The character encoding of the data. The default is UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param headerRows Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
         * 
         * @return builder
         * 
         */
        public Builder headerRows(@Nullable Output<Integer> headerRows) {
            $.headerRows = headerRows;
            return this;
        }

        /**
         * @param headerRows Optional. The number of rows to interpret as header rows that should be skipped when reading data rows.
         * 
         * @return builder
         * 
         */
        public Builder headerRows(Integer headerRows) {
            return headerRows(Output.of(headerRows));
        }

        public AssetDiscoverySpecCsvOptionsArgs build() {
            return $;
        }
    }

}