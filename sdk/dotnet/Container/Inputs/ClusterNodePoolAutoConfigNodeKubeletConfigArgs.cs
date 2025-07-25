// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolAutoConfigNodeKubeletConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
        /// </summary>
        [Input("insecureKubeletReadonlyPortEnabled")]
        public Input<string>? InsecureKubeletReadonlyPortEnabled { get; set; }

        public ClusterNodePoolAutoConfigNodeKubeletConfigArgs()
        {
        }
        public static new ClusterNodePoolAutoConfigNodeKubeletConfigArgs Empty => new ClusterNodePoolAutoConfigNodeKubeletConfigArgs();
    }
}
