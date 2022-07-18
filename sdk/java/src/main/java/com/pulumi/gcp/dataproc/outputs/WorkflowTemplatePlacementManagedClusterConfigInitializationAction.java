// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigInitializationAction {
    /**
     * @return Required. Cloud Storage URI of executable file.
     * 
     */
    private final @Nullable String executableFile;
    /**
     * @return Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)). Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    private final @Nullable String executionTimeout;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigInitializationAction(
        @CustomType.Parameter("executableFile") @Nullable String executableFile,
        @CustomType.Parameter("executionTimeout") @Nullable String executionTimeout) {
        this.executableFile = executableFile;
        this.executionTimeout = executionTimeout;
    }

    /**
     * @return Required. Cloud Storage URI of executable file.
     * 
     */
    public Optional<String> executableFile() {
        return Optional.ofNullable(this.executableFile);
    }
    /**
     * @return Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)). Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    public Optional<String> executionTimeout() {
        return Optional.ofNullable(this.executionTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigInitializationAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executableFile;
        private @Nullable String executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigInitializationAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder executableFile(@Nullable String executableFile) {
            this.executableFile = executableFile;
            return this;
        }
        public Builder executionTimeout(@Nullable String executionTimeout) {
            this.executionTimeout = executionTimeout;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigInitializationAction build() {
            return new WorkflowTemplatePlacementManagedClusterConfigInitializationAction(executableFile, executionTimeout);
        }
    }
}