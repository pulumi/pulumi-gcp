// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxEntityTypeExcludedPhraseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxEntityTypeExcludedPhraseArgs Empty = new CxEntityTypeExcludedPhraseArgs();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The word or phrase to be excluded.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CxEntityTypeExcludedPhraseArgs() {}

    private CxEntityTypeExcludedPhraseArgs(CxEntityTypeExcludedPhraseArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxEntityTypeExcludedPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxEntityTypeExcludedPhraseArgs $;

        public Builder() {
            $ = new CxEntityTypeExcludedPhraseArgs();
        }

        public Builder(CxEntityTypeExcludedPhraseArgs defaults) {
            $ = new CxEntityTypeExcludedPhraseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CxEntityTypeExcludedPhraseArgs build() {
            return $;
        }
    }

}
