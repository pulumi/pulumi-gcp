// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryReleaseConfigCodeCompilationConfig {
    /**
     * @return Optional. The default schema (BigQuery dataset ID) for assertions.
     * 
     */
    private @Nullable String assertionSchema;
    /**
     * @return Optional. The suffix that should be appended to all database (Google Cloud project ID) names.
     * 
     */
    private @Nullable String databaseSuffix;
    /**
     * @return Optional. The default database (Google Cloud project ID).
     * 
     */
    private @Nullable String defaultDatabase;
    /**
     * @return Optional. The default BigQuery location to use. Defaults to &#34;US&#34;.
     * See the BigQuery docs for a full list of locations: https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    private @Nullable String defaultLocation;
    /**
     * @return Optional. The default schema (BigQuery dataset ID).
     * 
     */
    private @Nullable String defaultSchema;
    /**
     * @return Optional. The suffix that should be appended to all schema (BigQuery dataset ID) names.
     * 
     */
    private @Nullable String schemaSuffix;
    /**
     * @return Optional. The prefix that should be prepended to all table names.
     * 
     */
    private @Nullable String tablePrefix;
    /**
     * @return Optional. User-defined variables that are made available to project code during compilation.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    private @Nullable Map<String,String> vars;

    private RepositoryReleaseConfigCodeCompilationConfig() {}
    /**
     * @return Optional. The default schema (BigQuery dataset ID) for assertions.
     * 
     */
    public Optional<String> assertionSchema() {
        return Optional.ofNullable(this.assertionSchema);
    }
    /**
     * @return Optional. The suffix that should be appended to all database (Google Cloud project ID) names.
     * 
     */
    public Optional<String> databaseSuffix() {
        return Optional.ofNullable(this.databaseSuffix);
    }
    /**
     * @return Optional. The default database (Google Cloud project ID).
     * 
     */
    public Optional<String> defaultDatabase() {
        return Optional.ofNullable(this.defaultDatabase);
    }
    /**
     * @return Optional. The default BigQuery location to use. Defaults to &#34;US&#34;.
     * See the BigQuery docs for a full list of locations: https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    public Optional<String> defaultLocation() {
        return Optional.ofNullable(this.defaultLocation);
    }
    /**
     * @return Optional. The default schema (BigQuery dataset ID).
     * 
     */
    public Optional<String> defaultSchema() {
        return Optional.ofNullable(this.defaultSchema);
    }
    /**
     * @return Optional. The suffix that should be appended to all schema (BigQuery dataset ID) names.
     * 
     */
    public Optional<String> schemaSuffix() {
        return Optional.ofNullable(this.schemaSuffix);
    }
    /**
     * @return Optional. The prefix that should be prepended to all table names.
     * 
     */
    public Optional<String> tablePrefix() {
        return Optional.ofNullable(this.tablePrefix);
    }
    /**
     * @return Optional. User-defined variables that are made available to project code during compilation.
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Map<String,String> vars() {
        return this.vars == null ? Map.of() : this.vars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryReleaseConfigCodeCompilationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String assertionSchema;
        private @Nullable String databaseSuffix;
        private @Nullable String defaultDatabase;
        private @Nullable String defaultLocation;
        private @Nullable String defaultSchema;
        private @Nullable String schemaSuffix;
        private @Nullable String tablePrefix;
        private @Nullable Map<String,String> vars;
        public Builder() {}
        public Builder(RepositoryReleaseConfigCodeCompilationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertionSchema = defaults.assertionSchema;
    	      this.databaseSuffix = defaults.databaseSuffix;
    	      this.defaultDatabase = defaults.defaultDatabase;
    	      this.defaultLocation = defaults.defaultLocation;
    	      this.defaultSchema = defaults.defaultSchema;
    	      this.schemaSuffix = defaults.schemaSuffix;
    	      this.tablePrefix = defaults.tablePrefix;
    	      this.vars = defaults.vars;
        }

        @CustomType.Setter
        public Builder assertionSchema(@Nullable String assertionSchema) {
            this.assertionSchema = assertionSchema;
            return this;
        }
        @CustomType.Setter
        public Builder databaseSuffix(@Nullable String databaseSuffix) {
            this.databaseSuffix = databaseSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder defaultDatabase(@Nullable String defaultDatabase) {
            this.defaultDatabase = defaultDatabase;
            return this;
        }
        @CustomType.Setter
        public Builder defaultLocation(@Nullable String defaultLocation) {
            this.defaultLocation = defaultLocation;
            return this;
        }
        @CustomType.Setter
        public Builder defaultSchema(@Nullable String defaultSchema) {
            this.defaultSchema = defaultSchema;
            return this;
        }
        @CustomType.Setter
        public Builder schemaSuffix(@Nullable String schemaSuffix) {
            this.schemaSuffix = schemaSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder vars(@Nullable Map<String,String> vars) {
            this.vars = vars;
            return this;
        }
        public RepositoryReleaseConfigCodeCompilationConfig build() {
            final var o = new RepositoryReleaseConfigCodeCompilationConfig();
            o.assertionSchema = assertionSchema;
            o.databaseSuffix = databaseSuffix;
            o.defaultDatabase = defaultDatabase;
            o.defaultLocation = defaultLocation;
            o.defaultSchema = defaultSchema;
            o.schemaSuffix = schemaSuffix;
            o.tablePrefix = tablePrefix;
            o.vars = vars;
            return o;
        }
    }
}