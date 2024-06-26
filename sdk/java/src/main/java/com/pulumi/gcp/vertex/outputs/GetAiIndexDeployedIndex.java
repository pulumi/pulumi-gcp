// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAiIndexDeployedIndex {
    /**
     * @return The ID of the DeployedIndex in the above IndexEndpoint.
     * 
     */
    private String deployedIndexId;
    /**
     * @return A resource name of the IndexEndpoint.
     * 
     */
    private String indexEndpoint;

    private GetAiIndexDeployedIndex() {}
    /**
     * @return The ID of the DeployedIndex in the above IndexEndpoint.
     * 
     */
    public String deployedIndexId() {
        return this.deployedIndexId;
    }
    /**
     * @return A resource name of the IndexEndpoint.
     * 
     */
    public String indexEndpoint() {
        return this.indexEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAiIndexDeployedIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deployedIndexId;
        private String indexEndpoint;
        public Builder() {}
        public Builder(GetAiIndexDeployedIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedIndexId = defaults.deployedIndexId;
    	      this.indexEndpoint = defaults.indexEndpoint;
        }

        @CustomType.Setter
        public Builder deployedIndexId(String deployedIndexId) {
            if (deployedIndexId == null) {
              throw new MissingRequiredPropertyException("GetAiIndexDeployedIndex", "deployedIndexId");
            }
            this.deployedIndexId = deployedIndexId;
            return this;
        }
        @CustomType.Setter
        public Builder indexEndpoint(String indexEndpoint) {
            if (indexEndpoint == null) {
              throw new MissingRequiredPropertyException("GetAiIndexDeployedIndex", "indexEndpoint");
            }
            this.indexEndpoint = indexEndpoint;
            return this;
        }
        public GetAiIndexDeployedIndex build() {
            final var _resultValue = new GetAiIndexDeployedIndex();
            _resultValue.deployedIndexId = deployedIndexId;
            _resultValue.indexEndpoint = indexEndpoint;
            return _resultValue;
        }
    }
}
