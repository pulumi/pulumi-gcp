// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs();

    /**
     * Partially mask a string by replacing a given number of characters with a fixed character.
     * Masking can start from the beginning or end of the string.
     * Structure is documented below.
     * 
     */
    @Import(name="characterMaskConfig")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig;

    /**
     * @return Partially mask a string by replacing a given number of characters with a fixed character.
     * Masking can start from the beginning or end of the string.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs>> characterMaskConfig() {
        return Optional.ofNullable(this.characterMaskConfig);
    }

    /**
     * Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoDeterministicConfig")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig;

    /**
     * @return Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs>> cryptoDeterministicConfig() {
        return Optional.ofNullable(this.cryptoDeterministicConfig);
    }

    /**
     * Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     * Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoReplaceFfxFpeConfig")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;

    /**
     * @return Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     * Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs>> cryptoReplaceFfxFpeConfig() {
        return Optional.ofNullable(this.cryptoReplaceFfxFpeConfig);
    }

    /**
     * Replace each input value with a given value.
     * Structure is documented below.
     * 
     */
    @Import(name="replaceConfig")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig;

    /**
     * @return Replace each input value with a given value.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs>> replaceConfig() {
        return Optional.ofNullable(this.replaceConfig);
    }

    /**
     * Replace each matching finding with the name of the info type.
     * 
     */
    @Import(name="replaceWithInfoTypeConfig")
    private @Nullable Output<Boolean> replaceWithInfoTypeConfig;

    /**
     * @return Replace each matching finding with the name of the info type.
     * 
     */
    public Optional<Output<Boolean>> replaceWithInfoTypeConfig() {
        return Optional.ofNullable(this.replaceWithInfoTypeConfig);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs $) {
        this.characterMaskConfig = $.characterMaskConfig;
        this.cryptoDeterministicConfig = $.cryptoDeterministicConfig;
        this.cryptoReplaceFfxFpeConfig = $.cryptoReplaceFfxFpeConfig;
        this.replaceConfig = $.replaceConfig;
        this.replaceWithInfoTypeConfig = $.replaceWithInfoTypeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param characterMaskConfig Partially mask a string by replacing a given number of characters with a fixed character.
         * Masking can start from the beginning or end of the string.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder characterMaskConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig) {
            $.characterMaskConfig = characterMaskConfig;
            return this;
        }

        /**
         * @param characterMaskConfig Partially mask a string by replacing a given number of characters with a fixed character.
         * Masking can start from the beginning or end of the string.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder characterMaskConfig(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs characterMaskConfig) {
            return characterMaskConfig(Output.of(characterMaskConfig));
        }

        /**
         * @param cryptoDeterministicConfig Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoDeterministicConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig) {
            $.cryptoDeterministicConfig = cryptoDeterministicConfig;
            return this;
        }

        /**
         * @param cryptoDeterministicConfig Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoDeterministicConfig(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs cryptoDeterministicConfig) {
            return cryptoDeterministicConfig(Output.of(cryptoDeterministicConfig));
        }

        /**
         * @param cryptoReplaceFfxFpeConfig Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
         * Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoReplaceFfxFpeConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig) {
            $.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
            return this;
        }

        /**
         * @param cryptoReplaceFfxFpeConfig Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
         * Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoReplaceFfxFpeConfig(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs cryptoReplaceFfxFpeConfig) {
            return cryptoReplaceFfxFpeConfig(Output.of(cryptoReplaceFfxFpeConfig));
        }

        /**
         * @param replaceConfig Replace each input value with a given value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replaceConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig) {
            $.replaceConfig = replaceConfig;
            return this;
        }

        /**
         * @param replaceConfig Replace each input value with a given value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replaceConfig(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs replaceConfig) {
            return replaceConfig(Output.of(replaceConfig));
        }

        /**
         * @param replaceWithInfoTypeConfig Replace each matching finding with the name of the info type.
         * 
         * @return builder
         * 
         */
        public Builder replaceWithInfoTypeConfig(@Nullable Output<Boolean> replaceWithInfoTypeConfig) {
            $.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return this;
        }

        /**
         * @param replaceWithInfoTypeConfig Replace each matching finding with the name of the info type.
         * 
         * @return builder
         * 
         */
        public Builder replaceWithInfoTypeConfig(Boolean replaceWithInfoTypeConfig) {
            return replaceWithInfoTypeConfig(Output.of(replaceWithInfoTypeConfig));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs build() {
            return $;
        }
    }

}