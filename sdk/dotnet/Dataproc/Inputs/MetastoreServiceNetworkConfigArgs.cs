// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class MetastoreServiceNetworkConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("consumers", required: true)]
        private InputList<Inputs.MetastoreServiceNetworkConfigConsumerArgs>? _consumers;

        /// <summary>
        /// The consumer-side network configuration for the Dataproc Metastore instance.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.MetastoreServiceNetworkConfigConsumerArgs> Consumers
        {
            get => _consumers ?? (_consumers = new InputList<Inputs.MetastoreServiceNetworkConfigConsumerArgs>());
            set => _consumers = value;
        }

        public MetastoreServiceNetworkConfigArgs()
        {
        }
        public static new MetastoreServiceNetworkConfigArgs Empty => new MetastoreServiceNetworkConfigArgs();
    }
}