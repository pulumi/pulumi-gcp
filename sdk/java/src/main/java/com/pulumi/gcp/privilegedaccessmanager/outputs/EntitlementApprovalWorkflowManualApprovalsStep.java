// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.privilegedaccessmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.privilegedaccessmanager.outputs.EntitlementApprovalWorkflowManualApprovalsStepApprovers;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntitlementApprovalWorkflowManualApprovalsStep {
    /**
     * @return How many users from the above list need to approve.
     * If there are not enough distinct users in the list above then the workflow
     * will indefinitely block. Should always be greater than 0. Currently 1 is the only
     * supported value.
     * 
     */
    private @Nullable Integer approvalsNeeded;
    /**
     * @return Optional. Additional email addresses to be notified when a grant is pending approval.
     * 
     */
    private @Nullable List<String> approverEmailRecipients;
    /**
     * @return The potential set of approvers in this step. This list should contain at only one entry.
     * Structure is documented below.
     * 
     */
    private EntitlementApprovalWorkflowManualApprovalsStepApprovers approvers;

    private EntitlementApprovalWorkflowManualApprovalsStep() {}
    /**
     * @return How many users from the above list need to approve.
     * If there are not enough distinct users in the list above then the workflow
     * will indefinitely block. Should always be greater than 0. Currently 1 is the only
     * supported value.
     * 
     */
    public Optional<Integer> approvalsNeeded() {
        return Optional.ofNullable(this.approvalsNeeded);
    }
    /**
     * @return Optional. Additional email addresses to be notified when a grant is pending approval.
     * 
     */
    public List<String> approverEmailRecipients() {
        return this.approverEmailRecipients == null ? List.of() : this.approverEmailRecipients;
    }
    /**
     * @return The potential set of approvers in this step. This list should contain at only one entry.
     * Structure is documented below.
     * 
     */
    public EntitlementApprovalWorkflowManualApprovalsStepApprovers approvers() {
        return this.approvers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntitlementApprovalWorkflowManualApprovalsStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer approvalsNeeded;
        private @Nullable List<String> approverEmailRecipients;
        private EntitlementApprovalWorkflowManualApprovalsStepApprovers approvers;
        public Builder() {}
        public Builder(EntitlementApprovalWorkflowManualApprovalsStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalsNeeded = defaults.approvalsNeeded;
    	      this.approverEmailRecipients = defaults.approverEmailRecipients;
    	      this.approvers = defaults.approvers;
        }

        @CustomType.Setter
        public Builder approvalsNeeded(@Nullable Integer approvalsNeeded) {

            this.approvalsNeeded = approvalsNeeded;
            return this;
        }
        @CustomType.Setter
        public Builder approverEmailRecipients(@Nullable List<String> approverEmailRecipients) {

            this.approverEmailRecipients = approverEmailRecipients;
            return this;
        }
        public Builder approverEmailRecipients(String... approverEmailRecipients) {
            return approverEmailRecipients(List.of(approverEmailRecipients));
        }
        @CustomType.Setter
        public Builder approvers(EntitlementApprovalWorkflowManualApprovalsStepApprovers approvers) {
            if (approvers == null) {
              throw new MissingRequiredPropertyException("EntitlementApprovalWorkflowManualApprovalsStep", "approvers");
            }
            this.approvers = approvers;
            return this;
        }
        public EntitlementApprovalWorkflowManualApprovalsStep build() {
            final var _resultValue = new EntitlementApprovalWorkflowManualApprovalsStep();
            _resultValue.approvalsNeeded = approvalsNeeded;
            _resultValue.approverEmailRecipients = approverEmailRecipients;
            _resultValue.approvers = approvers;
            return _resultValue;
        }
    }
}
