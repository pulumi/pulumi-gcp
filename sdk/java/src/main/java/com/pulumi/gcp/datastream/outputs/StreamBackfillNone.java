// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class StreamBackfillNone {
    private StreamBackfillNone() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillNone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(StreamBackfillNone defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public StreamBackfillNone build() {
            final var o = new StreamBackfillNone();
            return o;
        }
    }
}