// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IdentityPlatform.Inputs
{

    public sealed class ConfigBlockingFunctionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user credentials to include in the JWT payload that is sent to the registered Blocking Functions.
        /// Structure is documented below.
        /// </summary>
        [Input("forwardInboundCredentials")]
        public Input<Inputs.ConfigBlockingFunctionsForwardInboundCredentialsGetArgs>? ForwardInboundCredentials { get; set; }

        [Input("triggers", required: true)]
        private InputList<Inputs.ConfigBlockingFunctionsTriggerGetArgs>? _triggers;

        /// <summary>
        /// Map of Trigger to event type. Key should be one of the supported event types: "beforeCreate", "beforeSignIn".
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConfigBlockingFunctionsTriggerGetArgs> Triggers
        {
            get => _triggers ?? (_triggers = new InputList<Inputs.ConfigBlockingFunctionsTriggerGetArgs>());
            set => _triggers = value;
        }

        public ConfigBlockingFunctionsGetArgs()
        {
        }
        public static new ConfigBlockingFunctionsGetArgs Empty => new ConfigBlockingFunctionsGetArgs();
    }
}