// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ContactCenterInsights.Outputs
{

    [OutputType]
    public sealed class AnalysisRuleAnnotatorSelector
    {
        /// <summary>
        /// The issue model to run. If not provided, the most recently deployed topic
        /// model will be used. The provided issue model will only be used for
        /// inference if the issue model is deployed and if run_issue_model_annotator
        /// is set to true. If more than one issue model is provided, only the first
        /// provided issue model will be used for inference.
        /// </summary>
        public readonly ImmutableArray<string> IssueModels;
        /// <summary>
        /// The list of phrase matchers to run. If not provided, all active phrase
        /// matchers will be used. If inactive phrase matchers are provided, they will
        /// not be used. Phrase matchers will be run only if
        /// run_phrase_matcher_annotator is set to true. Format:
        /// projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
        /// </summary>
        public readonly ImmutableArray<string> PhraseMatchers;
        /// <summary>
        /// Configuration for the QA feature.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AnalysisRuleAnnotatorSelectorQaConfig? QaConfig;
        /// <summary>
        /// Whether to run the entity annotator.
        /// </summary>
        public readonly bool? RunEntityAnnotator;
        /// <summary>
        /// Whether to run the intent annotator.
        /// </summary>
        public readonly bool? RunIntentAnnotator;
        /// <summary>
        /// Whether to run the interruption annotator.
        /// </summary>
        public readonly bool? RunInterruptionAnnotator;
        /// <summary>
        /// Whether to run the issue model annotator. A model should have already been
        /// deployed for this to take effect.
        /// </summary>
        public readonly bool? RunIssueModelAnnotator;
        /// <summary>
        /// Whether to run the active phrase matcher annotator(s).
        /// </summary>
        public readonly bool? RunPhraseMatcherAnnotator;
        /// <summary>
        /// Whether to run the QA annotator.
        /// </summary>
        public readonly bool? RunQaAnnotator;
        /// <summary>
        /// Whether to run the sentiment annotator.
        /// </summary>
        public readonly bool? RunSentimentAnnotator;
        /// <summary>
        /// Whether to run the silence annotator.
        /// </summary>
        public readonly bool? RunSilenceAnnotator;
        /// <summary>
        /// Whether to run the summarization annotator.
        /// </summary>
        public readonly bool? RunSummarizationAnnotator;
        /// <summary>
        /// Configuration for summarization.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AnalysisRuleAnnotatorSelectorSummarizationConfig? SummarizationConfig;

        [OutputConstructor]
        private AnalysisRuleAnnotatorSelector(
            ImmutableArray<string> issueModels,

            ImmutableArray<string> phraseMatchers,

            Outputs.AnalysisRuleAnnotatorSelectorQaConfig? qaConfig,

            bool? runEntityAnnotator,

            bool? runIntentAnnotator,

            bool? runInterruptionAnnotator,

            bool? runIssueModelAnnotator,

            bool? runPhraseMatcherAnnotator,

            bool? runQaAnnotator,

            bool? runSentimentAnnotator,

            bool? runSilenceAnnotator,

            bool? runSummarizationAnnotator,

            Outputs.AnalysisRuleAnnotatorSelectorSummarizationConfig? summarizationConfig)
        {
            IssueModels = issueModels;
            PhraseMatchers = phraseMatchers;
            QaConfig = qaConfig;
            RunEntityAnnotator = runEntityAnnotator;
            RunIntentAnnotator = runIntentAnnotator;
            RunInterruptionAnnotator = runInterruptionAnnotator;
            RunIssueModelAnnotator = runIssueModelAnnotator;
            RunPhraseMatcherAnnotator = runPhraseMatcherAnnotator;
            RunQaAnnotator = runQaAnnotator;
            RunSentimentAnnotator = runSentimentAnnotator;
            RunSilenceAnnotator = runSilenceAnnotator;
            RunSummarizationAnnotator = runSummarizationAnnotator;
            SummarizationConfig = summarizationConfig;
        }
    }
}
