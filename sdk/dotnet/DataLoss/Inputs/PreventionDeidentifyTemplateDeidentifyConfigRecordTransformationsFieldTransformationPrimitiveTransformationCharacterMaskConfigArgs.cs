// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("charactersToIgnores")]
        private InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs>? _charactersToIgnores;

        /// <summary>
        /// Characters to skip when doing de-identification of a value. These will be left alone and skipped.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs> CharactersToIgnores
        {
            get => _charactersToIgnores ?? (_charactersToIgnores = new InputList<Inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreArgs>());
            set => _charactersToIgnores = value;
        }

        /// <summary>
        /// Character to use to mask the sensitive values—for example, * for an alphabetic string such as a name, or 0 for a numeric string
        /// such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to * for
        /// strings, and 0 for digits.
        /// </summary>
        [Input("maskingCharacter")]
        public Input<string>? MaskingCharacter { get; set; }

        /// <summary>
        /// Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
        /// If number_to_mask is negative, this denotes inverse masking. Cloud DLP masks all but a number of characters. For example, suppose you have the following values:
        /// </summary>
        [Input("numberToMask")]
        public Input<int>? NumberToMask { get; set; }

        /// <summary>
        /// Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
        /// input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
        /// </summary>
        [Input("reverseOrder")]
        public Input<bool>? ReverseOrder { get; set; }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCharacterMaskConfigArgs();
    }
}
