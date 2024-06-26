// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrustConfigTrustStoreTrustAnchorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrustConfigTrustStoreTrustAnchorArgs Empty = new TrustConfigTrustStoreTrustAnchorArgs();

    /**
     * PEM root certificate of the PKI used for validation.
     * Each certificate provided in PEM format may occupy up to 5kB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="pemCertificate")
    private @Nullable Output<String> pemCertificate;

    /**
     * @return PEM root certificate of the PKI used for validation.
     * Each certificate provided in PEM format may occupy up to 5kB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> pemCertificate() {
        return Optional.ofNullable(this.pemCertificate);
    }

    private TrustConfigTrustStoreTrustAnchorArgs() {}

    private TrustConfigTrustStoreTrustAnchorArgs(TrustConfigTrustStoreTrustAnchorArgs $) {
        this.pemCertificate = $.pemCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrustConfigTrustStoreTrustAnchorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrustConfigTrustStoreTrustAnchorArgs $;

        public Builder() {
            $ = new TrustConfigTrustStoreTrustAnchorArgs();
        }

        public Builder(TrustConfigTrustStoreTrustAnchorArgs defaults) {
            $ = new TrustConfigTrustStoreTrustAnchorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pemCertificate PEM root certificate of the PKI used for validation.
         * Each certificate provided in PEM format may occupy up to 5kB.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder pemCertificate(@Nullable Output<String> pemCertificate) {
            $.pemCertificate = pemCertificate;
            return this;
        }

        /**
         * @param pemCertificate PEM root certificate of the PKI used for validation.
         * Each certificate provided in PEM format may occupy up to 5kB.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder pemCertificate(String pemCertificate) {
            return pemCertificate(Output.of(pemCertificate));
        }

        public TrustConfigTrustStoreTrustAnchorArgs build() {
            return $;
        }
    }

}
