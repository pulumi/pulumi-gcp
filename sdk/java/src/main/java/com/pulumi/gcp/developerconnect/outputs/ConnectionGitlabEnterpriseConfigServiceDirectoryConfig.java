// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.developerconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionGitlabEnterpriseConfigServiceDirectoryConfig {
    /**
     * @return Required. The Service Directory service name.
     * Format:
     * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    private String service;

    private ConnectionGitlabEnterpriseConfigServiceDirectoryConfig() {}
    /**
     * @return Required. The Service Directory service name.
     * Format:
     * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGitlabEnterpriseConfigServiceDirectoryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String service;
        public Builder() {}
        public Builder(ConnectionGitlabEnterpriseConfigServiceDirectoryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("ConnectionGitlabEnterpriseConfigServiceDirectoryConfig", "service");
            }
            this.service = service;
            return this;
        }
        public ConnectionGitlabEnterpriseConfigServiceDirectoryConfig build() {
            final var _resultValue = new ConnectionGitlabEnterpriseConfigServiceDirectoryConfig();
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
