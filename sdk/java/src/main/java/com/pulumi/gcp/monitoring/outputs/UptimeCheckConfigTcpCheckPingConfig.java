// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class UptimeCheckConfigTcpCheckPingConfig {
    /**
     * @return Number of ICMP pings. A maximum of 3 ICMP pings is currently supported.
     * 
     */
    private Integer pingsCount;

    private UptimeCheckConfigTcpCheckPingConfig() {}
    /**
     * @return Number of ICMP pings. A maximum of 3 ICMP pings is currently supported.
     * 
     */
    public Integer pingsCount() {
        return this.pingsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigTcpCheckPingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer pingsCount;
        public Builder() {}
        public Builder(UptimeCheckConfigTcpCheckPingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pingsCount = defaults.pingsCount;
        }

        @CustomType.Setter
        public Builder pingsCount(Integer pingsCount) {
            this.pingsCount = Objects.requireNonNull(pingsCount);
            return this;
        }
        public UptimeCheckConfigTcpCheckPingConfig build() {
            final var o = new UptimeCheckConfigTcpCheckPingConfig();
            o.pingsCount = pingsCount;
            return o;
        }
    }
}