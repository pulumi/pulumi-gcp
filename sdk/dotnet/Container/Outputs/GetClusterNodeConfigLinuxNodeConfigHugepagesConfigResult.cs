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
    public sealed class GetClusterNodeConfigLinuxNodeConfigHugepagesConfigResult
    {
        /// <summary>
        /// Amount of 1G hugepages.
        /// </summary>
        public readonly int HugepageSize1g;
        /// <summary>
        /// Amount of 2M hugepages.
        /// </summary>
        public readonly int HugepageSize2m;

        [OutputConstructor]
        private GetClusterNodeConfigLinuxNodeConfigHugepagesConfigResult(
            int hugepageSize1g,

            int hugepageSize2m)
        {
            HugepageSize1g = hugepageSize1g;
            HugepageSize2m = hugepageSize2m;
        }
    }
}
