// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs : global::Pulumi.ResourceArgs
    {
        [Input("links")]
        private InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs>? _links;

        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLinkArgs>());
            set => _links = value;
        }

        public ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs()
        {
        }
        public static new ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs Empty => new ResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpArgs();
    }
}
