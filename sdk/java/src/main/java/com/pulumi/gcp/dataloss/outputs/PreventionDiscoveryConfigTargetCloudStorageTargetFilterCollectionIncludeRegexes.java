// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes {
    /**
     * @return The group of regular expression patterns to match against one or more file stores. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     * Structure is documented below.
     * 
     */
    private @Nullable List<PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern> patterns;

    private PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes() {}
    /**
     * @return The group of regular expression patterns to match against one or more file stores. Maximum of 100 entries. The sum of all lengths of regular expressions can&#39;t exceed 10 KiB.
     * Structure is documented below.
     * 
     */
    public List<PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern> patterns() {
        return this.patterns == null ? List.of() : this.patterns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern> patterns;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.patterns = defaults.patterns;
        }

        @CustomType.Setter
        public Builder patterns(@Nullable List<PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern> patterns) {

            this.patterns = patterns;
            return this;
        }
        public Builder patterns(PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexesPattern... patterns) {
            return patterns(List.of(patterns));
        }
        public PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes build() {
            final var _resultValue = new PreventionDiscoveryConfigTargetCloudStorageTargetFilterCollectionIncludeRegexes();
            _resultValue.patterns = patterns;
            return _resultValue;
        }
    }
}
