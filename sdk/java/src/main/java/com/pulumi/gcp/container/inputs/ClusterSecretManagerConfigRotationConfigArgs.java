// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSecretManagerConfigRotationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSecretManagerConfigRotationConfigArgs Empty = new ClusterSecretManagerConfigRotationConfigArgs();

    /**
     * Enable the roation in Secret Manager add-on for this cluster.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable the roation in Secret Manager add-on for this cluster.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The interval between two consecutive rotations. Default rotation interval is 2 minutes.
     * 
     */
    @Import(name="rotationInterval")
    private @Nullable Output<String> rotationInterval;

    /**
     * @return The interval between two consecutive rotations. Default rotation interval is 2 minutes.
     * 
     */
    public Optional<Output<String>> rotationInterval() {
        return Optional.ofNullable(this.rotationInterval);
    }

    private ClusterSecretManagerConfigRotationConfigArgs() {}

    private ClusterSecretManagerConfigRotationConfigArgs(ClusterSecretManagerConfigRotationConfigArgs $) {
        this.enabled = $.enabled;
        this.rotationInterval = $.rotationInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSecretManagerConfigRotationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSecretManagerConfigRotationConfigArgs $;

        public Builder() {
            $ = new ClusterSecretManagerConfigRotationConfigArgs();
        }

        public Builder(ClusterSecretManagerConfigRotationConfigArgs defaults) {
            $ = new ClusterSecretManagerConfigRotationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable the roation in Secret Manager add-on for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable the roation in Secret Manager add-on for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param rotationInterval The interval between two consecutive rotations. Default rotation interval is 2 minutes.
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(@Nullable Output<String> rotationInterval) {
            $.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * @param rotationInterval The interval between two consecutive rotations. Default rotation interval is 2 minutes.
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(String rotationInterval) {
            return rotationInterval(Output.of(rotationInterval));
        }

        public ClusterSecretManagerConfigRotationConfigArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ClusterSecretManagerConfigRotationConfigArgs", "enabled");
            }
            return $;
        }
    }

}
