// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalAdminClusterClusterOperations
    {
        /// <summary>
        /// Whether collection of application logs/metrics should be enabled (in addition to system logs/metrics).
        /// </summary>
        public readonly bool? EnableApplicationLogs;

        [OutputConstructor]
        private BareMetalAdminClusterClusterOperations(bool? enableApplicationLogs)
        {
            EnableApplicationLogs = enableApplicationLogs;
        }
    }
}
