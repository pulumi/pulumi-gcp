// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class PacketMirroringCollectorIlbGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL of the forwarding rule.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public PacketMirroringCollectorIlbGetArgs()
        {
        }
        public static new PacketMirroringCollectorIlbGetArgs Empty => new PacketMirroringCollectorIlbGetArgs();
    }
}
