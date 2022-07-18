// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionSecretVolumeVersion {
    private final String path;
    private final String version;

    @CustomType.Constructor
    private GetFunctionSecretVolumeVersion(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("version") String version) {
        this.path = path;
        this.version = version;
    }

    public String path() {
        return this.path;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionSecretVolumeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionSecretVolumeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetFunctionSecretVolumeVersion build() {
            return new GetFunctionSecretVolumeVersion(path, version);
        }
    }
}