// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WireGroupWireWirePropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WireGroupWireWirePropertyArgs Empty = new WireGroupWireWirePropertyArgs();

    /**
     * The unmetered bandwidth setting.
     * 
     */
    @Import(name="bandwidthUnmetered")
    private @Nullable Output<Integer> bandwidthUnmetered;

    /**
     * @return The unmetered bandwidth setting.
     * 
     */
    public Optional<Output<Integer>> bandwidthUnmetered() {
        return Optional.ofNullable(this.bandwidthUnmetered);
    }

    /**
     * Response when a fault is detected in a pseudowire:
     * NONE: default.
     * DISABLE_PORT: set the port line protocol down when inline probes detect a fault. This setting is only permitted on port mode pseudowires.
     * 
     */
    @Import(name="faultResponse")
    private @Nullable Output<String> faultResponse;

    /**
     * @return Response when a fault is detected in a pseudowire:
     * NONE: default.
     * DISABLE_PORT: set the port line protocol down when inline probes detect a fault. This setting is only permitted on port mode pseudowires.
     * 
     */
    public Optional<Output<String>> faultResponse() {
        return Optional.ofNullable(this.faultResponse);
    }

    private WireGroupWireWirePropertyArgs() {}

    private WireGroupWireWirePropertyArgs(WireGroupWireWirePropertyArgs $) {
        this.bandwidthUnmetered = $.bandwidthUnmetered;
        this.faultResponse = $.faultResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WireGroupWireWirePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WireGroupWireWirePropertyArgs $;

        public Builder() {
            $ = new WireGroupWireWirePropertyArgs();
        }

        public Builder(WireGroupWireWirePropertyArgs defaults) {
            $ = new WireGroupWireWirePropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthUnmetered The unmetered bandwidth setting.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthUnmetered(@Nullable Output<Integer> bandwidthUnmetered) {
            $.bandwidthUnmetered = bandwidthUnmetered;
            return this;
        }

        /**
         * @param bandwidthUnmetered The unmetered bandwidth setting.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthUnmetered(Integer bandwidthUnmetered) {
            return bandwidthUnmetered(Output.of(bandwidthUnmetered));
        }

        /**
         * @param faultResponse Response when a fault is detected in a pseudowire:
         * NONE: default.
         * DISABLE_PORT: set the port line protocol down when inline probes detect a fault. This setting is only permitted on port mode pseudowires.
         * 
         * @return builder
         * 
         */
        public Builder faultResponse(@Nullable Output<String> faultResponse) {
            $.faultResponse = faultResponse;
            return this;
        }

        /**
         * @param faultResponse Response when a fault is detected in a pseudowire:
         * NONE: default.
         * DISABLE_PORT: set the port line protocol down when inline probes detect a fault. This setting is only permitted on port mode pseudowires.
         * 
         * @return builder
         * 
         */
        public Builder faultResponse(String faultResponse) {
            return faultResponse(Output.of(faultResponse));
        }

        public WireGroupWireWirePropertyArgs build() {
            return $;
        }
    }

}
