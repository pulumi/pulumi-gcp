// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadIdentityPoolNamespaceOwnerService {
    /**
     * @return (Output)
     * The service agent principal subject, e.g.
     * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
     * 
     */
    private @Nullable String principalSubject;

    private WorkloadIdentityPoolNamespaceOwnerService() {}
    /**
     * @return (Output)
     * The service agent principal subject, e.g.
     * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
     * 
     */
    public Optional<String> principalSubject() {
        return Optional.ofNullable(this.principalSubject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityPoolNamespaceOwnerService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String principalSubject;
        public Builder() {}
        public Builder(WorkloadIdentityPoolNamespaceOwnerService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalSubject = defaults.principalSubject;
        }

        @CustomType.Setter
        public Builder principalSubject(@Nullable String principalSubject) {

            this.principalSubject = principalSubject;
            return this;
        }
        public WorkloadIdentityPoolNamespaceOwnerService build() {
            final var _resultValue = new WorkloadIdentityPoolNamespaceOwnerService();
            _resultValue.principalSubject = principalSubject;
            return _resultValue;
        }
    }
}
