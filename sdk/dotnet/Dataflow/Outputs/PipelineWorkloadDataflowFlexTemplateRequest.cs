// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataflow.Outputs
{

    [OutputType]
    public sealed class PipelineWorkloadDataflowFlexTemplateRequest
    {
        /// <summary>
        /// Parameter to launch a job from a Flex Template.
        /// https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplateparameter
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter LaunchParameter;
        /// <summary>
        /// The regional endpoint to which to direct the request. For example, us-central1, us-west1.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The ID of the Cloud Platform project that the job belongs to.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// If true, the request is validated but not actually executed. Defaults to false.
        /// </summary>
        public readonly bool? ValidateOnly;

        [OutputConstructor]
        private PipelineWorkloadDataflowFlexTemplateRequest(
            Outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter launchParameter,

            string location,

            string projectId,

            bool? validateOnly)
        {
            LaunchParameter = launchParameter;
            Location = location;
            ProjectId = projectId;
            ValidateOnly = validateOnly;
        }
    }
}