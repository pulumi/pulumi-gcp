// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork {
    private String expirationTime;
    private String name;
    private String value;

    private GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork() {}
    public String expirationTime() {
        return this.expirationTime;
    }
    public String name() {
        return this.name;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expirationTime;
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expirationTime(String expirationTime) {
            if (expirationTime == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork", "expirationTime");
            }
            this.expirationTime = expirationTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork", "value");
            }
            this.value = value;
            return this;
        }
        public GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork build() {
            final var _resultValue = new GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork();
            _resultValue.expirationTime = expirationTime;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
