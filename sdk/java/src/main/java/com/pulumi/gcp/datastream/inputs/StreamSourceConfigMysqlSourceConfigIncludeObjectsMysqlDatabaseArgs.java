// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs Empty = new StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs();

    /**
     * Database name.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return Database name.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Tables in the database.
     * Structure is documented below.
     * 
     */
    @Import(name="mysqlTables")
    private @Nullable Output<List<StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs>> mysqlTables;

    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs>>> mysqlTables() {
        return Optional.ofNullable(this.mysqlTables);
    }

    private StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs() {}

    private StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs(StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs $) {
        this.database = $.database;
        this.mysqlTables = $.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs $;

        public Builder() {
            $ = new StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs();
        }

        public Builder(StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs defaults) {
            $ = new StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param mysqlTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlTables(@Nullable Output<List<StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs>> mysqlTables) {
            $.mysqlTables = mysqlTables;
            return this;
        }

        /**
         * @param mysqlTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlTables(List<StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs> mysqlTables) {
            return mysqlTables(Output.of(mysqlTables));
        }

        /**
         * @param mysqlTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlTables(StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseMysqlTableArgs... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }

        public StreamSourceConfigMysqlSourceConfigIncludeObjectsMysqlDatabaseArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            return $;
        }
    }

}