// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobActionPubSubArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud Pub/Sub topic to send notifications to.
        /// </summary>
        [Input("topic", required: true)]
        public Input<string> Topic { get; set; } = null!;

        public PreventionJobTriggerInspectJobActionPubSubArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobActionPubSubArgs Empty => new PreventionJobTriggerInspectJobActionPubSubArgs();
    }
}