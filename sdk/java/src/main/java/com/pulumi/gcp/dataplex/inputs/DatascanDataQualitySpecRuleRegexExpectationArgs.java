// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatascanDataQualitySpecRuleRegexExpectationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataQualitySpecRuleRegexExpectationArgs Empty = new DatascanDataQualitySpecRuleRegexExpectationArgs();

    /**
     * A regular expression the column value is expected to match.
     * 
     */
    @Import(name="regex", required=true)
    private Output<String> regex;

    /**
     * @return A regular expression the column value is expected to match.
     * 
     */
    public Output<String> regex() {
        return this.regex;
    }

    private DatascanDataQualitySpecRuleRegexExpectationArgs() {}

    private DatascanDataQualitySpecRuleRegexExpectationArgs(DatascanDataQualitySpecRuleRegexExpectationArgs $) {
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataQualitySpecRuleRegexExpectationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataQualitySpecRuleRegexExpectationArgs $;

        public Builder() {
            $ = new DatascanDataQualitySpecRuleRegexExpectationArgs();
        }

        public Builder(DatascanDataQualitySpecRuleRegexExpectationArgs defaults) {
            $ = new DatascanDataQualitySpecRuleRegexExpectationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regex A regular expression the column value is expected to match.
         * 
         * @return builder
         * 
         */
        public Builder regex(Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex A regular expression the column value is expected to match.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public DatascanDataQualitySpecRuleRegexExpectationArgs build() {
            $.regex = Objects.requireNonNull($.regex, "expected parameter 'regex' to be non-null");
            return $;
        }
    }

}