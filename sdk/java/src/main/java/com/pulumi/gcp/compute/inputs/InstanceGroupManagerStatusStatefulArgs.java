// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulPerInstanceConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusStatefulArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusStatefulArgs Empty = new InstanceGroupManagerStatusStatefulArgs();

    /**
     * A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    @Import(name="hasStatefulConfig")
    private @Nullable Output<Boolean> hasStatefulConfig;

    /**
     * @return A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
     * 
     */
    public Optional<Output<Boolean>> hasStatefulConfig() {
        return Optional.ofNullable(this.hasStatefulConfig);
    }

    /**
     * Status of per-instance configs on the instance.
     * 
     */
    @Import(name="perInstanceConfigs")
    private @Nullable Output<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs;

    /**
     * @return Status of per-instance configs on the instance.
     * 
     */
    public Optional<Output<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>>> perInstanceConfigs() {
        return Optional.ofNullable(this.perInstanceConfigs);
    }

    private InstanceGroupManagerStatusStatefulArgs() {}

    private InstanceGroupManagerStatusStatefulArgs(InstanceGroupManagerStatusStatefulArgs $) {
        this.hasStatefulConfig = $.hasStatefulConfig;
        this.perInstanceConfigs = $.perInstanceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerStatusStatefulArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerStatusStatefulArgs $;

        public Builder() {
            $ = new InstanceGroupManagerStatusStatefulArgs();
        }

        public Builder(InstanceGroupManagerStatusStatefulArgs defaults) {
            $ = new InstanceGroupManagerStatusStatefulArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hasStatefulConfig A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
         * 
         * @return builder
         * 
         */
        public Builder hasStatefulConfig(@Nullable Output<Boolean> hasStatefulConfig) {
            $.hasStatefulConfig = hasStatefulConfig;
            return this;
        }

        /**
         * @param hasStatefulConfig A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
         * 
         * @return builder
         * 
         */
        public Builder hasStatefulConfig(Boolean hasStatefulConfig) {
            return hasStatefulConfig(Output.of(hasStatefulConfig));
        }

        /**
         * @param perInstanceConfigs Status of per-instance configs on the instance.
         * 
         * @return builder
         * 
         */
        public Builder perInstanceConfigs(@Nullable Output<List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs>> perInstanceConfigs) {
            $.perInstanceConfigs = perInstanceConfigs;
            return this;
        }

        /**
         * @param perInstanceConfigs Status of per-instance configs on the instance.
         * 
         * @return builder
         * 
         */
        public Builder perInstanceConfigs(List<InstanceGroupManagerStatusStatefulPerInstanceConfigArgs> perInstanceConfigs) {
            return perInstanceConfigs(Output.of(perInstanceConfigs));
        }

        /**
         * @param perInstanceConfigs Status of per-instance configs on the instance.
         * 
         * @return builder
         * 
         */
        public Builder perInstanceConfigs(InstanceGroupManagerStatusStatefulPerInstanceConfigArgs... perInstanceConfigs) {
            return perInstanceConfigs(List.of(perInstanceConfigs));
        }

        public InstanceGroupManagerStatusStatefulArgs build() {
            return $;
        }
    }

}