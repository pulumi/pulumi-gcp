// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceReservationAffinitySpecificReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinitySpecificReservationArgs Empty = new InstanceReservationAffinitySpecificReservationArgs();

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Corresponds to the label values of a reservation resource.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private InstanceReservationAffinitySpecificReservationArgs() {}

    private InstanceReservationAffinitySpecificReservationArgs(InstanceReservationAffinitySpecificReservationArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceReservationAffinitySpecificReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceReservationAffinitySpecificReservationArgs $;

        public Builder() {
            $ = new InstanceReservationAffinitySpecificReservationArgs();
        }

        public Builder(InstanceReservationAffinitySpecificReservationArgs defaults) {
            $ = new InstanceReservationAffinitySpecificReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public InstanceReservationAffinitySpecificReservationArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}