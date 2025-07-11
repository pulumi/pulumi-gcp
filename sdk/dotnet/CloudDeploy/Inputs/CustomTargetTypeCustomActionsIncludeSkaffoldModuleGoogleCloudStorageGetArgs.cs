// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Inputs
{

    public sealed class CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Relative path from the source to the Skaffold file.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Cloud Storage source paths to copy recursively. For example, providing `gs://my-bucket/dir/configs/*` will result in Skaffold copying all files within the `dir/configs` directory in the bucket `my-bucket`.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageGetArgs()
        {
        }
        public static new CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageGetArgs Empty => new CustomTargetTypeCustomActionsIncludeSkaffoldModuleGoogleCloudStorageGetArgs();
    }
}
