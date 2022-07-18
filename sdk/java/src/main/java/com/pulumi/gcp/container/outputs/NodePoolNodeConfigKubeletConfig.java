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
public final class NodePoolNodeConfigKubeletConfig {
    private final @Nullable Boolean cpuCfsQuota;
    private final @Nullable String cpuCfsQuotaPeriod;
    private final String cpuManagerPolicy;

    @CustomType.Constructor
    private NodePoolNodeConfigKubeletConfig(
        @CustomType.Parameter("cpuCfsQuota") @Nullable Boolean cpuCfsQuota,
        @CustomType.Parameter("cpuCfsQuotaPeriod") @Nullable String cpuCfsQuotaPeriod,
        @CustomType.Parameter("cpuManagerPolicy") String cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
    }

    public Optional<Boolean> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    public Optional<String> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }        public NodePoolNodeConfigKubeletConfig build() {
            return new NodePoolNodeConfigKubeletConfig(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}