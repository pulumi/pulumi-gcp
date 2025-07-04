// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Transcoder.Inputs
{

    public sealed class JobTemplateConfigElementaryStreamGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Encoding of an audio stream.
        /// Structure is documented below.
        /// </summary>
        [Input("audioStream")]
        public Input<Inputs.JobTemplateConfigElementaryStreamAudioStreamGetArgs>? AudioStream { get; set; }

        /// <summary>
        /// A unique key for this atom.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Encoding of a video stream.
        /// Structure is documented below.
        /// </summary>
        [Input("videoStream")]
        public Input<Inputs.JobTemplateConfigElementaryStreamVideoStreamGetArgs>? VideoStream { get; set; }

        public JobTemplateConfigElementaryStreamGetArgs()
        {
        }
        public static new JobTemplateConfigElementaryStreamGetArgs Empty => new JobTemplateConfigElementaryStreamGetArgs();
    }
}
