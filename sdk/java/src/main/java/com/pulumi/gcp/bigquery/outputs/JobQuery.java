// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.JobQueryDefaultDataset;
import com.pulumi.gcp.bigquery.outputs.JobQueryDestinationEncryptionConfiguration;
import com.pulumi.gcp.bigquery.outputs.JobQueryDestinationTable;
import com.pulumi.gcp.bigquery.outputs.JobQueryScriptOptions;
import com.pulumi.gcp.bigquery.outputs.JobQueryUserDefinedFunctionResource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobQuery {
    /**
     * @return If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
     * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed.
     * However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    private final @Nullable Boolean allowLargeResults;
    /**
     * @return Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    private final @Nullable String createDisposition;
    /**
     * @return Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobQueryDefaultDataset defaultDataset;
    /**
     * @return Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    private final @Nullable JobQueryDestinationEncryptionConfiguration destinationEncryptionConfiguration;
    /**
     * @return The destination table.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobQueryDestinationTable destinationTable;
    /**
     * @return If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results.
     * allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    private final @Nullable Boolean flattenResults;
    /**
     * @return Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    private final @Nullable Integer maximumBillingTier;
    /**
     * @return Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    private final @Nullable String maximumBytesBilled;
    /**
     * @return Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    private final @Nullable String parameterMode;
    /**
     * @return Specifies a priority for the query.
     * Default value is `INTERACTIVE`.
     * Possible values are `INTERACTIVE` and `BATCH`.
     * 
     */
    private final @Nullable String priority;
    /**
     * @return Configures a query job.
     * Structure is documented below.
     * 
     */
    private final String query;
    /**
     * @return Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or
     * supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND;
     * when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators.
     * For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
     * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
     * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    private final @Nullable List<String> schemaUpdateOptions;
    /**
     * @return Options controlling the execution of scripts.
     * Structure is documented below.
     * 
     */
    private final @Nullable JobQueryScriptOptions scriptOptions;
    /**
     * @return Specifies whether to use BigQuery&#39;s legacy SQL dialect for this query. The default value is true.
     * If set to false, the query will use BigQuery&#39;s standard SQL.
     * 
     */
    private final @Nullable Boolean useLegacySql;
    /**
     * @return Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever
     * tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified.
     * The default value is true.
     * 
     */
    private final @Nullable Boolean useQueryCache;
    /**
     * @return Describes user-defined function resources used in the query.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<JobQueryUserDefinedFunctionResource> userDefinedFunctionResources;
    /**
     * @return Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    private final @Nullable String writeDisposition;

    @CustomType.Constructor
    private JobQuery(
        @CustomType.Parameter("allowLargeResults") @Nullable Boolean allowLargeResults,
        @CustomType.Parameter("createDisposition") @Nullable String createDisposition,
        @CustomType.Parameter("defaultDataset") @Nullable JobQueryDefaultDataset defaultDataset,
        @CustomType.Parameter("destinationEncryptionConfiguration") @Nullable JobQueryDestinationEncryptionConfiguration destinationEncryptionConfiguration,
        @CustomType.Parameter("destinationTable") @Nullable JobQueryDestinationTable destinationTable,
        @CustomType.Parameter("flattenResults") @Nullable Boolean flattenResults,
        @CustomType.Parameter("maximumBillingTier") @Nullable Integer maximumBillingTier,
        @CustomType.Parameter("maximumBytesBilled") @Nullable String maximumBytesBilled,
        @CustomType.Parameter("parameterMode") @Nullable String parameterMode,
        @CustomType.Parameter("priority") @Nullable String priority,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("schemaUpdateOptions") @Nullable List<String> schemaUpdateOptions,
        @CustomType.Parameter("scriptOptions") @Nullable JobQueryScriptOptions scriptOptions,
        @CustomType.Parameter("useLegacySql") @Nullable Boolean useLegacySql,
        @CustomType.Parameter("useQueryCache") @Nullable Boolean useQueryCache,
        @CustomType.Parameter("userDefinedFunctionResources") @Nullable List<JobQueryUserDefinedFunctionResource> userDefinedFunctionResources,
        @CustomType.Parameter("writeDisposition") @Nullable String writeDisposition) {
        this.allowLargeResults = allowLargeResults;
        this.createDisposition = createDisposition;
        this.defaultDataset = defaultDataset;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.flattenResults = flattenResults;
        this.maximumBillingTier = maximumBillingTier;
        this.maximumBytesBilled = maximumBytesBilled;
        this.parameterMode = parameterMode;
        this.priority = priority;
        this.query = query;
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.scriptOptions = scriptOptions;
        this.useLegacySql = useLegacySql;
        this.useQueryCache = useQueryCache;
        this.userDefinedFunctionResources = userDefinedFunctionResources;
        this.writeDisposition = writeDisposition;
    }

    /**
     * @return If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
     * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed.
     * However, you must still set destinationTable when result size exceeds the allowed maximum response size.
     * 
     */
    public Optional<Boolean> allowLargeResults() {
        return Optional.ofNullable(this.allowLargeResults);
    }
    /**
     * @return Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a &#39;notFound&#39; error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    public Optional<String> createDisposition() {
        return Optional.ofNullable(this.createDisposition);
    }
    /**
     * @return Specifies the default dataset to use for unqualified table names in the query. Note that this does not alter behavior of unqualified dataset names.
     * Structure is documented below.
     * 
     */
    public Optional<JobQueryDefaultDataset> defaultDataset() {
        return Optional.ofNullable(this.defaultDataset);
    }
    /**
     * @return Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    public Optional<JobQueryDestinationEncryptionConfiguration> destinationEncryptionConfiguration() {
        return Optional.ofNullable(this.destinationEncryptionConfiguration);
    }
    /**
     * @return The destination table.
     * Structure is documented below.
     * 
     */
    public Optional<JobQueryDestinationTable> destinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }
    /**
     * @return If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results.
     * allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
     * 
     */
    public Optional<Boolean> flattenResults() {
        return Optional.ofNullable(this.flattenResults);
    }
    /**
     * @return Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    public Optional<Integer> maximumBillingTier() {
        return Optional.ofNullable(this.maximumBillingTier);
    }
    /**
     * @return Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge).
     * If unspecified, this will be set to your project default.
     * 
     */
    public Optional<String> maximumBytesBilled() {
        return Optional.ofNullable(this.maximumBytesBilled);
    }
    /**
     * @return Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
     * 
     */
    public Optional<String> parameterMode() {
        return Optional.ofNullable(this.parameterMode);
    }
    /**
     * @return Specifies a priority for the query.
     * Default value is `INTERACTIVE`.
     * Possible values are `INTERACTIVE` and `BATCH`.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Configures a query job.
     * Structure is documented below.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or
     * supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND;
     * when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators.
     * For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
     * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
     * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    public List<String> schemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? List.of() : this.schemaUpdateOptions;
    }
    /**
     * @return Options controlling the execution of scripts.
     * Structure is documented below.
     * 
     */
    public Optional<JobQueryScriptOptions> scriptOptions() {
        return Optional.ofNullable(this.scriptOptions);
    }
    /**
     * @return Specifies whether to use BigQuery&#39;s legacy SQL dialect for this query. The default value is true.
     * If set to false, the query will use BigQuery&#39;s standard SQL.
     * 
     */
    public Optional<Boolean> useLegacySql() {
        return Optional.ofNullable(this.useLegacySql);
    }
    /**
     * @return Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever
     * tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified.
     * The default value is true.
     * 
     */
    public Optional<Boolean> useQueryCache() {
        return Optional.ofNullable(this.useQueryCache);
    }
    /**
     * @return Describes user-defined function resources used in the query.
     * Structure is documented below.
     * 
     */
    public List<JobQueryUserDefinedFunctionResource> userDefinedFunctionResources() {
        return this.userDefinedFunctionResources == null ? List.of() : this.userDefinedFunctionResources;
    }
    /**
     * @return Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a &#39;duplicate&#39; error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    public Optional<String> writeDisposition() {
        return Optional.ofNullable(this.writeDisposition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowLargeResults;
        private @Nullable String createDisposition;
        private @Nullable JobQueryDefaultDataset defaultDataset;
        private @Nullable JobQueryDestinationEncryptionConfiguration destinationEncryptionConfiguration;
        private @Nullable JobQueryDestinationTable destinationTable;
        private @Nullable Boolean flattenResults;
        private @Nullable Integer maximumBillingTier;
        private @Nullable String maximumBytesBilled;
        private @Nullable String parameterMode;
        private @Nullable String priority;
        private String query;
        private @Nullable List<String> schemaUpdateOptions;
        private @Nullable JobQueryScriptOptions scriptOptions;
        private @Nullable Boolean useLegacySql;
        private @Nullable Boolean useQueryCache;
        private @Nullable List<JobQueryUserDefinedFunctionResource> userDefinedFunctionResources;
        private @Nullable String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargeResults = defaults.allowLargeResults;
    	      this.createDisposition = defaults.createDisposition;
    	      this.defaultDataset = defaults.defaultDataset;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.flattenResults = defaults.flattenResults;
    	      this.maximumBillingTier = defaults.maximumBillingTier;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.parameterMode = defaults.parameterMode;
    	      this.priority = defaults.priority;
    	      this.query = defaults.query;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.scriptOptions = defaults.scriptOptions;
    	      this.useLegacySql = defaults.useLegacySql;
    	      this.useQueryCache = defaults.useQueryCache;
    	      this.userDefinedFunctionResources = defaults.userDefinedFunctionResources;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder allowLargeResults(@Nullable Boolean allowLargeResults) {
            this.allowLargeResults = allowLargeResults;
            return this;
        }
        public Builder createDisposition(@Nullable String createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }
        public Builder defaultDataset(@Nullable JobQueryDefaultDataset defaultDataset) {
            this.defaultDataset = defaultDataset;
            return this;
        }
        public Builder destinationEncryptionConfiguration(@Nullable JobQueryDestinationEncryptionConfiguration destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }
        public Builder destinationTable(@Nullable JobQueryDestinationTable destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }
        public Builder flattenResults(@Nullable Boolean flattenResults) {
            this.flattenResults = flattenResults;
            return this;
        }
        public Builder maximumBillingTier(@Nullable Integer maximumBillingTier) {
            this.maximumBillingTier = maximumBillingTier;
            return this;
        }
        public Builder maximumBytesBilled(@Nullable String maximumBytesBilled) {
            this.maximumBytesBilled = maximumBytesBilled;
            return this;
        }
        public Builder parameterMode(@Nullable String parameterMode) {
            this.parameterMode = parameterMode;
            return this;
        }
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder schemaUpdateOptions(@Nullable List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = schemaUpdateOptions;
            return this;
        }
        public Builder schemaUpdateOptions(String... schemaUpdateOptions) {
            return schemaUpdateOptions(List.of(schemaUpdateOptions));
        }
        public Builder scriptOptions(@Nullable JobQueryScriptOptions scriptOptions) {
            this.scriptOptions = scriptOptions;
            return this;
        }
        public Builder useLegacySql(@Nullable Boolean useLegacySql) {
            this.useLegacySql = useLegacySql;
            return this;
        }
        public Builder useQueryCache(@Nullable Boolean useQueryCache) {
            this.useQueryCache = useQueryCache;
            return this;
        }
        public Builder userDefinedFunctionResources(@Nullable List<JobQueryUserDefinedFunctionResource> userDefinedFunctionResources) {
            this.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }
        public Builder userDefinedFunctionResources(JobQueryUserDefinedFunctionResource... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }
        public Builder writeDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }        public JobQuery build() {
            return new JobQuery(allowLargeResults, createDisposition, defaultDataset, destinationEncryptionConfiguration, destinationTable, flattenResults, maximumBillingTier, maximumBytesBilled, parameterMode, priority, query, schemaUpdateOptions, scriptOptions, useLegacySql, useQueryCache, userDefinedFunctionResources, writeDisposition);
        }
    }
}