// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolUpgradeSettingsBlueGreenSettings {
    /**
     * @return Time needed after draining the entire blue pool.
     * After this period, the blue pool will be cleaned up.
     * 
     */
    private @Nullable String nodePoolSoakDuration;
    /**
     * @return Specifies the standard policy settings for blue-green upgrades.
     * 
     */
    private NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicy standardRolloutPolicy;

    private NodePoolUpgradeSettingsBlueGreenSettings() {}
    /**
     * @return Time needed after draining the entire blue pool.
     * After this period, the blue pool will be cleaned up.
     * 
     */
    public Optional<String> nodePoolSoakDuration() {
        return Optional.ofNullable(this.nodePoolSoakDuration);
    }
    /**
     * @return Specifies the standard policy settings for blue-green upgrades.
     * 
     */
    public NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicy standardRolloutPolicy() {
        return this.standardRolloutPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolUpgradeSettingsBlueGreenSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nodePoolSoakDuration;
        private NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicy standardRolloutPolicy;
        public Builder() {}
        public Builder(NodePoolUpgradeSettingsBlueGreenSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodePoolSoakDuration = defaults.nodePoolSoakDuration;
    	      this.standardRolloutPolicy = defaults.standardRolloutPolicy;
        }

        @CustomType.Setter
        public Builder nodePoolSoakDuration(@Nullable String nodePoolSoakDuration) {
            this.nodePoolSoakDuration = nodePoolSoakDuration;
            return this;
        }
        @CustomType.Setter
        public Builder standardRolloutPolicy(NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicy standardRolloutPolicy) {
            this.standardRolloutPolicy = Objects.requireNonNull(standardRolloutPolicy);
            return this;
        }
        public NodePoolUpgradeSettingsBlueGreenSettings build() {
            final var o = new NodePoolUpgradeSettingsBlueGreenSettings();
            o.nodePoolSoakDuration = nodePoolSoakDuration;
            o.standardRolloutPolicy = standardRolloutPolicy;
            return o;
        }
    }
}