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
    public sealed class JobPysparkConfig
    {
        /// <summary>
        /// HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
        /// </summary>
        public readonly ImmutableArray<string> ArchiveUris;
        /// <summary>
        /// The arguments to pass to the driver.
        /// </summary>
        public readonly ImmutableArray<string> Args;
        /// <summary>
        /// HCFS URIs of files to be copied to the working directory of Python drivers and distributed tasks. Useful for naively parallel tasks.
        /// </summary>
        public readonly ImmutableArray<string> FileUris;
        /// <summary>
        /// HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
        /// </summary>
        public readonly ImmutableArray<string> JarFileUris;
        /// <summary>
        /// The runtime logging config of the job
        /// </summary>
        public readonly Outputs.JobPysparkConfigLoggingConfig? LoggingConfig;
        /// <summary>
        /// The HCFS URI of the main Python file to use as the driver. Must be a .py file.
        /// </summary>
        public readonly string MainPythonFileUri;
        /// <summary>
        /// A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties set in `/etc/spark/conf/spark-defaults.conf` and classes in user code.
        /// 
        /// * `logging_config.driver_log_levels`- (Required) The per-package log levels for the driver. This may include 'root' package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Properties;
        /// <summary>
        /// HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
        /// </summary>
        public readonly ImmutableArray<string> PythonFileUris;

        [OutputConstructor]
        private JobPysparkConfig(
            ImmutableArray<string> archiveUris,

            ImmutableArray<string> args,

            ImmutableArray<string> fileUris,

            ImmutableArray<string> jarFileUris,

            Outputs.JobPysparkConfigLoggingConfig? loggingConfig,

            string mainPythonFileUri,

            ImmutableDictionary<string, string>? properties,

            ImmutableArray<string> pythonFileUris)
        {
            ArchiveUris = archiveUris;
            Args = args;
            FileUris = fileUris;
            JarFileUris = jarFileUris;
            LoggingConfig = loggingConfig;
            MainPythonFileUri = mainPythonFileUri;
            Properties = properties;
            PythonFileUris = pythonFileUris;
        }
    }
}
