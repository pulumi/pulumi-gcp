// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceTemplateGuestAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateGuestAcceleratorArgs Empty = new InstanceTemplateGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of the guest accelerator cards exposed to this instance.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of reservation from which this instance can consume resources.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private InstanceTemplateGuestAcceleratorArgs() {}

    private InstanceTemplateGuestAcceleratorArgs(InstanceTemplateGuestAcceleratorArgs $) {
        this.count = $.count;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateGuestAcceleratorArgs $;

        public Builder() {
            $ = new InstanceTemplateGuestAcceleratorArgs();
        }

        public Builder(InstanceTemplateGuestAcceleratorArgs defaults) {
            $ = new InstanceTemplateGuestAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of the guest accelerator cards exposed to this instance.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of the guest accelerator cards exposed to this instance.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceTemplateGuestAcceleratorArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}