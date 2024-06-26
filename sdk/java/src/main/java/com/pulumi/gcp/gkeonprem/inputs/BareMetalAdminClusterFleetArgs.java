// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalAdminClusterFleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterFleetArgs Empty = new BareMetalAdminClusterFleetArgs();

    /**
     * (Output)
     * The name of the managed Hub Membership resource associated to this cluster.
     * Membership names are formatted as
     * `projects/&lt;project-number&gt;/locations/&lt;location&gt;/memberships/&lt;cluster-id&gt;`.
     * 
     */
    @Import(name="membership")
    private @Nullable Output<String> membership;

    /**
     * @return (Output)
     * The name of the managed Hub Membership resource associated to this cluster.
     * Membership names are formatted as
     * `projects/&lt;project-number&gt;/locations/&lt;location&gt;/memberships/&lt;cluster-id&gt;`.
     * 
     */
    public Optional<Output<String>> membership() {
        return Optional.ofNullable(this.membership);
    }

    private BareMetalAdminClusterFleetArgs() {}

    private BareMetalAdminClusterFleetArgs(BareMetalAdminClusterFleetArgs $) {
        this.membership = $.membership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterFleetArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterFleetArgs();
        }

        public Builder(BareMetalAdminClusterFleetArgs defaults) {
            $ = new BareMetalAdminClusterFleetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param membership (Output)
         * The name of the managed Hub Membership resource associated to this cluster.
         * Membership names are formatted as
         * `projects/&lt;project-number&gt;/locations/&lt;location&gt;/memberships/&lt;cluster-id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder membership(@Nullable Output<String> membership) {
            $.membership = membership;
            return this;
        }

        /**
         * @param membership (Output)
         * The name of the managed Hub Membership resource associated to this cluster.
         * Membership names are formatted as
         * `projects/&lt;project-number&gt;/locations/&lt;location&gt;/memberships/&lt;cluster-id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder membership(String membership) {
            return membership(Output.of(membership));
        }

        public BareMetalAdminClusterFleetArgs build() {
            return $;
        }
    }

}
