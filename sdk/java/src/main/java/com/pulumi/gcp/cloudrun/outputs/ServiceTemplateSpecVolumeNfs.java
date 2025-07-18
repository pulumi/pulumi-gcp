// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecVolumeNfs {
    /**
     * @return Path exported by the NFS server
     * 
     */
    private String path;
    /**
     * @return If true, mount the NFS volume as read only in all mounts. Defaults to false.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return IP address or hostname of the NFS server
     * 
     */
    private String server;

    private ServiceTemplateSpecVolumeNfs() {}
    /**
     * @return Path exported by the NFS server
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return If true, mount the NFS volume as read only in all mounts. Defaults to false.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return IP address or hostname of the NFS server
     * 
     */
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolumeNfs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable Boolean readOnly;
        private String server;
        public Builder() {}
        public Builder(ServiceTemplateSpecVolumeNfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("ServiceTemplateSpecVolumeNfs", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            if (server == null) {
              throw new MissingRequiredPropertyException("ServiceTemplateSpecVolumeNfs", "server");
            }
            this.server = server;
            return this;
        }
        public ServiceTemplateSpecVolumeNfs build() {
            final var _resultValue = new ServiceTemplateSpecVolumeNfs();
            _resultValue.path = path;
            _resultValue.readOnly = readOnly;
            _resultValue.server = server;
            return _resultValue;
        }
    }
}
