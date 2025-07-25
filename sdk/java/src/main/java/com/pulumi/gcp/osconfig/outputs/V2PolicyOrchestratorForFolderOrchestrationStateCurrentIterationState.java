// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState {
    /**
     * @return (Output)
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * 
     */
    private @Nullable List<V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError> errors;
    /**
     * @return (Output)
     * Number of orchestration actions which failed so far. For more details,
     * query the Cloud Logs.
     * 
     */
    private @Nullable String failedActions;
    /**
     * @return (Output)
     * Finish time of the wave iteration.
     * 
     */
    private @Nullable String finishTime;
    /**
     * @return (Output)
     * Overall number of actions done by the orchestrator so far.
     * 
     */
    private @Nullable String performedActions;
    /**
     * @return (Output)
     * An estimated percentage of the progress. Number between 0 and 100.
     * 
     */
    private @Nullable Double progress;
    /**
     * @return (Output)
     * Handle to the Progressive Rollouts API rollout resource, which contains
     * detailed information about a particular orchestration iteration.
     * 
     */
    private @Nullable String rolloutResource;
    /**
     * @return (Output)
     * Start time of the wave iteration.
     * 
     */
    private @Nullable String startTime;
    /**
     * @return State of the orchestrator. Can be updated to change orchestrator behaviour.
     * Allowed values:
     * - `ACTIVE` - orchestrator is actively looking for actions to be taken.
     * - `STOPPED` - orchestrator won&#39;t make any changes.
     *   Note: There might be more states added in the future. We use string here
     *   instead of an enum, to avoid the need of propagating new states to all the
     *   client code.
     * 
     */
    private @Nullable String state;

    private V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState() {}
    /**
     * @return (Output)
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * 
     */
    public List<V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * @return (Output)
     * Number of orchestration actions which failed so far. For more details,
     * query the Cloud Logs.
     * 
     */
    public Optional<String> failedActions() {
        return Optional.ofNullable(this.failedActions);
    }
    /**
     * @return (Output)
     * Finish time of the wave iteration.
     * 
     */
    public Optional<String> finishTime() {
        return Optional.ofNullable(this.finishTime);
    }
    /**
     * @return (Output)
     * Overall number of actions done by the orchestrator so far.
     * 
     */
    public Optional<String> performedActions() {
        return Optional.ofNullable(this.performedActions);
    }
    /**
     * @return (Output)
     * An estimated percentage of the progress. Number between 0 and 100.
     * 
     */
    public Optional<Double> progress() {
        return Optional.ofNullable(this.progress);
    }
    /**
     * @return (Output)
     * Handle to the Progressive Rollouts API rollout resource, which contains
     * detailed information about a particular orchestration iteration.
     * 
     */
    public Optional<String> rolloutResource() {
        return Optional.ofNullable(this.rolloutResource);
    }
    /**
     * @return (Output)
     * Start time of the wave iteration.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return State of the orchestrator. Can be updated to change orchestrator behaviour.
     * Allowed values:
     * - `ACTIVE` - orchestrator is actively looking for actions to be taken.
     * - `STOPPED` - orchestrator won&#39;t make any changes.
     *   Note: There might be more states added in the future. We use string here
     *   instead of an enum, to avoid the need of propagating new states to all the
     *   client code.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError> errors;
        private @Nullable String failedActions;
        private @Nullable String finishTime;
        private @Nullable String performedActions;
        private @Nullable Double progress;
        private @Nullable String rolloutResource;
        private @Nullable String startTime;
        private @Nullable String state;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.failedActions = defaults.failedActions;
    	      this.finishTime = defaults.finishTime;
    	      this.performedActions = defaults.performedActions;
    	      this.progress = defaults.progress;
    	      this.rolloutResource = defaults.rolloutResource;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder errors(@Nullable List<V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError> errors) {

            this.errors = errors;
            return this;
        }
        public Builder errors(V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationStateError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder failedActions(@Nullable String failedActions) {

            this.failedActions = failedActions;
            return this;
        }
        @CustomType.Setter
        public Builder finishTime(@Nullable String finishTime) {

            this.finishTime = finishTime;
            return this;
        }
        @CustomType.Setter
        public Builder performedActions(@Nullable String performedActions) {

            this.performedActions = performedActions;
            return this;
        }
        @CustomType.Setter
        public Builder progress(@Nullable Double progress) {

            this.progress = progress;
            return this;
        }
        @CustomType.Setter
        public Builder rolloutResource(@Nullable String rolloutResource) {

            this.rolloutResource = rolloutResource;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {

            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState build() {
            final var _resultValue = new V2PolicyOrchestratorForFolderOrchestrationStateCurrentIterationState();
            _resultValue.errors = errors;
            _resultValue.failedActions = failedActions;
            _resultValue.finishTime = finishTime;
            _resultValue.performedActions = performedActions;
            _resultValue.progress = progress;
            _resultValue.rolloutResource = rolloutResource;
            _resultValue.startTime = startTime;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
