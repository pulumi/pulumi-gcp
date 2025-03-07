// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StreamBackfillAllSqlServerExcludedObjectsSchemaTable {
    /**
     * @return SQL Server columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    private @Nullable List<StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn> columns;
    /**
     * @return Table name.
     * 
     */
    private String table;

    private StreamBackfillAllSqlServerExcludedObjectsSchemaTable() {}
    /**
     * @return SQL Server columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn> columns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * @return Table name.
     * 
     */
    public String table() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllSqlServerExcludedObjectsSchemaTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn> columns;
        private String table;
        public Builder() {}
        public Builder(StreamBackfillAllSqlServerExcludedObjectsSchemaTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder columns(@Nullable List<StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn> columns) {

            this.columns = columns;
            return this;
        }
        public Builder columns(StreamBackfillAllSqlServerExcludedObjectsSchemaTableColumn... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder table(String table) {
            if (table == null) {
              throw new MissingRequiredPropertyException("StreamBackfillAllSqlServerExcludedObjectsSchemaTable", "table");
            }
            this.table = table;
            return this;
        }
        public StreamBackfillAllSqlServerExcludedObjectsSchemaTable build() {
            final var _resultValue = new StreamBackfillAllSqlServerExcludedObjectsSchemaTable();
            _resultValue.columns = columns;
            _resultValue.table = table;
            return _resultValue;
        }
    }
}
