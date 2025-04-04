// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentVmImage {
    /**
     * @return Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    private @Nullable String imageFamily;
    /**
     * @return Use VM image name to find the image.
     * 
     */
    private @Nullable String imageName;
    /**
     * @return The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    private String project;

    private EnvironmentVmImage() {}
    /**
     * @return Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    public Optional<String> imageFamily() {
        return Optional.ofNullable(this.imageFamily);
    }
    /**
     * @return Use VM image name to find the image.
     * 
     */
    public Optional<String> imageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * @return The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVmImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String imageFamily;
        private @Nullable String imageName;
        private String project;
        public Builder() {}
        public Builder(EnvironmentVmImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageFamily = defaults.imageFamily;
    	      this.imageName = defaults.imageName;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder imageFamily(@Nullable String imageFamily) {

            this.imageFamily = imageFamily;
            return this;
        }
        @CustomType.Setter
        public Builder imageName(@Nullable String imageName) {

            this.imageName = imageName;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("EnvironmentVmImage", "project");
            }
            this.project = project;
            return this;
        }
        public EnvironmentVmImage build() {
            final var _resultValue = new EnvironmentVmImage();
            _resultValue.imageFamily = imageFamily;
            _resultValue.imageName = imageName;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
