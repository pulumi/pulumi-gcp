// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTriggerBuildSecret {
    /**
     * @return Cloud KMS key name to use to decrypt these envs.
     * 
     */
    private String kmsKeyName;
    /**
     * @return Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build&#39;s secrets,
     * and must be used by at least one build step. Values can be at most 64 KB in size.
     * There can be at most 100 secret values across all of a build&#39;s secrets.
     * 
     */
    private Map<String,String> secretEnv;

    private GetTriggerBuildSecret() {}
    /**
     * @return Cloud KMS key name to use to decrypt these envs.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return Map of environment variable name to its encrypted value.
     * Secret environment variables must be unique across all of a build&#39;s secrets,
     * and must be used by at least one build step. Values can be at most 64 KB in size.
     * There can be at most 100 secret values across all of a build&#39;s secrets.
     * 
     */
    public Map<String,String> secretEnv() {
        return this.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuildSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        private Map<String,String> secretEnv;
        public Builder() {}
        public Builder(GetTriggerBuildSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSecret", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder secretEnv(Map<String,String> secretEnv) {
            if (secretEnv == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSecret", "secretEnv");
            }
            this.secretEnv = secretEnv;
            return this;
        }
        public GetTriggerBuildSecret build() {
            final var _resultValue = new GetTriggerBuildSecret();
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.secretEnv = secretEnv;
            return _resultValue;
        }
    }
}
