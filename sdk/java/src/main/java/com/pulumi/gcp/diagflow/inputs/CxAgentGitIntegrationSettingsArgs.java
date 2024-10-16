// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsGithubSettingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxAgentGitIntegrationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxAgentGitIntegrationSettingsArgs Empty = new CxAgentGitIntegrationSettingsArgs();

    /**
     * Settings of integration with GitHub.
     * Structure is documented below.
     * 
     */
    @Import(name="githubSettings")
    private @Nullable Output<CxAgentGitIntegrationSettingsGithubSettingsArgs> githubSettings;

    /**
     * @return Settings of integration with GitHub.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentGitIntegrationSettingsGithubSettingsArgs>> githubSettings() {
        return Optional.ofNullable(this.githubSettings);
    }

    private CxAgentGitIntegrationSettingsArgs() {}

    private CxAgentGitIntegrationSettingsArgs(CxAgentGitIntegrationSettingsArgs $) {
        this.githubSettings = $.githubSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxAgentGitIntegrationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxAgentGitIntegrationSettingsArgs $;

        public Builder() {
            $ = new CxAgentGitIntegrationSettingsArgs();
        }

        public Builder(CxAgentGitIntegrationSettingsArgs defaults) {
            $ = new CxAgentGitIntegrationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param githubSettings Settings of integration with GitHub.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubSettings(@Nullable Output<CxAgentGitIntegrationSettingsGithubSettingsArgs> githubSettings) {
            $.githubSettings = githubSettings;
            return this;
        }

        /**
         * @param githubSettings Settings of integration with GitHub.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder githubSettings(CxAgentGitIntegrationSettingsGithubSettingsArgs githubSettings) {
            return githubSettings(Output.of(githubSettings));
        }

        public CxAgentGitIntegrationSettingsArgs build() {
            return $;
        }
    }

}
