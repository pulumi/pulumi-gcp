// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs Empty = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs();

    /**
     * Column name.
     * 
     */
    @Import(name="column")
    private @Nullable Output<String> column;

    /**
     * @return Column name.
     * 
     */
    public Optional<Output<String>> column() {
        return Optional.ofNullable(this.column);
    }

    /**
     * The Oracle data type. Full data types list can be found here:
     * https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/Data-Types.html
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return The Oracle data type. Full data types list can be found here:
     * https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/Data-Types.html
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Column encoding.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Column encoding.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * Column length.
     * 
     */
    @Import(name="length")
    private @Nullable Output<Integer> length;

    /**
     * @return Column length.
     * 
     */
    public Optional<Output<Integer>> length() {
        return Optional.ofNullable(this.length);
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @Import(name="nullable")
    private @Nullable Output<Boolean> nullable;

    /**
     * @return Whether or not the column can accept a null value.
     * 
     */
    public Optional<Output<Boolean>> nullable() {
        return Optional.ofNullable(this.nullable);
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @Import(name="ordinalPosition")
    private @Nullable Output<Integer> ordinalPosition;

    /**
     * @return The ordinal position of the column in the table.
     * 
     */
    public Optional<Output<Integer>> ordinalPosition() {
        return Optional.ofNullable(this.ordinalPosition);
    }

    /**
     * Column precision.
     * 
     */
    @Import(name="precision")
    private @Nullable Output<Integer> precision;

    /**
     * @return Column precision.
     * 
     */
    public Optional<Output<Integer>> precision() {
        return Optional.ofNullable(this.precision);
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<Boolean> primaryKey;

    /**
     * @return Whether or not the column represents a primary key.
     * 
     */
    public Optional<Output<Boolean>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * Column scale.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<Integer> scale;

    /**
     * @return Column scale.
     * 
     */
    public Optional<Output<Integer>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs() {}

    private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs $) {
        this.column = $.column;
        this.dataType = $.dataType;
        this.encoding = $.encoding;
        this.length = $.length;
        this.nullable = $.nullable;
        this.ordinalPosition = $.ordinalPosition;
        this.precision = $.precision;
        this.primaryKey = $.primaryKey;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs $;

        public Builder() {
            $ = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs();
        }

        public Builder(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs defaults) {
            $ = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param column Column name.
         * 
         * @return builder
         * 
         */
        public Builder column(@Nullable Output<String> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column Column name.
         * 
         * @return builder
         * 
         */
        public Builder column(String column) {
            return column(Output.of(column));
        }

        /**
         * @param dataType The Oracle data type. Full data types list can be found here:
         * https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/Data-Types.html
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType The Oracle data type. Full data types list can be found here:
         * https://docs.oracle.com/en/database/oracle/oracle-database/21/sqlrf/Data-Types.html
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param encoding Column encoding.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Column encoding.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param length Column length.
         * 
         * @return builder
         * 
         */
        public Builder length(@Nullable Output<Integer> length) {
            $.length = length;
            return this;
        }

        /**
         * @param length Column length.
         * 
         * @return builder
         * 
         */
        public Builder length(Integer length) {
            return length(Output.of(length));
        }

        /**
         * @param nullable Whether or not the column can accept a null value.
         * 
         * @return builder
         * 
         */
        public Builder nullable(@Nullable Output<Boolean> nullable) {
            $.nullable = nullable;
            return this;
        }

        /**
         * @param nullable Whether or not the column can accept a null value.
         * 
         * @return builder
         * 
         */
        public Builder nullable(Boolean nullable) {
            return nullable(Output.of(nullable));
        }

        /**
         * @param ordinalPosition The ordinal position of the column in the table.
         * 
         * @return builder
         * 
         */
        public Builder ordinalPosition(@Nullable Output<Integer> ordinalPosition) {
            $.ordinalPosition = ordinalPosition;
            return this;
        }

        /**
         * @param ordinalPosition The ordinal position of the column in the table.
         * 
         * @return builder
         * 
         */
        public Builder ordinalPosition(Integer ordinalPosition) {
            return ordinalPosition(Output.of(ordinalPosition));
        }

        /**
         * @param precision Column precision.
         * 
         * @return builder
         * 
         */
        public Builder precision(@Nullable Output<Integer> precision) {
            $.precision = precision;
            return this;
        }

        /**
         * @param precision Column precision.
         * 
         * @return builder
         * 
         */
        public Builder precision(Integer precision) {
            return precision(Output.of(precision));
        }

        /**
         * @param primaryKey Whether or not the column represents a primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<Boolean> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey Whether or not the column represents a primary key.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(Boolean primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param scale Column scale.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<Integer> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale Column scale.
         * 
         * @return builder
         * 
         */
        public Builder scale(Integer scale) {
            return scale(Output.of(scale));
        }

        public StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableOracleColumnArgs build() {
            return $;
        }
    }

}