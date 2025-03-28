// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket {
    /**
     * @return List of bucket id regexes to exclude in the storage intelligence plan.
     * 
     */
    private List<String> bucketIdRegexes;

    private GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket() {}
    /**
     * @return List of bucket id regexes to exclude in the storage intelligence plan.
     * 
     */
    public List<String> bucketIdRegexes() {
        return this.bucketIdRegexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> bucketIdRegexes;
        public Builder() {}
        public Builder(GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketIdRegexes = defaults.bucketIdRegexes;
        }

        @CustomType.Setter
        public Builder bucketIdRegexes(List<String> bucketIdRegexes) {
            if (bucketIdRegexes == null) {
              throw new MissingRequiredPropertyException("GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket", "bucketIdRegexes");
            }
            this.bucketIdRegexes = bucketIdRegexes;
            return this;
        }
        public Builder bucketIdRegexes(String... bucketIdRegexes) {
            return bucketIdRegexes(List.of(bucketIdRegexes));
        }
        public GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket build() {
            final var _resultValue = new GetControlProjectIntelligenceConfigFilterIncludedCloudStorageBucket();
            _resultValue.bucketIdRegexes = bucketIdRegexes;
            return _resultValue;
        }
    }
}
