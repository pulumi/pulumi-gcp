// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class GdcSparkApplicationPysparkApplicationConfigArgs : global::Pulumi.ResourceArgs
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
        /// The arguments to pass to the driver.  Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
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

        [Input("jarFileUris")]
        private InputList<string>? _jarFileUris;

        /// <summary>
        /// HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks.
        /// </summary>
        public InputList<string> JarFileUris
        {
            get => _jarFileUris ?? (_jarFileUris = new InputList<string>());
            set => _jarFileUris = value;
        }

        /// <summary>
        /// The HCFS URI of the main Python file to use as the driver. Must be a .py file.
        /// </summary>
        [Input("mainPythonFileUri", required: true)]
        public Input<string> MainPythonFileUri { get; set; } = null!;

        [Input("pythonFileUris")]
        private InputList<string>? _pythonFileUris;

        /// <summary>
        /// HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip.
        /// </summary>
        public InputList<string> PythonFileUris
        {
            get => _pythonFileUris ?? (_pythonFileUris = new InputList<string>());
            set => _pythonFileUris = value;
        }

        public GdcSparkApplicationPysparkApplicationConfigArgs()
        {
        }
        public static new GdcSparkApplicationPysparkApplicationConfigArgs Empty => new GdcSparkApplicationPysparkApplicationConfigArgs();
    }
}
