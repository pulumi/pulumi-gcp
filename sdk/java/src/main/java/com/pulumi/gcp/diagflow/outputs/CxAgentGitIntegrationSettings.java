// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxAgentGitIntegrationSettingsGithubSettings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxAgentGitIntegrationSettings {
    /**
     * @return Settings of integration with GitHub.
     * Structure is documented below.
     * 
     */
    private @Nullable CxAgentGitIntegrationSettingsGithubSettings githubSettings;

    private CxAgentGitIntegrationSettings() {}
    /**
     * @return Settings of integration with GitHub.
     * Structure is documented below.
     * 
     */
    public Optional<CxAgentGitIntegrationSettingsGithubSettings> githubSettings() {
        return Optional.ofNullable(this.githubSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentGitIntegrationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CxAgentGitIntegrationSettingsGithubSettings githubSettings;
        public Builder() {}
        public Builder(CxAgentGitIntegrationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.githubSettings = defaults.githubSettings;
        }

        @CustomType.Setter
        public Builder githubSettings(@Nullable CxAgentGitIntegrationSettingsGithubSettings githubSettings) {

            this.githubSettings = githubSettings;
            return this;
        }
        public CxAgentGitIntegrationSettings build() {
            final var _resultValue = new CxAgentGitIntegrationSettings();
            _resultValue.githubSettings = githubSettings;
            return _resultValue;
        }
    }
}
