// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AwsNodePoolConfig
    {
        /// <summary>
        /// Optional. Configuration related to CloudWatch metrics collection on the Auto Scaling group of the node pool. When unspecified, metrics collection is disabled.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigAutoscalingMetricsCollection? AutoscalingMetricsCollection;
        /// <summary>
        /// The ARN of the AWS KMS key used to encrypt node pool configuration.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigConfigEncryption ConfigEncryption;
        /// <summary>
        /// The name of the AWS IAM role assigned to nodes in the pool.
        /// </summary>
        public readonly string IamInstanceProfile;
        /// <summary>
        /// The OS image type to use on node pool instances.
        /// </summary>
        public readonly string? ImageType;
        /// <summary>
        /// Details of placement information for an instance.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigInstancePlacement? InstancePlacement;
        /// <summary>
        /// Optional. The AWS instance type. When unspecified, it defaults to `m5.large`.
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// Optional. The initial labels assigned to nodes of this node pool. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// Proxy configuration for outbound HTTP(S) traffic.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigProxyConfig? ProxyConfig;
        /// <summary>
        /// Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigRootVolume? RootVolume;
        /// <summary>
        /// Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroupIds;
        /// <summary>
        /// Optional. When specified, the node pool will provision Spot instances from the set of spot_config.instance_types. This field is mutually exclusive with `instance_type`
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigSpotConfig? SpotConfig;
        /// <summary>
        /// Optional. The SSH configuration.
        /// </summary>
        public readonly Outputs.AwsNodePoolConfigSshConfig? SshConfig;
        /// <summary>
        /// Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// Optional. The initial taints assigned to nodes of this node pool.
        /// </summary>
        public readonly ImmutableArray<Outputs.AwsNodePoolConfigTaint> Taints;

        [OutputConstructor]
        private AwsNodePoolConfig(
            Outputs.AwsNodePoolConfigAutoscalingMetricsCollection? autoscalingMetricsCollection,

            Outputs.AwsNodePoolConfigConfigEncryption configEncryption,

            string iamInstanceProfile,

            string? imageType,

            Outputs.AwsNodePoolConfigInstancePlacement? instancePlacement,

            string? instanceType,

            ImmutableDictionary<string, string>? labels,

            Outputs.AwsNodePoolConfigProxyConfig? proxyConfig,

            Outputs.AwsNodePoolConfigRootVolume? rootVolume,

            ImmutableArray<string> securityGroupIds,

            Outputs.AwsNodePoolConfigSpotConfig? spotConfig,

            Outputs.AwsNodePoolConfigSshConfig? sshConfig,

            ImmutableDictionary<string, string>? tags,

            ImmutableArray<Outputs.AwsNodePoolConfigTaint> taints)
        {
            AutoscalingMetricsCollection = autoscalingMetricsCollection;
            ConfigEncryption = configEncryption;
            IamInstanceProfile = iamInstanceProfile;
            ImageType = imageType;
            InstancePlacement = instancePlacement;
            InstanceType = instanceType;
            Labels = labels;
            ProxyConfig = proxyConfig;
            RootVolume = rootVolume;
            SecurityGroupIds = securityGroupIds;
            SpotConfig = spotConfig;
            SshConfig = sshConfig;
            Tags = tags;
            Taints = taints;
        }
    }
}
