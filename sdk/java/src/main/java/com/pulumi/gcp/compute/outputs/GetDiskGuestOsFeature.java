// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDiskGuestOsFeature {
    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk.
     * 
     */
    private String type;

    private GetDiskGuestOsFeature() {}
    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskGuestOsFeature defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(GetDiskGuestOsFeature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDiskGuestOsFeature", "type");
            }
            this.type = type;
            return this;
        }
        public GetDiskGuestOsFeature build() {
            final var _resultValue = new GetDiskGuestOsFeature();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
