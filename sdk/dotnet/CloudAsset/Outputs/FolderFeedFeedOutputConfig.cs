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
    public sealed class FolderFeedFeedOutputConfig
    {
        /// <summary>
        /// Destination on Cloud Pubsub.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FolderFeedFeedOutputConfigPubsubDestination PubsubDestination;

        [OutputConstructor]
        private FolderFeedFeedOutputConfig(Outputs.FolderFeedFeedOutputConfigPubsubDestination pubsubDestination)
        {
            PubsubDestination = pubsubDestination;
        }
    }
}
