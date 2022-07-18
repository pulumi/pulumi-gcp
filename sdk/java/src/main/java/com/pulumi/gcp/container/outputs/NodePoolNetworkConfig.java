// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNetworkConfig {
    private final @Nullable Boolean createPodRange;
    private final @Nullable String podIpv4CidrBlock;
    private final String podRange;

    @CustomType.Constructor
    private NodePoolNetworkConfig(
        @CustomType.Parameter("createPodRange") @Nullable Boolean createPodRange,
        @CustomType.Parameter("podIpv4CidrBlock") @Nullable String podIpv4CidrBlock,
        @CustomType.Parameter("podRange") String podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    public Optional<Boolean> createPodRange() {
        return Optional.ofNullable(this.createPodRange);
    }
    public Optional<String> podIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }
    public String podRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean createPodRange;
        private @Nullable String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }
        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }
        public Builder podRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }        public NodePoolNetworkConfig build() {
            return new NodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}