// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxWebhookServiceDirectoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of Service Directory service.
        /// Structure is documented below.
        /// </summary>
        [Input("genericWebService", required: true)]
        public Input<Inputs.CxWebhookServiceDirectoryGenericWebServiceArgs> GenericWebService { get; set; } = null!;

        /// <summary>
        /// The name of Service Directory service.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public CxWebhookServiceDirectoryArgs()
        {
        }
        public static new CxWebhookServiceDirectoryArgs Empty => new CxWebhookServiceDirectoryArgs();
    }
}
