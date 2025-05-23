// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.backupdisasterrecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationRulesConfigInfoLastBackupError;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackupPlanAssociationRulesConfigInfo {
    /**
     * @return google.rpc.Status object to store the last backup error
     * 
     */
    private List<GetBackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors;
    /**
     * @return State of last backup taken.
     * 
     */
    private String lastBackupState;
    /**
     * @return Backup Rule id fetched from backup plan.
     * 
     */
    private String ruleId;

    private GetBackupPlanAssociationRulesConfigInfo() {}
    /**
     * @return google.rpc.Status object to store the last backup error
     * 
     */
    public List<GetBackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors() {
        return this.lastBackupErrors;
    }
    /**
     * @return State of last backup taken.
     * 
     */
    public String lastBackupState() {
        return this.lastBackupState;
    }
    /**
     * @return Backup Rule id fetched from backup plan.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlanAssociationRulesConfigInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors;
        private String lastBackupState;
        private String ruleId;
        public Builder() {}
        public Builder(GetBackupPlanAssociationRulesConfigInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastBackupErrors = defaults.lastBackupErrors;
    	      this.lastBackupState = defaults.lastBackupState;
    	      this.ruleId = defaults.ruleId;
        }

        @CustomType.Setter
        public Builder lastBackupErrors(List<GetBackupPlanAssociationRulesConfigInfoLastBackupError> lastBackupErrors) {
            if (lastBackupErrors == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationRulesConfigInfo", "lastBackupErrors");
            }
            this.lastBackupErrors = lastBackupErrors;
            return this;
        }
        public Builder lastBackupErrors(GetBackupPlanAssociationRulesConfigInfoLastBackupError... lastBackupErrors) {
            return lastBackupErrors(List.of(lastBackupErrors));
        }
        @CustomType.Setter
        public Builder lastBackupState(String lastBackupState) {
            if (lastBackupState == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationRulesConfigInfo", "lastBackupState");
            }
            this.lastBackupState = lastBackupState;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationRulesConfigInfo", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        public GetBackupPlanAssociationRulesConfigInfo build() {
            final var _resultValue = new GetBackupPlanAssociationRulesConfigInfo();
            _resultValue.lastBackupErrors = lastBackupErrors;
            _resultValue.lastBackupState = lastBackupState;
            _resultValue.ruleId = ruleId;
            return _resultValue;
        }
    }
}
