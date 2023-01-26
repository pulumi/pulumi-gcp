// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs Empty = new StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs();

    /**
     * MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    @Import(name="mysqlColumns")
    private @Nullable Output<List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs>> mysqlColumns;

    /**
     * @return MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs>>> mysqlColumns() {
        return Optional.ofNullable(this.mysqlColumns);
    }

    /**
     * Table name.
     * 
     */
    @Import(name="table", required=true)
    private Output<String> table;

    /**
     * @return Table name.
     * 
     */
    public Output<String> table() {
        return this.table;
    }

    private StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs() {}

    private StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs $) {
        this.mysqlColumns = $.mysqlColumns;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs $;

        public Builder() {
            $ = new StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs();
        }

        public Builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs defaults) {
            $ = new StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(@Nullable Output<List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs>> mysqlColumns) {
            $.mysqlColumns = mysqlColumns;
            return this;
        }

        /**
         * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs> mysqlColumns) {
            return mysqlColumns(Output.of(mysqlColumns));
        }

        /**
         * @param mysqlColumns MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlColumns(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumnArgs... mysqlColumns) {
            return mysqlColumns(List.of(mysqlColumns));
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableArgs build() {
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}