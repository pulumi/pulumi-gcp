// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.NetworkFirewallPolicyRuleMatchLayer4Config;
import com.pulumi.gcp.compute.outputs.NetworkFirewallPolicyRuleMatchSrcSecureTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkFirewallPolicyRuleMatch {
    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    private @Nullable List<String> destIpRanges;
    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * 
     */
    private List<NetworkFirewallPolicyRuleMatchLayer4Config> layer4Configs;
    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    private @Nullable List<String> srcIpRanges;
    /**
     * @return List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE, and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    private @Nullable List<NetworkFirewallPolicyRuleMatchSrcSecureTag> srcSecureTags;

    private NetworkFirewallPolicyRuleMatch() {}
    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    public List<String> destIpRanges() {
        return this.destIpRanges == null ? List.of() : this.destIpRanges;
    }
    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * 
     */
    public List<NetworkFirewallPolicyRuleMatchLayer4Config> layer4Configs() {
        return this.layer4Configs;
    }
    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    public List<String> srcIpRanges() {
        return this.srcIpRanges == null ? List.of() : this.srcIpRanges;
    }
    /**
     * @return List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE, and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    public List<NetworkFirewallPolicyRuleMatchSrcSecureTag> srcSecureTags() {
        return this.srcSecureTags == null ? List.of() : this.srcSecureTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFirewallPolicyRuleMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> destIpRanges;
        private List<NetworkFirewallPolicyRuleMatchLayer4Config> layer4Configs;
        private @Nullable List<String> srcIpRanges;
        private @Nullable List<NetworkFirewallPolicyRuleMatchSrcSecureTag> srcSecureTags;
        public Builder() {}
        public Builder(NetworkFirewallPolicyRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        @CustomType.Setter
        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        @CustomType.Setter
        public Builder layer4Configs(List<NetworkFirewallPolicyRuleMatchLayer4Config> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(NetworkFirewallPolicyRuleMatchLayer4Config... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        @CustomType.Setter
        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }
        @CustomType.Setter
        public Builder srcSecureTags(@Nullable List<NetworkFirewallPolicyRuleMatchSrcSecureTag> srcSecureTags) {
            this.srcSecureTags = srcSecureTags;
            return this;
        }
        public Builder srcSecureTags(NetworkFirewallPolicyRuleMatchSrcSecureTag... srcSecureTags) {
            return srcSecureTags(List.of(srcSecureTags));
        }
        public NetworkFirewallPolicyRuleMatch build() {
            final var o = new NetworkFirewallPolicyRuleMatch();
            o.destIpRanges = destIpRanges;
            o.layer4Configs = layer4Configs;
            o.srcIpRanges = srcIpRanges;
            o.srcSecureTags = srcSecureTags;
            return o;
        }
    }
}