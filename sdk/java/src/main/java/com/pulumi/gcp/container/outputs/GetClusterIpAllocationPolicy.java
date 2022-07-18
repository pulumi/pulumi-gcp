// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterIpAllocationPolicy {
    private final String clusterIpv4CidrBlock;
    private final String clusterSecondaryRangeName;
    private final String servicesIpv4CidrBlock;
    private final String servicesSecondaryRangeName;

    @CustomType.Constructor
    private GetClusterIpAllocationPolicy(
        @CustomType.Parameter("clusterIpv4CidrBlock") String clusterIpv4CidrBlock,
        @CustomType.Parameter("clusterSecondaryRangeName") String clusterSecondaryRangeName,
        @CustomType.Parameter("servicesIpv4CidrBlock") String servicesIpv4CidrBlock,
        @CustomType.Parameter("servicesSecondaryRangeName") String servicesSecondaryRangeName) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    }

    public String clusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }
    public String clusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }
    public String servicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }
    public String servicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIpAllocationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIpv4CidrBlock;
        private String clusterSecondaryRangeName;
        private String servicesIpv4CidrBlock;
        private String servicesSecondaryRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIpAllocationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
        }

        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock);
            return this;
        }
        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName);
            return this;
        }
        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock);
            return this;
        }
        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName);
            return this;
        }        public GetClusterIpAllocationPolicy build() {
            return new GetClusterIpAllocationPolicy(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName);
        }
    }
}