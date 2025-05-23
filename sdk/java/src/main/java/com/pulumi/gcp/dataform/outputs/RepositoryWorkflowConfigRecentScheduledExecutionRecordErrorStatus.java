// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus {
    /**
     * @return (Output)
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    private @Nullable Integer code;
    /**
     * @return (Output)
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    private @Nullable String message;

    private RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus() {}
    /**
     * @return (Output)
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return (Output)
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String message;
        public Builder() {}
        public Builder(RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {

            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        public RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus build() {
            final var _resultValue = new RepositoryWorkflowConfigRecentScheduledExecutionRecordErrorStatus();
            _resultValue.code = code;
            _resultValue.message = message;
            return _resultValue;
        }
    }
}
