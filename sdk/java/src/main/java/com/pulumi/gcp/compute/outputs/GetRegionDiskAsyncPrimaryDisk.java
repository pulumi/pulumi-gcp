// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionDiskAsyncPrimaryDisk {
    /**
     * @return Primary disk for asynchronous disk replication.
     * 
     */
    private String disk;

    private GetRegionDiskAsyncPrimaryDisk() {}
    /**
     * @return Primary disk for asynchronous disk replication.
     * 
     */
    public String disk() {
        return this.disk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionDiskAsyncPrimaryDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String disk;
        public Builder() {}
        public Builder(GetRegionDiskAsyncPrimaryDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
        }

        @CustomType.Setter
        public Builder disk(String disk) {
            if (disk == null) {
              throw new MissingRequiredPropertyException("GetRegionDiskAsyncPrimaryDisk", "disk");
            }
            this.disk = disk;
            return this;
        }
        public GetRegionDiskAsyncPrimaryDisk build() {
            final var _resultValue = new GetRegionDiskAsyncPrimaryDisk();
            _resultValue.disk = disk;
            return _resultValue;
        }
    }
}
