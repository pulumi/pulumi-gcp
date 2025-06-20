// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.diagflow.inputs.CxToolOpenApiSpecTlsConfigCaCertArgs;
import java.util.List;
import java.util.Objects;


public final class CxToolOpenApiSpecTlsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxToolOpenApiSpecTlsConfigArgs Empty = new CxToolOpenApiSpecTlsConfigArgs();

    /**
     * Specifies a list of allowed custom CA certificates for HTTPS verification.
     * Structure is documented below.
     * 
     */
    @Import(name="caCerts", required=true)
    private Output<List<CxToolOpenApiSpecTlsConfigCaCertArgs>> caCerts;

    /**
     * @return Specifies a list of allowed custom CA certificates for HTTPS verification.
     * Structure is documented below.
     * 
     */
    public Output<List<CxToolOpenApiSpecTlsConfigCaCertArgs>> caCerts() {
        return this.caCerts;
    }

    private CxToolOpenApiSpecTlsConfigArgs() {}

    private CxToolOpenApiSpecTlsConfigArgs(CxToolOpenApiSpecTlsConfigArgs $) {
        this.caCerts = $.caCerts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxToolOpenApiSpecTlsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxToolOpenApiSpecTlsConfigArgs $;

        public Builder() {
            $ = new CxToolOpenApiSpecTlsConfigArgs();
        }

        public Builder(CxToolOpenApiSpecTlsConfigArgs defaults) {
            $ = new CxToolOpenApiSpecTlsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(Output<List<CxToolOpenApiSpecTlsConfigCaCertArgs>> caCerts) {
            $.caCerts = caCerts;
            return this;
        }

        /**
         * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(List<CxToolOpenApiSpecTlsConfigCaCertArgs> caCerts) {
            return caCerts(Output.of(caCerts));
        }

        /**
         * @param caCerts Specifies a list of allowed custom CA certificates for HTTPS verification.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caCerts(CxToolOpenApiSpecTlsConfigCaCertArgs... caCerts) {
            return caCerts(List.of(caCerts));
        }

        public CxToolOpenApiSpecTlsConfigArgs build() {
            if ($.caCerts == null) {
                throw new MissingRequiredPropertyException("CxToolOpenApiSpecTlsConfigArgs", "caCerts");
            }
            return $;
        }
    }

}
