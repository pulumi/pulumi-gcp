// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTriggerBuildSourceRepoSource {
    /**
     * @return Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String branchName;
    /**
     * @return Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    private String commitSha;
    /**
     * @return Directory, relative to the source root, in which to run the build.
     * This must be a relative path. If a step&#39;s dir is specified and is an absolute path,
     * this value is ignored for that step&#39;s execution.
     * 
     */
    private String dir;
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    private Boolean invertRegex;
    /**
     * @return ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    private String projectId;
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    private String repoName;
    /**
     * @return Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    private Map<String,String> substitutions;
    /**
     * @return Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private String tagName;

    private GetTriggerBuildSourceRepoSource() {}
    /**
     * @return Regex matching branches to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return Explicit commit SHA to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * 
     */
    public String commitSha() {
        return this.commitSha;
    }
    /**
     * @return Directory, relative to the source root, in which to run the build.
     * This must be a relative path. If a step&#39;s dir is specified and is an absolute path,
     * this value is ignored for that step&#39;s execution.
     * 
     */
    public String dir() {
        return this.dir;
    }
    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Boolean invertRegex() {
        return this.invertRegex;
    }
    /**
     * @return ID of the project that owns the Cloud Source Repository.
     * If omitted, the project ID requesting the build is assumed.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    public String repoName() {
        return this.repoName;
    }
    /**
     * @return Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    public Map<String,String> substitutions() {
        return this.substitutions;
    }
    /**
     * @return Regex matching tags to build. Exactly one a of branch name, tag, or commit SHA must be provided.
     * The syntax of the regular expressions accepted is the syntax accepted by RE2 and
     * described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuildSourceRepoSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branchName;
        private String commitSha;
        private String dir;
        private Boolean invertRegex;
        private String projectId;
        private String repoName;
        private Map<String,String> substitutions;
        private String tagName;
        public Builder() {}
        public Builder(GetTriggerBuildSourceRepoSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.projectId = defaults.projectId;
    	      this.repoName = defaults.repoName;
    	      this.substitutions = defaults.substitutions;
    	      this.tagName = defaults.tagName;
        }

        @CustomType.Setter
        public Builder branchName(String branchName) {
            if (branchName == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "branchName");
            }
            this.branchName = branchName;
            return this;
        }
        @CustomType.Setter
        public Builder commitSha(String commitSha) {
            if (commitSha == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "commitSha");
            }
            this.commitSha = commitSha;
            return this;
        }
        @CustomType.Setter
        public Builder dir(String dir) {
            if (dir == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "dir");
            }
            this.dir = dir;
            return this;
        }
        @CustomType.Setter
        public Builder invertRegex(Boolean invertRegex) {
            if (invertRegex == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "invertRegex");
            }
            this.invertRegex = invertRegex;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder repoName(String repoName) {
            if (repoName == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "repoName");
            }
            this.repoName = repoName;
            return this;
        }
        @CustomType.Setter
        public Builder substitutions(Map<String,String> substitutions) {
            if (substitutions == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "substitutions");
            }
            this.substitutions = substitutions;
            return this;
        }
        @CustomType.Setter
        public Builder tagName(String tagName) {
            if (tagName == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuildSourceRepoSource", "tagName");
            }
            this.tagName = tagName;
            return this;
        }
        public GetTriggerBuildSourceRepoSource build() {
            final var _resultValue = new GetTriggerBuildSourceRepoSource();
            _resultValue.branchName = branchName;
            _resultValue.commitSha = commitSha;
            _resultValue.dir = dir;
            _resultValue.invertRegex = invertRegex;
            _resultValue.projectId = projectId;
            _resultValue.repoName = repoName;
            _resultValue.substitutions = substitutions;
            _resultValue.tagName = tagName;
            return _resultValue;
        }
    }
}
