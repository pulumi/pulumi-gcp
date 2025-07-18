// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle.Inputs
{

    public sealed class RuleSeverityGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name of the severity level. Extracted from the meta section of
        /// the rule text.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        public RuleSeverityGetArgs()
        {
        }
        public static new RuleSeverityGetArgs Empty => new RuleSeverityGetArgs();
    }
}
