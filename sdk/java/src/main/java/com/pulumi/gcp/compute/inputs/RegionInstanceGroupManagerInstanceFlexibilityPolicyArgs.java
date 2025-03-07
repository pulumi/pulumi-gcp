// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs Empty = new RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs();

    /**
     * Named instance selections configuring properties that the group will use when creating new VMs.
     * 
     */
    @Import(name="instanceSelections")
    private @Nullable Output<List<RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs>> instanceSelections;

    /**
     * @return Named instance selections configuring properties that the group will use when creating new VMs.
     * 
     */
    public Optional<Output<List<RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs>>> instanceSelections() {
        return Optional.ofNullable(this.instanceSelections);
    }

    private RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs() {}

    private RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs(RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs $) {
        this.instanceSelections = $.instanceSelections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs();
        }

        public Builder(RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs defaults) {
            $ = new RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceSelections Named instance selections configuring properties that the group will use when creating new VMs.
         * 
         * @return builder
         * 
         */
        public Builder instanceSelections(@Nullable Output<List<RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs>> instanceSelections) {
            $.instanceSelections = instanceSelections;
            return this;
        }

        /**
         * @param instanceSelections Named instance selections configuring properties that the group will use when creating new VMs.
         * 
         * @return builder
         * 
         */
        public Builder instanceSelections(List<RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs> instanceSelections) {
            return instanceSelections(Output.of(instanceSelections));
        }

        /**
         * @param instanceSelections Named instance selections configuring properties that the group will use when creating new VMs.
         * 
         * @return builder
         * 
         */
        public Builder instanceSelections(RegionInstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionArgs... instanceSelections) {
            return instanceSelections(List.of(instanceSelections));
        }

        public RegionInstanceGroupManagerInstanceFlexibilityPolicyArgs build() {
            return $;
        }
    }

}
