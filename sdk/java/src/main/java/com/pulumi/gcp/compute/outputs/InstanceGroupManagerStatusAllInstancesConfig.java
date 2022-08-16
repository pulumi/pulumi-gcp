// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceGroupManagerStatusAllInstancesConfig {
    private final @Nullable Boolean effective;

    @CustomType.Constructor
    private InstanceGroupManagerStatusAllInstancesConfig(@CustomType.Parameter("effective") @Nullable Boolean effective) {
        this.effective = effective;
    }

    public Optional<Boolean> effective() {
        return Optional.ofNullable(this.effective);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusAllInstancesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean effective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusAllInstancesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effective = defaults.effective;
        }

        public Builder effective(@Nullable Boolean effective) {
            this.effective = effective;
            return this;
        }        public InstanceGroupManagerStatusAllInstancesConfig build() {
            return new InstanceGroupManagerStatusAllInstancesConfig(effective);
        }
    }
}