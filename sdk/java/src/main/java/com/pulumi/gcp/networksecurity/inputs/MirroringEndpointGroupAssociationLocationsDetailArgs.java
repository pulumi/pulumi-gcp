// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MirroringEndpointGroupAssociationLocationsDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final MirroringEndpointGroupAssociationLocationsDetailArgs Empty = new MirroringEndpointGroupAssociationLocationsDetailArgs();

    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringEndpointGroupAssociation`.
     * 
     * ***
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringEndpointGroupAssociation`.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * (Output)
     * Output only. The association state in this location.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * OUT_OF_SYNC
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * Output only. The association state in this location.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * OUT_OF_SYNC
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private MirroringEndpointGroupAssociationLocationsDetailArgs() {}

    private MirroringEndpointGroupAssociationLocationsDetailArgs(MirroringEndpointGroupAssociationLocationsDetailArgs $) {
        this.location = $.location;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MirroringEndpointGroupAssociationLocationsDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MirroringEndpointGroupAssociationLocationsDetailArgs $;

        public Builder() {
            $ = new MirroringEndpointGroupAssociationLocationsDetailArgs();
        }

        public Builder(MirroringEndpointGroupAssociationLocationsDetailArgs defaults) {
            $ = new MirroringEndpointGroupAssociationLocationsDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringEndpointGroupAssociation`.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringEndpointGroupAssociation`.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param state (Output)
         * Output only. The association state in this location.
         * Possible values:
         * STATE_UNSPECIFIED
         * ACTIVE
         * OUT_OF_SYNC
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * Output only. The association state in this location.
         * Possible values:
         * STATE_UNSPECIFIED
         * ACTIVE
         * OUT_OF_SYNC
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public MirroringEndpointGroupAssociationLocationsDetailArgs build() {
            return $;
        }
    }

}
