// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerBuildOptionVolume {
    private String name;
    private String path;

    private GetTriggerBuildOptionVolume() {}
    public String name() {
        return this.name;
    }
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuildOptionVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String path;
        public Builder() {}
        public Builder(GetTriggerBuildOptionVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GetTriggerBuildOptionVolume build() {
            final var o = new GetTriggerBuildOptionVolume();
            o.name = name;
            o.path = path;
            return o;
        }
    }
}