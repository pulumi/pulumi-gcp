// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecEgressPolicyEgressFrom;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecEgressPolicyEgressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterSpecEgressPolicy {
    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom;
    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo;

    @CustomType.Constructor
    private ServicePerimeterSpecEgressPolicy(
        @CustomType.Parameter("egressFrom") @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom,
        @CustomType.Parameter("egressTo") @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimeterSpecEgressPolicyEgressFrom> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }
    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<ServicePerimeterSpecEgressPolicyEgressTo> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom;
        private @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }
        public Builder egressTo(@Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo) {
            this.egressTo = egressTo;
            return this;
        }        public ServicePerimeterSpecEgressPolicy build() {
            return new ServicePerimeterSpecEgressPolicy(egressFrom, egressTo);
        }
    }
}