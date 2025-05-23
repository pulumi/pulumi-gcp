// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs Empty = new CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs();

    /**
     * Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs() {}

    private CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs(CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs $) {
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs $;

        public Builder() {
            $ = new CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs();
        }

        public Builder(CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs defaults) {
            $ = new CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        public CxPageKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs build() {
            return $;
        }
    }

}
