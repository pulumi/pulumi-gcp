// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudfunctionsv2.outputs.FunctionServiceConfigSecretEnvironmentVariable;
import com.pulumi.gcp.cloudfunctionsv2.outputs.FunctionServiceConfigSecretVolume;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionServiceConfig {
    /**
     * @return Whether 100% of traffic is routed to the latest revision. Defaults to true.
     * 
     */
    private @Nullable Boolean allTrafficOnLatestRevision;
    /**
     * @return The number of CPUs used in a single container instance. Default value is calculated from available memory.
     * 
     */
    private @Nullable String availableCpu;
    /**
     * @return The amount of memory available for a function.
     * Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is
     * supplied the value is interpreted as bytes.
     * 
     */
    private @Nullable String availableMemory;
    /**
     * @return The binary authorization policy to be checked when deploying the Cloud Run service.
     * 
     */
    private @Nullable String binaryAuthorizationPolicy;
    /**
     * @return Environment variables that shall be available during function execution.
     * 
     */
    private @Nullable Map<String,String> environmentVariables;
    /**
     * @return (Output)
     * URIs of the Service deployed
     * 
     */
    private @Nullable String gcfUri;
    /**
     * @return Available ingress settings. Defaults to &#34;ALLOW_ALL&#34; if unspecified.
     * Default value is `ALLOW_ALL`.
     * Possible values are: `ALLOW_ALL`, `ALLOW_INTERNAL_ONLY`, `ALLOW_INTERNAL_AND_GCLB`.
     * 
     */
    private @Nullable String ingressSettings;
    /**
     * @return The limit on the maximum number of function instances that may coexist at a
     * given time.
     * 
     */
    private @Nullable Integer maxInstanceCount;
    /**
     * @return Sets the maximum number of concurrent requests that each instance can receive. Defaults to 1.
     * 
     */
    private @Nullable Integer maxInstanceRequestConcurrency;
    /**
     * @return The limit on the minimum number of function instances that may coexist at a
     * given time.
     * 
     */
    private @Nullable Integer minInstanceCount;
    /**
     * @return Secret environment variables configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FunctionServiceConfigSecretEnvironmentVariable> secretEnvironmentVariables;
    /**
     * @return Secret volumes configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FunctionServiceConfigSecretVolume> secretVolumes;
    /**
     * @return Name of the service associated with a Function.
     * 
     */
    private @Nullable String service;
    /**
     * @return The email of the service account for this function.
     * 
     */
    private @Nullable String serviceAccountEmail;
    /**
     * @return The function execution timeout. Execution is considered failed and
     * can be terminated if the function is not completed at the end of the
     * timeout period. Defaults to 60 seconds.
     * 
     */
    private @Nullable Integer timeoutSeconds;
    /**
     * @return (Output)
     * URI of the Service deployed.
     * 
     */
    private @Nullable String uri;
    /**
     * @return The Serverless VPC Access connector that this cloud function can connect to.
     * 
     */
    private @Nullable String vpcConnector;
    /**
     * @return Available egress settings.
     * Possible values are: `VPC_CONNECTOR_EGRESS_SETTINGS_UNSPECIFIED`, `PRIVATE_RANGES_ONLY`, `ALL_TRAFFIC`.
     * 
     */
    private @Nullable String vpcConnectorEgressSettings;

    private FunctionServiceConfig() {}
    /**
     * @return Whether 100% of traffic is routed to the latest revision. Defaults to true.
     * 
     */
    public Optional<Boolean> allTrafficOnLatestRevision() {
        return Optional.ofNullable(this.allTrafficOnLatestRevision);
    }
    /**
     * @return The number of CPUs used in a single container instance. Default value is calculated from available memory.
     * 
     */
    public Optional<String> availableCpu() {
        return Optional.ofNullable(this.availableCpu);
    }
    /**
     * @return The amount of memory available for a function.
     * Defaults to 256M. Supported units are k, M, G, Mi, Gi. If no unit is
     * supplied the value is interpreted as bytes.
     * 
     */
    public Optional<String> availableMemory() {
        return Optional.ofNullable(this.availableMemory);
    }
    /**
     * @return The binary authorization policy to be checked when deploying the Cloud Run service.
     * 
     */
    public Optional<String> binaryAuthorizationPolicy() {
        return Optional.ofNullable(this.binaryAuthorizationPolicy);
    }
    /**
     * @return Environment variables that shall be available during function execution.
     * 
     */
    public Map<String,String> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * @return (Output)
     * URIs of the Service deployed
     * 
     */
    public Optional<String> gcfUri() {
        return Optional.ofNullable(this.gcfUri);
    }
    /**
     * @return Available ingress settings. Defaults to &#34;ALLOW_ALL&#34; if unspecified.
     * Default value is `ALLOW_ALL`.
     * Possible values are: `ALLOW_ALL`, `ALLOW_INTERNAL_ONLY`, `ALLOW_INTERNAL_AND_GCLB`.
     * 
     */
    public Optional<String> ingressSettings() {
        return Optional.ofNullable(this.ingressSettings);
    }
    /**
     * @return The limit on the maximum number of function instances that may coexist at a
     * given time.
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * @return Sets the maximum number of concurrent requests that each instance can receive. Defaults to 1.
     * 
     */
    public Optional<Integer> maxInstanceRequestConcurrency() {
        return Optional.ofNullable(this.maxInstanceRequestConcurrency);
    }
    /**
     * @return The limit on the minimum number of function instances that may coexist at a
     * given time.
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }
    /**
     * @return Secret environment variables configuration.
     * Structure is documented below.
     * 
     */
    public List<FunctionServiceConfigSecretEnvironmentVariable> secretEnvironmentVariables() {
        return this.secretEnvironmentVariables == null ? List.of() : this.secretEnvironmentVariables;
    }
    /**
     * @return Secret volumes configuration.
     * Structure is documented below.
     * 
     */
    public List<FunctionServiceConfigSecretVolume> secretVolumes() {
        return this.secretVolumes == null ? List.of() : this.secretVolumes;
    }
    /**
     * @return Name of the service associated with a Function.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return The email of the service account for this function.
     * 
     */
    public Optional<String> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }
    /**
     * @return The function execution timeout. Execution is considered failed and
     * can be terminated if the function is not completed at the end of the
     * timeout period. Defaults to 60 seconds.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    /**
     * @return (Output)
     * URI of the Service deployed.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }
    /**
     * @return The Serverless VPC Access connector that this cloud function can connect to.
     * 
     */
    public Optional<String> vpcConnector() {
        return Optional.ofNullable(this.vpcConnector);
    }
    /**
     * @return Available egress settings.
     * Possible values are: `VPC_CONNECTOR_EGRESS_SETTINGS_UNSPECIFIED`, `PRIVATE_RANGES_ONLY`, `ALL_TRAFFIC`.
     * 
     */
    public Optional<String> vpcConnectorEgressSettings() {
        return Optional.ofNullable(this.vpcConnectorEgressSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionServiceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allTrafficOnLatestRevision;
        private @Nullable String availableCpu;
        private @Nullable String availableMemory;
        private @Nullable String binaryAuthorizationPolicy;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String gcfUri;
        private @Nullable String ingressSettings;
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer maxInstanceRequestConcurrency;
        private @Nullable Integer minInstanceCount;
        private @Nullable List<FunctionServiceConfigSecretEnvironmentVariable> secretEnvironmentVariables;
        private @Nullable List<FunctionServiceConfigSecretVolume> secretVolumes;
        private @Nullable String service;
        private @Nullable String serviceAccountEmail;
        private @Nullable Integer timeoutSeconds;
        private @Nullable String uri;
        private @Nullable String vpcConnector;
        private @Nullable String vpcConnectorEgressSettings;
        public Builder() {}
        public Builder(FunctionServiceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allTrafficOnLatestRevision = defaults.allTrafficOnLatestRevision;
    	      this.availableCpu = defaults.availableCpu;
    	      this.availableMemory = defaults.availableMemory;
    	      this.binaryAuthorizationPolicy = defaults.binaryAuthorizationPolicy;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.gcfUri = defaults.gcfUri;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.maxInstanceRequestConcurrency = defaults.maxInstanceRequestConcurrency;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.secretEnvironmentVariables = defaults.secretEnvironmentVariables;
    	      this.secretVolumes = defaults.secretVolumes;
    	      this.service = defaults.service;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.uri = defaults.uri;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpcConnectorEgressSettings = defaults.vpcConnectorEgressSettings;
        }

        @CustomType.Setter
        public Builder allTrafficOnLatestRevision(@Nullable Boolean allTrafficOnLatestRevision) {

            this.allTrafficOnLatestRevision = allTrafficOnLatestRevision;
            return this;
        }
        @CustomType.Setter
        public Builder availableCpu(@Nullable String availableCpu) {

            this.availableCpu = availableCpu;
            return this;
        }
        @CustomType.Setter
        public Builder availableMemory(@Nullable String availableMemory) {

            this.availableMemory = availableMemory;
            return this;
        }
        @CustomType.Setter
        public Builder binaryAuthorizationPolicy(@Nullable String binaryAuthorizationPolicy) {

            this.binaryAuthorizationPolicy = binaryAuthorizationPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {

            this.environmentVariables = environmentVariables;
            return this;
        }
        @CustomType.Setter
        public Builder gcfUri(@Nullable String gcfUri) {

            this.gcfUri = gcfUri;
            return this;
        }
        @CustomType.Setter
        public Builder ingressSettings(@Nullable String ingressSettings) {

            this.ingressSettings = ingressSettings;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {

            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceRequestConcurrency(@Nullable Integer maxInstanceRequestConcurrency) {

            this.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {

            this.minInstanceCount = minInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder secretEnvironmentVariables(@Nullable List<FunctionServiceConfigSecretEnvironmentVariable> secretEnvironmentVariables) {

            this.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }
        public Builder secretEnvironmentVariables(FunctionServiceConfigSecretEnvironmentVariable... secretEnvironmentVariables) {
            return secretEnvironmentVariables(List.of(secretEnvironmentVariables));
        }
        @CustomType.Setter
        public Builder secretVolumes(@Nullable List<FunctionServiceConfigSecretVolume> secretVolumes) {

            this.secretVolumes = secretVolumes;
            return this;
        }
        public Builder secretVolumes(FunctionServiceConfigSecretVolume... secretVolumes) {
            return secretVolumes(List.of(secretVolumes));
        }
        @CustomType.Setter
        public Builder service(@Nullable String service) {

            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {

            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {

            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {

            this.uri = uri;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConnector(@Nullable String vpcConnector) {

            this.vpcConnector = vpcConnector;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConnectorEgressSettings(@Nullable String vpcConnectorEgressSettings) {

            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }
        public FunctionServiceConfig build() {
            final var _resultValue = new FunctionServiceConfig();
            _resultValue.allTrafficOnLatestRevision = allTrafficOnLatestRevision;
            _resultValue.availableCpu = availableCpu;
            _resultValue.availableMemory = availableMemory;
            _resultValue.binaryAuthorizationPolicy = binaryAuthorizationPolicy;
            _resultValue.environmentVariables = environmentVariables;
            _resultValue.gcfUri = gcfUri;
            _resultValue.ingressSettings = ingressSettings;
            _resultValue.maxInstanceCount = maxInstanceCount;
            _resultValue.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            _resultValue.minInstanceCount = minInstanceCount;
            _resultValue.secretEnvironmentVariables = secretEnvironmentVariables;
            _resultValue.secretVolumes = secretVolumes;
            _resultValue.service = service;
            _resultValue.serviceAccountEmail = serviceAccountEmail;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.uri = uri;
            _resultValue.vpcConnector = vpcConnector;
            _resultValue.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return _resultValue;
        }
    }
}
