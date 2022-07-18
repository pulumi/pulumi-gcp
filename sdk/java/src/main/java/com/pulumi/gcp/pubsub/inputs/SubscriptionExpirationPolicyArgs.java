// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SubscriptionExpirationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionExpirationPolicyArgs Empty = new SubscriptionExpirationPolicyArgs();

    /**
     * Specifies the &#34;time-to-live&#34; duration for an associated resource. The
     * resource expires if it is not active for a period of ttl.
     * If ttl is not set, the associated resource never expires.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * Example - &#34;3.5s&#34;.
     * 
     */
    @Import(name="ttl", required=true)
    private Output<String> ttl;

    /**
     * @return Specifies the &#34;time-to-live&#34; duration for an associated resource. The
     * resource expires if it is not active for a period of ttl.
     * If ttl is not set, the associated resource never expires.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
     * Example - &#34;3.5s&#34;.
     * 
     */
    public Output<String> ttl() {
        return this.ttl;
    }

    private SubscriptionExpirationPolicyArgs() {}

    private SubscriptionExpirationPolicyArgs(SubscriptionExpirationPolicyArgs $) {
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionExpirationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionExpirationPolicyArgs $;

        public Builder() {
            $ = new SubscriptionExpirationPolicyArgs();
        }

        public Builder(SubscriptionExpirationPolicyArgs defaults) {
            $ = new SubscriptionExpirationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ttl Specifies the &#34;time-to-live&#34; duration for an associated resource. The
         * resource expires if it is not active for a period of ttl.
         * If ttl is not set, the associated resource never expires.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
         * Example - &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Specifies the &#34;time-to-live&#34; duration for an associated resource. The
         * resource expires if it is not active for a period of ttl.
         * If ttl is not set, the associated resource never expires.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;.
         * Example - &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
        }

        public SubscriptionExpirationPolicyArgs build() {
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            return $;
        }
    }

}