// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class PacketMirroringCollectorIlb
    {
        /// <summary>
        /// The URL of the forwarding rule.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private PacketMirroringCollectorIlb(string url)
        {
            Url = url;
        }
    }
}
