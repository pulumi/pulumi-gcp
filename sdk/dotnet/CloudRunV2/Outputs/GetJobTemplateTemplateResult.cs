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
    public sealed class GetJobTemplateTemplateResult
    {
        /// <summary>
        /// Holds the single container that defines the unit of execution for this task.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateContainerResult> Containers;
        /// <summary>
        /// A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
        /// </summary>
        public readonly string EncryptionKey;
        /// <summary>
        /// The execution environment being used to host this Task. Possible values: ["EXECUTION_ENVIRONMENT_GEN1", "EXECUTION_ENVIRONMENT_GEN2"]
        /// </summary>
        public readonly string ExecutionEnvironment;
        /// <summary>
        /// Number of retries allowed per Task, before marking this Task failed. Defaults to 3. Minimum value is 0.
        /// </summary>
        public readonly int MaxRetries;
        /// <summary>
        /// Node Selector describes the hardware requirements of the resources.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateNodeSelectorResult> NodeSelectors;
        /// <summary>
        /// Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project's default service account.
        /// </summary>
        public readonly string ServiceAccount;
        /// <summary>
        /// Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
        /// 
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        public readonly string Timeout;
        /// <summary>
        /// A list of Volumes to make available to containers.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateVolumeResult> Volumes;
        /// <summary>
        /// VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobTemplateTemplateVpcAccessResult> VpcAccesses;

        [OutputConstructor]
        private GetJobTemplateTemplateResult(
            ImmutableArray<Outputs.GetJobTemplateTemplateContainerResult> containers,

            string encryptionKey,

            string executionEnvironment,

            int maxRetries,

            ImmutableArray<Outputs.GetJobTemplateTemplateNodeSelectorResult> nodeSelectors,

            string serviceAccount,

            string timeout,

            ImmutableArray<Outputs.GetJobTemplateTemplateVolumeResult> volumes,

            ImmutableArray<Outputs.GetJobTemplateTemplateVpcAccessResult> vpcAccesses)
        {
            Containers = containers;
            EncryptionKey = encryptionKey;
            ExecutionEnvironment = executionEnvironment;
            MaxRetries = maxRetries;
            NodeSelectors = nodeSelectors;
            ServiceAccount = serviceAccount;
            Timeout = timeout;
            Volumes = volumes;
            VpcAccesses = vpcAccesses;
        }
    }
}
