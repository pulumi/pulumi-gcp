// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.databasemigrationservice.outputs.ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionProfileCloudsqlSettingsIpConfig {
    /**
     * @return The list of external networks that are allowed to connect to the instance using the IP.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> authorizedNetworks;
    /**
     * @return Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    private @Nullable Boolean enableIpv4;
    /**
     * @return The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    private @Nullable String privateNetwork;
    /**
     * @return Whether SSL connections over IP should be enforced or not.
     * 
     */
    private @Nullable Boolean requireSsl;

    private ConnectionProfileCloudsqlSettingsIpConfig() {}
    /**
     * @return The list of external networks that are allowed to connect to the instance using the IP.
     * Structure is documented below.
     * 
     */
    public List<ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> authorizedNetworks() {
        return this.authorizedNetworks == null ? List.of() : this.authorizedNetworks;
    }
    /**
     * @return Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    public Optional<Boolean> enableIpv4() {
        return Optional.ofNullable(this.enableIpv4);
    }
    /**
     * @return The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, projects/myProject/global/networks/default.
     * This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    public Optional<String> privateNetwork() {
        return Optional.ofNullable(this.privateNetwork);
    }
    /**
     * @return Whether SSL connections over IP should be enforced or not.
     * 
     */
    public Optional<Boolean> requireSsl() {
        return Optional.ofNullable(this.requireSsl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileCloudsqlSettingsIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> authorizedNetworks;
        private @Nullable Boolean enableIpv4;
        private @Nullable String privateNetwork;
        private @Nullable Boolean requireSsl;
        public Builder() {}
        public Builder(ConnectionProfileCloudsqlSettingsIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        @CustomType.Setter
        public Builder authorizedNetworks(@Nullable List<ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork> authorizedNetworks) {

            this.authorizedNetworks = authorizedNetworks;
            return this;
        }
        public Builder authorizedNetworks(ConnectionProfileCloudsqlSettingsIpConfigAuthorizedNetwork... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        @CustomType.Setter
        public Builder enableIpv4(@Nullable Boolean enableIpv4) {

            this.enableIpv4 = enableIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder privateNetwork(@Nullable String privateNetwork) {

            this.privateNetwork = privateNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder requireSsl(@Nullable Boolean requireSsl) {

            this.requireSsl = requireSsl;
            return this;
        }
        public ConnectionProfileCloudsqlSettingsIpConfig build() {
            final var _resultValue = new ConnectionProfileCloudsqlSettingsIpConfig();
            _resultValue.authorizedNetworks = authorizedNetworks;
            _resultValue.enableIpv4 = enableIpv4;
            _resultValue.privateNetwork = privateNetwork;
            _resultValue.requireSsl = requireSsl;
            return _resultValue;
        }
    }
}
