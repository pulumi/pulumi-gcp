// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class WorkerPoolTemplateVolumeSecretGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not affected by this setting.
        /// </summary>
        [Input("defaultMode")]
        public Input<int>? DefaultMode { get; set; }

        [Input("items")]
        private InputList<Inputs.WorkerPoolTemplateVolumeSecretItemGetArgs>? _items;

        /// <summary>
        /// If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.WorkerPoolTemplateVolumeSecretItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.WorkerPoolTemplateVolumeSecretItemGetArgs>());
            set => _items = value;
        }

        /// <summary>
        /// The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
        /// </summary>
        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        public WorkerPoolTemplateVolumeSecretGetArgs()
        {
        }
        public static new WorkerPoolTemplateVolumeSecretGetArgs Empty => new WorkerPoolTemplateVolumeSecretGetArgs();
    }
}
