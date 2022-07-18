// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckConfigContentMatcherJsonPathMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigContentMatcherJsonPathMatcherArgs Empty = new UptimeCheckConfigContentMatcherJsonPathMatcherArgs();

    /**
     * Options to perform JSONPath content matching.
     * Default value is `EXACT_MATCH`.
     * Possible values are `EXACT_MATCH` and `REGEX_MATCH`.
     * 
     */
    @Import(name="jsonMatcher")
    private @Nullable Output<String> jsonMatcher;

    /**
     * @return Options to perform JSONPath content matching.
     * Default value is `EXACT_MATCH`.
     * Possible values are `EXACT_MATCH` and `REGEX_MATCH`.
     * 
     */
    public Optional<Output<String>> jsonMatcher() {
        return Optional.ofNullable(this.jsonMatcher);
    }

    /**
     * JSONPath within the response output pointing to the expected `ContentMatcher::content` to match against.
     * 
     */
    @Import(name="jsonPath", required=true)
    private Output<String> jsonPath;

    /**
     * @return JSONPath within the response output pointing to the expected `ContentMatcher::content` to match against.
     * 
     */
    public Output<String> jsonPath() {
        return this.jsonPath;
    }

    private UptimeCheckConfigContentMatcherJsonPathMatcherArgs() {}

    private UptimeCheckConfigContentMatcherJsonPathMatcherArgs(UptimeCheckConfigContentMatcherJsonPathMatcherArgs $) {
        this.jsonMatcher = $.jsonMatcher;
        this.jsonPath = $.jsonPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigContentMatcherJsonPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigContentMatcherJsonPathMatcherArgs $;

        public Builder() {
            $ = new UptimeCheckConfigContentMatcherJsonPathMatcherArgs();
        }

        public Builder(UptimeCheckConfigContentMatcherJsonPathMatcherArgs defaults) {
            $ = new UptimeCheckConfigContentMatcherJsonPathMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jsonMatcher Options to perform JSONPath content matching.
         * Default value is `EXACT_MATCH`.
         * Possible values are `EXACT_MATCH` and `REGEX_MATCH`.
         * 
         * @return builder
         * 
         */
        public Builder jsonMatcher(@Nullable Output<String> jsonMatcher) {
            $.jsonMatcher = jsonMatcher;
            return this;
        }

        /**
         * @param jsonMatcher Options to perform JSONPath content matching.
         * Default value is `EXACT_MATCH`.
         * Possible values are `EXACT_MATCH` and `REGEX_MATCH`.
         * 
         * @return builder
         * 
         */
        public Builder jsonMatcher(String jsonMatcher) {
            return jsonMatcher(Output.of(jsonMatcher));
        }

        /**
         * @param jsonPath JSONPath within the response output pointing to the expected `ContentMatcher::content` to match against.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        /**
         * @param jsonPath JSONPath within the response output pointing to the expected `ContentMatcher::content` to match against.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        public UptimeCheckConfigContentMatcherJsonPathMatcherArgs build() {
            $.jsonPath = Objects.requireNonNull($.jsonPath, "expected parameter 'jsonPath' to be non-null");
            return $;
        }
    }

}