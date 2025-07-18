// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareNodePoolConfigVsphereConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the vCenter datastore. Inherited from the user cluster.
        /// </summary>
        [Input("datastore")]
        public Input<string>? Datastore { get; set; }

        [Input("hostGroups")]
        private InputList<string>? _hostGroups;

        /// <summary>
        /// Vsphere host groups to apply to all VMs in the node pool
        /// </summary>
        public InputList<string> HostGroups
        {
            get => _hostGroups ?? (_hostGroups = new InputList<string>());
            set => _hostGroups = value;
        }

        [Input("tags")]
        private InputList<Inputs.VMwareNodePoolConfigVsphereConfigTagArgs>? _tags;

        /// <summary>
        /// Tags to apply to VMs.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VMwareNodePoolConfigVsphereConfigTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VMwareNodePoolConfigVsphereConfigTagArgs>());
            set => _tags = value;
        }

        public VMwareNodePoolConfigVsphereConfigArgs()
        {
        }
        public static new VMwareNodePoolConfigVsphereConfigArgs Empty => new VMwareNodePoolConfigVsphereConfigArgs();
    }
}
