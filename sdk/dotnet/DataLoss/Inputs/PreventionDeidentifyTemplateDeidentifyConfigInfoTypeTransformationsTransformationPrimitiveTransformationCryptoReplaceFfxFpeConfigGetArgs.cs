// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Common alphabets. Only one of this, `custom_alphabet` or `radix` must be specified.
        /// Possible values are: `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, `ALPHA_NUMERIC`.
        /// </summary>
        [Input("commonAlphabet")]
        public Input<string>? CommonAlphabet { get; set; }

        /// <summary>
        /// The 'tweak', a context may be used for higher security since the same identifier in two different contexts won't be given the same surrogate. If the context is not set, a default tweak will be used.
        /// If the context is set but:
        /// 1.  there is no record present when transforming a given value or
        /// 2.  the field is not present when transforming a given value,
        /// a default tweak will be used.
        /// Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string.
        /// The tweak is constructed as a sequence of bytes in big endian byte order such that:
        /// *   a 64 bit integer is encoded followed by a single byte of value 1
        /// *   a string is encoded in UTF-8 format followed by a single byte of value 2
        /// Structure is documented below.
        /// </summary>
        [Input("context")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextGetArgs>? Context { get; set; }

        /// <summary>
        /// The key used by the encryption algorithm.
        /// Structure is documented below.
        /// </summary>
        [Input("cryptoKey")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyGetArgs>? CryptoKey { get; set; }

        /// <summary>
        /// This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
        /// ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|:;"'&lt;,&gt;.?/``. Only one of this, `common_alphabet` or `radix` must be specified.
        /// </summary>
        [Input("customAlphabet")]
        public Input<string>? CustomAlphabet { get; set; }

        /// <summary>
        /// The native way to select the alphabet. Must be in the range \[2, 95\]. Only one of this, `custom_alphabet` or `common_alphabet` must be specified.
        /// </summary>
        [Input("radix")]
        public Input<int>? Radix { get; set; }

        /// <summary>
        /// The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
        /// For example, if the name of custom infoType is 'MY\_TOKEN\_INFO\_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY\_TOKEN\_INFO\_TYPE(3):abc'
        /// This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
        /// In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
        /// Structure is documented below.
        /// </summary>
        [Input("surrogateInfoType")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeGetArgs>? SurrogateInfoType { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigGetArgs();
    }
}
