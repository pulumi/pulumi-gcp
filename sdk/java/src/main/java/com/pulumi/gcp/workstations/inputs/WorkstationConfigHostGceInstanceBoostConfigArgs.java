// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkstationConfigHostGceInstanceBoostConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkstationConfigHostGceInstanceBoostConfigArgs Empty = new WorkstationConfigHostGceInstanceBoostConfigArgs();

    /**
     * An accelerator card attached to the boost instance.
     * Structure is documented below.
     * 
     */
    @Import(name="accelerators")
    private @Nullable Output<List<WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs>> accelerators;

    /**
     * @return An accelerator card attached to the boost instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * The id to be used for the boost config.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id to be used for the boost config.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The type of machine that boosted VM instances will use—for example, e2-standard-4. For more information about machine types that Cloud Workstations supports, see the list of available machine types https://cloud.google.com/workstations/docs/available-machine-types. Defaults to e2-standard-4.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return The type of machine that boosted VM instances will use—for example, e2-standard-4. For more information about machine types that Cloud Workstations supports, see the list of available machine types https://cloud.google.com/workstations/docs/available-machine-types. Defaults to e2-standard-4.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    private WorkstationConfigHostGceInstanceBoostConfigArgs() {}

    private WorkstationConfigHostGceInstanceBoostConfigArgs(WorkstationConfigHostGceInstanceBoostConfigArgs $) {
        this.accelerators = $.accelerators;
        this.id = $.id;
        this.machineType = $.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkstationConfigHostGceInstanceBoostConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkstationConfigHostGceInstanceBoostConfigArgs $;

        public Builder() {
            $ = new WorkstationConfigHostGceInstanceBoostConfigArgs();
        }

        public Builder(WorkstationConfigHostGceInstanceBoostConfigArgs defaults) {
            $ = new WorkstationConfigHostGceInstanceBoostConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerators An accelerator card attached to the boost instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(@Nullable Output<List<WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        /**
         * @param accelerators An accelerator card attached to the boost instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(List<WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        /**
         * @param accelerators An accelerator card attached to the boost instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        /**
         * @param id The id to be used for the boost config.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id to be used for the boost config.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param machineType The type of machine that boosted VM instances will use—for example, e2-standard-4. For more information about machine types that Cloud Workstations supports, see the list of available machine types https://cloud.google.com/workstations/docs/available-machine-types. Defaults to e2-standard-4.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The type of machine that boosted VM instances will use—for example, e2-standard-4. For more information about machine types that Cloud Workstations supports, see the list of available machine types https://cloud.google.com/workstations/docs/available-machine-types. Defaults to e2-standard-4.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public WorkstationConfigHostGceInstanceBoostConfigArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("WorkstationConfigHostGceInstanceBoostConfigArgs", "id");
            }
            return $;
        }
    }

}
