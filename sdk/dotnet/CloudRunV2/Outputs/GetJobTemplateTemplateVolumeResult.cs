// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetJobTemplateTemplateVolumeResult
    {
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateVolumeCloudSqlInstanceResult> CloudSqlInstances;
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateVolumeEmptyDirResult> EmptyDirs;
        /// <summary>
        /// The name of the Cloud Run v2 Job.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateVolumeSecretResult> Secrets;

        [OutputConstructor]
        private GetJobTemplateTemplateVolumeResult(
            ImmutableArray<Outputs.GetJobTemplateTemplateVolumeCloudSqlInstanceResult> cloudSqlInstances,

            ImmutableArray<Outputs.GetJobTemplateTemplateVolumeEmptyDirResult> emptyDirs,

            string name,

            ImmutableArray<Outputs.GetJobTemplateTemplateVolumeSecretResult> secrets)
        {
            CloudSqlInstances = cloudSqlInstances;
            EmptyDirs = emptyDirs;
            Name = name;
            Secrets = secrets;
        }
    }
}