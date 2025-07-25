// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Inputs
{

    public sealed class JobTemplateConfigEditListArgs : global::Pulumi.ResourceArgs
    {
        [Input("inputs")]
        private InputList<string>? _inputs;

        /// <summary>
        /// List of values identifying files that should be used in this atom.
        /// </summary>
        public InputList<string> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<string>());
            set => _inputs = value;
        }

        /// <summary>
        /// A unique key for this atom.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Start time in seconds for the atom, relative to the input file timeline.  The default is `0s`.
        /// </summary>
        [Input("startTimeOffset")]
        public Input<string>? StartTimeOffset { get; set; }

        public JobTemplateConfigEditListArgs()
        {
        }
        public static new JobTemplateConfigEditListArgs Empty => new JobTemplateConfigEditListArgs();
    }
}
