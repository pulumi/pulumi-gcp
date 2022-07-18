// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs Empty = new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
     * is &#39;COUNT&#39;, we will retain this many backups.
     * 
     */
    @Import(name="retainedBackups", required=true)
    private Output<Integer> retainedBackups;

    /**
     * @return Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
     * is &#39;COUNT&#39;, we will retain this many backups.
     * 
     */
    public Output<Integer> retainedBackups() {
        return this.retainedBackups;
    }

    /**
     * The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
     * 
     */
    @Import(name="retentionUnit")
    private @Nullable Output<String> retentionUnit;

    /**
     * @return The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
     * 
     */
    public Optional<Output<String>> retentionUnit() {
        return Optional.ofNullable(this.retentionUnit);
    }

    private DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs() {}

    private DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs $) {
        this.retainedBackups = $.retainedBackups;
        this.retentionUnit = $.retentionUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs();
        }

        public Builder(DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs defaults) {
            $ = new DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retainedBackups Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
         * is &#39;COUNT&#39;, we will retain this many backups.
         * 
         * @return builder
         * 
         */
        public Builder retainedBackups(Output<Integer> retainedBackups) {
            $.retainedBackups = retainedBackups;
            return this;
        }

        /**
         * @param retainedBackups Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit
         * is &#39;COUNT&#39;, we will retain this many backups.
         * 
         * @return builder
         * 
         */
        public Builder retainedBackups(Integer retainedBackups) {
            return retainedBackups(Output.of(retainedBackups));
        }

        /**
         * @param retentionUnit The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(@Nullable Output<String> retentionUnit) {
            $.retentionUnit = retentionUnit;
            return this;
        }

        /**
         * @param retentionUnit The unit that &#39;retained_backups&#39; represents. Defaults to `COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder retentionUnit(String retentionUnit) {
            return retentionUnit(Output.of(retentionUnit));
        }

        public DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsArgs build() {
            $.retainedBackups = Objects.requireNonNull($.retainedBackups, "expected parameter 'retainedBackups' to be non-null");
            return $;
        }
    }

}