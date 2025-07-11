// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class BatchOperationsJobBucketListBucketsManifestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies objects in a manifest file.
        /// </summary>
        [Input("manifestLocation")]
        public Input<string>? ManifestLocation { get; set; }

        public BatchOperationsJobBucketListBucketsManifestGetArgs()
        {
        }
        public static new BatchOperationsJobBucketListBucketsManifestGetArgs Empty => new BatchOperationsJobBucketListBucketsManifestGetArgs();
    }
}
