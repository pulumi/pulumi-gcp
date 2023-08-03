// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtensionsInstanceRuntimeDataFatalError {
    /**
     * @return The error message. This is set by the extension developer to give
     * more detail on why the extension is unusable and must be re-installed
     * or reconfigured.
     * 
     */
    private @Nullable String errorMessage;

    private ExtensionsInstanceRuntimeDataFatalError() {}
    /**
     * @return The error message. This is set by the extension developer to give
     * more detail on why the extension is unusable and must be re-installed
     * or reconfigured.
     * 
     */
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionsInstanceRuntimeDataFatalError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String errorMessage;
        public Builder() {}
        public Builder(ExtensionsInstanceRuntimeDataFatalError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
        }

        @CustomType.Setter
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public ExtensionsInstanceRuntimeDataFatalError build() {
            final var o = new ExtensionsInstanceRuntimeDataFatalError();
            o.errorMessage = errorMessage;
            return o;
        }
    }
}