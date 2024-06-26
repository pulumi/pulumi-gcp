// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration {
    /**
     * @return Whether or not Cloud Data Lineage integration is enabled.
     * 
     */
    private Boolean enabled;

    private GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration() {}
    /**
     * @return Whether or not Cloud Data Lineage integration is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration build() {
            final var _resultValue = new GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
