// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuildv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionGitlabConfigServiceDirectoryConfig {
    /**
     * @return Required. The Service Directory service name. Format: projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    private String service;

    private ConnectionGitlabConfigServiceDirectoryConfig() {}
    /**
     * @return Required. The Service Directory service name. Format: projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionGitlabConfigServiceDirectoryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String service;
        public Builder() {}
        public Builder(ConnectionGitlabConfigServiceDirectoryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public ConnectionGitlabConfigServiceDirectoryConfig build() {
            final var o = new ConnectionGitlabConfigServiceDirectoryConfig();
            o.service = service;
            return o;
        }
    }
}