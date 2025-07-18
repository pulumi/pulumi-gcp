// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.contactcenterinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorQaConfigArgs;
import com.pulumi.gcp.contactcenterinsights.inputs.AnalysisRuleAnnotatorSelectorSummarizationConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalysisRuleAnnotatorSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalysisRuleAnnotatorSelectorArgs Empty = new AnalysisRuleAnnotatorSelectorArgs();

    /**
     * The issue model to run. If not provided, the most recently deployed topic
     * model will be used. The provided issue model will only be used for
     * inference if the issue model is deployed and if run_issue_model_annotator
     * is set to true. If more than one issue model is provided, only the first
     * provided issue model will be used for inference.
     * 
     */
    @Import(name="issueModels")
    private @Nullable Output<List<String>> issueModels;

    /**
     * @return The issue model to run. If not provided, the most recently deployed topic
     * model will be used. The provided issue model will only be used for
     * inference if the issue model is deployed and if run_issue_model_annotator
     * is set to true. If more than one issue model is provided, only the first
     * provided issue model will be used for inference.
     * 
     */
    public Optional<Output<List<String>>> issueModels() {
        return Optional.ofNullable(this.issueModels);
    }

    /**
     * The list of phrase matchers to run. If not provided, all active phrase
     * matchers will be used. If inactive phrase matchers are provided, they will
     * not be used. Phrase matchers will be run only if
     * run_phrase_matcher_annotator is set to true. Format:
     * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    @Import(name="phraseMatchers")
    private @Nullable Output<List<String>> phraseMatchers;

    /**
     * @return The list of phrase matchers to run. If not provided, all active phrase
     * matchers will be used. If inactive phrase matchers are provided, they will
     * not be used. Phrase matchers will be run only if
     * run_phrase_matcher_annotator is set to true. Format:
     * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    public Optional<Output<List<String>>> phraseMatchers() {
        return Optional.ofNullable(this.phraseMatchers);
    }

    /**
     * Configuration for the QA feature.
     * Structure is documented below.
     * 
     */
    @Import(name="qaConfig")
    private @Nullable Output<AnalysisRuleAnnotatorSelectorQaConfigArgs> qaConfig;

    /**
     * @return Configuration for the QA feature.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AnalysisRuleAnnotatorSelectorQaConfigArgs>> qaConfig() {
        return Optional.ofNullable(this.qaConfig);
    }

    /**
     * Whether to run the entity annotator.
     * 
     */
    @Import(name="runEntityAnnotator")
    private @Nullable Output<Boolean> runEntityAnnotator;

    /**
     * @return Whether to run the entity annotator.
     * 
     */
    public Optional<Output<Boolean>> runEntityAnnotator() {
        return Optional.ofNullable(this.runEntityAnnotator);
    }

    /**
     * Whether to run the intent annotator.
     * 
     */
    @Import(name="runIntentAnnotator")
    private @Nullable Output<Boolean> runIntentAnnotator;

    /**
     * @return Whether to run the intent annotator.
     * 
     */
    public Optional<Output<Boolean>> runIntentAnnotator() {
        return Optional.ofNullable(this.runIntentAnnotator);
    }

    /**
     * Whether to run the interruption annotator.
     * 
     */
    @Import(name="runInterruptionAnnotator")
    private @Nullable Output<Boolean> runInterruptionAnnotator;

    /**
     * @return Whether to run the interruption annotator.
     * 
     */
    public Optional<Output<Boolean>> runInterruptionAnnotator() {
        return Optional.ofNullable(this.runInterruptionAnnotator);
    }

    /**
     * Whether to run the issue model annotator. A model should have already been
     * deployed for this to take effect.
     * 
     */
    @Import(name="runIssueModelAnnotator")
    private @Nullable Output<Boolean> runIssueModelAnnotator;

    /**
     * @return Whether to run the issue model annotator. A model should have already been
     * deployed for this to take effect.
     * 
     */
    public Optional<Output<Boolean>> runIssueModelAnnotator() {
        return Optional.ofNullable(this.runIssueModelAnnotator);
    }

    /**
     * Whether to run the active phrase matcher annotator(s).
     * 
     */
    @Import(name="runPhraseMatcherAnnotator")
    private @Nullable Output<Boolean> runPhraseMatcherAnnotator;

    /**
     * @return Whether to run the active phrase matcher annotator(s).
     * 
     */
    public Optional<Output<Boolean>> runPhraseMatcherAnnotator() {
        return Optional.ofNullable(this.runPhraseMatcherAnnotator);
    }

    /**
     * Whether to run the QA annotator.
     * 
     */
    @Import(name="runQaAnnotator")
    private @Nullable Output<Boolean> runQaAnnotator;

    /**
     * @return Whether to run the QA annotator.
     * 
     */
    public Optional<Output<Boolean>> runQaAnnotator() {
        return Optional.ofNullable(this.runQaAnnotator);
    }

    /**
     * Whether to run the sentiment annotator.
     * 
     */
    @Import(name="runSentimentAnnotator")
    private @Nullable Output<Boolean> runSentimentAnnotator;

    /**
     * @return Whether to run the sentiment annotator.
     * 
     */
    public Optional<Output<Boolean>> runSentimentAnnotator() {
        return Optional.ofNullable(this.runSentimentAnnotator);
    }

    /**
     * Whether to run the silence annotator.
     * 
     */
    @Import(name="runSilenceAnnotator")
    private @Nullable Output<Boolean> runSilenceAnnotator;

    /**
     * @return Whether to run the silence annotator.
     * 
     */
    public Optional<Output<Boolean>> runSilenceAnnotator() {
        return Optional.ofNullable(this.runSilenceAnnotator);
    }

    /**
     * Whether to run the summarization annotator.
     * 
     */
    @Import(name="runSummarizationAnnotator")
    private @Nullable Output<Boolean> runSummarizationAnnotator;

    /**
     * @return Whether to run the summarization annotator.
     * 
     */
    public Optional<Output<Boolean>> runSummarizationAnnotator() {
        return Optional.ofNullable(this.runSummarizationAnnotator);
    }

    /**
     * Configuration for summarization.
     * Structure is documented below.
     * 
     */
    @Import(name="summarizationConfig")
    private @Nullable Output<AnalysisRuleAnnotatorSelectorSummarizationConfigArgs> summarizationConfig;

    /**
     * @return Configuration for summarization.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AnalysisRuleAnnotatorSelectorSummarizationConfigArgs>> summarizationConfig() {
        return Optional.ofNullable(this.summarizationConfig);
    }

    private AnalysisRuleAnnotatorSelectorArgs() {}

    private AnalysisRuleAnnotatorSelectorArgs(AnalysisRuleAnnotatorSelectorArgs $) {
        this.issueModels = $.issueModels;
        this.phraseMatchers = $.phraseMatchers;
        this.qaConfig = $.qaConfig;
        this.runEntityAnnotator = $.runEntityAnnotator;
        this.runIntentAnnotator = $.runIntentAnnotator;
        this.runInterruptionAnnotator = $.runInterruptionAnnotator;
        this.runIssueModelAnnotator = $.runIssueModelAnnotator;
        this.runPhraseMatcherAnnotator = $.runPhraseMatcherAnnotator;
        this.runQaAnnotator = $.runQaAnnotator;
        this.runSentimentAnnotator = $.runSentimentAnnotator;
        this.runSilenceAnnotator = $.runSilenceAnnotator;
        this.runSummarizationAnnotator = $.runSummarizationAnnotator;
        this.summarizationConfig = $.summarizationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalysisRuleAnnotatorSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalysisRuleAnnotatorSelectorArgs $;

        public Builder() {
            $ = new AnalysisRuleAnnotatorSelectorArgs();
        }

        public Builder(AnalysisRuleAnnotatorSelectorArgs defaults) {
            $ = new AnalysisRuleAnnotatorSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param issueModels The issue model to run. If not provided, the most recently deployed topic
         * model will be used. The provided issue model will only be used for
         * inference if the issue model is deployed and if run_issue_model_annotator
         * is set to true. If more than one issue model is provided, only the first
         * provided issue model will be used for inference.
         * 
         * @return builder
         * 
         */
        public Builder issueModels(@Nullable Output<List<String>> issueModels) {
            $.issueModels = issueModels;
            return this;
        }

        /**
         * @param issueModels The issue model to run. If not provided, the most recently deployed topic
         * model will be used. The provided issue model will only be used for
         * inference if the issue model is deployed and if run_issue_model_annotator
         * is set to true. If more than one issue model is provided, only the first
         * provided issue model will be used for inference.
         * 
         * @return builder
         * 
         */
        public Builder issueModels(List<String> issueModels) {
            return issueModels(Output.of(issueModels));
        }

        /**
         * @param issueModels The issue model to run. If not provided, the most recently deployed topic
         * model will be used. The provided issue model will only be used for
         * inference if the issue model is deployed and if run_issue_model_annotator
         * is set to true. If more than one issue model is provided, only the first
         * provided issue model will be used for inference.
         * 
         * @return builder
         * 
         */
        public Builder issueModels(String... issueModels) {
            return issueModels(List.of(issueModels));
        }

        /**
         * @param phraseMatchers The list of phrase matchers to run. If not provided, all active phrase
         * matchers will be used. If inactive phrase matchers are provided, they will
         * not be used. Phrase matchers will be run only if
         * run_phrase_matcher_annotator is set to true. Format:
         * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
         * 
         * @return builder
         * 
         */
        public Builder phraseMatchers(@Nullable Output<List<String>> phraseMatchers) {
            $.phraseMatchers = phraseMatchers;
            return this;
        }

        /**
         * @param phraseMatchers The list of phrase matchers to run. If not provided, all active phrase
         * matchers will be used. If inactive phrase matchers are provided, they will
         * not be used. Phrase matchers will be run only if
         * run_phrase_matcher_annotator is set to true. Format:
         * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
         * 
         * @return builder
         * 
         */
        public Builder phraseMatchers(List<String> phraseMatchers) {
            return phraseMatchers(Output.of(phraseMatchers));
        }

        /**
         * @param phraseMatchers The list of phrase matchers to run. If not provided, all active phrase
         * matchers will be used. If inactive phrase matchers are provided, they will
         * not be used. Phrase matchers will be run only if
         * run_phrase_matcher_annotator is set to true. Format:
         * projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
         * 
         * @return builder
         * 
         */
        public Builder phraseMatchers(String... phraseMatchers) {
            return phraseMatchers(List.of(phraseMatchers));
        }

        /**
         * @param qaConfig Configuration for the QA feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder qaConfig(@Nullable Output<AnalysisRuleAnnotatorSelectorQaConfigArgs> qaConfig) {
            $.qaConfig = qaConfig;
            return this;
        }

        /**
         * @param qaConfig Configuration for the QA feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder qaConfig(AnalysisRuleAnnotatorSelectorQaConfigArgs qaConfig) {
            return qaConfig(Output.of(qaConfig));
        }

        /**
         * @param runEntityAnnotator Whether to run the entity annotator.
         * 
         * @return builder
         * 
         */
        public Builder runEntityAnnotator(@Nullable Output<Boolean> runEntityAnnotator) {
            $.runEntityAnnotator = runEntityAnnotator;
            return this;
        }

        /**
         * @param runEntityAnnotator Whether to run the entity annotator.
         * 
         * @return builder
         * 
         */
        public Builder runEntityAnnotator(Boolean runEntityAnnotator) {
            return runEntityAnnotator(Output.of(runEntityAnnotator));
        }

        /**
         * @param runIntentAnnotator Whether to run the intent annotator.
         * 
         * @return builder
         * 
         */
        public Builder runIntentAnnotator(@Nullable Output<Boolean> runIntentAnnotator) {
            $.runIntentAnnotator = runIntentAnnotator;
            return this;
        }

        /**
         * @param runIntentAnnotator Whether to run the intent annotator.
         * 
         * @return builder
         * 
         */
        public Builder runIntentAnnotator(Boolean runIntentAnnotator) {
            return runIntentAnnotator(Output.of(runIntentAnnotator));
        }

        /**
         * @param runInterruptionAnnotator Whether to run the interruption annotator.
         * 
         * @return builder
         * 
         */
        public Builder runInterruptionAnnotator(@Nullable Output<Boolean> runInterruptionAnnotator) {
            $.runInterruptionAnnotator = runInterruptionAnnotator;
            return this;
        }

        /**
         * @param runInterruptionAnnotator Whether to run the interruption annotator.
         * 
         * @return builder
         * 
         */
        public Builder runInterruptionAnnotator(Boolean runInterruptionAnnotator) {
            return runInterruptionAnnotator(Output.of(runInterruptionAnnotator));
        }

        /**
         * @param runIssueModelAnnotator Whether to run the issue model annotator. A model should have already been
         * deployed for this to take effect.
         * 
         * @return builder
         * 
         */
        public Builder runIssueModelAnnotator(@Nullable Output<Boolean> runIssueModelAnnotator) {
            $.runIssueModelAnnotator = runIssueModelAnnotator;
            return this;
        }

        /**
         * @param runIssueModelAnnotator Whether to run the issue model annotator. A model should have already been
         * deployed for this to take effect.
         * 
         * @return builder
         * 
         */
        public Builder runIssueModelAnnotator(Boolean runIssueModelAnnotator) {
            return runIssueModelAnnotator(Output.of(runIssueModelAnnotator));
        }

        /**
         * @param runPhraseMatcherAnnotator Whether to run the active phrase matcher annotator(s).
         * 
         * @return builder
         * 
         */
        public Builder runPhraseMatcherAnnotator(@Nullable Output<Boolean> runPhraseMatcherAnnotator) {
            $.runPhraseMatcherAnnotator = runPhraseMatcherAnnotator;
            return this;
        }

        /**
         * @param runPhraseMatcherAnnotator Whether to run the active phrase matcher annotator(s).
         * 
         * @return builder
         * 
         */
        public Builder runPhraseMatcherAnnotator(Boolean runPhraseMatcherAnnotator) {
            return runPhraseMatcherAnnotator(Output.of(runPhraseMatcherAnnotator));
        }

        /**
         * @param runQaAnnotator Whether to run the QA annotator.
         * 
         * @return builder
         * 
         */
        public Builder runQaAnnotator(@Nullable Output<Boolean> runQaAnnotator) {
            $.runQaAnnotator = runQaAnnotator;
            return this;
        }

        /**
         * @param runQaAnnotator Whether to run the QA annotator.
         * 
         * @return builder
         * 
         */
        public Builder runQaAnnotator(Boolean runQaAnnotator) {
            return runQaAnnotator(Output.of(runQaAnnotator));
        }

        /**
         * @param runSentimentAnnotator Whether to run the sentiment annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSentimentAnnotator(@Nullable Output<Boolean> runSentimentAnnotator) {
            $.runSentimentAnnotator = runSentimentAnnotator;
            return this;
        }

        /**
         * @param runSentimentAnnotator Whether to run the sentiment annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSentimentAnnotator(Boolean runSentimentAnnotator) {
            return runSentimentAnnotator(Output.of(runSentimentAnnotator));
        }

        /**
         * @param runSilenceAnnotator Whether to run the silence annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSilenceAnnotator(@Nullable Output<Boolean> runSilenceAnnotator) {
            $.runSilenceAnnotator = runSilenceAnnotator;
            return this;
        }

        /**
         * @param runSilenceAnnotator Whether to run the silence annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSilenceAnnotator(Boolean runSilenceAnnotator) {
            return runSilenceAnnotator(Output.of(runSilenceAnnotator));
        }

        /**
         * @param runSummarizationAnnotator Whether to run the summarization annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSummarizationAnnotator(@Nullable Output<Boolean> runSummarizationAnnotator) {
            $.runSummarizationAnnotator = runSummarizationAnnotator;
            return this;
        }

        /**
         * @param runSummarizationAnnotator Whether to run the summarization annotator.
         * 
         * @return builder
         * 
         */
        public Builder runSummarizationAnnotator(Boolean runSummarizationAnnotator) {
            return runSummarizationAnnotator(Output.of(runSummarizationAnnotator));
        }

        /**
         * @param summarizationConfig Configuration for summarization.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder summarizationConfig(@Nullable Output<AnalysisRuleAnnotatorSelectorSummarizationConfigArgs> summarizationConfig) {
            $.summarizationConfig = summarizationConfig;
            return this;
        }

        /**
         * @param summarizationConfig Configuration for summarization.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder summarizationConfig(AnalysisRuleAnnotatorSelectorSummarizationConfigArgs summarizationConfig) {
            return summarizationConfig(Output.of(summarizationConfig));
        }

        public AnalysisRuleAnnotatorSelectorArgs build() {
            return $;
        }
    }

}
