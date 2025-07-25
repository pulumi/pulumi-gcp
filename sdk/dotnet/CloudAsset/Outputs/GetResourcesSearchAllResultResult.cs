// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudAsset.Outputs
{

    [OutputType]
    public sealed class GetResourcesSearchAllResultResult
    {
        /// <summary>
        /// Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
        /// </summary>
        public readonly ImmutableArray<string> AdditionalAttributes;
        /// <summary>
        /// The type of this resource.
        /// </summary>
        public readonly string AssetType;
        /// <summary>
        /// One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The display name of this resource.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Labels associated with this resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// Location can be `global`, regional like `us-east1`, or zonal like `us-west1-b`.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The full resource name. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Network tags associated with this resource.
        /// </summary>
        public readonly ImmutableArray<string> NetworkTags;
        /// <summary>
        /// The project that this resource belongs to, in the form of `projects/{project_number}`.
        /// </summary>
        public readonly string Project;

        [OutputConstructor]
        private GetResourcesSearchAllResultResult(
            ImmutableArray<string> additionalAttributes,

            string assetType,

            string description,

            string displayName,

            ImmutableDictionary<string, string> labels,

            string location,

            string name,

            ImmutableArray<string> networkTags,

            string project)
        {
            AdditionalAttributes = additionalAttributes;
            AssetType = assetType;
            Description = description;
            DisplayName = displayName;
            Labels = labels;
            Location = location;
            Name = name;
            NetworkTags = networkTags;
            Project = project;
        }
    }
}
