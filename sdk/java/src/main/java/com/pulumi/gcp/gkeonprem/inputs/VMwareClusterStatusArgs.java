// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareClusterStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareClusterStatusArgs Empty = new VMwareClusterStatusArgs();

    /**
     * (Output)
     * ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     * Structure is documented below.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<VMwareClusterStatusConditionArgs>> conditions;

    /**
     * @return (Output)
     * ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<VMwareClusterStatusConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * (Output)
     * Human-friendly representation of the error message from the user cluster
     * controller. The error message can be temporary as the user cluster
     * controller creates a cluster or node pool. If the error message persists
     * for a longer period of time, it can be used to surface error message to
     * indicate real problems requiring user intervention.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable Output<String> errorMessage;

    /**
     * @return (Output)
     * Human-friendly representation of the error message from the user cluster
     * controller. The error message can be temporary as the user cluster
     * controller creates a cluster or node pool. If the error message persists
     * for a longer period of time, it can be used to surface error message to
     * indicate real problems requiring user intervention.
     * 
     */
    public Optional<Output<String>> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    private VMwareClusterStatusArgs() {}

    private VMwareClusterStatusArgs(VMwareClusterStatusArgs $) {
        this.conditions = $.conditions;
        this.errorMessage = $.errorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareClusterStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareClusterStatusArgs $;

        public Builder() {
            $ = new VMwareClusterStatusArgs();
        }

        public Builder(VMwareClusterStatusArgs defaults) {
            $ = new VMwareClusterStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions (Output)
         * ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<VMwareClusterStatusConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions (Output)
         * ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<VMwareClusterStatusConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions (Output)
         * ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder conditions(VMwareClusterStatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param errorMessage (Output)
         * Human-friendly representation of the error message from the user cluster
         * controller. The error message can be temporary as the user cluster
         * controller creates a cluster or node pool. If the error message persists
         * for a longer period of time, it can be used to surface error message to
         * indicate real problems requiring user intervention.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param errorMessage (Output)
         * Human-friendly representation of the error message from the user cluster
         * controller. The error message can be temporary as the user cluster
         * controller creates a cluster or node pool. If the error message persists
         * for a longer period of time, it can be used to surface error message to
         * indicate real problems requiring user intervention.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            return errorMessage(Output.of(errorMessage));
        }

        public VMwareClusterStatusArgs build() {
            return $;
        }
    }

}
