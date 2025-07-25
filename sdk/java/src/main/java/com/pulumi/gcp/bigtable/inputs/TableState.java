// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs;
import com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableState extends com.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automated_backup_policy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automated_backup_policy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
     * 
     * ***
     * 
     */
    @Import(name="automatedBackupPolicy")
    private @Nullable Output<TableAutomatedBackupPolicyArgs> automatedBackupPolicy;

    /**
     * @return Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automated_backup_policy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automated_backup_policy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
     * 
     * ***
     * 
     */
    public Optional<Output<TableAutomatedBackupPolicyArgs>> automatedBackupPolicy() {
        return Optional.ofNullable(this.automatedBackupPolicy);
    }

    /**
     * Duration to retain change stream data for the table. Set to 0 to disable. Must be between 1 and 7 days.
     * 
     */
    @Import(name="changeStreamRetention")
    private @Nullable Output<String> changeStreamRetention;

    /**
     * @return Duration to retain change stream data for the table. Set to 0 to disable. Must be between 1 and 7 days.
     * 
     */
    public Optional<Output<String>> changeStreamRetention() {
        return Optional.ofNullable(this.changeStreamRetention);
    }

    /**
     * A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * 
     */
    @Import(name="columnFamilies")
    private @Nullable Output<List<TableColumnFamilyArgs>> columnFamilies;

    /**
     * @return A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * 
     */
    public Optional<Output<List<TableColumnFamilyArgs>>> columnFamilies() {
        return Optional.ofNullable(this.columnFamilies);
    }

    /**
     * A field to make the table protected against data loss i.e. when set to PROTECTED, deleting the table, the column families in the table, and the instance containing the table would be prohibited. If not provided, deletion protection will be set to UNPROTECTED.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<String> deletionProtection;

    /**
     * @return A field to make the table protected against data loss i.e. when set to PROTECTED, deleting the table, the column families in the table, and the instance containing the table would be prohibited. If not provided, deletion protection will be set to UNPROTECTED.
     * 
     */
    public Optional<Output<String>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * The name of the Bigtable instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the Bigtable instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The name of the table. Must be 1-50 characters and must only contain hyphens, underscores, periods, letters and numbers.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the table. Must be 1-50 characters and must only contain hyphens, underscores, periods, letters and numbers.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Defines the row key schema of a table. To create or update a table with a row key schema, specify this argument. Note
     * that in-place update is not supported, and any in-place modification to the schema will lead to failure. To update a
     * schema, please clear it (by omitting the field), and update the resource again with a new schema.\n The schema must be a
     * valid JSON encoded string representing a Type&#39;s struct protobuf message. Note that for bytes sequence (like
     * delimited_bytes.delimiter) the delimiter must be base64 encoded. For example, if you want to set a delimiter to a single
     * byte character &#34;#&#34;, it should be set to &#34;Iw==&#34;, which is the base64 encoding of the byte sequence &#34;#&#34;.
     * 
     */
    @Import(name="rowKeySchema")
    private @Nullable Output<String> rowKeySchema;

    /**
     * @return Defines the row key schema of a table. To create or update a table with a row key schema, specify this argument. Note
     * that in-place update is not supported, and any in-place modification to the schema will lead to failure. To update a
     * schema, please clear it (by omitting the field), and update the resource again with a new schema.\n The schema must be a
     * valid JSON encoded string representing a Type&#39;s struct protobuf message. Note that for bytes sequence (like
     * delimited_bytes.delimiter) the delimiter must be base64 encoded. For example, if you want to set a delimiter to a single
     * byte character &#34;#&#34;, it should be set to &#34;Iw==&#34;, which is the base64 encoding of the byte sequence &#34;#&#34;.
     * 
     */
    public Optional<Output<String>> rowKeySchema() {
        return Optional.ofNullable(this.rowKeySchema);
    }

    /**
     * A list of predefined keys to split the table on.
     * !&gt; **Warning:** Modifying the `split_keys` of an existing table will cause the provider
     * to delete/recreate the entire `gcp.bigtable.Table` resource.
     * 
     */
    @Import(name="splitKeys")
    private @Nullable Output<List<String>> splitKeys;

    /**
     * @return A list of predefined keys to split the table on.
     * !&gt; **Warning:** Modifying the `split_keys` of an existing table will cause the provider
     * to delete/recreate the entire `gcp.bigtable.Table` resource.
     * 
     */
    public Optional<Output<List<String>>> splitKeys() {
        return Optional.ofNullable(this.splitKeys);
    }

    private TableState() {}

    private TableState(TableState $) {
        this.automatedBackupPolicy = $.automatedBackupPolicy;
        this.changeStreamRetention = $.changeStreamRetention;
        this.columnFamilies = $.columnFamilies;
        this.deletionProtection = $.deletionProtection;
        this.instanceName = $.instanceName;
        this.name = $.name;
        this.project = $.project;
        this.rowKeySchema = $.rowKeySchema;
        this.splitKeys = $.splitKeys;
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
         * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automated_backup_policy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automated_backup_policy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder automatedBackupPolicy(@Nullable Output<TableAutomatedBackupPolicyArgs> automatedBackupPolicy) {
            $.automatedBackupPolicy = automatedBackupPolicy;
            return this;
        }

        /**
         * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automated_backup_policy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automated_backup_policy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder automatedBackupPolicy(TableAutomatedBackupPolicyArgs automatedBackupPolicy) {
            return automatedBackupPolicy(Output.of(automatedBackupPolicy));
        }

        /**
         * @param changeStreamRetention Duration to retain change stream data for the table. Set to 0 to disable. Must be between 1 and 7 days.
         * 
         * @return builder
         * 
         */
        public Builder changeStreamRetention(@Nullable Output<String> changeStreamRetention) {
            $.changeStreamRetention = changeStreamRetention;
            return this;
        }

        /**
         * @param changeStreamRetention Duration to retain change stream data for the table. Set to 0 to disable. Must be between 1 and 7 days.
         * 
         * @return builder
         * 
         */
        public Builder changeStreamRetention(String changeStreamRetention) {
            return changeStreamRetention(Output.of(changeStreamRetention));
        }

        /**
         * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder columnFamilies(@Nullable Output<List<TableColumnFamilyArgs>> columnFamilies) {
            $.columnFamilies = columnFamilies;
            return this;
        }

        /**
         * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder columnFamilies(List<TableColumnFamilyArgs> columnFamilies) {
            return columnFamilies(Output.of(columnFamilies));
        }

        /**
         * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder columnFamilies(TableColumnFamilyArgs... columnFamilies) {
            return columnFamilies(List.of(columnFamilies));
        }

        /**
         * @param deletionProtection A field to make the table protected against data loss i.e. when set to PROTECTED, deleting the table, the column families in the table, and the instance containing the table would be prohibited. If not provided, deletion protection will be set to UNPROTECTED.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<String> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection A field to make the table protected against data loss i.e. when set to PROTECTED, deleting the table, the column families in the table, and the instance containing the table would be prohibited. If not provided, deletion protection will be set to UNPROTECTED.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(String deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param instanceName The name of the Bigtable instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the Bigtable instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param name The name of the table. Must be 1-50 characters and must only contain hyphens, underscores, periods, letters and numbers.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the table. Must be 1-50 characters and must only contain hyphens, underscores, periods, letters and numbers.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rowKeySchema Defines the row key schema of a table. To create or update a table with a row key schema, specify this argument. Note
         * that in-place update is not supported, and any in-place modification to the schema will lead to failure. To update a
         * schema, please clear it (by omitting the field), and update the resource again with a new schema.\n The schema must be a
         * valid JSON encoded string representing a Type&#39;s struct protobuf message. Note that for bytes sequence (like
         * delimited_bytes.delimiter) the delimiter must be base64 encoded. For example, if you want to set a delimiter to a single
         * byte character &#34;#&#34;, it should be set to &#34;Iw==&#34;, which is the base64 encoding of the byte sequence &#34;#&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rowKeySchema(@Nullable Output<String> rowKeySchema) {
            $.rowKeySchema = rowKeySchema;
            return this;
        }

        /**
         * @param rowKeySchema Defines the row key schema of a table. To create or update a table with a row key schema, specify this argument. Note
         * that in-place update is not supported, and any in-place modification to the schema will lead to failure. To update a
         * schema, please clear it (by omitting the field), and update the resource again with a new schema.\n The schema must be a
         * valid JSON encoded string representing a Type&#39;s struct protobuf message. Note that for bytes sequence (like
         * delimited_bytes.delimiter) the delimiter must be base64 encoded. For example, if you want to set a delimiter to a single
         * byte character &#34;#&#34;, it should be set to &#34;Iw==&#34;, which is the base64 encoding of the byte sequence &#34;#&#34;.
         * 
         * @return builder
         * 
         */
        public Builder rowKeySchema(String rowKeySchema) {
            return rowKeySchema(Output.of(rowKeySchema));
        }

        /**
         * @param splitKeys A list of predefined keys to split the table on.
         * !&gt; **Warning:** Modifying the `split_keys` of an existing table will cause the provider
         * to delete/recreate the entire `gcp.bigtable.Table` resource.
         * 
         * @return builder
         * 
         */
        public Builder splitKeys(@Nullable Output<List<String>> splitKeys) {
            $.splitKeys = splitKeys;
            return this;
        }

        /**
         * @param splitKeys A list of predefined keys to split the table on.
         * !&gt; **Warning:** Modifying the `split_keys` of an existing table will cause the provider
         * to delete/recreate the entire `gcp.bigtable.Table` resource.
         * 
         * @return builder
         * 
         */
        public Builder splitKeys(List<String> splitKeys) {
            return splitKeys(Output.of(splitKeys));
        }

        /**
         * @param splitKeys A list of predefined keys to split the table on.
         * !&gt; **Warning:** Modifying the `split_keys` of an existing table will cause the provider
         * to delete/recreate the entire `gcp.bigtable.Table` resource.
         * 
         * @return builder
         * 
         */
        public Builder splitKeys(String... splitKeys) {
            return splitKeys(List.of(splitKeys));
        }

        public TableState build() {
            return $;
        }
    }

}
