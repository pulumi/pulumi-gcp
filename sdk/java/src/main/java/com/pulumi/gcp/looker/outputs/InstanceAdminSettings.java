// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.looker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InstanceAdminSettings {
    private @Nullable List<String> allowedEmailDomains;

    private InstanceAdminSettings() {}
    public List<String> allowedEmailDomains() {
        return this.allowedEmailDomains == null ? List.of() : this.allowedEmailDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAdminSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedEmailDomains;
        public Builder() {}
        public Builder(InstanceAdminSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedEmailDomains = defaults.allowedEmailDomains;
        }

        @CustomType.Setter
        public Builder allowedEmailDomains(@Nullable List<String> allowedEmailDomains) {
            this.allowedEmailDomains = allowedEmailDomains;
            return this;
        }
        public Builder allowedEmailDomains(String... allowedEmailDomains) {
            return allowedEmailDomains(List.of(allowedEmailDomains));
        }
        public InstanceAdminSettings build() {
            final var o = new InstanceAdminSettings();
            o.allowedEmailDomains = allowedEmailDomains;
            return o;
        }
    }
}