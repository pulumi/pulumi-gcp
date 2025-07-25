// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigTable.Inputs
{

    public sealed class TableColumnFamilyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the column family.
        /// </summary>
        [Input("family", required: true)]
        public Input<string> Family { get; set; } = null!;

        /// <summary>
        /// The type of the column family.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TableColumnFamilyArgs()
        {
        }
        public static new TableColumnFamilyArgs Empty => new TableColumnFamilyArgs();
    }
}
