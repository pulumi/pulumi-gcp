// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionServiceConfigSecretVolumeVersion;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionServiceConfigSecretVolume {
    /**
     * @return The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
     * 
     */
    private String mountPath;
    /**
     * @return Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    private String projectId;
    /**
     * @return Name of the secret in secret manager (not the full resource name).
     * 
     */
    private String secret;
    /**
     * @return List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     * 
     */
    private List<GetFunctionServiceConfigSecretVolumeVersion> versions;

    private GetFunctionServiceConfigSecretVolume() {}
    /**
     * @return The path within the container to mount the secret volume. For example, setting the mountPath as /etc/secrets would mount the secret value files under the /etc/secrets directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
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
     * @return List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     * 
     */
    public List<GetFunctionServiceConfigSecretVolumeVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionServiceConfigSecretVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mountPath;
        private String projectId;
        private String secret;
        private List<GetFunctionServiceConfigSecretVolumeVersion> versions;
        public Builder() {}
        public Builder(GetFunctionServiceConfigSecretVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.projectId = defaults.projectId;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder mountPath(String mountPath) {
            if (mountPath == null) {
              throw new MissingRequiredPropertyException("GetFunctionServiceConfigSecretVolume", "mountPath");
            }
            this.mountPath = mountPath;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFunctionServiceConfigSecretVolume", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetFunctionServiceConfigSecretVolume", "secret");
            }
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder versions(List<GetFunctionServiceConfigSecretVolumeVersion> versions) {
            if (versions == null) {
              throw new MissingRequiredPropertyException("GetFunctionServiceConfigSecretVolume", "versions");
            }
            this.versions = versions;
            return this;
        }
        public Builder versions(GetFunctionServiceConfigSecretVolumeVersion... versions) {
            return versions(List.of(versions));
        }
        public GetFunctionServiceConfigSecretVolume build() {
            final var _resultValue = new GetFunctionServiceConfigSecretVolume();
            _resultValue.mountPath = mountPath;
            _resultValue.projectId = projectId;
            _resultValue.secret = secret;
            _resultValue.versions = versions;
            return _resultValue;
        }
    }
}
