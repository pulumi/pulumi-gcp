// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.AppHostingBackendManagedResourceRunService;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AppHostingBackendManagedResource {
    /**
     * @return (Output)
     * A managed Cloud Run
     * [`service`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services#resource:-service).
     * Structure is documented below.
     * 
     */
    private @Nullable List<AppHostingBackendManagedResourceRunService> runServices;

    private AppHostingBackendManagedResource() {}
    /**
     * @return (Output)
     * A managed Cloud Run
     * [`service`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services#resource:-service).
     * Structure is documented below.
     * 
     */
    public List<AppHostingBackendManagedResourceRunService> runServices() {
        return this.runServices == null ? List.of() : this.runServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppHostingBackendManagedResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppHostingBackendManagedResourceRunService> runServices;
        public Builder() {}
        public Builder(AppHostingBackendManagedResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runServices = defaults.runServices;
        }

        @CustomType.Setter
        public Builder runServices(@Nullable List<AppHostingBackendManagedResourceRunService> runServices) {

            this.runServices = runServices;
            return this;
        }
        public Builder runServices(AppHostingBackendManagedResourceRunService... runServices) {
            return runServices(List.of(runServices));
        }
        public AppHostingBackendManagedResource build() {
            final var _resultValue = new AppHostingBackendManagedResource();
            _resultValue.runServices = runServices;
            return _resultValue;
        }
    }
}
