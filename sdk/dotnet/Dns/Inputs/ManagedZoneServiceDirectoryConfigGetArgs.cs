// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class ManagedZoneServiceDirectoryConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The namespace associated with the zone.
        /// Structure is documented below.
        /// </summary>
        [Input("namespace", required: true)]
        public Input<Inputs.ManagedZoneServiceDirectoryConfigNamespaceGetArgs> Namespace { get; set; } = null!;

        public ManagedZoneServiceDirectoryConfigGetArgs()
        {
        }
        public static new ManagedZoneServiceDirectoryConfigGetArgs Empty => new ManagedZoneServiceDirectoryConfigGetArgs();
    }
}
