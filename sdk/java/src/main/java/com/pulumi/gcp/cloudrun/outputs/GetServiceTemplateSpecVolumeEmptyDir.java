// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecVolumeEmptyDir {
    private String medium;
    private String sizeLimit;

    private GetServiceTemplateSpecVolumeEmptyDir() {}
    public String medium() {
        return this.medium;
    }
    public String sizeLimit() {
        return this.sizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolumeEmptyDir defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String medium;
        private String sizeLimit;
        public Builder() {}
        public Builder(GetServiceTemplateSpecVolumeEmptyDir defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.medium = defaults.medium;
    	      this.sizeLimit = defaults.sizeLimit;
        }

        @CustomType.Setter
        public Builder medium(String medium) {
            this.medium = Objects.requireNonNull(medium);
            return this;
        }
        @CustomType.Setter
        public Builder sizeLimit(String sizeLimit) {
            this.sizeLimit = Objects.requireNonNull(sizeLimit);
            return this;
        }
        public GetServiceTemplateSpecVolumeEmptyDir build() {
            final var o = new GetServiceTemplateSpecVolumeEmptyDir();
            o.medium = medium;
            o.sizeLimit = sizeLimit;
            return o;
        }
    }
}