// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class BatchEnvironmentConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Execution configuration for a workload.
        /// Structure is documented below.
        /// </summary>
        [Input("executionConfig")]
        public Input<Inputs.BatchEnvironmentConfigExecutionConfigGetArgs>? ExecutionConfig { get; set; }

        /// <summary>
        /// Peripherals configuration that workload has access to.
        /// Structure is documented below.
        /// </summary>
        [Input("peripheralsConfig")]
        public Input<Inputs.BatchEnvironmentConfigPeripheralsConfigGetArgs>? PeripheralsConfig { get; set; }

        public BatchEnvironmentConfigGetArgs()
        {
        }
        public static new BatchEnvironmentConfigGetArgs Empty => new BatchEnvironmentConfigGetArgs();
    }
}
