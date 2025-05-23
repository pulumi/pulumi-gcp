// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionResizeRequestStatusError;
import com.pulumi.gcp.compute.outputs.RegionResizeRequestStatusLastAttempt;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RegionResizeRequestStatus {
    /**
     * @return (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionResizeRequestStatusError> errors;
    /**
     * @return (Output)
     * Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it&#39;s still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the &#34;error&#34; field only.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionResizeRequestStatusLastAttempt> lastAttempts;

    private RegionResizeRequestStatus() {}
    /**
     * @return (Output)
     * Fatal errors encountered during the queueing or provisioning phases of the ResizeRequest that caused the transition to the FAILED state. Contrary to the lastAttempt errors, this field is final and errors are never removed from here, as the ResizeRequest is not going to retry.
     * Structure is documented below.
     * 
     */
    public List<RegionResizeRequestStatusError> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * @return (Output)
     * Information about the last attempt to fulfill the request. The value is temporary since the ResizeRequest can retry, as long as it&#39;s still active and the last attempt value can either be cleared or replaced with a different error. Since ResizeRequest retries infrequently, the value may be stale and no longer show an active problem. The value is cleared when ResizeRequest transitions to the final state (becomes inactive). If the final state is FAILED the error describing it will be storred in the &#34;error&#34; field only.
     * Structure is documented below.
     * 
     */
    public List<RegionResizeRequestStatusLastAttempt> lastAttempts() {
        return this.lastAttempts == null ? List.of() : this.lastAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionResizeRequestStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RegionResizeRequestStatusError> errors;
        private @Nullable List<RegionResizeRequestStatusLastAttempt> lastAttempts;
        public Builder() {}
        public Builder(RegionResizeRequestStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.lastAttempts = defaults.lastAttempts;
        }

        @CustomType.Setter
        public Builder errors(@Nullable List<RegionResizeRequestStatusError> errors) {

            this.errors = errors;
            return this;
        }
        public Builder errors(RegionResizeRequestStatusError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder lastAttempts(@Nullable List<RegionResizeRequestStatusLastAttempt> lastAttempts) {

            this.lastAttempts = lastAttempts;
            return this;
        }
        public Builder lastAttempts(RegionResizeRequestStatusLastAttempt... lastAttempts) {
            return lastAttempts(List.of(lastAttempts));
        }
        public RegionResizeRequestStatus build() {
            final var _resultValue = new RegionResizeRequestStatus();
            _resultValue.errors = errors;
            _resultValue.lastAttempts = lastAttempts;
            return _resultValue;
        }
    }
}
