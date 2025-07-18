// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs : global::Pulumi.ResourceArgs
    {
        [Input("columns")]
        private InputList<Inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnArgs>? _columns;

        /// <summary>
        /// A List of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as Other columns can be accessed as a list through column field.  Structure is documented below.
        /// </summary>
        public InputList<Inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.TableExternalDataConfigurationBigtableOptionsColumnFamilyColumnArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
        /// </summary>
        [Input("encoding")]
        public Input<string>? Encoding { get; set; }

        /// <summary>
        /// Identifier of the column family.
        /// </summary>
        [Input("familyId")]
        public Input<string>? FamilyId { get; set; }

        /// <summary>
        /// If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.
        /// </summary>
        [Input("onlyReadLatest")]
        public Input<bool>? OnlyReadLatest { get; set; }

        /// <summary>
        /// The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive): "BYTES", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "JSON". Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs()
        {
        }
        public static new TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs Empty => new TableExternalDataConfigurationBigtableOptionsColumnFamilyArgs();
    }
}
