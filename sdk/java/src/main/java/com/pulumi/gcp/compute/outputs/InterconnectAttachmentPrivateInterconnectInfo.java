// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InterconnectAttachmentPrivateInterconnectInfo {
    /**
     * @return (Output)
     * 802.1q encapsulation tag to be used for traffic between
     * Google and the customer, going to and from this network and region.
     * 
     */
    private @Nullable Integer tag8021q;

    private InterconnectAttachmentPrivateInterconnectInfo() {}
    /**
     * @return (Output)
     * 802.1q encapsulation tag to be used for traffic between
     * Google and the customer, going to and from this network and region.
     * 
     */
    public Optional<Integer> tag8021q() {
        return Optional.ofNullable(this.tag8021q);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPrivateInterconnectInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer tag8021q;
        public Builder() {}
        public Builder(InterconnectAttachmentPrivateInterconnectInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag8021q = defaults.tag8021q;
        }

        @CustomType.Setter
        public Builder tag8021q(@Nullable Integer tag8021q) {

            this.tag8021q = tag8021q;
            return this;
        }
        public InterconnectAttachmentPrivateInterconnectInfo build() {
            final var _resultValue = new InterconnectAttachmentPrivateInterconnectInfo();
            _resultValue.tag8021q = tag8021q;
            return _resultValue;
        }
    }
}
