// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Inputs
{

    public sealed class V2QueuedResourceTpuNodeSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The node.
        /// Structure is documented below.
        /// </summary>
        [Input("node", required: true)]
        public Input<Inputs.V2QueuedResourceTpuNodeSpecNodeArgs> Node { get; set; } = null!;

        /// <summary>
        /// Unqualified node identifier used to identify the node in the project once provisioned.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// The parent resource name.
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        public V2QueuedResourceTpuNodeSpecArgs()
        {
        }
        public static new V2QueuedResourceTpuNodeSpecArgs Empty => new V2QueuedResourceTpuNodeSpecArgs();
    }
}
