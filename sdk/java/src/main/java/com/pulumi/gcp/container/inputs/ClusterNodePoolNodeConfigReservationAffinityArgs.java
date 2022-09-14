// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigReservationAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigReservationAffinityArgs Empty = new ClusterNodePoolNodeConfigReservationAffinityArgs();

    /**
     * The type of reservation consumption
     * Accepted values are:
     * 
     */
    @Import(name="consumeReservationType", required=true)
    private Output<String> consumeReservationType;

    /**
     * @return The type of reservation consumption
     * Accepted values are:
     * 
     */
    public Output<String> consumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * The label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;compute.googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;compute.googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The list of label values of reservation resources. For example: the name of the specific reservation when using a key of &#34;compute.googleapis.com/reservation-name&#34;
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The list of label values of reservation resources. For example: the name of the specific reservation when using a key of &#34;compute.googleapis.com/reservation-name&#34;
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ClusterNodePoolNodeConfigReservationAffinityArgs() {}

    private ClusterNodePoolNodeConfigReservationAffinityArgs(ClusterNodePoolNodeConfigReservationAffinityArgs $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigReservationAffinityArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigReservationAffinityArgs();
        }

        public Builder(ClusterNodePoolNodeConfigReservationAffinityArgs defaults) {
            $ = new ClusterNodePoolNodeConfigReservationAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumeReservationType The type of reservation consumption
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(Output<String> consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        /**
         * @param consumeReservationType The type of reservation consumption
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(String consumeReservationType) {
            return consumeReservationType(Output.of(consumeReservationType));
        }

        /**
         * @param key The label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;compute.googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;compute.googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values The list of label values of reservation resources. For example: the name of the specific reservation when using a key of &#34;compute.googleapis.com/reservation-name&#34;
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of label values of reservation resources. For example: the name of the specific reservation when using a key of &#34;compute.googleapis.com/reservation-name&#34;
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The list of label values of reservation resources. For example: the name of the specific reservation when using a key of &#34;compute.googleapis.com/reservation-name&#34;
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ClusterNodePoolNodeConfigReservationAffinityArgs build() {
            $.consumeReservationType = Objects.requireNonNull($.consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
            return $;
        }
    }

}