// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataflow.Inputs
{

    public sealed class PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
        /// </summary>
        [Input("containerSpecGcsPath")]
        public Input<string>? ContainerSpecGcsPath { get; set; }

        /// <summary>
        /// The runtime environment for the Flex Template job.
        /// https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexTemplateRuntimeEnvironment
        /// Structure is documented below.
        /// </summary>
        [Input("environment")]
        public Input<Inputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironmentArgs>? Environment { get; set; }

        /// <summary>
        /// The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
        /// </summary>
        [Input("jobName", required: true)]
        public Input<string> JobName { get; set; } = null!;

        [Input("launchOptions")]
        private InputMap<string>? _launchOptions;

        /// <summary>
        /// Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public InputMap<string> LaunchOptions
        {
            get => _launchOptions ?? (_launchOptions = new InputMap<string>());
            set => _launchOptions = value;
        }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// 'The parameters for the Flex Template. Example: {"numWorkers":"5"}'
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        [Input("transformNameMappings")]
        private InputMap<string>? _transformNameMappings;

        /// <summary>
        /// 'Use this to pass transform name mappings for streaming update jobs. Example: {"oldTransformName":"newTransformName",...}'
        /// 'An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.'
        /// </summary>
        public InputMap<string> TransformNameMappings
        {
            get => _transformNameMappings ?? (_transformNameMappings = new InputMap<string>());
            set => _transformNameMappings = value;
        }

        /// <summary>
        /// Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
        /// </summary>
        [Input("update")]
        public Input<bool>? Update { get; set; }

        public PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs()
        {
        }
        public static new PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs Empty => new PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterArgs();
    }
}