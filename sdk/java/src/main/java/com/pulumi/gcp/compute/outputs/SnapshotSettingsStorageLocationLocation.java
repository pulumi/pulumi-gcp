// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SnapshotSettingsStorageLocationLocation {
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String location;
    /**
     * @return Name of the location. It should be one of the Cloud Storage buckets.
     * Only one location can be specified. (should match location)
     * 
     */
    private String name;

    private SnapshotSettingsStorageLocationLocation() {}
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Name of the location. It should be one of the Cloud Storage buckets.
     * Only one location can be specified. (should match location)
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSettingsStorageLocationLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String location;
        private String name;
        public Builder() {}
        public Builder(SnapshotSettingsStorageLocationLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("SnapshotSettingsStorageLocationLocation", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SnapshotSettingsStorageLocationLocation", "name");
            }
            this.name = name;
            return this;
        }
        public SnapshotSettingsStorageLocationLocation build() {
            final var _resultValue = new SnapshotSettingsStorageLocationLocation();
            _resultValue.location = location;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
