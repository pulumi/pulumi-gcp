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
    public sealed class JobTemplateTemplate
    {
        /// <summary>
        /// Holds the single container that defines the unit of execution for this task.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTemplateTemplateContainer> Containers;
        /// <summary>
        /// A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
        /// </summary>
        public readonly string? EncryptionKey;
        /// <summary>
        /// The execution environment being used to host this Task.
        /// Possible values are `EXECUTION_ENVIRONMENT_GEN1` and `EXECUTION_ENVIRONMENT_GEN2`.
        /// </summary>
        public readonly string? ExecutionEnvironment;
        /// <summary>
        /// Number of retries allowed per Task, before marking this Task failed.
        /// </summary>
        public readonly int? MaxRetries;
        /// <summary>
        /// Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project's default service account.
        /// </summary>
        public readonly string? ServiceAccount;
        /// <summary>
        /// Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        public readonly string? Timeout;
        /// <summary>
        /// A list of Volumes to make available to containers.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.JobTemplateTemplateVolume> Volumes;
        /// <summary>
        /// VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobTemplateTemplateVpcAccess? VpcAccess;

        [OutputConstructor]
        private JobTemplateTemplate(
            ImmutableArray<Outputs.JobTemplateTemplateContainer> containers,

            string? encryptionKey,

            string? executionEnvironment,

            int? maxRetries,

            string? serviceAccount,

            string? timeout,

            ImmutableArray<Outputs.JobTemplateTemplateVolume> volumes,

            Outputs.JobTemplateTemplateVpcAccess? vpcAccess)
        {
            Containers = containers;
            EncryptionKey = encryptionKey;
            ExecutionEnvironment = executionEnvironment;
            MaxRetries = maxRetries;
            ServiceAccount = serviceAccount;
            Timeout = timeout;
            Volumes = volumes;
            VpcAccess = vpcAccess;
        }
    }
}