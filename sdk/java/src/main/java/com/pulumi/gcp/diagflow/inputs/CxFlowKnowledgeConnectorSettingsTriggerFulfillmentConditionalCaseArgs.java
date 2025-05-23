// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs Empty = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs();

    /**
     * A JSON encoded list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
     * See [Case](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment#case) for the schema.
     * 
     */
    @Import(name="cases")
    private @Nullable Output<String> cases;

    /**
     * @return A JSON encoded list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
     * See [Case](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment#case) for the schema.
     * 
     */
    public Optional<Output<String>> cases() {
        return Optional.ofNullable(this.cases);
    }

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs() {}

    private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs $) {
        this.cases = $.cases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs $;

        public Builder() {
            $ = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs();
        }

        public Builder(CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs defaults) {
            $ = new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cases A JSON encoded list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
         * See [Case](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment#case) for the schema.
         * 
         * @return builder
         * 
         */
        public Builder cases(@Nullable Output<String> cases) {
            $.cases = cases;
            return this;
        }

        /**
         * @param cases A JSON encoded list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
         * See [Case](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment#case) for the schema.
         * 
         * @return builder
         * 
         */
        public Builder cases(String cases) {
            return cases(Output.of(cases));
        }

        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentConditionalCaseArgs build() {
            return $;
        }
    }

}
