// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RegistryCredential {
    /**
     * @return A public key certificate format and data.
     * 
     */
    private Map<String,Object> publicKeyCertificate;

    private RegistryCredential() {}
    /**
     * @return A public key certificate format and data.
     * 
     */
    public Map<String,Object> publicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> publicKeyCertificate;
        public Builder() {}
        public Builder(RegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        @CustomType.Setter
        public Builder publicKeyCertificate(Map<String,Object> publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }
        public RegistryCredential build() {
            final var o = new RegistryCredential();
            o.publicKeyCertificate = publicKeyCertificate;
            return o;
        }
    }
}