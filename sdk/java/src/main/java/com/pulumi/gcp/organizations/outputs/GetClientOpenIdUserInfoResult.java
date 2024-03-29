// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientOpenIdUserInfoResult {
    /**
     * @return The email of the account used by the provider to authenticate with GCP.
     * 
     */
    private String email;
    private String id;

    private GetClientOpenIdUserInfoResult() {}
    /**
     * @return The email of the account used by the provider to authenticate with GCP.
     * 
     */
    public String email() {
        return this.email;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientOpenIdUserInfoResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        public Builder() {}
        public Builder(GetClientOpenIdUserInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetClientOpenIdUserInfoResult", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClientOpenIdUserInfoResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetClientOpenIdUserInfoResult build() {
            final var _resultValue = new GetClientOpenIdUserInfoResult();
            _resultValue.email = email;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
