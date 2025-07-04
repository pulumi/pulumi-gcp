// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Outputs
{

    [OutputType]
    public sealed class CxToolFunctionSpec
    {
        /// <summary>
        /// Optional. The JSON schema is encapsulated in a [google.protobuf.Struct](https://protobuf.dev/reference/protobuf/google.protobuf/#struct) to describe the input of the function.
        /// This input is a JSON object that contains the function's parameters as properties of the object
        /// </summary>
        public readonly string? InputSchema;
        /// <summary>
        /// Optional. The JSON schema is encapsulated in a [google.protobuf.Struct](https://protobuf.dev/reference/protobuf/google.protobuf/#struct) to describe the output of the function.
        /// This output is a JSON object that contains the function's parameters as properties of the object
        /// </summary>
        public readonly string? OutputSchema;

        [OutputConstructor]
        private CxToolFunctionSpec(
            string? inputSchema,

            string? outputSchema)
        {
            InputSchema = inputSchema;
            OutputSchema = outputSchema;
        }
    }
}
