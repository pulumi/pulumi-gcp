// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs Empty = new CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter")
    private @Nullable Output<String> parameter;

    /**
     * @return Display name of the parameter.
     * 
     */
    public Optional<Output<String>> parameter() {
        return Optional.ofNullable(this.parameter);
    }

    /**
     * The new JSON-encoded value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The new JSON-encoded value of the parameter. A null value clears the parameter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs() {}

    private CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs(CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs $) {
        this.parameter = $.parameter;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs $;

        public Builder() {
            $ = new CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs();
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs defaults) {
            $ = new CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameter Display name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(@Nullable Output<String> parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param parameter Display name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            return parameter(Output.of(parameter));
        }

        /**
         * @param value The new JSON-encoded value of the parameter. A null value clears the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The new JSON-encoded value of the parameter. A null value clears the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs build() {
            return $;
        }
    }

}