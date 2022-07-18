// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs Empty = new InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs();

    @Import(name="ipCidrRange", required=true)
    private Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }

    @Import(name="subnetworkRangeName")
    private @Nullable Output<String> subnetworkRangeName;

    public Optional<Output<String>> subnetworkRangeName() {
        return Optional.ofNullable(this.subnetworkRangeName);
    }

    private InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs() {}

    private InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs(InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs $) {
        this.ipCidrRange = $.ipCidrRange;
        this.subnetworkRangeName = $.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs();
        }

        public Builder(InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs defaults) {
            $ = new InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipCidrRange(Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder subnetworkRangeName(@Nullable Output<String> subnetworkRangeName) {
            $.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        public Builder subnetworkRangeName(String subnetworkRangeName) {
            return subnetworkRangeName(Output.of(subnetworkRangeName));
        }

        public InstanceFromMachineImageNetworkInterfaceAliasIpRangeArgs build() {
            $.ipCidrRange = Objects.requireNonNull($.ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
            return $;
        }
    }

}