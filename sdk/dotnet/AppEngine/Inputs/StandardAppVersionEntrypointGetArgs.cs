// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class StandardAppVersionEntrypointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format should be a shell command that can be fed to bash -c.
        /// </summary>
        [Input("shell", required: true)]
        public Input<string> Shell { get; set; } = null!;

        public StandardAppVersionEntrypointGetArgs()
        {
        }
        public static new StandardAppVersionEntrypointGetArgs Empty => new StandardAppVersionEntrypointGetArgs();
    }
}
