// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TriggerBuildAvailableSecretsSecretManager {
    /**
     * @return Environment variable name to associate with the secret. Secret environment
     * variables must be unique across all of a build&#39;s secrets, and must be used
     * by at least one build step.
     * 
     */
    private String env;
    /**
     * @return Resource name of the SecretVersion. In format: projects/*&#47;secrets/*&#47;versions/*
     * 
     */
    private String versionName;

    private TriggerBuildAvailableSecretsSecretManager() {}
    /**
     * @return Environment variable name to associate with the secret. Secret environment
     * variables must be unique across all of a build&#39;s secrets, and must be used
     * by at least one build step.
     * 
     */
    public String env() {
        return this.env;
    }
    /**
     * @return Resource name of the SecretVersion. In format: projects/*&#47;secrets/*&#47;versions/*
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildAvailableSecretsSecretManager defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String env;
        private String versionName;
        public Builder() {}
        public Builder(TriggerBuildAvailableSecretsSecretManager defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        @CustomType.Setter
        public Builder env(String env) {
            if (env == null) {
              throw new MissingRequiredPropertyException("TriggerBuildAvailableSecretsSecretManager", "env");
            }
            this.env = env;
            return this;
        }
        @CustomType.Setter
        public Builder versionName(String versionName) {
            if (versionName == null) {
              throw new MissingRequiredPropertyException("TriggerBuildAvailableSecretsSecretManager", "versionName");
            }
            this.versionName = versionName;
            return this;
        }
        public TriggerBuildAvailableSecretsSecretManager build() {
            final var _resultValue = new TriggerBuildAvailableSecretsSecretManager();
            _resultValue.env = env;
            _resultValue.versionName = versionName;
            return _resultValue;
        }
    }
}
