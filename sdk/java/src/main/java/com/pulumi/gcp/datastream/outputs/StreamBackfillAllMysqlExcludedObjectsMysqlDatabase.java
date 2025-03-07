// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StreamBackfillAllMysqlExcludedObjectsMysqlDatabase {
    /**
     * @return Database name.
     * 
     */
    private String database;
    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    private @Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable> mysqlTables;

    private StreamBackfillAllMysqlExcludedObjectsMysqlDatabase() {}
    /**
     * @return Database name.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable> mysqlTables() {
        return this.mysqlTables == null ? List.of() : this.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private @Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable> mysqlTables;
        public Builder() {}
        public Builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("StreamBackfillAllMysqlExcludedObjectsMysqlDatabase", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder mysqlTables(@Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable> mysqlTables) {

            this.mysqlTables = mysqlTables;
            return this;
        }
        public Builder mysqlTables(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }
        public StreamBackfillAllMysqlExcludedObjectsMysqlDatabase build() {
            final var _resultValue = new StreamBackfillAllMysqlExcludedObjectsMysqlDatabase();
            _resultValue.database = database;
            _resultValue.mysqlTables = mysqlTables;
            return _resultValue;
        }
    }
}
