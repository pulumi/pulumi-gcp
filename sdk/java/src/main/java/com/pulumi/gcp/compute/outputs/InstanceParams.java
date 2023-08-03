// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InstanceParams {
    /**
     * @return A tag is a key-value pair that can be attached to a Google Cloud resource. You can use tags to conditionally allow or deny policies based on whether a resource has a specific tag.
     * 
     */
    private @Nullable Map<String,Object> resourceManagerTags;

    private InstanceParams() {}
    /**
     * @return A tag is a key-value pair that can be attached to a Google Cloud resource. You can use tags to conditionally allow or deny policies based on whether a resource has a specific tag.
     * 
     */
    public Map<String,Object> resourceManagerTags() {
        return this.resourceManagerTags == null ? Map.of() : this.resourceManagerTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> resourceManagerTags;
        public Builder() {}
        public Builder(InstanceParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceManagerTags = defaults.resourceManagerTags;
        }

        @CustomType.Setter
        public Builder resourceManagerTags(@Nullable Map<String,Object> resourceManagerTags) {
            this.resourceManagerTags = resourceManagerTags;
            return this;
        }
        public InstanceParams build() {
            final var o = new InstanceParams();
            o.resourceManagerTags = resourceManagerTags;
            return o;
        }
    }
}