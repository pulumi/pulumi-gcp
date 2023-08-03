// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareClusterLoadBalancerManualLbConfig
    {
        /// <summary>
        /// NodePort for control plane service. The Kubernetes API server in the admin
        /// cluster is implemented as a Service of type NodePort (ex. 30968).
        /// </summary>
        public readonly int? ControlPlaneNodePort;
        /// <summary>
        /// NodePort for ingress service's http. The ingress service in the admin
        /// cluster is implemented as a Service of type NodePort (ex. 32527).
        /// </summary>
        public readonly int? IngressHttpNodePort;
        /// <summary>
        /// NodePort for ingress service's https. The ingress service in the admin
        /// cluster is implemented as a Service of type NodePort (ex. 30139).
        /// </summary>
        public readonly int? IngressHttpsNodePort;
        /// <summary>
        /// NodePort for konnectivity server service running as a sidecar in each
        /// kube-apiserver pod (ex. 30564).
        /// </summary>
        public readonly int? KonnectivityServerNodePort;

        [OutputConstructor]
        private VMwareClusterLoadBalancerManualLbConfig(
            int? controlPlaneNodePort,

            int? ingressHttpNodePort,

            int? ingressHttpsNodePort,

            int? konnectivityServerNodePort)
        {
            ControlPlaneNodePort = controlPlaneNodePort;
            IngressHttpNodePort = ingressHttpNodePort;
            IngressHttpsNodePort = ingressHttpsNodePort;
            KonnectivityServerNodePort = konnectivityServerNodePort;
        }
    }
}