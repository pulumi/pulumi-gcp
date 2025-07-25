// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class RoutineArgument
    {
        /// <summary>
        /// Defaults to FIXED_TYPE.
        /// Default value is `FIXED_TYPE`.
        /// Possible values are: `FIXED_TYPE`, `ANY_TYPE`.
        /// </summary>
        public readonly string? ArgumentKind;
        /// <summary>
        /// A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
        /// ~&gt;**NOTE**: Because this field expects a JSON string, any changes to the string
        /// will create a diff, even if the JSON itself hasn't changed. If the API returns
        /// a different value for the same schema, e.g. it switched the order of values
        /// or replaced STRUCT field type with RECORD field type, we currently cannot
        /// suppress the recurring diff this causes. As a workaround, we recommend using
        /// the schema as returned by the API.
        /// </summary>
        public readonly string? DataType;
        /// <summary>
        /// Specifies whether the argument is input or output. Can be set for procedures only.
        /// Possible values are: `IN`, `OUT`, `INOUT`.
        /// </summary>
        public readonly string? Mode;
        /// <summary>
        /// The name of this argument. Can be absent for function return argument.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private RoutineArgument(
            string? argumentKind,

            string? dataType,

            string? mode,

            string? name)
        {
            ArgumentKind = argumentKind;
            DataType = dataType;
            Mode = mode;
            Name = name;
        }
    }
}
