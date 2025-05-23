// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupConnectedDeploymentGroupLocationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterceptEndpointGroupConnectedDeploymentGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterceptEndpointGroupConnectedDeploymentGroupArgs Empty = new InterceptEndpointGroupConnectedDeploymentGroupArgs();

    /**
     * (Output)
     * The list of locations where the deployment group is present.
     * Structure is documented below.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<InterceptEndpointGroupConnectedDeploymentGroupLocationArgs>> locations;

    /**
     * @return (Output)
     * The list of locations where the deployment group is present.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InterceptEndpointGroupConnectedDeploymentGroupLocationArgs>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private InterceptEndpointGroupConnectedDeploymentGroupArgs() {}

    private InterceptEndpointGroupConnectedDeploymentGroupArgs(InterceptEndpointGroupConnectedDeploymentGroupArgs $) {
        this.locations = $.locations;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterceptEndpointGroupConnectedDeploymentGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterceptEndpointGroupConnectedDeploymentGroupArgs $;

        public Builder() {
            $ = new InterceptEndpointGroupConnectedDeploymentGroupArgs();
        }

        public Builder(InterceptEndpointGroupConnectedDeploymentGroupArgs defaults) {
            $ = new InterceptEndpointGroupConnectedDeploymentGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locations (Output)
         * The list of locations where the deployment group is present.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<InterceptEndpointGroupConnectedDeploymentGroupLocationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations (Output)
         * The list of locations where the deployment group is present.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<InterceptEndpointGroupConnectedDeploymentGroupLocationArgs> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations (Output)
         * The list of locations where the deployment group is present.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder locations(InterceptEndpointGroupConnectedDeploymentGroupLocationArgs... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param name (Output)
         * The connected deployment group&#39;s resource name, for example:
         * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
         * See https://google.aip.dev/124.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Output)
         * The connected deployment group&#39;s resource name, for example:
         * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
         * See https://google.aip.dev/124.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public InterceptEndpointGroupConnectedDeploymentGroupArgs build() {
            return $;
        }
    }

}
