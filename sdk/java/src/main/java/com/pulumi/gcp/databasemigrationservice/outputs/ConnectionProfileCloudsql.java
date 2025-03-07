// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.databasemigrationservice.outputs.ConnectionProfileCloudsqlSettings;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionProfileCloudsql {
    /**
     * @return (Output)
     * Output only. The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    private @Nullable String cloudSqlId;
    /**
     * @return (Output)
     * Output only. The Cloud SQL database instance&#39;s private IP.
     * 
     */
    private @Nullable String privateIp;
    /**
     * @return (Output)
     * Output only. The Cloud SQL database instance&#39;s public IP.
     * 
     */
    private @Nullable String publicIp;
    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectionProfileCloudsqlSettings settings;

    private ConnectionProfileCloudsql() {}
    /**
     * @return (Output)
     * Output only. The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    public Optional<String> cloudSqlId() {
        return Optional.ofNullable(this.cloudSqlId);
    }
    /**
     * @return (Output)
     * Output only. The Cloud SQL database instance&#39;s private IP.
     * 
     */
    public Optional<String> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }
    /**
     * @return (Output)
     * Output only. The Cloud SQL database instance&#39;s public IP.
     * 
     */
    public Optional<String> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }
    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectionProfileCloudsqlSettings> settings() {
        return Optional.ofNullable(this.settings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileCloudsql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudSqlId;
        private @Nullable String privateIp;
        private @Nullable String publicIp;
        private @Nullable ConnectionProfileCloudsqlSettings settings;
        public Builder() {}
        public Builder(ConnectionProfileCloudsql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder cloudSqlId(@Nullable String cloudSqlId) {

            this.cloudSqlId = cloudSqlId;
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(@Nullable String privateIp) {

            this.privateIp = privateIp;
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(@Nullable String publicIp) {

            this.publicIp = publicIp;
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable ConnectionProfileCloudsqlSettings settings) {

            this.settings = settings;
            return this;
        }
        public ConnectionProfileCloudsql build() {
            final var _resultValue = new ConnectionProfileCloudsql();
            _resultValue.cloudSqlId = cloudSqlId;
            _resultValue.privateIp = privateIp;
            _resultValue.publicIp = publicIp;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
