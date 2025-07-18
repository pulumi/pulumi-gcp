// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class GdcServiceInstanceGdceClusterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Gdce cluster resource id.
        /// </summary>
        [Input("gdceCluster", required: true)]
        public Input<string> GdceCluster { get; set; } = null!;

        public GdcServiceInstanceGdceClusterGetArgs()
        {
        }
        public static new GdcServiceInstanceGdceClusterGetArgs Empty => new GdcServiceInstanceGdceClusterGetArgs();
    }
}
