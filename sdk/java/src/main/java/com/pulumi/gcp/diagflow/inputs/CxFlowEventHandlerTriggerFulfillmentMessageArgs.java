// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxFlowEventHandlerTriggerFulfillmentMessageTextArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowEventHandlerTriggerFulfillmentMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowEventHandlerTriggerFulfillmentMessageArgs Empty = new CxFlowEventHandlerTriggerFulfillmentMessageArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
    private @Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text;

    /**
     * @return A collection of text responses.
     * 
     */
    public Optional<Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private CxFlowEventHandlerTriggerFulfillmentMessageArgs() {}

    private CxFlowEventHandlerTriggerFulfillmentMessageArgs(CxFlowEventHandlerTriggerFulfillmentMessageArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowEventHandlerTriggerFulfillmentMessageArgs $;

        public Builder() {
            $ = new CxFlowEventHandlerTriggerFulfillmentMessageArgs();
        }

        public Builder(CxFlowEventHandlerTriggerFulfillmentMessageArgs defaults) {
            $ = new CxFlowEventHandlerTriggerFulfillmentMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<CxFlowEventHandlerTriggerFulfillmentMessageTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(CxFlowEventHandlerTriggerFulfillmentMessageTextArgs text) {
            return text(Output.of(text));
        }

        public CxFlowEventHandlerTriggerFulfillmentMessageArgs build() {
            return $;
        }
    }

}