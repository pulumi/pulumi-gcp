// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodeConfigSoleTenantConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("nodeAffinities", required: true)]
        private InputList<Inputs.ClusterNodeConfigSoleTenantConfigNodeAffinityGetArgs>? _nodeAffinities;
        public InputList<Inputs.ClusterNodeConfigSoleTenantConfigNodeAffinityGetArgs> NodeAffinities
        {
            get => _nodeAffinities ?? (_nodeAffinities = new InputList<Inputs.ClusterNodeConfigSoleTenantConfigNodeAffinityGetArgs>());
            set => _nodeAffinities = value;
        }

        public ClusterNodeConfigSoleTenantConfigGetArgs()
        {
        }
        public static new ClusterNodeConfigSoleTenantConfigGetArgs Empty => new ClusterNodeConfigSoleTenantConfigGetArgs();
    }
}