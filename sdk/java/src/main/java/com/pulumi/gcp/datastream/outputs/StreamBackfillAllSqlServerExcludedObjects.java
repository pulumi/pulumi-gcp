// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllSqlServerExcludedObjectsSchema;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StreamBackfillAllSqlServerExcludedObjects {
    /**
     * @return SQL Server schemas/databases in the database server
     * Structure is documented below.
     * 
     */
    private List<StreamBackfillAllSqlServerExcludedObjectsSchema> schemas;

    private StreamBackfillAllSqlServerExcludedObjects() {}
    /**
     * @return SQL Server schemas/databases in the database server
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllSqlServerExcludedObjectsSchema> schemas() {
        return this.schemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllSqlServerExcludedObjects defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<StreamBackfillAllSqlServerExcludedObjectsSchema> schemas;
        public Builder() {}
        public Builder(StreamBackfillAllSqlServerExcludedObjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemas = defaults.schemas;
        }

        @CustomType.Setter
        public Builder schemas(List<StreamBackfillAllSqlServerExcludedObjectsSchema> schemas) {
            if (schemas == null) {
              throw new MissingRequiredPropertyException("StreamBackfillAllSqlServerExcludedObjects", "schemas");
            }
            this.schemas = schemas;
            return this;
        }
        public Builder schemas(StreamBackfillAllSqlServerExcludedObjectsSchema... schemas) {
            return schemas(List.of(schemas));
        }
        public StreamBackfillAllSqlServerExcludedObjects build() {
            final var _resultValue = new StreamBackfillAllSqlServerExcludedObjects();
            _resultValue.schemas = schemas;
            return _resultValue;
        }
    }
}
