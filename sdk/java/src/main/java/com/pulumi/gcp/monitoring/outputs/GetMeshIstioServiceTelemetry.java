// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMeshIstioServiceTelemetry {
    /**
     * @return The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    private String resourceName;

    private GetMeshIstioServiceTelemetry() {}
    /**
     * @return The full name of the resource that defines this service.
     * Formatted as described in
     * https://cloud.google.com/apis/design/resource_names.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshIstioServiceTelemetry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceName;
        public Builder() {}
        public Builder(GetMeshIstioServiceTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            if (resourceName == null) {
              throw new MissingRequiredPropertyException("GetMeshIstioServiceTelemetry", "resourceName");
            }
            this.resourceName = resourceName;
            return this;
        }
        public GetMeshIstioServiceTelemetry build() {
            final var _resultValue = new GetMeshIstioServiceTelemetry();
            _resultValue.resourceName = resourceName;
            return _resultValue;
        }
    }
}
