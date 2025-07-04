// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataflow.Outputs
{

    [OutputType]
    public sealed class PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter
    {
        /// <summary>
        /// Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
        /// </summary>
        public readonly string? ContainerSpecGcsPath;
        /// <summary>
        /// The runtime environment for the Flex Template job.
        /// https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexTemplateRuntimeEnvironment
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment? Environment;
        /// <summary>
        /// The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
        /// </summary>
        public readonly string JobName;
        /// <summary>
        /// Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public readonly ImmutableDictionary<string, string>? LaunchOptions;
        /// <summary>
        /// 'The parameters for the Flex Template. Example: {"numWorkers":"5"}'
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Parameters;
        /// <summary>
        /// 'Use this to pass transform name mappings for streaming update jobs. Example: {"oldTransformName":"newTransformName",...}'
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public readonly ImmutableDictionary<string, string>? TransformNameMappings;
        /// <summary>
        /// Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
        /// </summary>
        public readonly bool? Update;

        [OutputConstructor]
        private PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter(
            string? containerSpecGcsPath,

            Outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment? environment,

            string jobName,

            ImmutableDictionary<string, string>? launchOptions,

            ImmutableDictionary<string, string>? parameters,

            ImmutableDictionary<string, string>? transformNameMappings,

            bool? update)
        {
            ContainerSpecGcsPath = containerSpecGcsPath;
            Environment = environment;
            JobName = jobName;
            LaunchOptions = launchOptions;
            Parameters = parameters;
            TransformNameMappings = transformNameMappings;
            Update = update;
        }
    }
}
