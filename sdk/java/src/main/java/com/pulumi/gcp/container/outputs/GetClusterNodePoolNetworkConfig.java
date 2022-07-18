// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolNetworkConfig {
    private final Boolean createPodRange;
    private final String podIpv4CidrBlock;
    private final String podRange;

    @CustomType.Constructor
    private GetClusterNodePoolNetworkConfig(
        @CustomType.Parameter("createPodRange") Boolean createPodRange,
        @CustomType.Parameter("podIpv4CidrBlock") String podIpv4CidrBlock,
        @CustomType.Parameter("podRange") String podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = podRange;
    }

    public Boolean createPodRange() {
        return this.createPodRange;
    }
    public String podIpv4CidrBlock() {
        return this.podIpv4CidrBlock;
    }
    public String podRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createPodRange;
        private String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder createPodRange(Boolean createPodRange) {
            this.createPodRange = Objects.requireNonNull(createPodRange);
            return this;
        }
        public Builder podIpv4CidrBlock(String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock);
            return this;
        }
        public Builder podRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }        public GetClusterNodePoolNetworkConfig build() {
            return new GetClusterNodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}