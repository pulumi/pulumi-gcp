// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class GetEnvironmentConfigWorkloadsConfigResult
    {
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigSchedulerResult> Schedulers;
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigWebServerResult> WebServers;
        public readonly ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigWorkerResult> Workers;

        [OutputConstructor]
        private GetEnvironmentConfigWorkloadsConfigResult(
            ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigSchedulerResult> schedulers,

            ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigWebServerResult> webServers,

            ImmutableArray<Outputs.GetEnvironmentConfigWorkloadsConfigWorkerResult> workers)
        {
            Schedulers = schedulers;
            WebServers = webServers;
            Workers = workers;
        }
    }
}