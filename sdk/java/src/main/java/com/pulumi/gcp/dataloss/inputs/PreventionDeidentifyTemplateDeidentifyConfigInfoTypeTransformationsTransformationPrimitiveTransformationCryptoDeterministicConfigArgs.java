// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs();

    /**
     * A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
     * If the context is not set, plaintext would be used as is for encryption. If the context is set but:
     * 1. there is no record present when transforming a given value or
     * 2. the field is not present when transforming a given value,
     *    plaintext would be used as is for encryption.
     *    Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
     *    Structure is documented below.
     * 
     */
    @Import(name="context")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs> context;

    /**
     * @return A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
     * If the context is not set, plaintext would be used as is for encryption. If the context is set but:
     * 1. there is no record present when transforming a given value or
     * 2. the field is not present when transforming a given value,
     *    plaintext would be used as is for encryption.
     *    Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
     *    Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoKey")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs> cryptoKey;

    /**
     * @return The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs>> cryptoKey() {
        return Optional.ofNullable(this.cryptoKey);
    }

    /**
     * The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
     * For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     * This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
     * Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
     * In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
     * *   reverse a surrogate that does not correspond to an actual identifier
     * *   be unable to parse the surrogate and result in an error
     *     Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE.
     *     Structure is documented below.
     * 
     */
    @Import(name="surrogateInfoType")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs> surrogateInfoType;

    /**
     * @return The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
     * For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     * This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
     * Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
     * In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
     * *   reverse a surrogate that does not correspond to an actual identifier
     * *   be unable to parse the surrogate and result in an error
     *     Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE.
     *     Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs>> surrogateInfoType() {
        return Optional.ofNullable(this.surrogateInfoType);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs $) {
        this.context = $.context;
        this.cryptoKey = $.cryptoKey;
        this.surrogateInfoType = $.surrogateInfoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
         * If the context is not set, plaintext would be used as is for encryption. If the context is set but:
         * 1. there is no record present when transforming a given value or
         * 2. the field is not present when transforming a given value,
         *    plaintext would be used as is for encryption.
         *    Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
         *    Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well.
         * If the context is not set, plaintext would be used as is for encryption. If the context is set but:
         * 1. there is no record present when transforming a given value or
         * 2. the field is not present when transforming a given value,
         *    plaintext would be used as is for encryption.
         *    Note that case (1) is expected when an InfoTypeTransformation is applied to both structured and unstructured ContentItems.
         *    Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder context(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigContextArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyArgs cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
         * For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
         * This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
         * Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
         * In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
         * *   reverse a surrogate that does not correspond to an actual identifier
         * *   be unable to parse the surrogate and result in an error
         *     Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE.
         *     Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs> surrogateInfoType) {
            $.surrogateInfoType = surrogateInfoType;
            return this;
        }

        /**
         * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate}
         * For example, if the name of custom info type is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
         * This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text.
         * Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text.
         * In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either
         * *   reverse a surrogate that does not correspond to an actual identifier
         * *   be unable to parse the surrogate and result in an error
         *     Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE.
         *     Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigSurrogateInfoTypeArgs surrogateInfoType) {
            return surrogateInfoType(Output.of(surrogateInfoType));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs build() {
            return $;
        }
    }

}
