// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class V2VmAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2VmAcceleratorConfigArgs Empty = new V2VmAcceleratorConfigArgs();

    /**
     * Topology of TPU in chips.
     * 
     */
    @Import(name="topology", required=true)
    private Output<String> topology;

    /**
     * @return Topology of TPU in chips.
     * 
     */
    public Output<String> topology() {
        return this.topology;
    }

    /**
     * Type of TPU.
     * Possible values are: `V2`, `V3`, `V4`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of TPU.
     * Possible values are: `V2`, `V3`, `V4`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private V2VmAcceleratorConfigArgs() {}

    private V2VmAcceleratorConfigArgs(V2VmAcceleratorConfigArgs $) {
        this.topology = $.topology;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2VmAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2VmAcceleratorConfigArgs $;

        public Builder() {
            $ = new V2VmAcceleratorConfigArgs();
        }

        public Builder(V2VmAcceleratorConfigArgs defaults) {
            $ = new V2VmAcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param topology Topology of TPU in chips.
         * 
         * @return builder
         * 
         */
        public Builder topology(Output<String> topology) {
            $.topology = topology;
            return this;
        }

        /**
         * @param topology Topology of TPU in chips.
         * 
         * @return builder
         * 
         */
        public Builder topology(String topology) {
            return topology(Output.of(topology));
        }

        /**
         * @param type Type of TPU.
         * Possible values are: `V2`, `V3`, `V4`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of TPU.
         * Possible values are: `V2`, `V3`, `V4`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public V2VmAcceleratorConfigArgs build() {
            $.topology = Objects.requireNonNull($.topology, "expected parameter 'topology' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}