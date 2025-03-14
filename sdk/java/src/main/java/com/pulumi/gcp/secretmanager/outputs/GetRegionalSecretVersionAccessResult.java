// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionalSecretVersionAccessResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean isSecretDataBase64;
    private String location;
    /**
     * @return The resource name of the regional SecretVersion. Format:
     * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
     */
    private String name;
    private String project;
    private String secret;
    /**
     * @return The secret data. No larger than 64KiB.
     * 
     */
    private String secretData;
    private String version;

    private GetRegionalSecretVersionAccessResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> isSecretDataBase64() {
        return Optional.ofNullable(this.isSecretDataBase64);
    }
    public String location() {
        return this.location;
    }
    /**
     * @return The resource name of the regional SecretVersion. Format:
     * `projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}/versions/{{version}}`
     * 
     */
    public String name() {
        return this.name;
    }
    public String project() {
        return this.project;
    }
    public String secret() {
        return this.secret;
    }
    /**
     * @return The secret data. No larger than 64KiB.
     * 
     */
    public String secretData() {
        return this.secretData;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionalSecretVersionAccessResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Boolean isSecretDataBase64;
        private String location;
        private String name;
        private String project;
        private String secret;
        private String secretData;
        private String version;
        public Builder() {}
        public Builder(GetRegionalSecretVersionAccessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isSecretDataBase64 = defaults.isSecretDataBase64;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.secretData = defaults.secretData;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isSecretDataBase64(@Nullable Boolean isSecretDataBase64) {

            this.isSecretDataBase64 = isSecretDataBase64;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder secretData(String secretData) {
            if (secretData == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "secretData");
            }
            this.secretData = secretData;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretVersionAccessResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetRegionalSecretVersionAccessResult build() {
            final var _resultValue = new GetRegionalSecretVersionAccessResult();
            _resultValue.id = id;
            _resultValue.isSecretDataBase64 = isSecretDataBase64;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.secret = secret;
            _resultValue.secretData = secretData;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
