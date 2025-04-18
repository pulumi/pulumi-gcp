// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkFirewallPolicyPacketMirroringRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkFirewallPolicyPacketMirroringRuleMatchArgs Empty = new NetworkFirewallPolicyPacketMirroringRuleMatchArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges")
    private @Nullable Output<List<String>> destIpRanges;

    /**
     * @return CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> destIpRanges() {
        return Optional.ofNullable(this.destIpRanges);
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_match_layer4_configs&#34;&gt;&lt;/a&gt;The `layer4_configs` block supports:
     * 
     */
    @Import(name="layer4Configs", required=true)
    private Output<List<NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs>> layer4Configs;

    /**
     * @return Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_match_layer4_configs&#34;&gt;&lt;/a&gt;The `layer4_configs` block supports:
     * 
     */
    public Output<List<NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs>> layer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges")
    private @Nullable Output<List<String>> srcIpRanges;

    /**
     * @return CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    public Optional<Output<List<String>>> srcIpRanges() {
        return Optional.ofNullable(this.srcIpRanges);
    }

    private NetworkFirewallPolicyPacketMirroringRuleMatchArgs() {}

    private NetworkFirewallPolicyPacketMirroringRuleMatchArgs(NetworkFirewallPolicyPacketMirroringRuleMatchArgs $) {
        this.destIpRanges = $.destIpRanges;
        this.layer4Configs = $.layer4Configs;
        this.srcIpRanges = $.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkFirewallPolicyPacketMirroringRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkFirewallPolicyPacketMirroringRuleMatchArgs $;

        public Builder() {
            $ = new NetworkFirewallPolicyPacketMirroringRuleMatchArgs();
        }

        public Builder(NetworkFirewallPolicyPacketMirroringRuleMatchArgs defaults) {
            $ = new NetworkFirewallPolicyPacketMirroringRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            $.destIpRanges = destIpRanges;
            return this;
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(List<String> destIpRanges) {
            return destIpRanges(Output.of(destIpRanges));
        }

        /**
         * @param destIpRanges CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_match_layer4_configs&#34;&gt;&lt;/a&gt;The `layer4_configs` block supports:
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(Output<List<NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs>> layer4Configs) {
            $.layer4Configs = layer4Configs;
            return this;
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_match_layer4_configs&#34;&gt;&lt;/a&gt;The `layer4_configs` block supports:
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(List<NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs> layer4Configs) {
            return layer4Configs(Output.of(layer4Configs));
        }

        /**
         * @param layer4Configs Pairs of IP protocols and ports that the rule should match.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_match_layer4_configs&#34;&gt;&lt;/a&gt;The `layer4_configs` block supports:
         * 
         * @return builder
         * 
         */
        public Builder layer4Configs(NetworkFirewallPolicyPacketMirroringRuleMatchLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            $.srcIpRanges = srcIpRanges;
            return this;
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(List<String> srcIpRanges) {
            return srcIpRanges(Output.of(srcIpRanges));
        }

        /**
         * @param srcIpRanges CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
         * 
         * @return builder
         * 
         */
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }

        public NetworkFirewallPolicyPacketMirroringRuleMatchArgs build() {
            if ($.layer4Configs == null) {
                throw new MissingRequiredPropertyException("NetworkFirewallPolicyPacketMirroringRuleMatchArgs", "layer4Configs");
            }
            return $;
        }
    }

}
