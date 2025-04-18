// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListingRestrictedExportConfig {
    /**
     * @return If true, enable restricted export.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return (Output)
     * If true, restrict direct table access(read api/tabledata.list) on linked table.
     * 
     */
    private @Nullable Boolean restrictDirectTableAccess;
    /**
     * @return If true, restrict export of query result derived from restricted linked dataset table.
     * 
     */
    private @Nullable Boolean restrictQueryResult;

    private ListingRestrictedExportConfig() {}
    /**
     * @return If true, enable restricted export.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return (Output)
     * If true, restrict direct table access(read api/tabledata.list) on linked table.
     * 
     */
    public Optional<Boolean> restrictDirectTableAccess() {
        return Optional.ofNullable(this.restrictDirectTableAccess);
    }
    /**
     * @return If true, restrict export of query result derived from restricted linked dataset table.
     * 
     */
    public Optional<Boolean> restrictQueryResult() {
        return Optional.ofNullable(this.restrictQueryResult);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListingRestrictedExportConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean restrictDirectTableAccess;
        private @Nullable Boolean restrictQueryResult;
        public Builder() {}
        public Builder(ListingRestrictedExportConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.restrictDirectTableAccess = defaults.restrictDirectTableAccess;
    	      this.restrictQueryResult = defaults.restrictQueryResult;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder restrictDirectTableAccess(@Nullable Boolean restrictDirectTableAccess) {

            this.restrictDirectTableAccess = restrictDirectTableAccess;
            return this;
        }
        @CustomType.Setter
        public Builder restrictQueryResult(@Nullable Boolean restrictQueryResult) {

            this.restrictQueryResult = restrictQueryResult;
            return this;
        }
        public ListingRestrictedExportConfig build() {
            final var _resultValue = new ListingRestrictedExportConfig();
            _resultValue.enabled = enabled;
            _resultValue.restrictDirectTableAccess = restrictDirectTableAccess;
            _resultValue.restrictQueryResult = restrictQueryResult;
            return _resultValue;
        }
    }
}
