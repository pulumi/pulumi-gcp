// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolNamespaceOwnerServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolNamespaceOwnerServiceArgs Empty = new WorkloadIdentityPoolNamespaceOwnerServiceArgs();

    /**
     * (Output)
     * The service agent principal subject, e.g.
     * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
     * 
     */
    @Import(name="principalSubject")
    private @Nullable Output<String> principalSubject;

    /**
     * @return (Output)
     * The service agent principal subject, e.g.
     * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
     * 
     */
    public Optional<Output<String>> principalSubject() {
        return Optional.ofNullable(this.principalSubject);
    }

    private WorkloadIdentityPoolNamespaceOwnerServiceArgs() {}

    private WorkloadIdentityPoolNamespaceOwnerServiceArgs(WorkloadIdentityPoolNamespaceOwnerServiceArgs $) {
        this.principalSubject = $.principalSubject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadIdentityPoolNamespaceOwnerServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadIdentityPoolNamespaceOwnerServiceArgs $;

        public Builder() {
            $ = new WorkloadIdentityPoolNamespaceOwnerServiceArgs();
        }

        public Builder(WorkloadIdentityPoolNamespaceOwnerServiceArgs defaults) {
            $ = new WorkloadIdentityPoolNamespaceOwnerServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalSubject (Output)
         * The service agent principal subject, e.g.
         * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder principalSubject(@Nullable Output<String> principalSubject) {
            $.principalSubject = principalSubject;
            return this;
        }

        /**
         * @param principalSubject (Output)
         * The service agent principal subject, e.g.
         * `serviceAccount:service-1234{@literal @}gcp-sa-gkehub.iam.gserviceaccount.com`.
         * 
         * @return builder
         * 
         */
        public Builder principalSubject(String principalSubject) {
            return principalSubject(Output.of(principalSubject));
        }

        public WorkloadIdentityPoolNamespaceOwnerServiceArgs build() {
            return $;
        }
    }

}
