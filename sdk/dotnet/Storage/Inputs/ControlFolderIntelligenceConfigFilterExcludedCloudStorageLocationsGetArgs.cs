// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("locations", required: true)]
        private InputList<string>? _locations;

        /// <summary>
        /// List of locations.
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        public ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsGetArgs()
        {
        }
        public static new ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsGetArgs Empty => new ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsGetArgs();
    }
}
