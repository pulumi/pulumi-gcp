// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolTemplateVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkerPoolTemplateVolumeSecret {
    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
     * 
     */
    private Integer defaultMode;
    /**
     * @return If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * 
     */
    private List<GetWorkerPoolTemplateVolumeSecretItem> items;
    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    private String secret;

    private GetWorkerPoolTemplateVolumeSecret() {}
    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
     * 
     */
    public Integer defaultMode() {
        return this.defaultMode;
    }
    /**
     * @return If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * 
     */
    public List<GetWorkerPoolTemplateVolumeSecretItem> items() {
        return this.items;
    }
    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolTemplateVolumeSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer defaultMode;
        private List<GetWorkerPoolTemplateVolumeSecretItem> items;
        private String secret;
        public Builder() {}
        public Builder(GetWorkerPoolTemplateVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder defaultMode(Integer defaultMode) {
            if (defaultMode == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateVolumeSecret", "defaultMode");
            }
            this.defaultMode = defaultMode;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetWorkerPoolTemplateVolumeSecretItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateVolumeSecret", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetWorkerPoolTemplateVolumeSecretItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateVolumeSecret", "secret");
            }
            this.secret = secret;
            return this;
        }
        public GetWorkerPoolTemplateVolumeSecret build() {
            final var _resultValue = new GetWorkerPoolTemplateVolumeSecret();
            _resultValue.defaultMode = defaultMode;
            _resultValue.items = items;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
