// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TlsRouteRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsRouteRuleMatchArgs Empty = new TlsRouteRuleMatchArgs();

    /**
     * ALPN (Application-Layer Protocol Negotiation) to match against. Examples: &#34;http/1.1&#34;, &#34;h2&#34;. At least one of sniHost and alpn is required. Up to 5 alpns across all matches can be set.
     * 
     */
    @Import(name="alpns")
    private @Nullable Output<List<String>> alpns;

    /**
     * @return ALPN (Application-Layer Protocol Negotiation) to match against. Examples: &#34;http/1.1&#34;, &#34;h2&#34;. At least one of sniHost and alpn is required. Up to 5 alpns across all matches can be set.
     * 
     */
    public Optional<Output<List<String>>> alpns() {
        return Optional.ofNullable(this.alpns);
    }

    /**
     * SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com.
     * Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sniHost and alpn is required. Up to 5 sni hosts across all matches can be set.
     * 
     */
    @Import(name="sniHosts")
    private @Nullable Output<List<String>> sniHosts;

    /**
     * @return SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com.
     * Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sniHost and alpn is required. Up to 5 sni hosts across all matches can be set.
     * 
     */
    public Optional<Output<List<String>>> sniHosts() {
        return Optional.ofNullable(this.sniHosts);
    }

    private TlsRouteRuleMatchArgs() {}

    private TlsRouteRuleMatchArgs(TlsRouteRuleMatchArgs $) {
        this.alpns = $.alpns;
        this.sniHosts = $.sniHosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsRouteRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsRouteRuleMatchArgs $;

        public Builder() {
            $ = new TlsRouteRuleMatchArgs();
        }

        public Builder(TlsRouteRuleMatchArgs defaults) {
            $ = new TlsRouteRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alpns ALPN (Application-Layer Protocol Negotiation) to match against. Examples: &#34;http/1.1&#34;, &#34;h2&#34;. At least one of sniHost and alpn is required. Up to 5 alpns across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder alpns(@Nullable Output<List<String>> alpns) {
            $.alpns = alpns;
            return this;
        }

        /**
         * @param alpns ALPN (Application-Layer Protocol Negotiation) to match against. Examples: &#34;http/1.1&#34;, &#34;h2&#34;. At least one of sniHost and alpn is required. Up to 5 alpns across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder alpns(List<String> alpns) {
            return alpns(Output.of(alpns));
        }

        /**
         * @param alpns ALPN (Application-Layer Protocol Negotiation) to match against. Examples: &#34;http/1.1&#34;, &#34;h2&#34;. At least one of sniHost and alpn is required. Up to 5 alpns across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder alpns(String... alpns) {
            return alpns(List.of(alpns));
        }

        /**
         * @param sniHosts SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com.
         * Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sniHost and alpn is required. Up to 5 sni hosts across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder sniHosts(@Nullable Output<List<String>> sniHosts) {
            $.sniHosts = sniHosts;
            return this;
        }

        /**
         * @param sniHosts SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com.
         * Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sniHost and alpn is required. Up to 5 sni hosts across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder sniHosts(List<String> sniHosts) {
            return sniHosts(Output.of(sniHosts));
        }

        /**
         * @param sniHosts SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com.
         * Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sniHost and alpn is required. Up to 5 sni hosts across all matches can be set.
         * 
         * @return builder
         * 
         */
        public Builder sniHosts(String... sniHosts) {
            return sniHosts(List.of(sniHosts));
        }

        public TlsRouteRuleMatchArgs build() {
            return $;
        }
    }

}
