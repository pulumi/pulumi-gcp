// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig {
    /**
     * @return Specified if fleet logging feature is enabled. Possible values: [&#34;MODE_UNSPECIFIED&#34;, &#34;COPY&#34;, &#34;MOVE&#34;]
     * 
     */
    private String mode;

    private GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig() {}
    /**
     * @return Specified if fleet logging feature is enabled. Possible values: [&#34;MODE_UNSPECIFIED&#34;, &#34;COPY&#34;, &#34;MOVE&#34;]
     * 
     */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        public Builder() {}
        public Builder(GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig", "mode");
            }
            this.mode = mode;
            return this;
        }
        public GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig build() {
            final var _resultValue = new GetFeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfig();
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}
