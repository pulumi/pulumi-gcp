// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobAppEngineHttpTargetAppEngineRouting {
    /**
     * @return App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
     */
    private final @Nullable String instance;
    /**
     * @return App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    private final @Nullable String service;
    /**
     * @return App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private JobAppEngineHttpTargetAppEngineRouting(
        @CustomType.Parameter("instance") @Nullable String instance,
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("version") @Nullable String version) {
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    /**
     * @return App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
     */
    public Optional<String> instance() {
        return Optional.ofNullable(this.instance);
    }
    /**
     * @return App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTargetAppEngineRouting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instance;
        private @Nullable String service;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTargetAppEngineRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public JobAppEngineHttpTargetAppEngineRouting build() {
            return new JobAppEngineHttpTargetAppEngineRouting(instance, service, version);
        }
    }
}