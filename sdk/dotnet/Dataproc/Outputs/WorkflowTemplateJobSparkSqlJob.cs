// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class WorkflowTemplateJobSparkSqlJob
    {
        /// <summary>
        /// HCFS URIs of jar files to be added to the Spark CLASSPATH.
        /// </summary>
        public readonly ImmutableArray<string> JarFileUris;
        /// <summary>
        /// The runtime log config for job execution.
        /// </summary>
        public readonly Outputs.WorkflowTemplateJobSparkSqlJobLoggingConfig? LoggingConfig;
        /// <summary>
        /// A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Properties;
        /// <summary>
        /// The HCFS URI of the script that contains SQL queries.
        /// </summary>
        public readonly string? QueryFileUri;
        /// <summary>
        /// A list of queries.
        /// </summary>
        public readonly Outputs.WorkflowTemplateJobSparkSqlJobQueryList? QueryList;
        /// <summary>
        /// Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name="value";`).
        /// </summary>
        public readonly ImmutableDictionary<string, string>? ScriptVariables;

        [OutputConstructor]
        private WorkflowTemplateJobSparkSqlJob(
            ImmutableArray<string> jarFileUris,

            Outputs.WorkflowTemplateJobSparkSqlJobLoggingConfig? loggingConfig,

            ImmutableDictionary<string, string>? properties,

            string? queryFileUri,

            Outputs.WorkflowTemplateJobSparkSqlJobQueryList? queryList,

            ImmutableDictionary<string, string>? scriptVariables)
        {
            JarFileUris = jarFileUris;
            LoggingConfig = loggingConfig;
            Properties = properties;
            QueryFileUri = queryFileUri;
            QueryList = queryList;
            ScriptVariables = scriptVariables;
        }
    }
}
