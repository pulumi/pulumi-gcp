// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.ServiceStatusCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceStatus {
    private final @Nullable List<ServiceStatusCondition> conditions;
    private final @Nullable String latestCreatedRevisionName;
    private final @Nullable String latestReadyRevisionName;
    private final @Nullable Integer observedGeneration;
    /**
     * @return -
     * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
     * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
     * but may not contain anything else (e.g. basic auth, url path, etc.)
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private ServiceStatus(
        @CustomType.Parameter("conditions") @Nullable List<ServiceStatusCondition> conditions,
        @CustomType.Parameter("latestCreatedRevisionName") @Nullable String latestCreatedRevisionName,
        @CustomType.Parameter("latestReadyRevisionName") @Nullable String latestReadyRevisionName,
        @CustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration,
        @CustomType.Parameter("url") @Nullable String url) {
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.url = url;
    }

    public List<ServiceStatusCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public Optional<String> latestCreatedRevisionName() {
        return Optional.ofNullable(this.latestCreatedRevisionName);
    }
    public Optional<String> latestReadyRevisionName() {
        return Optional.ofNullable(this.latestReadyRevisionName);
    }
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return -
     * URL displays the URL for accessing tagged traffic targets. URL is displayed in status,
     * and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname,
     * but may not contain anything else (e.g. basic auth, url path, etc.)
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceStatusCondition> conditions;
        private @Nullable String latestCreatedRevisionName;
        private @Nullable String latestReadyRevisionName;
        private @Nullable Integer observedGeneration;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder conditions(@Nullable List<ServiceStatusCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ServiceStatusCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder latestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }
        public Builder latestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public ServiceStatus build() {
            return new ServiceStatus(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}