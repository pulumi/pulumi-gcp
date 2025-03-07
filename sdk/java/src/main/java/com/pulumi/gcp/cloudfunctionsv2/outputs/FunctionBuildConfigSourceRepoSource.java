// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionBuildConfigSourceRepoSource {
    /**
     * @return Regex matching branches to build.
     * 
     */
    private @Nullable String branchName;
    /**
     * @return Regex matching tags to build.
     * 
     */
    private @Nullable String commitSha;
    /**
     * @return Directory, relative to the source root, in which to run the build.
     * 
     */
    private @Nullable String dir;
    /**
     * @return Only trigger a build if the revision regex does
     * NOT match the revision regex.
     * 
     */
    private @Nullable Boolean invertRegex;
    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the
     * project ID requesting the build is assumed.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    private @Nullable String repoName;
    /**
     * @return Regex matching tags to build.
     * 
     */
    private @Nullable String tagName;

    private FunctionBuildConfigSourceRepoSource() {}
    /**
     * @return Regex matching branches to build.
     * 
     */
    public Optional<String> branchName() {
        return Optional.ofNullable(this.branchName);
    }
    /**
     * @return Regex matching tags to build.
     * 
     */
    public Optional<String> commitSha() {
        return Optional.ofNullable(this.commitSha);
    }
    /**
     * @return Directory, relative to the source root, in which to run the build.
     * 
     */
    public Optional<String> dir() {
        return Optional.ofNullable(this.dir);
    }
    /**
     * @return Only trigger a build if the revision regex does
     * NOT match the revision regex.
     * 
     */
    public Optional<Boolean> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }
    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the
     * project ID requesting the build is assumed.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    public Optional<String> repoName() {
        return Optional.ofNullable(this.repoName);
    }
    /**
     * @return Regex matching tags to build.
     * 
     */
    public Optional<String> tagName() {
        return Optional.ofNullable(this.tagName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionBuildConfigSourceRepoSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitSha;
        private @Nullable String dir;
        private @Nullable Boolean invertRegex;
        private @Nullable String projectId;
        private @Nullable String repoName;
        private @Nullable String tagName;
        public Builder() {}
        public Builder(FunctionBuildConfigSourceRepoSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        @CustomType.Setter
        public Builder branchName(@Nullable String branchName) {

            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder commitSha(@Nullable String commitSha) {

            this.commitSha = commitSha;
            return this;
        }
        @CustomType.Setter
        public Builder dir(@Nullable String dir) {

            this.dir = dir;
            return this;
        }
        @CustomType.Setter
        public Builder invertRegex(@Nullable Boolean invertRegex) {

            this.invertRegex = invertRegex;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(@Nullable String repoName) {

            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder tagName(@Nullable String tagName) {

            this.tagName = tagName;
            return this;
        }
        public FunctionBuildConfigSourceRepoSource build() {
            final var _resultValue = new FunctionBuildConfigSourceRepoSource();
            _resultValue.branchName = branchName;
            _resultValue.commitSha = commitSha;
            _resultValue.dir = dir;
            _resultValue.invertRegex = invertRegex;
            _resultValue.projectId = projectId;
            _resultValue.repoName = repoName;
            _resultValue.tagName = tagName;
            return _resultValue;
        }
    }
}
