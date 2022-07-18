// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolNodeConfigKubeletConfig {
    private final Boolean cpuCfsQuota;
    private final String cpuCfsQuotaPeriod;
    private final String cpuManagerPolicy;

    @CustomType.Constructor
    private GetClusterNodePoolNodeConfigKubeletConfig(
        @CustomType.Parameter("cpuCfsQuota") Boolean cpuCfsQuota,
        @CustomType.Parameter("cpuCfsQuotaPeriod") String cpuCfsQuotaPeriod,
        @CustomType.Parameter("cpuManagerPolicy") String cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
    }

    public Boolean cpuCfsQuota() {
        return this.cpuCfsQuota;
    }
    public String cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota);
            return this;
        }
        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod);
            return this;
        }
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }        public GetClusterNodePoolNodeConfigKubeletConfig build() {
            return new GetClusterNodePoolNodeConfigKubeletConfig(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}