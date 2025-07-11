// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataCatalog.Inputs
{

    public sealed class TagTemplateFieldTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Represents an enum type.
        /// Exactly one of `primitive_type` or `enum_type` must be set
        /// Structure is documented below.
        /// </summary>
        [Input("enumType")]
        public Input<Inputs.TagTemplateFieldTypeEnumTypeGetArgs>? EnumType { get; set; }

        /// <summary>
        /// Represents primitive types - string, bool etc.
        /// Exactly one of `primitive_type` or `enum_type` must be set
        /// Possible values are: `DOUBLE`, `STRING`, `BOOL`, `TIMESTAMP`.
        /// </summary>
        [Input("primitiveType")]
        public Input<string>? PrimitiveType { get; set; }

        public TagTemplateFieldTypeGetArgs()
        {
        }
        public static new TagTemplateFieldTypeGetArgs Empty => new TagTemplateFieldTypeGetArgs();
    }
}
