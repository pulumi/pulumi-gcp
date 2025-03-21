// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs Empty = new WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs();

    /**
     * PEM certificate of the PKI used for validation. Must only contain one
     * ca certificate(either root or intermediate cert).
     * 
     */
    @Import(name="pemCertificate")
    private @Nullable Output<String> pemCertificate;

    /**
     * @return PEM certificate of the PKI used for validation. Must only contain one
     * ca certificate(either root or intermediate cert).
     * 
     */
    public Optional<Output<String>> pemCertificate() {
        return Optional.ofNullable(this.pemCertificate);
    }

    private WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs() {}

    private WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs(WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs $) {
        this.pemCertificate = $.pemCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs $;

        public Builder() {
            $ = new WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs();
        }

        public Builder(WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs defaults) {
            $ = new WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pemCertificate PEM certificate of the PKI used for validation. Must only contain one
         * ca certificate(either root or intermediate cert).
         * 
         * @return builder
         * 
         */
        public Builder pemCertificate(@Nullable Output<String> pemCertificate) {
            $.pemCertificate = pemCertificate;
            return this;
        }

        /**
         * @param pemCertificate PEM certificate of the PKI used for validation. Must only contain one
         * ca certificate(either root or intermediate cert).
         * 
         * @return builder
         * 
         */
        public Builder pemCertificate(String pemCertificate) {
            return pemCertificate(Output.of(pemCertificate));
        }

        public WorkloadIdentityPoolProviderX509TrustStoreTrustAnchorArgs build() {
            return $;
        }
    }

}
