// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.backupdisasterrecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.backupdisasterrecovery.outputs.BackupPlanAssociationRulesConfigInfoLastBackupError;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupPlanAssociationRulesConfigInfo {
    /**
     * @return (Output)
     * google.rpc.Status object to store the last backup error
     * Structure is documented below.
     * 
     */
    private @Nullable List<BackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors;
    /**
     * @return (Output)
     * State of last backup taken.
     * 
     */
    private @Nullable String lastBackupState;
    /**
     * @return (Output)
     * Backup Rule id fetched from backup plan.
     * 
     */
    private @Nullable String ruleId;

    private BackupPlanAssociationRulesConfigInfo() {}
    /**
     * @return (Output)
     * google.rpc.Status object to store the last backup error
     * Structure is documented below.
     * 
     */
    public List<BackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors() {
        return this.lastBackupErrors == null ? List.of() : this.lastBackupErrors;
    }
    /**
     * @return (Output)
     * State of last backup taken.
     * 
     */
    public Optional<String> lastBackupState() {
        return Optional.ofNullable(this.lastBackupState);
    }
    /**
     * @return (Output)
     * Backup Rule id fetched from backup plan.
     * 
     */
    public Optional<String> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanAssociationRulesConfigInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors;
        private @Nullable String lastBackupState;
        private @Nullable String ruleId;
        public Builder() {}
        public Builder(BackupPlanAssociationRulesConfigInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastBackupErrors = defaults.lastBackupErrors;
    	      this.lastBackupState = defaults.lastBackupState;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder lastBackupErrors(@Nullable List<BackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors) {

            this.lastBackupErrors = lastBackupErrors;
            return this;
        }
        public Builder lastBackupErrors(BackupPlanAssociationRulesConfigInfoLastBackupError... lastBackupErrors) {
            return lastBackupErrors(List.of(lastBackupErrors));
        }
        @CustomType.Setter
        public Builder lastBackupState(@Nullable String lastBackupState) {

            this.lastBackupState = lastBackupState;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(@Nullable String ruleId) {

            this.ruleId = ruleId;
            return this;
        }
        public BackupPlanAssociationRulesConfigInfo build() {
            final var _resultValue = new BackupPlanAssociationRulesConfigInfo();
            _resultValue.lastBackupErrors = lastBackupErrors;
            _resultValue.lastBackupState = lastBackupState;
            _resultValue.ruleId = ruleId;
            return _resultValue;
        }
    }
}
