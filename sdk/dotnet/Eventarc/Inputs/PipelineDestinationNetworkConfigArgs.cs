// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Eventarc.Inputs
{

    public sealed class PipelineDestinationNetworkConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the NetworkAttachment that allows access to the consumer VPC.
        /// Format:
        /// `projects/{PROJECT_ID}/regions/{REGION}/networkAttachments/{NETWORK_ATTACHMENT_NAME}`
        /// </summary>
        [Input("networkAttachment", required: true)]
        public Input<string> NetworkAttachment { get; set; } = null!;

        public PipelineDestinationNetworkConfigArgs()
        {
        }
        public static new PipelineDestinationNetworkConfigArgs Empty => new PipelineDestinationNetworkConfigArgs();
    }
}
