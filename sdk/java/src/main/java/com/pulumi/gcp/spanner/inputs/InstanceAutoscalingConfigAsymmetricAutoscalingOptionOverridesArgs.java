// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs;
import java.util.Objects;


public final class InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs Empty = new InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs();

    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingLimits", required=true)
    private Output<InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs> autoscalingLimits;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Output<InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs> autoscalingLimits() {
        return this.autoscalingLimits;
    }

    private InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs() {}

    private InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs(InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs $) {
        this.autoscalingLimits = $.autoscalingLimits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs $;

        public Builder() {
            $ = new InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs();
        }

        public Builder(InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs defaults) {
            $ = new InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingLimits A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingLimits(Output<InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs> autoscalingLimits) {
            $.autoscalingLimits = autoscalingLimits;
            return this;
        }

        /**
         * @param autoscalingLimits A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingLimits(InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs autoscalingLimits) {
            return autoscalingLimits(Output.of(autoscalingLimits));
        }

        public InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs build() {
            if ($.autoscalingLimits == null) {
                throw new MissingRequiredPropertyException("InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs", "autoscalingLimits");
            }
            return $;
        }
    }

}
