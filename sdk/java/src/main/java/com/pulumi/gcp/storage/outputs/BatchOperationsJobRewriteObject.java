// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BatchOperationsJobRewriteObject {
    /**
     * @return valid kms key
     * 
     */
    private String kmsKey;

    private BatchOperationsJobRewriteObject() {}
    /**
     * @return valid kms key
     * 
     */
    public String kmsKey() {
        return this.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchOperationsJobRewriteObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKey;
        public Builder() {}
        public Builder(BatchOperationsJobRewriteObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        @CustomType.Setter
        public Builder kmsKey(String kmsKey) {
            if (kmsKey == null) {
              throw new MissingRequiredPropertyException("BatchOperationsJobRewriteObject", "kmsKey");
            }
            this.kmsKey = kmsKey;
            return this;
        }
        public BatchOperationsJobRewriteObject build() {
            final var _resultValue = new BatchOperationsJobRewriteObject();
            _resultValue.kmsKey = kmsKey;
            return _resultValue;
        }
    }
}
