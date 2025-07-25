// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The logical grouping to which the "reason" belongs. The error domain is typically the registered service name of the tool or product that generates the error. Example: "pubsub.googleapis.com".
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("metadatas")]
        private InputMap<string>? _metadatas;

        /// <summary>
        /// (Output)
        /// Additional structured details about this error.
        /// </summary>
        public InputMap<string> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputMap<string>());
            set => _metadatas = value;
        }

        /// <summary>
        /// (Output)
        /// The reason of the error. This is a constant value that identifies the proximate cause of the error. Error reasons are unique within a particular domain of errors.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        public RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs()
        {
        }
        public static new RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs Empty => new RegionResizeRequestStatusErrorErrorErrorDetailErrorInfoArgs();
    }
}
