// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("featureGroups", required: true)]
        private InputList<Inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupGetArgs>? _featureGroups;

        /// <summary>
        /// List of features that need to be synced to Online Store.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupGetArgs> FeatureGroups
        {
            get => _featureGroups ?? (_featureGroups = new InputList<Inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupGetArgs>());
            set => _featureGroups = value;
        }

        /// <summary>
        /// The project number of the parent project of the feature Groups.
        /// </summary>
        [Input("projectNumber")]
        public Input<string>? ProjectNumber { get; set; }

        public AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceGetArgs()
        {
        }
        public static new AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceGetArgs Empty => new AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceGetArgs();
    }
}
