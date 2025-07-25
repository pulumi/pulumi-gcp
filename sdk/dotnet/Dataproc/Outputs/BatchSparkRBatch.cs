// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class BatchSparkRBatch
    {
        /// <summary>
        /// HCFS URIs of archives to be extracted into the working directory of each executor.
        /// Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
        /// </summary>
        public readonly ImmutableArray<string> ArchiveUris;
        /// <summary>
        /// The arguments to pass to the driver. Do not include arguments that can be set as batch
        /// properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
        /// </summary>
        public readonly ImmutableArray<string> Args;
        /// <summary>
        /// HCFS URIs of files to be placed in the working directory of each executor.
        /// </summary>
        public readonly ImmutableArray<string> FileUris;
        /// <summary>
        /// The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
        /// </summary>
        public readonly string? MainRFileUri;

        [OutputConstructor]
        private BatchSparkRBatch(
            ImmutableArray<string> archiveUris,

            ImmutableArray<string> args,

            ImmutableArray<string> fileUris,

            string? mainRFileUri)
        {
            ArchiveUris = archiveUris;
            Args = args;
            FileUris = fileUris;
            MainRFileUri = mainRFileUri;
        }
    }
}
