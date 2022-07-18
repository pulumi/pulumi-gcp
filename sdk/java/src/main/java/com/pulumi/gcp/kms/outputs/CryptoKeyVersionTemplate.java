// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoKeyVersionTemplate {
    /**
     * @return The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    private final String algorithm;
    /**
     * @return The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
     * 
     */
    private final @Nullable String protectionLevel;

    @CustomType.Constructor
    private CryptoKeyVersionTemplate(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("protectionLevel") @Nullable String protectionLevel) {
        this.algorithm = algorithm;
        this.protectionLevel = protectionLevel;
    }

    /**
     * @return The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return The protection level to use when creating a version based on this template. Possible values include &#34;SOFTWARE&#34;, &#34;HSM&#34;, &#34;EXTERNAL&#34;. Defaults to &#34;SOFTWARE&#34;.
     * 
     */
    public Optional<String> protectionLevel() {
        return Optional.ofNullable(this.protectionLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private @Nullable String protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder protectionLevel(@Nullable String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }        public CryptoKeyVersionTemplate build() {
            return new CryptoKeyVersionTemplate(algorithm, protectionLevel);
        }
    }
}