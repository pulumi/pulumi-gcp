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
    public sealed class GetWorkerPoolTemplateResult
    {
        /// <summary>
        /// Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
        /// 
        /// Cloud Run API v2 does not support annotations with 'run.googleapis.com', 'cloud.googleapis.com', 'serving.knative.dev', or 'autoscaling.knative.dev' namespaces, and they will be rejected.
        /// All system annotations in v1 now have a corresponding field in v2 WorkerPoolRevisionTemplate.
        /// 
        /// This field follows Kubernetes annotations' namespacing, limits, and rules.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        /// <summary>
        /// Holds the containers that define the unit of execution for this WorkerPool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkerPoolTemplateContainerResult> Containers;
        /// <summary>
        /// A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
        /// </summary>
        public readonly string EncryptionKey;
        /// <summary>
        /// The action to take if the encryption key is revoked. Possible values: ["PREVENT_NEW", "SHUTDOWN"]
        /// </summary>
        public readonly string EncryptionKeyRevocationAction;
        /// <summary>
        /// If encryptionKeyRevocationAction is SHUTDOWN, the duration before shutting down all instances. The minimum increment is 1 hour.
        /// 
        /// A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
        /// </summary>
        public readonly string EncryptionKeyShutdownDuration;
        /// <summary>
        /// True if GPU zonal redundancy is disabled on this revision.
        /// </summary>
        public readonly bool GpuZonalRedundancyDisabled;
        /// <summary>
        /// Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google's billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc.
        /// For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels.
        /// 
        /// Cloud Run API v2 does not support labels with 'run.googleapis.com', 'cloud.googleapis.com', 'serving.knative.dev', or 'autoscaling.knative.dev' namespaces, and they will be rejected.
        /// All system labels in v1 now have a corresponding field in v2 WorkerPoolRevisionTemplate.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// Node Selector describes the hardware requirements of the resources.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkerPoolTemplateNodeSelectorResult> NodeSelectors;
        /// <summary>
        /// The unique name for the revision. If this field is omitted, it will be automatically generated based on the WorkerPool name.
        /// </summary>
        public readonly string Revision;
        /// <summary>
        /// Email address of the IAM service account associated with the revision of the WorkerPool. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
        /// </summary>
        public readonly string ServiceAccount;
        /// <summary>
        /// A list of Volumes to make available to containers.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkerPoolTemplateVolumeResult> Volumes;
        /// <summary>
        /// VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWorkerPoolTemplateVpcAccessResult> VpcAccesses;

        [OutputConstructor]
        private GetWorkerPoolTemplateResult(
            ImmutableDictionary<string, string> annotations,

            ImmutableArray<Outputs.GetWorkerPoolTemplateContainerResult> containers,

            string encryptionKey,

            string encryptionKeyRevocationAction,

            string encryptionKeyShutdownDuration,

            bool gpuZonalRedundancyDisabled,

            ImmutableDictionary<string, string> labels,

            ImmutableArray<Outputs.GetWorkerPoolTemplateNodeSelectorResult> nodeSelectors,

            string revision,

            string serviceAccount,

            ImmutableArray<Outputs.GetWorkerPoolTemplateVolumeResult> volumes,

            ImmutableArray<Outputs.GetWorkerPoolTemplateVpcAccessResult> vpcAccesses)
        {
            Annotations = annotations;
            Containers = containers;
            EncryptionKey = encryptionKey;
            EncryptionKeyRevocationAction = encryptionKeyRevocationAction;
            EncryptionKeyShutdownDuration = encryptionKeyShutdownDuration;
            GpuZonalRedundancyDisabled = gpuZonalRedundancyDisabled;
            Labels = labels;
            NodeSelectors = nodeSelectors;
            Revision = revision;
            ServiceAccount = serviceAccount;
            Volumes = volumes;
            VpcAccesses = vpcAccesses;
        }
    }
}
