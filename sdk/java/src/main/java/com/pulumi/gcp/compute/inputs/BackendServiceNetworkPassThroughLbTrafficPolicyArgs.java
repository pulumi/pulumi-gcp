// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceNetworkPassThroughLbTrafficPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceNetworkPassThroughLbTrafficPolicyArgs Empty = new BackendServiceNetworkPassThroughLbTrafficPolicyArgs();

    /**
     * When configured, new connections are load balanced across healthy backend endpoints in the local zone.
     * Structure is documented below.
     * 
     */
    @Import(name="zonalAffinity")
    private @Nullable Output<BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs> zonalAffinity;

    /**
     * @return When configured, new connections are load balanced across healthy backend endpoints in the local zone.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs>> zonalAffinity() {
        return Optional.ofNullable(this.zonalAffinity);
    }

    private BackendServiceNetworkPassThroughLbTrafficPolicyArgs() {}

    private BackendServiceNetworkPassThroughLbTrafficPolicyArgs(BackendServiceNetworkPassThroughLbTrafficPolicyArgs $) {
        this.zonalAffinity = $.zonalAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceNetworkPassThroughLbTrafficPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceNetworkPassThroughLbTrafficPolicyArgs $;

        public Builder() {
            $ = new BackendServiceNetworkPassThroughLbTrafficPolicyArgs();
        }

        public Builder(BackendServiceNetworkPassThroughLbTrafficPolicyArgs defaults) {
            $ = new BackendServiceNetworkPassThroughLbTrafficPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zonalAffinity When configured, new connections are load balanced across healthy backend endpoints in the local zone.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder zonalAffinity(@Nullable Output<BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs> zonalAffinity) {
            $.zonalAffinity = zonalAffinity;
            return this;
        }

        /**
         * @param zonalAffinity When configured, new connections are load balanced across healthy backend endpoints in the local zone.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder zonalAffinity(BackendServiceNetworkPassThroughLbTrafficPolicyZonalAffinityArgs zonalAffinity) {
            return zonalAffinity(Output.of(zonalAffinity));
        }

        public BackendServiceNetworkPassThroughLbTrafficPolicyArgs build() {
            return $;
        }
    }

}
