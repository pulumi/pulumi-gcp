// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class NodeGroupShareSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("projectMaps")]
        private InputList<Inputs.NodeGroupShareSettingsProjectMapArgs>? _projectMaps;

        /// <summary>
        /// A map of project id and project config. This is only valid when shareType's value is SPECIFIC_PROJECTS.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.NodeGroupShareSettingsProjectMapArgs> ProjectMaps
        {
            get => _projectMaps ?? (_projectMaps = new InputList<Inputs.NodeGroupShareSettingsProjectMapArgs>());
            set => _projectMaps = value;
        }

        /// <summary>
        /// Node group sharing type.
        /// Possible values are `ORGANIZATION`, `SPECIFIC_PROJECTS`, and `LOCAL`.
        /// </summary>
        [Input("shareType", required: true)]
        public Input<string> ShareType { get; set; } = null!;

        public NodeGroupShareSettingsArgs()
        {
        }
        public static new NodeGroupShareSettingsArgs Empty => new NodeGroupShareSettingsArgs();
    }
}