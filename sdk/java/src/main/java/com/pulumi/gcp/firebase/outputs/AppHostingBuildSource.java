// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.AppHostingBuildSourceCodebase;
import com.pulumi.gcp.firebase.outputs.AppHostingBuildSourceContainer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppHostingBuildSource {
    /**
     * @return A codebase source, representing the state of the codebase
     * that the build will be created at.
     * Structure is documented below.
     * 
     */
    private @Nullable AppHostingBuildSourceCodebase codebase;
    /**
     * @return The URI of an Artifact Registry
     * [container
     * image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     * to use as the build source.
     * Structure is documented below.
     * 
     */
    private @Nullable AppHostingBuildSourceContainer container;

    private AppHostingBuildSource() {}
    /**
     * @return A codebase source, representing the state of the codebase
     * that the build will be created at.
     * Structure is documented below.
     * 
     */
    public Optional<AppHostingBuildSourceCodebase> codebase() {
        return Optional.ofNullable(this.codebase);
    }
    /**
     * @return The URI of an Artifact Registry
     * [container
     * image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     * to use as the build source.
     * Structure is documented below.
     * 
     */
    public Optional<AppHostingBuildSourceContainer> container() {
        return Optional.ofNullable(this.container);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppHostingBuildSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppHostingBuildSourceCodebase codebase;
        private @Nullable AppHostingBuildSourceContainer container;
        public Builder() {}
        public Builder(AppHostingBuildSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codebase = defaults.codebase;
    	      this.container = defaults.container;
        }

        @CustomType.Setter
        public Builder codebase(@Nullable AppHostingBuildSourceCodebase codebase) {

            this.codebase = codebase;
            return this;
        }
        @CustomType.Setter
        public Builder container(@Nullable AppHostingBuildSourceContainer container) {

            this.container = container;
            return this;
        }
        public AppHostingBuildSource build() {
            final var _resultValue = new AppHostingBuildSource();
            _resultValue.codebase = codebase;
            _resultValue.container = container;
            return _resultValue;
        }
    }
}
