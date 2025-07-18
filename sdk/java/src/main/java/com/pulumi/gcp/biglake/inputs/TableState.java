// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.biglake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableState extends com.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * Output only. The creation time of the table. A timestamp in RFC3339 UTC
     * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The creation time of the table. A timestamp in RFC3339 UTC
     * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The id of the parent database.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The id of the parent database.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Output only. The deletion time of the table. Only set after the
     * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="deleteTime")
    private @Nullable Output<String> deleteTime;

    /**
     * @return Output only. The deletion time of the table. Only set after the
     * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> deleteTime() {
        return Optional.ofNullable(this.deleteTime);
    }

    /**
     * The checksum of a table object computed by the server based on the value
     * of other fields. It may be sent on update requests to ensure the client
     * has an up-to-date value before proceeding. It is only checked for update
     * table operations.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The checksum of a table object computed by the server based on the value
     * of other fields. It may be sent on update requests to ensure the client
     * has an up-to-date value before proceeding. It is only checked for update
     * table operations.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Output only. The time when this table is considered expired. Only set
     * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Output only. The time when this table is considered expired. Only set
     * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * Options of a Hive table.
     * Structure is documented below.
     * 
     */
    @Import(name="hiveOptions")
    private @Nullable Output<TableHiveOptionsArgs> hiveOptions;

    /**
     * @return Options of a Hive table.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TableHiveOptionsArgs>> hiveOptions() {
        return Optional.ofNullable(this.hiveOptions);
    }

    /**
     * Output only. The name of the Table. Format:
     * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only. The name of the Table. Format:
     * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The database type.
     * Possible values are: `HIVE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The database type.
     * Possible values are: `HIVE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Output only. The last modification time of the table. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The last modification time of the table. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
     * &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private TableState() {}

    private TableState(TableState $) {
        this.createTime = $.createTime;
        this.database = $.database;
        this.deleteTime = $.deleteTime;
        this.etag = $.etag;
        this.expireTime = $.expireTime;
        this.hiveOptions = $.hiveOptions;
        this.name = $.name;
        this.type = $.type;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableState $;

        public Builder() {
            $ = new TableState();
        }

        public Builder(TableState defaults) {
            $ = new TableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The creation time of the table. A timestamp in RFC3339 UTC
         * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
         * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
         * &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The creation time of the table. A timestamp in RFC3339 UTC
         * &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
         * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
         * &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param database The id of the parent database.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The id of the parent database.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param deleteTime Output only. The deletion time of the table. Only set after the
         * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
         * nanosecond resolution and up to nine fractional digits. Examples:
         * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(@Nullable Output<String> deleteTime) {
            $.deleteTime = deleteTime;
            return this;
        }

        /**
         * @param deleteTime Output only. The deletion time of the table. Only set after the
         * table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with
         * nanosecond resolution and up to nine fractional digits. Examples:
         * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(String deleteTime) {
            return deleteTime(Output.of(deleteTime));
        }

        /**
         * @param etag The checksum of a table object computed by the server based on the value
         * of other fields. It may be sent on update requests to ensure the client
         * has an up-to-date value before proceeding. It is only checked for update
         * table operations.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The checksum of a table object computed by the server based on the value
         * of other fields. It may be sent on update requests to ensure the client
         * has an up-to-date value before proceeding. It is only checked for update
         * table operations.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param expireTime Output only. The time when this table is considered expired. Only set
         * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
         * with nanosecond resolution and up to nine fractional digits. Examples:
         * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Output only. The time when this table is considered expired. Only set
         * after the table is deleted. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
         * with nanosecond resolution and up to nine fractional digits. Examples:
         * &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param hiveOptions Options of a Hive table.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveOptions(@Nullable Output<TableHiveOptionsArgs> hiveOptions) {
            $.hiveOptions = hiveOptions;
            return this;
        }

        /**
         * @param hiveOptions Options of a Hive table.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hiveOptions(TableHiveOptionsArgs hiveOptions) {
            return hiveOptions(Output.of(hiveOptions));
        }

        /**
         * @param name Output only. The name of the Table. Format:
         * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only. The name of the Table. Format:
         * projects/{project_id_or_number}/locations/{locationId}/catalogs/{catalogId}/databases/{databaseId}/tables/{tableId}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The database type.
         * Possible values are: `HIVE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The database type.
         * Possible values are: `HIVE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updateTime Output only. The last modification time of the table. A timestamp in
         * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
         * &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The last modification time of the table. A timestamp in
         * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and
         * &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public TableState build() {
            return $;
        }
    }

}
