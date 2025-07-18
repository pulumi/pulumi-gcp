// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Gemini.Inputs
{

    public sealed class CodeToolsSettingEnabledToolConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Key of the configuration item.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value of the configuration item.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public CodeToolsSettingEnabledToolConfigGetArgs()
        {
        }
        public static new CodeToolsSettingEnabledToolConfigGetArgs Empty => new CodeToolsSettingEnabledToolConfigGetArgs();
    }
}
