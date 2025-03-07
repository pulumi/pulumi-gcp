// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.outputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema {
    /**
     * @return Schema name.
     * 
     */
    private String schema;
    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    private @Nullable List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable> tables;

    private StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema() {}
    /**
     * @return Schema name.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    public List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable> tables() {
        return this.tables == null ? List.of() : this.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String schema;
        private @Nullable List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable> tables;
        public Builder() {}
        public Builder(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schema = defaults.schema;
    	      this.tables = defaults.tables;
        }

        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema", "schema");
            }
            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder tables(@Nullable List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable> tables) {

            this.tables = tables;
            return this;
        }
        public Builder tables(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTable... tables) {
            return tables(List.of(tables));
        }
        public StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema build() {
            final var _resultValue = new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchema();
            _resultValue.schema = schema;
            _resultValue.tables = tables;
            return _resultValue;
        }
    }
}
