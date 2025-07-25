// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class FlexibleAppVersionResourcesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of CPU cores needed.
        /// </summary>
        [Input("cpu")]
        public Input<int>? Cpu { get; set; }

        /// <summary>
        /// Disk size (GB) needed.
        /// </summary>
        [Input("diskGb")]
        public Input<int>? DiskGb { get; set; }

        /// <summary>
        /// Memory (GB) needed.
        /// </summary>
        [Input("memoryGb")]
        public Input<double>? MemoryGb { get; set; }

        [Input("volumes")]
        private InputList<Inputs.FlexibleAppVersionResourcesVolumeGetArgs>? _volumes;

        /// <summary>
        /// List of ports, or port pairs, to forward from the virtual machine to the application container.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.FlexibleAppVersionResourcesVolumeGetArgs> Volumes
        {
            get => _volumes ?? (_volumes = new InputList<Inputs.FlexibleAppVersionResourcesVolumeGetArgs>());
            set => _volumes = value;
        }

        public FlexibleAppVersionResourcesGetArgs()
        {
        }
        public static new FlexibleAppVersionResourcesGetArgs Empty => new FlexibleAppVersionResourcesGetArgs();
    }
}
