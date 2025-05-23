// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressFromArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusEgressPolicyEgressToArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyArgs Empty = new ServicePerimeterStatusEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom;

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterStatusEgressPolicyEgressFromArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterStatusEgressPolicyEgressToArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    /**
     * Human readable title. Must be unique within the perimeter. Does not affect behavior.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Human readable title. Must be unique within the perimeter. Does not affect behavior.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private ServicePerimeterStatusEgressPolicyArgs() {}

    private ServicePerimeterStatusEgressPolicyArgs(ServicePerimeterStatusEgressPolicyArgs $) {
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterStatusEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterStatusEgressPolicyArgs $;

        public Builder() {
            $ = new ServicePerimeterStatusEgressPolicyArgs();
        }

        public Builder(ServicePerimeterStatusEgressPolicyArgs defaults) {
            $ = new ServicePerimeterStatusEgressPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(@Nullable Output<ServicePerimeterStatusEgressPolicyEgressFromArgs> egressFrom) {
            $.egressFrom = egressFrom;
            return this;
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(ServicePerimeterStatusEgressPolicyEgressFromArgs egressFrom) {
            return egressFrom(Output.of(egressFrom));
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(@Nullable Output<ServicePerimeterStatusEgressPolicyEgressToArgs> egressTo) {
            $.egressTo = egressTo;
            return this;
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(ServicePerimeterStatusEgressPolicyEgressToArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        /**
         * @param title Human readable title. Must be unique within the perimeter. Does not affect behavior.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Human readable title. Must be unique within the perimeter. Does not affect behavior.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ServicePerimeterStatusEgressPolicyArgs build() {
            return $;
        }
    }

}
