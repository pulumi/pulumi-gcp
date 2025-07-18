// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PacketMirroringMirroredResourcesInstance {
    /**
     * @return The URL of the instances where this rule should be active.
     * 
     */
    private String url;

    private PacketMirroringMirroredResourcesInstance() {}
    /**
     * @return The URL of the instances where this rule should be active.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String url;
        public Builder() {}
        public Builder(PacketMirroringMirroredResourcesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("PacketMirroringMirroredResourcesInstance", "url");
            }
            this.url = url;
            return this;
        }
        public PacketMirroringMirroredResourcesInstance build() {
            final var _resultValue = new PacketMirroringMirroredResourcesInstance();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
