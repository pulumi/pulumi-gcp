// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.discoveryengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs Empty = new DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs();

    /**
     * If true, the LLM based annotation is added to the image during parsing.
     * 
     */
    @Import(name="enableImageAnnotation")
    private @Nullable Output<Boolean> enableImageAnnotation;

    /**
     * @return If true, the LLM based annotation is added to the image during parsing.
     * 
     */
    public Optional<Output<Boolean>> enableImageAnnotation() {
        return Optional.ofNullable(this.enableImageAnnotation);
    }

    /**
     * If true, the LLM based annotation is added to the table during parsing.
     * 
     */
    @Import(name="enableTableAnnotation")
    private @Nullable Output<Boolean> enableTableAnnotation;

    /**
     * @return If true, the LLM based annotation is added to the table during parsing.
     * 
     */
    public Optional<Output<Boolean>> enableTableAnnotation() {
        return Optional.ofNullable(this.enableTableAnnotation);
    }

    /**
     * List of HTML classes to exclude from the parsed content.
     * 
     */
    @Import(name="excludeHtmlClasses")
    private @Nullable Output<List<String>> excludeHtmlClasses;

    /**
     * @return List of HTML classes to exclude from the parsed content.
     * 
     */
    public Optional<Output<List<String>>> excludeHtmlClasses() {
        return Optional.ofNullable(this.excludeHtmlClasses);
    }

    /**
     * List of HTML elements to exclude from the parsed content.
     * 
     */
    @Import(name="excludeHtmlElements")
    private @Nullable Output<List<String>> excludeHtmlElements;

    /**
     * @return List of HTML elements to exclude from the parsed content.
     * 
     */
    public Optional<Output<List<String>>> excludeHtmlElements() {
        return Optional.ofNullable(this.excludeHtmlElements);
    }

    /**
     * List of HTML ids to exclude from the parsed content.
     * 
     */
    @Import(name="excludeHtmlIds")
    private @Nullable Output<List<String>> excludeHtmlIds;

    /**
     * @return List of HTML ids to exclude from the parsed content.
     * 
     */
    public Optional<Output<List<String>>> excludeHtmlIds() {
        return Optional.ofNullable(this.excludeHtmlIds);
    }

    /**
     * Contains the required structure types to extract from the document. Supported values: `shareholder-structure`.
     * 
     */
    @Import(name="structuredContentTypes")
    private @Nullable Output<List<String>> structuredContentTypes;

    /**
     * @return Contains the required structure types to extract from the document. Supported values: `shareholder-structure`.
     * 
     */
    public Optional<Output<List<String>>> structuredContentTypes() {
        return Optional.ofNullable(this.structuredContentTypes);
    }

    private DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs() {}

    private DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs(DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs $) {
        this.enableImageAnnotation = $.enableImageAnnotation;
        this.enableTableAnnotation = $.enableTableAnnotation;
        this.excludeHtmlClasses = $.excludeHtmlClasses;
        this.excludeHtmlElements = $.excludeHtmlElements;
        this.excludeHtmlIds = $.excludeHtmlIds;
        this.structuredContentTypes = $.structuredContentTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs $;

        public Builder() {
            $ = new DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs();
        }

        public Builder(DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs defaults) {
            $ = new DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableImageAnnotation If true, the LLM based annotation is added to the image during parsing.
         * 
         * @return builder
         * 
         */
        public Builder enableImageAnnotation(@Nullable Output<Boolean> enableImageAnnotation) {
            $.enableImageAnnotation = enableImageAnnotation;
            return this;
        }

        /**
         * @param enableImageAnnotation If true, the LLM based annotation is added to the image during parsing.
         * 
         * @return builder
         * 
         */
        public Builder enableImageAnnotation(Boolean enableImageAnnotation) {
            return enableImageAnnotation(Output.of(enableImageAnnotation));
        }

        /**
         * @param enableTableAnnotation If true, the LLM based annotation is added to the table during parsing.
         * 
         * @return builder
         * 
         */
        public Builder enableTableAnnotation(@Nullable Output<Boolean> enableTableAnnotation) {
            $.enableTableAnnotation = enableTableAnnotation;
            return this;
        }

        /**
         * @param enableTableAnnotation If true, the LLM based annotation is added to the table during parsing.
         * 
         * @return builder
         * 
         */
        public Builder enableTableAnnotation(Boolean enableTableAnnotation) {
            return enableTableAnnotation(Output.of(enableTableAnnotation));
        }

        /**
         * @param excludeHtmlClasses List of HTML classes to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlClasses(@Nullable Output<List<String>> excludeHtmlClasses) {
            $.excludeHtmlClasses = excludeHtmlClasses;
            return this;
        }

        /**
         * @param excludeHtmlClasses List of HTML classes to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlClasses(List<String> excludeHtmlClasses) {
            return excludeHtmlClasses(Output.of(excludeHtmlClasses));
        }

        /**
         * @param excludeHtmlClasses List of HTML classes to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlClasses(String... excludeHtmlClasses) {
            return excludeHtmlClasses(List.of(excludeHtmlClasses));
        }

        /**
         * @param excludeHtmlElements List of HTML elements to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlElements(@Nullable Output<List<String>> excludeHtmlElements) {
            $.excludeHtmlElements = excludeHtmlElements;
            return this;
        }

        /**
         * @param excludeHtmlElements List of HTML elements to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlElements(List<String> excludeHtmlElements) {
            return excludeHtmlElements(Output.of(excludeHtmlElements));
        }

        /**
         * @param excludeHtmlElements List of HTML elements to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlElements(String... excludeHtmlElements) {
            return excludeHtmlElements(List.of(excludeHtmlElements));
        }

        /**
         * @param excludeHtmlIds List of HTML ids to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlIds(@Nullable Output<List<String>> excludeHtmlIds) {
            $.excludeHtmlIds = excludeHtmlIds;
            return this;
        }

        /**
         * @param excludeHtmlIds List of HTML ids to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlIds(List<String> excludeHtmlIds) {
            return excludeHtmlIds(Output.of(excludeHtmlIds));
        }

        /**
         * @param excludeHtmlIds List of HTML ids to exclude from the parsed content.
         * 
         * @return builder
         * 
         */
        public Builder excludeHtmlIds(String... excludeHtmlIds) {
            return excludeHtmlIds(List.of(excludeHtmlIds));
        }

        /**
         * @param structuredContentTypes Contains the required structure types to extract from the document. Supported values: `shareholder-structure`.
         * 
         * @return builder
         * 
         */
        public Builder structuredContentTypes(@Nullable Output<List<String>> structuredContentTypes) {
            $.structuredContentTypes = structuredContentTypes;
            return this;
        }

        /**
         * @param structuredContentTypes Contains the required structure types to extract from the document. Supported values: `shareholder-structure`.
         * 
         * @return builder
         * 
         */
        public Builder structuredContentTypes(List<String> structuredContentTypes) {
            return structuredContentTypes(Output.of(structuredContentTypes));
        }

        /**
         * @param structuredContentTypes Contains the required structure types to extract from the document. Supported values: `shareholder-structure`.
         * 
         * @return builder
         * 
         */
        public Builder structuredContentTypes(String... structuredContentTypes) {
            return structuredContentTypes(List.of(structuredContentTypes));
        }

        public DataStoreDocumentProcessingConfigParsingConfigOverrideLayoutParsingConfigArgs build() {
            return $;
        }
    }

}
