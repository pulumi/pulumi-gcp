// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class PrivateConnectionErrorArgs : global::Pulumi.ResourceArgs
    {
        [Input("details")]
        private InputMap<string>? _details;

        /// <summary>
        /// A list of messages that carry the error details.
        /// </summary>
        public InputMap<string> Details
        {
            get => _details ?? (_details = new InputMap<string>());
            set => _details = value;
        }

        /// <summary>
        /// A message containing more information about the error that occurred.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        public PrivateConnectionErrorArgs()
        {
        }
        public static new PrivateConnectionErrorArgs Empty => new PrivateConnectionErrorArgs();
    }
}