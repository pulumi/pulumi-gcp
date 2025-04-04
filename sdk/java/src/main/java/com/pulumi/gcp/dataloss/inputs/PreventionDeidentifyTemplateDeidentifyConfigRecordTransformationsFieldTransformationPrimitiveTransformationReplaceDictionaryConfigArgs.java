// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs();

    /**
     * A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * Structure is documented below.
     * 
     */
    @Import(name="wordList")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs> wordList;

    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs>> wordList() {
        return Optional.ofNullable(this.wordList);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs $) {
        this.wordList = $.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder wordList(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs> wordList) {
            $.wordList = wordList;
            return this;
        }

        /**
         * @param wordList A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder wordList(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigWordListArgs wordList) {
            return wordList(Output.of(wordList));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceDictionaryConfigArgs build() {
            return $;
        }
    }

}
