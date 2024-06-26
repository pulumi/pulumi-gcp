// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.outputs.StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable {
    /**
     * @return SQL Server columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    private @Nullable List<StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn> columns;
    /**
     * @return Table name.
     * 
     */
    private String table;

    private StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable() {}
    /**
     * @return SQL Server columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    public List<StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn> columns() {
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

    public static Builder builder(StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn> columns;
        private String table;
        public Builder() {}
        public Builder(StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder columns(@Nullable List<StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn> columns) {

            this.columns = columns;
            return this;
        }
        public Builder columns(StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTableColumn... columns) {
            return columns(List.of(columns));
        }
        @CustomType.Setter
        public Builder table(String table) {
            if (table == null) {
              throw new MissingRequiredPropertyException("StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable", "table");
            }
            this.table = table;
            return this;
        }
        public StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable build() {
            final var _resultValue = new StreamSourceConfigSqlServerSourceConfigIncludeObjectsSchemaTable();
            _resultValue.columns = columns;
            _resultValue.table = table;
            return _resultValue;
        }
    }
}
