// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataProfileSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataProfileSpecArgs Empty = new DatascanDataProfileSpecArgs();

    /**
     * A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
     * 
     */
    @Import(name="rowFilter")
    private @Nullable Output<String> rowFilter;

    /**
     * @return A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
     * 
     */
    public Optional<Output<String>> rowFilter() {
        return Optional.ofNullable(this.rowFilter);
    }

    /**
     * The percentage of the records to be selected from the dataset for DataScan.
     * 
     */
    @Import(name="samplingPercent")
    private @Nullable Output<Double> samplingPercent;

    /**
     * @return The percentage of the records to be selected from the dataset for DataScan.
     * 
     */
    public Optional<Output<Double>> samplingPercent() {
        return Optional.ofNullable(this.samplingPercent);
    }

    private DatascanDataProfileSpecArgs() {}

    private DatascanDataProfileSpecArgs(DatascanDataProfileSpecArgs $) {
        this.rowFilter = $.rowFilter;
        this.samplingPercent = $.samplingPercent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataProfileSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataProfileSpecArgs $;

        public Builder() {
            $ = new DatascanDataProfileSpecArgs();
        }

        public Builder(DatascanDataProfileSpecArgs defaults) {
            $ = new DatascanDataProfileSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rowFilter A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
         * 
         * @return builder
         * 
         */
        public Builder rowFilter(@Nullable Output<String> rowFilter) {
            $.rowFilter = rowFilter;
            return this;
        }

        /**
         * @param rowFilter A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
         * 
         * @return builder
         * 
         */
        public Builder rowFilter(String rowFilter) {
            return rowFilter(Output.of(rowFilter));
        }

        /**
         * @param samplingPercent The percentage of the records to be selected from the dataset for DataScan.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercent(@Nullable Output<Double> samplingPercent) {
            $.samplingPercent = samplingPercent;
            return this;
        }

        /**
         * @param samplingPercent The percentage of the records to be selected from the dataset for DataScan.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercent(Double samplingPercent) {
            return samplingPercent(Output.of(samplingPercent));
        }

        public DatascanDataProfileSpecArgs build() {
            return $;
        }
    }

}