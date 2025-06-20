// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTableTimePartitioning {
    /**
     * @return Number of milliseconds for which to keep the storage for a partition.
     * 
     */
    private Integer expirationMs;
    /**
     * @return The field used to determine how to create a time-based partition. If time-based partitioning is enabled without this value, the table is partitioned based on the load time.
     * 
     */
    private String field;
    /**
     * @return If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    private Boolean requirePartitionFilter;
    /**
     * @return The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    private String type;

    private GetTableTimePartitioning() {}
    /**
     * @return Number of milliseconds for which to keep the storage for a partition.
     * 
     */
    public Integer expirationMs() {
        return this.expirationMs;
    }
    /**
     * @return The field used to determine how to create a time-based partition. If time-based partitioning is enabled without this value, the table is partitioned based on the load time.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    public Boolean requirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * @return The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTimePartitioning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer expirationMs;
        private String field;
        private Boolean requirePartitionFilter;
        private String type;
        public Builder() {}
        public Builder(GetTableTimePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expirationMs(Integer expirationMs) {
            if (expirationMs == null) {
              throw new MissingRequiredPropertyException("GetTableTimePartitioning", "expirationMs");
            }
            this.expirationMs = expirationMs;
            return this;
        }
        @CustomType.Setter
        public Builder field(String field) {
            if (field == null) {
              throw new MissingRequiredPropertyException("GetTableTimePartitioning", "field");
            }
            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            if (requirePartitionFilter == null) {
              throw new MissingRequiredPropertyException("GetTableTimePartitioning", "requirePartitionFilter");
            }
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetTableTimePartitioning", "type");
            }
            this.type = type;
            return this;
        }
        public GetTableTimePartitioning build() {
            final var _resultValue = new GetTableTimePartitioning();
            _resultValue.expirationMs = expirationMs;
            _resultValue.field = field;
            _resultValue.requirePartitionFilter = requirePartitionFilter;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
