// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs Empty = new CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs();

    /**
     * Transfer the call to a phone number in E.164 format.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private Output<String> phoneNumber;

    /**
     * @return Transfer the call to a phone number in E.164 format.
     * 
     */
    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }

    private CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs() {}

    private CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs(CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs $) {
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs $;

        public Builder() {
            $ = new CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs();
        }

        public Builder(CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs defaults) {
            $ = new CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param phoneNumber Transfer the call to a phone number in E.164 format.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber Transfer the call to a phone number in E.164 format.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs build() {
            if ($.phoneNumber == null) {
                throw new MissingRequiredPropertyException("CxFlowEventHandlerTriggerFulfillmentMessageTelephonyTransferCallArgs", "phoneNumber");
            }
            return $;
        }
    }

}
