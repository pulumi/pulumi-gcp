// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class MigrationJobStaticIpConnectivity {
    private MigrationJobStaticIpConnectivity() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationJobStaticIpConnectivity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(MigrationJobStaticIpConnectivity defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public MigrationJobStaticIpConnectivity build() {
            final var _resultValue = new MigrationJobStaticIpConnectivity();
            return _resultValue;
        }
    }
}
