// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.biglake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The parent catalog.
     * 
     */
    @Import(name="catalog", required=true)
    private Output<String> catalog;

    /**
     * @return The parent catalog.
     * 
     */
    public Output<String> catalog() {
        return this.catalog;
    }

    /**
     * Options of a Hive database.
     * Structure is documented below.
     * 
     */
    @Import(name="hiveOptions", required=true)
    private Output<DatabaseHiveOptionsArgs> hiveOptions;

    /**
     * @return Options of a Hive database.
     * Structure is documented below.
     * 
     */
    public Output<DatabaseHiveOptionsArgs> hiveOptions() {
        return this.hiveOptions;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the database.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The database type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The database type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.catalog = $.catalog;
        this.hiveOptions = $.hiveOptions;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalog The parent catalog.
         * 
         * @return builder
         * 
         */
        public Builder catalog(Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        /**
         * @param catalog The parent catalog.
         * 
         * @return builder
         * 
         */
        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        /**
         * @param hiveOptions Options of a Hive database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveOptions(Output<DatabaseHiveOptionsArgs> hiveOptions) {
            $.hiveOptions = hiveOptions;
            return this;
        }

        /**
         * @param hiveOptions Options of a Hive database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveOptions(DatabaseHiveOptionsArgs hiveOptions) {
            return hiveOptions(Output.of(hiveOptions));
        }

        /**
         * @param name The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The database type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The database type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatabaseArgs build() {
            if ($.catalog == null) {
                throw new MissingRequiredPropertyException("DatabaseArgs", "catalog");
            }
            if ($.hiveOptions == null) {
                throw new MissingRequiredPropertyException("DatabaseArgs", "hiveOptions");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DatabaseArgs", "type");
            }
            return $;
        }
    }

}
