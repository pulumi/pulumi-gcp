// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitialUser {
    /**
     * @return The initial password for the user.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private String password;
    /**
     * @return The database username.
     * 
     */
    private @Nullable String user;

    private ClusterInitialUser() {}
    /**
     * @return The initial password for the user.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The database username.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitialUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private @Nullable String user;
        public Builder() {}
        public Builder(ClusterInitialUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("ClusterInitialUser", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public ClusterInitialUser build() {
            final var _resultValue = new ClusterInitialUser();
            _resultValue.password = password;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
