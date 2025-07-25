// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CxToolOpenApiSpecTlsConfigCaCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxToolOpenApiSpecTlsConfigCaCertArgs Empty = new CxToolOpenApiSpecTlsConfigCaCertArgs();

    /**
     * The allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store.
     * If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates.
     * N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;.
     * For instance a certificate can be self-signed using the following command:
     * 
     * A base64-encoded string.
     * 
     */
    @Import(name="cert", required=true)
    private Output<String> cert;

    /**
     * @return The allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store.
     * If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates.
     * N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;.
     * For instance a certificate can be self-signed using the following command:
     * 
     * A base64-encoded string.
     * 
     */
    public Output<String> cert() {
        return this.cert;
    }

    /**
     * The name of the allowed custom CA certificates. This can be used to disambiguate the custom CA certificates.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the allowed custom CA certificates. This can be used to disambiguate the custom CA certificates.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    private CxToolOpenApiSpecTlsConfigCaCertArgs() {}

    private CxToolOpenApiSpecTlsConfigCaCertArgs(CxToolOpenApiSpecTlsConfigCaCertArgs $) {
        this.cert = $.cert;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxToolOpenApiSpecTlsConfigCaCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxToolOpenApiSpecTlsConfigCaCertArgs $;

        public Builder() {
            $ = new CxToolOpenApiSpecTlsConfigCaCertArgs();
        }

        public Builder(CxToolOpenApiSpecTlsConfigCaCertArgs defaults) {
            $ = new CxToolOpenApiSpecTlsConfigCaCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cert The allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store.
         * If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates.
         * N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;.
         * For instance a certificate can be self-signed using the following command:
         * 
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder cert(Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert The allowed custom CA certificates (in DER format) for HTTPS verification. This overrides the default SSL trust store.
         * If this is empty or unspecified, Dialogflow will use Google&#39;s default trust store to verify certificates.
         * N.B. Make sure the HTTPS server certificates are signed with &#34;subject alt name&#34;.
         * For instance a certificate can be self-signed using the following command:
         * 
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param displayName The name of the allowed custom CA certificates. This can be used to disambiguate the custom CA certificates.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the allowed custom CA certificates. This can be used to disambiguate the custom CA certificates.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public CxToolOpenApiSpecTlsConfigCaCertArgs build() {
            if ($.cert == null) {
                throw new MissingRequiredPropertyException("CxToolOpenApiSpecTlsConfigCaCertArgs", "cert");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("CxToolOpenApiSpecTlsConfigCaCertArgs", "displayName");
            }
            return $;
        }
    }

}
