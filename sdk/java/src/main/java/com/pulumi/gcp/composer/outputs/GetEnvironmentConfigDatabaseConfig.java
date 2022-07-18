// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigDatabaseConfig {
    private final String machineType;

    @CustomType.Constructor
    private GetEnvironmentConfigDatabaseConfig(@CustomType.Parameter("machineType") String machineType) {
        this.machineType = machineType;
    }

    public String machineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigDatabaseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigDatabaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }        public GetEnvironmentConfigDatabaseConfig build() {
            return new GetEnvironmentConfigDatabaseConfig(machineType);
        }
    }
}