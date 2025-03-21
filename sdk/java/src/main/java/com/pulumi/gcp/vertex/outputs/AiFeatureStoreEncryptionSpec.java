// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AiFeatureStoreEncryptionSpec {
    /**
     * @return The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the compute resource is created.
     * 
     */
    private String kmsKeyName;

    private AiFeatureStoreEncryptionSpec() {}
    /**
     * @return The Cloud KMS resource identifier of the customer managed encryption key used to protect a resource. Has the form: projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key. The key needs to be in the same region as where the compute resource is created.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreEncryptionSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        public Builder() {}
        public Builder(AiFeatureStoreEncryptionSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("AiFeatureStoreEncryptionSpec", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public AiFeatureStoreEncryptionSpec build() {
            final var _resultValue = new AiFeatureStoreEncryptionSpec();
            _resultValue.kmsKeyName = kmsKeyName;
            return _resultValue;
        }
    }
}
