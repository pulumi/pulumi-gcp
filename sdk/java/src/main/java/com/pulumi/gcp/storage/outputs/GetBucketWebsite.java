// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBucketWebsite {
    private final String mainPageSuffix;
    private final String notFoundPage;

    @CustomType.Constructor
    private GetBucketWebsite(
        @CustomType.Parameter("mainPageSuffix") String mainPageSuffix,
        @CustomType.Parameter("notFoundPage") String notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    public String mainPageSuffix() {
        return this.mainPageSuffix;
    }
    public String notFoundPage() {
        return this.notFoundPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketWebsite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mainPageSuffix;
        private String notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketWebsite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder mainPageSuffix(String mainPageSuffix) {
            this.mainPageSuffix = Objects.requireNonNull(mainPageSuffix);
            return this;
        }
        public Builder notFoundPage(String notFoundPage) {
            this.notFoundPage = Objects.requireNonNull(notFoundPage);
            return this;
        }        public GetBucketWebsite build() {
            return new GetBucketWebsite(mainPageSuffix, notFoundPage);
        }
    }
}