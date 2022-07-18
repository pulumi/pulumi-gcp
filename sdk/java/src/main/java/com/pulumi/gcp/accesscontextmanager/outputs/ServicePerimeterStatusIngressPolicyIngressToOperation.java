// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterStatusIngressPolicyIngressToOperation {
    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector> methodSelectors;
    /**
     * @return The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    private final @Nullable String serviceName;

    @CustomType.Constructor
    private ServicePerimeterStatusIngressPolicyIngressToOperation(
        @CustomType.Parameter("methodSelectors") @Nullable List<ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector> methodSelectors,
        @CustomType.Parameter("serviceName") @Nullable String serviceName) {
        this.methodSelectors = methodSelectors;
        this.serviceName = serviceName;
    }

    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector> methodSelectors() {
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

    public static Builder builder(ServicePerimeterStatusIngressPolicyIngressToOperation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector> methodSelectors;
        private @Nullable String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyIngressToOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodSelectors = defaults.methodSelectors;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder methodSelectors(@Nullable List<ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector> methodSelectors) {
            this.methodSelectors = methodSelectors;
            return this;
        }
        public Builder methodSelectors(ServicePerimeterStatusIngressPolicyIngressToOperationMethodSelector... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }        public ServicePerimeterStatusIngressPolicyIngressToOperation build() {
            return new ServicePerimeterStatusIngressPolicyIngressToOperation(methodSelectors, serviceName);
        }
    }
}