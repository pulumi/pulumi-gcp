// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class VMwareClusterAutoRepairConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareClusterAutoRepairConfigArgs Empty = new VMwareClusterAutoRepairConfigArgs();

    /**
     * Whether auto repair is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether auto repair is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private VMwareClusterAutoRepairConfigArgs() {}

    private VMwareClusterAutoRepairConfigArgs(VMwareClusterAutoRepairConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareClusterAutoRepairConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareClusterAutoRepairConfigArgs $;

        public Builder() {
            $ = new VMwareClusterAutoRepairConfigArgs();
        }

        public Builder(VMwareClusterAutoRepairConfigArgs defaults) {
            $ = new VMwareClusterAutoRepairConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether auto repair is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether auto repair is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public VMwareClusterAutoRepairConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}