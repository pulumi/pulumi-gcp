// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class SessionTemplateEnvironmentConfigPeripheralsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource name of an existing Dataproc Metastore service.
        /// </summary>
        [Input("metastoreService")]
        public Input<string>? MetastoreService { get; set; }

        /// <summary>
        /// The Spark History Server configuration for the workload.
        /// Structure is documented below.
        /// </summary>
        [Input("sparkHistoryServerConfig")]
        public Input<Inputs.SessionTemplateEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs>? SparkHistoryServerConfig { get; set; }

        public SessionTemplateEnvironmentConfigPeripheralsConfigArgs()
        {
        }
        public static new SessionTemplateEnvironmentConfigPeripheralsConfigArgs Empty => new SessionTemplateEnvironmentConfigPeripheralsConfigArgs();
    }
}
