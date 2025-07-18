// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class TransferJobReplicationSpecGcsDataSink
    {
        /// <summary>
        /// Google Cloud Storage bucket name.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
        /// </summary>
        public readonly string? Path;

        [OutputConstructor]
        private TransferJobReplicationSpecGcsDataSink(
            string bucketName,

            string? path)
        {
            BucketName = bucketName;
            Path = path;
        }
    }
}
