// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Inputs
{

    public sealed class ClusterSystemAddonsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Config for the Ingress add-on which allows customers to create an Ingress
        /// object to manage external access to the servers in a cluster. The add-on
        /// consists of istiod and istio-ingress.
        /// Structure is documented below.
        /// </summary>
        [Input("ingress")]
        public Input<Inputs.ClusterSystemAddonsConfigIngressGetArgs>? Ingress { get; set; }

        public ClusterSystemAddonsConfigGetArgs()
        {
        }
        public static new ClusterSystemAddonsConfigGetArgs Empty => new ClusterSystemAddonsConfigGetArgs();
    }
}
