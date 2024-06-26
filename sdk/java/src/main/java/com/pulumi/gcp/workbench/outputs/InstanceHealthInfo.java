// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class InstanceHealthInfo {
    private InstanceHealthInfo() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceHealthInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(InstanceHealthInfo defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public InstanceHealthInfo build() {
            final var _resultValue = new InstanceHealthInfo();
            return _resultValue;
        }
    }
}
