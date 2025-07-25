// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Inputs
{

    public sealed class InstanceStateInfoArgs : global::Pulumi.ResourceArgs
    {
        [Input("updateInfos")]
        private InputList<Inputs.InstanceStateInfoUpdateInfoArgs>? _updateInfos;

        /// <summary>
        /// (Output)
        /// Represents information about instance with state UPDATING.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InstanceStateInfoUpdateInfoArgs> UpdateInfos
        {
            get => _updateInfos ?? (_updateInfos = new InputList<Inputs.InstanceStateInfoUpdateInfoArgs>());
            set => _updateInfos = value;
        }

        public InstanceStateInfoArgs()
        {
        }
        public static new InstanceStateInfoArgs Empty => new InstanceStateInfoArgs();
    }
}
