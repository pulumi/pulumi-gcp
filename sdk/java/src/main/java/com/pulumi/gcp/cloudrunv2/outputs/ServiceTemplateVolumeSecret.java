// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateVolumeSecret {
    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
     * 
     */
    private @Nullable Integer defaultMode;
    /**
     * @return If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateVolumeSecretItem> items;
    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    private String secret;

    private ServiceTemplateVolumeSecret() {}
    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
     * 
     */
    public Optional<Integer> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * @return If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateVolumeSecretItem> items() {
        return this.items == null ? List.of() : this.items;
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

    public static Builder builder(ServiceTemplateVolumeSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer defaultMode;
        private @Nullable List<ServiceTemplateVolumeSecretItem> items;
        private String secret;
        public Builder() {}
        public Builder(ServiceTemplateVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        @CustomType.Setter
        public Builder items(@Nullable List<ServiceTemplateVolumeSecretItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(ServiceTemplateVolumeSecretItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public ServiceTemplateVolumeSecret build() {
            final var o = new ServiceTemplateVolumeSecret();
            o.defaultMode = defaultMode;
            o.items = items;
            o.secret = secret;
            return o;
        }
    }
}