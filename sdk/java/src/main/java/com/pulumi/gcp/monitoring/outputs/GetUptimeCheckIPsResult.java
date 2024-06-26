// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.monitoring.outputs.GetUptimeCheckIPsUptimeCheckIp;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUptimeCheckIPsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of uptime check IPs used by Stackdriver Monitoring. Each `uptime_check_ip` contains:
     * 
     */
    private List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps;

    private GetUptimeCheckIPsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of uptime check IPs used by Stackdriver Monitoring. Each `uptime_check_ip` contains:
     * 
     */
    public List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps() {
        return this.uptimeCheckIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUptimeCheckIPsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps;
        public Builder() {}
        public Builder(GetUptimeCheckIPsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uptimeCheckIps = defaults.uptimeCheckIps;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUptimeCheckIPsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder uptimeCheckIps(List<GetUptimeCheckIPsUptimeCheckIp> uptimeCheckIps) {
            if (uptimeCheckIps == null) {
              throw new MissingRequiredPropertyException("GetUptimeCheckIPsResult", "uptimeCheckIps");
            }
            this.uptimeCheckIps = uptimeCheckIps;
            return this;
        }
        public Builder uptimeCheckIps(GetUptimeCheckIPsUptimeCheckIp... uptimeCheckIps) {
            return uptimeCheckIps(List.of(uptimeCheckIps));
        }
        public GetUptimeCheckIPsResult build() {
            final var _resultValue = new GetUptimeCheckIPsResult();
            _resultValue.id = id;
            _resultValue.uptimeCheckIps = uptimeCheckIps;
            return _resultValue;
        }
    }
}
