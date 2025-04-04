// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterStatusIngressPolicy {
    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo;
    /**
     * @return Human readable title. Must be unique within the perimeter. Does not affect behavior.
     * 
     */
    private @Nullable String title;

    private ServicePerimetersServicePerimeterStatusIngressPolicy() {}
    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom> ingressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }
    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo> ingressTo() {
        return Optional.ofNullable(this.ingressTo);
    }
    /**
     * @return Human readable title. Must be unique within the perimeter. Does not affect behavior.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
        private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo;
        private @Nullable String title;
        public Builder() {}
        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder ingressFrom(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom) {

            this.ingressFrom = ingressFrom;
            return this;
        }
        @CustomType.Setter
        public Builder ingressTo(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo) {

            this.ingressTo = ingressTo;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusIngressPolicy build() {
            final var _resultValue = new ServicePerimetersServicePerimeterStatusIngressPolicy();
            _resultValue.ingressFrom = ingressFrom;
            _resultValue.ingressTo = ingressTo;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
