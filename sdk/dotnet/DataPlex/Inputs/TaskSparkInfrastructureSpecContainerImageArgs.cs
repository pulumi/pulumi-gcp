// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class TaskSparkInfrastructureSpecContainerImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Container image to use.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        [Input("javaJars")]
        private InputList<string>? _javaJars;

        /// <summary>
        /// A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
        /// </summary>
        public InputList<string> JavaJars
        {
            get => _javaJars ?? (_javaJars = new InputList<string>());
            set => _javaJars = value;
        }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties.
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("pythonPackages")]
        private InputList<string>? _pythonPackages;

        /// <summary>
        /// A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
        /// </summary>
        public InputList<string> PythonPackages
        {
            get => _pythonPackages ?? (_pythonPackages = new InputList<string>());
            set => _pythonPackages = value;
        }

        public TaskSparkInfrastructureSpecContainerImageArgs()
        {
        }
        public static new TaskSparkInfrastructureSpecContainerImageArgs Empty => new TaskSparkInfrastructureSpecContainerImageArgs();
    }
}