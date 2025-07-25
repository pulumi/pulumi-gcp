// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class EnvironmentClientIpResolutionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resolves the client ip based on a custom header.
        /// Structure is documented below.
        /// </summary>
        [Input("headerIndexAlgorithm")]
        public Input<Inputs.EnvironmentClientIpResolutionConfigHeaderIndexAlgorithmArgs>? HeaderIndexAlgorithm { get; set; }

        public EnvironmentClientIpResolutionConfigArgs()
        {
        }
        public static new EnvironmentClientIpResolutionConfigArgs Empty => new EnvironmentClientIpResolutionConfigArgs();
    }
}
