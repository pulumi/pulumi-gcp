// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AddonsConfigAddonsConfigAdvancedApiOpsConfig {
    /**
     * @return Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
     */
    private @Nullable Boolean enabled;

    private AddonsConfigAddonsConfigAdvancedApiOpsConfig() {}
    /**
     * @return Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonsConfigAddonsConfigAdvancedApiOpsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(AddonsConfigAddonsConfigAdvancedApiOpsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public AddonsConfigAddonsConfigAdvancedApiOpsConfig build() {
            final var o = new AddonsConfigAddonsConfigAdvancedApiOpsConfig();
            o.enabled = enabled;
            return o;
        }
    }
}