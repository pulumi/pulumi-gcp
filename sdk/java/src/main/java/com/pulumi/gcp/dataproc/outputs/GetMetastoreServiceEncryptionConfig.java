// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetastoreServiceEncryptionConfig {
    /**
     * @return The fully qualified customer provided Cloud KMS key name to use for customer data encryption.
     * Use the following format: &#39;projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)&#39;
     * 
     */
    private String kmsKey;

    private GetMetastoreServiceEncryptionConfig() {}
    /**
     * @return The fully qualified customer provided Cloud KMS key name to use for customer data encryption.
     * Use the following format: &#39;projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)&#39;
     * 
     */
    public String kmsKey() {
        return this.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreServiceEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKey;
        public Builder() {}
        public Builder(GetMetastoreServiceEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        @CustomType.Setter
        public Builder kmsKey(String kmsKey) {
            if (kmsKey == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceEncryptionConfig", "kmsKey");
            }
            this.kmsKey = kmsKey;
            return this;
        }
        public GetMetastoreServiceEncryptionConfig build() {
            final var _resultValue = new GetMetastoreServiceEncryptionConfig();
            _resultValue.kmsKey = kmsKey;
            return _resultValue;
        }
    }
}
