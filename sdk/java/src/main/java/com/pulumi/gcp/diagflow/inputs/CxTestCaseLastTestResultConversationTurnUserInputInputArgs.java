// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs;
import com.pulumi.gcp.diagflow.inputs.CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxTestCaseLastTestResultConversationTurnUserInputInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxTestCaseLastTestResultConversationTurnUserInputInputArgs Empty = new CxTestCaseLastTestResultConversationTurnUserInputInputArgs();

    /**
     * The DTMF event to be handled.
     * Structure is documented below.
     * 
     */
    @Import(name="dtmf")
    private @Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs> dtmf;

    /**
     * @return The DTMF event to be handled.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs>> dtmf() {
        return Optional.ofNullable(this.dtmf);
    }

    /**
     * The event to be triggered.
     * Structure is documented below.
     * 
     */
    @Import(name="event")
    private @Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs> event;

    /**
     * @return The event to be triggered.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
     * Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
     * Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * The natural language text to be processed.
     * Structure is documented below.
     * 
     */
    @Import(name="text")
    private @Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs> text;

    /**
     * @return The natural language text to be processed.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private CxTestCaseLastTestResultConversationTurnUserInputInputArgs() {}

    private CxTestCaseLastTestResultConversationTurnUserInputInputArgs(CxTestCaseLastTestResultConversationTurnUserInputInputArgs $) {
        this.dtmf = $.dtmf;
        this.event = $.event;
        this.languageCode = $.languageCode;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxTestCaseLastTestResultConversationTurnUserInputInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxTestCaseLastTestResultConversationTurnUserInputInputArgs $;

        public Builder() {
            $ = new CxTestCaseLastTestResultConversationTurnUserInputInputArgs();
        }

        public Builder(CxTestCaseLastTestResultConversationTurnUserInputInputArgs defaults) {
            $ = new CxTestCaseLastTestResultConversationTurnUserInputInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dtmf The DTMF event to be handled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dtmf(@Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs> dtmf) {
            $.dtmf = dtmf;
            return this;
        }

        /**
         * @param dtmf The DTMF event to be handled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dtmf(CxTestCaseLastTestResultConversationTurnUserInputInputDtmfArgs dtmf) {
            return dtmf(Output.of(dtmf));
        }

        /**
         * @param event The event to be triggered.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event The event to be triggered.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder event(CxTestCaseLastTestResultConversationTurnUserInputInputEventArgs event) {
            return event(Output.of(event));
        }

        /**
         * @param languageCode The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
         * Note that queries in the same session do not necessarily need to specify the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
         * Note that queries in the same session do not necessarily need to specify the same language.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param text The natural language text to be processed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The natural language text to be processed.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder text(CxTestCaseLastTestResultConversationTurnUserInputInputTextArgs text) {
            return text(Output.of(text));
        }

        public CxTestCaseLastTestResultConversationTurnUserInputInputArgs build() {
            return $;
        }
    }

}
