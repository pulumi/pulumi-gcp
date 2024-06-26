// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRepositoryCleanupPolicyCondition {
    /**
     * @return Match versions newer than a duration.
     * 
     */
    private String newerThan;
    /**
     * @return Match versions older than a duration.
     * 
     */
    private String olderThan;
    /**
     * @return Match versions by package prefix. Applied on any prefix match.
     * 
     */
    private List<String> packageNamePrefixes;
    /**
     * @return Match versions by tag prefix. Applied on any prefix match.
     * 
     */
    private List<String> tagPrefixes;
    /**
     * @return Match versions by tag status. Default value: &#34;ANY&#34; Possible values: [&#34;TAGGED&#34;, &#34;UNTAGGED&#34;, &#34;ANY&#34;]
     * 
     */
    private String tagState;
    /**
     * @return Match versions by version name prefix. Applied on any prefix match.
     * 
     */
    private List<String> versionNamePrefixes;

    private GetRepositoryCleanupPolicyCondition() {}
    /**
     * @return Match versions newer than a duration.
     * 
     */
    public String newerThan() {
        return this.newerThan;
    }
    /**
     * @return Match versions older than a duration.
     * 
     */
    public String olderThan() {
        return this.olderThan;
    }
    /**
     * @return Match versions by package prefix. Applied on any prefix match.
     * 
     */
    public List<String> packageNamePrefixes() {
        return this.packageNamePrefixes;
    }
    /**
     * @return Match versions by tag prefix. Applied on any prefix match.
     * 
     */
    public List<String> tagPrefixes() {
        return this.tagPrefixes;
    }
    /**
     * @return Match versions by tag status. Default value: &#34;ANY&#34; Possible values: [&#34;TAGGED&#34;, &#34;UNTAGGED&#34;, &#34;ANY&#34;]
     * 
     */
    public String tagState() {
        return this.tagState;
    }
    /**
     * @return Match versions by version name prefix. Applied on any prefix match.
     * 
     */
    public List<String> versionNamePrefixes() {
        return this.versionNamePrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryCleanupPolicyCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String newerThan;
        private String olderThan;
        private List<String> packageNamePrefixes;
        private List<String> tagPrefixes;
        private String tagState;
        private List<String> versionNamePrefixes;
        public Builder() {}
        public Builder(GetRepositoryCleanupPolicyCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newerThan = defaults.newerThan;
    	      this.olderThan = defaults.olderThan;
    	      this.packageNamePrefixes = defaults.packageNamePrefixes;
    	      this.tagPrefixes = defaults.tagPrefixes;
    	      this.tagState = defaults.tagState;
    	      this.versionNamePrefixes = defaults.versionNamePrefixes;
        }

        @CustomType.Setter
        public Builder newerThan(String newerThan) {
            if (newerThan == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "newerThan");
            }
            this.newerThan = newerThan;
            return this;
        }
        @CustomType.Setter
        public Builder olderThan(String olderThan) {
            if (olderThan == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "olderThan");
            }
            this.olderThan = olderThan;
            return this;
        }
        @CustomType.Setter
        public Builder packageNamePrefixes(List<String> packageNamePrefixes) {
            if (packageNamePrefixes == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "packageNamePrefixes");
            }
            this.packageNamePrefixes = packageNamePrefixes;
            return this;
        }
        public Builder packageNamePrefixes(String... packageNamePrefixes) {
            return packageNamePrefixes(List.of(packageNamePrefixes));
        }
        @CustomType.Setter
        public Builder tagPrefixes(List<String> tagPrefixes) {
            if (tagPrefixes == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "tagPrefixes");
            }
            this.tagPrefixes = tagPrefixes;
            return this;
        }
        public Builder tagPrefixes(String... tagPrefixes) {
            return tagPrefixes(List.of(tagPrefixes));
        }
        @CustomType.Setter
        public Builder tagState(String tagState) {
            if (tagState == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "tagState");
            }
            this.tagState = tagState;
            return this;
        }
        @CustomType.Setter
        public Builder versionNamePrefixes(List<String> versionNamePrefixes) {
            if (versionNamePrefixes == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyCondition", "versionNamePrefixes");
            }
            this.versionNamePrefixes = versionNamePrefixes;
            return this;
        }
        public Builder versionNamePrefixes(String... versionNamePrefixes) {
            return versionNamePrefixes(List.of(versionNamePrefixes));
        }
        public GetRepositoryCleanupPolicyCondition build() {
            final var _resultValue = new GetRepositoryCleanupPolicyCondition();
            _resultValue.newerThan = newerThan;
            _resultValue.olderThan = olderThan;
            _resultValue.packageNamePrefixes = packageNamePrefixes;
            _resultValue.tagPrefixes = tagPrefixes;
            _resultValue.tagState = tagState;
            _resultValue.versionNamePrefixes = versionNamePrefixes;
            return _resultValue;
        }
    }
}
