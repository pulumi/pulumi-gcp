// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMaintenancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyArgs Empty = new ClusterMaintenancePolicyArgs();

    /**
     * Exclusions to automatic maintenance. Non-emergency maintenance should not occur
     * in these windows. Each exclusion has a unique name and may be active or expired.
     * The max number of maintenance exclusions allowed at a given time is 3.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceExclusions")
    private @Nullable Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>> maintenanceExclusions;

    /**
     * @return Exclusions to automatic maintenance. Non-emergency maintenance should not occur
     * in these windows. Each exclusion has a unique name and may be active or expired.
     * The max number of maintenance exclusions allowed at a given time is 3.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>>> maintenanceExclusions() {
        return Optional.ofNullable(this.maintenanceExclusions);
    }

    /**
     * Specifies the maintenance window in which maintenance may be performed.
     * Structure is documented below.
     * 
     */
    @Import(name="window", required=true)
    private Output<ClusterMaintenancePolicyWindowArgs> window;

    /**
     * @return Specifies the maintenance window in which maintenance may be performed.
     * Structure is documented below.
     * 
     */
    public Output<ClusterMaintenancePolicyWindowArgs> window() {
        return this.window;
    }

    private ClusterMaintenancePolicyArgs() {}

    private ClusterMaintenancePolicyArgs(ClusterMaintenancePolicyArgs $) {
        this.maintenanceExclusions = $.maintenanceExclusions;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyArgs();
        }

        public Builder(ClusterMaintenancePolicyArgs defaults) {
            $ = new ClusterMaintenancePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maintenanceExclusions Exclusions to automatic maintenance. Non-emergency maintenance should not occur
         * in these windows. Each exclusion has a unique name and may be active or expired.
         * The max number of maintenance exclusions allowed at a given time is 3.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(@Nullable Output<List<ClusterMaintenancePolicyMaintenanceExclusionArgs>> maintenanceExclusions) {
            $.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        /**
         * @param maintenanceExclusions Exclusions to automatic maintenance. Non-emergency maintenance should not occur
         * in these windows. Each exclusion has a unique name and may be active or expired.
         * The max number of maintenance exclusions allowed at a given time is 3.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(List<ClusterMaintenancePolicyMaintenanceExclusionArgs> maintenanceExclusions) {
            return maintenanceExclusions(Output.of(maintenanceExclusions));
        }

        /**
         * @param maintenanceExclusions Exclusions to automatic maintenance. Non-emergency maintenance should not occur
         * in these windows. Each exclusion has a unique name and may be active or expired.
         * The max number of maintenance exclusions allowed at a given time is 3.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceExclusions(ClusterMaintenancePolicyMaintenanceExclusionArgs... maintenanceExclusions) {
            return maintenanceExclusions(List.of(maintenanceExclusions));
        }

        /**
         * @param window Specifies the maintenance window in which maintenance may be performed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder window(Output<ClusterMaintenancePolicyWindowArgs> window) {
            $.window = window;
            return this;
        }

        /**
         * @param window Specifies the maintenance window in which maintenance may be performed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder window(ClusterMaintenancePolicyWindowArgs window) {
            return window(Output.of(window));
        }

        public ClusterMaintenancePolicyArgs build() {
            if ($.window == null) {
                throw new MissingRequiredPropertyException("ClusterMaintenancePolicyArgs", "window");
            }
            return $;
        }
    }

}
