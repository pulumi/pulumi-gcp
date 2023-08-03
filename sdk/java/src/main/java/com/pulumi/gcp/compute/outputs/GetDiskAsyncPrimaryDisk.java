// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDiskAsyncPrimaryDisk {
    private String disk;

    private GetDiskAsyncPrimaryDisk() {}
    public String disk() {
        return this.disk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskAsyncPrimaryDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String disk;
        public Builder() {}
        public Builder(GetDiskAsyncPrimaryDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
        }

        @CustomType.Setter
        public Builder disk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        public GetDiskAsyncPrimaryDisk build() {
            final var o = new GetDiskAsyncPrimaryDisk();
            o.disk = disk;
            return o;
        }
    }
}