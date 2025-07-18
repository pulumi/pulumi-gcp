// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxGenerativeSettingsKnowledgeConnectorSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxGenerativeSettingsKnowledgeConnectorSettingsArgs Empty = new CxGenerativeSettingsKnowledgeConnectorSettingsArgs();

    /**
     * Name of the virtual agent. Used for LLM prompt. Can be left empty.
     * 
     */
    @Import(name="agent")
    private @Nullable Output<String> agent;

    /**
     * @return Name of the virtual agent. Used for LLM prompt. Can be left empty.
     * 
     */
    public Optional<Output<String>> agent() {
        return Optional.ofNullable(this.agent);
    }

    /**
     * Identity of the agent, e.g. &#34;virtual agent&#34;, &#34;AI assistant&#34;.
     * 
     */
    @Import(name="agentIdentity")
    private @Nullable Output<String> agentIdentity;

    /**
     * @return Identity of the agent, e.g. &#34;virtual agent&#34;, &#34;AI assistant&#34;.
     * 
     */
    public Optional<Output<String>> agentIdentity() {
        return Optional.ofNullable(this.agentIdentity);
    }

    /**
     * Agent scope, e.g. &#34;Example company website&#34;, &#34;internal Example company website for employees&#34;, &#34;manual of car owner&#34;.
     * 
     */
    @Import(name="agentScope")
    private @Nullable Output<String> agentScope;

    /**
     * @return Agent scope, e.g. &#34;Example company website&#34;, &#34;internal Example company website for employees&#34;, &#34;manual of car owner&#34;.
     * 
     */
    public Optional<Output<String>> agentScope() {
        return Optional.ofNullable(this.agentScope);
    }

    /**
     * Name of the company, organization or other entity that the agent represents. Used for knowledge connector LLM prompt and for knowledge search.
     * 
     */
    @Import(name="business")
    private @Nullable Output<String> business;

    /**
     * @return Name of the company, organization or other entity that the agent represents. Used for knowledge connector LLM prompt and for knowledge search.
     * 
     */
    public Optional<Output<String>> business() {
        return Optional.ofNullable(this.business);
    }

    /**
     * Company description, used for LLM prompt, e.g. &#34;a family company selling freshly roasted coffee beans&#34;.``
     * 
     */
    @Import(name="businessDescription")
    private @Nullable Output<String> businessDescription;

    /**
     * @return Company description, used for LLM prompt, e.g. &#34;a family company selling freshly roasted coffee beans&#34;.``
     * 
     */
    public Optional<Output<String>> businessDescription() {
        return Optional.ofNullable(this.businessDescription);
    }

    /**
     * Whether to disable fallback to Data Store search results (in case the LLM couldn&#39;t pick a proper answer). Per default the feature is enabled.
     * 
     */
    @Import(name="disableDataStoreFallback")
    private @Nullable Output<Boolean> disableDataStoreFallback;

    /**
     * @return Whether to disable fallback to Data Store search results (in case the LLM couldn&#39;t pick a proper answer). Per default the feature is enabled.
     * 
     */
    public Optional<Output<Boolean>> disableDataStoreFallback() {
        return Optional.ofNullable(this.disableDataStoreFallback);
    }

    private CxGenerativeSettingsKnowledgeConnectorSettingsArgs() {}

    private CxGenerativeSettingsKnowledgeConnectorSettingsArgs(CxGenerativeSettingsKnowledgeConnectorSettingsArgs $) {
        this.agent = $.agent;
        this.agentIdentity = $.agentIdentity;
        this.agentScope = $.agentScope;
        this.business = $.business;
        this.businessDescription = $.businessDescription;
        this.disableDataStoreFallback = $.disableDataStoreFallback;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxGenerativeSettingsKnowledgeConnectorSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxGenerativeSettingsKnowledgeConnectorSettingsArgs $;

        public Builder() {
            $ = new CxGenerativeSettingsKnowledgeConnectorSettingsArgs();
        }

        public Builder(CxGenerativeSettingsKnowledgeConnectorSettingsArgs defaults) {
            $ = new CxGenerativeSettingsKnowledgeConnectorSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agent Name of the virtual agent. Used for LLM prompt. Can be left empty.
         * 
         * @return builder
         * 
         */
        public Builder agent(@Nullable Output<String> agent) {
            $.agent = agent;
            return this;
        }

        /**
         * @param agent Name of the virtual agent. Used for LLM prompt. Can be left empty.
         * 
         * @return builder
         * 
         */
        public Builder agent(String agent) {
            return agent(Output.of(agent));
        }

        /**
         * @param agentIdentity Identity of the agent, e.g. &#34;virtual agent&#34;, &#34;AI assistant&#34;.
         * 
         * @return builder
         * 
         */
        public Builder agentIdentity(@Nullable Output<String> agentIdentity) {
            $.agentIdentity = agentIdentity;
            return this;
        }

        /**
         * @param agentIdentity Identity of the agent, e.g. &#34;virtual agent&#34;, &#34;AI assistant&#34;.
         * 
         * @return builder
         * 
         */
        public Builder agentIdentity(String agentIdentity) {
            return agentIdentity(Output.of(agentIdentity));
        }

        /**
         * @param agentScope Agent scope, e.g. &#34;Example company website&#34;, &#34;internal Example company website for employees&#34;, &#34;manual of car owner&#34;.
         * 
         * @return builder
         * 
         */
        public Builder agentScope(@Nullable Output<String> agentScope) {
            $.agentScope = agentScope;
            return this;
        }

        /**
         * @param agentScope Agent scope, e.g. &#34;Example company website&#34;, &#34;internal Example company website for employees&#34;, &#34;manual of car owner&#34;.
         * 
         * @return builder
         * 
         */
        public Builder agentScope(String agentScope) {
            return agentScope(Output.of(agentScope));
        }

        /**
         * @param business Name of the company, organization or other entity that the agent represents. Used for knowledge connector LLM prompt and for knowledge search.
         * 
         * @return builder
         * 
         */
        public Builder business(@Nullable Output<String> business) {
            $.business = business;
            return this;
        }

        /**
         * @param business Name of the company, organization or other entity that the agent represents. Used for knowledge connector LLM prompt and for knowledge search.
         * 
         * @return builder
         * 
         */
        public Builder business(String business) {
            return business(Output.of(business));
        }

        /**
         * @param businessDescription Company description, used for LLM prompt, e.g. &#34;a family company selling freshly roasted coffee beans&#34;.``
         * 
         * @return builder
         * 
         */
        public Builder businessDescription(@Nullable Output<String> businessDescription) {
            $.businessDescription = businessDescription;
            return this;
        }

        /**
         * @param businessDescription Company description, used for LLM prompt, e.g. &#34;a family company selling freshly roasted coffee beans&#34;.``
         * 
         * @return builder
         * 
         */
        public Builder businessDescription(String businessDescription) {
            return businessDescription(Output.of(businessDescription));
        }

        /**
         * @param disableDataStoreFallback Whether to disable fallback to Data Store search results (in case the LLM couldn&#39;t pick a proper answer). Per default the feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder disableDataStoreFallback(@Nullable Output<Boolean> disableDataStoreFallback) {
            $.disableDataStoreFallback = disableDataStoreFallback;
            return this;
        }

        /**
         * @param disableDataStoreFallback Whether to disable fallback to Data Store search results (in case the LLM couldn&#39;t pick a proper answer). Per default the feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder disableDataStoreFallback(Boolean disableDataStoreFallback) {
            return disableDataStoreFallback(Output.of(disableDataStoreFallback));
        }

        public CxGenerativeSettingsKnowledgeConnectorSettingsArgs build() {
            return $;
        }
    }

}
