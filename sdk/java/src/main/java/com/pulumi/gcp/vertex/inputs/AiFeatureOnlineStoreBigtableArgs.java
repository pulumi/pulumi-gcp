// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableAutoScalingArgs;
import java.util.Objects;


public final class AiFeatureOnlineStoreBigtableArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureOnlineStoreBigtableArgs Empty = new AiFeatureOnlineStoreBigtableArgs();

    /**
     * Autoscaling config applied to Bigtable Instance.
     * Structure is documented below.
     * 
     */
    @Import(name="autoScaling", required=true)
    private Output<AiFeatureOnlineStoreBigtableAutoScalingArgs> autoScaling;

    /**
     * @return Autoscaling config applied to Bigtable Instance.
     * Structure is documented below.
     * 
     */
    public Output<AiFeatureOnlineStoreBigtableAutoScalingArgs> autoScaling() {
        return this.autoScaling;
    }

    private AiFeatureOnlineStoreBigtableArgs() {}

    private AiFeatureOnlineStoreBigtableArgs(AiFeatureOnlineStoreBigtableArgs $) {
        this.autoScaling = $.autoScaling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureOnlineStoreBigtableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureOnlineStoreBigtableArgs $;

        public Builder() {
            $ = new AiFeatureOnlineStoreBigtableArgs();
        }

        public Builder(AiFeatureOnlineStoreBigtableArgs defaults) {
            $ = new AiFeatureOnlineStoreBigtableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScaling Autoscaling config applied to Bigtable Instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(Output<AiFeatureOnlineStoreBigtableAutoScalingArgs> autoScaling) {
            $.autoScaling = autoScaling;
            return this;
        }

        /**
         * @param autoScaling Autoscaling config applied to Bigtable Instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoScaling(AiFeatureOnlineStoreBigtableAutoScalingArgs autoScaling) {
            return autoScaling(Output.of(autoScaling));
        }

        public AiFeatureOnlineStoreBigtableArgs build() {
            if ($.autoScaling == null) {
                throw new MissingRequiredPropertyException("AiFeatureOnlineStoreBigtableArgs", "autoScaling");
            }
            return $;
        }
    }

}