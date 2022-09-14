// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionServiceConfigSecretEnvironmentVariable {
    /**
     * @return Name of the environment variable.
     * 
     */
    private String key;
    /**
     * @return Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    private String projectId;
    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    private String secret;
    /**
     * @return Version of the secret (version number or the string &#39;latest&#39;). It is preferable to use latest version with secret volumes as secret value changes are reflected immediately.
     * 
     */
    private String version;

    private FunctionServiceConfigSecretEnvironmentVariable() {}
    /**
     * @return Name of the environment variable.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    public String secret() {
        return this.secret;
    }
    /**
     * @return Version of the secret (version number or the string &#39;latest&#39;). It is preferable to use latest version with secret volumes as secret value changes are reflected immediately.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionServiceConfigSecretEnvironmentVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String projectId;
        private String secret;
        private String version;
        public Builder() {}
        public Builder(FunctionServiceConfigSecretEnvironmentVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.projectId = defaults.projectId;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public FunctionServiceConfigSecretEnvironmentVariable build() {
            final var o = new FunctionServiceConfigSecretEnvironmentVariable();
            o.key = key;
            o.projectId = projectId;
            o.secret = secret;
            o.version = version;
            return o;
        }
    }
}