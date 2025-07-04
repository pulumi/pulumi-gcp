// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apphub.Inputs
{

    public sealed class ServiceServiceReferenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// Output only. The underlying resource URI (For example, URI of Forwarding Rule, URL Map,
        /// and Backend Service).
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public ServiceServiceReferenceArgs()
        {
        }
        public static new ServiceServiceReferenceArgs Empty => new ServiceServiceReferenceArgs();
    }
}
