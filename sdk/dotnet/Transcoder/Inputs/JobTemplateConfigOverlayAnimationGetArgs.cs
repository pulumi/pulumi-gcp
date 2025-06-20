// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Inputs
{

    public sealed class JobTemplateConfigOverlayAnimationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Display overlay object with fade animation.
        /// Structure is documented below.
        /// </summary>
        [Input("animationFade")]
        public Input<Inputs.JobTemplateConfigOverlayAnimationAnimationFadeGetArgs>? AnimationFade { get; set; }

        public JobTemplateConfigOverlayAnimationGetArgs()
        {
        }
        public static new JobTemplateConfigOverlayAnimationGetArgs Empty => new JobTemplateConfigOverlayAnimationGetArgs();
    }
}
