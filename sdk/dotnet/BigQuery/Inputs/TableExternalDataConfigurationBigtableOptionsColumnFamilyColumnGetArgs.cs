// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        /// <summary>
        /// If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
        /// </summary>
        [Input("fieldName")]
        public Input<string>? FieldName { get; set; }

        /// <summary>
        /// If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
        /// </summary>
        [Input("onlyReadLatest")]
        public Input<bool>? OnlyReadLatest { get; set; }

        /// <summary>
        /// Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifierString field. Otherwise, a base-64 encoded value must be set to qualifierEncoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as fieldName.
        /// </summary>
        [Input("qualifierEncoded")]
        public Input<string>? QualifierEncoded { get; set; }

        /// <summary>
        /// Qualifier string.
        /// </summary>
        [Input("qualifierString")]
        public Input<string>? QualifierString { get; set; }

        /// <summary>
        /// The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive): "BYTES", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "JSON", Default type is "BYTES". 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnGetArgs()
        {
        }
        public static new TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnGetArgs Empty => new TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnGetArgs();
    }
}
