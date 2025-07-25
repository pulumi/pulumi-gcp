// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplateParameterValidationRegexArgs : global::Pulumi.ResourceArgs
    {
        [Input("regexes", required: true)]
        private InputList<string>? _regexes;

        /// <summary>
        /// Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
        /// </summary>
        public InputList<string> Regexes
        {
            get => _regexes ?? (_regexes = new InputList<string>());
            set => _regexes = value;
        }

        public WorkflowTemplateParameterValidationRegexArgs()
        {
        }
        public static new WorkflowTemplateParameterValidationRegexArgs Empty => new WorkflowTemplateParameterValidationRegexArgs();
    }
}
