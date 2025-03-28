// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestSourceAppEngineVersion;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestSourceCloudFunction;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestSourceCloudRunRevision;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectivityTestSource {
    /**
     * @return An App Engine service version.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectivityTestSourceAppEngineVersion appEngineVersion;
    /**
     * @return A Cloud Function.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectivityTestSourceCloudFunction cloudFunction;
    /**
     * @return A Cloud Run revision.
     * Structure is documented below.
     * 
     */
    private @Nullable ConnectivityTestSourceCloudRunRevision cloudRunRevision;
    /**
     * @return A Cloud SQL instance URI.
     * 
     */
    private @Nullable String cloudSqlInstance;
    /**
     * @return A cluster URI for Google Kubernetes Engine cluster control plane.
     * 
     */
    private @Nullable String gkeMasterCluster;
    /**
     * @return A Compute Engine instance URI.
     * 
     */
    private @Nullable String instance;
    /**
     * @return The IP address of the endpoint, which can be an external or internal IP.
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return A VPC network URI.
     * 
     */
    private @Nullable String network;
    /**
     * @return Type of the network where the endpoint is located.
     * Possible values are: `GCP_NETWORK`, `NON_GCP_NETWORK`.
     * 
     */
    private @Nullable String networkType;
    /**
     * @return The IP protocol port of the endpoint. Only applicable when protocol is
     * TCP or UDP.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Project ID where the endpoint is located.
     * The project ID can be derived from the URI if you provide a endpoint or
     * network URI.
     * The following are two cases where you may need to provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within a Google
     *    Cloud project.
     * 2. When you are using Shared VPC and the IP address that you provide is
     *    from the service project. In this case, the network that the IP address
     *    resides in is defined in the host project.
     * 
     */
    private @Nullable String projectId;

    private ConnectivityTestSource() {}
    /**
     * @return An App Engine service version.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectivityTestSourceAppEngineVersion> appEngineVersion() {
        return Optional.ofNullable(this.appEngineVersion);
    }
    /**
     * @return A Cloud Function.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectivityTestSourceCloudFunction> cloudFunction() {
        return Optional.ofNullable(this.cloudFunction);
    }
    /**
     * @return A Cloud Run revision.
     * Structure is documented below.
     * 
     */
    public Optional<ConnectivityTestSourceCloudRunRevision> cloudRunRevision() {
        return Optional.ofNullable(this.cloudRunRevision);
    }
    /**
     * @return A Cloud SQL instance URI.
     * 
     */
    public Optional<String> cloudSqlInstance() {
        return Optional.ofNullable(this.cloudSqlInstance);
    }
    /**
     * @return A cluster URI for Google Kubernetes Engine cluster control plane.
     * 
     */
    public Optional<String> gkeMasterCluster() {
        return Optional.ofNullable(this.gkeMasterCluster);
    }
    /**
     * @return A Compute Engine instance URI.
     * 
     */
    public Optional<String> instance() {
        return Optional.ofNullable(this.instance);
    }
    /**
     * @return The IP address of the endpoint, which can be an external or internal IP.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return A VPC network URI.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return Type of the network where the endpoint is located.
     * Possible values are: `GCP_NETWORK`, `NON_GCP_NETWORK`.
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    /**
     * @return The IP protocol port of the endpoint. Only applicable when protocol is
     * TCP or UDP.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Project ID where the endpoint is located.
     * The project ID can be derived from the URI if you provide a endpoint or
     * network URI.
     * The following are two cases where you may need to provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within a Google
     *    Cloud project.
     * 2. When you are using Shared VPC and the IP address that you provide is
     *    from the service project. In this case, the network that the IP address
     *    resides in is defined in the host project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityTestSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectivityTestSourceAppEngineVersion appEngineVersion;
        private @Nullable ConnectivityTestSourceCloudFunction cloudFunction;
        private @Nullable ConnectivityTestSourceCloudRunRevision cloudRunRevision;
        private @Nullable String cloudSqlInstance;
        private @Nullable String gkeMasterCluster;
        private @Nullable String instance;
        private @Nullable String ipAddress;
        private @Nullable String network;
        private @Nullable String networkType;
        private @Nullable Integer port;
        private @Nullable String projectId;
        public Builder() {}
        public Builder(ConnectivityTestSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineVersion = defaults.appEngineVersion;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRunRevision = defaults.cloudRunRevision;
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.gkeMasterCluster = defaults.gkeMasterCluster;
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder appEngineVersion(@Nullable ConnectivityTestSourceAppEngineVersion appEngineVersion) {

            this.appEngineVersion = appEngineVersion;
            return this;
        }
        @CustomType.Setter
        public Builder cloudFunction(@Nullable ConnectivityTestSourceCloudFunction cloudFunction) {

            this.cloudFunction = cloudFunction;
            return this;
        }
        @CustomType.Setter
        public Builder cloudRunRevision(@Nullable ConnectivityTestSourceCloudRunRevision cloudRunRevision) {

            this.cloudRunRevision = cloudRunRevision;
            return this;
        }
        @CustomType.Setter
        public Builder cloudSqlInstance(@Nullable String cloudSqlInstance) {

            this.cloudSqlInstance = cloudSqlInstance;
            return this;
        }
        @CustomType.Setter
        public Builder gkeMasterCluster(@Nullable String gkeMasterCluster) {

            this.gkeMasterCluster = gkeMasterCluster;
            return this;
        }
        @CustomType.Setter
        public Builder instance(@Nullable String instance) {

            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {

            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(@Nullable String networkType) {

            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        public ConnectivityTestSource build() {
            final var _resultValue = new ConnectivityTestSource();
            _resultValue.appEngineVersion = appEngineVersion;
            _resultValue.cloudFunction = cloudFunction;
            _resultValue.cloudRunRevision = cloudRunRevision;
            _resultValue.cloudSqlInstance = cloudSqlInstance;
            _resultValue.gkeMasterCluster = gkeMasterCluster;
            _resultValue.instance = instance;
            _resultValue.ipAddress = ipAddress;
            _resultValue.network = network;
            _resultValue.networkType = networkType;
            _resultValue.port = port;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
