// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigWorkloadsConfig
    {
        /// <summary>
        /// Configuration for resources used by DAG processor.
        /// </summary>
        public readonly Outputs.EnvironmentConfigWorkloadsConfigDagProcessor? DagProcessor;
        /// <summary>
        /// Configuration for resources used by Airflow schedulers.
        /// </summary>
        public readonly Outputs.EnvironmentConfigWorkloadsConfigScheduler? Scheduler;
        /// <summary>
        /// Configuration for resources used by Airflow triggerers.
        /// </summary>
        public readonly Outputs.EnvironmentConfigWorkloadsConfigTriggerer? Triggerer;
        /// <summary>
        /// Configuration for resources used by Airflow web server.
        /// </summary>
        public readonly Outputs.EnvironmentConfigWorkloadsConfigWebServer? WebServer;
        /// <summary>
        /// Configuration for resources used by Airflow workers.
        /// </summary>
        public readonly Outputs.EnvironmentConfigWorkloadsConfigWorker? Worker;

        [OutputConstructor]
        private EnvironmentConfigWorkloadsConfig(
            Outputs.EnvironmentConfigWorkloadsConfigDagProcessor? dagProcessor,

            Outputs.EnvironmentConfigWorkloadsConfigScheduler? scheduler,

            Outputs.EnvironmentConfigWorkloadsConfigTriggerer? triggerer,

            Outputs.EnvironmentConfigWorkloadsConfigWebServer? webServer,

            Outputs.EnvironmentConfigWorkloadsConfigWorker? worker)
        {
            DagProcessor = dagProcessor;
            Scheduler = scheduler;
            Triggerer = triggerer;
            WebServer = webServer;
            Worker = worker;
        }
    }
}
