// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolManagementArgs Empty = new NodePoolManagementArgs();

    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    @Import(name="autoRepair")
    private @Nullable Output<Boolean> autoRepair;

    /**
     * @return Whether the nodes will be automatically repaired.
     * 
     */
    public Optional<Output<Boolean>> autoRepair() {
        return Optional.ofNullable(this.autoRepair);
    }

    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<Boolean> autoUpgrade;

    /**
     * @return Whether the nodes will be automatically upgraded.
     * 
     */
    public Optional<Output<Boolean>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    private NodePoolManagementArgs() {}

    private NodePoolManagementArgs(NodePoolManagementArgs $) {
        this.autoRepair = $.autoRepair;
        this.autoUpgrade = $.autoUpgrade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolManagementArgs $;

        public Builder() {
            $ = new NodePoolManagementArgs();
        }

        public Builder(NodePoolManagementArgs defaults) {
            $ = new NodePoolManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRepair Whether the nodes will be automatically repaired.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            $.autoRepair = autoRepair;
            return this;
        }

        /**
         * @param autoRepair Whether the nodes will be automatically repaired.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(Boolean autoRepair) {
            return autoRepair(Output.of(autoRepair));
        }

        /**
         * @param autoUpgrade Whether the nodes will be automatically upgraded.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade Whether the nodes will be automatically upgraded.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        public NodePoolManagementArgs build() {
            return $;
        }
    }

}