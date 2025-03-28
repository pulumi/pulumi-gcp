// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpecEgressPolicy;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpecIngressPolicy;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServices;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterSpec {
    /**
     * @return A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    private @Nullable List<String> accessLevels;
    /**
     * @return List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServicePerimetersServicePerimeterSpecEgressPolicy> egressPolicies;
    /**
     * @return List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicy> ingressPolicies;
    /**
     * @return A list of GCP resources that are inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    private @Nullable List<String> resources;
    /**
     * @return GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter&#39;s access
     * restrictions.
     * 
     */
    private @Nullable List<String> restrictedServices;
    /**
     * @return Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    private @Nullable ServicePerimetersServicePerimeterSpecVpcAccessibleServices vpcAccessibleServices;

    private ServicePerimetersServicePerimeterSpec() {}
    /**
     * @return A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    public List<String> accessLevels() {
        return this.accessLevels == null ? List.of() : this.accessLevels;
    }
    /**
     * @return List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimetersServicePerimeterSpecEgressPolicy> egressPolicies() {
        return this.egressPolicies == null ? List.of() : this.egressPolicies;
    }
    /**
     * @return List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimetersServicePerimeterSpecIngressPolicy> ingressPolicies() {
        return this.ingressPolicies == null ? List.of() : this.ingressPolicies;
    }
    /**
     * @return A list of GCP resources that are inside of the service perimeter.
     * Currently only projects are allowed.
     * Format: projects/{project_number}
     * 
     */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter&#39;s access
     * restrictions.
     * 
     */
    public List<String> restrictedServices() {
        return this.restrictedServices == null ? List.of() : this.restrictedServices;
    }
    /**
     * @return Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimetersServicePerimeterSpecVpcAccessibleServices> vpcAccessibleServices() {
        return Optional.ofNullable(this.vpcAccessibleServices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accessLevels;
        private @Nullable List<ServicePerimetersServicePerimeterSpecEgressPolicy> egressPolicies;
        private @Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicy> ingressPolicies;
        private @Nullable List<String> resources;
        private @Nullable List<String> restrictedServices;
        private @Nullable ServicePerimetersServicePerimeterSpecVpcAccessibleServices vpcAccessibleServices;
        public Builder() {}
        public Builder(ServicePerimetersServicePerimeterSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        @CustomType.Setter
        public Builder accessLevels(@Nullable List<String> accessLevels) {

            this.accessLevels = accessLevels;
            return this;
        }
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }
        @CustomType.Setter
        public Builder egressPolicies(@Nullable List<ServicePerimetersServicePerimeterSpecEgressPolicy> egressPolicies) {

            this.egressPolicies = egressPolicies;
            return this;
        }
        public Builder egressPolicies(ServicePerimetersServicePerimeterSpecEgressPolicy... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }
        @CustomType.Setter
        public Builder ingressPolicies(@Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicy> ingressPolicies) {

            this.ingressPolicies = ingressPolicies;
            return this;
        }
        public Builder ingressPolicies(ServicePerimetersServicePerimeterSpecIngressPolicy... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
        }
        @CustomType.Setter
        public Builder resources(@Nullable List<String> resources) {

            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder restrictedServices(@Nullable List<String> restrictedServices) {

            this.restrictedServices = restrictedServices;
            return this;
        }
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }
        @CustomType.Setter
        public Builder vpcAccessibleServices(@Nullable ServicePerimetersServicePerimeterSpecVpcAccessibleServices vpcAccessibleServices) {

            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }
        public ServicePerimetersServicePerimeterSpec build() {
            final var _resultValue = new ServicePerimetersServicePerimeterSpec();
            _resultValue.accessLevels = accessLevels;
            _resultValue.egressPolicies = egressPolicies;
            _resultValue.ingressPolicies = ingressPolicies;
            _resultValue.resources = resources;
            _resultValue.restrictedServices = restrictedServices;
            _resultValue.vpcAccessibleServices = vpcAccessibleServices;
            return _resultValue;
        }
    }
}
