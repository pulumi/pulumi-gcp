// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRepositoryCleanupPolicyMostRecentVersion {
    /**
     * @return Minimum number of versions to keep.
     * 
     */
    private Integer keepCount;
    /**
     * @return Match versions by package prefix. Applied on any prefix match.
     * 
     */
    private List<String> packageNamePrefixes;

    private GetRepositoryCleanupPolicyMostRecentVersion() {}
    /**
     * @return Minimum number of versions to keep.
     * 
     */
    public Integer keepCount() {
        return this.keepCount;
    }
    /**
     * @return Match versions by package prefix. Applied on any prefix match.
     * 
     */
    public List<String> packageNamePrefixes() {
        return this.packageNamePrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryCleanupPolicyMostRecentVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer keepCount;
        private List<String> packageNamePrefixes;
        public Builder() {}
        public Builder(GetRepositoryCleanupPolicyMostRecentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepCount = defaults.keepCount;
    	      this.packageNamePrefixes = defaults.packageNamePrefixes;
        }

        @CustomType.Setter
        public Builder keepCount(Integer keepCount) {
            if (keepCount == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyMostRecentVersion", "keepCount");
            }
            this.keepCount = keepCount;
            return this;
        }
        @CustomType.Setter
        public Builder packageNamePrefixes(List<String> packageNamePrefixes) {
            if (packageNamePrefixes == null) {
              throw new MissingRequiredPropertyException("GetRepositoryCleanupPolicyMostRecentVersion", "packageNamePrefixes");
            }
            this.packageNamePrefixes = packageNamePrefixes;
            return this;
        }
        public Builder packageNamePrefixes(String... packageNamePrefixes) {
            return packageNamePrefixes(List.of(packageNamePrefixes));
        }
        public GetRepositoryCleanupPolicyMostRecentVersion build() {
            final var _resultValue = new GetRepositoryCleanupPolicyMostRecentVersion();
            _resultValue.keepCount = keepCount;
            _resultValue.packageNamePrefixes = packageNamePrefixes;
            return _resultValue;
        }
    }
}
