// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("componentVersion", required: true)]
        private InputMap<string>? _componentVersion;

        /// <summary>
        /// The components that should be installed in this Dataproc cluster. The key must be a string from the   
        /// KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
        /// * **NOTE** : `component_version[SPARK]` is mandatory to set, or the creation of the cluster will fail.
        /// </summary>
        public InputMap<string> ComponentVersion
        {
            get => _componentVersion ?? (_componentVersion = new InputMap<string>());
            set => _componentVersion = value;
        }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// The properties to set on daemon config files. Property keys are specified in prefix:property format, 
        /// for example spark:spark.kubernetes.container.image.
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        public ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs()
        {
        }
        public static new ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs Empty => new ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs();
    }
}
