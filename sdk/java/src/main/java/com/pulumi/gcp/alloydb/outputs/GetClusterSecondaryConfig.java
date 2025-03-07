// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterSecondaryConfig {
    /**
     * @return Name of the primary cluster must be in the format
     * &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    private String primaryClusterName;

    private GetClusterSecondaryConfig() {}
    /**
     * @return Name of the primary cluster must be in the format
     * &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    public String primaryClusterName() {
        return this.primaryClusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterSecondaryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String primaryClusterName;
        public Builder() {}
        public Builder(GetClusterSecondaryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryClusterName = defaults.primaryClusterName;
        }

        @CustomType.Setter
        public Builder primaryClusterName(String primaryClusterName) {
            if (primaryClusterName == null) {
              throw new MissingRequiredPropertyException("GetClusterSecondaryConfig", "primaryClusterName");
            }
            this.primaryClusterName = primaryClusterName;
            return this;
        }
        public GetClusterSecondaryConfig build() {
            final var _resultValue = new GetClusterSecondaryConfig();
            _resultValue.primaryClusterName = primaryClusterName;
            return _resultValue;
        }
    }
}
