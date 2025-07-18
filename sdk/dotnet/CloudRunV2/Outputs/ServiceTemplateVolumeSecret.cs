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
    public sealed class ServiceTemplateVolumeSecret
    {
        /// <summary>
        /// Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
        /// </summary>
        public readonly int? DefaultMode;
        /// <summary>
        /// If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceTemplateVolumeSecretItem> Items;
        /// <summary>
        /// The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private ServiceTemplateVolumeSecret(
            int? defaultMode,

            ImmutableArray<Outputs.ServiceTemplateVolumeSecretItem> items,

            string secret)
        {
            DefaultMode = defaultMode;
            Items = items;
            Secret = secret;
        }
    }
}
