// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.privilegedaccessmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class EntitlementRequesterJustificationConfigUnstructured {
    private EntitlementRequesterJustificationConfigUnstructured() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntitlementRequesterJustificationConfigUnstructured defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(EntitlementRequesterJustificationConfigUnstructured defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public EntitlementRequesterJustificationConfigUnstructured build() {
            final var _resultValue = new EntitlementRequesterJustificationConfigUnstructured();
            return _resultValue;
        }
    }
}
