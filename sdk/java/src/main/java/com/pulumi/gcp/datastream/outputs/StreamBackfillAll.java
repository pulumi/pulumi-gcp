// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllMysqlExcludedObjects;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllOracleExcludedObjects;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllPostgresqlExcludedObjects;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllSalesforceExcludedObjects;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllSqlServerExcludedObjects;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamBackfillAll {
    /**
     * @return MySQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    private @Nullable StreamBackfillAllMysqlExcludedObjects mysqlExcludedObjects;
    /**
     * @return PostgreSQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    private @Nullable StreamBackfillAllOracleExcludedObjects oracleExcludedObjects;
    /**
     * @return PostgreSQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    private @Nullable StreamBackfillAllPostgresqlExcludedObjects postgresqlExcludedObjects;
    /**
     * @return Salesforce objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    private @Nullable StreamBackfillAllSalesforceExcludedObjects salesforceExcludedObjects;
    /**
     * @return SQL Server data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    private @Nullable StreamBackfillAllSqlServerExcludedObjects sqlServerExcludedObjects;

    private StreamBackfillAll() {}
    /**
     * @return MySQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    public Optional<StreamBackfillAllMysqlExcludedObjects> mysqlExcludedObjects() {
        return Optional.ofNullable(this.mysqlExcludedObjects);
    }
    /**
     * @return PostgreSQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    public Optional<StreamBackfillAllOracleExcludedObjects> oracleExcludedObjects() {
        return Optional.ofNullable(this.oracleExcludedObjects);
    }
    /**
     * @return PostgreSQL data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    public Optional<StreamBackfillAllPostgresqlExcludedObjects> postgresqlExcludedObjects() {
        return Optional.ofNullable(this.postgresqlExcludedObjects);
    }
    /**
     * @return Salesforce objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    public Optional<StreamBackfillAllSalesforceExcludedObjects> salesforceExcludedObjects() {
        return Optional.ofNullable(this.salesforceExcludedObjects);
    }
    /**
     * @return SQL Server data source objects to avoid backfilling.
     * Structure is documented below.
     * 
     */
    public Optional<StreamBackfillAllSqlServerExcludedObjects> sqlServerExcludedObjects() {
        return Optional.ofNullable(this.sqlServerExcludedObjects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable StreamBackfillAllMysqlExcludedObjects mysqlExcludedObjects;
        private @Nullable StreamBackfillAllOracleExcludedObjects oracleExcludedObjects;
        private @Nullable StreamBackfillAllPostgresqlExcludedObjects postgresqlExcludedObjects;
        private @Nullable StreamBackfillAllSalesforceExcludedObjects salesforceExcludedObjects;
        private @Nullable StreamBackfillAllSqlServerExcludedObjects sqlServerExcludedObjects;
        public Builder() {}
        public Builder(StreamBackfillAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlExcludedObjects = defaults.mysqlExcludedObjects;
    	      this.oracleExcludedObjects = defaults.oracleExcludedObjects;
    	      this.postgresqlExcludedObjects = defaults.postgresqlExcludedObjects;
    	      this.salesforceExcludedObjects = defaults.salesforceExcludedObjects;
    	      this.sqlServerExcludedObjects = defaults.sqlServerExcludedObjects;
        }

        @CustomType.Setter
        public Builder mysqlExcludedObjects(@Nullable StreamBackfillAllMysqlExcludedObjects mysqlExcludedObjects) {

            this.mysqlExcludedObjects = mysqlExcludedObjects;
            return this;
        }
        @CustomType.Setter
        public Builder oracleExcludedObjects(@Nullable StreamBackfillAllOracleExcludedObjects oracleExcludedObjects) {

            this.oracleExcludedObjects = oracleExcludedObjects;
            return this;
        }
        @CustomType.Setter
        public Builder postgresqlExcludedObjects(@Nullable StreamBackfillAllPostgresqlExcludedObjects postgresqlExcludedObjects) {

            this.postgresqlExcludedObjects = postgresqlExcludedObjects;
            return this;
        }
        @CustomType.Setter
        public Builder salesforceExcludedObjects(@Nullable StreamBackfillAllSalesforceExcludedObjects salesforceExcludedObjects) {

            this.salesforceExcludedObjects = salesforceExcludedObjects;
            return this;
        }
        @CustomType.Setter
        public Builder sqlServerExcludedObjects(@Nullable StreamBackfillAllSqlServerExcludedObjects sqlServerExcludedObjects) {

            this.sqlServerExcludedObjects = sqlServerExcludedObjects;
            return this;
        }
        public StreamBackfillAll build() {
            final var _resultValue = new StreamBackfillAll();
            _resultValue.mysqlExcludedObjects = mysqlExcludedObjects;
            _resultValue.oracleExcludedObjects = oracleExcludedObjects;
            _resultValue.postgresqlExcludedObjects = postgresqlExcludedObjects;
            _resultValue.salesforceExcludedObjects = salesforceExcludedObjects;
            _resultValue.sqlServerExcludedObjects = sqlServerExcludedObjects;
            return _resultValue;
        }
    }
}
