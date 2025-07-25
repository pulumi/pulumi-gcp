// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Outputs
{

    [OutputType]
    public sealed class JobConfigOverlayAnimation
    {
        /// <summary>
        /// Display overlay object with fade animation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.JobConfigOverlayAnimationAnimationFade? AnimationFade;

        [OutputConstructor]
        private JobConfigOverlayAnimation(Outputs.JobConfigOverlayAnimationAnimationFade? animationFade)
        {
            AnimationFade = animationFade;
        }
    }
}
