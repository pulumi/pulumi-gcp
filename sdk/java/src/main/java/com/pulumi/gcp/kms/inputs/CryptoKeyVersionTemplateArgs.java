// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyVersionTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionTemplateArgs Empty = new CryptoKeyVersionTemplateArgs();

    /**
     * The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    @Import(name="algorithm", required=true)
    private Output<String> algorithm;

    /**
     * @return The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }

    /**
     * The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
     * 
     */
    @Import(name="protectionLevel")
    private @Nullable Output<String> protectionLevel;

    /**
     * @return The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
     * 
     */
    public Optional<Output<String>> protectionLevel() {
        return Optional.ofNullable(this.protectionLevel);
    }

    private CryptoKeyVersionTemplateArgs() {}

    private CryptoKeyVersionTemplateArgs(CryptoKeyVersionTemplateArgs $) {
        this.algorithm = $.algorithm;
        this.protectionLevel = $.protectionLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyVersionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyVersionTemplateArgs $;

        public Builder() {
            $ = new CryptoKeyVersionTemplateArgs();
        }

        public Builder(CryptoKeyVersionTemplateArgs defaults) {
            $ = new CryptoKeyVersionTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The algorithm to use when creating a version based on this template.
         * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The algorithm to use when creating a version based on this template.
         * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param protectionLevel The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(@Nullable Output<String> protectionLevel) {
            $.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * @param protectionLevel The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(String protectionLevel) {
            return protectionLevel(Output.of(protectionLevel));
        }

        public CryptoKeyVersionTemplateArgs build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            return $;
        }
    }

}