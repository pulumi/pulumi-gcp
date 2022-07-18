// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs Empty = new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs();

    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs() {}

    private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs $;

        public Builder() {
            $ = new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs();
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
            $ = new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockArgs build() {
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            return $;
        }
    }

}