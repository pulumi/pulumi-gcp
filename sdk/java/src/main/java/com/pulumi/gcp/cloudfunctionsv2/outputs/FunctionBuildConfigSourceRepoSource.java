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
    private final @Nullable String branchName;
    /**
     * @return Regex matching tags to build.
     * 
     */
    private final @Nullable String commitSha;
    /**
     * @return Directory, relative to the source root, in which to run the build.
     * 
     */
    private final @Nullable String dir;
    /**
     * @return Only trigger a build if the revision regex does
     * NOT match the revision regex.
     * 
     */
    private final @Nullable Boolean invertRegex;
    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the
     * project ID requesting the build is assumed.
     * 
     */
    private final @Nullable String projectId;
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    private final @Nullable String repoName;
    /**
     * @return Regex matching tags to build.
     * 
     */
    private final @Nullable String tagName;

    @CustomType.Constructor
    private FunctionBuildConfigSourceRepoSource(
        @CustomType.Parameter("branchName") @Nullable String branchName,
        @CustomType.Parameter("commitSha") @Nullable String commitSha,
        @CustomType.Parameter("dir") @Nullable String dir,
        @CustomType.Parameter("invertRegex") @Nullable Boolean invertRegex,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("repoName") @Nullable String repoName,
        @CustomType.Parameter("tagName") @Nullable String tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.dir = dir;
        this.invertRegex = invertRegex;
        this.projectId = projectId;
        this.repoName = repoName;
        this.tagName = tagName;
    }

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

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitSha;
        private @Nullable String dir;
        private @Nullable Boolean invertRegex;
        private @Nullable String projectId;
        private @Nullable String repoName;
        private @Nullable String tagName;

        public Builder() {
    	      // Empty
        }

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

        public Builder branchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }
        public Builder commitSha(@Nullable String commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public Builder dir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder repoName(@Nullable String repoName) {
            this.repoName = repoName;
            return this;
        }
        public Builder tagName(@Nullable String tagName) {
            this.tagName = tagName;
            return this;
        }        public FunctionBuildConfigSourceRepoSource build() {
            return new FunctionBuildConfigSourceRepoSource(branchName, commitSha, dir, invertRegex, projectId, repoName, tagName);
        }
    }
}