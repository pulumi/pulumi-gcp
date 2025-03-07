// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation {
    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector> methodSelectors;
    /**
     * @return The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    private @Nullable String serviceName;

    private ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation() {}
    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector> methodSelectors() {
        return this.methodSelectors == null ? List.of() : this.methodSelectors;
    }
    /**
     * @return The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector> methodSelectors;
        private @Nullable String serviceName;
        public Builder() {}
        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder methodSelectors(@Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector> methodSelectors) {

            this.methodSelectors = methodSelectors;
            return this;
        }
        public Builder methodSelectors(ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperationMethodSelector... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }
        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {

            this.serviceName = serviceName;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation build() {
            final var _resultValue = new ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation();
            _resultValue.methodSelectors = methodSelectors;
            _resultValue.serviceName = serviceName;
            return _resultValue;
        }
    }
}
