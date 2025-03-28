// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.developerconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs Empty = new ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs();

    /**
     * Required. The Service Directory service name.
     * Format:
     * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Required. The Service Directory service name.
     * Format:
     * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs() {}

    private ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs(ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs $) {
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs $;

        public Builder() {
            $ = new ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs();
        }

        public Builder(ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs defaults) {
            $ = new ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param service Required. The Service Directory service name.
         * Format:
         * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Required. The Service Directory service name.
         * Format:
         * projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs build() {
            if ($.service == null) {
                throw new MissingRequiredPropertyException("ConnectionGitlabEnterpriseConfigServiceDirectoryConfigArgs", "service");
            }
            return $;
        }
    }

}
