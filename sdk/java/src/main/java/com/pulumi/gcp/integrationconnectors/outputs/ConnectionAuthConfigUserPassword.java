// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionAuthConfigUserPasswordPassword;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthConfigUserPassword {
    /**
     * @return Password for Authentication.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectionAuthConfigUserPasswordPassword password;
    /**
     * @return Username for Authentication.
     * 
     */
    private String username;

    private ConnectionAuthConfigUserPassword() {}
    /**
     * @return Password for Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectionAuthConfigUserPasswordPassword> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Username for Authentication.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthConfigUserPassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectionAuthConfigUserPasswordPassword password;
        private String username;
        public Builder() {}
        public Builder(ConnectionAuthConfigUserPassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(@Nullable ConnectionAuthConfigUserPasswordPassword password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ConnectionAuthConfigUserPassword build() {
            final var o = new ConnectionAuthConfigUserPassword();
            o.password = password;
            o.username = username;
            return o;
        }
    }
}