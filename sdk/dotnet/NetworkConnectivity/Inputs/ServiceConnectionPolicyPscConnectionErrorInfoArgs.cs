// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkConnectivity.Inputs
{

    public sealed class ServiceConnectionPolicyPscConnectionErrorInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The logical grouping to which the "reason" belongs.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// Additional structured details about this error.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The reason of the error.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        public ServiceConnectionPolicyPscConnectionErrorInfoArgs()
        {
        }
        public static new ServiceConnectionPolicyPscConnectionErrorInfoArgs Empty => new ServiceConnectionPolicyPscConnectionErrorInfoArgs();
    }
}
