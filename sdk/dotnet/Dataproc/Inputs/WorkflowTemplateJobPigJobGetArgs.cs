// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplateJobPigJobGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
        /// </summary>
        [Input("continueOnFailure")]
        public Input<bool>? ContinueOnFailure { get; set; }

        [Input("jarFileUris")]
        private InputList<string>? _jarFileUris;

        /// <summary>
        /// HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
        /// </summary>
        public InputList<string> JarFileUris
        {
            get => _jarFileUris ?? (_jarFileUris = new InputList<string>());
            set => _jarFileUris = value;
        }

        /// <summary>
        /// The runtime log config for job execution.
        /// </summary>
        [Input("loggingConfig")]
        public Input<Inputs.WorkflowTemplateJobPigJobLoggingConfigGetArgs>? LoggingConfig { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// The HCFS URI of the script that contains the Pig queries.
        /// </summary>
        [Input("queryFileUri")]
        public Input<string>? QueryFileUri { get; set; }

        /// <summary>
        /// A list of queries.
        /// </summary>
        [Input("queryList")]
        public Input<Inputs.WorkflowTemplateJobPigJobQueryListGetArgs>? QueryList { get; set; }

        [Input("scriptVariables")]
        private InputMap<string>? _scriptVariables;

        /// <summary>
        /// Mapping of query variable names to values (equivalent to the Pig command: `name=`).
        /// </summary>
        public InputMap<string> ScriptVariables
        {
            get => _scriptVariables ?? (_scriptVariables = new InputMap<string>());
            set => _scriptVariables = value;
        }

        public WorkflowTemplateJobPigJobGetArgs()
        {
        }
        public static new WorkflowTemplateJobPigJobGetArgs Empty => new WorkflowTemplateJobPigJobGetArgs();
    }
}
