// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager.Outputs
{

    [OutputType]
    public sealed class GetSecretsSecretResult
    {
        /// <summary>
        /// Custom metadata about the secret.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Annotations;
        /// <summary>
        /// The time at which the Secret was created.
        /// </summary>
        public readonly string CreateTime;
        public readonly ImmutableDictionary<string, string> EffectiveAnnotations;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        /// <summary>
        /// Timestamp in UTC when the Secret is scheduled to expire.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// The labels assigned to this Secret.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The resource name of the Pub/Sub topic that will be published to.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the project.
        /// </summary>
        public readonly string Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        /// <summary>
        /// The replication policy of the secret data attached to the Secret.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecretsSecretReplicationResult> Replications;
        /// <summary>
        /// The rotation time and period for a Secret.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecretsSecretRotationResult> Rotations;
        public readonly string SecretId;
        /// <summary>
        /// A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecretsSecretTopicResult> Topics;
        public readonly string Ttl;
        /// <summary>
        /// Mapping from version alias to version name.
        /// </summary>
        public readonly ImmutableDictionary<string, string> VersionAliases;

        [OutputConstructor]
        private GetSecretsSecretResult(
            ImmutableDictionary<string, string> annotations,

            string createTime,

            ImmutableDictionary<string, string> effectiveAnnotations,

            ImmutableDictionary<string, string> effectiveLabels,

            string expireTime,

            ImmutableDictionary<string, string> labels,

            string name,

            string project,

            ImmutableDictionary<string, string> pulumiLabels,

            ImmutableArray<Outputs.GetSecretsSecretReplicationResult> replications,

            ImmutableArray<Outputs.GetSecretsSecretRotationResult> rotations,

            string secretId,

            ImmutableArray<Outputs.GetSecretsSecretTopicResult> topics,

            string ttl,

            ImmutableDictionary<string, string> versionAliases)
        {
            Annotations = annotations;
            CreateTime = createTime;
            EffectiveAnnotations = effectiveAnnotations;
            EffectiveLabels = effectiveLabels;
            ExpireTime = expireTime;
            Labels = labels;
            Name = name;
            Project = project;
            PulumiLabels = pulumiLabels;
            Replications = replications;
            Rotations = rotations;
            SecretId = secretId;
            Topics = topics;
            Ttl = ttl;
            VersionAliases = versionAliases;
        }
    }
}