// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterPscConfig {
    /**
     * @return Create an instance that allows connections from Private Service Connect endpoints to the instance.
     * 
     */
    private Boolean pscEnabled;

    private GetClusterPscConfig() {}
    /**
     * @return Create an instance that allows connections from Private Service Connect endpoints to the instance.
     * 
     */
    public Boolean pscEnabled() {
        return this.pscEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterPscConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean pscEnabled;
        public Builder() {}
        public Builder(GetClusterPscConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pscEnabled = defaults.pscEnabled;
        }

        @CustomType.Setter
        public Builder pscEnabled(Boolean pscEnabled) {
            if (pscEnabled == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConfig", "pscEnabled");
            }
            this.pscEnabled = pscEnabled;
            return this;
        }
        public GetClusterPscConfig build() {
            final var _resultValue = new GetClusterPscConfig();
            _resultValue.pscEnabled = pscEnabled;
            return _resultValue;
        }
    }
}
