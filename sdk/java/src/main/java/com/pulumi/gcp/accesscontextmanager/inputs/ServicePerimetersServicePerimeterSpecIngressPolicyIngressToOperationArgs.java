// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs Empty = new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs();

    /**
     * API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    @Import(name="methodSelectors")
    private @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs>> methodSelectors;

    /**
     * @return API methods or permissions to allow. Method or permission must belong
     * to the service specified by `serviceName` field. A single MethodSelector
     * entry with `*` specified for the `method` field will allow all methods
     * AND permissions for the service specified in `serviceName`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs>>> methodSelectors() {
        return Optional.ofNullable(this.methodSelectors);
    }

    /**
     * The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the API whose methods or permissions the `IngressPolicy` or
     * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
     * field set to `*` will allow all methods AND permissions for all services.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs() {}

    private ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs $) {
        this.methodSelectors = $.methodSelectors;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs();
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs defaults) {
            $ = new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(@Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs>> methodSelectors) {
            $.methodSelectors = methodSelectors;
            return this;
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs> methodSelectors) {
            return methodSelectors(Output.of(methodSelectors));
        }

        /**
         * @param methodSelectors API methods or permissions to allow. Method or permission must belong
         * to the service specified by `serviceName` field. A single MethodSelector
         * entry with `*` specified for the `method` field will allow all methods
         * AND permissions for the service specified in `serviceName`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder methodSelectors(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationMethodSelectorArgs... methodSelectors) {
            return methodSelectors(List.of(methodSelectors));
        }

        /**
         * @param serviceName The name of the API whose methods or permissions the `IngressPolicy` or
         * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
         * field set to `*` will allow all methods AND permissions for all services.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API whose methods or permissions the `IngressPolicy` or
         * `EgressPolicy` want to allow. A single `ApiOperation` with serviceName
         * field set to `*` will allow all methods AND permissions for all services.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationArgs build() {
            return $;
        }
    }

}