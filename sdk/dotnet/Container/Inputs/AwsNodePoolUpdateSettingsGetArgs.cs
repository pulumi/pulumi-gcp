// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AwsNodePoolUpdateSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Settings for surge update.
        /// </summary>
        [Input("surgeSettings")]
        public Input<Inputs.AwsNodePoolUpdateSettingsSurgeSettingsGetArgs>? SurgeSettings { get; set; }

        public AwsNodePoolUpdateSettingsGetArgs()
        {
        }
        public static new AwsNodePoolUpdateSettingsGetArgs Empty => new AwsNodePoolUpdateSettingsGetArgs();
    }
}
