// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudFunctionsV2.Inputs
{

    public sealed class FunctionBuildConfigSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If provided, get the source from this location in a Cloud Source Repository.
        /// Structure is documented below.
        /// </summary>
        [Input("repoSource")]
        public Input<Inputs.FunctionBuildConfigSourceRepoSourceArgs>? RepoSource { get; set; }

        /// <summary>
        /// If provided, get the source from this location in Google Cloud Storage.
        /// Structure is documented below.
        /// </summary>
        [Input("storageSource")]
        public Input<Inputs.FunctionBuildConfigSourceStorageSourceArgs>? StorageSource { get; set; }

        public FunctionBuildConfigSourceArgs()
        {
        }
        public static new FunctionBuildConfigSourceArgs Empty => new FunctionBuildConfigSourceArgs();
    }
}
