// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetTableRangePartitioningRange {
    /**
     * @return End of the range partitioning, exclusive.
     * 
     */
    private Integer end;
    /**
     * @return The width of each range within the partition.
     * 
     */
    private Integer interval;
    /**
     * @return Start of the range partitioning, inclusive.
     * 
     */
    private Integer start;

    private GetTableRangePartitioningRange() {}
    /**
     * @return End of the range partitioning, exclusive.
     * 
     */
    public Integer end() {
        return this.end;
    }
    /**
     * @return The width of each range within the partition.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return Start of the range partitioning, inclusive.
     * 
     */
    public Integer start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableRangePartitioningRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer end;
        private Integer interval;
        private Integer start;
        public Builder() {}
        public Builder(GetTableRangePartitioningRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.interval = defaults.interval;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder end(Integer end) {
            if (end == null) {
              throw new MissingRequiredPropertyException("GetTableRangePartitioningRange", "end");
            }
            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder interval(Integer interval) {
            if (interval == null) {
              throw new MissingRequiredPropertyException("GetTableRangePartitioningRange", "interval");
            }
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder start(Integer start) {
            if (start == null) {
              throw new MissingRequiredPropertyException("GetTableRangePartitioningRange", "start");
            }
            this.start = start;
            return this;
        }
        public GetTableRangePartitioningRange build() {
            final var _resultValue = new GetTableRangePartitioningRange();
            _resultValue.end = end;
            _resultValue.interval = interval;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
