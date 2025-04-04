// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataform.outputs.RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryWorkflowConfigRecentScheduledExecutionRecord {
    /**
     * @return (Output)
     * The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus> errorStatuses;
    /**
     * @return (Output)
     * The timestamp of this workflow attempt.
     * 
     */
    private @Nullable String executionTime;
    /**
     * @return (Output)
     * The name of the created workflow invocation, if one was successfully created. In the format projects/*&#47;locations/*&#47;repositories/*&#47;workflowInvocations/*.
     * 
     */
    private @Nullable String workflowInvocation;

    private RepositoryWorkflowConfigRecentScheduledExecutionRecord() {}
    /**
     * @return (Output)
     * The error status encountered upon this attempt to create the workflow invocation, if the attempt was unsuccessful.
     * Structure is documented below.
     * 
     */
    public List<RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus> errorStatuses() {
        return this.errorStatuses == null ? List.of() : this.errorStatuses;
    }
    /**
     * @return (Output)
     * The timestamp of this workflow attempt.
     * 
     */
    public Optional<String> executionTime() {
        return Optional.ofNullable(this.executionTime);
    }
    /**
     * @return (Output)
     * The name of the created workflow invocation, if one was successfully created. In the format projects/*&#47;locations/*&#47;repositories/*&#47;workflowInvocations/*.
     * 
     */
    public Optional<String> workflowInvocation() {
        return Optional.ofNullable(this.workflowInvocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryWorkflowConfigRecentScheduledExecutionRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus> errorStatuses;
        private @Nullable String executionTime;
        private @Nullable String workflowInvocation;
        public Builder() {}
        public Builder(RepositoryWorkflowConfigRecentScheduledExecutionRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorStatuses = defaults.errorStatuses;
    	      this.executionTime = defaults.executionTime;
    	      this.workflowInvocation = defaults.workflowInvocation;
        }

        @CustomType.Setter
        public Builder errorStatuses(@Nullable List<RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus> errorStatuses) {

            this.errorStatuses = errorStatuses;
            return this;
        }
        public Builder errorStatuses(RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus... errorStatuses) {
            return errorStatuses(List.of(errorStatuses));
        }
        @CustomType.Setter
        public Builder executionTime(@Nullable String executionTime) {

            this.executionTime = executionTime;
            return this;
        }
        @CustomType.Setter
        public Builder workflowInvocation(@Nullable String workflowInvocation) {

            this.workflowInvocation = workflowInvocation;
            return this;
        }
        public RepositoryWorkflowConfigRecentScheduledExecutionRecord build() {
            final var _resultValue = new RepositoryWorkflowConfigRecentScheduledExecutionRecord();
            _resultValue.errorStatuses = errorStatuses;
            _resultValue.executionTime = executionTime;
            _resultValue.workflowInvocation = workflowInvocation;
            return _resultValue;
        }
    }
}
