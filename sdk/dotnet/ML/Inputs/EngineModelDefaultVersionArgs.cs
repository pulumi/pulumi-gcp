// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ML.Inputs
{

    public sealed class EngineModelDefaultVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name specified for the version when it was created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public EngineModelDefaultVersionArgs()
        {
        }
        public static new EngineModelDefaultVersionArgs Empty => new EngineModelDefaultVersionArgs();
    }
}
