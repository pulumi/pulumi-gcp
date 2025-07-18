// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetJobTemplateTemplateContainerEnvResult
    {
        /// <summary>
        /// The name of the Cloud Run v2 Job.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Literal value of the environment variable. Defaults to "" and the maximum allowed length is 32768 characters. Variable references are not supported in Cloud Run.
        /// </summary>
        public readonly string Value;
        /// <summary>
        /// Source for the environment variable's value.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateContainerEnvValueSourceResult> ValueSources;

        [OutputConstructor]
        private GetJobTemplateTemplateContainerEnvResult(
            string name,

            string value,

            ImmutableArray<Outputs.GetJobTemplateTemplateContainerEnvValueSourceResult> valueSources)
        {
            Name = name;
            Value = value;
            ValueSources = valueSources;
        }
    }
}
