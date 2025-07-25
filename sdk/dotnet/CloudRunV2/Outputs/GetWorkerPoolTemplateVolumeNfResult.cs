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
    public sealed class GetWorkerPoolTemplateVolumeNfResult
    {
        /// <summary>
        /// Path that is exported by the NFS server.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// If true, mount the NFS volume as read only
        /// </summary>
        public readonly bool ReadOnly;
        /// <summary>
        /// Hostname or IP address of the NFS server
        /// </summary>
        public readonly string Server;

        [OutputConstructor]
        private GetWorkerPoolTemplateVolumeNfResult(
            string path,

            bool readOnly,

            string server)
        {
            Path = path;
            ReadOnly = readOnly;
            Server = server;
        }
    }
}
