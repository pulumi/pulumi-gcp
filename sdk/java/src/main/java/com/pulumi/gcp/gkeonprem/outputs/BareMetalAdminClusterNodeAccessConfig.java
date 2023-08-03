// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalAdminClusterNodeAccessConfig {
    /**
     * @return LoginUser is the user name used to access node machines.
     * It defaults to &#34;root&#34; if not set.
     * 
     */
    private @Nullable String loginUser;

    private BareMetalAdminClusterNodeAccessConfig() {}
    /**
     * @return LoginUser is the user name used to access node machines.
     * It defaults to &#34;root&#34; if not set.
     * 
     */
    public Optional<String> loginUser() {
        return Optional.ofNullable(this.loginUser);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterNodeAccessConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String loginUser;
        public Builder() {}
        public Builder(BareMetalAdminClusterNodeAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUser = defaults.loginUser;
        }

        @CustomType.Setter
        public Builder loginUser(@Nullable String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public BareMetalAdminClusterNodeAccessConfig build() {
            final var o = new BareMetalAdminClusterNodeAccessConfig();
            o.loginUser = loginUser;
            return o;
        }
    }
}