// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualityResultRuleRuleRegexExpectation {
    /**
     * @return A regular expression the column value is expected to match.
     * 
     */
    private @Nullable String regex;

    private DatascanDataQualityResultRuleRuleRegexExpectation() {}
    /**
     * @return A regular expression the column value is expected to match.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualityResultRuleRuleRegexExpectation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String regex;
        public Builder() {}
        public Builder(DatascanDataQualityResultRuleRuleRegexExpectation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
        }

        @CustomType.Setter
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        public DatascanDataQualityResultRuleRuleRegexExpectation build() {
            final var o = new DatascanDataQualityResultRuleRuleRegexExpectation();
            o.regex = regex;
            return o;
        }
    }
}