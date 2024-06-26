// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs Empty = new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs();

    /**
     * Schema name.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return Schema name.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * Tables in the database.
     * Structure is documented below.
     * 
     */
    @Import(name="tables")
    private @Nullable Output<List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs>> tables;

    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs>>> tables() {
        return Optional.ofNullable(this.tables);
    }

    private StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs() {}

    private StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs $) {
        this.schema = $.schema;
        this.tables = $.tables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs $;

        public Builder() {
            $ = new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs();
        }

        public Builder(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs defaults) {
            $ = new StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param schema Schema name.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Schema name.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param tables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tables(@Nullable Output<List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs>> tables) {
            $.tables = tables;
            return this;
        }

        /**
         * @param tables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tables(List<StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs> tables) {
            return tables(Output.of(tables));
        }

        /**
         * @param tables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tables(StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaTableArgs... tables) {
            return tables(List.of(tables));
        }

        public StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs build() {
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("StreamSourceConfigSqlServerSourceConfigExcludeObjectsSchemaArgs", "schema");
            }
            return $;
        }
    }

}
