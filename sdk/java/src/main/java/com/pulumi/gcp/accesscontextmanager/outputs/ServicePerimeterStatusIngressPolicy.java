// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicyIngressFrom;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterStatusIngressPolicyIngressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterStatusIngressPolicy {
    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo;

    @CustomType.Constructor
    private ServicePerimeterStatusIngressPolicy(
        @CustomType.Parameter("ingressFrom") @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom,
        @CustomType.Parameter("ingressTo") @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimeterStatusIngressPolicyIngressFrom> ingressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }
    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimeterStatusIngressPolicyIngressTo> ingressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
        private @Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable ServicePerimeterStatusIngressPolicyIngressFrom ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }
        public Builder ingressTo(@Nullable ServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }        public ServicePerimeterStatusIngressPolicy build() {
            return new ServicePerimeterStatusIngressPolicy(ingressFrom, ingressTo);
        }
    }
}