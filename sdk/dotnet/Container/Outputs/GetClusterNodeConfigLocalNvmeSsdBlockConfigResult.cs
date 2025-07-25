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
    public sealed class GetClusterNodeConfigLocalNvmeSsdBlockConfigResult
    {
        /// <summary>
        /// Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size.
        /// </summary>
        public readonly int LocalSsdCount;

        [OutputConstructor]
        private GetClusterNodeConfigLocalNvmeSsdBlockConfigResult(int localSsdCount)
        {
            LocalSsdCount = localSsdCount;
        }
    }
}
