// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.discoveryengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.discoveryengine.inputs.ChatEngineChatEngineConfigAgentCreationConfigArgs;
import java.util.Objects;


public final class ChatEngineChatEngineConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChatEngineChatEngineConfigArgs Empty = new ChatEngineChatEngineConfigArgs();

    /**
     * The configuration to generate the Dialogflow agent that is associated to this Engine.
     * Structure is documented below.
     * 
     */
    @Import(name="agentCreationConfig", required=true)
    private Output<ChatEngineChatEngineConfigAgentCreationConfigArgs> agentCreationConfig;

    /**
     * @return The configuration to generate the Dialogflow agent that is associated to this Engine.
     * Structure is documented below.
     * 
     */
    public Output<ChatEngineChatEngineConfigAgentCreationConfigArgs> agentCreationConfig() {
        return this.agentCreationConfig;
    }

    private ChatEngineChatEngineConfigArgs() {}

    private ChatEngineChatEngineConfigArgs(ChatEngineChatEngineConfigArgs $) {
        this.agentCreationConfig = $.agentCreationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChatEngineChatEngineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChatEngineChatEngineConfigArgs $;

        public Builder() {
            $ = new ChatEngineChatEngineConfigArgs();
        }

        public Builder(ChatEngineChatEngineConfigArgs defaults) {
            $ = new ChatEngineChatEngineConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentCreationConfig The configuration to generate the Dialogflow agent that is associated to this Engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder agentCreationConfig(Output<ChatEngineChatEngineConfigAgentCreationConfigArgs> agentCreationConfig) {
            $.agentCreationConfig = agentCreationConfig;
            return this;
        }

        /**
         * @param agentCreationConfig The configuration to generate the Dialogflow agent that is associated to this Engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder agentCreationConfig(ChatEngineChatEngineConfigAgentCreationConfigArgs agentCreationConfig) {
            return agentCreationConfig(Output.of(agentCreationConfig));
        }

        public ChatEngineChatEngineConfigArgs build() {
            if ($.agentCreationConfig == null) {
                throw new MissingRequiredPropertyException("ChatEngineChatEngineConfigArgs", "agentCreationConfig");
            }
            return $;
        }
    }

}
