// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecVolumeSecretItem {
    private final String key;
    private final Integer mode;
    private final String path;

    @CustomType.Constructor
    private GetServiceTemplateSpecVolumeSecretItem(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("mode") Integer mode,
        @CustomType.Parameter("path") String path) {
        this.key = key;
        this.mode = mode;
        this.path = path;
    }

    public String key() {
        return this.key;
    }
    public Integer mode() {
        return this.mode;
    }
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolumeSecretItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Integer mode;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecVolumeSecretItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder mode(Integer mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public GetServiceTemplateSpecVolumeSecretItem build() {
            return new GetServiceTemplateSpecVolumeSecretItem(key, mode, path);
        }
    }
}