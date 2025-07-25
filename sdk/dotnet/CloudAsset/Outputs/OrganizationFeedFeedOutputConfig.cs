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
    public sealed class OrganizationFeedFeedOutputConfig
    {
        /// <summary>
        /// Destination on Cloud Pubsub.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.OrganizationFeedFeedOutputConfigPubsubDestination PubsubDestination;

        [OutputConstructor]
        private OrganizationFeedFeedOutputConfig(Outputs.OrganizationFeedFeedOutputConfigPubsubDestination pubsubDestination)
        {
            PubsubDestination = pubsubDestination;
        }
    }
}
