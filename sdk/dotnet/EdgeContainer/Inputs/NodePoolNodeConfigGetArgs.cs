// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Inputs
{

    public sealed class NodePoolNodeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// "The Kubernetes node labels"
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        public NodePoolNodeConfigGetArgs()
        {
        }
        public static new NodePoolNodeConfigGetArgs Empty => new NodePoolNodeConfigGetArgs();
    }
}