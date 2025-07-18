// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class AppHostingBuildSourceContainerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A URI representing a container for the backend to use.
        /// </summary>
        [Input("image", required: true)]
        public Input<string> Image { get; set; } = null!;

        public AppHostingBuildSourceContainerArgs()
        {
        }
        public static new AppHostingBuildSourceContainerArgs Empty => new AppHostingBuildSourceContainerArgs();
    }
}
