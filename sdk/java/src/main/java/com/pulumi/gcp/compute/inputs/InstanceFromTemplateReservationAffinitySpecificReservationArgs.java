// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceFromTemplateReservationAffinitySpecificReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateReservationAffinitySpecificReservationArgs Empty = new InstanceFromTemplateReservationAffinitySpecificReservationArgs();

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

    private InstanceFromTemplateReservationAffinitySpecificReservationArgs() {}

    private InstanceFromTemplateReservationAffinitySpecificReservationArgs(InstanceFromTemplateReservationAffinitySpecificReservationArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateReservationAffinitySpecificReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateReservationAffinitySpecificReservationArgs $;

        public Builder() {
            $ = new InstanceFromTemplateReservationAffinitySpecificReservationArgs();
        }

        public Builder(InstanceFromTemplateReservationAffinitySpecificReservationArgs defaults) {
            $ = new InstanceFromTemplateReservationAffinitySpecificReservationArgs(Objects.requireNonNull(defaults));
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

        public InstanceFromTemplateReservationAffinitySpecificReservationArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("InstanceFromTemplateReservationAffinitySpecificReservationArgs", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("InstanceFromTemplateReservationAffinitySpecificReservationArgs", "values");
            }
            return $;
        }
    }

}
