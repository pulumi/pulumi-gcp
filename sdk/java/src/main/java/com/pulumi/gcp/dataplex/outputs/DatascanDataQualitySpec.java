// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecPostScanActions;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecRule;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualitySpec {
    /**
     * @return If set, the latest DataScan job result will be published to Dataplex Catalog.
     * 
     */
    private @Nullable Boolean catalogPublishingEnabled;
    /**
     * @return Actions to take upon job completion.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecPostScanActions postScanActions;
    /**
     * @return A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
     * 
     */
    private @Nullable String rowFilter;
    /**
     * @return The list of rules to evaluate against a data source. At least one rule is required.
     * Structure is documented below.
     * 
     */
    private @Nullable List<DatascanDataQualitySpecRule> rules;
    /**
     * @return The percentage of the records to be selected from the dataset for DataScan.
     * Value can range between 0.0 and 100.0 with up to 3 significant decimal digits.
     * Sampling is not applied if `sampling_percent` is not specified, 0 or 100.
     * 
     */
    private @Nullable Double samplingPercent;

    private DatascanDataQualitySpec() {}
    /**
     * @return If set, the latest DataScan job result will be published to Dataplex Catalog.
     * 
     */
    public Optional<Boolean> catalogPublishingEnabled() {
        return Optional.ofNullable(this.catalogPublishingEnabled);
    }
    /**
     * @return Actions to take upon job completion.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecPostScanActions> postScanActions() {
        return Optional.ofNullable(this.postScanActions);
    }
    /**
     * @return A filter applied to all rows in a single DataScan job. The filter needs to be a valid SQL expression for a WHERE clause in BigQuery standard SQL syntax. Example: col1 &gt;= 0 AND col2 &lt; 10
     * 
     */
    public Optional<String> rowFilter() {
        return Optional.ofNullable(this.rowFilter);
    }
    /**
     * @return The list of rules to evaluate against a data source. At least one rule is required.
     * Structure is documented below.
     * 
     */
    public List<DatascanDataQualitySpecRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return The percentage of the records to be selected from the dataset for DataScan.
     * Value can range between 0.0 and 100.0 with up to 3 significant decimal digits.
     * Sampling is not applied if `sampling_percent` is not specified, 0 or 100.
     * 
     */
    public Optional<Double> samplingPercent() {
        return Optional.ofNullable(this.samplingPercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualitySpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean catalogPublishingEnabled;
        private @Nullable DatascanDataQualitySpecPostScanActions postScanActions;
        private @Nullable String rowFilter;
        private @Nullable List<DatascanDataQualitySpecRule> rules;
        private @Nullable Double samplingPercent;
        public Builder() {}
        public Builder(DatascanDataQualitySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogPublishingEnabled = defaults.catalogPublishingEnabled;
    	      this.postScanActions = defaults.postScanActions;
    	      this.rowFilter = defaults.rowFilter;
    	      this.rules = defaults.rules;
    	      this.samplingPercent = defaults.samplingPercent;
        }

        @CustomType.Setter
        public Builder catalogPublishingEnabled(@Nullable Boolean catalogPublishingEnabled) {

            this.catalogPublishingEnabled = catalogPublishingEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder postScanActions(@Nullable DatascanDataQualitySpecPostScanActions postScanActions) {

            this.postScanActions = postScanActions;
            return this;
        }
        @CustomType.Setter
        public Builder rowFilter(@Nullable String rowFilter) {

            this.rowFilter = rowFilter;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<DatascanDataQualitySpecRule> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(DatascanDataQualitySpecRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder samplingPercent(@Nullable Double samplingPercent) {

            this.samplingPercent = samplingPercent;
            return this;
        }
        public DatascanDataQualitySpec build() {
            final var _resultValue = new DatascanDataQualitySpec();
            _resultValue.catalogPublishingEnabled = catalogPublishingEnabled;
            _resultValue.postScanActions = postScanActions;
            _resultValue.rowFilter = rowFilter;
            _resultValue.rules = rules;
            _resultValue.samplingPercent = samplingPercent;
            return _resultValue;
        }
    }
}
