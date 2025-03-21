// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerBuildArtifactNpmPackage {
    /**
     * @return Path to the package.json. e.g. workspace/path/to/package
     * 
     */
    private String packagePath;
    /**
     * @return Artifact Registry repository, in the form &#34;https://$REGION-npm.pkg.dev/$PROJECT/$REPOSITORY&#34;
     * 
     * Npm package in the workspace specified by path will be zipped and uploaded to Artifact Registry with this location as a prefix.
     * 
     */
    private String repository;

    private GetTriggerBuildArtifactNpmPackage() {}
    /**
     * @return Path to the package.json. e.g. workspace/path/to/package
     * 
     */
    public String packagePath() {
        return this.packagePath;
    }
    /**
     * @return Artifact Registry repository, in the form &#34;https://$REGION-npm.pkg.dev/$PROJECT/$REPOSITORY&#34;
     * 
     * Npm package in the workspace specified by path will be zipped and uploaded to Artifact Registry with this location as a prefix.
     * 
     */
    public String repository() {
        return this.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuildArtifactNpmPackage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String packagePath;
        private String repository;
        public Builder() {}
        public Builder(GetTriggerBuildArtifactNpmPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packagePath = defaults.packagePath;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder packagePath(String packagePath) {
            if (packagePath == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildArtifactNpmPackage", "packagePath");
            }
            this.packagePath = packagePath;
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            if (repository == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildArtifactNpmPackage", "repository");
            }
            this.repository = repository;
            return this;
        }
        public GetTriggerBuildArtifactNpmPackage build() {
            final var _resultValue = new GetTriggerBuildArtifactNpmPackage();
            _resultValue.packagePath = packagePath;
            _resultValue.repository = repository;
            return _resultValue;
        }
    }
}
