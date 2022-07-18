// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs Empty = new RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs();

    /**
     * A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    @Import(name="allEffective")
    private @Nullable Output<Boolean> allEffective;

    /**
     * @return A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
     * 
     */
    public Optional<Output<Boolean>> allEffective() {
        return Optional.ofNullable(this.allEffective);
    }

    private RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs() {}

    private RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs $) {
        this.allEffective = $.allEffective;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs $;

        public Builder() {
            $ = new RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs();
        }

        public Builder(RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs defaults) {
            $ = new RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allEffective A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
         * 
         * @return builder
         * 
         */
        public Builder allEffective(@Nullable Output<Boolean> allEffective) {
            $.allEffective = allEffective;
            return this;
        }

        /**
         * @param allEffective A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status `EFFECTIVE` or there are no per-instance-configs.
         * 
         * @return builder
         * 
         */
        public Builder allEffective(Boolean allEffective) {
            return allEffective(Output.of(allEffective));
        }

        public RegionInstanceGroupManagerStatusStatefulPerInstanceConfigArgs build() {
            return $;
        }
    }

}