// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for private container registries. There are two fields in this config:
        /// </summary>
        [Input("privateRegistryAccessConfig")]
        public Input<Inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigGetArgs>? PrivateRegistryAccessConfig { get; set; }

        public ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigGetArgs()
        {
        }
        public static new ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigGetArgs Empty => new ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigGetArgs();
    }
}
