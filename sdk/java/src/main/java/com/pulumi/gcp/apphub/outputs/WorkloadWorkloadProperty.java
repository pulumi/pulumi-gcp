// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apphub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadWorkloadProperty {
    /**
     * @return (Output)
     * Output only. The service project identifier that the underlying cloud resource resides in. Empty for non cloud resources.
     * 
     */
    private @Nullable String gcpProject;
    /**
     * @return Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
     * 
     */
    private @Nullable String location;
    /**
     * @return (Output)
     * Output only. The location that the underlying compute resource resides in if it is zonal (e.g us-west1-a).
     * 
     */
    private @Nullable String zone;

    private WorkloadWorkloadProperty() {}
    /**
     * @return (Output)
     * Output only. The service project identifier that the underlying cloud resource resides in. Empty for non cloud resources.
     * 
     */
    public Optional<String> gcpProject() {
        return Optional.ofNullable(this.gcpProject);
    }
    /**
     * @return Part of `parent`.  Full resource name of a parent Application. Example: projects/{HOST_PROJECT_ID}/locations/{LOCATION}/applications/{APPLICATION_ID}
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return (Output)
     * Output only. The location that the underlying compute resource resides in if it is zonal (e.g us-west1-a).
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadWorkloadProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gcpProject;
        private @Nullable String location;
        private @Nullable String zone;
        public Builder() {}
        public Builder(WorkloadWorkloadProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpProject = defaults.gcpProject;
    	      this.location = defaults.location;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder gcpProject(@Nullable String gcpProject) {

            this.gcpProject = gcpProject;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public WorkloadWorkloadProperty build() {
            final var _resultValue = new WorkloadWorkloadProperty();
            _resultValue.gcpProject = gcpProject;
            _resultValue.location = location;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
