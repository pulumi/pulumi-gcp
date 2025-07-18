// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebaserules.Inputs
{

    public sealed class RulesetSourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("files", required: true)]
        private InputList<Inputs.RulesetSourceFileGetArgs>? _files;

        /// <summary>
        /// `File` set constituting the `Source` bundle.
        /// </summary>
        public InputList<Inputs.RulesetSourceFileGetArgs> Files
        {
            get => _files ?? (_files = new InputList<Inputs.RulesetSourceFileGetArgs>());
            set => _files = value;
        }

        /// <summary>
        /// `Language` of the `Source` bundle. If unspecified, the language will default to `FIREBASE_RULES`. Possible values: LANGUAGE_UNSPECIFIED, FIREBASE_RULES, EVENT_FLOW_TRIGGERS
        /// 
        /// - - -
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        public RulesetSourceGetArgs()
        {
        }
        public static new RulesetSourceGetArgs Empty => new RulesetSourceGetArgs();
    }
}
