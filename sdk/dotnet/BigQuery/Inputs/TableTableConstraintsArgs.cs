// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Inputs
{

    public sealed class TableTableConstraintsArgs : global::Pulumi.ResourceArgs
    {
        [Input("foreignKeys")]
        private InputList<Inputs.TableTableConstraintsForeignKeyArgs>? _foreignKeys;

        /// <summary>
        /// Present only if the table has a foreign key.
        /// The foreign key is not enforced.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.TableTableConstraintsForeignKeyArgs> ForeignKeys
        {
            get => _foreignKeys ?? (_foreignKeys = new InputList<Inputs.TableTableConstraintsForeignKeyArgs>());
            set => _foreignKeys = value;
        }

        /// <summary>
        /// Represents the primary key constraint
        /// on a table's columns. Present only if the table has a primary key.
        /// The primary key is not enforced.
        /// Structure is documented below.
        /// </summary>
        [Input("primaryKey")]
        public Input<Inputs.TableTableConstraintsPrimaryKeyArgs>? PrimaryKey { get; set; }

        public TableTableConstraintsArgs()
        {
        }
        public static new TableTableConstraintsArgs Empty => new TableTableConstraintsArgs();
    }
}
