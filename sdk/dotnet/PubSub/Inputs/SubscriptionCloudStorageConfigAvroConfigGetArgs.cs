// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Inputs
{

    public sealed class SubscriptionCloudStorageConfigAvroConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When true, write the subscription name, messageId, publishTime, attributes, and orderingKey as additional fields in the output.
        /// </summary>
        [Input("writeMetadata")]
        public Input<bool>? WriteMetadata { get; set; }

        public SubscriptionCloudStorageConfigAvroConfigGetArgs()
        {
        }
        public static new SubscriptionCloudStorageConfigAvroConfigGetArgs Empty => new SubscriptionCloudStorageConfigAvroConfigGetArgs();
    }
}