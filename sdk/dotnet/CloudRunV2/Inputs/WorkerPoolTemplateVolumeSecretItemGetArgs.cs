// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class WorkerPoolTemplateVolumeSecretItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be used.
        /// </summary>
        [Input("mode")]
        public Input<int>? Mode { get; set; }

        /// <summary>
        /// The relative path of the secret in the container.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public WorkerPoolTemplateVolumeSecretItemGetArgs()
        {
        }
        public static new WorkerPoolTemplateVolumeSecretItemGetArgs Empty => new WorkerPoolTemplateVolumeSecretItemGetArgs();
    }
}
