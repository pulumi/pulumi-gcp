// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs Empty = new StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs();

    /**
     * Tables in the schema.
     * Structure is documented below.
     * 
     */
    @Import(name="postgresqlTables")
    private @Nullable Output<List<StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs>> postgresqlTables;

    /**
     * @return Tables in the schema.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs>>> postgresqlTables() {
        return Optional.ofNullable(this.postgresqlTables);
    }

    /**
     * Database name.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return Database name.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs() {}

    private StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs(StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs $) {
        this.postgresqlTables = $.postgresqlTables;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs $;

        public Builder() {
            $ = new StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs();
        }

        public Builder(StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs defaults) {
            $ = new StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param postgresqlTables Tables in the schema.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder postgresqlTables(@Nullable Output<List<StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs>> postgresqlTables) {
            $.postgresqlTables = postgresqlTables;
            return this;
        }

        /**
         * @param postgresqlTables Tables in the schema.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder postgresqlTables(List<StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs> postgresqlTables) {
            return postgresqlTables(Output.of(postgresqlTables));
        }

        /**
         * @param postgresqlTables Tables in the schema.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder postgresqlTables(StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaPostgresqlTableArgs... postgresqlTables) {
            return postgresqlTables(List.of(postgresqlTables));
        }

        /**
         * @param schema Database name.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Database name.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public StreamSourceConfigPostgresqlSourceConfigExcludeObjectsPostgresqlSchemaArgs build() {
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}