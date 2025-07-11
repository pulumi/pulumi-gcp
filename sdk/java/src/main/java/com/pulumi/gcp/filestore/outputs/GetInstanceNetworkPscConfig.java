// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkPscConfig {
    /**
     * @return Consumer service project in which the Private Service Connect endpoint
     * would be set up. This is optional, and only relevant in case the network
     * is a shared VPC. If this is not specified, the endpoint would be set up
     * in the VPC host project.
     * 
     */
    private String endpointProject;

    private GetInstanceNetworkPscConfig() {}
    /**
     * @return Consumer service project in which the Private Service Connect endpoint
     * would be set up. This is optional, and only relevant in case the network
     * is a shared VPC. If this is not specified, the endpoint would be set up
     * in the VPC host project.
     * 
     */
    public String endpointProject() {
        return this.endpointProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkPscConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointProject;
        public Builder() {}
        public Builder(GetInstanceNetworkPscConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointProject = defaults.endpointProject;
        }

        @CustomType.Setter
        public Builder endpointProject(String endpointProject) {
            if (endpointProject == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetworkPscConfig", "endpointProject");
            }
            this.endpointProject = endpointProject;
            return this;
        }
        public GetInstanceNetworkPscConfig build() {
            final var _resultValue = new GetInstanceNetworkPscConfig();
            _resultValue.endpointProject = endpointProject;
            return _resultValue;
        }
    }
}
