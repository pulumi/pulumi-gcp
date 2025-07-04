// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketIpFilterPublicNetworkSource {
    /**
     * @return The list of public IPv4 and IPv6 CIDR ranges that can access the bucket and its data.
     * 
     */
    private List<String> allowedIpCidrRanges;

    private BucketIpFilterPublicNetworkSource() {}
    /**
     * @return The list of public IPv4 and IPv6 CIDR ranges that can access the bucket and its data.
     * 
     */
    public List<String> allowedIpCidrRanges() {
        return this.allowedIpCidrRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIpFilterPublicNetworkSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedIpCidrRanges;
        public Builder() {}
        public Builder(BucketIpFilterPublicNetworkSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpCidrRanges = defaults.allowedIpCidrRanges;
        }

        @CustomType.Setter
        public Builder allowedIpCidrRanges(List<String> allowedIpCidrRanges) {
            if (allowedIpCidrRanges == null) {
              throw new MissingRequiredPropertyException("BucketIpFilterPublicNetworkSource", "allowedIpCidrRanges");
            }
            this.allowedIpCidrRanges = allowedIpCidrRanges;
            return this;
        }
        public Builder allowedIpCidrRanges(String... allowedIpCidrRanges) {
            return allowedIpCidrRanges(List.of(allowedIpCidrRanges));
        }
        public BucketIpFilterPublicNetworkSource build() {
            final var _resultValue = new BucketIpFilterPublicNetworkSource();
            _resultValue.allowedIpCidrRanges = allowedIpCidrRanges;
            return _resultValue;
        }
    }
}
