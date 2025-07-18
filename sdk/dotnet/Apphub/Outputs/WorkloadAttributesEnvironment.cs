// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apphub.Outputs
{

    [OutputType]
    public sealed class WorkloadAttributesEnvironment
    {
        /// <summary>
        /// Environment type.
        /// Possible values are: `PRODUCTION`, `STAGING`, `TEST`, `DEVELOPMENT`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private WorkloadAttributesEnvironment(string type)
        {
            Type = type;
        }
    }
}
