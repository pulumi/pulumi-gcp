// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterControlPlaneGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiServerArgs")]
        private InputList<Inputs.BareMetalAdminClusterControlPlaneApiServerArgGetArgs>? _apiServerArgs;

        /// <summary>
        /// Customizes the default API server args. Only a subset of
        /// customized flags are supported. Please refer to the API server
        /// documentation below to know the exact format:
        /// https://kubernetes.io/docs/reference/command-line-tools-reference/kube-apiserver/
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BareMetalAdminClusterControlPlaneApiServerArgGetArgs> ApiServerArgs
        {
            get => _apiServerArgs ?? (_apiServerArgs = new InputList<Inputs.BareMetalAdminClusterControlPlaneApiServerArgGetArgs>());
            set => _apiServerArgs = value;
        }

        /// <summary>
        /// Configures the node pool running the control plane. If specified the corresponding NodePool will be created for the cluster's control plane. The NodePool will have the same name and namespace as the cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("controlPlaneNodePoolConfig", required: true)]
        public Input<Inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigGetArgs> ControlPlaneNodePoolConfig { get; set; } = null!;

        public BareMetalAdminClusterControlPlaneGetArgs()
        {
        }
        public static new BareMetalAdminClusterControlPlaneGetArgs Empty => new BareMetalAdminClusterControlPlaneGetArgs();
    }
}
