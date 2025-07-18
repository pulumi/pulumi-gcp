// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplateJobSparkRJobGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("archiveUris")]
        private InputList<string>? _archiveUris;

        /// <summary>
        /// HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
        /// </summary>
        public InputList<string> ArchiveUris
        {
            get => _archiveUris ?? (_archiveUris = new InputList<string>());
            set => _archiveUris = value;
        }

        [Input("args")]
        private InputList<string>? _args;

        /// <summary>
        /// The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
        /// </summary>
        public InputList<string> Args
        {
            get => _args ?? (_args = new InputList<string>());
            set => _args = value;
        }

        [Input("fileUris")]
        private InputList<string>? _fileUris;

        /// <summary>
        /// HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
        /// </summary>
        public InputList<string> FileUris
        {
            get => _fileUris ?? (_fileUris = new InputList<string>());
            set => _fileUris = value;
        }

        /// <summary>
        /// The runtime log config for job execution.
        /// </summary>
        [Input("loggingConfig")]
        public Input<Inputs.WorkflowTemplateJobSparkRJobLoggingConfigGetArgs>? LoggingConfig { get; set; }

        /// <summary>
        /// Required. The HCFS URI of the main R file to use as the driver. Must be a .R file.
        /// </summary>
        [Input("mainRFileUri", required: true)]
        public Input<string> MainRFileUri { get; set; } = null!;

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        public WorkflowTemplateJobSparkRJobGetArgs()
        {
        }
        public static new WorkflowTemplateJobSparkRJobGetArgs Empty => new WorkflowTemplateJobSparkRJobGetArgs();
    }
}
