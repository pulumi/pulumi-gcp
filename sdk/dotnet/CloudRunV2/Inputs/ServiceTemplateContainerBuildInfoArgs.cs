// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class ServiceTemplateContainerBuildInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Entry point of the function when the image is a Cloud Run function.
        /// </summary>
        [Input("functionTarget")]
        public Input<string>? FunctionTarget { get; set; }

        /// <summary>
        /// Source code location of the image.
        /// </summary>
        [Input("sourceLocation")]
        public Input<string>? SourceLocation { get; set; }

        public ServiceTemplateContainerBuildInfoArgs()
        {
        }
        public static new ServiceTemplateContainerBuildInfoArgs Empty => new ServiceTemplateContainerBuildInfoArgs();
    }
}
