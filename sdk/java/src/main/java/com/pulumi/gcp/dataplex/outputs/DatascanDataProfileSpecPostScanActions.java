// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.DatascanDataProfileSpecPostScanActionsBigqueryExport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataProfileSpecPostScanActions {
    /**
     * @return If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * 
     */
    private @Nullable DatascanDataProfileSpecPostScanActionsBigqueryExport bigqueryExport;

    private DatascanDataProfileSpecPostScanActions() {}
    /**
     * @return If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * 
     */
    public Optional<DatascanDataProfileSpecPostScanActionsBigqueryExport> bigqueryExport() {
        return Optional.ofNullable(this.bigqueryExport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataProfileSpecPostScanActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DatascanDataProfileSpecPostScanActionsBigqueryExport bigqueryExport;
        public Builder() {}
        public Builder(DatascanDataProfileSpecPostScanActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryExport = defaults.bigqueryExport;
        }

        @CustomType.Setter
        public Builder bigqueryExport(@Nullable DatascanDataProfileSpecPostScanActionsBigqueryExport bigqueryExport) {
            this.bigqueryExport = bigqueryExport;
            return this;
        }
        public DatascanDataProfileSpecPostScanActions build() {
            final var o = new DatascanDataProfileSpecPostScanActions();
            o.bigqueryExport = bigqueryExport;
            return o;
        }
    }
}