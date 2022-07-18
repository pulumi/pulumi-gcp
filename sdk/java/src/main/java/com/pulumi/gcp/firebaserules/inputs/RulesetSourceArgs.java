// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebaserules.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.firebaserules.inputs.RulesetSourceFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetSourceArgs Empty = new RulesetSourceArgs();

    /**
     * `File` set constituting the `Source` bundle.
     * 
     */
    @Import(name="files", required=true)
    private Output<List<RulesetSourceFileArgs>> files;

    /**
     * @return `File` set constituting the `Source` bundle.
     * 
     */
    public Output<List<RulesetSourceFileArgs>> files() {
        return this.files;
    }

    /**
     * `Language` of the `Source` bundle. If unspecified, the language will default to `FIREBASE_RULES`. Possible values: LANGUAGE_UNSPECIFIED, FIREBASE_RULES, EVENT_FLOW_TRIGGERS
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return `Language` of the `Source` bundle. If unspecified, the language will default to `FIREBASE_RULES`. Possible values: LANGUAGE_UNSPECIFIED, FIREBASE_RULES, EVENT_FLOW_TRIGGERS
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    private RulesetSourceArgs() {}

    private RulesetSourceArgs(RulesetSourceArgs $) {
        this.files = $.files;
        this.language = $.language;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetSourceArgs $;

        public Builder() {
            $ = new RulesetSourceArgs();
        }

        public Builder(RulesetSourceArgs defaults) {
            $ = new RulesetSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param files `File` set constituting the `Source` bundle.
         * 
         * @return builder
         * 
         */
        public Builder files(Output<List<RulesetSourceFileArgs>> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files `File` set constituting the `Source` bundle.
         * 
         * @return builder
         * 
         */
        public Builder files(List<RulesetSourceFileArgs> files) {
            return files(Output.of(files));
        }

        /**
         * @param files `File` set constituting the `Source` bundle.
         * 
         * @return builder
         * 
         */
        public Builder files(RulesetSourceFileArgs... files) {
            return files(List.of(files));
        }

        /**
         * @param language `Language` of the `Source` bundle. If unspecified, the language will default to `FIREBASE_RULES`. Possible values: LANGUAGE_UNSPECIFIED, FIREBASE_RULES, EVENT_FLOW_TRIGGERS
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language `Language` of the `Source` bundle. If unspecified, the language will default to `FIREBASE_RULES`. Possible values: LANGUAGE_UNSPECIFIED, FIREBASE_RULES, EVENT_FLOW_TRIGGERS
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        public RulesetSourceArgs build() {
            $.files = Objects.requireNonNull($.files, "expected parameter 'files' to be non-null");
            return $;
        }
    }

}