// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecPostScanActionsBigqueryExport;
import com.pulumi.gcp.dataplex.outputs.DatascanDataQualitySpecPostScanActionsNotificationReport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualitySpecPostScanActions {
    /**
     * @return If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecPostScanActionsBigqueryExport bigqueryExport;
    /**
     * @return The configuration of notification report post scan action.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataQualitySpecPostScanActionsNotificationReport notificationReport;

    private DatascanDataQualitySpecPostScanActions() {}
    /**
     * @return If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecPostScanActionsBigqueryExport> bigqueryExport() {
        return Optional.ofNullable(this.bigqueryExport);
    }
    /**
     * @return The configuration of notification report post scan action.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataQualitySpecPostScanActionsNotificationReport> notificationReport() {
        return Optional.ofNullable(this.notificationReport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualitySpecPostScanActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DatascanDataQualitySpecPostScanActionsBigqueryExport bigqueryExport;
        private @Nullable DatascanDataQualitySpecPostScanActionsNotificationReport notificationReport;
        public Builder() {}
        public Builder(DatascanDataQualitySpecPostScanActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryExport = defaults.bigqueryExport;
    	      this.notificationReport = defaults.notificationReport;
        }

        @CustomType.Setter
        public Builder bigqueryExport(@Nullable DatascanDataQualitySpecPostScanActionsBigqueryExport bigqueryExport) {

            this.bigqueryExport = bigqueryExport;
            return this;
        }
        @CustomType.Setter
        public Builder notificationReport(@Nullable DatascanDataQualitySpecPostScanActionsNotificationReport notificationReport) {

            this.notificationReport = notificationReport;
            return this;
        }
        public DatascanDataQualitySpecPostScanActions build() {
            final var _resultValue = new DatascanDataQualitySpecPostScanActions();
            _resultValue.bigqueryExport = bigqueryExport;
            _resultValue.notificationReport = notificationReport;
            return _resultValue;
        }
    }
}
