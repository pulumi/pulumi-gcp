// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs Empty = new CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @Import(name="objectIdPaths")
    private @Nullable Output<List<Integer>> objectIdPaths;

    /**
     * @return An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    public Optional<Output<List<Integer>>> objectIdPaths() {
        return Optional.ofNullable(this.objectIdPaths);
    }

    private CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs() {}

    private CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs(CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs $) {
        this.objectIdPaths = $.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs();
        }

        public Builder(CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs defaults) {
            $ = new CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(@Nullable Output<List<Integer>> objectIdPaths) {
            $.objectIdPaths = objectIdPaths;
            return this;
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            return objectIdPaths(Output.of(objectIdPaths));
        }

        /**
         * @param objectIdPaths An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
         * 
         * @return builder
         * 
         */
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }

        public CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs build() {
            return $;
        }
    }

}