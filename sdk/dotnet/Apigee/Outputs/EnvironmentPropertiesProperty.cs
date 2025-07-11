// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Outputs
{

    [OutputType]
    public sealed class EnvironmentPropertiesProperty
    {
        /// <summary>
        /// The property key.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The property value.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private EnvironmentPropertiesProperty(
            string? name,

            string? value)
        {
            Name = name;
            Value = value;
        }
    }
}
