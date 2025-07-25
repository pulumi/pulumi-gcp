// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterEgressPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterEgressPolicyState Empty = new ServicePerimeterEgressPolicyState();

    /**
     * The name of the Access Policy this resource belongs to.
     * 
     */
    @Import(name="accessPolicyId")
    private @Nullable Output<String> accessPolicyId;

    /**
     * @return The name of the Access Policy this resource belongs to.
     * 
     */
    public Optional<Output<String>> accessPolicyId() {
        return Optional.ofNullable(this.accessPolicyId);
    }

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimeterEgressPolicyEgressFromArgs> egressFrom;

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterEgressPolicyEgressFromArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimeterEgressPolicyEgressToArgs> egressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterEgressPolicyEgressToArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    /**
     * The perimeter etag is internally used to prevent overwriting the list of policies on PATCH calls. It is retrieved from the same GET perimeter API call that&#39;s used to get the current list of policies. The policy defined in this resource is added or removed from that list, and then this etag is sent with the PATCH call along with the updated policies.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The perimeter etag is internally used to prevent overwriting the list of policies on PATCH calls. It is retrieved from the same GET perimeter API call that&#39;s used to get the current list of policies. The policy defined in this resource is added or removed from that list, and then this etag is sent with the PATCH call along with the updated policies.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     */
    @Import(name="perimeter")
    private @Nullable Output<String> perimeter;

    /**
     * @return The name of the Service Perimeter to add this resource to.
     * 
     */
    public Optional<Output<String>> perimeter() {
        return Optional.ofNullable(this.perimeter);
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

    private ServicePerimeterEgressPolicyState() {}

    private ServicePerimeterEgressPolicyState(ServicePerimeterEgressPolicyState $) {
        this.accessPolicyId = $.accessPolicyId;
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
        this.etag = $.etag;
        this.perimeter = $.perimeter;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterEgressPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterEgressPolicyState $;

        public Builder() {
            $ = new ServicePerimeterEgressPolicyState();
        }

        public Builder(ServicePerimeterEgressPolicyState defaults) {
            $ = new ServicePerimeterEgressPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyId The name of the Access Policy this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyId(@Nullable Output<String> accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        /**
         * @param accessPolicyId The name of the Access Policy this resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyId(String accessPolicyId) {
            return accessPolicyId(Output.of(accessPolicyId));
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(@Nullable Output<ServicePerimeterEgressPolicyEgressFromArgs> egressFrom) {
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
        public Builder egressFrom(ServicePerimeterEgressPolicyEgressFromArgs egressFrom) {
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
        public Builder egressTo(@Nullable Output<ServicePerimeterEgressPolicyEgressToArgs> egressTo) {
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
        public Builder egressTo(ServicePerimeterEgressPolicyEgressToArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        /**
         * @param etag The perimeter etag is internally used to prevent overwriting the list of policies on PATCH calls. It is retrieved from the same GET perimeter API call that&#39;s used to get the current list of policies. The policy defined in this resource is added or removed from that list, and then this etag is sent with the PATCH call along with the updated policies.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The perimeter etag is internally used to prevent overwriting the list of policies on PATCH calls. It is retrieved from the same GET perimeter API call that&#39;s used to get the current list of policies. The policy defined in this resource is added or removed from that list, and then this etag is sent with the PATCH call along with the updated policies.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param perimeter The name of the Service Perimeter to add this resource to.
         * 
         * @return builder
         * 
         */
        public Builder perimeter(@Nullable Output<String> perimeter) {
            $.perimeter = perimeter;
            return this;
        }

        /**
         * @param perimeter The name of the Service Perimeter to add this resource to.
         * 
         * @return builder
         * 
         */
        public Builder perimeter(String perimeter) {
            return perimeter(Output.of(perimeter));
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

        public ServicePerimeterEgressPolicyState build() {
            return $;
        }
    }

}
