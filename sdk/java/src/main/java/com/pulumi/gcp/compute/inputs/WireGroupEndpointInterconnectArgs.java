// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WireGroupEndpointInterconnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final WireGroupEndpointInterconnectArgs Empty = new WireGroupEndpointInterconnectArgs();

    /**
     * (Optional)
     * 
     */
    @Import(name="interconnect")
    private @Nullable Output<String> interconnect;

    /**
     * @return (Optional)
     * 
     */
    public Optional<Output<String>> interconnect() {
        return Optional.ofNullable(this.interconnect);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="interconnectName", required=true)
    private Output<String> interconnectName;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> interconnectName() {
        return this.interconnectName;
    }

    /**
     * VLAN tags for the interconnect.
     * 
     */
    @Import(name="vlanTags")
    private @Nullable Output<List<Integer>> vlanTags;

    /**
     * @return VLAN tags for the interconnect.
     * 
     */
    public Optional<Output<List<Integer>>> vlanTags() {
        return Optional.ofNullable(this.vlanTags);
    }

    private WireGroupEndpointInterconnectArgs() {}

    private WireGroupEndpointInterconnectArgs(WireGroupEndpointInterconnectArgs $) {
        this.interconnect = $.interconnect;
        this.interconnectName = $.interconnectName;
        this.vlanTags = $.vlanTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WireGroupEndpointInterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WireGroupEndpointInterconnectArgs $;

        public Builder() {
            $ = new WireGroupEndpointInterconnectArgs();
        }

        public Builder(WireGroupEndpointInterconnectArgs defaults) {
            $ = new WireGroupEndpointInterconnectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interconnect (Optional)
         * 
         * @return builder
         * 
         */
        public Builder interconnect(@Nullable Output<String> interconnect) {
            $.interconnect = interconnect;
            return this;
        }

        /**
         * @param interconnect (Optional)
         * 
         * @return builder
         * 
         */
        public Builder interconnect(String interconnect) {
            return interconnect(Output.of(interconnect));
        }

        /**
         * @param interconnectName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder interconnectName(Output<String> interconnectName) {
            $.interconnectName = interconnectName;
            return this;
        }

        /**
         * @param interconnectName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder interconnectName(String interconnectName) {
            return interconnectName(Output.of(interconnectName));
        }

        /**
         * @param vlanTags VLAN tags for the interconnect.
         * 
         * @return builder
         * 
         */
        public Builder vlanTags(@Nullable Output<List<Integer>> vlanTags) {
            $.vlanTags = vlanTags;
            return this;
        }

        /**
         * @param vlanTags VLAN tags for the interconnect.
         * 
         * @return builder
         * 
         */
        public Builder vlanTags(List<Integer> vlanTags) {
            return vlanTags(Output.of(vlanTags));
        }

        /**
         * @param vlanTags VLAN tags for the interconnect.
         * 
         * @return builder
         * 
         */
        public Builder vlanTags(Integer... vlanTags) {
            return vlanTags(List.of(vlanTags));
        }

        public WireGroupEndpointInterconnectArgs build() {
            if ($.interconnectName == null) {
                throw new MissingRequiredPropertyException("WireGroupEndpointInterconnectArgs", "interconnectName");
            }
            return $;
        }
    }

}
