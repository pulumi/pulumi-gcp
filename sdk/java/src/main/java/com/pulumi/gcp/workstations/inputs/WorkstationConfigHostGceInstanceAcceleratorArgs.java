// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class WorkstationConfigHostGceInstanceAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkstationConfigHostGceInstanceAcceleratorArgs Empty = new WorkstationConfigHostGceInstanceAcceleratorArgs();

    /**
     * Number of accelerator cards exposed to the instance.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return Number of accelerator cards exposed to the instance.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * Type of accelerator resource to attach to the instance, for example, &#34;nvidia-tesla-p100&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of accelerator resource to attach to the instance, for example, &#34;nvidia-tesla-p100&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private WorkstationConfigHostGceInstanceAcceleratorArgs() {}

    private WorkstationConfigHostGceInstanceAcceleratorArgs(WorkstationConfigHostGceInstanceAcceleratorArgs $) {
        this.count = $.count;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkstationConfigHostGceInstanceAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkstationConfigHostGceInstanceAcceleratorArgs $;

        public Builder() {
            $ = new WorkstationConfigHostGceInstanceAcceleratorArgs();
        }

        public Builder(WorkstationConfigHostGceInstanceAcceleratorArgs defaults) {
            $ = new WorkstationConfigHostGceInstanceAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Number of accelerator cards exposed to the instance.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Number of accelerator cards exposed to the instance.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param type Type of accelerator resource to attach to the instance, for example, &#34;nvidia-tesla-p100&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of accelerator resource to attach to the instance, for example, &#34;nvidia-tesla-p100&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkstationConfigHostGceInstanceAcceleratorArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}