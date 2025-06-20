// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ResizeRequestStatusLastAttemptErrorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("errors")]
        private InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorGetArgs>? _errors;

        /// <summary>
        /// (Output)
        /// The array of errors encountered while processing this operation.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.ResizeRequestStatusLastAttemptErrorErrorGetArgs>());
            set => _errors = value;
        }

        public ResizeRequestStatusLastAttemptErrorGetArgs()
        {
        }
        public static new ResizeRequestStatusLastAttemptErrorGetArgs Empty => new ResizeRequestStatusLastAttemptErrorGetArgs();
    }
}
