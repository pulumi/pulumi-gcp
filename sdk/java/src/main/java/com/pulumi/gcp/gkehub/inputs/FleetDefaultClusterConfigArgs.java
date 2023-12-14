// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs;
import com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetDefaultClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetDefaultClusterConfigArgs Empty = new FleetDefaultClusterConfigArgs();

    /**
     * Enable/Disable binary authorization features for the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="binaryAuthorizationConfig")
    private @Nullable Output<FleetDefaultClusterConfigBinaryAuthorizationConfigArgs> binaryAuthorizationConfig;

    /**
     * @return Enable/Disable binary authorization features for the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FleetDefaultClusterConfigBinaryAuthorizationConfigArgs>> binaryAuthorizationConfig() {
        return Optional.ofNullable(this.binaryAuthorizationConfig);
    }

    /**
     * Enable/Disable Security Posture features for the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="securityPostureConfig")
    private @Nullable Output<FleetDefaultClusterConfigSecurityPostureConfigArgs> securityPostureConfig;

    /**
     * @return Enable/Disable Security Posture features for the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FleetDefaultClusterConfigSecurityPostureConfigArgs>> securityPostureConfig() {
        return Optional.ofNullable(this.securityPostureConfig);
    }

    private FleetDefaultClusterConfigArgs() {}

    private FleetDefaultClusterConfigArgs(FleetDefaultClusterConfigArgs $) {
        this.binaryAuthorizationConfig = $.binaryAuthorizationConfig;
        this.securityPostureConfig = $.securityPostureConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetDefaultClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetDefaultClusterConfigArgs $;

        public Builder() {
            $ = new FleetDefaultClusterConfigArgs();
        }

        public Builder(FleetDefaultClusterConfigArgs defaults) {
            $ = new FleetDefaultClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param binaryAuthorizationConfig Enable/Disable binary authorization features for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder binaryAuthorizationConfig(@Nullable Output<FleetDefaultClusterConfigBinaryAuthorizationConfigArgs> binaryAuthorizationConfig) {
            $.binaryAuthorizationConfig = binaryAuthorizationConfig;
            return this;
        }

        /**
         * @param binaryAuthorizationConfig Enable/Disable binary authorization features for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder binaryAuthorizationConfig(FleetDefaultClusterConfigBinaryAuthorizationConfigArgs binaryAuthorizationConfig) {
            return binaryAuthorizationConfig(Output.of(binaryAuthorizationConfig));
        }

        /**
         * @param securityPostureConfig Enable/Disable Security Posture features for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityPostureConfig(@Nullable Output<FleetDefaultClusterConfigSecurityPostureConfigArgs> securityPostureConfig) {
            $.securityPostureConfig = securityPostureConfig;
            return this;
        }

        /**
         * @param securityPostureConfig Enable/Disable Security Posture features for the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityPostureConfig(FleetDefaultClusterConfigSecurityPostureConfigArgs securityPostureConfig) {
            return securityPostureConfig(Output.of(securityPostureConfig));
        }

        public FleetDefaultClusterConfigArgs build() {
            return $;
        }
    }

}