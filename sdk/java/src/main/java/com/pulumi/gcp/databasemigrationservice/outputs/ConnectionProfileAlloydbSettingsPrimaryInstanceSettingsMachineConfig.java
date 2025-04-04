// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig {
    /**
     * @return The number of CPU&#39;s in the VM instance.
     * 
     */
    private Integer cpuCount;

    private ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig() {}
    /**
     * @return The number of CPU&#39;s in the VM instance.
     * 
     */
    public Integer cpuCount() {
        return this.cpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpuCount;
        public Builder() {}
        public Builder(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
        }

        @CustomType.Setter
        public Builder cpuCount(Integer cpuCount) {
            if (cpuCount == null) {
              throw new MissingRequiredPropertyException("ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig", "cpuCount");
            }
            this.cpuCount = cpuCount;
            return this;
        }
        public ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig build() {
            final var _resultValue = new ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfig();
            _resultValue.cpuCount = cpuCount;
            return _resultValue;
        }
    }
}
