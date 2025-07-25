// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class GlobalForwardingRuleServiceDirectoryRegistrations
    {
        /// <summary>
        /// Service Directory namespace to register the forwarding rule under.
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// [Optional] Service Directory region to register this global forwarding rule under.
        /// Default to "us-central1". Only used for PSC for Google APIs. All PSC for
        /// Google APIs Forwarding Rules on the same network should use the same Service
        /// Directory region.
        /// </summary>
        public readonly string? ServiceDirectoryRegion;

        [OutputConstructor]
        private GlobalForwardingRuleServiceDirectoryRegistrations(
            string? @namespace,

            string? serviceDirectoryRegion)
        {
            Namespace = @namespace;
            ServiceDirectoryRegion = serviceDirectoryRegion;
        }
    }
}
